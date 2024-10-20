package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A4a.class */
public final class A4a implements 7H9 {
    public final ThreadKey A00;
    public final FbUserSession A01;

    public A4a(FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A00 = threadKey;
        this.A01 = fbUserSession;
    }

    public void BLW(Context context, C5vw c5vw) {
        11T.A0H(context, c5vw);
        if (c5vw instanceof 8NX) {
            long j = ((8NX) c5vw).A00;
            if (j != -1) {
                ((1xC) 1Lm.A05(context, this.A01, 33148)).A00(A1f.A00(context, this, 53), (int) j);
            }
        }
    }
}
