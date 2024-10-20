package com.facebook.messaging.nativepagereply.plugins.faq.disclosure;

import X.0Pz;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1G2;
import X.1G3;
import X.1HN;
import X.2Ws;
import X.C2bv;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessInboxFAQQuickPromotionBanner.class */
public final class BusinessInboxFAQQuickPromotionBanner {
    public 1HN A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 2Ws A04;
    public final 1G2 A05;
    public final String A06;
    public final FbUserSession A07;

    public BusinessInboxFAQQuickPromotionBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A01 = context;
        this.A07 = fbUserSession;
        this.A04 = r304;
        this.A03 = 1BK.A0E();
        this.A02 = 1Bu.A01(context, 68329);
        String str = ((1G1) fbUserSession).A02;
        this.A06 = str;
        1G2 A01 = 1G3.A01(C2bv.A0I.A0D(0Pz.A0W(str, "/")), "should_show_faq_banner");
        11T.A0A(A01);
        this.A05 = A01;
    }
}
