package br.senai.sc.models;

public class Lance {

    private double valor;
    private Usuario usuario;

    public Lance(double valor, Usuario usuario) {
        super();
        this.valor = valor;
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
