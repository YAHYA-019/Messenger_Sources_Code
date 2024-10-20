package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.photos.editing.DoodleControlsLayout;

/* renamed from: X.Gng, reason: case insensitive filesystem */
/* loaded from: Gng.class */
public final class C2763Gng extends IFM {
    public C6x1 A00;
    public I4q A01;
    public final C00i A02;
    public final 2Wo A03;

    public C2763Gng(ViewGroup viewGroup, Hrw hrw, 2Wo r304) {
        super(viewGroup, hrw, (C6x1) null);
        this.A02 = GOo.A0K();
        this.A03 = r304;
    }

    public static void A00(C2763Gng c2763Gng, C6x1 c6x1, I4q i4q) {
        View A01;
        boolean A0Y = c2763Gng.A0Y(c6x1, i4q);
        2Wo r0 = c2763Gng.A03;
        if (A0Y) {
            ((DoodleControlsLayout) r0.A01()).A0W();
            boolean z = i4q.A03;
            A01 = r0.A01();
            if (z) {
                ((DoodleControlsLayout) A01).A07.A01();
                return;
            }
        } else {
            if (r0.A00 == null) {
                return;
            }
            ((DoodleControlsLayout) r0.A01()).A0V();
            A01 = r0.A01();
        }
        ((DoodleControlsLayout) A01).A07.A00();
    }

    public void A0F() {
        A00(this, this.A00, this.A01);
    }

    public void A0H() {
        A00(this, this.A00, this.A01);
    }
}
