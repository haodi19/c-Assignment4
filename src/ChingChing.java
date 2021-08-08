import java.io.Serializable;

public class ChingChing implements Serializable{

    public String ching;
    private int chingching;
    private static final long serialVersionUID=5;

    public ChingChing(){};
    public ChingChing(String ching, int chingching){
        this.ching=ching;
        this.chingching=chingching;
    }

    public void show(){
        System.out.println(ching+" "+chingching);
    }

    @Override
    public String toString() {
        return "ChingChing{" +
                "ching='" + ching + '\'' +
                ", chingching=" + chingching +
                '}';
    }
}

