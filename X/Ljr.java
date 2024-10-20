package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: Ljr.class */
public final class Ljr implements Runnable {
    public static final String __redex_internal_original_name = "AndroidComposeView$resendMotionEventRunnable$1";
    public final /* synthetic */ AndroidComposeView A00;

    public Ljr(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0 == 9) goto L14;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r301 = this;
            r0 = r301
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.A00
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.removeCallbacks(r1)
            r0 = r302
            android.view.MotionEvent r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L69
            r0 = r303
            r1 = 0
            int r0 = r0.getToolType(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            r1 = 3
            boolean r0 = X.AnonymousClass001.A1Q(r0, r1)
            r306 = r0
            r0 = r303
            int r0 = r0.getActionMasked()
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L38
            r0 = 10
            r306 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L69
        L38:
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L69
            r0 = 7
            r306 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L55
            r0 = 9
            r306 = r0
            r0 = 2
            r307 = r0
            r0 = r304
            r1 = r306
            if (r0 != r1) goto L59
        L55:
            r0 = 7
            r307 = r0
        L59:
            r0 = r302
            long r0 = r0.A01
            r308 = r0
            r0 = r303
            r1 = r302
            r2 = r307
            r3 = r308
            r4 = 0
            androidx.compose.ui.platform.AndroidComposeView.A06(r0, r1, r2, r3, r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ljr.run():void");
    }
}
