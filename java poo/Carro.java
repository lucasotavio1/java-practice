public class Carro {
    // atributos
    private String modelo;
    private String marca;
    // inicializa os objetos da classse
    public Carro (String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    // getters e setters para acessar e modificar os atributos
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    // exibe a marca e o modelo do carro
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
