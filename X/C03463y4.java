package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.3y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y4.class */
public final class C03463y4 extends C1rj {
    public int A00;
    public int A01;
    public 1LI A02;
    public C1p8 A03;
    public C1p8 A04;
    public C1p8 A05;
    public MigColorScheme A06;
    public String A07;

    public C03463y4() {
        super("TopRightCountBadgeOverlay");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A07, this.A04, this.A06, this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A05};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C03463y4 c03463y4 = (C03463y4) super.A0l();
        1LI r0 = c03463y4.A02;
        c03463y4.A02 = r0 != null ? r0.A0l() : null;
        return c03463y4;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A02;
        MigColorScheme migColorScheme = this.A06;
        String str = this.A07;
        C1p8 c1p8 = this.A03;
        C1p8 c1p82 = this.A05;
        C1p8 c1p83 = this.A04;
        int i = this.A01;
        int i2 = this.A00;
        C4On c4On = new C4On(r302, new C03473y5());
        C03473y5 c03473y5 = c4On.A01;
        c03473y5.A03 = migColorScheme;
        BitSet bitSet = c4On.A02;
        bitSet.set(3);
        c03473y5.A04 = str;
        bitSet.set(1);
        c03473y5.A02 = c1p82;
        bitSet.set(4);
        c03473y5.A00 = c1p8;
        bitSet.set(0);
        c03473y5.A01 = c1p83;
        bitSet.set(2);
        c4On.A0s(22.0f);
        c4On.A0l(22.0f);
        C1rs.A05(bitSet, c4On.A03, 5);
        c4On.A0J();
        ?? obj = new Object();
        int i3 = (-1) << (-1);
        c03473y5.A0c(r302, (C23P) obj, View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i, i3));
        int i4 = (int) (C6qg.A00 * i);
        int i5 = (i4 - (obj.A00 / 2)) + i2;
        int i6 = (i4 - (obj.A01 / 2)) + i2;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0C(i);
        A01.A1L(i);
        A01.A2f(r0);
        2dD A00 = C2dB.A00(r302);
        A00.A2X(c03473y5);
        A00.A2H(2dP.A01);
        A00.A2E(C26z.TOP, i5);
        A00.A2E(C26z.RIGHT, i6);
        A01.A2f(A00.A2W());
        return A01.A00;
    }
}
