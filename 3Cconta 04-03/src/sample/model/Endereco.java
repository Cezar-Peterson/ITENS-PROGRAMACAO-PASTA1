package sample.model;

public class Endereco {

    //atributos
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    //métodos

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //ToString
    @Override
    public String toString() {
        return "Endereco" +
                "rua: " + rua +
                "\nnumero: " + numero +
                "\nbairro: " + bairro +
                "\ncidade: " + cidade
                ;
    }
}
