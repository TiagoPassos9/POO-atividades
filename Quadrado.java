public class Quadrado {
    private Cor cor;
    private String tamanho;


    public Quadrado(Cor cor, String tamanho) {
        setCor(cor);
        setTamanho(tamanho);
    }

    private void setCor(Cor cor) {
        this.cor = cor;
    }

    public Cor getColor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    private void setTamanho(String tamanho) {
        if (Integer.parseInt(tamanho) > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("O tamanho precisa ser maior que 0!");
        }
    }


    @Override
    public String toString() {
        return "Quadrado cor: " + cor + ", tamanho: " + tamanho;
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(Cor.AMARELO, "Grande");
        System.out.println(quadrado.toString());
    }
}
