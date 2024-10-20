package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.4zB, reason: invalid class name */
/* loaded from: 4zB.class */
public final class C4zB implements Runnable {
    public static final String __redex_internal_original_name = "ProModeMessagingToolsStateManager$fetchMessagingSettingsValueAndUpdateListeners$fetchRunnable$1";
    public final /* synthetic */ 1xP A00;

    public C4zB(1xP r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1xP r0 = this.A00;
        MailboxFeature mailboxFeature = (MailboxFeature) r0.A06.getValue();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new A1c(mailboxFeature, mailboxFutureImpl, 20))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new A1b(r0, 26));
    }
}
