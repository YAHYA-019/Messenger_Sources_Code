package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.1ym, reason: invalid class name */
/* loaded from: 1ym.class */
public final class C1ym extends C1iw {
    public static final String __redex_internal_original_name = "Mailbox$6";
    public final /* synthetic */ Mailbox A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ym(Mailbox mailbox) {
        super("setMailboxStateActive");
        this.A00 = mailbox;
    }

    @Override // java.lang.Runnable
    public void run() {
        C00j.A05("Mailbox.setStateActive.run", -1346576094);
        try {
            this.A00.setStateNative(1);
            C00j.A01(-801468984);
        } catch (Throwable th) {
            C00j.A01(-1490602993);
            throw th;
        }
    }
}
