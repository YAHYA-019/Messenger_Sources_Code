package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.BitSet;

/* loaded from: Iha.class */
public final class Iha implements C6ca {
    @Override // X.C6ca
    public Integer AWj() {
        return 0S2.A0N;
    }

    @Override // X.C6ca
    public 1LI AdE(1Iw r302, 1Im r303, 6TN r304, PlayerOrigin playerOrigin, GRD grd, 6UR r307, 6TI r308, IhX ihX, C6ce c6ce, GRX grx) {
        1BK.A1K(ihX, 3, grx);
        7zR.A1P(playerOrigin, r304);
        C2659Gkb c2659Gkb = new C2659Gkb(r302, new Gla());
        Gla gla = c2659Gkb.A01;
        gla.A04 = null;
        BitSet bitSet = c2659Gkb.A02;
        bitSet.set(1);
        gla.A03 = ihX;
        bitSet.set(0);
        gla.A02 = r308;
        bitSet.set(4);
        c2659Gkb.A0c();
        gla.A01 = playerOrigin;
        bitSet.set(2);
        gla.A00 = r304;
        bitSet.set(3);
        gla.A05 = grx;
        bitSet.set(5);
        7zP.A15(c2659Gkb, bitSet, c2659Gkb.A03);
        return gla;
    }

    @Override // X.C6ca
    public String AuU() {
        return "LoadingSpinnerPluginDescriptor";
    }

    @Override // X.C6cb
    public boolean BUW(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305) {
        return true;
    }
}
