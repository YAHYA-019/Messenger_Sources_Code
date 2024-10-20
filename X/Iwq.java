package X;

import android.view.View;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;

/* loaded from: Iwq.class */
public final class Iwq implements Runnable {
    public static final String __redex_internal_original_name = "DrawerBehavior$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ DrawerBehavior A01;

    public Iwq(View view, DrawerBehavior drawerBehavior) {
        this.A01 = drawerBehavior;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        DrawerBehavior.A01(this.A00, this.A01);
    }
}
