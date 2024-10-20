package com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent;

import X.06Z;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.2O4;
import X.7zM;
import X.7zR;
import X.7zT;
import X.9Ah;
import X.9KQ;
import X.9XU;
import X.C2kx;
import X.C96h;
import X.C9mc;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: AdvancedCryptoSharedFilesTabContentImplementation.class */
public final class AdvancedCryptoSharedFilesTabContentImplementation {
    public static final C96h A0H = C96h.A02;
    public Long A00;
    public final 06Z A01;
    public final 2O4 A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Iw A09;
    public final C2kx A0A;
    public final C9mc A0B;
    public final ThreadKey A0C;
    public final 9XU A0D;
    public final 9Ah A0E;
    public final 9KQ A0F;
    public final User A0G;

    public AdvancedCryptoSharedFilesTabContentImplementation(06Z r302, 2O4 r303, FbUserSession fbUserSession, 1Iw r305, ThreadKey threadKey, 9XU r307, 9Ah r308, User user) {
        11T.A0F(r305, 1);
        7zT.A11(2, threadKey, r307, r303, r302);
        7zR.A1P(r308, fbUserSession);
        this.A09 = r305;
        this.A0C = threadKey;
        this.A0G = user;
        this.A0D = r307;
        this.A02 = r303;
        this.A01 = r302;
        this.A0E = r308;
        this.A03 = fbUserSession;
        this.A08 = 1Bq.A00(67389);
        this.A04 = 1Bu.A00(68334);
        this.A0A = new C2kx();
        Context context = r305.A0D;
        this.A05 = 7zM.A0g(context, 68495);
        this.A06 = 1Bu.A00(68435);
        this.A0F = new 9KQ(this);
        this.A07 = 1Bu.A00(68490);
        1Bn.A0A(147570);
        this.A0B = new C9mc(context, fbUserSession, threadKey);
    }
}
