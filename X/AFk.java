package X;

import com.facebook.msys.mca.MailboxNullable;

/* loaded from: AFk.class */
public final class AFk implements Runnable {
    public static final String __redex_internal_original_name = "TamDeleteMessageController$localDeleteMessage$1$1";
    public final /* synthetic */ MailboxNullable A00;
    public final /* synthetic */ AZm A01;

    public AFk(MailboxNullable mailboxNullable, AZm aZm) {
        this.A00 = mailboxNullable;
        this.A01 = aZm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A00.value;
        AZm aZm = this.A01;
        if (obj != null) {
            aZm.Bt6();
        } else {
            aZm.Bt5(new Exception("Deletion via mailbox was not successful"));
        }
    }
}
