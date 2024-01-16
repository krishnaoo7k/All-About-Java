package Avengers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Thor implements Thanos{
    @Override
    public void konHaiAvengers() {
        System.out.println(" hum vo hai jo tume kabhi nhi jetne denge");

    }

    @Override
    public void tumKonHo() {
        System.out.println(" hum hai assGuard ke raja Thor ");

    }

    @Override
    public void tumeKyaChaiye() {
        System.out.println("jo madiya tumne churayi hai sari hame wapis krdo");

    }

    @Override
    public void kyaTumMereAngeTikPaoge() {
        System.out.println(" ye sawal to tume khud se krna chaiye bacche");

    }

    @Override
    public void ghamoora() {
        System.out.println(" kya Ghamora!!!!! ye kaisa nam hua ");

    }

    @Override
    public void tumeLgtaHaiTumMujeHaraPaoge() {
        System.out.println(" bhulo mat hum kon hai assGuard ke raja ");

    }
}
