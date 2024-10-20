package X;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: J7a.class */
public final class J7a extends FutureTask {
    public final ArrayList A00;
    public final UUID A01;
    public final String A02;
    public final /* synthetic */ I5y A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7a(I5y i5y, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = i5y;
        this.A00 = AnonymousClass001.A0s();
        0RZ.A03(uuid, 0Pz.A0W("SessionId is null! Attempting to schedule task: ", str));
        this.A01 = uuid;
        0RZ.A03(str, "OpticFutureTask cannot have a null name.");
        this.A02 = str;
    }

    private void A00(boolean z) {
        synchronized (this) {
            if (z) {
                0Z9.A01(this.A02, -1341607321);
            } else {
                0Z9.A00(1731813202);
            }
        }
    }

    public void A01(final Ht4 ht4) {
        I5y i5y;
        UUID uuid;
        Runnable runnable;
        synchronized (this) {
            if (isDone()) {
                try {
                    final Object obj = get();
                    final boolean z = true;
                    final Exception exc = null;
                    this.A03.A05(new Runnable() { // from class: X.J27
                        public static final String __redex_internal_original_name = "ThreadManager$OpticFutureTask$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z2 = z;
                            Ht4 ht42 = ht4;
                            Object obj2 = obj;
                            Exception exc2 = exc;
                            if (z2) {
                                ht42.A04(obj2);
                            } else if (exc2 instanceof CancellationException) {
                                ht42.A05((CancellationException) exc2);
                            } else {
                                exc2.getClass();
                                ht42.A03(exc2);
                            }
                        }
                    }, this.A01);
                } catch (InterruptedException e) {
                    e = e;
                    i5y = this.A03;
                    uuid = this.A01;
                    final Exception exc2 = e;
                    final Object obj2 = null;
                    final boolean z2 = false;
                    new Runnable() { // from class: X.J27
                        public static final String __redex_internal_original_name = "ThreadManager$OpticFutureTask$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z22 = z2;
                            Ht4 ht42 = ht4;
                            Object obj22 = obj2;
                            Exception exc22 = exc2;
                            if (z22) {
                                ht42.A04(obj22);
                            } else if (exc22 instanceof CancellationException) {
                                ht42.A05((CancellationException) exc22);
                            } else {
                                exc22.getClass();
                                ht42.A03(exc22);
                            }
                        }
                    };
                    i5y.A05(runnable, uuid);
                } catch (CancellationException e2) {
                    i5y = this.A03;
                    uuid = this.A01;
                    final Object obj3 = null;
                    final boolean z3 = false;
                    new Runnable() { // from class: X.J27
                        public static final String __redex_internal_original_name = "ThreadManager$OpticFutureTask$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z22 = z3;
                            Ht4 ht42 = ht4;
                            Object obj22 = obj3;
                            Exception exc22 = e2;
                            if (z22) {
                                ht42.A04(obj22);
                            } else if (exc22 instanceof CancellationException) {
                                ht42.A05((CancellationException) exc22);
                            } else {
                                exc22.getClass();
                                ht42.A03(exc22);
                            }
                        }
                    };
                    i5y.A05(runnable, uuid);
                } catch (ExecutionException e3) {
                    e = e3;
                    i5y = this.A03;
                    uuid = this.A01;
                    final Exception exc22 = e;
                    final Object obj22 = null;
                    final boolean z22 = false;
                    new Runnable() { // from class: X.J27
                        public static final String __redex_internal_original_name = "ThreadManager$OpticFutureTask$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z222 = z22;
                            Ht4 ht42 = ht4;
                            Object obj222 = obj22;
                            Exception exc222 = exc22;
                            if (z222) {
                                ht42.A04(obj222);
                            } else if (exc222 instanceof CancellationException) {
                                ht42.A05((CancellationException) exc222);
                            } else {
                                exc222.getClass();
                                ht42.A03(exc222);
                            }
                        }
                    };
                    i5y.A05(runnable, uuid);
                }
            } else {
                this.A00.add(ht4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000d, B:6:0x0012, B:9:0x0017, B:10:0x001c, B:11:0x0022, B:14:0x0030, B:17:0x003e, B:18:0x0044, B:19:0x004a, B:21:0x0053, B:23:0x005b, B:31:0x006a, B:34:0x0075, B:35:0x007a, B:36:0x007f, B:37:0x0084, B:39:0x008a, B:40:0x008f, B:44:0x00a4, B:45:0x00ac, B:46:0x00b2, B:49:0x00c0, B:52:0x00d0, B:53:0x00d6, B:54:0x00dc, B:56:0x00e7, B:59:0x0114, B:62:0x00f5, B:63:0x00fb, B:64:0x0101, B:66:0x010c), top: B:3:0x0008, inners: #3, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000d, B:6:0x0012, B:9:0x0017, B:10:0x001c, B:11:0x0022, B:14:0x0030, B:17:0x003e, B:18:0x0044, B:19:0x004a, B:21:0x0053, B:23:0x005b, B:31:0x006a, B:34:0x0075, B:35:0x007a, B:36:0x007f, B:37:0x0084, B:39:0x008a, B:40:0x008f, B:44:0x00a4, B:45:0x00ac, B:46:0x00b2, B:49:0x00c0, B:52:0x00d0, B:53:0x00d6, B:54:0x00dc, B:56:0x00e7, B:59:0x0114, B:62:0x00f5, B:63:0x00fb, B:64:0x0101, B:66:0x010c), top: B:3:0x0008, inners: #3, #3 }] */
    @Override // java.util.concurrent.FutureTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void done() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7a.done():void");
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        UUID uuid = I5y.A06;
        A00(true);
        super.run();
    }

    @Override // java.util.concurrent.FutureTask
    public boolean runAndReset() {
        UUID uuid = I5y.A06;
        A00(true);
        return super.runAndReset();
    }
}
