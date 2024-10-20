package X;

/* loaded from: AFi.class */
public final class AFi implements Runnable {
    public static final String __redex_internal_original_name = "MailboxSDKDeleteMessageController$onDeleteCompletion$1";
    public final /* synthetic */ AZm A00;
    public final /* synthetic */ boolean A01;

    public AFi(AZm aZm, boolean z) {
        this.A01 = z;
        this.A00 = aZm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        AZm aZm = this.A00;
        if (z) {
            aZm.Bt6();
        } else {
            aZm.Bt5(new Exception("Unsend with thread identifier via mailbox sdk was not successful."));
        }
    }
}
