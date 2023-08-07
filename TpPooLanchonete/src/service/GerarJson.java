package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Cliente;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerarJson {


    private static final String ARQUIVO_JSON = "clientes.json";

    public static void adicionarClientesJSON(List<Cliente> novosClientes) {
        List<Cliente> clientesExistente = carregarClientesDoArquivo();

        if (clientesExistente == null) {
            clientesExistente = new ArrayList<>(); // Inicializa a lista se estiver vazia
        }

        clientesExistente.addAll(novosClientes);

        salvarClientesNoArquivo(clientesExistente);
    }



    public static List<Cliente> carregarClientesDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_JSON))) {
            Gson gson = new Gson();
            Type clienteListType = new TypeToken<List<Cliente>>() {}.getType();
            return gson.fromJson(reader, clienteListType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void salvarClientesNoArquivo(List<Cliente> clienteList) {
        try (FileWriter writer = new FileWriter(ARQUIVO_JSON)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(clienteList, writer);
            System.out.println("Arquivo 'clientes.json' atualizado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao atualizar o arquivo.");
            e.printStackTrace();
        }
    }
}

