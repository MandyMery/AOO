
public class Civilisation {

    private String Francais; 
    private String Anglais;
    private String Espagnol;

    public Civilisation(String francais, String anglais, String espagnol) {
        Francais = francais;
        Anglais = anglais;
        Espagnol = espagnol;
    }

    public String getFrancais() {
        return Francais;
    }

    public void setFrancais(String francais) {
        Francais = francais;
    }

    public String getAnglais() {
        return Anglais;
    }

    public void setAnglais(String anglais) {
        Anglais = anglais;
    }

    public String getEspagnol() {
        return Espagnol;
    }

    public void setEspagnol(String espagnol) {
        Espagnol = espagnol;
    }

    @Override
    public String toString() {
        return "Civilisation [Anglais=" + Anglais + ", Espagnol=" + Espagnol + ", Francais=" + Francais + "]";
    }
    

    
}

