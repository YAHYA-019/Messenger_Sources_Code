package X;

import android.hardware.Camera;
import com.facebook.common.util.TriState;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: I42.class */
public final class I42 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Camera.Size A04;
    public Camera A05;
    public H9R A06;
    public C01s A07;
    public HH5 A08;
    public RgT A09;
    public 6KW A0A;
    public TriState A0B;
    public AbR A0C;
    public FbSharedPreferences A0D;
    public F8q A0E;
    public Executor A0F;

    public static final Camera.Size A00(H9R h9r, List list, int i, int i2) {
        11T.A0F(h9r, 4);
        if (list == null) {
            return null;
        }
        boolean A1W = AnonymousClass001.A1W(h9r, H9R.A03);
        float f = i2 / i;
        int i3 = (-1) >>> 1;
        int i4 = (-1) >>> 1;
        if (!A1W) {
            i4 = 0;
            i3 = 0;
        }
        Iterator it = list.iterator();
        Camera.Size size = null;
        Camera.Size size2 = null;
        while (it.hasNext()) {
            Camera.Size size3 = (Camera.Size) it.next();
            int i5 = size3.height;
            float f2 = i5;
            int i6 = size3.width;
            float f3 = f2 / i6;
            int i7 = i5 * i6;
            boolean z = !A1W ? i7 <= i4 : i7 >= i4;
            boolean A1U = GOp.A1U((DKC.A01(f3, f) > 0.01f ? 1 : (DKC.A01(f3, f) == 0.01f ? 0 : -1)));
            if (z && A1U) {
                i4 = i7;
                size = size3;
            }
            if (A1W) {
                if (i7 < i3) {
                    i3 = i7;
                    size2 = size3;
                }
            } else if (i7 > i3) {
                i3 = i7;
                size2 = size3;
            }
        }
        if (size != null) {
            return size;
        }
        if (size2 == null) {
            return null;
        }
        0fH.A0n("CameraUtils", "Can not find a size that respects the desired proportions");
        return size2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (android.media.CamcorderProfile.hasProfile(r0, 4) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.I42 r301, X.HdL r302) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I42.A01(X.I42, X.HdL):void");
    }

    public float A02() {
        int i;
        Camera.Size size = this.A04;
        if (size == null || (i = size.height) == 0) {
            return -1.0f;
        }
        float f = size.width / i;
        int A00 = this.A0A.A00();
        if (A00 == 0 || A00 == 2) {
            f = 1.0f / f;
        }
        return f;
    }

    public boolean A03() {
        TriState triState = this.A0B;
        if (triState != TriState.UNSET) {
            return triState == TriState.YES;
        }
        int i = this.A01;
        return i == this.A02 && i > 0;
    }
}
