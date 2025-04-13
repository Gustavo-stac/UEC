import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //Metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar(){
        if(this.isAprovado()){
            System.out.println("## Desafiado ##");
            desafiado.apresentar();
            System.out.println("## Desafiante ##");
            desafiante.apresentar();
            int vencedor = (int) (Math.random() * 3) ;
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou Desafiado
                    System.out.println("Vitoria do " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.getDerrotas();
                    break;
                case 2: //Ganhou Desafiante
                    System.out.println("Vitoria do " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else {
            System.out.println("A luta não pode acontecer");
        }
    }

    //Metodos especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}

