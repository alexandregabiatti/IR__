public class Main {

    public static void main(String[] args) {
        Irpf i = new Irpf("kk", "555");
        i.setTotRendimentos(5000);
        i.setIdade(40);
        i.setNroDep(1);
        System.out.println(i.impostoDevido()+" é o IR com um salário de "+ i.getTotRendimentos()+", "
                +i.getIdade()+" anos de idade e "+i.getNroDep()+" dependente(s)" );
    }
}
