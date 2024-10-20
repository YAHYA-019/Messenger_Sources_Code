package com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.fetchreportingsessionparticipantsparams;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Um;
import X.4YV;
import X.AnonymousClass001;
import X.BDY;
import X.C3t;
import X.DKC;
import X.DKH;
import X.DKc;
import X.DLQ;
import X.Enf;
import X.Exk;
import X.FHh;
import X.FkL;
import X.FyG;
import X.GJj;
import X.LXE;
import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: FetchReportingSessionParticipantsParamsImplementation.class */
public final class FetchReportingSessionParticipantsParamsImplementation {
    public final Handler A00;
    public final 1Br A01;
    public final Context A02;

    public FetchReportingSessionParticipantsParamsImplementation(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A01 = 1Bu.A01(context, 84904);
        this.A00 = AnonymousClass001.A07();
    }

    public final Object A00(FHh fHh, DKc dKc) {
        Exk exk;
        FyG fyG = fHh.A03;
        if (fyG == null || (exk = (Exk) FyG.A02(fyG, 2131362444)) == null || !exk.A00.contains(2131362451)) {
            throw AnonymousClass001.A0N("[BkActionFetchReportingSessionParticipants] Bloks cannot access MSYS data unless explicitly permitted.");
        }
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        DLQ dlq = (DLQ) A10;
        Object A102 = DKC.A10(dKc, 1);
        A102.getClass();
        String obj = A102.toString();
        GJj A07 = dlq.A07();
        GJj A08 = dlq.A08();
        FbUserSession A0F = 4YV.A0F(this.A02);
        C3t c3t = (C3t) 1Br.A0B(this.A01);
        Enf enf = new Enf(this, fHh, A07, A08);
        BDY A0Y = DKH.A0Y(A0F, c3t);
        1Um AQV = A0Y.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new LXE(A0Y, mailboxFutureImpl, obj, 3), mailboxFutureImpl, false);
        mailboxFutureImpl.addResultCallback(new FkL(enf, 6));
        return null;
    }
}
