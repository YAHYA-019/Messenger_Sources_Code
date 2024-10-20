package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: N8c.class */
public final class N8c implements 1K9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public N8c(FbUserSession fbUserSession, 6Cd r303, Message message, Integer num, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = r303;
        this.A07 = str;
        if (i3 != 0) {
            this.A05 = message;
            this.A04 = fbUserSession;
            this.A06 = num;
        } else {
            this.A04 = fbUserSession;
            this.A06 = num;
            this.A05 = message;
        }
        this.A01 = i;
        this.A02 = i2;
    }

    public void onFailure(Throwable th) {
        ScheduledExecutorService scheduledExecutorService;
        Runnable n8j;
        int i = this.A00;
        int i2 = this.A01;
        if (i != 0) {
            if (i2 >= 3) {
                return;
            }
            scheduledExecutorService = ((6Cd) this.A03).A05;
            n8j = new N8k(this);
        } else {
            if (i2 >= 3) {
                return;
            }
            scheduledExecutorService = ((6Cd) this.A03).A05;
            n8j = new N8j(this);
        }
        scheduledExecutorService.schedule(n8j, this.A02, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8c.onSuccess(java.lang.Object):void");
    }
}
