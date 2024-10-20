package X;

/* loaded from: L83.class */
public final class L83 {
    public static final L83 A02 = new L83(0);
    public final ThreadLocal A00;
    public volatile int A01;

    public L83() {
        this(0);
    }

    public L83(int i) {
        this.A01 = -1;
        this.A00 = new Lxl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r304.isPresent() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.base.Optional A00(com.facebook.fury.context.ReqContext r302) {
        /*
            r301 = this;
            r0 = r301
            java.lang.ThreadLocal r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            com.google.common.base.Optional r0 = (com.google.common.base.Optional) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.isPresent()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4d
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r301
            int r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 < 0) goto L4f
            r0 = r301
            int r0 = r0.A01
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r306
            r2 = r305
            java.lang.Object r0 = r0.getObject(r1, r2)
            com.google.common.base.Optional r0 = (com.google.common.base.Optional) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4f
            r0 = r304
            boolean r0 = r0.isPresent()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4f
        L4d:
            r0 = r304
            return r0
        L4f:
            com.google.common.base.Absent r0 = com.google.common.base.Absent.INSTANCE
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L83.A00(com.facebook.fury.context.ReqContext):com.google.common.base.Optional");
    }
}
