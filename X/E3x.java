package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

/* loaded from: E3x.class */
public final class E3x extends FkV {
    public final GL7 A00;
    public final FyG A01;

    public E3x(GL7 gl7, FyG fyG) {
        this.A01 = fyG;
        this.A00 = gl7;
    }

    public Drawable A00(Context context) {
        Q1k q1k;
        GHM ghm = this.A01;
        GL7 gl7 = this.A00;
        Q1k dMm = new DMm(gl7, ghm);
        float A00 = GL7.A00(gl7, 0.0f, 48);
        if (A00 != 0.0f) {
            q1k = new Q1k(dMm, gl7.Ad0(ghm, 49, 56, Color.argb(68, 0, 0, 0)), GL7.A00(gl7, 0.0f, 44), A00);
        } else {
            q1k = dMm;
        }
        return (Drawable) q1k;
    }
}
