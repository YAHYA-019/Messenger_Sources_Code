package X;

import android.view.View;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;

/* loaded from: J0h.class */
public final class J0h implements Runnable {
    public static final String __redex_internal_original_name = "DrawerBehavior$SettleRunnable";
    public boolean A00;
    public final View A01;
    public final /* synthetic */ DrawerBehavior A02;

    public J0h(View view, DrawerBehavior drawerBehavior, boolean z) {
        this.A02 = drawerBehavior;
        this.A01 = view;
        this.A00 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        DrawerBehavior drawerBehavior = this.A02;
        5XU r0 = drawerBehavior.A08;
        if (r0 != null && r0.A0E()) {
            this.A01.postOnAnimation(this);
        } else if (drawerBehavior.A04 == 2) {
            drawerBehavior.A06(drawerBehavior.A06, this.A00);
        }
    }
}
