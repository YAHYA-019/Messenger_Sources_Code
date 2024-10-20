package com.facebook.messaging.graph.plugins.sharecontact.entrypoints.threadsettingsrow;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2MQ;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsShareContactRow.class */
public final class ThreadSettingsShareContactRow {
    public final Context A00;
    public final 1Br A01;
    public final User A02;

    public ThreadSettingsShareContactRow(Context context, User user) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = 1Bu.A01(context, 82483);
        if (user == null) {
            throw 1BK.A0e();
        }
        this.A02 = user;
    }

    public final Cug A00() {
        CQg A00 = CQg.A00();
        CQg.A07(this.A00, A00, 2131965820);
        CQg.A08(BNV.A28, A00);
        A00.A00 = 2133797548L;
        CHv.A00(2MQ.A2q, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A5p, (C1ut) null, (Boolean) null);
        return CQg.A03(A00, this, ActionId.QUERY_READY);
    }
}
