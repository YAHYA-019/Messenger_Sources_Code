package androidx.viewpager.widget;

import X.0FI;
import X.0NL;
import X.4YU;
import X.7zL;
import X.AnonymousClass001;
import X.DKC;
import X.DKE;
import X.DKF;
import X.DMf;
import X.DO0;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: PagerTabStrip.class */
public class PagerTabStrip extends ViewGroup {
    public static final int[] A0T = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] A0U = {R.attr.textAllCaps};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public ViewPager A0B;
    public boolean A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public WeakReference A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final DMf A0Q;
    public final Paint A0R;
    public final Rect A0S;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PagerTabStrip(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.PagerTabStrip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void A00(TextView textView) {
        Context context = textView.getContext();
        SingleLineTransformationMethod singleLineTransformationMethod = new SingleLineTransformationMethod();
        ((DO0) singleLineTransformationMethod).A00 = 4YU.A0B(context).locale;
        textView.setTransformationMethod(singleLineTransformationMethod);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0314, code lost:
    
        if (r303 == r301.A00) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(int r302, float r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.PagerTabStrip.A01(int, float, boolean):void");
    }

    public void A02(0NL r302, int i) {
        int A0C = r302 != null ? r302.A0C() : 0;
        this.A0P = true;
        CharSequence charSequence = null;
        CharSequence A08 = (i < 1 || r302 == null) ? null : r302.A08(i - 1);
        TextView textView = this.A0A;
        textView.setText(A08);
        TextView textView2 = this.A08;
        textView2.setText((r302 == null || i >= A0C) ? null : r302.A08(i));
        int i2 = i + 1;
        if (i2 < A0C && r302 != null) {
            charSequence = r302.A08(i2);
        }
        TextView textView3 = this.A09;
        textView3.setText(charSequence);
        int i3 = (-1) << (-1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (DKF.A03(this) * 0.8f)), i3);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), i3);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        this.A03 = i;
        if (!this.A0C) {
            A01(i, this.A00, false);
        }
        this.A0P = false;
    }

    public void A03(0NL r302, 0NL r303) {
        if (r302 != null) {
            r302.A05(this.A0Q);
            this.A0M = null;
        }
        if (r303 != null) {
            r303.A04(this.A0Q);
            this.A0M = 7zL.A14(r303);
        }
        ViewPager viewPager = this.A0B;
        if (viewPager != null) {
            this.A03 = -1;
            this.A00 = -1.0f;
            A02(r303, viewPager.A0G());
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2103555046);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            IllegalStateException A0N = AnonymousClass001.A0N("PagerTitleStrip must be a direct child of a ViewPager.");
            0FI.A0C(1514050709, A06);
            throw A0N;
        }
        ViewPager viewPager = (ViewPager) parent;
        0NL A0H = viewPager.A0H();
        DMf dMf = this.A0Q;
        viewPager.A0D = dMf;
        List list = viewPager.A0F;
        if (list == null) {
            list = AnonymousClass001.A0s();
            viewPager.A0F = list;
        }
        list.add(dMf);
        this.A0B = viewPager;
        WeakReference weakReference = this.A0M;
        A03(weakReference != null ? (0NL) weakReference.get() : null, A0H);
        0FI.A0C(-1268460731, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-265727333);
        super.onDetachedFromWindow();
        ViewPager viewPager = this.A0B;
        if (viewPager != null) {
            A03(viewPager.A0H(), null);
            ViewPager viewPager2 = this.A0B;
            viewPager2.A0D = null;
            DMf dMf = this.A0Q;
            List list = viewPager2.A0F;
            if (list != null) {
                list.remove(dMf);
            }
            this.A0B = null;
        }
        0FI.A0C(-1986891238, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.A08;
        int left = textView.getLeft();
        int i = this.A0K;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.A0H;
        Paint paint = this.A0R;
        int i4 = this.A0J << 24;
        int i5 = this.A0G & 16777215;
        paint.setColor(i4 | i5);
        float f = i2;
        float f2 = i3;
        float f3 = right;
        float f4 = height;
        canvas.drawRect(f, f2, f3, f4, paint);
        if (this.A0N) {
            paint.setColor((-16777216) | i5);
            canvas.drawRect(getPaddingLeft(), height - this.A0F, DKE.A09(this), f4, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A0B != null) {
            float f = this.A00;
            if (f < 0.0f) {
                f = 0.0f;
            }
            A01(this.A03, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw AnonymousClass001.A0N("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.A0A.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.A08;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.A09.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            int measuredHeight = textView.getMeasuredHeight();
            Drawable background = getBackground();
            max = Math.max(Math.max(background != null ? background.getIntrinsicHeight() : 0, this.A04), measuredHeight + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int A0G;
        int A05 = 0FI.A05(1919551410);
        int action = motionEvent.getAction();
        if (action != 0 && this.A0O) {
            0FI.A0B(-1800733076, A05);
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.A0D = x;
            this.A0E = y;
            this.A0O = false;
        } else if (action == 1) {
            int left = this.A08.getLeft();
            int i = this.A0K;
            if (x < left - i) {
                viewPager = this.A0B;
                A0G = viewPager.A0G() - 1;
            } else if (x > r0.getRight() + i) {
                viewPager = this.A0B;
                A0G = viewPager.A0G() + 1;
            }
            viewPager.A0K(A0G);
        } else if (action == 2) {
            float A01 = DKC.A01(x, this.A0D);
            float f = this.A0L;
            if (A01 > f || DKC.A01(y, this.A0E) > f) {
                this.A0O = true;
            }
        }
        0FI.A0B(-112203024, A05);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A0P) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.A0N = AnonymousClass001.A1O(i & (-16777216));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        this.A0N = AnonymousClass001.A1U(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        this.A0N = AnonymousClass001.A1O(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.A0I;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTextColor(int i) {
        this.A01 = i;
        this.A08.setTextColor(i);
        int i2 = (this.A06 << 24) | (this.A01 & 16777215);
        this.A0A.setTextColor(i2);
        this.A09.setTextColor(i2);
    }
}
