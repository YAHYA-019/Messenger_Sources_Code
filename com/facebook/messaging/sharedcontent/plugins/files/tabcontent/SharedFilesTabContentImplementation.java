package com.facebook.messaging.sharedcontent.plugins.files.tabcontent;

import X.06Z;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.2O4;
import X.7zM;
import X.7zN;
import X.7zR;
import X.7zT;
import X.9Ah;
import X.9KT;
import X.9XU;
import X.C2kx;
import X.C96h;
import X.ExL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: SharedFilesTabContentImplementation.class */
public final class SharedFilesTabContentImplementation {
    public static final C96h A0G = C96h.A05;
    public final 06Z A00;
    public final 2O4 A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Iw A08;
    public final C2kx A09;
    public final ExL A0A;
    public final ThreadKey A0B;
    public final 9XU A0C;
    public final 9Ah A0D;
    public final 9KT A0E;
    public final User A0F;

    public SharedFilesTabContentImplementation(06Z r302, 2O4 r303, FbUserSession fbUserSession, 1Iw r305, ThreadKey threadKey, 9XU r307, 9Ah r308, User user) {
        11T.A0F(r305, 1);
        7zT.A11(2, threadKey, r307, r303, r302);
        7zR.A1P(r308, fbUserSession);
        this.A08 = r305;
        this.A0B = threadKey;
        this.A0F = user;
        this.A0C = r307;
        this.A01 = r303;
        this.A00 = r302;
        this.A0D = r308;
        this.A02 = fbUserSession;
        this.A0E = new 9KT(this);
        this.A09 = new C2kx();
        this.A07 = 1Bu.A00(147745);
        Context context = r305.A0D;
        this.A06 = 7zM.A0g(context, 68495);
        this.A04 = 1Bq.A00(82525);
        this.A05 = 1HG.A00(context, 68492);
        this.A03 = 1Bu.A00(68334);
        1Bn.A0A(147573);
        this.A0A = new ExL(context, fbUserSession, threadKey, user, 7zN.A0e("FILE"));
    }
}
