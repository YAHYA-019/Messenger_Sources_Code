package X;

import android.animation.Animator;
import android.widget.LinearLayout;

/* renamed from: X.Gcs, reason: case insensitive filesystem */
/* loaded from: Gcs.class */
public final class C2431Gcs extends IFt {
    public final /* synthetic */ I3h A00;
    public final /* synthetic */ HdA A01;

    public C2431Gcs(I3h i3h, HdA hdA) {
        this.A00 = i3h;
        this.A01 = hdA;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 != null) {
            I3h i3h = this.A00;
            LinearLayout.LayoutParams layoutParams = I3h.A05;
            GuB guB = i3h.A03;
            guB.A00.postDelayed(new Ioj(this), 200L);
        }
    }
}
