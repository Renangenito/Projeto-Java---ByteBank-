
public class TesteMetodos {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 200;
        contaDoPaulo.deposita(800);

        boolean conseguiuSacar = contaDoPaulo.saca(500);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);
        boolean transferenciaComSucesso = contaMarcela.transfere(200, contaDoPaulo);
        if (transferenciaComSucesso) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insulficiente!");
        }

        System.out.println(contaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }

}
