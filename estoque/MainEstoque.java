package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.setNome("caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinima(5);
        System.out.println(e1.mostra());

    }
}
