package rmit.lybao.testclient;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import rmit.lybao.grpc.EmptyRequest;
import rmit.lybao.grpc.PatientAptServiceGrpc;
import rmit.lybao.grpc.ShortMess;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//@SpringBootApplication
public class TestClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestClientApplication.class, args);
		System.out.println("Hello world");
		testGrpcSmall();
	}

//	@Benchmark
//	private static void readShortMess () throws IOException {
//		OkHttpClient client = new OkHttpClient();
//		Request request = new Request.Builder()
//				.url("http://localhost:8080/test/small")
//				.build();
//		Response response = client.newCall(request).execute();
//
//	}
	@Benchmark
	@BenchmarkMode({Mode.AverageTime, Mode.Throughput})
	@OutputTimeUnit(TimeUnit.MICROSECONDS)
	public static void testGrpcSmall () {
		ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9095").usePlaintext().build();
		PatientAptServiceGrpc.PatientAptServiceBlockingStub stub = PatientAptServiceGrpc.newBlockingStub(channel);
		EmptyRequest request = EmptyRequest.newBuilder().build();
		ShortMess shortMess = stub.getShortMess(request);
//
//		// Finally, make the call using the stub
//		GreetingServiceOuterClass.HelloResponse response =
//				stub.greeting(request);
	}
}
