package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* loaded from: I8W.class */
public final class I8W {
    public static final HJX A0H = new HJX();
    public CameraDevice A00;
    public Huf A01;
    public IEe A02;
    public Hsy A03;
    public IEU A04;
    public Gul A05;
    public JOV A06;
    public I1R A07;
    public JMF A08;
    public JMF A09;
    public JMF A0A;
    public boolean A0B;
    public final HtV A0C;
    public final HJX A0D;
    public final I9G A0E;
    public final I5y A0F;
    public volatile boolean A0G;

    public I8W(I9G i9g, I5y i5y) {
        HJX hjx = A0H;
        this.A0F = i5y;
        this.A0E = i9g;
        this.A0C = new HtV(i5y);
        this.A0D = hjx;
    }

    public static IBB A00(I8W i8w, int i) {
        I1R i1r;
        HX6 hx6;
        Object A0r;
        Gul gul;
        HX7 hx7;
        if (i != 32) {
            if (i == 35) {
                gul = i8w.A05;
                if (gul == null) {
                    return null;
                }
                hx7 = I82.A10;
            } else if (i == 37) {
                i1r = i8w.A07;
                if (i1r == null) {
                    return null;
                }
                hx6 = I1R.A14;
            } else {
                if (i != 256 && i != 4101) {
                    return null;
                }
                gul = i8w.A05;
                if (gul == null) {
                    return null;
                }
                hx7 = I82.A0k;
            }
            A0r = gul.A05(hx7);
            return (IBB) A0r;
        }
        i1r = i8w.A07;
        if (i1r == null) {
            return null;
        }
        hx6 = I1R.A15;
        List A1H = GOn.A1H(hx6, i1r);
        if (A1H == null || A1H.isEmpty()) {
            return null;
        }
        A0r = 1BK.A0r(A1H);
        return (IBB) A0r;
    }

    public void A01(final JLJ jlj, final Exception exc) {
        this.A0F.A05(new Runnable() { // from class: X.Ixi
            public static final String __redex_internal_original_name = "PhotoCaptureController$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                jlj.BwP(exc);
            }
        }, this.A0E.A03);
    }
}
