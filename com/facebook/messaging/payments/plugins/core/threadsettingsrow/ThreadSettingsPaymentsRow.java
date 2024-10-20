package com.facebook.messaging.payments.plugins.core.threadsettingsrow;

import X.1Bi;
import X.1Br;
import X.2MQ;
import X.2Sh;
import X.2yD;
import X.4YU;
import X.4YV;
import X.5yY;
import X.BNV;
import X.BmI;
import X.C1pq;
import X.C1ut;
import X.C3P0;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import X.DHb;
import X.FXe;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ThreadSettingsPaymentsRow.class */
public final class ThreadSettingsPaymentsRow {
    public static Cug A00(DHb dHb, 2Sh r302) {
        Object A03 = 1Bi.A03(50013);
        BmI bmI = (BmI) r302.A01((String) null, BmI.class);
        String str = bmI == null ? null : bmI.A00;
        str.getClass();
        FbUserSession A0C = 4YV.A0C(FbInjector.A00());
        CQg A00 = CQg.A00();
        BmI bmI2 = (BmI) r302.A01((String) null, BmI.class);
        String str2 = bmI2 == null ? null : bmI2.A01;
        str2.getClass();
        A00.A0B(str2);
        CQg.A08(BNV.A1n, A00);
        A00.A00 = 2538727354L;
        2MQ A002 = C3P0.A00(str);
        C1pq.A08("migButtonIconName", A002);
        CHv.A00(A002, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C3P0.A01(str), (C1ut) null, (Boolean) null);
        return CQg.A02(new FXe(A0C, dHb, A03, str, 0), A00);
    }

    public static boolean A01(ThreadSummary threadSummary, 5yY r302, Capabilities capabilities, 2Sh r304) {
        1Br r0 = r302.A00;
        if (!((2yD) r0.get()).AZk(36312870454826067L) || 2yD.A03((2yD) r0.get(), 36312870454760530L) || threadSummary == null) {
            return false;
        }
        BmI bmI = (BmI) r304.A01((String) null, BmI.class);
        if (TextUtils.isEmpty(bmI == null ? null : bmI.A00)) {
            return false;
        }
        BmI bmI2 = (BmI) r304.A01((String) null, BmI.class);
        if (TextUtils.isEmpty(bmI2 == null ? null : bmI2.A01)) {
            return false;
        }
        return 4YU.A1Y(capabilities, 0);
    }
}
