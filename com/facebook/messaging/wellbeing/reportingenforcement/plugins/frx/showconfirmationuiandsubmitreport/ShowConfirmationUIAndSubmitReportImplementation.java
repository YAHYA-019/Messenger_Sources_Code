package com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.showconfirmationuiandsubmitreport;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Um;
import X.4YV;
import X.7zQ;
import X.AnonymousClass001;
import X.BDY;
import X.C3t;
import X.C5ic;
import X.DKC;
import X.DKH;
import X.DKc;
import X.DLQ;
import X.FHh;
import X.Fwk;
import X.GJj;
import X.KmI;
import X.LXB;
import X.LXE;
import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: ShowConfirmationUIAndSubmitReportImplementation.class */
public final class ShowConfirmationUIAndSubmitReportImplementation {
    public final Handler A00;
    public final 1Br A01;
    public final C5ic A02;
    public final Context A03;

    public ShowConfirmationUIAndSubmitReportImplementation(Context context) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A01 = 1Bu.A01(context, 84904);
        this.A02 = 7zQ.A0l();
        this.A00 = AnonymousClass001.A07();
    }

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        DLQ dlq = (DLQ) A10;
        String A0B = dlq.A0B();
        if (A0B == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String A0F = dlq.A0F();
        if (A0F == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        List Aty = dlq.Aty(42);
        if (Aty == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        GJj A0t = DKC.A0t(dlq);
        GJj A07 = dlq.A07();
        GJj A08 = dlq.A08();
        GJj AlB = dlq.AlB(49);
        FbUserSession A0F2 = 4YV.A0F(fwk.A00);
        C3t c3t = (C3t) 1Br.A0B(this.A01);
        KmI kmI = new KmI(A0F2, fwk, this, fHh, AlB, A0t, A07, A08, A0B, A0F, Aty);
        BDY A0Y = DKH.A0Y(A0F2, c3t);
        1Um AQV = A0Y.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new LXE(A0Y, mailboxFutureImpl, A0B, 4), mailboxFutureImpl, false);
        mailboxFutureImpl.addResultCallback(new LXB(kmI, 6));
        return null;
    }
}
