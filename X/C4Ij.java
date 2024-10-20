package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.4Ij, reason: invalid class name */
/* loaded from: 4Ij.class */
public final class C4Ij implements Executor {
    public Runnable A00;
    public final Executor A03;
    public final ArrayDeque A02 = new ArrayDeque();
    public final Object A01 = new Object();

    public C4Ij(Executor executor) {
        this.A03 = executor;
    }

    public void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new Runnable(this, runnable) { // from class: X.4K8
                public static final String __redex_internal_original_name = "SerialExecutorImpl$Task";
                public final C4Ij A00;
                public final Runnable A01;

                {
                    this.A00 = this;
                    this.A01 = runnable;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x0039
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                    	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                    */
                @Override // java.lang.Runnable
                public void run() {
                    /*
                        r301 = this;
                        r0 = r301
                        java.lang.Runnable r0 = r0.A01     // Catch: java.lang.Throwable -> L23
                        r302 = r0
                        r0 = r302
                        r0.run()     // Catch: java.lang.Throwable -> L23
                        r0 = r301
                        X.4Ij r0 = r0.A00
                        r303 = r0
                        r0 = r303
                        java.lang.Object r0 = r0.A01
                        r302 = r0
                        r0 = r302
                        monitor-enter(r0)
                        r0 = r303
                        r0.A00()     // Catch: java.lang.Throwable -> L1e
                        r0 = r302
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
                        return
                    L1e:
                        r304 = move-exception
                        r0 = r302
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
                        r0 = r304
                        throw r0
                    L23:
                        r304 = move-exception
                        r0 = r301
                        X.4Ij r0 = r0.A00
                        r303 = r0
                        r0 = r303
                        java.lang.Object r0 = r0.A01
                        r302 = r0
                        r0 = r302
                        monitor-enter(r0)
                        r0 = r303
                        r0.A00()     // Catch: java.lang.Throwable -> L39
                    L34:
                        r0 = r302
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                        goto L3d
                    L39:
                        r304 = move-exception
                        goto L34
                    L3d:
                        r0 = r304
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4K8.run():void");
                }
            });
            if (this.A00 == null) {
                A00();
            }
        }
    }
}
