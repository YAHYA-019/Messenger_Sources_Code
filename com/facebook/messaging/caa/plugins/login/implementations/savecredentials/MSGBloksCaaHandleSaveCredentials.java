package com.facebook.messaging.caa.plugins.login.implementations.savecredentials;

import X.0CU;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Ho;
import X.1IB;
import X.1Kd;
import X.AnonymousClass001;
import X.CIA;
import X.DKC;
import X.DKD;
import X.DKc;
import X.FB1;
import X.FEK;
import X.FGb;
import X.FHh;
import X.FwG;
import X.GJj;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.dbllite.data.DblLiteCredentials;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import java.util.HashMap;

/* loaded from: MSGBloksCaaHandleSaveCredentials.class */
public final class MSGBloksCaaHandleSaveCredentials {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public MSGBloksCaaHandleSaveCredentials(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 33031);
        this.A03 = 1Bq.A00(85159);
        this.A04 = 1Bu.A03(r0, 16428);
        this.A01 = 1Bu.A03(r0, 99775);
        this.A02 = 1Bu.A03(r0, 99422);
    }

    public final Object A00(FHh fHh, DKc dKc) {
        String str;
        Object A10 = DKC.A10(dKc, 1);
        A10.getClass();
        String str2 = (String) A10;
        String A0u = DKD.A0u(dKc, DKC.A17(A10), 2);
        boolean A01 = FB1.A01(dKc, 3);
        GJj A02 = FGb.A02(dKc.A00, 4);
        if (A01) {
            if (str2.length() == 0 || 0CU.A0O(str2)) {
                str2 = 1Br.A03(this.A04).A02;
            }
            DblLiteCredentials A012 = ((CIA) 1Br.A0B(this.A03)).A01(str2);
            CallerContext A0B = CallerContext.A0B("MSGBloksCaaHandleSaveCredentials");
            if (A012 != null && (str = A012.nonce) != null && str.length() != 0) {
                return null;
            }
            HashMap A0u2 = AnonymousClass001.A0u();
            A0u2.put("login_source", A0u);
            Bundle A05 = 1BK.A05();
            A05.putString("account_id", str2);
            1Ho newInstance_DEPRECATED = ((BlueServiceOperationFactory) 1Br.A0B(this.A00)).newInstance_DEPRECATED(1BJ.A00(1387), A05, 1, A0B);
            newInstance_DEPRECATED.A0A = false;
            1IB A00 = 1Ho.A00(newInstance_DEPRECATED, true);
            11T.A0A(A00);
            1Kd.A0E(new FwG(A0u2, this, A0u, 1), A00);
        }
        if (A02 == null) {
            return null;
        }
        FEK.A00(fHh, DKc.A01, A02);
        return null;
    }
}
