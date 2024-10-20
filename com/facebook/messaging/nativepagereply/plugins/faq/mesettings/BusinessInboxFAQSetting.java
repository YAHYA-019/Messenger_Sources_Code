package com.facebook.messaging.nativepagereply.plugins.faq.mesettings;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.C2bs;
import X.C2bv;
import X.DFp;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessInboxFAQSetting.class */
public final class BusinessInboxFAQSetting {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final DFp A05;

    public BusinessInboxFAQSetting(Context context, FbUserSession fbUserSession, DFp dFp) {
        1BL.A1H(context, dFp, fbUserSession);
        this.A00 = context;
        this.A05 = dFp;
        this.A01 = fbUserSession;
        this.A04 = 1Bu.A01(context, 83433);
        this.A03 = 1BK.A0E();
        this.A02 = 1Bu.A00(66615);
    }

    public static final boolean A00(BusinessInboxFAQSetting businessInboxFAQSetting, String str) {
        boolean z = false;
        if (str != null) {
            1G2 A01 = C2bv.A01((String) 1Br.A0B(businessInboxFAQSetting.A04), str);
            11T.A0A(A01);
            if (((C2bs) 1Br.A0B(businessInboxFAQSetting.A02)).A01() && !1Br.A09(businessInboxFAQSetting.A03).AZn(A01, false)) {
                z = true;
            }
        }
        return z;
    }
}
