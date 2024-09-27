package batalhao;

public class main {
    
    public static void main(String[] args) {
        
        Soldado soldado1, soldado2, soldado3;

        soldado1 = new Soldado("Souza");
        soldado2 = new Soldado("Rogers","Segundo-Sargento");
        soldado3 = new Soldado("Barnes","Tenente-Coronel");

        soldado1.movimentar();
        soldado2.movimentar(15);
        soldado3.movimentar(-2);
        soldado2.atacar();
        soldado3.atacar("baioneta");

    }

}
