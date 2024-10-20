package X;

import android.view.View;

/* renamed from: X.821, reason: invalid class name */
/* loaded from: 821.class */
public final class AnonymousClass821 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ 6LA A01;

    public AnonymousClass821(View view, 6LA r303) {
        this.A01 = r303;
        this.A00 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        08D A00 = 0NN.A00(view);
        if (A00 != null) {
            6LA.A01(A00, this.A01);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
