package com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockuser;

import X.0S2;
import X.11T;
import X.1BK;
import X.2MQ;
import X.AbF;
import X.AbK;
import X.AbL;
import X.AtG;
import X.BNV;
import X.C1u3;
import X.C1z1;
import X.C2pn;
import android.content.Context;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsBlockUserRow.class */
public final class ThreadSettingsBlockUserRow {
    public final Context A00;
    public final User A01;

    public ThreadSettingsBlockUserRow(Context context, User user) {
        11T.A0F(context, 1);
        this.A00 = context;
        if (user == null) {
            throw 1BK.A0e();
        }
        this.A01 = user;
    }

    public final AtG A00() {
        C2pn A0x = AbL.A1B() ? AbK.A0x(C1u3.A4R) : AbK.A0w(2MQ.A2B);
        Context context = this.A00;
        int i = 2131954861;
        if (this.A01.A02() != C1z1.NOT_BLOCKED) {
            i = 2131954872;
        }
        return new AtG((BNV) null, A0x, AbF.A0z(), 0S2.A00, "block_row", 1BK.A0u(context, i), (String) null);
    }
}
