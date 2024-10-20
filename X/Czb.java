package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Czb.class */
public final class Czb implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public Czb(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r303;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A03 = number;
        this.A05 = str;
    }

    public Czb(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A05 = str;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x010e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9 A[SYNTHETIC] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czb.onCompletion(java.lang.Object):void");
    }
}
