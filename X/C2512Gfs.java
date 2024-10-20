package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Gfs, reason: case insensitive filesystem */
/* loaded from: Gfs.class */
public final class C2512Gfs extends 5CC implements 4gJ {
    public HzS A00;
    public boolean A01;

    public C2512Gfs() {
        super(new Drawable());
    }

    private void A00() {
        Hm2 hm2;
        HzS hzS = this.A00;
        if (hzS != null) {
            hzS.A02 = true;
            hzS.A01 = true;
            hzS.A00 = 1.0f;
            if (this.A01) {
                H5u h5u = hzS.A05;
                h5u.A01 = new GnG((String) null, true);
                H5u.A01(h5u);
            }
            HzS.A00(hzS);
            H5u h5u2 = hzS.A05;
            CallerContext callerContext = H5u.A0J;
            HnR hnR = h5u2.A00;
            if (hnR == null || (hm2 = hnR.A01.A04) == null) {
                return;
            }
            hm2.A00();
        }
    }

    public void Bxg(String str, Throwable th) {
        this.A01 = false;
        A00();
    }

    public void Byc(Animatable animatable, Object obj, String str) {
        this.A01 = true;
        A00();
    }

    public void C2D(String str, Throwable th) {
    }

    public void C2E(String str, Object obj) {
    }

    public void CG6(String str) {
    }

    public void COC(String str, Object obj) {
        this.A01 = false;
        HzS hzS = this.A00;
        if (hzS != null) {
            hzS.A02 = true;
            hzS.A01 = false;
            hzS.A00 = 0.0f;
            HzS.A00(hzS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onLevelChange(int i) {
        float level = getLevel() / 10000.0f;
        HzS hzS = this.A00;
        if (hzS != null) {
            hzS.A00 = level;
            HzS.A00(hzS);
        }
        return super.onLevelChange(i);
    }
}
