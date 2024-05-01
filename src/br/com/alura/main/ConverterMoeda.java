package br.com.alura.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.github.cdimascio.dotenv.Dotenv;

public class ConverterMoeda {
    public static void converter(String from, String to) {
        Dotenv dotenv = Dotenv.load();
        String key = dotenv.get("EXCHANGE_RATE_API_KEY");

        try {
            String url_str = STR."https://v6.exchangerate-api.com/v6/\{key}/latest/\{from}";

            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing conversion rate
            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");
            double rate = conversionRates.get(to).getAsDouble();

            System.out.println(STR."Digite o valor em \{from}: ");
            Scanner input = new Scanner(System.in);
            double valor = input.nextDouble();
            double resultado = valor * rate;

            System.out.println(STR."\{valor} \{from} equivale a \{resultado} \{to}");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

