package com.facebook.messaging.communitymessaging.plugins.pausechat.unpausechatthreadsettingrow;

import X.1BL;
import X.1Br;
import X.2MQ;
import X.2oI;
import X.AbG;
import X.BNV;
import X.C1u3;
import X.C1ut;
import X.CHv;
import X.CII;
import X.CQg;
import X.CZD;
import X.Cug;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: UnpauseChatThreadSettingRowImplementation.class */
public final class UnpauseChatThreadSettingRowImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final MigColorScheme A04;

    public UnpauseChatThreadSettingRowImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        1BL.A11(1, context, migColorScheme, fbUserSession);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A04 = migColorScheme;
        this.A01 = fbUserSession;
        this.A02 = AbG.A0a();
    }

    public final Cug A00() {
        CQg A00 = CQg.A00();
        Context context = this.A00;
        int i = 2131964561;
        if (2oI.A03(this.A03)) {
            i = 2131967630;
        }
        CQg.A07(context, A00, i);
        CQg.A08(BNV.A0e, A00);
        A00.A00 = 3389381915L;
        A00.A01 = CZD.A00(this, 84);
        CHv.A00(2MQ.A0p, A00, (C1ut) null);
        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A1T, (C1ut) null, (Boolean) null);
        return new Cug(A00);
    }
}
