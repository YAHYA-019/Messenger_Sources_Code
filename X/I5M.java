package X;

import android.view.View;
import java.util.Set;

/* loaded from: I5M.class */
public final class I5M {
    public static final C66h A0A = C66h.A01();
    public C66i A00;
    public C66i A01;
    public C66i A02;
    public C66i A03;
    public C66i A04;
    public final View A07;
    public final C62j A08;
    public final Set A09 = new 0WH(0);
    public boolean A06 = false;
    public C66h A05 = A0A;

    public I5M(View view, C62j c62j) {
        this.A07 = view;
        this.A08 = c62j;
    }

    public void A00(float f) {
        C66i c66i = this.A01;
        if (c66i == null) {
            c66i = new C66i(this.A08);
            c66i.A06(this.A07.getScaleX());
            c66i.A0A(new GmW(this, 0S2.A0Y, 1));
            this.A01 = c66i;
        }
        c66i.A09(this.A05);
        c66i.A06 = this.A06;
        double d = f;
        c66i.A07(d);
        C66i c66i2 = this.A02;
        if (c66i2 == null) {
            c66i2 = new C66i(this.A08);
            c66i2.A06(this.A07.getScaleY());
            c66i2.A0A(new GmW(this, 0S2.A0j, 2));
            this.A02 = c66i2;
        }
        c66i2.A09(this.A05);
        c66i2.A06 = this.A06;
        c66i2.A07(d);
    }

    public /* bridge */ /* synthetic */ void A01(float f) {
        C66i c66i = this.A00;
        if (c66i == null) {
            c66i = new C66i(this.A08);
            c66i.A06(this.A07.getAlpha());
            c66i.A0A(new GmW(this, 0S2.A00, 0));
            this.A00 = c66i;
        }
        c66i.A09(this.A05);
        c66i.A06 = this.A06;
        c66i.A07(f);
    }

    public /* bridge */ /* synthetic */ void A02(float f) {
        C66i c66i = this.A03;
        if (c66i == null) {
            c66i = new C66i(this.A08);
            c66i.A06(this.A07.getTranslationX());
            c66i.A0A(new GmW(this, 0S2.A0u, 3));
            this.A03 = c66i;
        }
        c66i.A09(this.A05);
        c66i.A06 = this.A06;
        c66i.A07(f);
    }

    public /* bridge */ /* synthetic */ void A03(float f) {
        C66i c66i = this.A04;
        if (c66i == null) {
            c66i = new C66i(this.A08);
            c66i.A06(this.A07.getTranslationY());
            c66i.A0A(new GmW(this, 0S2.A15, 4));
            this.A04 = c66i;
        }
        c66i.A09(this.A05);
        c66i.A06 = this.A06;
        c66i.A07(f);
    }
}
