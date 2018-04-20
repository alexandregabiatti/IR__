//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IrpfTest {

    @Test
    void impostoDevido() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        irpf.setTotRendimentos(37000);
        irpf.setIdade(67);
        irpf.setNroDep(2);
        double expected = 27239.5;
        double actual = irpf.impostoDevido();
        assertEquals(expected, actual);
    }

    @Test
    void getNome() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        String expected = "Teste1";
        String actual = irpf.getNome();
        assertEquals(expected, actual);
    }

    @Test
    void getCpf() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        String expected = "12345678901";
        String actual = irpf.getCpf();
        assertEquals(expected, actual);
    }

    @Test
    void getTotRendimentos() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        irpf.setTotRendimentos(37000);
        double expected = 37000;
        double actual = irpf.getTotRendimentos();
        assertEquals(expected, actual);
    }

    @Test
    void getContrPrev() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        irpf.setTotRendimentos(37000);
        irpf.setIdade(67);
        irpf.setNroDep(2);
        double expected = 35890;
        irpf.impostoDevido();
        double actual = irpf.getContrPrev();
        assertEquals(expected, actual);
    }

    @Test
    void getNroDep() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        irpf.setTotRendimentos(37000);
        irpf.setIdade(66);
        irpf.setNroDep(2);
        int expected = 2;
        int actual = irpf.getNroDep();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIdade() {
        Irpf irpf = new Irpf("Teste1", "12345678901");
        irpf.setTotRendimentos(37000);
        irpf.setIdade(67);
        irpf.setNroDep(2);
        int expected = 67;
        int actual = irpf.getIdade();
        assertEquals(expected, actual);
    }

}

