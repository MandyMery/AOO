public class Tribus {

    private String montagnard; 
    private String marins;
    private String herbeux;

    public Tribus(String breton, String provancal, String savoyard) {
        this.breton = breton;
        this.provancal = provancal;
        this.savoyard = savoyard;
    }

    public String getBreton() {
        return breton;
    }

    public void setBreton(String breton) {
        this.breton = breton;
    }

    public String getProvancal() {
        return provancal;
    }

    public void setProvancal(String provancal) {
        this.provancal = provancal;
    }

    public String getSavoyard() {
        return savoyard;
    }

    public void setSavoyard(String savoyard) {
        this.savoyard = savoyard;
    }

    @Override
    public String toString() {
        return "Tribus [breton=" + breton + ", provancal=" + provancal + ", savoyard=" + savoyard + "]";
    }


    
}

