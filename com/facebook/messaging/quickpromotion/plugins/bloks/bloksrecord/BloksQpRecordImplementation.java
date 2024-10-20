package com.facebook.messaging.quickpromotion.plugins.bloks.bloksrecord;

import X.04S;
import X.0DU;
import X.0DV;
import X.0Pz;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Fw;
import X.4HB;
import X.4HC;
import X.4YU;
import X.7zQ;
import X.DKC;
import X.DKE;
import X.DKc;
import X.ENT;
import X.EXW;
import X.Eo3;
import X.EqQ;
import X.FyG;
import X.GG9;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.List;
import org.json.JSONException;

/* loaded from: BloksQpRecordImplementation.class */
public final class BloksQpRecordImplementation {
    public final 1Br A00 = 1Bq.A00(99594);

    public final Object A00(DKc dKc) {
        0DV r304;
        1Br.A0C(this.A00);
        FyG fyG = (FyG) DKC.A10(dKc, 0);
        if (fyG == null) {
            return null;
        }
        Object A02 = FyG.A02(fyG, 2131366769);
        if (!Eo3.class.isInstance(A02)) {
            A02 = null;
        }
        Eo3 eo3 = (Eo3) A02;
        if (eo3 == null) {
            return null;
        }
        try {
            1Br.A0C(eo3.A01);
            EqQ eqQ = eo3.A02;
            11T.A0F(eqQ, 1);
            List list = dKc.A00;
            String A13 = DKE.A13(list, 1);
            String A132 = DKE.A13(list, 2);
            7zQ.A1Y(A13, A132, 1);
            try {
                QuickPromotionDefinition quickPromotionDefinition = eqQ.A04;
                if (A13.equals(quickPromotionDefinition.promotionId)) {
                    ENT A00 = EXW.A00(A132);
                    if (A00 == null) {
                        throw new JSONException(0Pz.A0W("Invalid action type ", A132));
                    }
                    4HC r0 = (4HC) 4YU.A0n(1Fw.A04(eqQ.A00), eqQ.A01, 82823);
                    4HB r02 = A00.qpActionEventEnum;
                    11T.A0F(r02, 1);
                    r0.A03(r02, quickPromotionDefinition.promotionId);
                    GG9 gg9 = eqQ.A05;
                    if (gg9 != null) {
                        gg9.BhR(A00);
                    }
                    1Br.A0C(eqQ.A03);
                }
            } catch (Exception e) {
                1Br.A04(eqQ.A02).softReport("QPBloksActionHandlerImpl", "Error processing bloks record action", e);
            }
            r304 = 04S.A00;
        } catch (Throwable th) {
            r304 = new 0DV(th);
        }
        Throwable A002 = 0DU.A00(r304);
        if (A002 == null) {
            return null;
        }
        1Br.A04(eo3.A00).softReport("QPBloksClickListenerImpl", "Error processing record event", A002);
        return null;
    }
}
