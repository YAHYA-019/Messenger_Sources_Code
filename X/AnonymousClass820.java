package X;

import com.facebook.chatheads.view.bubble.BubbleView;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.820, reason: invalid class name */
/* loaded from: 820.class */
public final class AnonymousClass820 {
    public final 1Br A00;
    public final 1De A01;

    public AnonymousClass820(1De r302) {
        this.A01 = r302;
        this.A00 = 1Bu.A03(r302.A00, 17019);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r301 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(com.facebook.chatheads.view.bubble.BubbleView r301, boolean r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L2f
            r0 = r301
            if (r0 == 0) goto L2a
            r0 = r301
            X.KNB r0 = r0.A07
            r303 = r0
            r0 = r301
            java.util.Map r0 = r0.A0M
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            X.ML5 r0 = (X.ML5) r0
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L2a
            r0 = r301
            java.lang.String r0 = r0.AWi()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L2d
        L2a:
            java.lang.String r0 = "unknown"
            r301 = r0
        L2d:
            r0 = r301
            return r0
        L2f:
            java.lang.String r0 = "android_external"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass820.A00(com.facebook.chatheads.view.bubble.BubbleView, boolean):java.lang.String");
    }

    public final void A01(BubbleView bubbleView, ThreadKey threadKey, String str, boolean z) {
        11T.A0F(threadKey, 2);
        ((2SB) this.A00.A00.get()).A02(threadKey, A00(bubbleView, z), str);
    }
}
