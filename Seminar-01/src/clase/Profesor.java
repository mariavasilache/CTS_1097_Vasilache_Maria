package clase;

import interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil, Cloneable {
    private String idAngajat;

    public Profesor() {
        super();
        this.idAngajat = "P00";
    }

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public Profesor(Profesor altProfesor) {
        super(altProfesor);
        this.idAngajat = altProfesor.idAngajat;
    }

    public String getIdAngajat() {
        return this.idAngajat;
    }

    @Override
    public void preda() {
        System.out.println(this.getNume() + " preda ca profesor.");
    }

    @Override
    public Profesor clone() {
        Profesor clone = (Profesor) super.clone();
        return clone;
    }
}
