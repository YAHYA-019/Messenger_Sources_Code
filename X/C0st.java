package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.0st, reason: invalid class name */
/* loaded from: 0st.class */
public final class C0st implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C0st(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.A00 != 0) {
            View view2 = (View) this.A02;
            view2.removeOnAttachStateChangeListener(this);
            view2.requestApplyInsets();
        } else {
            C09y c09y = (C09y) this.A02;
            Fragment A04 = c09y.A04();
            c09y.A07();
            C0Am.A02((ViewGroup) A04.mView.getParent(), ((C06b) this.A01).A00).A0A();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
