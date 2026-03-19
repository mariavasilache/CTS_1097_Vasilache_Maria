package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curs implements Cloneable {
    private String numeCurs;
    private int credite;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs() {
        this.numeCurs = "Curs fara nume";
        this.credite = 0;
        this.profesor = new Profesor();
        this.studenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int credite, Profesor profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = new Profesor(profesor);
        this.studenti = studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    public Curs(Curs other) {
        this.numeCurs = other.numeCurs;
        this.credite = other.credite;
        this.profesor = new Profesor(other.profesor);
        this.studenti = other.studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    public String getNumeCurs() {
        return this.numeCurs;
    }

    public int getCredite() {
        return this.credite;
    }

    public Profesor getProfesor() {
        return new Profesor(this.profesor);
    }

    public List<Student> getStudenti() {
        return this.studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti.stream().map(Student::new).collect(Collectors.toList());
    }

    @Override
    public Curs clone() {
        try {
            Curs cloned = (Curs) super.clone();
            cloned.profesor = this.profesor.clone();
            cloned.studenti = this.studenti.stream().map(Student::clone).collect(Collectors.toList());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
