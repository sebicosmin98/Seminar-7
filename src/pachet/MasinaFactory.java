package pachet;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {

    public Map<TipMasina,Masina> map = new HashMap<>();

    public Masina getMasina(TipMasina tipMasina){

        Masina m = null;

        if (map.containsKey(tipMasina)) {

            return map.get(tipMasina);


        }
        else if(tipMasina.equals(TipMasina.AUTOTURISM_GALBEN)){

            m = new Autoturism(4,"Berlina","BMW","Galben","Suport");
            map.put(TipMasina.AUTOTURISM_GALBEN, m);

        }
        else if(tipMasina.equals(TipMasina.CAMION_GALBEN)){

            m = new Camion(4,"Berlina","Audi","Galben","Remorca");
            map.put(TipMasina.CAMION_GALBEN, m);
        }
        else if(tipMasina.equals(TipMasina.AUTOTURISM_ROSU)){

            m = new Autoturism(4,"Berlina","Audi","Galben","Suport");
            map.put(TipMasina.AUTOTURISM_ROSU, m);
        }
        else if(tipMasina.equals(TipMasina.CAMION_ROSU)){

            m = new Camion(4,"Berlina","Audi","Galben","Remorca2");
            map.put(TipMasina.CAMION_ROSU, m);
        }

        return m;


    }




}
