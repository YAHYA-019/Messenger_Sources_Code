package X;

/* renamed from: X.0i5, reason: invalid class name */
/* loaded from: 0i5.class */
public final class C0i5 extends C00q implements C00m {
    public final /* synthetic */ 1AO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0i5(1AO r302) {
        super(0);
        this.this$0 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v4 ??, still in use, count: 2, list:
          (r305v4 ??) from 0x003c: PHI (r305v3 ??) = (r305v2 ??), (r305v4 ??) binds: [B:8:0x0029, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r305v4 ?? I:X.0JJ) from 0x0039: SPUT (r305v4 ?? I:X.0JJ) A[Catch: all -> 0x0042] X.0JJ.A03 X.0JJ
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r301 = this;
            r0 = r301
            X.1AO r0 = r0.this$0
            X.0TL r0 = (X.0TL) r0
            r302 = r0
            X.0hW r0 = X.0hW.A00()
            r303 = r0
            r0 = r302
            X.0EW r0 = r0.A00
            r304 = r0
            X.0JJ r0 = X.0JJ.A03
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L48
            java.lang.Class<X.0JJ> r0 = X.0JJ.class
            r306 = r0
            r0 = r306
            monitor-enter(r0)
            X.0JJ r0 = X.0JJ.A03     // Catch: java.lang.Throwable -> L42
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3c
            X.0JJ r0 = new X.0JJ     // Catch: java.lang.Throwable -> L42
            r305 = r0
            r0 = r305
            r1 = r302
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L42
            r0 = r305
            X.0JJ.A03 = r0     // Catch: java.lang.Throwable -> L42
        L3c:
            r0 = r306
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L48
        L42:
            r303 = move-exception
            r0 = r306
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r0 = r303
            throw r0
        L48:
            r0 = r303
            int r0 = r0.A00
            r307 = r0
            int r0 = android.os.Process.myUid()
            r308 = r0
            r0 = r308
            r1 = r307
            if (r0 != r1) goto Lab
            r0 = r305
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            r309 = r0
            r0 = r309
            java.lang.Object r0 = r0.get()
            X.0JK r0 = (X.0JK) r0
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L9a
            r0 = r305
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.getAndIncrement()
            r311 = r0
            r0 = r305
            android.content.Context r0 = r0.A00
            r1 = r307
            r2 = 0
            X.0EY r0 = X.0EY.A00(r0, r1, r2)
            r303 = r0
            X.0JK r0 = new X.0JK
            r310 = r0
            r0 = r310
            r1 = r303
            r2 = r311
            r0.<init>(r1, r2)
            r0 = r309
            r1 = r310
            r0.set(r1)
        L9a:
            r0 = r310
            X.0EY r0 = r0.A00
            r303 = r0
            r0 = r302
            r1 = 0
            r2 = r303
            r3 = r304
            X.0EW.A01(r0, r1, r2, r3)
            X.04S r0 = X.04S.A00
            return r0
        Lab:
            r0 = r305
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.getAndIncrement()
            r311 = r0
            r0 = r305
            android.content.Context r0 = r0.A00
            r1 = r307
            r2 = 0
            X.0EY r0 = X.0EY.A00(r0, r1, r2)
            r303 = r0
            X.0JK r0 = new X.0JK
            r310 = r0
            r0 = r310
            r1 = r303
            r2 = r311
            r0.<init>(r1, r2)
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0i5.invoke():java.lang.Object");
    }
}
