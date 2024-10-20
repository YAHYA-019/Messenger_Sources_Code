package X;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: A8b.class */
public final class A8b implements AaP {
    public final 2S4 A00;
    public final String A01;

    public A8b(2S4 r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        1BK.A1M(r303, r302);
        2S4 r0 = this.A00;
        7zL.A1L(r303);
        6NT r02 = (6NT) r0.A00(68019);
        2cM A00 = 2cK.A00(r303);
        A00.A2e(r302);
        8TL r03 = new 8TL(r303, new 8lZ());
        r03.A2Z(this.A01);
        r03.A2Y(r02);
        r03.A2X(0);
        r03.A0c();
        r03.A0b();
        return 7zL.A0V(A00, r03.A2W());
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        11T.A0F(r302, 1);
        return r302;
    }

    public boolean CXV(Context context) {
        11T.A0F(context, 0);
        return ((6NT) this.A00.A00(68019)).A01(this.A01, true);
    }

    public void Cln(View view) {
        11T.A0F(view, 0);
        2S4 r0 = this.A00;
        7zN.A11(view);
        6NT r02 = (6NT) r0.A00(68019);
        WeakReference weakReference = r02.A01;
        if (weakReference != null && weakReference.get() != view) {
            r02.A00();
        }
        r02.A01 = 7zL.A14(view);
    }
}
