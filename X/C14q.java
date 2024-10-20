package X;

/* renamed from: X.14q, reason: invalid class name */
/* loaded from: 14q.class */
public final class C14q extends 0vF {
    public static final String __redex_internal_original_name = "MessageQueueLooperXiaomi";
    public 0XA A00;

    public String A03() {
        return "looperMi";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:37:0x00b3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public boolean A05(android.os.MessageQueue r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            android.os.Message r0 = r0.A01(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r301
            X.0XA r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.reflect.Field r0 = r0.A01
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L27
            r0 = r305
            r1 = r303
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lab
            r306 = r0
        L27:
            r0 = r304
            java.lang.reflect.Method r0 = r0.A02
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L56
            r0 = r306
            if (r0 == 0) goto L56
            r0 = r304
            java.lang.Object r0 = r0.A00     // Catch: java.lang.Throwable -> Laf
            r308 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Laf
            r1 = r0
            r2 = 0
            r3 = r303
            r1[r2] = r3     // Catch: java.lang.Throwable -> Laf
            r1 = r0
            r2 = 1
            r3 = r306
            r1[r2] = r3     // Catch: java.lang.Throwable -> Laf
            r305 = r0
            r0 = r307
            r1 = r308
            r2 = r305
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> Laf
        L56:
            r0 = r301
            r1 = r303
            r0.A02(r1)
            r0 = r304
            java.lang.reflect.Method r0 = r0.A03
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L8a
            r0 = r306
            if (r0 == 0) goto L8a
            r0 = r304
            java.lang.Object r0 = r0.A00     // Catch: java.lang.Throwable -> Lb3
            r308 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb3
            r1 = r0
            r2 = 0
            r3 = r303
            r1[r2] = r3     // Catch: java.lang.Throwable -> Lb3
            r1 = r0
            r2 = 1
            r3 = r306
            r1[r2] = r3     // Catch: java.lang.Throwable -> Lb3
            r305 = r0
            r0 = r307
            r1 = r308
            r2 = r305
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> Lb3
        L8a:
            long r0 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> Lb3
            r0 = r301
            X.0Wt r0 = r0.A04
            r305 = r0
            r0 = r305
            java.lang.reflect.Method r0 = r0.A03     // Catch: java.lang.Throwable -> Lb7
            r308 = r0
            java.lang.Object[] r0 = X.AnonymousClass001.A1Z()     // Catch: java.lang.Throwable -> Lb7
            r305 = r0
            r0 = r308
            r1 = r303
            r2 = r305
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> Lb7
        La9:
            r0 = 1
            return r0
        Lab:
            goto L27
        Laf:
            goto L56
        Lb3:
            goto L8a
        Lb7:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14q.A05(android.os.MessageQueue):boolean");
    }
}
