/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IntegracaoAPI {
    public static Usuario buscaCep (String cep) throws Exception {
        String enderecoURL = "https://viacep.com.br/ws/" + cep + "/json/";
        URL url = new URL(enderecoURL);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        conexao.setDoInput(true);
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "utf-8"));

            String convertJsonString = Util.converteJsonEmString(buff);
            Gson gson = new Gson();
            Usuario endereco = gson.fromJson(convertJsonString, Usuario.class);
            return endereco;

        } catch (Exception msgErro) {
            throw  new Exception("Erro de conexão- status Code [" + conexao.getResponseCode() + "]. " + msgErro.toString()); 
        }

    }

}
