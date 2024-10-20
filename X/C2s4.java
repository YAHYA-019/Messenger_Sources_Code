package X;

import android.os.Looper;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: X.2s4, reason: invalid class name */
/* loaded from: 2s4.class */
public final class C2s4 {
    public long A00;
    public ListenableFuture A01;
    public final ExecutorService A02;
    public final Thread A03 = Looper.getMainLooper().getThread();

    public C2s4() {
        1Bi.A03(66310);
        this.A02 = (ExecutorService) new 1BV(16454).get();
    }

    public C1hn A00(5rG r302, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        ArrayList arrayList = new ArrayList(2);
        if (listenableFuture != null) {
            arrayList.add(listenableFuture);
        }
        if (listenableFuture2 != null) {
            arrayList.add(listenableFuture2);
        }
        return 1Kd.A04(arrayList).A00(new 5rH(r302, listenableFuture, listenableFuture2), this.A02);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture A01(final Callable callable) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            ListenableFuture listenableFuture = this.A01;
            if (listenableFuture != null && elapsedRealtime - this.A00 < 0) {
                return listenableFuture;
            }
            final ?? obj = new Object();
            if (Thread.currentThread() != this.A03) {
                try {
                    obj.set(callable.call());
                } catch (Throwable th) {
                    obj.setException(th);
                }
            } else {
                this.A02.execute(new Runnable() { // from class: X.3ug
                    public static final String __redex_internal_original_name = "AsyncMetadataHelper$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        SettableFuture settableFuture = SettableFuture.this;
                        try {
                            settableFuture.set(callable.call());
                        } catch (Throwable th2) {
                            settableFuture.setException(th2);
                        }
                    }
                });
            }
            synchronized (this) {
                this.A00 = elapsedRealtime;
                this.A01 = obj;
            }
            return obj;
        }
    }
}
