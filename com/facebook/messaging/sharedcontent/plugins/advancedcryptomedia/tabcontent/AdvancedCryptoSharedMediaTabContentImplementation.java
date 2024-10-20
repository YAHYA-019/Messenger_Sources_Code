package com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent;

import X.06Z;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1Kd;
import X.1qX;
import X.2O4;
import X.5P7;
import X.7V5;
import X.7zL;
import X.7zP;
import X.7zQ;
import X.7zT;
import X.7zV;
import X.9Ah;
import X.9KR;
import X.9KS;
import X.9XU;
import X.9xT;
import X.A1d;
import X.AC8;
import X.AQV;
import X.AQb;
import X.AV3;
import X.AV8;
import X.Aaa;
import X.C01g;
import X.C01i;
import X.C1x8;
import X.C2kx;
import X.C96h;
import X.C9ai;
import X.C9fe;
import X.C9mc;
import X.C9rb;
import X.DCz;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.viewstate.SharedAlbumsViewState;
import com.facebook.user.model.User;

/* loaded from: AdvancedCryptoSharedMediaTabContentImplementation.class */
public final class AdvancedCryptoSharedMediaTabContentImplementation {
    public static final C96h A0e = C96h.A04;
    public C9ai A00;
    public SharedAlbumsViewState A01;
    public Boolean A02;
    public Boolean A03;
    public Long A04;
    public Long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final View A0C;
    public final 06Z A0D;
    public final 2O4 A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Iw A0M;
    public final C2kx A0N;
    public final C9mc A0O;
    public final ThreadKey A0P;
    public final Aaa A0Q;
    public final 9XU A0R;
    public final 9Ah A0S;
    public final 9KR A0T;
    public final 9KS A0U;
    public final User A0V;
    public final C01i A0W;
    public final C01i A0X;
    public final C01i A0Y;
    public final C01i A0Z;
    public final C01i A0a;
    public final C01i A0b;
    public final C01i A0c;
    public final FbUserSession A0d;

