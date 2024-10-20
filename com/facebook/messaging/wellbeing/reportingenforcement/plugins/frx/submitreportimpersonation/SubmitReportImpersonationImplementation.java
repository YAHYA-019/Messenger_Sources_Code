package com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.submitreportimpersonation;

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
import X.FHh;
import X.FkL;
import X.GJj;
import X.Ibd;
import X.RqH;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: SubmitReportImpersonationImplementation.class */
public final class SubmitReportImpersonationImplementation {
    public final 1Br A00;
    public final Context A01;

    public SubmitReportImpersonationImplementation(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = 1Bu.A01(context, 84904);
    }

    public final Object A00(FHh fHh, DKc dKc) {
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        DLQ dlq = (DLQ) A10;
        String A0F = dlq.A0F();
        if (A0F == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String A0E = dlq.A0E();
        if (A0E == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        List Aty = dlq.Aty(40);
        if (Aty == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String string = dlq.getString(43);
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        int i = dlq.getInt(42, 0);
        GJj A07 = dlq.A07();
        GJj A08 = dlq.A08();
        FbUserSession A0F2 = 4YV.A0F(this.A01);
        C3t c3t = (C3t) 1Br.A0B(this.A00);
        Integer valueOf = Integer.valueOf(i);
        RqH rqH = new RqH(this, fHh, A07, A08);
        BDY A0Y = DKH.A0Y(A0F2, c3t);
        1Um AQV = A0Y.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new Ibd(valueOf, A0Y, Aty, mailboxFutureImpl, string, A0F, A0E, 1), mailboxFutureImpl, false);
        mailboxFutureImpl.addResultCallback(new FkL(rqH, 5));
        return null;
    }
}
