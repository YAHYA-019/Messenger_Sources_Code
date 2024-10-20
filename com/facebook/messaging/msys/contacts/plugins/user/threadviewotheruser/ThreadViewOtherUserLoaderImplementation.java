package com.facebook.messaging.msys.contacts.plugins.user.threadviewotheruser;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.6iB;
import X.7zM;
import X.7zO;
import X.Gs9;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ThreadViewOtherUserLoaderImplementation.class */
public final class ThreadViewOtherUserLoaderImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final 6iB A05;
    public final Gs9 A06;
    public final AtomicBoolean A07;
    public final Context A08;

    public ThreadViewOtherUserLoaderImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        1BL.A1H(context, fbUserSession, r305);
        this.A08 = context;
        this.A05 = r305;
        this.A04 = threadKey;
        this.A01 = 1Lm.A00(context, fbUserSession, 17061);
        this.A02 = 1Lm.A00(context, fbUserSession, 33124);
        this.A03 = 1Bu.A01(context, 67579);
        this.A00 = 7zM.A0Q();
        this.A07 = 7zO.A15();
        this.A06 = new Gs9(this);
    }
}
