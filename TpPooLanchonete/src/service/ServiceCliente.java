package service;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ServiceCliente {

    List<Cliente> clienteList = new ArrayList<>();

    ServiceCliente serviceClienteAdicionar = new ServiceCliente();

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

}
