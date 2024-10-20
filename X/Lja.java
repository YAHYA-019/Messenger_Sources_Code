package X;

import android.view.ViewParent;

/* loaded from: Lja.class */
public final class Lja implements Runnable {
    public static final String __redex_internal_original_name = "ForwardingListener$DisallowIntercept";
    public final /* synthetic */ LKe A00;

    public Lja(LKe lKe) {
        this.A00 = lKe;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
