package X;

import android.graphics.drawable.Drawable;

/* loaded from: E0h.class */
public final class E0h extends JVd {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;

    public E0h(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        ((JVd) this).A00 = drawable;
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = i;
    }

    /* renamed from: BSD, reason: merged with bridge method [inline-methods] */
    public boolean BSF(2hW r302) {
        boolean z = false;
        if (r302 instanceof E0h) {
            E0h e0h = (E0h) r302;
            if (this.A02 == e0h.A02 && this.A03 == e0h.A03 && this.A01 == e0h.A01 && this.A00 == e0h.A00 && this.A04 == e0h.A04) {
                z = true;
            }
        }
        return z;
    }
}
