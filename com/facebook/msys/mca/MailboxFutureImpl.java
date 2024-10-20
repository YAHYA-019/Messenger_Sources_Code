package com.facebook.msys.mca;

import X.0fH;
import X.1Um;
import X.1X9;
import X.1XF;
import X.1XG;
import X.1xE;
import X.AnonymousClass001;
import X.C3b9;
import android.os.ConditionVariable;
import android.os.Looper;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: MailboxFutureImpl.class */
public final class MailboxFutureImpl extends MailboxObservableImpl implements 1X9 {
    public static final Thread UI_THREAD = Looper.getMainLooper().getThread();
    public boolean A00;
    public final 1XG A01;
    public final ConditionVariable mCompletionCV;
    public final 1Um mMailboxApiHandleProvider;
    public String mNotificationName;
    public NotificationScope mNotificationScope;

    public MailboxFutureImpl(1Um r302) {
        super(new 1XG(r302, true));
        this.A01 = new 1XG(r302, true);
        this.mCompletionCV = new ConditionVariable();
        this.mMailboxApiHandleProvider = r302;
    }

    private void cancelNotificationCallback() {
        synchronized (this) {
            String str = this.mNotificationName;
            if (str != null) {
                NotificationScope notificationScope = this.mNotificationScope;
                if (notificationScope != null) {
                    this.mMailboxApiHandleProvider.AED(notificationScope, str);
                }
            }
        }
    }

    public MailboxFutureImpl A00(Executor executor) {
        IllegalStateException A0N;
        synchronized (this) {
            1XF r0 = this.resultCallbacks;
            boolean z = this.A00;
            synchronized (r0) {
                if (r0.A03) {
                    A0N = AnonymousClass001.A0N("Cannot set multiple executors");
                } else if (r0.A02) {
                    A0N = AnonymousClass001.A0N("Executor can only be set before setting a callback");
                } else {
                    r0.A03 = true;
                    if (!z) {
                        executor.getClass();
                        r0.A01 = executor;
                    }
                }
                throw A0N;
            }
        }
        return this;
    }

    public final 1X9 A5R(MailboxCallback mailboxCallback, Executor executor) {
        synchronized (this) {
            this.A01.A02(mailboxCallback, new C3b9(this), (Object) null, executor, isCancelled());
        }
        return this;
    }

    public 1X9 Cu4(MailboxCallback mailboxCallback) {
        synchronized (this) {
            1XF r0 = this.resultCallbacks;
            boolean z = this.A00;
            1xE r02 = new 1xE(this);
            boolean z2 = this.mSetResult;
            Object obj = this.mResult;
            synchronized (r0) {
                if (r0.A02) {
                    throw AnonymousClass001.A0N("Cannot set multiple callbacks");
                }
                r0.A02 = true;
                if (!z) {
                    mailboxCallback.getClass();
                    r0.A00 = mailboxCallback;
                    if (!r02.A00.isDisabled()) {
                        r0.A02(r0.A00, r02, obj, r0.A01, z2);
                    }
                }
            }
        }
        return this;
    }

    @Override // com.facebook.msys.mca.MailboxObservableImpl
    public void beforeSetResult() {
        synchronized (this) {
            if (this.mSetResult) {
                throw AnonymousClass001.A0N("Cannot set multiple results");
            }
        }
    }

    public final void cancel() {
        cancel(true);
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (!isDone()) {
                z2 = true;
            }
            if (!this.A00) {
                this.A00 = true;
                this.resultCallbacks.A01();
                cancelNotificationCallback(z);
                if (z2) {
                    this.A01.A03(new C3b9(this), (Object) null);
                }
            }
        }
        return z2;
    }

    public void cancelNotificationCallback(boolean z) {
        cancelNotificationCallback();
        this.mCompletionCV.open();
    }

    public final Object get() {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new IllegalStateException(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        Throwable th;
        Object obj;
        synchronized (this) {
            if (this.mSetResult) {
                return this.mResult;
            }
            if (this.A00) {
                throw new CancellationException();
            }
            getResultBlocking(j, timeUnit);
            synchronized (this) {
                if (!this.mSetResult) {
                    if (this.A00) {
                        new CancellationException();
                    } else {
                        new TimeoutException();
                    }
                    throw th;
                }
                obj = this.mResult;
            }
            return obj;
        }
    }

    public void getResultBlocking(long j, TimeUnit timeUnit) {
        if (UI_THREAD.equals(Thread.currentThread())) {
            0fH.A0o("MailboxFutureImpl", "Do not block on Mailbox API calls from the UI thread because it will result in hangs in the UI.");
        }
        if (Execution.getExecutionContext() != 0) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
        this.mCompletionCV.block(TimeUnit.MILLISECONDS.convert(j, timeUnit));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r301.mSetResult != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isCancelled() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> L1e
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r301
            boolean r0 = r0.mSetResult     // Catch: java.lang.Throwable -> L1e
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1a
        L16:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L1a:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1e:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isCancelled():boolean");
    }

    @Override // com.facebook.msys.mca.MailboxObservableImpl
    public final boolean isDisabled() {
        boolean z;
        synchronized (this) {
            z = this.A00;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (isCancelled() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isDone() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.mSetResult     // Catch: java.lang.Throwable -> L1e
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L18
            r0 = r301
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Throwable -> L1e
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            r302 = r0
        L1a:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1e:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isDone():boolean");
    }

    @Override // com.facebook.msys.mca.MailboxObservableImpl
    public void onSetResult() {
        synchronized (this) {
            this.A01.A01();
            this.mCompletionCV.open();
        }
    }

    public MailboxFutureImpl setNotification(String str, NotificationScope notificationScope) {
        synchronized (this) {
            if (this.mNotificationName != null || this.mNotificationScope != null) {
                throw AnonymousClass001.A0N("Cannot set multiple notifications");
            }
            str.getClass();
            this.mNotificationName = str;
            this.mNotificationScope = notificationScope;
            if (this.A00) {
                cancelNotificationCallback();
            }
        }
        return this;
    }
}
