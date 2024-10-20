package X;

import com.facebook.fbui.widget.pagerindicator.TabbedViewPagerIndicator;

/* loaded from: G27.class */
public final class G27 implements Runnable {
    public static final String __redex_internal_original_name = "TabbedViewPagerIndicator$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ TabbedViewPagerIndicator A01;

    public G27(TabbedViewPagerIndicator tabbedViewPagerIndicator, int i) {
        this.A01 = tabbedViewPagerIndicator;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        TabbedViewPagerIndicator tabbedViewPagerIndicator = this.A01;
        boolean z = tabbedViewPagerIndicator.A05;
        int i = this.A00;
        if (z) {
            tabbedViewPagerIndicator.smoothScrollTo(TabbedViewPagerIndicator.A00(tabbedViewPagerIndicator, i), 0);
        } else {
            TabbedViewPagerIndicator.A03(tabbedViewPagerIndicator, i);
        }
        TabbedViewPagerIndicator.TabsContainer tabsContainer = tabbedViewPagerIndicator.A04;
        tabsContainer.A03 = 0;
        tabsContainer.A04 = 0;
        tabsContainer.invalidate();
    }
}
