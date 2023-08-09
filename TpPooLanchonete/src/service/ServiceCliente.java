package service;

import Interface.ArquivoJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Cliente;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ServiceCliente implements ArquivoJson<Cliente> {

    List<Cliente> clienteList = new ArrayList<>();
    private static final String ARQUIVO_JSON = "clientes.json";

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public boolean verificarIdCliente(String idCliente) {
        for (Cliente cliente : clienteList) {
            if (cliente.getIdCliente().equalsIgnoreCase(idCliente)) {
                return true; // Retorna true se o cliente com o mesmo ID já existir
            }
        }
        return false; // Retorna false se o cliente com o mesmo ID não existir
    }

    public boolean verificarCpfCliente(String cpf) {
        for (Cliente cliente : clienteList) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return true; // Retorna true se o cliente com o mesmo ID já existir
            }
        }
        return false; // Retorna false se o cliente com o mesmo ID não existir
    }
    public void adicionarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        String cpf;

        do {
            System.out.print("Digite o CPF do cliente: ");
            cpf = scanner.nextLine();

            if (verificarCpfCliente(cpf)) {
                System.out.println("Cliente já existente. Por favor, digite um novo CPF.");
            }
        } while (verificarCpfCliente(cpf));

        String idCliente;
        // Gera um ID aleatório único
        do {
            idCliente = UUID.randomUUID().toString();
        } while (verificarIdCliente(idCliente)); // Verifica se o ID já existe na lista

        Cliente novoCliente = new Cliente(nome, endereco, telefone, idCliente, cpf);

        clienteList.add(novoCliente);
        System.out.println("Cliente adicionado com sucesso");
    }

    @Override
    public void adicionarNaLista(List<Cliente> novosClientes) {
        List<Cliente> clientesExistente = carregarDoArquivo();

        if (clientesExistente == null) {
            clientesExistente = new ArrayList<>(); // Inicializa a lista se estiver vazia
        }

        clientesExistente.addAll(novosClientes);

        salvarNoArquivo(clientesExistente);
    }

    @Override
    public List<Cliente> carregarDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_JSON))) {
            Gson gson = new Gson();
            Type clienteListType = new TypeToken<List<Cliente>>() {
            }.getType();
            return gson.fromJson(reader, clienteListType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    @Override
    public void salvarNoArquivo(List<Cliente> clienteList) {
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
