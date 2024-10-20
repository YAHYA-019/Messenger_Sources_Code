package com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts;

import X.0BY;
import X.11T;
import X.7zS;
import X.AbstractC00603o4;
import X.C0Bx;
import X.C4I4;
import X.CsM;
import X.DFp;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Map;

/* loaded from: EphemeralSecurityAlertsRow.class */
public final class EphemeralSecurityAlertsRow {
    public final Context A00;
    public final C4I4 A01;
    public final DFp A02;
    public final String A03;
    public final String A04;
    public final FbUserSession A05;
    public final CsM A06;

    public EphemeralSecurityAlertsRow(Context context, FbUserSession fbUserSession, DFp dFp) {
        7zS.A16(1, context, dFp, fbUserSession);
        this.A00 = context;
        this.A02 = dFp;
        this.A05 = fbUserSession;
        Class<?> cls = getClass();
        Map map = 0BY.A03;
        11T.A0F(cls, 1);
        this.A04 = C0Bx.A01(cls);
        CsM csM = new CsM(this, 0);
        this.A06 = csM;
        this.A03 = AbstractC00603o4.A00(633);
        this.A01 = C4I4.A00(context, fbUserSession, csM);
    }
}
