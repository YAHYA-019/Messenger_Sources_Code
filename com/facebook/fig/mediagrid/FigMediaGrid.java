package com.facebook.fig.mediagrid;

import X.0FI;
import X.0PV;
import X.5CC;
import X.69W;
import X.AnonymousClass001;
import X.C0Ad;
import X.C1oo;
import X.C69e;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DOa;
import X.EnO;
import X.Ezg;
import X.Q26;
import X.RZC;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: FigMediaGrid.class */
public final class FigMediaGrid extends View {
    public int A00;
    public int A01;
    public Drawable A02;
    public C69e A03;
    public Ezg A04;
    public EnO A05;
    public Q26 A06;
    public RZC A07;
    public ImmutableList A08;
    public boolean A09;
    public 0PV A0A;
    public final Paint A0B;
    public final Paint A0C;

    public FigMediaGrid(Context context) {
        super(context);
        Paint A09 = DKC.A09();
        this.A0B = A09;
        DKC.A1L(A09);
        this.A04 = new Ezg();
        this.A03 = new C69e(getResources());
        this.A0C = DKC.A09();
        A00(context, null);
    }

    public FigMediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint A09 = DKC.A09();
        this.A0B = A09;
        DKC.A1L(A09);
        this.A04 = new Ezg();
        this.A03 = new C69e(getResources());
        this.A0C = DKC.A09();
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        Paint paint = this.A0C;
        DKC.A1L(paint);
        this.A0A = new 0PV(context, new DOa(this));
        this.A07 = new RZC(context);
        int[] iArr = C1oo.A1T;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(2132607454, iArr);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr);
        paint.setColor(obtainStyledAttributes2.getColor(0, obtainStyledAttributes.getColor(0, 0)));
        paint.setStrokeWidth(obtainStyledAttributes2.getDimension(1, obtainStyledAttributes.getDimension(1, 0.0f)));
        int color = obtainStyledAttributes2.getColor(4, obtainStyledAttributes.getColor(4, 0));
        RZC rzc = this.A07;
        if (rzc.A01 == null) {
            Paint A09 = DKC.A09();
            rzc.A01 = A09;
            DKC.A1M(A09);
        }
        rzc.A01.setColor(color);
        int color2 = obtainStyledAttributes2.getColor(5, obtainStyledAttributes.getColor(5, 0));
        RZC rzc2 = this.A07;
        rzc2.A06.A08(color2);
        rzc2.A03 = true;
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(6, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        RZC rzc3 = this.A07;
        rzc3.A06.A09(dimensionPixelSize);
        rzc3.A03 = true;
        Drawable drawable = obtainStyledAttributes2.getDrawable(7);
        if (drawable == null) {
            drawable = obtainStyledAttributes.getDrawable(7);
        }
        this.A02 = drawable;
        this.A00 = obtainStyledAttributes2.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(2, 0));
        this.A01 = obtainStyledAttributes2.getDimensionPixelSize(3, obtainStyledAttributes.getDimensionPixelSize(3, 0));
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
        Q26 q26 = new Q26(this);
        this.A06 = q26;
        C0Ad.A0B(this, q26);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 >= r301.A04.A00.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C69h A01(int r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 < 0) goto L19
            r0 = r301
            X.Ezg r0 = r0.A04
            java.util.ArrayList r0 = r0.A00
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r304
            if (r0 < r1) goto L1e
        L19:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1e:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            X.Ezg r0 = r0.A04
            java.util.ArrayList r0 = r0.A00
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.69W r0 = (X.69W) r0
            X.69f r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            r0 = r303
            X.69h r0 = r0.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.mediagrid.FigMediaGrid.A01(int):X.69h");
    }

    public String A02(int i) {
        Resources resources;
        int i2;
        Object[] A1b;
        ImmutableList immutableList = this.A08;
        int size = immutableList != null ? immutableList.size() : 0;
        int i3 = i + 1;
        int i4 = this.A07.A00;
        boolean z = false;
        if (i4 > 0) {
            z = true;
            if (i3 == size) {
                resources = getResources();
                i2 = 2131962019;
                A1b = AnonymousClass001.A1a(i4);
                return resources.getString(i2, A1b);
            }
        }
        this.A08.get(i);
        if (z) {
            size--;
        }
        resources = getResources();
        i2 = 2131958480;
        A1b = AnonymousClass001.A1b(Integer.valueOf(i3), size);
        return resources.getString(i2, A1b);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Q26 q26 = this.A06;
        if (q26 == null || !q26.A0p(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1448712706);
        super.onAttachedToWindow();
        this.A04.A01();
        0FI.A0C(-1458245917, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-286129854);
        super.onDetachedFromWindow();
        this.A04.A02();
        0FI.A0C(1552775283, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Ezg ezg = this.A04;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = ezg.A00;
            if (i2 >= arrayList.size()) {
                break;
            }
            5CC A02 = ((69W) arrayList.get(i2)).A02();
            if (A02 != null) {
                A02.draw(canvas);
            }
            i = i2 + 1;
        }
        RZC rzc = this.A07;
        if (rzc.A00 > 0) {
            Paint paint = rzc.A01;
            if (paint != null) {
                canvas.drawRect(rzc.A05, paint);
            }
            if (rzc.A03) {
                rzc.A03 = false;
                rzc.A02 = rzc.A06.A00();
            }
            int A05 = DKE.A05(rzc.A02) >> 1;
            Rect rect = rzc.A05;
            canvas.translate(rect.left, rect.centerY() - A05);
            rzc.A02.draw(canvas);
            canvas.translate(-r0, -r0);
        }
        ImmutableList immutableList = this.A08;
        if (immutableList == null) {
            return;
        }
        int size = immutableList.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                return;
            }
            Rect bounds = A01(i4).getBounds();
            Paint paint2 = this.A0C;
            int strokeWidth = (int) (paint2.getStrokeWidth() / 2.0f);
            canvas.drawRect(bounds.left + strokeWidth, bounds.top + strokeWidth, bounds.right - strokeWidth, bounds.bottom - strokeWidth, paint2);
            i3 = i4 + 1;
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A04.A01();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnO enO;
        if ((z || this.A09) && (enO = this.A05) != null) {
            this.A09 = false;
            int length = enO.A03.length >> 2;
            float f = ((i3 - i) + this.A00) / enO.A00;
            float f2 = ((i4 - i2) + this.A01) / enO.A02;
            for (int i5 = 0; i5 < length; i5++) {
                int[] iArr = this.A05.A03;
                int i6 = i5 << 2;
                float f3 = iArr[i6] * f;
                float f4 = iArr[i6 + 1] * f2;
                A01(i5).setBounds((int) (f3 + 0.5f), (int) (f4 + 0.5f), (int) (f3 + ((iArr[i6 + 2] * f) - this.A00) + 0.5f), (int) (f4 + ((iArr[i6 + 3] * f2) - this.A01) + 0.5f));
            }
            RZC rzc = this.A07;
            Rect bounds = A01((this.A08 != null ? r0.size() : 0) - 1).getBounds();
            int i7 = bounds.left;
            int i8 = bounds.top;
            int i9 = bounds.right;
            int i10 = bounds.bottom;
            Rect rect = rzc.A05;
            if (rect.top == i8 && rect.bottom == i10 && rect.left == i7 && rect.right == i9) {
                return;
            }
            int width = rect.width();
            rect.set(i7, i8, i9, i10);
            int i11 = i9 - i7;
            if (i11 != width) {
                rzc.A06.A0A(i11);
                rzc.A03 = true;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = DKD.A09(this).widthPixels;
        }
        if (mode2 != 1073741824) {
            EnO enO = this.A05;
            if (enO == null) {
                size2 = size;
            } else {
                int i3 = enO.A02;
                float f = i3;
                int i4 = enO.A01;
                if (i4 <= 0) {
                    i4 = i3;
                }
                size2 = (int) ((f / i4) * size);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A04.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (super.onTouchEvent(r302) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0072, code lost:
    
        r311 = true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 988669970(0x3aede812, float:0.0018150827)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r301
            X.0PV r0 = r0.A0A
            android.view.GestureDetector r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.onTouchEvent(r1)
            r305 = r0
            r0 = -1550396784(0xffffffffa396d290, float:-1.635221E-17)
            r306 = r0
            r0 = r306
            int r0 = X.0FI.A05(r0)
            r307 = r0
            r0 = r301
            X.Ezg r0 = r0.A04
            r308 = r0
            r0 = 0
            r309 = r0
        L2b:
            r0 = r308
            java.util.ArrayList r0 = r0.A00
            r310 = r0
            r0 = r310
            int r0 = r0.size()
            r306 = r0
            r0 = r309
            r1 = r306
            if (r0 >= r1) goto L60
            r0 = r310
            r1 = r309
            java.lang.Object r0 = r0.get(r1)
            X.69W r0 = (X.69W) r0
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.A08(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L72
            r0 = r309
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            goto L2b
        L60:
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r306 = r0
            r0 = 0
            r311 = r0
            r0 = 0
            r310 = r0
            r0 = r306
            if (r0 == 0) goto L75
        L72:
            r0 = 1
            r311 = r0
        L75:
            r0 = -984400913(0xffffffffc5533bef, float:-3379.7458)
            r306 = r0
            r0 = r306
            r1 = r307
            X.0FI.A0B(r0, r1)
            r0 = r311
            if (r0 != 0) goto L91
            r0 = 0
            r311 = r0
            r0 = 0
            r310 = r0
            r0 = r305
            if (r0 == 0) goto L94
        L91:
            r0 = 1
            r311 = r0
        L94:
            r0 = -1447762561(0xffffffffa9b4e57f, float:-8.033417E-14)
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fig.mediagrid.FigMediaGrid.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Ezg ezg = this.A04;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = ezg.A00;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (drawable == ((69W) arrayList.get(i2)).A02()) {
                return true;
            }
            i = i2 + 1;
        }
    }
}
