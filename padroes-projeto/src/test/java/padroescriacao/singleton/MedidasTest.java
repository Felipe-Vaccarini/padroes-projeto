package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidasTest {

    @Test
    public void deveRetornarNomeHospital() {
        Medidas.getInstance().setNomeHospital("Hospital 1");
        assertEquals("Hospital 1", Medidas.getInstance().getNomeHospital());
    }

    @Test
    public void deveRetornarMedico() {
        Medidas.getInstance().setMedico("Médico 1");
        assertEquals("Médico 1", Medidas.getInstance().getMedico());
    }

}