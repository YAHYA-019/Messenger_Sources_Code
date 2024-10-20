package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3e7, reason: invalid class name */
/* loaded from: 3e7.class */
public final class C3e7 implements ListenableFuture, 1X9 {
    public final 1X9 A00;

    public C3e7(1X9 r302) {
        this.A00 = r302;
    }

    public 1X9 A5R(MailboxCallback mailboxCallback, Executor executor) {
        return this.A00.A5R(mailboxCallback, executor);
    }

    public 1X9 Cu4(MailboxCallback mailboxCallback) {
        return this.A00.Cu4(mailboxCallback);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        11T.A0H(runnable, executor);
        1X9 r0 = this.A00;
        synchronized (r0) {
            r0.addResultCallback(executor, new Iby(runnable, 36));
            r0.A5R(new Iby(runnable, 37), executor);
        }
    }

    public /* bridge */ /* synthetic */ MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(mailboxCallback);
    }

    public /* bridge */ /* synthetic */ MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(executor, mailboxCallback);
    }

    public void cancel() {
        this.A00.cancel();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A00.isDone();
    }

    public /* bridge */ /* synthetic */ MailboxObservable removeAllResultCallbacks() {
        return this.A00.removeAllResultCallbacks();
    }

    public /* bridge */ /* synthetic */ MailboxObservable removeResultCallback(MailboxCallback mailboxCallback) {
        return this.A00.removeResultCallback(mailboxCallback);
    }
}
