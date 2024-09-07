package Equipamento;
import java.util.Scanner;

public class Aviao extends Equipamento {

    //Declaração dos atributos
    String prefixo, dataRevisao;

    //Métodos construtores

    public Aviao() {
        super();
    }
    public Aviao(String prefixo, String dataRevisao) {
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    //Métodos de acesso (setters e getters)

    public void setPrefixo(String prefixo) {
        if(!prefixo.isEmpty()){ //tratamento de exceção
            this.prefixo = prefixo;
        }
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setDataRevisao(String dataRevisao) {
        if(!dataRevisao.isEmpty()){ //tratamento de exceção
            this.dataRevisao = dataRevisao;
        }
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    //Entrada de Dados

    @Override //permitir a sobrescrita do método
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Prefixo:");
        setPrefixo(sc.next());
        System.out.println("Data de Revisão:");
        setDataRevisao(sc.next());
        super.inserirDados();
    }

    //Saída dos Dados

    @Override //permitir a sobrescrita do método
    public void imprimirDados(){
        System.out.println("---- Dados do Avião ---- ");
        System.out.println("Prefixo: " + getPrefixo());
        System.out.println("Data de Revisão: " + getDataRevisao());
        super.imprimirDados();
    }

    //Método da Classe

    public void reajustarPreco(double percentual){

        double novoValor = preco * (1 + percentual/100);
        setPreco(novoValor); //Atribuir novo valor ao atributo preco
    }
}
