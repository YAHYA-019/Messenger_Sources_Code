package X;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Ihj.class */
public final class Ihj implements JON {
    public IJF A00;
    public final I0c A01;
    public final Ihm A02;
    public final JQQ A03;

    public Ihj(I0c i0c, Ihm ihm, JQQ jqq) {
        this.A01 = i0c;
        this.A03 = jqq;
        this.A02 = ihm;
    }

    public /* synthetic */ void A98(6VK r302) {
    }

    public View AKa(Context context, IhE ihE, 6UQ r304) {
        GT4 gt4;
        boolean z;
        JQQ jqq = this.A03;
        jqq.CUZ();
        I0c i0c = this.A01;
        if (i0c.A0A) {
            gt4 = new GT4(context);
            gt4.setEGLContextClientVersion(2);
            if (i0c.A0B) {
                gt4.setDebugFlags(3);
            }
            gt4.setRenderer(new H3R(gt4, r304));
            z = false;
        } else {
            int i = Build.VERSION.SDK_INT;
            gt4 = (SurfaceView) ((i < 30 || i > 31 || !i0c.A0K) ? new H18(context) : new H19(context));
            z = true;
        }
        gt4.setZOrderOnTop(i0c.A0D);
        IJF ijf = new IJF(r304, i0c, jqq);
        this.A00 = ijf;
        if (z) {
            gt4.getHolder().addCallback(ijf);
        }
        return gt4;
    }

    public Surface AoF() {
        IJF ijf = this.A00;
        if (ijf != null) {
            return ijf.A00;
        }
        return null;
    }

    public Ihm AoG() {
        return this.A02;
    }

    public /* synthetic */ HfT B3d() {
        return HfT.A03;
    }

    public /* synthetic */ JDS BDr() {
        return null;
    }

    public boolean BSs() {
        return false;
    }

    public void BtP(ViewGroup viewGroup) {
        this.A03.CUe();
    }

    public /* synthetic */ void CGA() {
    }

    public /* synthetic */ void CUI(int i, int i2, float f) {
    }
}
