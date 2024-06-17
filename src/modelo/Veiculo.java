package modelo;

import java.util.ArrayList;
import java.util.Scanner;
        

    class Veiculo{
    
    private String modelo;
    private String cor;
    private String placa;
    private String categoria;
    
    public Veiculo (String modelo, String cor, String placa, String categoria) {

        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.categoria = categoria;
    }
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Categoria:" + categoria;
    }
   


    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Mostrar todos os veículos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.next();
                    System.out.print("Digite a cor do veículo: ");
                    String cor = scanner.next();
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.next();
                    System.out.print("Digite a categoria do veículo: ");
                    String categoria = scanner.next();
                    
                    veiculos.add(new Veiculo(modelo, cor, placa, categoria));
                    System.out.println("Veículo adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de veículos:");
                    for (Veiculo veiculo : veiculos) {
                        System.out.println(veiculo);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
 }
