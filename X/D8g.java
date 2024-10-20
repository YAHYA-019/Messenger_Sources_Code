package X;

import com.facebook.msys.mca.MailboxNullable;

/* loaded from: D8g.class */
public final class D8g implements Runnable {
    public static final String __redex_internal_original_name = "ThreadTypingIndicatorControlFragment$loadTypingIndicatorDisabledAndUpdateUI$1$onCompletion$1";
    public final /* synthetic */ B9O A00;
    public final /* synthetic */ MailboxNullable A01;

    public D8g(B9O b9o, MailboxNullable mailboxNullable) {
        this.A00 = b9o;
        this.A01 = mailboxNullable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer nullableInteger;
        B9O b9o = this.A00;
        1qX r0 = (1qX) this.A01.value;
        boolean z = true;
        if (r0 == null || (nullableInteger = r0.mResultSet.getNullableInteger(0, 68)) == null || nullableInteger.intValue() != 1) {
            z = false;
        }
        b9o.A07 = z;
        b9o.A1c();
    }
}
