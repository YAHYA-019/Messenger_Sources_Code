package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6fC, reason: invalid class name */
/* loaded from: 6fC.class */
public final class C6fC extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ 6Hs A00;

    public C6fC(6Hs r302) {
        this.A00 = r302;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f2 < 9000.0f) {
            return false;
        }
        6Hs r0 = this.A00;
        Set set = 6Hs.A0Q;
        if (r0.A0D.get().equals(C0et.A0U) || r0.A0B) {
            return false;
        }
        6Fy r02 = r0.A0L;
        ThreadSummary BFK = r02.BFK();
        if ((BFK != null && 2oI.A06(BFK)) || r02.BF7() == null || r0.A0G.BQc()) {
            return false;
        }
        63D r03 = r0.A0I;
        if (r03.BQb() || r03.BWl()) {
            return false;
        }
        boolean A00 = 1XU.A00(r0.A0H.getContext());
        double d = r0.A00;
        if ((A00 && d <= 0.0d) || d < -1.0d) {
            return false;
        }
        6Jk A002 = 6Hs.A00(r0);
        if (A002 != null && A002.A1V()) {
            return false;
        }
        AppBarLayout appBarLayout = r0.A09;
        if (appBarLayout == null) {
            appBarLayout = (AppBarLayout) r0.A02.findViewById(2131362070);
            r0.A09 = appBarLayout;
        }
        if (appBarLayout != null) {
            appBarLayout.setVisibility(0);
            r0.A09.A0B = true;
        }
        if (r0.A04 == null) {
            r0.A04 = (LithoView) r0.A02.findViewById(2131367174);
        }
        6Hs.A03(r0);
        AppBarLayout appBarLayout2 = r0.A09;
        if (appBarLayout2 != null) {
            appBarLayout2.A03 = 10;
            appBarLayout2.requestLayout();
        }
        6Hs.A06(r0, true);
        r0.A0A = true;
        6Hs.A05(r0, false);
        AppBarLayout appBarLayout3 = r0.A09;
        if (appBarLayout3 == null) {
            return false;
        }
        6Hu r04 = r0.A0M;
        List list = appBarLayout3.A09;
        if (list == null) {
            list = new ArrayList();
            appBarLayout3.A09 = list;
        }
        if (r04 == null || list.contains(r04)) {
            return false;
        }
        appBarLayout3.A09.add(r04);
        return false;
    }
}
