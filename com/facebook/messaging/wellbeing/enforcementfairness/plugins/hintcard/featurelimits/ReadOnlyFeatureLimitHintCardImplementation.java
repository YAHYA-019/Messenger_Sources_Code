package com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits;

import X.0DE;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Zl;
import X.2Zn;
import X.2Zo;
import X.2Zy;
import X.2aK;
import X.2sA;
import X.2sF;
import X.4YV;
import X.6BI;
import X.6Ds;
import X.AJU;
import X.Bqu;
import X.C01g;
import X.C01i;
import X.C0s8;
import X.C82y;
import X.CEL;
import X.F4K;
import X.KPP;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: ReadOnlyFeatureLimitHintCardImplementation.class */
public final class ReadOnlyFeatureLimitHintCardImplementation {
    public static final List A0D = C0s8.A14(2Zn.A03, 2Zn.A04);
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final ThreadSummary A0A;
    public final String A0B;
    public final C01i A0C;

    public ReadOnlyFeatureLimitHintCardImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, String str) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(str, 3);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A0B = str;
        this.A0A = threadSummary;
        this.A06 = 1Bq.A00(67347);
        this.A04 = 1Bq.A00(49992);
        this.A07 = 1Bq.A00(49965);
        this.A05 = 1Bq.A00(84172);
        this.A03 = 1Bu.A00(68199);
        this.A08 = 1Bu.A00(67584);
        this.A09 = 1Lm.A00(context, fbUserSession, 66801);
        this.A02 = 1Bu.A00(99674);
        this.A0C = C01g.A01(new C82y(this, 29));
    }

    public static final List A00(ReadOnlyFeatureLimitHintCardImplementation readOnlyFeatureLimitHintCardImplementation, 6BI r302) {
        List list = (List) ((2sA) readOnlyFeatureLimitHintCardImplementation.A09.A00.get()).A00.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            2sF r0 = (2sF) obj;
            if (A0D.contains(r0.A04) && r0.A05 == r302 && r0.A00 * 1000 >= ((6Ds) readOnlyFeatureLimitHintCardImplementation.A04.A00.get()).now()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void A01(ReadOnlyFeatureLimitHintCardImplementation readOnlyFeatureLimitHintCardImplementation) {
        Long l;
        String str;
        CEL cel = (CEL) ((Bqu) 1Br.A0B(readOnlyFeatureLimitHintCardImplementation.A05)).A02.get(readOnlyFeatureLimitHintCardImplementation.A0B);
        if (cel != null && CEL.A00(cel) && cel.A00) {
            4YV.A0Z(cel.A04.A01).flowMarkPoint(cel.A01, "fl_cb_cta_tapped");
        }
        String str2 = null;
        2aK.A03((Integer) null, (0DE) null, new AJU(readOnlyFeatureLimitHintCardImplementation, null, 19), 2Zy.A01(2Zo.A00()), 3);
        F4K f4k = (F4K) 1Br.A0B(readOnlyFeatureLimitHintCardImplementation.A02);
        KPP kpp = KPP.A02;
        ThreadKey threadKey = readOnlyFeatureLimitHintCardImplementation.A0A.A0n;
        if (threadKey != null) {
            l = Long.valueOf(threadKey.A02);
            str2 = 1BK.A0w(threadKey);
            if (threadKey.A1F()) {
                str = "messenger_group_thread_details";
                F4K.A00(kpp, f4k, l, str2, str, 2);
            }
        } else {
            l = null;
        }
        str = "messenger_direct_thread_details";
        F4K.A00(kpp, f4k, l, str2, str, 2);
    }

    public static final boolean A02(ReadOnlyFeatureLimitHintCardImplementation readOnlyFeatureLimitHintCardImplementation, List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((2sF) it.next()).A04 == 2Zn.A04) {
                return 2Zl.A00((2Zl) readOnlyFeatureLimitHintCardImplementation.A03.A00.get()).AZk(36318453910483560L);
            }
        }
        return false;
    }

    public static final boolean A03(List list) {
        if (!(!list.isEmpty())) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((2sF) it.next()).A04 != 2Zn.A03) {
                    return false;
                }
            }
        }
        return true;
    }
}
