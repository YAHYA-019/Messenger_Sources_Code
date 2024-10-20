package X;

/* renamed from: X.1ml, reason: invalid class name */
/* loaded from: 1ml.class */
public final class C1ml implements 1mY {
    public final 1Br A00 = 1Bq.A00(16385);

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public com.google.common.collect.ImmutableMap get() {
        /*
            r301 = this;
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder
            r302 = r0
            r0 = r302
            r1 = 4
            r0.<init>(r1)
            r0 = r301
            X.1Br r0 = r0.A00
            r303 = r0
            r0 = r303
            X.00i r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = 36314330739908477(0x8103b100021f7d, double:3.028667213766534E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L6c
            r0 = r304
            X.2yD r0 = X.1BK.A0M(r0)
            r305 = r0
            r0 = 2342157339953536892(0x208103b100011f7c, double:4.060778828534038E-152)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = 0
            r305 = r0
            java.lang.String r0 = "/rtc_ringback"
            r303 = r0
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r0 = new com.facebook.rti.mqtt.protocol.messages.SubscribeTopic
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L77
            r0 = r310
            r1 = r303
            r2 = 0
            r0.<init>(r1, r2)
            X.1md r0 = X.C1md.A03
            r303 = r0
        L64:
            r0 = r302
            r1 = r310
            r2 = r303
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r1, r2)
        L6c:
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.build()
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r303
            return r0
        L77:
            r0 = r310
            r1 = r303
            r2 = 0
            r0.<init>(r1, r2)
            X.1md r0 = X.C1md.A02
            r303 = r0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ml.get():com.google.common.collect.ImmutableMap");
    }
}
