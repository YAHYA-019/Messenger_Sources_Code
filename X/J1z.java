package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.facebook.messaging.rtc.incall.impl.expression.sidebar.SidebarButton;

/* loaded from: J1z.class */
public final class J1z implements Runnable {
    public static final String __redex_internal_original_name = "ThumbnailAnimationManager$performAnimation$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ SidebarButton A02;
    public final /* synthetic */ Hq8 A03;

    public J1z(View view, View view2, SidebarButton sidebarButton, Hq8 hq8) {
        this.A03 = hq8;
        this.A01 = view;
        this.A00 = view2;
        this.A02 = sidebarButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hq8 hq8 = this.A03;
        View view = this.A01;
        View view2 = this.A00;
        SidebarButton sidebarButton = this.A02;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sidebarButton, "rotationY", 0.0f, -90.0f);
        ofFloat.setDuration(250L);
        hq8.A00 = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "rotationY", -90.0f, -180.0f);
        ofFloat2.setDuration(250L);
        hq8.A05 = ofFloat2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotationY", -90.0f, -180.0f);
        ofFloat3.setDuration(250L);
        hq8.A04 = ofFloat3;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "rotationY", -180.0f, -270.0f);
        ofFloat4.setDuration(250L);
        hq8.A01 = ofFloat4;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "rotationY", -180.0f, -270.0f);
        ofFloat5.setDuration(250L);
        hq8.A02 = ofFloat5;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(sidebarButton, "rotationY", -270.0f, -360.0f);
        ofFloat6.setDuration(250L);
        hq8.A03 = ofFloat6;
        ObjectAnimator objectAnimator = hq8.A01;
        if (objectAnimator != null) {
            objectAnimator.setStartDelay(1500L);
        }
        ObjectAnimator objectAnimator2 = hq8.A02;
        if (objectAnimator2 != null) {
            objectAnimator2.setStartDelay(1500L);
        }
        ObjectAnimator objectAnimator3 = hq8.A03;
        if (objectAnimator3 != null) {
            objectAnimator3.addListener(new 8BO(1, view2, sidebarButton, view));
        }
        ObjectAnimator objectAnimator4 = hq8.A01;
        if (objectAnimator4 != null) {
            objectAnimator4.addListener(new GSC(view, view2, sidebarButton, hq8, 2));
        }
        ObjectAnimator objectAnimator5 = hq8.A04;
        if (objectAnimator5 != null) {
            objectAnimator5.addListener(new GSC(view2, view, sidebarButton, hq8, 3));
        }
        ObjectAnimator objectAnimator6 = hq8.A00;
        if (objectAnimator6 != null) {
            GSD.A00(objectAnimator6, hq8, 9);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(hq8.A00);
        0K6.A00(animatorSet);
    }
}
