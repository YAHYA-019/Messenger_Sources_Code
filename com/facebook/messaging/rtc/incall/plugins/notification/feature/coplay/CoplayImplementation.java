package com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2QU;
import X.7zP;
import X.CNU;
import X.DEx;
import X.E1m;
import X.FAb;
import X.FjO;
import X.HEt;
import X.I8a;
import X.I9O;
import X.RxG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: CoplayImplementation.class */
public final class CoplayImplementation extends HEt {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final DEx A08;
    public final E1m A09;

    public CoplayImplementation(Context context, FbUserSession fbUserSession) {
        int A05 = 7zP.A05(context, fbUserSession, 1);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = 1Lm.A00(context, fbUserSession, 99472);
        this.A03 = 1Bu.A01(context, 67677);
        this.A02 = 1Bu.A01(context, 85227);
        this.A04 = 1Lm.A00(context, fbUserSession, 85234);
        this.A07 = 1Bu.A00(16430);
        this.A06 = 1Lm.A00(context, fbUserSession, 99981);
        this.A08 = new FjO(this);
        this.A09 = new E1m(this, A05);
    }

    public static final String A00(CoplayImplementation coplayImplementation, List list) {
        String str;
        I9O B1U = ((2QU) 1Br.A0B(coplayImplementation.A06)).B1U((String) 1BK.A0r(list));
        if (B1U != null) {
            str = B1U.A08;
            if (str == null || str.length() == 0) {
                str = B1U.A07;
            }
        } else {
            str = "";
        }
        if (list.size() > 1 && str != null) {
            list.size();
        }
        return str;
    }

    public static final void A01(CoplayImplementation coplayImplementation, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf(((RxG) it.next()).userId);
            if (!11T.A0O(valueOf, coplayImplementation.A01.A02)) {
                list2.add(valueOf);
            }
        }
    }

    public void A02() {
        ((FAb) 1Br.A0B(this.A05)).A06(this.A09);
        CNU cnu = (CNU) 1Br.A0B(this.A04);
        DEx dEx = this.A08;
        if (dEx != null) {
            cnu.A09.remove(dEx);
        }
        ((HEt) this).A00 = null;
    }

    public void A03(I8a i8a) {
        11T.A0F(i8a, 0);
        ((HEt) this).A00 = i8a;
        ((FAb) 1Br.A0B(this.A05)).A05(this.A09);
        CNU cnu = (CNU) 1Br.A0B(this.A04);
        DEx dEx = this.A08;
        if (dEx != null) {
            cnu.A09.add(dEx);
        }
    }
}
