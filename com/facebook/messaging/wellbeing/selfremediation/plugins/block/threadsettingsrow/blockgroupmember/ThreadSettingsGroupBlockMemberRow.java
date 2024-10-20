package com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockgroupmember;

import X.0S2;
import X.1BK;
import X.1BL;
import X.2MQ;
import X.AbF;
import X.AbK;
import X.AbL;
import X.AtG;
import X.BNV;
import X.C1u3;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsGroupBlockMemberRow.class */
public final class ThreadSettingsGroupBlockMemberRow {
    public final Context A00;
    public final ThreadKey A01;

    public ThreadSettingsGroupBlockMemberRow(Context context, ThreadKey threadKey) {
        1BL.A1F(context, threadKey);
        this.A00 = context;
        this.A01 = threadKey;
    }

    public final AtG A00() {
        return new AtG((BNV) null, AbL.A1B() ? AbK.A0x(C1u3.A4R) : AbK.A0w(2MQ.A2B), AbF.A0z(), 0S2.A00, "group_block_member_row", 1BK.A0u(this.A00, 2131967087), (String) null);
    }
}
