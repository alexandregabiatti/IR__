import java.util.List;

public class Irpf {
    private String nome;
    private String cpf;
    private double totRendimentos;
    private double ContrPrev;
    private int NroDep;
    private int idade;
    private int bdc;

    public Irpf(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public double impostoDevido(){
        double bdc = getTotRendimentos();//37k, 65yo, 2dpd
        if (getIdade() < 65){
            if (getNroDep()<6){
                if (getNroDep() < 3){ //até 3
                    bdc = bdc*0.975;
                } else { //entre 3 e 5
                    bdc = bdc*0.95;
                }
            } else{
                bdc *=0.9;
            }
        } else {
            if (getNroDep()<6){
                if (getNroDep() < 3){ //até 3
                    bdc = bdc*0.97;
                } else { //entre 3 e 5
                    bdc = bdc*0.955;
                }
            } else{
                bdc *=0.94;
            }
        }//35890
        ContrPrev = bdc;
        bdc = (bdc > 10000 && bdc < 20000) ? (bdc-((bdc-10000)*0.15)) : bdc;
        bdc = (bdc > 10000)? (bdc-((bdc-10000)*0.15)-((bdc-20000)*0.3)): bdc;
        return bdc;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public double getTotRendimentos() {
        return totRendimentos;
    }

    public void setTotRendimentos(double totRendimentos) {
        this.totRendimentos = totRendimentos;
    }

    public double getContrPrev() {
        return ContrPrev;
    }

    public void setContrPrev(double contrPrev) {
        ContrPrev = contrPrev;
    }

    public int getNroDep() {
        return NroDep;
    }

    public void setNroDep(int nroDep) {
        NroDep = nroDep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
