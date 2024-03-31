package padroescriacao.singleton;

public class Medidas {

    private Medidas() {};
    private static Medidas instance = new Medidas();
    public static Medidas getInstance() {
        return instance;
    }

    private String nomeHospital;
    private String medico;

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}