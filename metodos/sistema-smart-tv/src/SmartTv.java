public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (this.volume <= 100) {
            this.volume++;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void aumentarCanal() {
        this.canal++;
        System.out.println("Canal: " + this.canal);
    }

    public void diminuirCanal() {
        this.canal--;
        System.out.println("Canal: " + this.canal);
    }

    public void mudarCanal (int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal: " + this.canal);
    }

}

