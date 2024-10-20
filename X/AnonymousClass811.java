package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbFrameLayout;

/* renamed from: X.811, reason: invalid class name */
/* loaded from: 811.class */
public final class AnonymousClass811 extends FbFrameLayout {
    public LithoView A00;

    public AnonymousClass811(Context context) {
        super(context);
        Context context2 = getContext();
        LithoView lithoView = new LithoView(context2, (AttributeSet) null);
        this.A00 = lithoView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int A00 = C0A8.A00(context2, 6.0f);
        layoutParams.setMargins(A00, A00, A00, A00);
        addView(lithoView, layoutParams);
    }
}
