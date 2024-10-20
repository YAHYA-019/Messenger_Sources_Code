package com.facebook.messaging.privacy.plugins.core.mesetting;

import X.0BY;
import X.11T;
import X.1pI;
import X.7zT;
import X.AbstractC00603o4;
import X.C0Bx;
import X.C4I4;
import X.C5ww;
import X.CsM;
import X.Cvn;
import X.DFp;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Map;

/* loaded from: PrivacyShortcutsSetting.class */
public final class PrivacyShortcutsSetting {
    public final Context A00;
    public final 1pI A01;
    public final C4I4 A02;
    public final DFp A03;
    public final C5ww A04;
    public final String A05;
    public final String A06;
    public final FbUserSession A07;
    public final CsM A08;

    public PrivacyShortcutsSetting(Context context, FbUserSession fbUserSession, 1pI r304, DFp dFp) {
        11T.A0F(context, 1);
        7zT.A1U(r304, dFp, fbUserSession);
        this.A00 = context;
        this.A01 = r304;
        this.A03 = dFp;
        this.A07 = fbUserSession;
        Class<?> cls = getClass();
        Map map = 0BY.A03;
        11T.A0F(cls, 1);
        this.A06 = C0Bx.A01(cls);
        this.A04 = Cvn.A00(this, ActionId.CONTROLLER_INITIATED);
        CsM csM = new CsM(this, 1);
        this.A08 = csM;
        this.A05 = AbstractC00603o4.A00(632);
        this.A02 = C4I4.A00(context, fbUserSession, csM);
    }
}
