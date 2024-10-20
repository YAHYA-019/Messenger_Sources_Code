package com.facebook.messaging.marketplace.plugins.block.threadsettingsrow;

import X.06Z;
import X.11T;
import X.1BL;
import X.BNV;
import X.CQg;
import X.CZ0;
import X.Cug;
import X.DBO;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MarketplaceThreadSettingsBlockUserRow.class */
public final class MarketplaceThreadSettingsBlockUserRow {
    public final Cug A00(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A1F(r303, context);
        11T.A0F(fbUserSession, 3);
        DBO dbo = new DBO(16);
        CQg A00 = CQg.A00();
        CQg.A07(context, A00, 2131954861);
        CQg.A08(BNV.A14, A00);
        A00.A00 = 112833594L;
        return CQg.A02(new CZ0(3, fbUserSession, dbo, r303, threadSummary, this), A00);
    }
}
