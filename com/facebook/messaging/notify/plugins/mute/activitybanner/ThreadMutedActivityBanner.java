package com.facebook.messaging.notify.plugins.mute.activitybanner;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.1HN;
import X.AHe;
import X.C15h;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadMutedActivityBanner.class */
public final class ThreadMutedActivityBanner {
    public 1HN A00;
    public 1G2 A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final ThreadKey A0E;
    public final C15h A0F;
    public final C15h A0G;

    public ThreadMutedActivityBanner(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(threadKey, 3);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A0E = threadKey;
        this.A0B = 1Bu.A01(context, 17010);
        this.A07 = 1Bq.A00(33013);
        this.A0C = 1Bq.A00(67262);
        this.A0A = 1Bu.A01(context, 17005);
        this.A0D = 1Bu.A00(82442);
        this.A05 = 1Bu.A01(context, 17002);
        this.A08 = 1Bq.A00(66536);
        this.A06 = 1Bu.A00(83036);
        this.A09 = 1Bu.A00(82121);
        this.A0F = new AHe(this, 27);
        this.A0G = new AHe(this, 28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ad, code lost:
    
        if (((X.C7G) X.1Br.A0B(r301.A0D)).A00() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.messaging.model.threadkey.ThreadKey r304, X.7OX r305, X.5Sc r306) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.plugins.mute.activitybanner.ThreadMutedActivityBanner.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.threadkey.ThreadKey, X.7OX, X.5Sc):void");
    }
}
