package com.facebook.msys.mca;

import X.1XG;
import X.C1jj;
import java.util.concurrent.Executor;

/* loaded from: MailboxObservableImpl.class */
public abstract class MailboxObservableImpl implements MailboxObservable {
    public Object mResult;
    public boolean mSetResult;
    public final 1XG resultCallbacks;

    public MailboxObservableImpl(1XG r302) {
        this.resultCallbacks = r302;
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        synchronized (this) {
            if (!isDisabled() && mailboxCallback != null) {
                1XG r0 = this.resultCallbacks;
                boolean z = this.mSetResult;
                r0.A02(mailboxCallback, new C1jj(this), this.mResult, (Executor) null, z);
            }
        }
        return this;
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        synchronized (this) {
            if (!isDisabled()) {
                1XG r0 = this.resultCallbacks;
                mailboxCallback.getClass();
                executor.getClass();
                boolean z = this.mSetResult;
                r0.A02(mailboxCallback, new C1jj(this), this.mResult, executor, z);
            }
        }
        return this;
    }

    public void beforeSetResult() {
    }

    public abstract boolean isDisabled();

    public void onSetResult() {
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public final MailboxObservable removeAllResultCallbacks() {
        synchronized (this) {
            this.resultCallbacks.A01();
        }
        return this;
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public final MailboxObservable removeResultCallback(MailboxCallback mailboxCallback) {
        synchronized (this) {
            1XG r0 = this.resultCallbacks;
            synchronized (r0) {
                r0.A00.remove(mailboxCallback);
            }
        }
        return this;
    }

    public MailboxObservable setResult(Object obj) {
        synchronized (this) {
            beforeSetResult();
            this.mResult = obj;
            this.mSetResult = true;
            onSetResult();
            this.resultCallbacks.A03(new C1jj(this), this.mResult);
        }
        return this;
    }
}
