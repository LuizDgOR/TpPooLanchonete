package service;

import Interface.ArquivoJson;
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
import java.util.UUID;

public class ServiceProduto implements ArquivoJson<Produto> {

    List<Produto> produtoList= new ArrayList<>();
    private static final String ARQUIVO_JSON_PRODUTOS = "produtos.json";

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public boolean verificarIdProduto(String idProduto) {
        for (Produto produto : produtoList) {
            if (produto.getIdproduto().equalsIgnoreCase(idProduto)) {
                return true; // Retorna true se o id produto com o mesmo ID já existir
            }
        }
        return false; // Retorna false se o cliente com o mesmo ID não existir
    }

    public boolean verificaNomeProduto(String nomeProduto){
        for (Produto produto : produtoList){
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)){
                return true;
            }
        }
        return false;
    }
    public void adicionarProduto() {

        Scanner scanner = new Scanner(System.in);
        String nomeProduto;

        do {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.nextLine();
            if (verificaNomeProduto(nomeProduto)){
                System.out.print("Produto já cadastrado. Por favor, digite um novo nome de Produto");
            }
        }while (verificaNomeProduto(nomeProduto));

        System.out.print("Digite o preço do produto: ");
        String preco = scanner.nextLine();

        String idProduto;
        // Gera um ID aleatório único
        do {
            idProduto = UUID.randomUUID().toString();
        } while (verificarIdProduto(idProduto)); // Verifica se o ID já existe na lista

        Produto novoProduto = new Produto(nomeProduto, idProduto, preco);
        produtoList.add(novoProduto); // Adiciona o novo produto à lista de produtos

        System.out.println("Produto adicionado com sucesso");
    }

    @Override
    public void adicionarNaLista(List<Produto> produtoList) {
        List<Produto> produtosExistente = carregarDoArquivo();

        if (produtosExistente == null) {
            produtosExistente = new ArrayList<>(); // Inicializa a lista se estiver vazia
        }

        produtosExistente.addAll(produtoList);

        salvarNoArquivo(produtosExistente);
    }
    @Override
    public List<Produto> carregarDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_JSON_PRODUTOS))) {
            Gson gson = new Gson();
            Type produtoListType = new TypeToken<List<Produto>>() {
            }.getType();
            return gson.fromJson(reader, produtoListType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    @Override
    public  void salvarNoArquivo(List<Produto> produtoList) {
        try (FileWriter writer = new FileWriter(ARQUIVO_JSON_PRODUTOS)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(produtoList, writer);
            System.out.println("Arquivo 'produtos.json' atualizado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao atualizar o arquivo.");
            e.printStackTrace();
        }
    }



}
