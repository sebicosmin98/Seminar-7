package pachet;

public class Main {





    public static void main(String[] args){


        MasinaFactory masinaFactory = new MasinaFactory();

        Masina m1 = masinaFactory.getMasina(TipMasina.AUTOTURISM_GALBEN);

        m1.afiseaza();

        Masina m2 = masinaFactory.getMasina(TipMasina.AUTOTURISM_GALBEN);

        m2.afiseaza();
















    }

}
