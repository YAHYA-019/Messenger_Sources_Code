package X;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* loaded from: Lre.class */
public final class Lre implements Runnable, MJN, Choreographer.FrameCallback, ME7 {
    public static long A06 = 0;
    public static final String __redex_internal_original_name = "AndroidPrefetchScheduler";
    public long A00;
    public boolean A01;
    public boolean A02;
    public final View A04;
    public final LtK A05 = LtK.A02(new ME6[16]);
    public final Choreographer A03 = Choreographer.getInstance();

    public Lre(View view) {
        this.A04 = view;
        if (A06 == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            A06 = 1.0E9f / f;
        }
    }

    @Override // X.MJN
    public void BhF() {
    }

    @Override // X.MJN
    public void BzU() {
        this.A01 = false;
        this.A04.removeCallbacks(this);
        this.A03.removeFrameCallback(this);
    }

    @Override // X.MJN
    public void CGG() {
        this.A01 = true;
    }

    @Override // X.ME7
    public void Cjm(ME6 me6) {
        this.A05.A0C(me6);
        if (this.A02) {
            return;
        }
        this.A02 = true;
        this.A04.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.A01) {
            this.A00 = j;
            this.A04.post(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r310 != false) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lre.run():void");
    }
}
