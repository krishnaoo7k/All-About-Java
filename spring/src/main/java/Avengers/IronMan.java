package Avengers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class IronMan implements Thanos{
    @Override
    public void konHaiAvengers() {
        System.out.println("Avengers vo hai jo tume kabhi jetne nhi denge");

    }

    @Override
    public void tumKonHo() {
        System.out.println("iron man nam to suna hi hoga");

    }

    @Override
    public void tumeKyaChaiye() {
        System.out.println("hame sari maadiya lauta do hum tume jane denge");

    }

    @Override
    public void kyaTumMereAngeTikPaoge() {
        System.out.println("ha ha ha tum jaante nhi ho hame");

    }

    @Override
    public void ghamoora() {
        System.out.println("abb ye kon hai");

    }

    @Override
    public void tumeLgtaHaiTumMujeHaraPaoge() {
        System.out.println("future dhek munna ham tuje mar ke hi aye hai");

    }
}
