package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: Gzv.class */
public final class Gzv extends C66m {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public Drawable A06;
    public View A07;
    public 5Gk A08;
    public HUh A09;
    public C66i A0A;
    public 6qY A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;

    public void A00(5Gr r302) {
        if (r302 == null) {
            return;
        }
        try {
            6OM A07 = r302.A07();
            this.A08 = A07;
            A07.A81(true);
            A07.Cfo().CXT();
            this.A08.setCallback(this.A07);
            Drawable drawable = this.A08;
            int i = this.A02;
            drawable.setBounds(0, 0, i, i);
            5Gk r0 = this.A08;
            if (r0 != null) {
                if (this.A0D) {
                    r0.CXT();
                } else {
                    r0.pause();
                }
            }
        } catch (54H unused) {
        }
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        if (this.A0E) {
            C00i c00i = this.A09.A00;
            if (c00i.get() == null || !1BK.A0U(c00i).isMarkerOn(5505181)) {
                return;
            }
            1BK.A0U(c00i).markerEnd(5505181, (short) 2);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = this.A03;
        float f2 = this.A04;
        double d = c66i.A09.A00;
        float f3 = (float) d;
        this.A01 = f + (f2 * f3);
        this.A00 = f3;
        int min = Math.min((int) (d * 255.0d), 255);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setAlpha(min);
        }
        this.A07.invalidate();
    }
}
