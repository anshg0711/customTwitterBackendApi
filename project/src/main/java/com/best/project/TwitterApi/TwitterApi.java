package com.best.project.TwitterApi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

//@Service
public class TwitterApi {


    public static void fetchDataAndSaveToMongoDB() {
        try{

            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://twitter135.p.rapidapi.com/AutoComplete/?q=Elon")
                    .get()
                    .addHeader("X-RapidAPI-Key", "9f2a1e5dc8mshb7a04e357e81d58p1ef73ajsn14495dfe532c")
                    .addHeader("X-RapidAPI-Host", "twitter135.p.rapidapi.com")
                    .build();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());

        } catch(Exception e) {
            System.out.println("Error");
        }
    }
}
