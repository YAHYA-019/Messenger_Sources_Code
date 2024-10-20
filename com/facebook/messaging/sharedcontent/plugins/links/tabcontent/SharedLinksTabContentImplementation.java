package com.facebook.messaging.sharedcontent.plugins.links.tabcontent;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.2O4;
import X.7zM;
import X.7zT;
import X.9Ah;
import X.9XU;
import X.9xW;
import X.C2kx;
import X.C96h;
import X.ExL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: SharedLinksTabContentImplementation.class */
public final class SharedLinksTabContentImplementation {
    public static final C96h A0E = C96h.A06;
    public final 2O4 A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Iw A06;
    public final C2kx A07;
    public final ExL A08;
    public final ThreadKey A09;
    public final 9XU A0A;
    public final 9Ah A0B;
    public final 9xW A0C;
    public final User A0D;

    public SharedLinksTabContentImplementation(2O4 r302, FbUserSession fbUserSession, 1Iw r304, ThreadKey threadKey, 9XU r306, 9Ah r307, User user) {
        11T.A0F(r304, 1);
        7zT.A11(2, threadKey, r306, r302, r307);
        11T.A0F(fbUserSession, 7);
        this.A06 = r304;
        this.A09 = threadKey;
        this.A0D = user;
        this.A0A = r306;
        this.A00 = r302;
        this.A0B = r307;
        this.A01 = fbUserSession;
        this.A0C = new 9xW(this);
        this.A07 = new C2kx();
        this.A05 = 1Bu.A00(68491);
        Context context = r304.A0D;
        this.A04 = 7zM.A0g(context, 68495);
        this.A03 = 1HG.A00(context, 68492);
        this.A02 = 1Bu.A00(68334);
        1Bn.A0A(147573);
        this.A08 = new ExL(context, fbUserSession, threadKey, user, 1BK.A0b());
    }
}
