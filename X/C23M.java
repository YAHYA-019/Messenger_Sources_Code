package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.23M, reason: invalid class name */
/* loaded from: 23M.class */
public final /* synthetic */ class C23M implements Runnable {
    public static final String __redex_internal_original_name = "MessengerMsysBootstrap$$ExternalSyntheticLambda3";
    public final /* synthetic */ Mailbox A00;

    @Override // java.lang.Runnable
    public final void run() {
        Mailbox mailbox = this.A00;
        0fH.A0j("MessengerMsysBootstrap", "Enable task processing for non critical tasks");
        mailbox.enableTaskProcessingForNonCriticalTasks();
    }
}
