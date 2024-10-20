package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: A8f.class */
public final class A8f implements AaP {
    public final Uri A00;
    public final 2S4 A01;
    public final 5aU A02;
    public final String A03;

    public A8f(Uri uri, 2S4 r303, 5aU r304, String str) {
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = str;
        this.A00 = uri;
    }

    public 1LI AJG(1LI r302, 1Iw r303) {
        11T.A0F(r302, 1);
        return new 8YT(r302, this.A02, this.A03);
    }

    public 1LI AK0(1LI r302, 1Iw r303) {
        11T.A0F(r303, 0);
        11T.A0F(r302, 1);
        int A00 = 7zR.A00(r303.A0D);
        5aU r0 = this.A02;
        AbstractC3828MrH abstractC3828MrH = AbstractC3828MrH.$redex_init_class;
        int ordinal = r0.ordinal();
        if (ordinal == 8) {
            float f = A00;
            return new 8bR(this.A00, r302, C1ro.FLEX_START, this.A03, f);
        }
        if (ordinal == 7) {
            float f2 = A00;
            return new 8bO(this.A00, r302, C1ro.FLEX_START, this.A03, f2);
        }
        if (ordinal == 9) {
            float f3 = A00;
            return new 8bP(this.A00, r302, C1ro.FLEX_START, this.A03, f3);
        }
        if (ordinal != 6) {
            return r302;
        }
        return new 8bQ(this.A00, this.A01, r302, C1ro.FLEX_START, this.A03);
    }

    public boolean CXV(Context context) {
        return ((C6js) 1Bi.A03(66778)).A02(this.A03);
    }

    public void Cln(View view) {
        11T.A0F(view, 0);
        if (this.A02 == 5aU.A09) {
            2S4 r0 = this.A01;
            7zN.A11(view);
            ((6NY) r0.A00(67793)).A01(view);
        }
    }
}
