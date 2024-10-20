package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8kt, reason: invalid class name */
/* loaded from: 8kt.class */
public final class C8kt extends C1rj {
    public int A00;
    public 1LI A01;
    public 1LI A02;
    public 1LI A03;

    public C8kt() {
        super("MigNuxButtonLayout");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), 0, this.A01, this.A02, this.A03, 0, 0};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8kt c8kt = (C8kt) super.A0l();
        1LI r304 = null;
        c8kt.A01 = 7zO.A0S(c8kt.A01);
        c8kt.A02 = 7zO.A0S(c8kt.A02);
        1LI r0 = c8kt.A03;
        if (r0 != null) {
            r304 = r0.A0l();
        }
        c8kt.A03 = r304;
        return c8kt;
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        1LI r0 = this.A01;
        1LI r02 = this.A03;
        1LI r03 = this.A02;
        int i3 = this.A00;
        ImmutableList of = ImmutableList.of((Object) r0, (Object) r02, (Object) r03);
        int[] A00 = AnonymousClass861.A00(r302, of);
        int size = View.MeasureSpec.getSize(i);
        int size2 = of.size();
        int floor = (int) Math.floor((size - ((size2 - 1) * i3)) / size2);
        for (int i4 : A00) {
            if (i4 > floor) {
                8OG A002 = C8lp.A00(r302);
                A002.A0e();
                A002.A01.A00 = 0;
                A002.A2C(C26z.HORIZONTAL, 0);
                A002.A2C(C26z.VERTICAL, 0);
                A002.A2X(7zL.A0d(r0, 7zM.A0m(r302)));
                A002.A2X(7zL.A0d(r02, 7zM.A0m(r302)));
                A002.A0J();
                return A002.A01;
            }
        }
        C2yw A003 = 2dA.A00(r302);
        A003.A0e();
        A003.A01.A00 = i3;
        A003.A2C(C26z.HORIZONTAL, 0);
        A003.A2C(C26z.VERTICAL, 0);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A10(50.0f);
        A003.A2X(7zL.A0d(r03, A01));
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A10(50.0f);
        A003.A2X(7zL.A0d(r0, A012));
        A003.A0J();
        return A003.A01;
    }
}
