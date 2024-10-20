package com.facebook.messaging.sharedcontent.plugins.media.tabcontent;

import X.06Z;
import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.2O4;
import X.7zM;
import X.7zN;
import X.7zR;
import X.7zT;
import X.9Ah;
import X.9KV;
import X.9XU;
import X.9xU;
import X.Aaa;
import X.C2kx;
import X.C95o;
import X.C96h;
import X.C9ai;
import X.ExL;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.viewstate.SharedAlbumsViewState;
import com.facebook.user.model.User;

/* loaded from: SharedMediaTabContentImplementation.class */
public final class SharedMediaTabContentImplementation {
    public static final C96h A0M = C96h.A07;
    public C9ai A00;
    public SharedAlbumsViewState A01;
    public boolean A02;
    public final View A03;
    public final 06Z A04;
    public final 2O4 A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Iw A0B;
    public final C2kx A0C;
    public final ExL A0D;
    public final ThreadKey A0E;
    public final Aaa A0F;
    public final 9XU A0G;
    public final C95o A0H;
    public final 9Ah A0I;
    public final 9KV A0J;
    public final User A0K;
    public final FbUserSession A0L;

    public SharedMediaTabContentImplementation(View view, 06Z r303, 2O4 r304, FbUserSession fbUserSession, 1Iw r306, ThreadKey threadKey, 9XU r308, C95o c95o, 9Ah r310, User user) {
        11T.A0F(r306, 1);
        7zT.A11(2, threadKey, r308, r304, r303);
        7zR.A1P(r310, c95o);
        11T.A0F(fbUserSession, 10);
        this.A0B = r306;
        this.A0E = threadKey;
        this.A0K = user;
        this.A0G = r308;
        this.A05 = r304;
        this.A04 = r303;
        this.A0I = r310;
        this.A0H = c95o;
        this.A03 = view;
        this.A0L = fbUserSession;
        this.A0J = new 9KV(this);
        this.A0C = new C2kx();
        this.A09 = 1Bu.A00(147896);
        this.A08 = 1Bu.A00(68433);
        Context context = r306.A0D;
        this.A07 = 7zM.A0g(context, 65937);
        this.A0F = new 9xU(this);
        this.A0A = 1Bu.A00(147744);
        this.A06 = 1Bu.A00(68334);
        1Bn.A0A(147573);
        this.A0D = new ExL(context, fbUserSession, threadKey, user, 7zN.A0e("PHOTO_AND_VIDEO"));
        1Br.A0C(this.A09);
        C9ai c9ai = new C9ai(context, threadKey);
        this.A00 = c9ai;
        c9ai.A01();
    }
}
