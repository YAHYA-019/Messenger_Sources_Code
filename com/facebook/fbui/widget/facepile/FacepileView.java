package com.facebook.fbui.widget.facepile;

import X.0FI;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Du;
import X.2Kp;
import X.2rX;
import X.5SA;
import X.69W;
import X.7zL;
import X.AnonymousClass001;
import X.C0A2;
import X.C1oo;
import X.C2rY;
import X.C69e;
import X.C69o;
import X.C69s;
import X.DKC;
import X.Eaj;
import X.Ezg;
import X.FHB;
import X.RYM;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Gravity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.resources.ui.FbView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: FacepileView.class */
public class FacepileView extends FbView implements CallerContextable {
    public static final CallerContext A0R = CallerContext.A08(FacepileView.class, "unknown");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public RectF A09;
    public Layout A0A;
    public Ezg A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public Paint A0I;
    public Drawable A0J;
    public C69s A0K;
    public boolean A0L;
    public final 2rX A0M;
    public final FHB A0N;
    public final C69e A0O;
    public final 2Kp A0P;
    public volatile ImmutableList A0Q;

    public FacepileView(Context context) {
        this(context, null);
    }

    public FacepileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969531);
    }

    public FacepileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0N = (FHB) 1Bi.A03(99805);
        this.A0M = (2rX) 1Bi.A03(67518);
        2Kp r0 = new 2Kp();
        this.A0P = r0;
        this.A01 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A0F = 0;
        this.A0E = false;
        this.A00 = 0;
        this.A08 = 0;
        this.A0G = 0;
        this.A0K = (C69s) 1Bn.A0E(context, (1BY) null, 49976);
        Resources resources = context.getResources();
        this.A0B = new Ezg();
        C69e c69e = new C69e(resources);
        this.A0O = c69e;
        ((C69o) this.A0K).A02 = A0R;
        this.A0Q = ImmutableList.of();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0z, i, 0);
        this.A04 = obtainStyledAttributes.getInt(0, 8388659);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A01 = obtainStyledAttributes.getInteger(3, 0);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.A0C = obtainStyledAttributes.getBoolean(2, false);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        boolean z = obtainStyledAttributes.getBoolean(13, false);
        this.A0E = z;
        if (z) {
            5SA A00 = 5SA.A00();
            this.A08 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
            this.A0H = obtainStyledAttributes.getColor(14, 0);
            this.A0G = obtainStyledAttributes.getDimensionPixelSize(15, 0);
            A00.A05(this.A08, this.A0H);
            A00.A03(this.A0G);
            c69e.A0E = A00;
        }
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A0L = obtainStyledAttributes.getBoolean(17, false);
        this.A0J = obtainStyledAttributes.getDrawable(10);
        if (this.A0L) {
            r0.A08(obtainStyledAttributes.getColor(12, -1));
            r0.A0E(Layout.Alignment.ALIGN_CENTER);
            int resourceId = obtainStyledAttributes.getResourceId(11, 0);
            int dimensionPixelSize = resources.getDimensionPixelSize(2132279323);
            if (resourceId != 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, Eaj.A01);
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(1, resources.getDimensionPixelSize(2132279323));
                obtainStyledAttributes2.recycle();
            }
            r0.A09(dimensionPixelSize);
            this.A0I = DKC.A0A(1);
            this.A0I.setColor(obtainStyledAttributes.getColor(9, -6842473));
            this.A0D = obtainStyledAttributes.getBoolean(8, false);
            this.A09 = DKC.A0D();
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        if (drawable != null) {
            c69e.A05 = drawable;
        }
        obtainStyledAttributes.recycle();
    }

    private int A00() {
        this.A0F = Math.min(this.A0F, this.A0Q.size());
        int measuredWidth = getMeasuredWidth();
        int i = this.A00;
        int i2 = i;
        if (i <= 0) {
            i2 = 0;
        }
        int i3 = this.A05 + i2;
        int i4 = this.A02 + i3;
        return ((i4 == 0 ? 0 : ((((measuredWidth + i3) - getPaddingStart()) - getPaddingEnd()) - i) / i4) > this.A0F || !A05()) ? this.A0F : this.A0F - 1;
    }

    private int A01() {
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int measuredWidth = getMeasuredWidth();
        int A02 = (A02() - paddingStart) - paddingEnd;
        boolean A00 = C2rY.A00(7zL.A09());
        int i = this.A04;
        if (A00) {
            i = Gravity.getAbsoluteGravity(i, 1);
        }
        int i2 = i & 7;
        if (i2 == 5) {
            paddingStart = (measuredWidth - A02) - paddingStart;
        } else if (i2 == 1) {
            return paddingStart + ((((measuredWidth - A02) - paddingStart) - paddingEnd) / 2);
        }
        return paddingStart;
    }

    private int A02() {
        int i;
        int A00 = A00() + (A05() ? 1 : 0);
        int i2 = 0;
        int i3 = (A05() && this.A0D) ? (int) (this.A02 * 0.5f) : 0;
        int i4 = this.A02 * A00;
        if (A00 == 0) {
            i = 0;
        } else {
            int i5 = A00 - 1;
            int i6 = this.A00;
            if (i6 <= 0) {
                i6 = 0;
            }
            i = i5 * (this.A05 + i6);
        }
        int paddingStart = i4 + i + getPaddingStart() + getPaddingEnd();
        if (!this.A0L || this.A0F >= this.A0Q.size()) {
            i2 = this.A00;
        }
        return paddingStart + i2 + i3;
    }

    private void A03(Canvas canvas) {
        RectF rectF;
        if (this.A0A != null) {
            if (this.A0D) {
                rectF = this.A09;
                float f = this.A02 / 2;
                canvas.drawRoundRect(rectF, f, f, this.A0I);
            } else {
                boolean z = this.A0E;
                rectF = this.A09;
                if (z) {
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.A0I);
                } else {
                    canvas.drawRect(rectF, this.A0I);
                }
            }
            Drawable drawable = this.A0J;
            if (drawable != null) {
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable.draw(canvas);
            } else {
                canvas.translate(rectF.left, this.A06);
                this.A0A.draw(canvas);
                canvas.translate(-rectF.left, -this.A06);
            }
        }
    }

    public static void A04(FacepileView facepileView, List list) {
        facepileView.A0B = facepileView.A0B;
        if (list == null) {
            facepileView.A0Q = ImmutableList.of();
            facepileView.A0B.A00();
        } else {
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((RYM) it.next()).A01 != null) {
                    i++;
                }
            }
            while (true) {
                Ezg ezg = facepileView.A0B;
                if (ezg.A00.size() <= i) {
                    break;
                }
                ArrayList arrayList = ezg.A00;
                int A06 = DKC.A06(arrayList);
                69W r0 = (69W) arrayList.get(A06);
                if (ezg.A01) {
                    r0.A04();
                }
                arrayList.remove(A06);
            }
            while (facepileView.A0B.A00.size() < i) {
                facepileView.A0B.A03(new 69W(facepileView.A0O.A01()));
            }
            facepileView.A0Q = ImmutableList.copyOf((Collection) list);
        }
        facepileView.requestLayout();
        facepileView.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0 <= r301.A0F) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r302 = r0
            r0 = r302
            int r0 = r0.size()
            r303 = r0
            r0 = r301
            int r0 = r0.A01
            r304 = r0
            r0 = r303
            r1 = r304
            int r0 = java.lang.Math.max(r0, r1)
            r305 = r0
            r0 = r301
            boolean r0 = r0.A0L
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            r0 = r301
            int r0 = r0.A0F
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            r1 = r303
            if (r0 > r1) goto L30
        L2c:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L30:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.facepile.FacepileView.A05():boolean");
    }

    public void A06(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RYM(C0A2.A03(AnonymousClass001.A0i(it))));
            }
        } else {
            arrayList = null;
        }
        A04(this, arrayList);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1392315964);
        super.onAttachedToWindow();
        this.A0B.A01();
        0FI.A0C(1633243153, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-987253696);
        super.onDetachedFromWindow();
        this.A0B.A02();
        0FI.A0C(850532962, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (((A00() + (A05() ? 1 : 0)) % 2) == 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.facepile.FacepileView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A0B.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x02dc, code lost:
    
        if (((A00() + (A05() ? 1 : 0)) % 2) == 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0608  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 2185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.facepile.FacepileView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A0B.A02();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        1Du it = this.A0Q.iterator();
        while (it.hasNext()) {
            RYM rym = (RYM) it.next();
            if (rym != null && (rym.A00 == drawable || null == drawable)) {
                return true;
            }
        }
        return super.verifyDrawable(drawable);
    }
}
