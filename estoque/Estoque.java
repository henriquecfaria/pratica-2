package br.com.estoque;

public class Estoque {
    private int codProduto;
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(int codProduto, String nome, int qtdAtual, int qtdMinima) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
    public estoque(int cod,String produto){
        this.codProduto = cod;
        this.nome = produto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }
    public void darBaixa(int qtd){
        if (qtd<=qtdAtual)
        qtdAtual = qtdAtual - qtd;
        else
            System.out.printf("Estoque insuficiente para baixa ");

    }
    public String mostra(){
        return "produto: " + "\nQtde minima" + this.qtdMinima + "\nQtde Atual" + this.getQtdAtual();
    }
    public boolean precisaRepor(){
        if (getQtdAtual()<=getQtdMinima())
            return  true;
        else
            return  false;
    }
}
