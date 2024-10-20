package X;

import android.view.View;
import com.facebook.messaging.rtc.incall.activity.InCallActivity;

/* loaded from: Iwn.class */
public final class Iwn implements Runnable {
    public static final String __redex_internal_original_name = "InCallActivity$onPictureInPictureModeChanged$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ InCallActivity A01;

    public Iwn(View view, InCallActivity inCallActivity) {
        this.A00 = view;
        this.A01 = inCallActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view.isAttachedToWindow()) {
            this.A01.getWindowManager().updateViewLayout(view, view.getLayoutParams());
        }
    }
}
