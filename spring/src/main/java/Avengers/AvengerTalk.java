package Avengers;

import org.springframework.stereotype.Component;

@Component
public class AvengerTalk {
    private Thanos says;

    public AvengerTalk(Thanos says) {
        this.says = says;
    }
    public void bolo(){
        says.konHaiAvengers();
        says.tumKonHo();
        says.tumeKyaChaiye();
        says.kyaTumMereAngeTikPaoge();
        says.ghamoora();
        says.tumeLgtaHaiTumMujeHaraPaoge();
    }
}
