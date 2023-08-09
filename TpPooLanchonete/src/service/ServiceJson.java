package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Cliente;
import model.Produto;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceJson {




    private static final String ARQUIVO_JSON_PEDIDOS = "pedidos.json";










    public List<Produto> lerProdutosDoJson(String ARQUIVO_JSON_PEDIDOS) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_JSON_PEDIDOS))) {
            Gson gson = new Gson();
            Type tipoListaProduto = new TypeToken<List<Produto>>() {}.getType();
            return gson.fromJson(reader, tipoListaProduto);
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo JSON não foi encontrado. Criando novo arquivo...");
            criarNovoArquivo(ARQUIVO_JSON_PEDIDOS);
            return new ArrayList<>(); // Retorna uma lista vazia
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo JSON.");
            e.printStackTrace();
            return null;
        }
    }

    private void criarNovoArquivo(String ARQUIVO_JSON_PEDIDOS) {
        try {
            File file = new File(ARQUIVO_JSON_PEDIDOS);
            if (file.createNewFile()) {
                System.out.println("Novo arquivo 'pedidos.json' criado com sucesso.");
            } else {
                System.out.println("O arquivo 'pedidos.json' já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o novo arquivo 'pedidos.json'.");
            e.printStackTrace();
        }
    }

    public Produto compararProdutoComJson(List<Produto> produtoList, String nomeProdutoEscolhido) {
        for (Produto produto : produtoList) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProdutoEscolhido)) {
                System.out.println("Produto encontrado: " + produto);
                return produto;
            }
        }
        return null;
    }

}
