package X;

import android.view.View;

/* loaded from: Iri.class */
public final class Iri implements Runnable {
    public static final String __redex_internal_original_name = "SidebarExtKt$animateShow$1";
    public final /* synthetic */ View A00;

    public Iri(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(0);
    }
}
