package X;

import android.view.View;

/* loaded from: Irh.class */
public final class Irh implements Runnable {
    public static final String __redex_internal_original_name = "SidebarExtKt$animateHide$1";
    public final /* synthetic */ View A00;

    public Irh(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(8);
    }
}
