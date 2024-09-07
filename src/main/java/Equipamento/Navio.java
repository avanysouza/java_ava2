package Equipamento;
import java.util.Scanner;

public class Navio extends Equipamento {

    //Declaração dos atributos
    String nome, dataLancamento;
    int numeroTripulantes;

    //Métodos construtores

    public Navio() {
        super();
    }

    public Navio(String nome, String dataLancamento, int numeroTripulantes) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.numeroTripulantes = numeroTripulantes;
    }

    //Métodos de acesso (setters e getters)

    public void setNome(String nome) {
        if(!nome.isEmpty()) { //tratamento de exceção
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDataLancamento(String dataLancamento) {
        if(!dataLancamento.isEmpty()) {//tratamento de exceção
            this.dataLancamento = dataLancamento;
        }
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        if(numeroTripulantes > 0) { //tratamento de exceção
            this.numeroTripulantes = numeroTripulantes;
        }
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    //Entrada de Dados
    @Override //permitir a sobrescrita do método
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        setNome(sc.next());
        System.out.println("Numero de Tripulantes: ");
        setNumeroTripulantes(sc.nextInt());
        System.out.println("Data de Lancamento: ");
        setDataLancamento(sc.next());
        super.inserirDados();
    }

    //Saída dos Dados

    @Override //permitir a sobrescrita do método
    public void imprimirDados(){
        System.out.println("---- Dados do Navio ---- ");
        System.out.println("Nome: " + getNome());
        System.out.println("Numero de Tripulantes: " + getNumeroTripulantes());
        System.out.println("Data de Lancamento: " + getDataLancamento());
        super.imprimirDados();

    }

    //Método da Classe Navio

    public int passageirosTripulantes(int numeroTripulantes, int numeroPassageiros){
        return numeroPassageiros / numeroTripulantes;
    }

}
