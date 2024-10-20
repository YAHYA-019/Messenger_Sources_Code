package X;

import android.view.View;
import com.facebook.presence.api.model.RichStatus;

/* renamed from: X.9q2, reason: invalid class name */
/* loaded from: 9q2.class */
public final class C9q2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C2lh A00;
    public final /* synthetic */ RichStatus A01;
    public final /* synthetic */ boolean A02;

    public C9q2(C2lh c2lh, RichStatus richStatus, boolean z) {
        this.A02 = z;
        this.A00 = c2lh;
        this.A01 = richStatus;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i8 - i6 == 0 && i9 > 0 && this.A02) {
            this.A00.A01();
            C9mK.A01(this.A01);
        }
    }
}
