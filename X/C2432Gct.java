package X;

import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.Gct, reason: case insensitive filesystem */
/* loaded from: Gct.class */
public final class C2432Gct extends IFt {
    public final /* synthetic */ View A00;
    public final /* synthetic */ I3h A01;

    public C2432Gct(View view, I3h i3h) {
        this.A01 = i3h;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A00;
        view.setVisibility(8);
        Window window = ((Activity) view.getContext()).getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
