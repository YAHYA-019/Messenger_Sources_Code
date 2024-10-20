package com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.dataload;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.6iB;
import X.7zM;
import X.7zR;
import X.A1d;
import X.BDm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: BiimThreadActionSystemDataLoader.class */
public final class BiimThreadActionSystemDataLoader {
    public BDm A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final ThreadKey A09;
    public final 6iB A0A;
    public final MailboxCallback A0B;

    public BiimThreadActionSystemDataLoader(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        7zR.A1O(fbUserSession, r305);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A0A = r305;
        this.A09 = threadKey;
        this.A01 = "";
        this.A08 = 7zM.A0O();
        this.A05 = 7zM.A0Q();
        this.A0B = A1d.A00(this, 95);
        this.A06 = 1Bq.A00(83426);
        this.A07 = 1BK.A0C();
    }
}
