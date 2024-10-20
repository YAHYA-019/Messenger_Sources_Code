package X;

import com.facebook.litho.LithoView;
import com.facebook.quicksilver.QuicksilverActivity;
import java.util.BitSet;

/* loaded from: G46.class */
public final class G46 implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverActivity$7$1";
    public final /* synthetic */ EjN A00;
    public final /* synthetic */ C2fr A01;
    public final /* synthetic */ String A02;

    public G46(EjN ejN, C2fr c2fr, String str) {
        this.A00 = ejN;
        this.A02 = str;
        this.A01 = c2fr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        8oB r306;
        Dtw dtw;
        QuicksilverActivity quicksilverActivity = this.A00.A01;
        LithoView lithoView = quicksilverActivity.A0C;
        FGt fGt = quicksilverActivity.A0F;
        1Iw r0 = quicksilverActivity.A0B;
        boolean A1Q = AnonymousClass001.A1Q(quicksilverActivity.A00, 11);
        boolean A1O = QuicksilverActivity.A1O(quicksilverActivity);
        String str = this.A02;
        C2fr c2fr = this.A01;
        boolean A1Q2 = QuicksilverActivity.A1Q(quicksilverActivity);
        boolean equals = 0S2.A01.equals(quicksilverActivity.A0G.A07);
        Aak aak = quicksilverActivity.A0c;
        boolean A1R = QuicksilverActivity.A1R(quicksilverActivity);
        boolean A1P = QuicksilverActivity.A1P(quicksilverActivity);
        if (1Br.A06(((FHN) 1Bi.A03(85203)).A00).AZk(36322001552229372L)) {
            Du3 du3 = new Du3(r0, new 8oB());
            r306 = du3.A01;
            r306.A00 = aak;
            BitSet bitSet = du3.A02;
            FGt.A02(du3, fGt, bitSet);
            r306.A02 = A1Q;
            bitSet.set(2);
            r306.A03 = false;
            bitSet.set(3);
            r306.A01 = equals;
            bitSet.set(1);
            C1rs.A02(bitSet, du3.A03);
            dtw = du3;
        } else {
            Dtw dtw2 = new Dtw(r0, new 8oV());
            r306 = dtw2.A01;
            ((8oV) r306).A03 = aak;
            BitSet bitSet2 = dtw2.A02;
            FGt.A02(dtw2, fGt, bitSet2);
            ((8oV) r306).A07 = A1Q;
            bitSet2.set(1);
            ((8oV) r306).A08 = A1O;
            bitSet2.set(2);
            ((8oV) r306).A0C = true;
            bitSet2.set(4);
            ((8oV) r306).A05 = str;
            ((8oV) r306).A04 = c2fr;
            ((8oV) r306).A0A = A1Q2;
            bitSet2.set(3);
            ((8oV) r306).A06 = equals;
            ((8oV) r306).A0B = A1R;
            ((8oV) r306).A09 = A1P;
            C1rs.A04(bitSet2, dtw2.A03);
            dtw = dtw2;
        }
        dtw.A0J();
        lithoView.A0x(r306);
        4YU.A0G(quicksilverActivity.A0A).postDelayed(new G2i(quicksilverActivity, true), 5000L);
    }
}