    public AdvancedCryptoSharedMediaTabContentImplementation(View view, 06Z r303, 2O4 r304, FbUserSession fbUserSession, 1Iw r306, ThreadKey threadKey, 9XU r308, 9Ah r309, User user) {
        11T.A0F(r306, 1);
        7zT.A11(2, threadKey, r308, r304, r303);
        7zP.A1M(r309, 7, fbUserSession);
        this.A0M = r306;
        this.A0P = threadKey;
        this.A0V = user;
        this.A0R = r308;
        this.A0E = r304;
        this.A0D = r303;
        this.A0S = r309;
        this.A0C = view;
        this.A0d = fbUserSession;
        this.A0L = 1Bq.A00(67389);
        this.A0H = 1BK.A0C();
        this.A0G = 1Bu.A00(68334);
        this.A0I = 1Bu.A00(68433);
        this.A0K = 1Bu.A00(68435);
        this.A0Y = C01g.A01(AQV.A00(this, 47));
        this.A0a = C01g.A01(AQV.A00(this, 49));
        this.A0Z = C01g.A01(AQV.A00(this, 48));
        this.A0X = C01g.A01(AQV.A00(this, 45));
        this.A0W = C01g.A01(AQV.A00(this, 44));
        this.A0b = C01g.A01(new DCz(this, 0));
        this.A0c = C01g.A01(new DCz(this, 1));
        this.A0T = new 9KR(this);
        this.A0Q = new 9xT(this);
        this.A0J = 1Bu.A00(147896);
        this.A0N = new C2kx();
        this.A0F = 1Bu.A00(147714);
        1Bn.A0A(147570);
        Context A0A = 7zL.A0A(r306);
        this.A0O = new C9mc(A0A, fbUserSession, threadKey);
        1Br.A0C(this.A0J);
        C9ai c9ai = new C9ai(A0A, threadKey);
        this.A00 = c9ai;
        c9ai.A01();
        this.A0U = new 9KS(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r302.A0A == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(androidx.lifecycle.LifecycleOwner r301, com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation r302) {
        /*
            r0 = r302
            X.01i r0 = r0.A0Y
            r303 = r0
            r0 = r303
            boolean r0 = X.7zQ.A1a(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1a
            r0 = r302
            boolean r0 = r0.A0A
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L1a:
            r0 = 0
            r305 = r0
        L1d:
            r0 = r302
            X.9mc r0 = r0.A0O
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0A
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L46
            r0 = r305
            if (r0 == 0) goto L6a
            r0 = 0
            r307 = r0
            r0 = 31
            r304 = r0
            r0 = r306
            r1 = r304
            X.AV4 r0 = X.AV4.A00(r0, r1)
            r303 = r0
            r0 = r306
            r1 = 0
            r2 = r303
            r0.A0A(r1, r2)
        L46:
            X.AKV r0 = new X.AKV
            r303 = r0
            r0 = r303
            r1 = 6
            r2 = r302
            r3 = r305
            r0.<init>(r1, r2, r3)
            r0 = r306
            r1 = r303
            r0.A09(r1)
            r0 = r306
            androidx.lifecycle.MutableLiveData r0 = r0.A07
            r307 = r0
            r0 = r301
            r1 = r307
            r2 = r302
            r3 = 92
            X.C9qq.A01(r0, r1, r2, r3)
            return
        L6a:
            r0 = -1
            long r0 = (long) r0
            r308 = r0
            r0 = r306
            r1 = r308
            X.C9mc.A02(r0, r1)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation.A00(androidx.lifecycle.LifecycleOwner, com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation):void");
    }

    public static final void A01(AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation) {
        if (advancedCryptoSharedMediaTabContentImplementation.A06 || !1Br.A07(advancedCryptoSharedMediaTabContentImplementation.A0H).AZk(36322431048500752L)) {
            A03(advancedCryptoSharedMediaTabContentImplementation);
            return;
        }
        advancedCryptoSharedMediaTabContentImplementation.A0S.A07(A0e, 0S2.A0C);
        C9mc c9mc = advancedCryptoSharedMediaTabContentImplementation.A0O;
        int A02 = 7zV.A02((1qX) c9mc.A07.getValue());
        int A07 = 1BL.A07(advancedCryptoSharedMediaTabContentImplementation.A0a);
        int A072 = 1BL.A07(advancedCryptoSharedMediaTabContentImplementation.A0Z);
        int A073 = 1BL.A07(advancedCryptoSharedMediaTabContentImplementation.A0b) - A02;
        if (A073 > 0) {
            A07 = Math.min(A073, 1BL.A07(advancedCryptoSharedMediaTabContentImplementation.A0X));
            A072 = 1BL.A07(advancedCryptoSharedMediaTabContentImplementation.A0W);
        }
        c9mc.A08(advancedCryptoSharedMediaTabContentImplementation.A03, advancedCryptoSharedMediaTabContentImplementation.A04, AQV.A00(advancedCryptoSharedMediaTabContentImplementation, 46), AV3.A00(advancedCryptoSharedMediaTabContentImplementation, 11), A07, A072, 0);
    }

    public static final void A02(AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation) {
        advancedCryptoSharedMediaTabContentImplementation.A0S.A07(A0e, 0S2.A0Y);
        advancedCryptoSharedMediaTabContentImplementation.A0B = true;
        C9mc c9mc = advancedCryptoSharedMediaTabContentImplementation.A0O;
        A1d A00 = A1d.A00(advancedCryptoSharedMediaTabContentImplementation, 127);
        AV3 A002 = AV3.A00(advancedCryptoSharedMediaTabContentImplementation, 12);
        7V5 A05 = c9mc.A05();
        1Kd.A0F(AC8.A00(A002, 21), 5P7.A01((5P7) 1Br.A0B(A05.A00), A00, 0, c9mc.A0J.A01), C9mc.A00(c9mc));
    }

    public static final void A03(AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation) {
        if (!advancedCryptoSharedMediaTabContentImplementation.A0A || !7zQ.A1a(advancedCryptoSharedMediaTabContentImplementation.A0Y) || advancedCryptoSharedMediaTabContentImplementation.A08) {
            9Ah r0 = advancedCryptoSharedMediaTabContentImplementation.A0S;
            C96h c96h = A0e;
            r0.A04(c96h);
            advancedCryptoSharedMediaTabContentImplementation.A0B = false;
            advancedCryptoSharedMediaTabContentImplementation.A0R.A00(c96h);
            return;
        }
        advancedCryptoSharedMediaTabContentImplementation.A0S.A07(A0e, 0S2.A00);
        C9mc c9mc = advancedCryptoSharedMediaTabContentImplementation.A0O;
        A1d A00 = A1d.A00(advancedCryptoSharedMediaTabContentImplementation, 128);
        c9mc.A0A(AQb.A00(A00, 27), AV8.A00(AV3.A00(advancedCryptoSharedMediaTabContentImplementation, 13), c9mc, A00, 3));
    }

    public final void A04() {
        this.A0S.A05(C96h.A04);
        if (!this.A07) {
            if (!((C9fe) 1Br.A0B(this.A0K)).A01) {
                A02(this);
                return;
            } else if (!1BK.A1X(this.A02, true)) {
                if (this.A02 == null) {
                    C9rb.A00(((C1x8) 7zP.A0h(7zQ.A0N().A04(), this.A0M, 16874)).A0D("armadillo_thread_gallery", false, true), this, 30);
                    return;
                }
                return;
            }
        }
        A01(this);
    }
}
