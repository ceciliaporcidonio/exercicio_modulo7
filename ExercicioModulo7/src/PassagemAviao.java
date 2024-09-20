// Classe que representa uma Passagem de Avião
public class PassagemAviao {

    // Propriedades da passagem
    private String destino;
    private double valor;
    private String dataVoo;
    private String classe;

    // Construtor para inicializar as propriedades da passagem
    public PassagemAviao(String destino, double valor, String dataVoo, String classe) {
        this.destino = destino;
        this.valor = valor;
        this.dataVoo = dataVoo;
        this.classe = classe;
    }

    // Método para obter o destino da passagem
    public String getDestino() {
        return destino;
    }

    // Método para definir o destino da passagem
    public void setDestino(String destino) {
        this.destino = destino;
    }

    // Método para obter o valor da passagem
    public double getValor() {
        return valor;
    }

    // Método para definir o valor da passagem
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para obter a data do voo
    public String getDataVoo() {
        return dataVoo;
    }

    // Método para definir a data do voo
    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    // Método para obter a classe do voo (econômica, executiva, etc.)
    public String getClasse() {
        return classe;
    }

    // Método para definir a classe do voo
    public void setClasse(String classe) {
        this.classe = classe;
    }

    // Método para exibir informações sobre a passagem
    public void exibirInformacoes() {
        System.out.println("Destino: " + destino);
        System.out.println("Valor: R$" + valor);
        System.out.println("Data do Voo: " + dataVoo);
        System.out.println("Classe: " + classe);
    }

    // Método para simular a compra da passagem
    public void comprar() {
        System.out.println("Passagem comprada para " + destino + " no valor de R$" + valor);
    }

    // Método para simular o cancelamento da passagem
    public void cancelar() {
        System.out.println("Passagem para " + destino + " cancelada.");
    }

    // Método principal para testar a classe PassagemAviao
    public static void main(String[] args) {
        // Criando um objeto PassagemAviao
        PassagemAviao minhaPassagem = new PassagemAviao("Nova York", 3500.00, "15/10/2024", "Executiva");

        // Exibindo informações da passagem
        minhaPassagem.exibirInformacoes();

        // Comprando a passagem
        minhaPassagem.comprar();

        // Cancelando a passagem
        minhaPassagem.cancelar();
    }
}
