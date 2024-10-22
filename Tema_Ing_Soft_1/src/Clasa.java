import java.util.ArrayList;
import java.util.List;
public class Clasa  {
    private int capacitate;
    private NumarClasa clasa;
    private char litera;
    private List<Elev> elevi= new ArrayList<>();
    public Clasa(int capacitate, NumarClasa clasa,char litera)
    {
        this.capacitate=capacitate;
        this.clasa=clasa;
        this.litera=litera;
    }

    public NumarClasa getClasa() {
        return clasa;
    }
    public char getLitera()
    {
        return litera;
    }
    public void adaugaElev(Elev elev)
    {
        elevi.add(elev);
    }
    public void eliminaElev(Elev elev)
    {
        elevi.remove(elev);
    }
    public int getTotalElevi()
    {
        return elevi.size();
    }

    public List<Elev> getElevi() {
        return elevi;
    }
}

