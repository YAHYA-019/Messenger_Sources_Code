package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3e5, reason: invalid class name */
/* loaded from: 3e5.class */
public final class C3e5 implements ListenableFuture {
    public boolean A00;
    public final SettableFuture A01 = new Object();
    public final C2a2 A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C3e5(C2a2 c2a2) {
        this.A02 = c2a2;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!this.A01.cancel(z)) {
            return false;
        }
        this.A02.AE0(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj = this.A01.get();
        if (obj instanceof 3K8) {
            throw new CancellationException().initCause(((3K8) obj).A00);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        Object obj = this.A01.get(j, timeUnit);
        if (obj instanceof 3K8) {
            throw new CancellationException().initCause(((3K8) obj).A00);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((X.1Yz.A00(r0) instanceof X.3K8) != false) goto L15;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isCancelled() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.util.concurrent.SettableFuture r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.isCancelled()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L42
            r0 = r301
            boolean r0 = r0.isDone()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L44
            r0 = r301
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            r0 = r302
            java.lang.Object r0 = X.1Yz.A00(r0)     // Catch: java.util.concurrent.ExecutionException -> L38 java.util.concurrent.CancellationException -> L41
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof X.3K8
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L44
            goto L42
        L38:
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = 0
            return r0
        L41:
        L42:
            r0 = 1
            r304 = r0
        L44:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3e5.isCancelled():boolean");
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A01.isDone();
    }

    public String toString() {
        StringBuilder A0k;
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append(super.toString());
        A0k2.append("[status=");
        if (isDone()) {
            try {
                Object A00 = 1Yz.A00(this.A01);
                if (A00 instanceof 3K8) {
                    StringBuilder A0k3 = AnonymousClass001.A0k();
                    A0k3.append("CANCELLED, cause=[");
                    A0k3.append(((3K8) A00).A00);
                    A0k3.append(']');
                    1BK.A1R(A0k2, A0k3);
                } else {
                    StringBuilder A0k4 = AnonymousClass001.A0k();
                    A0k4.append(AnonymousClass000.A00(80));
                    A0k4.append(A00);
                    A0k4.append(']');
                    1BK.A1R(A0k2, A0k4);
                }
            } catch (CancellationException unused) {
                A0k2.append("CANCELLED");
            } catch (ExecutionException e) {
                A0k = AnonymousClass001.A0k();
                A0k.append(AnonymousClass000.A00(76));
                A0k.append(e.getCause());
                A0k.append(']');
            } catch (Throwable th) {
                A0k = AnonymousClass001.A0k();
                A0k.append(AnonymousClass000.A00(82));
                A0k.append(th.getClass());
                A0k.append(AnonymousClass000.A00(62));
            }
            A0k2.append(']');
            return 11T.A02(A0k2);
        }
        A0k = AnonymousClass001.A0k();
        A0k.append("PENDING, delegate=[");
        A0k.append(this.A01);
        A0k.append(']');
        1BK.A1R(A0k2, A0k);
        A0k2.append(']');
        return 11T.A02(A0k2);
    }
}
