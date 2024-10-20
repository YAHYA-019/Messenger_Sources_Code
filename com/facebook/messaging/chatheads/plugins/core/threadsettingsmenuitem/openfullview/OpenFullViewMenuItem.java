package com.facebook.messaging.chatheads.plugins.core.threadsettingsmenuitem.openfullview;

import X.11T;
import X.1AK;
import X.1Br;
import X.1Bu;
import X.4YU;
import X.4iH;
import X.AbG;
import X.AbJ;
import X.BNV;
import X.C2e;
import X.C7I;
import X.D0W;
import android.content.Context;
import android.net.Uri;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: OpenFullViewMenuItem.class */
public final class OpenFullViewMenuItem {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;

    public OpenFullViewMenuItem(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A02 = 1Bu.A01(context, 82435);
        this.A01 = AbG.A0Z();
    }

    public final C7I A00() {
        1Br.A0C(((C2e) 1Br.A0B(this.A02)).A00);
        return new C7I(BNV.A1X, 2131959554);
    }

    public final void A01() {
        String formatStrLocaleSafe;
        Uri A08;
        ThreadKey A0S = AbJ.A0S(this.A03);
        String str = null;
        if (A0S == null) {
            1Br.A0C(this.A01);
            formatStrLocaleSafe = "fb-messenger://threads";
        } else {
            if (!ThreadKey.A0f(A0S) && !ThreadKey.A0h(A0S) && !ThreadKey.A0T(A0S)) {
                boolean A0j = ThreadKey.A0j(A0S);
                4iH r0 = (4iH) 1Br.A0B(this.A01);
                if (A0j) {
                    A08 = r0.A09(4YU.A0z(A0S));
                    11T.A0A(A08);
                    new 1AK(new D0W(str)).BXk(this.A00, A08);
                } else {
                    A08 = r0.A08(A0S);
                    11T.A0A(A08);
                    str = A0S.toString();
                    new 1AK(new D0W(str)).BXk(this.A00, A08);
                }
            }
            1Br.A0C(this.A01);
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("fb-messenger://groupthreadfbid/%s", Long.toString(A0S.A04));
        }
        A08 = 4YU.A0F(formatStrLocaleSafe);
        11T.A0A(A08);
        new 1AK(new D0W(str)).BXk(this.A00, A08);
    }
}
