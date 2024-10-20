package com.bloks.foa.components.bottomsheet;

import X.AnonymousClass001;
import X.C3136Jk7;
import X.JY8;
import X.LDf;
import X.MEu;
import X.MJU;
import android.view.View;
import android.widget.Scroller;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: ViewDragHelper$Callback.class */
public abstract class ViewDragHelper$Callback {
    public void A00(View view) {
        JY8 jy8 = ((C3136Jk7) this).A00;
        List list = jy8.A0H;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MJU) it.next()).CCm(view, jy8.getHeight());
        }
    }

    public void A01(View view, float f) {
        C3136Jk7 c3136Jk7 = (C3136Jk7) this;
        if (view != null) {
            JY8 jy8 = c3136Jk7.A00;
            int height = jy8.getHeight();
            LDf lDf = jy8.A05;
            lDf.A09.abortAnimation();
            Scroller scroller = lDf.A09;
            int i = (-1) << (-1);
            int i2 = (-1) >>> 1;
            scroller.fling(0, 0, 0, (int) f, i, i2, i, i2);
            int finalY = lDf.A09.getFinalY();
            lDf.A09.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = jy8.A06;
            if (list == null) {
                list = Collections.emptyList();
            }
            MEu A00 = JY8.A00(view, jy8, list, top, height);
            if (A00 != null) {
                jy8.A04 = A00;
                int B3v = height - A00.B3v(view, height);
                try {
                    int i3 = jy8.A00;
                    if (!lDf.A0A) {
                        throw AnonymousClass001.A0N("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                    }
                    lDf.A07.getXVelocity(lDf.A02);
                    LDf.A07(lDf, B3v, (int) lDf.A07.getYVelocity(lDf.A02), i3);
                    jy8.postInvalidateOnAnimation();
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
