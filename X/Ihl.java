package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Ihl.class */
public final class Ihl implements JON {
    public SurfaceControl A00;
    public H3P A01;
    public Surface A02;
    public SurfaceControl A03;
    public SurfaceView A04;
    public JGi A05;
    public final Handler A06;
    public final I0c A07;
    public final Ihm A08;
    public final JQR A09;

    public Ihl(Handler handler, I0c i0c, Ihm ihm, JQR jqr) {
        this.A07 = i0c;
        this.A09 = jqr;
        this.A08 = ihm;
        this.A06 = handler;
    }

    public static final /* synthetic */ Surface A01(Ihl ihl) {
        SurfaceControl build = new SurfaceControl.Builder().setName(4YU.A14(ihl)).setBufferSize(0, 0).build();
        11T.A0A(build);
        H3P h3p = ihl.A01;
        if (h3p != null) {
            h3p.A04(build);
        }
        ihl.A00 = build;
        return new Surface(build);
    }

    public void A98(6VK r302) {
        Surface surface;
        SurfaceControl A01;
        IhL ihL = r302.A07;
        if (ihL == null || (surface = ihL.A00) == null || !surface.isValid() || (A01 = ihL.A01()) == null || !A01.isValid()) {
            return;
        }
        this.A02 = surface;
        this.A03 = A01;
    }

    public View AKa(Context context, IhE ihE, 6UQ r304) {
        H3P h3p;
        GT4 h18;
        Surface surface;
        SurfaceControl surfaceControl;
        JQR jqr = this.A09;
        jqr.CUZ();
        I0c i0c = this.A07;
        boolean z = true;
        boolean z2 = false;
        if (!i0c.A0M || ((surfaceControl = this.A00) != null && !surfaceControl.isValid())) {
            this.A04 = null;
            this.A00 = null;
        }
        SurfaceControl surfaceControl2 = this.A03;
        if (surfaceControl2 == null || !surfaceControl2.isValid() || (surface = this.A02) == null || !surface.isValid()) {
            this.A02 = null;
            this.A03 = null;
        }
        SurfaceControl surfaceControl3 = this.A00;
        if (surfaceControl3 == null) {
            surfaceControl3 = this.A03;
            if (surfaceControl3 == null) {
                surfaceControl3 = new SurfaceControl.Builder().setName(4YU.A14(this)).setBufferSize(0, 0).build();
                11T.A0A(surfaceControl3);
            }
        }
        SurfaceView surfaceView = this.A04;
        if (surfaceView == null) {
            if (i0c.A0A) {
                h18 = new GT4(context);
                h18.setEGLContextClientVersion(2);
                if (i0c.A0B) {
                    h18.setDebugFlags(3);
                }
                h18.setRenderer(new H3R(h18, r304));
                this.A05 = h18;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i < 30 || i > 31 || !i0c.A0K) {
                    h18 = new H18(context);
                    this.A05 = h18;
                } else {
                    h18 = new H19(context);
                    this.A05 = h18;
                }
                z2 = true;
            }
            surfaceView = (SurfaceView) h18;
            z = z2;
        }
        if (this.A04 == null) {
            this.A04 = surfaceView;
            H3P h3p2 = new H3P(this.A06, surfaceControl3, surfaceView, r304, i0c, this.A05, jqr);
            h3p2.A00 = this.A02;
            if (z) {
                surfaceView.getHolder().addCallback(h3p2);
            }
            this.A01 = h3p2;
        } else {
            Handler handler = this.A06;
            if (handler != null) {
                handler.post(new IuR(this));
            }
            ihE.A05();
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = surfaceControl3;
        if (i0c.A0G && (h3p = this.A01) != null) {
            h3p.A02 = new J9o(this, 28);
        }
        return surfaceView;
    }

    public Surface AoF() {
        H3P h3p = this.A01;
        if (h3p != null) {
            return ((IJF) h3p).A00;
        }
        return null;
    }

    public Ihm AoG() {
        return this.A08;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.HfT] */
    public HfT B3d() {
        I0c i0c = this.A07;
        ?? obj = new Object();
        obj.A01 = i0c.A04;
        obj.A00 = i0c.A00;
        obj.A02 = i0c.A0O;
        return obj;
    }

    public JDS BDr() {
        Surface surface;
        SurfaceControl surfaceControl = this.A00;
        H3P h3p = this.A01;
        IhL ihL = null;
        if (h3p != null && (surface = ((IJF) h3p).A00) != null) {
            ihL = new IhL(surface, surfaceControl);
        }
        return ihL;
    }

    public boolean BSs() {
        return false;
    }

    public void BtP(ViewGroup viewGroup) {
        H3P h3p;
        I0c i0c = this.A07;
        if (i0c.A07 && (h3p = this.A01) != null) {
            h3p.A03();
        }
        this.A09.CUe();
        if (i0c.A0L || i0c.A04) {
            return;
        }
        this.A01 = null;
        this.A00 = null;
    }

    public void CGA() {
        if (this.A07.A08) {
            H3P h3p = this.A01;
            if (h3p != null) {
                h3p.A03();
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    public void CUI(int i, int i2, float f) {
        H3P h3p = this.A01;
        if (h3p != null) {
            H3P.A01(h3p, Double.valueOf(i / i2), ((IJF) h3p).A02.A03);
        }
    }
}
