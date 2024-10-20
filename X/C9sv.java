package X;

/* renamed from: X.9sv, reason: invalid class name */
/* loaded from: 9sv.class */
public final class C9sv implements 3xS {
    public float A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer C29(android.view.MotionEvent r302, androidx.recyclerview.widget.RecyclerView r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.1BL.A1X(r0, r1)
            r305 = r0
            r0 = r302
            int r0 = r0.getAction()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9b
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L7f
            r0 = 2
            r307 = r0
            r0 = 2
            r308 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L3b
            r0 = 3
            r307 = r0
            r0 = 3
            r308 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L7f
        L37:
            java.lang.Integer r0 = X.0S2.A0C
            return r0
        L3b:
            r0 = r302
            float r0 = r0.getX()
            r304 = r0
            r0 = r301
            float r0 = r0.A00
            r308 = r0
            r0 = r304
            r1 = r308
            float r0 = r0 - r1
            r304 = r0
            r0 = r304
            float r0 = java.lang.Math.abs(r0)
            r309 = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r308 = r0
            r0 = r309
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 <= 0) goto L37
            java.lang.String r0 = "Intercepting scroll action as dx="
            r1 = r304
            java.lang.String r0 = X.0Pz.A0S(r0, r1)
            r310 = r0
            java.lang.String r0 = "HighlightsTabHScrollNonPropagatingTouchInterceptor"
            r1 = r310
            X.0fH.A0j(r0, r1)
            r0 = r303
            android.view.ViewParent r0 = r0.getParent()
            r1 = r305
            r0.requestDisallowInterceptTouchEvent(r1)
            java.lang.Integer r0 = X.0S2.A00
            return r0
        L7f:
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r301
            r1 = 0
            r0.A00 = r1
            r0 = r303
            android.view.ViewParent r0 = r0.getParent()
            r311 = r0
            r0 = r311
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L37
        L9b:
            r0 = r302
            float r0 = r0.getX()
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A00 = r1
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sv.C29(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):java.lang.Integer");
    }
}
