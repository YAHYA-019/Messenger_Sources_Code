package com.facebook.messaging.msys.thread.wellbeing.plugins.unsend.bannercta;

import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Lm;
import X.1Um;
import X.22C;
import X.7OD;
import X.A1J;
import X.A1K;
import X.A1L;
import X.A1e;
import X.A1f;
import X.AnonymousClass224;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;

/* loaded from: UnsendBannerCTAHandlerImplementation.class */
public final class UnsendBannerCTAHandlerImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;

    public UnsendBannerCTAHandlerImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        1BL.A1H(context, threadKey, fbUserSession);
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = fbUserSession;
    }

    public static final void A00(UnsendBannerCTAHandlerImplementation unsendBannerCTAHandlerImplementation, long j) {
        ThreadKey threadKey = unsendBannerCTAHandlerImplementation.A02;
        if (!threadKey.A12()) {
            if (threadKey.A1M()) {
                7OD r0 = (7OD) 1Bn.A0A(67591);
                r0.A02();
                r0.A03(threadKey, false);
                return;
            }
            return;
        }
        FbUserSession fbUserSession = unsendBannerCTAHandlerImplementation.A01;
        Context context = unsendBannerCTAHandlerImplementation.A00;
        ((22C) 1Lm.A05(context, fbUserSession, 65962)).A0G(A1J.A00, j);
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(context, fbUserSession, 67457);
        A1K a1k = A1K.A00;
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, a1k);
        1Um.A02(AQV, A1f.A00(mailboxFeature, A0Q, 24), A0Q, false);
        PrivacyContext A00 = ((AnonymousClass224) 1Bi.A03(66774)).A00("876431843082365");
        A1L a1l = A1L.A00;
        1Um A0O = 1BK.A0O(mailboxFeature, 0);
        MailboxFutureImpl A0Q2 = 1BK.A0Q(A0O, a1l);
        1Um.A02(A0O, A1e.A00(A00, mailboxFeature, A0Q2, 23), A0Q2, false);
    }
}
