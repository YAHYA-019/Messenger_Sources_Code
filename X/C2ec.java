package X;

import com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemsupplier.InboxSubtabsItemSupplierImplementation;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.concurrent.Executor;

/* renamed from: X.2ec, reason: invalid class name */
/* loaded from: 2ec.class */
public final class C2ec implements Runnable {
    public static final String __redex_internal_original_name = "InboxSubtabsItemSupplierImplementation$onSubscribe$3";
    public final /* synthetic */ InboxSubtabsItemSupplierImplementation A00;

    public C2ec(InboxSubtabsItemSupplierImplementation inboxSubtabsItemSupplierImplementation) {
        this.A00 = inboxSubtabsItemSupplierImplementation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InboxSubtabsItemSupplierImplementation inboxSubtabsItemSupplierImplementation = this.A00;
        C5dk c5dk = (C5dk) inboxSubtabsItemSupplierImplementation.A0B.A00.get();
        int A00 = 2bN.A00();
        1Um AQV = c5dk.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C3at(A00, 0, new 4Zg(c5dk, AQV), c5dk, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        1X9 r0 = (1X9) inboxSubtabsItemSupplierImplementation.A0J.getAndSet(mailboxFutureImpl);
        if (r0 != null) {
            r0.cancel();
        }
        mailboxFutureImpl.addResultCallback((Executor) inboxSubtabsItemSupplierImplementation.A0D.A00.get(), new C3b7(inboxSubtabsItemSupplierImplementation, 19));
    }
}
