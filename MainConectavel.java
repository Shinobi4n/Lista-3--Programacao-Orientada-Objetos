public class MainConectavel {

    public static void main(String[] args) {

        Televisao tv = new Televisao();
        Roteador tp = new Roteador();
        Computador pc = new Computador();

        tv.ligar();
        tv.desligar();

        tp.ligar();
        tp.conectarInternet();
        tp.desligar();

        pc.ligar();
        pc.conectarInternet();
        pc.desligar();
    }

}

// interfaces só definem o que as classes devem fazer, porque definem contrato e
// não
// implementação.
