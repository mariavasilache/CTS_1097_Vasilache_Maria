package clase;

public class Student extends Persoana implements Cloneable {
    private String idStudent;

    public Student() {
            
        super();
        this.idStudent = "S00";
    }

    public Student(String nume, int varsta, String idStudent) {
    
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public Student(Student altStudent) {
   
        super(altStudent);
        this.idStudent = altStudent.idStudent;
    }

    public String getIdStudent() {
        return this.idStudent;
    }

    @Override
    public Student clone() {
        Student clone = (Student) super.clone();
        return clone;
    }
}
