package clase;

import interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent() {
        super();
        this.idAsistent = "A00";
    }

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return this.idAsistent;
    }

    @Override
    public void preda() {
        System.out.println(this.getNume() + " preda ca asistent.");
    }
}
