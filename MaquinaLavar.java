public class MaquinaLavar {

    private boolean ligar;
    private boolean abrir;
    private boolean centrifuga;
    private boolean lavagem;
    private boolean lavagemConcluida;
    private boolean pausa;


    public MaquinaLavar() {
        this.ligar = false;
        this.abrir = false;
        this.centrifuga = false;
        this.lavagem = false;
        this.lavagemConcluida = false;
        this.pausa = false;
    }

    public void ligar() {

        if (abrir) {
            System.out.println("Tampa aberta, não é possível ligar a máquina");
            return;
        }

        if (!ligar) {
            ligar = true;
            System.out.println("Máquina ligada");
        } else {
            System.out.println("Máquina já está ligada");
        }
    }


    public void desligar() {

        if (lavagem) {
            System.out.println("Máquina lavando, não é possível desligar");
            return;
        }

        if (centrifuga) {
            System.out.println("Máquina centrifugando, não é possível desligar");
            return;
        }

        if (ligar) {
            ligar = false;
            System.out.println("Máquina desligada");
        } else {
            System.out.println("Máquina já está desligada");
        }
    }

    public void abrir() {

        if (lavagem) {
            System.out.println("Máquina lavando, não é possível abrir a tampa");
            return;
        }

        if (centrifuga) {
            System.out.println("Máquina centrifugando, não é possível abrir a tampa");
            return;
        }

        if (!abrir) {
            abrir = true;
            System.out.println("Tampa aberta");
        } else {
            System.out.println("Tampa já está aberta");
        }
    }

    public void fechar() {

        if (abrir) {
            abrir = false;
            System.out.println("Tampa fechada");
        } else {
            System.out.println("Tampa já está fechada");
        }
    }

    public void lavagem() {

        if (!ligar) {
            System.out.println("Máquina desligada, não é possível iniciar a lavagem");
            return;
        }

        if (abrir) {
            System.out.println("Tampa aberta, não é possível iniciar a lavagem");
            return;
        }

        if (lavagemConcluida) {
            System.out.println("Lavagem já foi concluída");
            return;
        }

        if (!lavagem) {
            lavagem = true;
            System.out.println("Lavando");
        } else {
            System.out.println("Máquina já está lavando");
        }
    }

    public void finalizarLavagem() {

        if (lavagem) {
            lavagem = false;
            lavagemConcluida = true;
            System.out.println("Lavagem finalizada");
        } else {
            System.out.println("Máquina não está lavando");
        }
    }


    public void pausar() {

        if (!ligar) {
            System.out.println("Máquina desligada, não é possível pausar");
            return;
        }

        if (!lavagem) {
            System.out.println("Máquina não está lavando");
            return;
        }

        if (!pausa) {
            pausa = true;
            System.out.println("Máquina pausada");
        } else {
            System.out.println("Máquina já está pausada");
        }
    }

    public void retomar() {

        if (!ligar) {
            System.out.println("Máquina desligada, não é possível retomar");
            return;
        }

        if (pausa) {
            pausa = false;
            System.out.println("Máquina retomada");
        } else {
            System.out.println("Máquina já está em funcionamento");
        }
    }

    public void centrifugar() {

        if (!ligar) {
            System.out.println("Máquina desligada, não é possível centrifugar");
            return;
        }

        if (abrir) {
            System.out.println("Tampa aberta, não é possível centrifugar");
            return;
        }

        if (!lavagemConcluida) {
            System.out.println("A lavagem ainda não foi concluída");
            return;
        }

        if (!centrifuga) {
            centrifuga = true;
            System.out.println("Centrifugando");
        } else {
            System.out.println("Máquina já está centrifugando");
        }
    }


    public void finalizarCentrifugacao() {

        if (centrifuga) {
            centrifuga = false;
            System.out.println("Centrifugação finalizada");
        } else {
            System.out.println("Máquina não está centrifugando");
        }
    }
}