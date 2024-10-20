package com.facebook.messaging.rtc.incall.impl.root;

import X.0Q8;
import X.11T;
import X.AbF;
import X.GOp;
import X.GrS;
import X.HGB;
import X.HVZ;
import X.Hke;
import X.IMK;
import X.IYw;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: WindowInsetsReportingFrameLayout.class */
public final class WindowInsetsReportingFrameLayout extends CustomFrameLayout {
    public HVZ A00;

    public WindowInsetsReportingFrameLayout(Context context) {
        super(context);
    }

    public WindowInsetsReportingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WindowInsetsReportingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        11T.A0F(rect, 0);
        Rect rect2 = new Rect(rect);
        boolean fitSystemWindows = super.fitSystemWindows(rect);
        HVZ hvz = this.A00;
        if (hvz != null) {
            GrS grS = hvz.A00.A0I;
            if (grS == null) {
                AbF.A1H();
                throw 0Q8.createAndThrow();
            }
            IMK A0R = GOp.A0R(grS.A07);
            if (!11T.A0O(A0R.A07, rect2)) {
                A0R.A07 = rect2;
                Set set = A0R.A0W;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((HGB) it.next()).A05();
                }
                IMK.A02(A0R);
                IMK.A03(A0R);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((HGB) it2.next()).A00();
                }
                IMK.A02(A0R);
            }
            Hke A00 = GrS.A00(grS);
            A00.A06 = rect2;
            if (!A00.A0B.contains("windowInsetsPadding")) {
                HashSet A1E = AbF.A1E(A00.A0B);
                A00.A0B = A1E;
                A1E.add("windowInsetsPadding");
            }
            IYw.A00(A00, grS);
        }
        return fitSystemWindows;
    }
}
