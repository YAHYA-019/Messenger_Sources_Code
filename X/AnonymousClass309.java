package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.309, reason: invalid class name */
/* loaded from: 309.class */
public final /* synthetic */ class AnonymousClass309 implements Runnable {
    public static final String __redex_internal_original_name = "MessengerMsysBootstrap$$ExternalSyntheticLambda4";
    public final /* synthetic */ Mailbox A00;

    @Override // java.lang.Runnable
    public final void run() {
        Mailbox mailbox = this.A00;
        0fH.A0j("MessengerMsysBootstrap", "Call scheduleTaskProcessingIfNeeded at idle");
        Execution.executeAsync(new 4bR(mailbox), mailbox.getAccountSession(), 1);
    }
}
