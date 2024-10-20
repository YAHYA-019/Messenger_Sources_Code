package X;

import android.content.Context;
import android.view.View;

/* loaded from: A8d.class */
public final class A8d implements AaP {
    public final 2S4 A00;
    public final String A01;

    public A8d(2S4 r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        boolean A1X = 1BL.A1X(r303, r302);
        2S4 r0 = this.A00;
        Context A0A = 7zL.A0A(r303);
        6NV r02 = (6NV) r0.A00(68014);
        2cM A00 = 2cK.A00(r303);
        int A06 = AnonymousClass897.A06(A0A, A00, r303, 7zM.A0p(r302, r303), A1X);
        8Te r03 = new 8Te(r303, new C8lj());
        r03.A2Y(this.A01);
        r03.A2X(r02);
        8Te.A06(A0A, A00, r03, A06, false);
        return A00.A00;
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        11T.A0F(r302, 1);
        return r302;
    }

    public boolean CXV(Context context) {
        11T.A0F(context, 0);
        6NV r0 = (6NV) this.A00.A00(68014);
        String str = this.A01;
        if (r0.BNH(str)) {
            return false;
        }
        r0.CXl(str);
        return true;
    }

    public void Cln(View view) {
        11T.A0F(view, 0);
        2S4 r0 = this.A00;
        7zN.A11(view);
        ((6NV) r0.A00(68014)).A01(view);
    }
}
