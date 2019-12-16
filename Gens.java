public class Gens {

        private String pecheur; 
        private String chasseur;
        private String chommeur;

    public Gens(String pecheur, String chasseur, String chommeur) {
        this.pecheur = pecheur;
        this.chasseur = chasseur;
        this.chommeur = chommeur;
    }

    public String getPecheur() {
        return pecheur;
    }

    public void setPecheur(String pecheur) {
        this.pecheur = pecheur;
    }

    public String getChasseur() {
        return chasseur;
    }

    public void setChasseur(String chasseur) {
        this.chasseur = chasseur;
    }

    public String getChommeur() {
        return chommeur;
    }

    public void setChommeur(String chommeur) {
        this.chommeur = chommeur;
    }

    @Override
    public String toString() {
        return "Gens [chasseur=" + chasseur + ", chommeur=" + chommeur + ", pecheur=" + pecheur + "]";
    }


}