package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;

/* loaded from: Lmu.class */
public final class Lmu implements Runnable {
    public static final String __redex_internal_original_name = "ZoomableViewController$gestureListener$2$1$onFling$runnable$1";
    public final /* synthetic */ Jv2 A00;
    public final /* synthetic */ LYC A01;

    public Lmu(Jv2 jv2, LYC lyc) {
        this.A01 = lyc;
        this.A00 = jv2;
    }

    @Override // java.lang.Runnable
    public void run() {
        LYC lyc = this.A01;
        FrameLayout.LayoutParams layoutParams = LYC.A0c;
        OverScroller overScroller = lyc.A0W;
        overScroller.computeScrollOffset();
        lyc.A04 = overScroller.getCurrX();
        lyc.A05 = overScroller.getCurrY();
        float currX = overScroller.getCurrX();
        float currY = overScroller.getCurrY();
        View A00 = LYC.A00(lyc);
        A00.setTranslationX(currX);
        A00.setTranslationY(currY);
        if (overScroller.isFinished()) {
            LYC.A02(lyc);
        } else {
            this.A00.postOnAnimation(this);
        }
    }
}
