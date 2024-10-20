package X;

import com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.2tx, reason: invalid class name */
/* loaded from: 2tx.class */
public final class C2tx {
    public Exception A00;
    public final boolean A07;
    public final AnonymousClass220 A08;
    public volatile 40T A09;
    public volatile boolean A0A;
    public final C00i A02 = new 1BQ(16458);
    public final C00i A05 = new 1BQ(32862);
    public final C00i A06 = new 1BQ(32855);
    public final C00i A03 = new 1BV(67741);
    public final C00i A04 = new 1BQ(16449);
    public boolean A01 = false;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0095, code lost:
    
        if (X.0Zi.A01(r0).A3P == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2tx() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2tx.<init>():void");
    }

    public static 40T A00(C2tx c2tx) {
        40T r0;
        RuntimeException runtimeException;
        if (c2tx.A09 != null) {
            return c2tx.A09;
        }
        synchronized (c2tx) {
            while (c2tx.A09 == null && c2tx.A00 == null) {
                if (!c2tx.A01) {
                    c2tx.A01 = true;
                    ((Executor) c2tx.A04.get()).execute(new 40A(c2tx));
                }
                try {
                    c2tx.wait();
                } catch (InterruptedException e) {
                    runtimeException = AnonymousClass001.A0U(e);
                }
            }
            Exception exc = c2tx.A00;
            if (exc != null) {
                new IllegalStateException(exc);
                throw runtimeException;
            }
            r0 = c2tx.A09;
        }
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if ("MAGIC_LOGOUT_TAG".equals(r303) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.42C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.42C A01(X.AnonymousClass409 r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.common.callercontext.CallerContext r0 = r0.A06
            r303 = r0
            r0 = r301
            boolean r0 = r0.A0A
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5d
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r303
            java.lang.String r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            java.lang.String r0 = "unknown"
            r303 = r0
        L1e:
            java.lang.String r0 = "MAGIC_LOGOUT_TAG"
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5d
        L2d:
            java.lang.String r0 = "In lame duck mode"
            java.io.IOException r0 = X.AnonymousClass001.A0G(r0)
            r305 = r0
            X.7hZ r0 = new X.7hZ
            r303 = r0
            r0 = r303
            r1 = r305
            r0.<init>(r1)
        L3e:
            X.42C r0 = new X.42C
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r305
            r1 = r302
            r0.A01 = r1
            r0 = r305
            r1 = r303
            r0.A02 = r1
            r0 = r305
            r1 = r301
            r0.A00 = r1
            r0 = r305
            return r0
        L5d:
            r0 = r301
            boolean r0 = r0.A07
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Laa
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r301
            X.00i r0 = r0.A05
            r305 = r0
        L76:
            r0 = r305
            java.lang.Object r0 = r0.get()
            com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl r0 = (com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl) r0
            r1 = r302
            r2 = r306
            r0.executeAsync(r1, r2)
            X.02X r0 = com.facebook.fury.context.ReqContextTypeResolver.sProvider
            r305 = r0
            r0 = 7
            r307 = r0
            r0 = r305
            if (r0 != 0) goto L99
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
        L99:
            java.lang.String r0 = "TigonRequestEngineExecuteAsyncFuture"
            r305 = r0
            r0 = r306
            r1 = r305
            r2 = r307
            com.google.common.util.concurrent.ListenableFuture r0 = X.42B.A00(r0, r1, r2)
            r303 = r0
            goto L3e
        Laa:
            r0 = r301
            X.40T r0 = A00(r0)
            r305 = r0
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r305
            X.00i r0 = r0.A00
            r305 = r0
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2tx.A01(X.409):X.42C");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2tx] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public Object A02(AnonymousClass409 anonymousClass409) {
        C00i c00i = this.A02;
        if (c00i.get() != null) {
            ((1GU) c00i.get()).AAq();
        }
        ?? r0 = this;
        try {
            r0 = 1Yz.A00(r0.A01(anonymousClass409).A02);
            return r0;
        } catch (CancellationException e) {
            throw new IOException("Network request was canceled.", e);
        } catch (ExecutionException unused) {
            Throwable cause = r0.getCause();
            cause.getClass();
            Throwables.throwIfInstanceOf(cause, IOException.class);
            Throwables.propagate(cause);
            throw 0Q8.createAndThrow();
        }
    }

    public void A03(AnonymousClass409 anonymousClass409) {
        ((TigonHttpClientAdapterImpl) (this.A07 ? this.A05 : A00(this).A00).get()).cancel(anonymousClass409.A03);
    }

    public void enterLameDuckMode() {
        this.A0A = true;
    }

    public void exitLameDuckMode() {
        this.A0A = false;
    }
}
