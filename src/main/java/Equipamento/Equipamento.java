package Equipamento;
import java.util.Scanner;


public class Equipamento {

    //Declaração dos atributos
    int capacidadeTanque, numeroPassageiros;
    double preco;

    //Métodos construtores

    public Equipamento() {

    }

    public Equipamento(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }


    //Métodos de acesso (setters e getters)

    public void setCapacidadeTanque(int capacidadeTanque) {
        if(capacidadeTanque > 0){ //tratamento de exceção
            this.capacidadeTanque = capacidadeTanque;
        }
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        if(numeroPassageiros > 0){ //tratamento de exceção
            this.numeroPassageiros = numeroPassageiros;
        }
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setPreco(double preco) {
        if(preco > 0){ //tratamento de exceção
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }

    //Entrada de Dados

    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Capacidade do Tanque: ");
        capacidadeTanque = Integer.parseInt(sc.nextLine());
        System.out.println("Numero de Passageiros:");
        numeroPassageiros = Integer.parseInt(sc.nextLine());
        System.out.println("Preço:");
        preco = Double.parseDouble(sc.nextLine());
    }

    //Saída de Dados

    public void imprimirDados(){
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Numero de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);

    }

}
