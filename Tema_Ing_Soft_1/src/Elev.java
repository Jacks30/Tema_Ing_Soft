public class Elev  {
        String nume;
        Gen gen;

        public Elev(String nume,Gen gen)
        {
            this.gen=gen;
            this.nume=nume;
        }

        public Gen getGen() {
            return gen;
        }

        public String getNume() {
            return nume;
        }


    }


