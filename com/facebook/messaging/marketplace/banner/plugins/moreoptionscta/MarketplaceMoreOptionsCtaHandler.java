package com.facebook.messaging.marketplace.banner.plugins.moreoptionscta;

import X.11T;
import X.1BK;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1PG;
import X.1Um;
import X.63D;
import X.7Oo;
import X.9XB;
import X.A1T;
import X.FFw;
import X.N72;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;

/* loaded from: MarketplaceMoreOptionsCtaHandler.class */
public final class MarketplaceMoreOptionsCtaHandler {
    public FFw A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 7Oo A07;
    public final Context A08;
    public final FbUserSession A09;
    public final 63D A0A;
    public final PrivacyContext A0B;

    public MarketplaceMoreOptionsCtaHandler(Context context, FbUserSession fbUserSession, 63D r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 3);
        this.A08 = context;
        this.A0A = r304;
        this.A09 = fbUserSession;
        this.A02 = 1Bu.A00(147603);
        this.A06 = 1Bq.A00(16456);
        this.A04 = 1Bq.A00(16449);
        this.A03 = 1Bq.A00(66265);
        this.A01 = 1Lm.A00(context, fbUserSession, 68289);
        this.A03.A00.get();
        this.A07 = 7Oo.A00(context, fbUserSession, r304, 1PG.A01() ? "mp_banner_refactor" : "All");
        1Br A00 = 1Bq.A00(66774);
        this.A05 = A00;
        A00.A00.get();
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "267235184257586");
        11T.A0A(newPrivacyContextNative);
        this.A0B = newPrivacyContextNative;
    }

    public final void A00(Context context, ThreadKey threadKey) {
        if (!(context instanceof Activity)) {
            if (!(context instanceof ContextThemeWrapper)) {
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
            if (!(context instanceof Activity)) {
                return;
            }
        }
        if (context != null) {
            ((9XB) 1Bn.A0A(68166)).A00("MESSENGER_BANNER_MORE_OPTIONS_BUTTON");
            MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A01);
            long A0r = threadKey.A0r();
            PrivacyContext privacyContext = this.A0B;
            A1T a1t = new A1T(6, context, this, threadKey);
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1t);
            1Um.A02(AQV, new N72(1, A0r, mailboxFeature, privacyContext, A0Q), A0Q, false);
        }
    }
}
