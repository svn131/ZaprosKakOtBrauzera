package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//@SpringBootApplication
public class Demo9Application {

	public static void main(String[] args) throws IOException {
//		SpringApplication.run(Demo9Application.class, args);


		String url = "https://www.google.com/";
		URL apiUrl = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

		connection.setRequestMethod("GET");

		connection.setRequestProperty("Accept", "*/*");
		connection.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
		connection.setRequestProperty("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
		connection.setRequestProperty("Connection", "keep-alive");
		connection.setRequestProperty("Host", "line53w.bk6bba-resources.com");
		connection.setRequestProperty("Origin", "https://www.fon.bet");
		connection.setRequestProperty("Referer", "https://www.fon.bet/");
		connection.setRequestProperty("Sec-Ch-Ua", "\"Chromium\";v=\"116\", \"Not)A;Brand\";v=\"24\", \"Google Chrome\";v=\"116\"");
		connection.setRequestProperty("Sec-Ch-Ua-Mobile", "?0");
		connection.setRequestProperty("Sec-Ch-Ua-Platform", "\"Windows\"");
		connection.setRequestProperty("Sec-Fetch-Dest", "empty");
		connection.setRequestProperty("Sec-Fetch-Mode", "cors");
		connection.setRequestProperty("Sec-Fetch-Site", "cross-site");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36");


		int responseCode = connection.getResponseCode();

		System.out.println(responseCode);
// Обработайте ответ, считая данные или проверяя код ответа и т. д.


	}

}
