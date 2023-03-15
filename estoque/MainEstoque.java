package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.setNome("caneta");
        e1.getQtdAtual(10);
        e1.getQtdMinima(5);
        System.out.println(e1.mostra());

    }
}
