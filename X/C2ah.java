package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.2ah, reason: invalid class name */
/* loaded from: 2ah.class */
public abstract class C2ah extends C2ai {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v4 ??, still in use, count: 5, list:
          (r303v4 ??) from 0x004e: PHI (r303v3 ??) = (r303v2 ??), (r303v4 ??) binds: [B:8:0x0016, B:23:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r303v4 ?? I:java.lang.Thread) from 0x0027: SPUT (r303v4 ?? I:java.lang.Thread) A[Catch: all -> 0x0049] X.2af._thread java.lang.Thread
          (r303v4 ?? I:java.lang.Thread) from 0x0036: INVOKE (r303v4 ?? I:java.lang.Thread), (r0v19 ?? I:java.lang.ClassLoader) VIRTUAL call: java.lang.Thread.setContextClassLoader(java.lang.ClassLoader):void A[Catch: all -> 0x0049, MD:(java.lang.ClassLoader):void (c)]
          (r303v4 ?? I:java.lang.Thread) from 0x003f: INVOKE (r303v4 ?? I:java.lang.Thread), (r0v21 ?? I:boolean) VIRTUAL call: java.lang.Thread.setDaemon(boolean):void A[Catch: all -> 0x0049, MD:(boolean):void (c)]
          (r303v4 ?? I:java.lang.Thread) from 0x0043: INVOKE (r303v4 ?? I:java.lang.Thread) VIRTUAL call: java.lang.Thread.start():void A[Catch: all -> 0x0049, MD:():void (c)]
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
    public java.lang.Thread A07() {
        /*
            r301 = this;
            r0 = r301
            r302 = r0
            r0 = r301
            X.2af r0 = (X.C2af) r0
            r302 = r0
            java.lang.Thread r0 = X.C2af._thread
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L50
            r0 = r302
            monitor-enter(r0)
            java.lang.Thread r0 = X.C2af._thread     // Catch: java.lang.Throwable -> L49
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4e
            java.lang.String r0 = "X.2af"
            r304 = r0
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L49
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r303
            X.C2af._thread = r0     // Catch: java.lang.Throwable -> L49
            r0 = r302
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L49
            r304 = r0
            r0 = r304
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L49
            r304 = r0
            r0 = r303
            r1 = r304
            r0.setContextClassLoader(r1)     // Catch: java.lang.Throwable -> L49
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r305
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L49
            r0 = r303
            r0.start()     // Catch: java.lang.Throwable -> L49
            goto L4e
        L49:
            r304 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r304
            throw r0
        L4e:
            r0 = r302
            monitor-exit(r0)
        L50:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ah.A07():java.lang.Thread");
    }

    public void A08(C44m c44m, long j) {
        if (this instanceof C2af) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        C2af.A00.A0A(c44m, j);
    }
}
