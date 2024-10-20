package X;

import android.widget.ImageView;

/* renamed from: X.JoO, reason: case insensitive filesystem */
/* loaded from: JoO.class */
public final class C3259JoO extends JwS implements MFS {
    public ImageView A00;

    public void CmN(boolean z) {
        this.A00.setSelected(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(734470675);
        super/*com.facebook.widget.CustomFrameLayout*/.onAttachedToWindow();
        C2rp.A01(this);
        GOo.A16(getContext(), this, 2131954100);
        0FI.A0C(-14553918, A06);
    }
}
