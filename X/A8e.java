package X;

import android.content.Context;
import android.view.View;

/* loaded from: A8e.class */
public final class A8e implements AaP {
    public final 2S4 A00;
    public final String A01;

    public A8e(2S4 r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        11T.A0F(r302, 1);
        return r302;
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        11T.A0H(r303, r302);
        2S4 r0 = this.A00;
        7zL.A1L(r303);
        return 7zL.A0V(2cK.A00(r303), new 8aA(r302, (6NY) r0.A00(67793), this.A01, C0ty.A00));
    }

    public boolean CXV(Context context) {
        11T.A0F(context, 0);
        ((6NY) this.A00.A00(67793)).A02(this.A01, 0S2.A00);
        return true;
    }

    public void Cln(View view) {
        11T.A0F(view, 0);
        2S4 r0 = this.A00;
        7zN.A11(view);
        ((6NY) r0.A00(67793)).A01(view);
    }
}
