package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jd6, reason: case insensitive filesystem */
/* loaded from: Jd6.class */
public final class C2918Jd6 extends Krv implements MJN {
    public final Drawable A00;
    public final MN4 A01 = KvA.A01(0);
    public final MN4 A02;
    public final C01i A03;

    public C2918Jd6(Drawable drawable) {
        this.A00 = drawable;
        C01i c01i = Kaq.A00;
        this.A02 = KvA.A01(new LCr((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : KvJ.A00(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.A03 = GAW.A00(this, 33);
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // X.MJN
    public void BhF() {
        BzU();
    }

    @Override // X.MJN
    public void BzU() {
        Object obj = this.A00;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        ((Drawable) obj).setVisible(false, false);
        ((Drawable) obj).setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MJN
    public void CGG() {
        Drawable drawable = this.A00;
        drawable.setCallback((Drawable.Callback) this.A03.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
