package com.facebook.messaging.nativepagereply.plugins.chatheads.disclosure;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.2Ws;
import X.C2bv;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessInboxChatHeadsPromotionBanner.class */
public final class BusinessInboxChatHeadsPromotionBanner {
    public static final 1G2 A08;
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2Ws A07;

    static {
        1G2 A0D = C2bv.A0U.A0D("chat_heads_qp_shown");
        11T.A0A(A0D);
        A08 = A0D;
    }

    public BusinessInboxChatHeadsPromotionBanner(Context context, 06Z r303, FbUserSession fbUserSession, 2Ws r305) {
        1BL.A11(2, fbUserSession, r303, r305);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A01 = r303;
        this.A07 = r305;
        this.A04 = 1BK.A0E();
        this.A03 = 1Bq.A00(66459);
        this.A06 = 1Bq.A00(67262);
        this.A05 = 1Bu.A00(83621);
    }
}
