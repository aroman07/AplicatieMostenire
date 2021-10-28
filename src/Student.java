import java.lang.*;
public class Student extends Persoana {
    private String _nrMatricol;

    Student (String nume, String cnp, String nrMatricol){
        super(nume,cnp);
        this._nrMatricol = nrMatricol;
    }

    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append(super.toString());
        s.append(" *** Student: " + getNume() + "/" + getCNP() + "/" + this._nrMatricol);
        return s.toString();
    }
}
