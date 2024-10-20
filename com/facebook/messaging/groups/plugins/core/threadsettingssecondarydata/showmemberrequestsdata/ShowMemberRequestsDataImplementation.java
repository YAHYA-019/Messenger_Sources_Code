package com.facebook.messaging.groups.plugins.core.threadsettingssecondarydata.showmemberrequestsdata;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Um;
import X.4YV;
import X.7zM;
import X.7zP;
import X.AbF;
import X.C1qM;
import X.C1x;
import X.CxO;
import X.Czg;
import X.Czk;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ShowMemberRequestsDataImplementation.class */
public final class ShowMemberRequestsDataImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final C1x A07;
    public final C1qM A08;
    public final AtomicBoolean A09;

    public ShowMemberRequestsDataImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, C1x c1x) {
        1BL.A11(1, context, c1x, fbUserSession);
        this.A00 = context;
        this.A06 = threadKey;
        this.A07 = c1x;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(66266);
        this.A05 = 7zM.A0e(context);
        this.A04 = 1Bu.A01(context, 67296);
        this.A02 = 7zM.A0O();
        this.A08 = new CxO(this, 14);
        this.A09 = new AtomicBoolean();
    }

    public static final void A00(ShowMemberRequestsDataImplementation showMemberRequestsDataImplementation) {
        MailboxFeature A0d = 7zP.A0d(showMemberRequestsDataImplementation.A04);
        Long A14 = AbF.A14(showMemberRequestsDataImplementation.A06);
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, Czg.A00(A0d, A14, A0P, 13), A0P, false);
        A0P.addResultCallback(4YV.A11(showMemberRequestsDataImplementation.A02), Czk.A00(showMemberRequestsDataImplementation, 52));
    }
}
