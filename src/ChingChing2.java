import java.io.Serializable;
import java.util.Objects;

public class ChingChing2 implements Serializable{

    public String ching;
    private int chingching;


    public ChingChing2(){};
    public ChingChing2(String ching, int chingching){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChingChing2 that = (ChingChing2) o;
        return chingching == that.chingching && Objects.equals(ching, that.ching);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ching, chingching);
    }
}
