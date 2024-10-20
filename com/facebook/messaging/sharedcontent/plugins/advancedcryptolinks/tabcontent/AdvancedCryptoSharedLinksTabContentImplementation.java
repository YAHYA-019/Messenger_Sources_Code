package com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.1Kd;
import X.2O4;
import X.4YU;
import X.5P7;
import X.7zM;
import X.7zT;
import X.9Ah;
import X.9IC;
import X.9XU;
import X.9xV;
import X.A1d;
import X.AC8;
import X.AQV;
import X.AQb;
import X.AV3;
import X.AV8;
import X.C2kx;
import X.C96h;
import X.C9mc;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;

/* loaded from: AdvancedCryptoSharedLinksTabContentImplementation.class */
public final class AdvancedCryptoSharedLinksTabContentImplementation {
    public static final C96h A0L = C96h.A03;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final 2O4 A06;
    public final FbUserSession A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Iw A0D;
    public final C2kx A0E;
    public final C9mc A0F;
    public final ThreadKey A0G;
    public final 9XU A0H;
    public final 9Ah A0I;
    public final 9xV A0J;
    public final User A0K;

    public AdvancedCryptoSharedLinksTabContentImplementation(2O4 r302, FbUserSession fbUserSession, 1Iw r304, ThreadKey threadKey, 9XU r306, 9Ah r307, User user) {
        11T.A0F(r304, 1);
        7zT.A11(2, threadKey, r306, r302, r307);
        11T.A0F(fbUserSession, 7);
        this.A0D = r304;
        this.A0G = threadKey;
        this.A0K = user;
        this.A0H = r306;
        this.A06 = r302;
        this.A0I = r307;
        this.A07 = fbUserSession;
        this.A0J = new 9xV(this);
        this.A0E = new C2kx();
        this.A08 = 1Bu.A00(68334);
        this.A0B = 1Bu.A00(68491);
        this.A0C = 1Bq.A00(67389);
        Context context = r304.A0D;
        this.A0A = 7zM.A0g(context, 68495);
        this.A09 = 1HG.A00(context, 68492);
        1Bn.A0A(147570);
        this.A0F = new C9mc(context, fbUserSession, threadKey);
    }

    public static final void A00(AdvancedCryptoSharedLinksTabContentImplementation advancedCryptoSharedLinksTabContentImplementation) {
        if (advancedCryptoSharedLinksTabContentImplementation.A00) {
            A01(advancedCryptoSharedLinksTabContentImplementation);
            return;
        }
        advancedCryptoSharedLinksTabContentImplementation.A0I.A07(A0L, 0S2.A0C);
        C9mc c9mc = advancedCryptoSharedLinksTabContentImplementation.A0F;
        AV3 A00 = AV3.A00(advancedCryptoSharedLinksTabContentImplementation, 8);
        c9mc.A08(1BK.A0d(), null, AQV.A00(advancedCryptoSharedLinksTabContentImplementation, 42), A00, 9, 10, 2);
    }

    public static final void A01(AdvancedCryptoSharedLinksTabContentImplementation advancedCryptoSharedLinksTabContentImplementation) {
        if (!advancedCryptoSharedLinksTabContentImplementation.A04 || advancedCryptoSharedLinksTabContentImplementation.A02) {
            9Ah r0 = advancedCryptoSharedLinksTabContentImplementation.A0I;
            C96h c96h = A0L;
            r0.A04(c96h);
            advancedCryptoSharedLinksTabContentImplementation.A05 = false;
            advancedCryptoSharedLinksTabContentImplementation.A0H.A00(c96h);
            return;
        }
        advancedCryptoSharedLinksTabContentImplementation.A0I.A07(A0L, 0S2.A00);
        C9mc c9mc = advancedCryptoSharedLinksTabContentImplementation.A0F;
        A1d A00 = A1d.A00(advancedCryptoSharedLinksTabContentImplementation, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
        c9mc.A0A(AQb.A00(A00, 27), AV8.A00(AV3.A00(advancedCryptoSharedLinksTabContentImplementation, 9), c9mc, A00, 3));
    }

    public final void A02() {
        this.A0I.A05(C96h.A03);
        if (this.A01) {
            A00(this);
            return;
        }
        C9mc c9mc = this.A0F;
        AV3 A00 = AV3.A00(this, 7);
        A1d A002 = A1d.A00(this, 125);
        9IC r0 = (9IC) 1Br.A0B(c9mc.A0H);
        FbUserSession fbUserSession = c9mc.A0E;
        1Kd.A0F(AC8.A00(A00, 20), 5P7.A01((5P7) 4YU.A0o(fbUserSession, r0.A00, 49711), A002, 2, c9mc.A0J.A01), C9mc.A00(c9mc));
    }
}
