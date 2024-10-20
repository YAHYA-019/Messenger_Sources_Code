package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.1y0, reason: invalid class name */
/* loaded from: 1y0.class */
public final class C1y0 extends C1iw {
    public static final String __redex_internal_original_name = "MailboxDirectProvider$2";
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ C1xx A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1y0(MailboxCallback mailboxCallback, C1xx c1xx) {
        super("MailboxProvider");
        this.A01 = c1xx;
        this.A00 = mailboxCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.onCompletion(this.A01.A00);
    }
}
