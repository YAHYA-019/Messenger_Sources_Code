package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: JZD.class */
public final class JZD extends LinearLayout {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public final /* synthetic */ TabLayout A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZD(Context context, TabLayout tabLayout) {
        super(context);
        this.A03 = tabLayout;
        this.A01 = -1;
        setWillNotDraw(false);
    }

    public static void A00(View view, View view2, JZD jzd, float f) {
        int A03;
        int i;
        int i2;
        int A032;
        float sin;
        double cos;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = jzd.A03.A0I;
            int i3 = drawable.getBounds().top;
            int i4 = drawable.getBounds().bottom;
            float f2 = 0.0f / 0.0f;
            drawable.setBounds(-1, i3, -1, i4);
        } else {
            TabLayout tabLayout = jzd.A03;
            Kwb kwb = tabLayout.A0K;
            Drawable drawable2 = tabLayout.A0I;
            boolean z = kwb instanceof K8O;
            RectF A00 = Kwb.A00(view, tabLayout);
            RectF A002 = Kwb.A00(view2, tabLayout);
            if (z) {
                float f3 = A00.left;
                float f4 = A002.left;
                double d = (f * 3.141592653589793d) / 2.0d;
                if (f3 < f4) {
                    sin = (float) (1.0d - Math.cos(d));
                    cos = Math.sin(d);
                } else {
                    sin = (float) Math.sin(d);
                    cos = 1.0d - Math.cos(d);
                }
                int i5 = (int) f3;
                int i6 = (int) f4;
                TimeInterpolator timeInterpolator = C80w.A01;
                A03 = i5 + GOn.A03(sin, i6 - i5);
                i = drawable2.getBounds().top;
                i2 = (int) A00.right;
                A032 = GOn.A03((float) cos, ((int) A002.right) - i2);
            } else {
                int i7 = (int) A00.left;
                int i8 = (int) A002.left;
                TimeInterpolator timeInterpolator2 = C80w.A01;
                A03 = i7 + GOn.A03(f, i8 - i7);
                i = drawable2.getBounds().top;
                i2 = (int) A00.right;
                A032 = GOn.A03(f, ((int) A002.right) - i2);
            }
            drawable2.setBounds(A03, i, i2 + A032, drawable2.getBounds().bottom);
        }
        jzd.postInvalidateOnAnimation();
    }

    public static void A01(JZD jzd) {
        View childAt = jzd.getChildAt(jzd.A01);
        TabLayout tabLayout = jzd.A03;
        Drawable drawable = tabLayout.A0I;
        RectF A00 = Kwb.A00(childAt, tabLayout);
        drawable.setBounds((int) A00.left, drawable.getBounds().top, (int) A00.right, drawable.getBounds().bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r302) {
        /*
            r301 = this;
            r0 = r301
            com.google.android.material.tabs.TabLayout r0 = r0.A03
            r303 = r0
            r0 = r303
            android.graphics.drawable.Drawable r0 = r0.A0I
            r304 = r0
            r0 = r304
            int r0 = X.DKD.A02(r0)
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L1b
            r0 = r304
            int r0 = r0.getIntrinsicHeight()
            r305 = r0
        L1b:
            r0 = r303
            int r0 = r0.A06
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto Lae
            r0 = 1
            r308 = r0
            r0 = 2
            r309 = r0
            r0 = r306
            r1 = r308
            if (r0 == r1) goto L91
            r0 = r306
            r1 = r309
            if (r0 == r1) goto L4a
            r0 = 3
            r309 = r0
            r0 = r306
            r1 = r309
            if (r0 == r1) goto Lb7
            r0 = 0
            r305 = r0
        L4a:
            r0 = r304
            int r0 = X.7zO.A02(r0)
            r309 = r0
            r0 = r309
            if (r0 <= 0) goto L8b
            r0 = r304
            android.graphics.Rect r0 = r0.getBounds()
            r310 = r0
            r0 = r310
            int r0 = r0.left
            r308 = r0
            r0 = r310
            int r0 = r0.right
            r309 = r0
            r0 = r304
            r1 = r308
            r2 = r307
            r3 = r309
            r4 = r305
            r0.setBounds(r1, r2, r3, r4)
            r0 = r303
            int r0 = r0.A0C
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L86
            r0 = r304
            r1 = r307
            r0.setTint(r1)
        L86:
            r0 = r304
            r1 = r302
            r0.draw(r1)
        L8b:
            r0 = r301
            r1 = r302
            super.draw(r1)
            return
        L91:
            r0 = r301
            int r0 = r0.getHeight()
            r1 = r305
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 / r1
            r307 = r0
            r0 = r301
            int r0 = r0.getHeight()
            r1 = r305
            int r0 = r0 + r1
            r309 = r0
            r0 = r309
            r1 = 2
            int r0 = r0 / r1
            r305 = r0
            goto L4a
        Lae:
            r0 = r301
            int r0 = r0.getHeight()
            r1 = r305
            int r0 = r0 - r1
            r307 = r0
        Lb7:
            r0 = r301
            int r0 = r0.getHeight()
            r305 = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZD.draw(android.graphics.Canvas):void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            int i5 = this.A01;
            View childAt = getChildAt(i5);
            View childAt2 = getChildAt(i5);
            if (childAt2 != null) {
                LF6 lf6 = new LF6(3, this, childAt2, childAt);
                this.A02.removeAllUpdateListeners();
                this.A02.addUpdateListener(lf6);
                return;
            }
        }
        A01(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A03;
            if (tabLayout.A04 == 1 || tabLayout.A03 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) KwZ.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (((ViewGroup.LayoutParams) layoutParams).width != i3 || layoutParams.weight != 0.0f) {
                                ((ViewGroup.LayoutParams) layoutParams).width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A04 = 0;
                        tabLayout.A08(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}
