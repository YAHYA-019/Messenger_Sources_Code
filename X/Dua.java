package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.BitSet;

/* loaded from: Dua.class */
public final class Dua extends C1rs {
    public 1Iw A00;
    public DzC A01;
    public final BitSet A02;
    public final String[] A03;

    public Dua(1Iw r302, DzC dzC) {
        super(dzC, r302, 0, 0);
        this.A03 = new String[]{"interstitialTrigger", "nuxId", "onDismissRunnable", "quickPromotionDefinition"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dzC;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public DzC A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(InterstitialTrigger interstitialTrigger) {
        this.A01.A01 = interstitialTrigger;
        this.A02.set(0);
    }

    public void A2Y(QuickPromotionDefinition quickPromotionDefinition) {
        this.A01.A02 = quickPromotionDefinition;
        this.A02.set(3);
    }

    public void A2Z(Runnable runnable) {
        this.A01.A04 = runnable;
        this.A02.set(2);
    }

    public void A2a(String str) {
        this.A01.A05 = str;
        this.A02.set(1);
    }
}
