import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scoala {
    HashMap<String,Clasa> clase = new HashMap<>();

    public void adaugaClasa(String c1,Clasa clasa)
    {
        clase.put(c1,clasa);
    }
    public void eliminaClasa(String c1)
    {
        clase.remove(c1);
    }
    public void adaugaElevInClasa(String key,Elev elev)
    {
        if(clase.containsKey(key))
        {
            clase.get(key).adaugaElev(elev);
        }
        else
        {
            System.out.println("NU exista!");
        }
    }
    public void eliminaElevDupaNume(String nume)
    {
       for (Clasa clase:clase.values())
       {
           List<Elev> eleviDeEliminat=new ArrayList<>();
           for(Elev elev: clase.getElevi())
           {
               if(elev.getNume().equals(nume))
               {
                   eleviDeEliminat.add(elev);
               }
           }
           for (Elev elev:eleviDeEliminat)
           {
               clase.eliminaElev(elev);
           }
       }
    }
    public int getNumarClase()
    {
        return clase.size();
    }
    public int getTotalElevi()
    {
        int total=0;
        for (Clasa clasa : clase.values())
        {
            total+=clasa.getTotalElevi();
        }
        return total;
    }

}