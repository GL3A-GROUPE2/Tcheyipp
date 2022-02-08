class Montre{
    int hr, min;

    Montre(int h, int m){
        this.hr = hr;
        this.min = m;

    }
    Montre(Montre m){
        this.hr = m.hr;
        this.min = m.min;
    }
    void avance(){
        if(this.min==59){
            if(this.hr == 23) this.hr = 0;
            else this.hr = this.hr++;
            this.min = 0;
        }
        else this.min++;
    }
    public static void main(String[] toto){
        Montre m = new Montre(9,25);
        Montre n = new Montre(m);
    }
}
