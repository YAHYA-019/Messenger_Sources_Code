package com.facebook.messaging.groups.plugins.leavegroup.threadsettingsmenuitem;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.4YV;
import X.7zM;
import X.AbF;
import X.AbI;
import X.C00i;
import X.C6Hb;
import X.C8q;
import X.CPZ;
import X.CbX;
import X.Cin;
import X.ClF;
import X.Cum;
import X.DEq;
import X.DHc;
import X.DHd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: LeaveConversationMenuItem.class */
public final class LeaveConversationMenuItem {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final DHc A04;
    public final DHd A05;
    public final Context A06;
    public final 06Z A07;
    public final 1Br A08;

    public LeaveConversationMenuItem(Context context, 06Z r303, ThreadSummary threadSummary, DHc dHc, DHd dHd) {
        1BL.A11(1, context, r303, dHd);
        11T.A0F(dHc, 5);
        this.A06 = context;
        this.A07 = r303;
        this.A05 = dHd;
        this.A04 = dHc;
        this.A08 = 7zM.A0e(context);
        this.A03 = threadSummary;
        this.A02 = 1Bq.A00(82449);
        this.A00 = 1Bu.A01(context, 82542);
        this.A01 = 1Bu.A01(context, 17010);
    }

    public final void A00() {
        Context context = this.A06;
        FbUserSession A0F = 4YV.A0F(context);
        C00i c00i = this.A00.A00;
        CPZ cpz = (CPZ) c00i.get();
        ThreadSummary threadSummary = this.A03;
        if (cpz.A05(context, A0F, threadSummary) && ((C8q) 1Br.A0B(this.A02)).A02(threadSummary.A06)) {
            CPZ.A00(context, this.A07, A0F, new Cin(this, 3), (CPZ) c00i.get(), threadSummary, this.A05);
            return;
        }
        if (!AbI.A0a(this.A01).A0E(threadSummary) && threadSummary.A0n.A1A()) {
            ((CPZ) c00i.get()).A04(context, this.A07, A0F, new Cin(this, 4), (DEq) null, threadSummary, "thread_settings", "leave_chat_button");
            return;
        }
        C6Hb c6Hb = (C6Hb) 1Bu.A06(context, 82259);
        06Z r0 = this.A07;
        Cum cum = new Cum(this, 2);
        ThreadKey A0f = AbF.A0f(threadSummary);
        ((CbX) c6Hb.A00.get()).A01(r0, A0f.A0w() ? new ClF(this, 3) : ThreadKey.A0a(A0f) ? new ClF(this, 2) : null, threadSummary, cum);
    }
}
