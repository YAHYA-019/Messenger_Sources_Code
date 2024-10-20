package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* loaded from: Ht0.class */
public final class Ht0 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public GestureDetector A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D;
    public boolean A0E;
    public final Context A0F;
    public final JKl A0G;

    public Ht0(Context context, JKl jKl) {
        this.A0F = context;
        this.A0G = jKl;
        this.A08 = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.A07 = context.getResources().getDimensionPixelSize(2132279458);
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.A0B = true;
            if (this.A09 == null) {
                this.A09 = new GestureDetector(this.A0F, new GTm(this, 12), null);
            }
            if (i > 22) {
                this.A0C = true;
            }
        }
    }

    public float A00() {
        float f = 1.0f;
        if (AnonymousClass001.A1N(this.A06)) {
            boolean z = this.A0E;
            float f2 = this.A02;
            float f3 = this.A05;
            boolean z2 = !z ? f2 <= f3 : f2 >= f3;
            float A01 = DKC.A01(1.0f, f2 / f3) * 0.5f;
            if (f3 > this.A08) {
                if (!z2) {
                    return 1.0f - A01;
                }
                f = 1.0f + A01;
            }
        } else {
            float f4 = this.A05;
            if (f4 > 0.0f) {
                return this.A02 / f4;
            }
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r311 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0138, code lost:
    
        if (r311 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x030c, code lost:
    
        if (X.DKC.A01(r315, r301.A0D) > r301.A08) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ht0.A01(android.view.MotionEvent):void");
    }
}
