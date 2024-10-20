package X;

import android.graphics.Rect;

/* loaded from: JvH.class */
public final class JvH extends JVQ {
    /* JADX WARN: Multi-variable type inference failed */
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Rect bounds = getBounds();
        11T.A0A(bounds);
        int i5 = bounds.left + bounds.right;
        int i6 = bounds.bottom;
        int i7 = ((JVQ) this).A01.A01;
        int i8 = (i6 - i7) / 2;
        ((JVQ) this).A00.setBounds(i5, i8, i7 + i5, i7 + i8);
    }
}
