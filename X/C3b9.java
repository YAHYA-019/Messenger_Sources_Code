package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.3b9, reason: invalid class name */
/* loaded from: 3b9.class */
public final /* synthetic */ class C3b9 implements C1jl {
    public final /* synthetic */ MailboxFutureImpl A00;

    public /* synthetic */ C3b9(MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = mailboxFutureImpl;
    }

    @Override // X.C1jl
    public final boolean D4A() {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        Thread thread = MailboxFutureImpl.UI_THREAD;
        return mailboxFutureImpl.mSetResult;
    }
}
