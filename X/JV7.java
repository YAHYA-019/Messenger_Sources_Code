package X;

import android.database.DataSetObserver;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: JV7.class */
public final class JV7 extends DataSetObserver {
    public final /* synthetic */ ReboundViewPager A00;

    public JV7() {
    }

    public JV7(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1L)) {
            0QE.A01(1L, "ReboundViewPagerDataSetObserver.onChanged", -370761908);
        }
        try {
            ReboundViewPager.A0A(reboundViewPager, true, false);
            reboundViewPager.A08 = reboundViewPager.A06;
        } finally {
            JR0.A15();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1L)) {
            0QE.A01(1L, "ReboundViewPagerDataSetObserver.onInvalidated", -370761908);
        }
        try {
            ReboundViewPager.A0A(reboundViewPager, true, false);
            reboundViewPager.A08 = reboundViewPager.A06;
        } finally {
            JR0.A15();
        }
    }
}
