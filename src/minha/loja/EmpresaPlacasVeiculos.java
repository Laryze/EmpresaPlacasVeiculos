import java.util.ArrayList;
import java.util.Scanner;
        
package minha.loja;

class Veiculos {
    
    private String modelo;
    private String cor;
    private String placa;

    public Veiculo(String modelo, String cor, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
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

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor + ", Placa: " + placa;
    }
}

public class EmpresaPlacasVeiculos {
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
                    veiculos.add(new Veiculo(modelo, cor, placa));
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
