package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D4b.class */
public final class D4b implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ D0K A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public D4b(Context context, FbUserSession fbUserSession, ThreadKey threadKey, D0K d0k, int i, boolean z, boolean z2) {
        this.A04 = d0k;
        this.A02 = fbUserSession;
        this.A00 = i;
        this.A03 = threadKey;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = context;
    }

    public void onFailure(Throwable th) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c0, code lost:
    
        if (r0 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4b.onSuccess(java.lang.Object):void");
    }
}
