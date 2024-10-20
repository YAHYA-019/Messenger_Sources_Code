package com.facebook.messaging.groups.plugins.core.threadsettings.memberssurface;

import X.11T;
import X.1Br;
import X.1Bu;
import X.7zT;
import X.AbG;
import X.DHc;
import X.DHd;
import X.DIi;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: GroupMembersSurface.class */
public final class GroupMembersSurface {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final DIi A04;
    public final DHc A05;
    public final DHd A06;
    public final Context A07;

    public GroupMembersSurface(Context context, ThreadKey threadKey, DIi dIi, DHc dHc, DHd dHd) {
        7zT.A1W(context, threadKey, dIi, dHd);
        11T.A0F(dHc, 5);
        this.A07 = context;
        this.A03 = threadKey;
        this.A04 = dIi;
        this.A06 = dHd;
        this.A05 = dHc;
        this.A01 = 1Bu.A00(82526);
        this.A02 = AbG.A0W();
        this.A00 = 1Bu.A01(context, 50188);
    }
}
