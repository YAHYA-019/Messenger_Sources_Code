package com.facebook.messaging.threadview.messagelist.layoutmanager;

import X.11T;
import X.1Bi;
import X.1qI;
import X.2NB;
import X.2NQ;
import X.6M5;
import android.content.Context;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;

/* loaded from: ThreadMessageListLayoutManager.class */
public class ThreadMessageListLayoutManager extends BetterLinearLayoutManager {
    public final 6M5 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMessageListLayoutManager(Context context) {
        super(context, 1);
        11T.A0F(context, 1);
        this.A00 = new 6M5(context, this, (int) 1qI.A02((1qI) 1Bi.A03(66409)).Auy(36604271098731055L), true);
    }

    @Override // com.facebook.widget.recyclerview.BetterLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        11T.A0F(r302, 0);
        11T.A0F(r303, 1);
        6M5 r0 = this.A00;
        r0.A00 = 6M5.A00(r0);
        super.A1R(r302, r303);
        r0.A01(r302, r303);
    }
}
