package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: Czh.class */
public final class Czh implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Czh(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = j;
        this.A04 = obj;
        this.A03 = obj3;
    }

    public Czh(22I r302, MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, int i, long j) {
        this.A00 = i;
        this.A02 = r302;
        this.A03 = mailboxFutureImpl;
        this.A04 = privacyContext;
        this.A01 = j;
    }

    public Czh(Activity activity, Context context, CHA cha, int i, long j) {
        this.A00 = i;
        this.A04 = cha;
        switch (i) {
            case 25:
            case 26:
                this.A01 = j;
                this.A02 = activity;
                this.A03 = context;
                break;
            default:
                this.A03 = context;
                this.A02 = activity;
                this.A01 = j;
                break;
        }
    }

    public Czh(MailboxFutureImpl mailboxFutureImpl, 5Xd r303, Number number, int i, long j) {
        this.A00 = i;
        this.A02 = r303;
        this.A04 = mailboxFutureImpl;
        this.A01 = j;
        this.A03 = number;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czh.onCompletion(java.lang.Object):void");
    }
}
