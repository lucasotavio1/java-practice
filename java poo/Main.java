// código simples para entender como é feita a poo em java
public class Main {
    public static void main(String[] args){
        // criando os objetos carro
        Carro carro1 = new Carro("Civic", "Honda");
        Carro carro2 = new Carro("Corolla", "Toyota");
        // exibindo detalhes dos carros
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}