package clase;

import interfete.IPersoana;

public class Persoana implements IPersoana, Cloneable {
    private String nume;
    private int varsta;

    public Persoana() {
        this.nume = "Anonim";
        this.varsta = 0;
    }

    public Persoana(String nume, int varsta) {
       this.nume = nume;
       this.varsta = varsta;
    }

    public Persoana(Persoana altaPersoana) {
        this.nume = altaPersoana.nume;
        this.varsta = altaPersoana.varsta;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public Persoana clone() {
        try {
            Persoana clone = (Persoana) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
