/*
 *  Author: OneRCH Team
 *  Project: OneRCH Project
 *  School: RMIT - University
 */
package rmit.lybao.restserver;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import rmit.lybao.grpc.DataList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public List<Data> readLargeFile() throws IOException {

        List<Data> result = new ArrayList<>();
        //read json file and convert to customer object
        try (JsonParser parser = new JsonFactory().createParser(new File("large_file.json"))) {
            JsonNode rootNode = new ObjectMapper().readTree(parser);
            Iterator<JsonNode> iterator = rootNode.iterator();

            ObjectNode currentNode;
            while (iterator.hasNext()) {
                currentNode = (ObjectNode) iterator.next();
                String id = currentNode.path("_id").asText();
                int index = currentNode.path("index").asInt();
                String guid = currentNode.path("guid").asText();
                boolean isActive = currentNode.path("isActive").asBoolean();
                String balance = currentNode.path("balance").asText();
                int age = currentNode.path("age").asInt();
                String eyeColor = currentNode.path("eyeColor").asText();
                String firstName = currentNode.path("first_name").asText();
                String lastName = currentNode.path("last_name").asText();
                String company = currentNode.path("company").asText();
                Data data = new Data(id, guid,index, isActive, balance, age,
                        eyeColor,  firstName,  lastName,  company);
                result.add(data);

            }
            parser.close();
        }
        return result;
    }

    public List<Data> readMediumFile () throws IOException {
        List<Data> result = new ArrayList<>();
        //read json file and convert to customer object
        try (JsonParser parser = new JsonFactory().createParser(new File("medium_file.json"))) {
            JsonNode rootNode = new ObjectMapper().readTree(parser);
            Iterator<JsonNode> iterator = rootNode.iterator();

            ObjectNode currentNode;
            while (iterator.hasNext()) {
                currentNode = (ObjectNode) iterator.next();
                String id = currentNode.path("_id").asText();
                int index = currentNode.path("index").asInt();
                String guid = currentNode.path("guid").asText();
                boolean isActive = currentNode.path("isActive").asBoolean();
                String balance = currentNode.path("balance").asText();
                int age = currentNode.path("age").asInt();
                String eyeColor = currentNode.path("eyeColor").asText();
                String firstName = currentNode.path("first_name").asText();
                String lastName = currentNode.path("last_name").asText();
                String company = currentNode.path("company").asText();
                Data data = new Data(id, guid,index, isActive, balance, age,
                        eyeColor,  firstName,  lastName,  company);
                result.add(data);

            }
            parser.close();
        }


        return result;
    }

    public DataList readGrpcMediumData () throws IOException {
        List<rmit.lybao.grpc.Data> dataResult = new ArrayList<>();

        try(JsonParser parser = new JsonFactory().createParser(new File("medium_file.json"))) {

            JsonNode rootNode = new ObjectMapper().readTree(parser);
            Iterator<JsonNode> iterator = rootNode.iterator();

            ObjectNode currentNode;
            while (iterator.hasNext()) {
                currentNode = (ObjectNode) iterator.next();
                String id = currentNode.path("_id").asText();
                int index = currentNode.path("index").asInt();
                String guid = currentNode.path("guid").asText();
                boolean isActive = currentNode.path("isActive").asBoolean();
                String balance = currentNode.path("balance").asText();
                int age = currentNode.path("age").asInt();
                String eyeColor = currentNode.path("eyeColor").asText();
                String firstName = currentNode.path("first_name").asText();
                String lastName = currentNode.path("last_name").asText();
                String company = currentNode.path("company").asText();

                rmit.lybao.grpc.Data data = rmit.lybao.grpc.Data.newBuilder()
                        .setId(id)
                        .setAge(age)
                        .setBalance(balance)
                        .setCompany(company)
                        .setEyeColor(eyeColor)
                        .setGuid(guid)
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setIndex(index)
                        .setIsActive(isActive)
                        .build();
                dataResult.add(data);
            }
            parser.close();
        }

        return DataList.newBuilder().addAllDataList(dataResult).build();
    }

    public DataList readGrpcLargeData () throws IOException {
        List<rmit.lybao.grpc.Data> dataResult = new ArrayList<>();

        JsonParser parser = new JsonFactory().createParser(new File("large_file.json"));

        JsonNode rootNode = new ObjectMapper().readTree(parser);
        Iterator<JsonNode> iterator = rootNode.iterator();

        ObjectNode currentNode;
        while (iterator.hasNext()) {
            currentNode = (ObjectNode) iterator.next();
            String id = currentNode.path("_id").asText();
            int index = currentNode.path("index").asInt();
            String guid = currentNode.path("guid").asText();
            boolean isActive = currentNode.path("isActive").asBoolean();
            String balance = currentNode.path("balance").asText();
            int age = currentNode.path("age").asInt();
            String eyeColor = currentNode.path("eyeColor").asText();
            String firstName = currentNode.path("first_name").asText();
            String lastName = currentNode.path("last_name").asText();
            String company = currentNode.path("company").asText();

            rmit.lybao.grpc.Data data = rmit.lybao.grpc.Data.newBuilder()
                    .setId(id)
                    .setAge(age)
                    .setBalance(balance)
                    .setCompany(company)
                    .setEyeColor(eyeColor)
                    .setGuid(guid)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setIndex(index)
                    .setIsActive(isActive)
                    .build();
            dataResult.add(data);
        }
        parser.close();
        return DataList.newBuilder().addAllDataList(dataResult).build();
    }
}
