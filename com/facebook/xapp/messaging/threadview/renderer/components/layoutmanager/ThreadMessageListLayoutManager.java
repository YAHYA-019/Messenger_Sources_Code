package com.facebook.xapp.messaging.threadview.renderer.components.layoutmanager;

import X.0S2;
import X.0fH;
import X.11T;
import X.2NB;
import X.2NQ;
import X.6M5;
import X.82W;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: ThreadMessageListLayoutManager.class */
public final class ThreadMessageListLayoutManager extends LinearLayoutManager {
    public final boolean A00;
    public final 6M5 A01;

    public ThreadMessageListLayoutManager(Context context, int i, boolean z) {
        super(context, 1, true);
        this.A00 = z;
        this.A01 = new 6M5(context, this, i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1R(2NB r302, 2NQ r303) {
        int A1j;
        View A0c;
        82W r0;
        11T.A0H(r302, r303);
        6M5 r02 = this.A01;
        r02.A00 = 6M5.A00(r02);
        try {
            super.A1R(r302, r303);
        } catch (IndexOutOfBoundsException e) {
            0fH.A0r("ThreadMessageListLayoutManager", "Index out of bounds exception", e);
        }
        r02.A01(r302, r303);
        if (this.A00 && (A1j = A1j()) == A0V() - 1 && (A0c = A0c(A1j)) != null) {
            Object tag = A0c.getTag();
            Object obj = null;
            if (82W.A00(12, tag) && (r0 = (82W) tag) != null) {
                obj = r0.A00;
            }
            if (obj == 0S2.A00) {
                int height = A0c.getHeight();
                if (A0c.getTop() > 0) {
                    A0c.setTop(0);
                    A0c.setBottom(height);
                }
            }
        }
    }
}
