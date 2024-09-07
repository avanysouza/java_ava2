package Equipamento;

public class AppEquipamento {
    public static void main(String[] args) {

        Equipamento[] equipamentos = new Equipamento[20];

        //Ciclo for para criar objetos da classe Aviao
        for (int i = 0; i < 10; i++) {
            equipamentos[i] = new Aviao(); //chamada do metodo construtor
            equipamentos[i].inserirDados();
        }

        //Ciclo for para criar objetos da classe Navio
        for (int i = 10; i < 20; i++) { //Ciclo a partir do 10 elemento do array, ate o 20
            equipamentos[i] = new Navio();
            equipamentos[i].inserirDados();
        }

        //Impressão do array com todos os objetos criados
        System.out.println("### Impressão dos Dados ###");
        for (Equipamento equipamento : equipamentos) {
            equipamento.imprimirDados();
            System.out.println();
        }
    }
}