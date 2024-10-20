package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: I1q.class */
public final class I1q {
    public final ListenableFuture A00;
    public final boolean A01;

    public I1q(JNm jNm) {
        this.A00 = 1Kd.A0A(jNm);
        this.A01 = true;
    }

    public I1q(ListenableFuture listenableFuture, boolean z) {
        this.A00 = listenableFuture;
        this.A01 = !z;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, X.JNm] */
    public JNm A00() {
        ?? r0;
        try {
            try {
                r0 = (JNm) this.A00.get();
                return r0;
            } catch (CancellationException e) {
                0fH.A0r("ConferenceCallPromise", "getConferenceCall canceled. ", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }
}
