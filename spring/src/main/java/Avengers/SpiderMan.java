package Avengers;

import org.springframework.stereotype.Component;

@Component
public class SpiderMan implements Thanos{
    @Override
    public void konHaiAvengers() {
        System.out.println(" aaila ye to Avengers ki  bezzati krra hai");

    }

    @Override
    public void tumKonHo() {
        System.out.println(" Mai hu spiderman nam to suna hi hoga");

    }

    @Override
    public void tumeKyaChaiye() {
        System.out.println("deko uncle apne jo madiya li hai wapis krdo hum chale jayege");

    }

    @Override
    public void kyaTumMereAngeTikPaoge() {
        System.out.println("haa bilkul mera suit jo nya hai");

    }

    @Override
    public void ghamoora() {
        System.out.println("ghamora!!! abb ye kon bawal hai");

    }

    @Override
    public void tumeLgtaHaiTumMujeHaraPaoge() {
        System.out.println("lgta hai uncle ko future ka nhi pta koi na abhi dika deta hu");

    }
}
