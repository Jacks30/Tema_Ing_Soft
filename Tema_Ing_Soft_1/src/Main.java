public class Main {
    public static void main(String[] args) {
        Clasa clasa1=new Clasa(5,NumarClasa.IV,'B');
        Clasa clasa2=new Clasa(3,NumarClasa.II,'A');
        Scoala sc=new Scoala();

        sc.adaugaClasa("IVB",clasa1);
        sc.adaugaClasa("IIA",clasa2);
        Elev e1=new Elev("Ion",Gen.Masculin);
        Elev e2=new Elev("DANA",Gen.Altul);
        Elev e3=new Elev("MARIA",Gen.Feminin);
        Elev e4=new Elev("GIGEL",Gen.Masculin);
        Elev e5=new Elev("GIGEL",Gen.Masculin);


        sc.adaugaElevInClasa("IIA",e1);
        sc.adaugaElevInClasa("IIA",e3);
        sc.adaugaElevInClasa("IIA",e4);

        sc.adaugaElevInClasa("IVB",e2);
        sc.adaugaElevInClasa("IVB",e5);

        System.out.println("Numarul de clase din scoala: " +sc.getNumarClase());
        System.out.println("Numarul total de elevi din scoala: " + sc.getTotalElevi());
        sc.eliminaClasa("IVB");
        System.out.println("Numarul de clase dupa eliminarea unei clase este: " + sc.getNumarClase());
        sc.eliminaElevDupaNume("GIGEL");
        System.out.println("Numarul elevilor dupa eliminarea unui elev este: " + sc.getTotalElevi());
    }
}