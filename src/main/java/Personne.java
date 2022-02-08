public  class  Personne{

} String nom;
    Montre m;
    Personne(String nom){
        this.nom = nom;
        this.m = null;
    }
    boolean porteMontre(Montre m){
        if(m.p!=null && this.m==null){
            this.m = m;
            m.p = this; // pour 2.3
            return true;
        }
        else return false;
    }
    Montre enleveMontre(){
        Montre m = this.m;
        this.m = null;
        if(m!=null) m.p=null; // pour 2.3
        return m;
    }
    String donneHeure(){
        if(this.m != null) return this.m.heure+"h"+this.m.min;
        else return "";
    }