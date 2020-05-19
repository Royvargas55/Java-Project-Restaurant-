/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import javax.swing.JTextArea;
import org.json.JSONObject;

/**
 *
 * @author ROY78
 */
public class APIGet {
        
   public static void GET(JTextArea jTextArea2) throws Exception {
        String url = "https://review-server.herokuapp.com/reviews";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // La peticion ser un GET
        con.setRequestMethod("GET");
        //Agrega User-Agent en el header, para especificar de navegador se envia la peticion HTTP
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nHaciendo peticion a la URL : " + url);
        System.out.println("Codigo de respuesta : " + responseCode);
        //"in" almacena informacion de la conexion con el API
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //Imprime en consola la respuesta de la peticion
        System.out.println(response.toString());
        System.out.println("RESPUESTA JSON");
        //Lee los archivos JSON y los añade al text area
        JSONObject myResponse = new JSONObject(response.toString());
        for (Iterator key = myResponse.keys(); key.hasNext();) {
            JSONObject base_layer = (JSONObject) myResponse.get((String) key.next());
            //Hay que especificar los atributos clave-valor  del API que se van a obtener
            jTextArea2.append("-----------------------------------------------\n");
            jTextArea2.append("Nombre: " + base_layer.getString("name"));
            jTextArea2.append("\nRating: " + base_layer.getString("rating"));
            jTextArea2.append("\nFecha: " + base_layer.getString("date"));
            jTextArea2.append("\nReseña: " + base_layer.getString("comment"));
            jTextArea2.append("\n-----------------------------------------------");
        }

    }
   
}
