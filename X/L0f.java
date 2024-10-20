package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: L0f.class */
public final class L0f {
    public final Rect A00;
    public final WindowManager A01;
    public final JXd A02;
    public final JXe A03;
    public final Object A04;
    public final Set A05;

    public L0f(Context context, WindowManager windowManager) {
        11T.A0F(windowManager, 2);
        this.A05 = new CopyOnWriteArraySet();
        this.A02 = new JXd(context, this);
        this.A03 = new JXe(context, this);
        this.A01 = windowManager;
        this.A00 = DKC.A0C();
        this.A04 = AnonymousClass001.A0R();
    }

    public static final void A00(View view, WindowManager.LayoutParams layoutParams, L0f l0f) {
        try {
            l0f.A01.addView(view, layoutParams);
        } catch (RuntimeException e) {
            0fH.A0z("ScreenInsetsManager", "Failed to add detector (width=%d, height=%d). Ensuring removal.", e, AnonymousClass001.A1b(Integer.valueOf(((ViewGroup.LayoutParams) layoutParams).width), ((ViewGroup.LayoutParams) layoutParams).height));
            try {
                l0f.A01.removeView(view);
                throw e;
            } catch (IllegalArgumentException e2) {
                0fH.A0s("ScreenInsetsManager", "Detector could not be removed.", e2);
                throw e;
            }
        }
    }
}
