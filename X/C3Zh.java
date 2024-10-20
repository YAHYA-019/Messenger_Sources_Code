package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Zh, reason: invalid class name */
/* loaded from: 3Zh.class */
public final class C3Zh implements C6s9 {
    public final /* synthetic */ 2OZ A00;

    public C3Zh(2OZ r302) {
        this.A00 = r302;
    }

    @Override // X.C6s9
    public void C3A(int i) {
        6QS r0;
        View view;
        6F2 r02 = this.A00.A0c;
        if (r02 == null || (r0 = r02.A0b) == null || (view = r0.mView) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // X.C6s9
    public void C3H(boolean z, int i) {
    }

    @Override // X.C6s9
    public void CDO(boolean z) {
    }
}
