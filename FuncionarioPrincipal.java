public class FuncionarioPrincipal {

    public static void main(String[] args) {

        Funcionario clt = new FuncionarioCLT("Daniel", 1000);
        Funcionario pj = new FuncionarioPJ("Professor", 10000);

        System.out.println("CLT: R$ " + clt.calcularSalario());
        System.out.println("PJ: R$ " + pj.calcularSalario());
    }

}
