package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Awc, reason: case insensitive filesystem */
/* loaded from: Awc.class */
public final class C1911Awc extends C1rs {
    public 1Iw A00;
    public B0t A01;
    public final BitSet A02;
    public final String[] A03;

    public C1911Awc(1Iw r302, B0t b0t) {
        super(b0t, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "shouldShowButton", "titleTextId"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = b0t;
        this.A00 = r302;
        A18.clear();
    }

    public static C1911Awc A06(1Iw r301, MigColorScheme migColorScheme, boolean z) {
        C1911Awc c1911Awc = new C1911Awc(r301, new B0t());
        c1911Awc.A01.A08 = migColorScheme;
        BitSet bitSet = c1911Awc.A02;
        bitSet.set(0);
        c1911Awc.A01.A0A = z;
        bitSet.set(1);
        return c1911Awc;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2W(int i) {
        this.A01.A00 = i;
        this.A02.set(2);
    }
}
