package com.facebook.messaging.graph.plugins.sharecontact.xmactahandler.viewprofilectahandler;

import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1HG;
import X.AbI;
import X.AnonymousClass016;
import X.CHY;
import X.Ckn;
import X.DF6;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.user.model.User;

/* loaded from: ShareContactViewProfileCtaHandler.class */
public final class ShareContactViewProfileCtaHandler {
    public Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final DF6 A06;
    public final 1De A07;

    public ShareContactViewProfileCtaHandler(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 50218);
        this.A02 = 1Bu.A03(r0, 82233);
        this.A03 = 1Bq.A00(66540);
        this.A04 = 1Bu.A03(r0, 82706);
        this.A05 = 1Bu.A03(r0, 82788);
        this.A06 = new Ckn(this);
    }

    public static final void A00(ShareContactViewProfileCtaHandler shareContactViewProfileCtaHandler, User user) {
        1Br A00 = 1HG.A00(AbI.A04(shareContactViewProfileCtaHandler.A07), 83173);
        FragmentActivity fragmentActivity = (FragmentActivity) AnonymousClass016.A00(shareContactViewProfileCtaHandler.A00, FragmentActivity.class);
        if (fragmentActivity != null) {
            ((CHY) 1Br.A0B(A00)).A01(fragmentActivity.BDe(), user);
        }
    }
}
