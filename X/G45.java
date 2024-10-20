package X;

import com.facebook.litho.LithoView;
import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: G45.class */
public final class G45 implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverActivity$11$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Dky A01;
    public final /* synthetic */ EjM A02;

    public G45(Dky dky, EjM ejM, int i) {
        this.A02 = ejM;
        this.A01 = dky;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        EjM ejM = this.A02;
        QuicksilverActivity quicksilverActivity = ejM.A00;
        LithoView lithoView = quicksilverActivity.A0C;
        FGt fGt = quicksilverActivity.A0F;
        1Iw r0 = quicksilverActivity.A0B;
        boolean A1Q = AnonymousClass001.A1Q(quicksilverActivity.A00, 11);
        boolean A1O = QuicksilverActivity.A1O(quicksilverActivity);
        boolean booleanValue = ejM.A01.booleanValue();
        Dky dky = this.A01;
        DZW dzw = quicksilverActivity.A0E;
        lithoView.A0x(fGt.A03(dky, dzw != null ? dzw.A1X().A01 : null, r0, quicksilverActivity.A0c, this.A00, A1Q, A1O, booleanValue, QuicksilverActivity.A1Q(quicksilverActivity), 0S2.A01.equals(quicksilverActivity.A0G.A07), false, QuicksilverActivity.A1R(quicksilverActivity), QuicksilverActivity.A1P(quicksilverActivity)));
        4YU.A0G(quicksilverActivity.A0A).postDelayed(new G2i(quicksilverActivity, booleanValue), 5000L);
    }
}
