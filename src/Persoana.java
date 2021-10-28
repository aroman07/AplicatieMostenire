public class Persoana {
    private String _nume;
    private String _cnp;

    Persoana(String nume, String cnp){
        this._nume = nume;
        this._cnp = cnp;
    }

    public String getNume(){
        return this._nume;
    }

    public String getCNP(){
        return this._cnp;
    }

    public String toString(){
        return "Persoana: " + this._nume + "/" + this._cnp;
    }
}
