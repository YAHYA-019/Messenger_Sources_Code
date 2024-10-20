package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: JXk.class */
public final class JXk extends View {
    public static final int[] A05;
    public static final int[] A06;
    public JVe A00;
    public Boolean A01;
    public Long A02;
    public Runnable A03;
    public C00m A04;

    static {
        int[] A1b = GOn.A1b();
        A1b[0] = 16842919;
        A1b[1] = 16842910;
        A05 = A1b;
        A06 = new int[0];
    }

    public final void A00() {
        this.A04 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.A03;
            11T.A0D(runnable2);
            runnable2.run();
        } else {
            JVe jVe = this.A00;
            if (jVe != null) {
                jVe.setState(A06);
            }
        }
        JVe jVe2 = this.A00;
        if (jVe2 != null) {
            jVe2.setVisible(false, false);
            unscheduleDrawable(jVe2);
        }
    }

    public final void A01(float f, long j, long j2) {
        JVe jVe = this.A00;
        if (jVe != null) {
            if (f > 1.0f) {
                f = 1.0f;
            }
            long A01 = L5e.A01(f, j2);
            LDp lDp = jVe.A00;
            if (lDp == null || lDp.A00 != A01) {
                jVe.A00 = new LDp(A01);
                jVe.setColor(ColorStateList.valueOf(L5e.A00(A01)));
            }
            Rect rect = new Rect(0, 0, 0KF.A01(LCr.A01(j)), 0KF.A01(LCr.A00(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            jVe.setBounds(rect);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        C00m c00m = this.A04;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
