/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.sample;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;
import rmit.lybao.grpc.DataList;
import rmit.lybao.grpc.EmptyRequest;
import rmit.lybao.grpc.PatientAptServiceGrpc;
import rmit.lybao.grpc.ShortMess;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class MyBenchmark {

    @Param(value = {"100", "200"})
    private int ITERATIONS;

    public static void main(String[] args) throws RunnerException, IOException {

//        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9095").usePlaintext().build();
//        PatientAptServiceGrpc.PatientAptServiceBlockingStub stub = PatientAptServiceGrpc.newBlockingStub(channel);
//        EmptyRequest request = EmptyRequest.newBuilder().build();
//        ShortMess shortMess = stub.getShortMess(request);
//        System.out.println(shortMess);

    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testRestMediumFile () throws IOException {
        for (int i = 0; i < ITERATIONS; i ++) {
            OkHttpClient  client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8080/test/medium")
                    .build();
            Response response = client.newCall(request).execute();
            response.body().close();
        }

    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testRestLargeFile () throws IOException {
        for (int i = 0 ; i < ITERATIONS; i ++) {
            OkHttpClient  client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8080/test/large")
                    .build();
            Response response = client.newCall(request).execute();
            response.body().close();
        }

    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testRestSmallFile () throws IOException {
        for (int i = 0; i <ITERATIONS ; i ++) {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8080/test/large")
                    .build();
            Response response = client.newCall(request).execute();
            response.body().close();
        }
    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testGrpcSmallFile () {
        for (int i = 0; i < ITERATIONS; i ++) {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9095").usePlaintext().build();
            PatientAptServiceGrpc.PatientAptServiceBlockingStub stub = PatientAptServiceGrpc.newBlockingStub(channel);
            EmptyRequest request = EmptyRequest.newBuilder().build();
            ShortMess shortMess = stub.getShortMess(request);
            channel.shutdown();
        }

    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testGrpcMedFile () {
        for (int i =0 ;i < ITERATIONS; i ++) {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9095").usePlaintext().build();
            PatientAptServiceGrpc.PatientAptServiceBlockingStub stub = PatientAptServiceGrpc.newBlockingStub(channel);
            EmptyRequest request = EmptyRequest.newBuilder().build();
            DataList dataList = stub.getMediumMess(request);
            channel.shutdown();
        }

    }

    @Benchmark
    @BenchmarkMode({Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testGrpcLargeFile () {
        for (int i = 0; i < ITERATIONS; i ++) {
            ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9095").usePlaintext().build();
            PatientAptServiceGrpc.PatientAptServiceBlockingStub stub = PatientAptServiceGrpc.newBlockingStub(channel);
            EmptyRequest request = EmptyRequest.newBuilder().build();
            DataList dataList = stub.getLargeMEss(request);
            channel.shutdown();
        }
    }

}
