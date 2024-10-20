package androidx.lifecycle;

import X.0AI;
import X.0AK;
import X.11T;
import android.view.View;

/* loaded from: ViewTreeLifecycleOwner.class */
public abstract class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        11T.A0F(view, 0);
        return (LifecycleOwner) 0AI.A02(0AI.A06(ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE, 0AK.A0A(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE)));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        11T.A0F(view, 0);
        view.setTag(2131368400, lifecycleOwner);
    }
}
