package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Czi.class */
public final class Czi implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Czi(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public Czi(BDK bdk, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Number number, int i) {
        this.A00 = i;
        this.A01 = bdk;
        if (1 - i != 0) {
            this.A03 = mailboxFutureImpl;
            this.A04 = privacyContext;
            this.A02 = number;
        } else {
            this.A02 = mailboxFutureImpl;
            this.A03 = privacyContext;
            this.A04 = number;
        }
    }

    public Czi(BDX bdx, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, Number number, int i) {
        this.A00 = i;
        this.A01 = bdx;
        this.A02 = mailboxFutureImpl;
        this.A03 = number;
        this.A04 = privacyContext;
    }

    public Czi(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, Number number, int i) {
        this.A00 = i;
        this.A01 = c00683ob;
        if (14 - i != 0) {
            this.A04 = mailboxFutureImpl;
            this.A02 = privacyContext;
            this.A03 = number;
        } else {
            this.A03 = mailboxFutureImpl;
            this.A04 = privacyContext;
            this.A02 = number;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0495  */
    /* JADX WARN: Type inference failed for: r0v400, types: [java.lang.Object, X.Bz0] */
    /* JADX WARN: Type inference failed for: r0v477, types: [java.util.List] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czi.onCompletion(java.lang.Object):void");
    }
}
