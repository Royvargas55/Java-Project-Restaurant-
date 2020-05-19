/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ROY78
 */
public class APIPost {
    public static void POST(JTextField Nombre, JTextField Rating, JTextField Fecha, JTextArea jTextArea1) throws Exception {
        URL url = new URL("https://review-server.herokuapp.com/reviews");
        //Se crea HasMap para crear un objeto de clave valor, pasandole dos String (Nombre del atributo y valor del atributo)
        HashMap<String, String> params= new HashMap<String, String>();
        params.put("name", Nombre.getText());
        params.put("rating", Rating.getText());
        params.put("date", Fecha.getText());
        params.put("comment", jTextArea1.getText());
        //StringBuilder para aceptar los datos del objetos
        StringBuilder postData = new StringBuilder();
        //ciclo que recorre el objeto
        for (Map.Entry<String, String> param : params.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            //añade atributo clave-valor y el valor del atributo
            postData.append(URLEncoder.encode((String) param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        //Leer caracteres y los almacena
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");
        //abre conexion y realiza peticiones
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);
        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int c; (c = in.read()) >= 0;) {
            sb.append((char) c);
        }
        String RESPUESTA = sb.toString();
        System.out.println(RESPUESTA);
    }
}
