package X;

import android.view.View;

/* renamed from: X.3gc, reason: invalid class name */
/* loaded from: 3gc.class */
public final class C3gc implements Runnable {
    public static final String __redex_internal_original_name = "TakeProfilePictureFragment$onViewCreated$7";
    public final /* synthetic */ View A00;
    public final /* synthetic */ 2jY A01;

    public C3gc(View view, 2jY r303) {
        this.A01 = r303;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5j A0O = 1BL.A0O(this.A01.A08);
        View view = this.A00;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Ida ida = A0O.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        Ida.A00(ida).CtC(measuredWidth, measuredHeight);
    }
}
