package batalhao;

class Soldado {
    
    private String nome;
    private String patente;
    private int posicao;
    private final int movimentar;
    private static int qtdSoldados;

    public Soldado (String nome){
        this.nome = nome;
        this.posicao = 0;
        patente = "Soldado";
        qtdSoldados++;
        movimentar = 1;
    }

    public Soldado (String nome, String patente){
        this.nome = nome;
        this.posicao = 0;
        this.patente = patente;
        qtdSoldados++;
        movimentar = 1;
    }

    public void movimentar(int qtd){

        if (qtd > 0) {
            posicao += qtd;
            System.out.println(patente+" "+nome+" Avancou "+qtd+" metros");
        }else {
            posicao -= qtd;
            System.out.println(patente+" "+nome+" Recuou "+Math.abs(qtd)+" metros");
        }

    }

    public void movimentar(){

        posicao += movimentar;
        System.out.println(patente+" "+nome+" Avancou "+movimentar+" metro");

    }

    public void atacar(){

        if (qtdSoldados >= 3) {
            System.out.println(patente+" "+nome+" Iniciou o ataque com o fuzil");
        }else{
            System.out.println(nome+": Ainda nao, esperando o batalhao ficar maior");
        }

    }

    public void atacar(String arma){

        if (qtdSoldados >= 3) {
            System.out.println(patente+" "+nome+" Iniciou o ataque com "+arma);
        }else{
            System.out.println(nome+": Ainda nao, esperando o batalhao ficar maior");
        }

    }

}
