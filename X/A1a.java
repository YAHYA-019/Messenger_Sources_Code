package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: A1a.class */
public final class A1a implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public A1a(Message message, C5fn c5fn, C5fm c5fm, 5gC r305, String str, String str2, int i, int i2) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A02 = c5fm;
            this.A04 = message;
            this.A01 = i;
            this.A06 = str;
            this.A03 = c5fn;
            this.A07 = str2;
            this.A05 = r305;
            return;
        }
        this.A02 = c5fm;
        this.A03 = message;
        this.A01 = i;
        this.A06 = str;
        this.A04 = c5fn;
        this.A07 = str2;
        this.A05 = r305;
    }

    public A1a(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, Number number, String str, String str2, int i) {
        this.A00 = 2;
        this.A02 = c00683ob;
        this.A03 = mailboxFutureImpl;
        this.A04 = privacyContext;
        this.A01 = i;
        this.A07 = str;
        this.A05 = number;
        this.A06 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0196, code lost:
    
        if (r0.contains("ai") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e7, code lost:
    
        if (r0.contains("ai") == false) goto L10;
     */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1a.onCompletion(java.lang.Object):void");
    }
}
