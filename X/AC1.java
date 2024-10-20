package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: AC1.class */
public final class AC1 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public AC1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A06 = obj6;
        this.A05 = obj5;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                7XU r0 = (7XU) this.A04;
                Context context = ((1Iw) this.A01).A0D;
                User user = (User) this.A05;
                7XK.A0M(context, (06Z) this.A03, (ThreadKey) this.A06, r0, user);
                return;
            case 1:
                C68t c68t = (C68t) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A04;
                C68t.A07((Context) this.A02, (Uri) this.A03, fbUserSession, c68t, (Message) this.A05, (C5id) this.A06);
                return;
            case 2:
                C68t c68t2 = (C68t) this.A01;
                FbUserSession fbUserSession2 = (FbUserSession) this.A04;
                C68t.A06((Context) this.A02, (Uri) this.A03, fbUserSession2, c68t2, (Message) this.A05, (C5id) this.A06);
                return;
            case 3:
                C68t c68t3 = (C68t) this.A01;
                FbUserSession fbUserSession3 = (FbUserSession) this.A04;
                C68t.A05((Context) this.A02, (Uri) this.A03, fbUserSession3, c68t3, (Message) this.A05, (C5id) this.A06);
                return;
            default:
                ((7OX) this.A06).BNt();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v211, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC1.onSuccess(java.lang.Object):void");
    }
}
