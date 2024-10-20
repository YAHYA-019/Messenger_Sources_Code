package com.facebook.messaging.wellbeing.plugins.ixt.evidencepicker;

import X.06Z;
import X.0CL;
import X.11T;
import X.1Bu;
import X.1Um;
import X.6In;
import X.7zL;
import X.AbH;
import X.BDY;
import X.C2050DaD;
import X.C3t;
import X.DDz;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKH;
import X.DKc;
import X.DLQ;
import X.EUl;
import X.EqY;
import X.FHh;
import X.FjY;
import X.FkL;
import X.Fwk;
import X.GJj;
import X.LXE;
import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: MSGBloksIXTEvidencePickerImplementation.class */
public final class MSGBloksIXTEvidencePickerImplementation {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0CL] */
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        ?? obj = new Object();
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        Object obj2 = fwk.A00;
        if (!(obj2 instanceof DDz)) {
            return null;
        }
        C2050DaD c2050DaD = (C2050DaD) fwk;
        06Z r0 = c2050DaD.A02;
        ((0CL) obj).element = c2050DaD.A01;
        6In r02 = (6In) 1Bu.A06((Context) obj2, 68120);
        DLQ A0k = DKE.A0k(dKc.A00, 0);
        String A0t = DKD.A0t(A0k, "", 40);
        String A0t2 = DKD.A0t(A0k, "", 41);
        String A0t3 = DKD.A0t(A0k, "", 38);
        String A0t4 = DKD.A0t(A0k, "", 36);
        String A0t5 = DKD.A0t(A0k, ConstantsKt.CAMERA_ID_FRONT, 43);
        String A0t6 = DKD.A0t(A0k, "", 44);
        GJj A0w = DKC.A0w(A0k);
        if (7zL.A1V(A0t5)) {
            r02.Czk(r0, (DDz) obj2, new FjY(fHh, A0w), AbH.A0n(EUl.A00(fHh).A05, Long.parseLong(A0t5)), A0t2, A0t3, A0t4, A0t);
            return null;
        }
        EqY eqY = new EqY((Context) obj2, r02, fHh, A0w, A0t2, A0t3, A0t4, A0t, (0CL) obj);
        BDY A0Y = DKH.A0Y(EUl.A00(fHh), (C3t) 1Bu.A06((Context) obj2, 84904));
        1Um AQV = A0Y.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new LXE(A0Y, mailboxFutureImpl, A0t6, 2), mailboxFutureImpl, false);
        mailboxFutureImpl.addResultCallback(new FkL(eqY, 2));
        return null;
    }
}
