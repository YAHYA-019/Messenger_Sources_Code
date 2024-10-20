package com.facebook.maps;

import X.1BK;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1GS;
import X.1Hv;
import X.1vL;
import X.2DX;
import X.7zL;
import X.C00i;
import X.C1oo;
import X.C67J;
import X.DKC;
import X.DKD;
import X.GOn;
import X.GOp;
import X.JYk;
import X.JlH;
import X.L88;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: FbStaticMapView.class */
public class FbStaticMapView extends JYk implements CallerContextable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public ImageView A05;
    public 2DX A06;
    public String A07;
    public 1vL A08;
    public C67J A09;
    public final JlH A0A;
    public final C00i A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public FbStaticMapView(Context context) {
        super(context);
        this.A0A = (JlH) 1Hv.A02(getContext(), 131244);
        this.A0B = 1BQ.A00();
        A00(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbStaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = (JlH) 1Hv.A02(getContext(), 131244);
        this.A0B = 1BQ.A00();
        A00(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbStaticMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = (JlH) 1Hv.A02(getContext(), 131244);
        this.A0B = 1BQ.A00();
        A00(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(Context context, AttributeSet attributeSet, int i) {
        this.A09 = (C67J) 1Bn.A0A(66170);
        this.A08 = (1vL) 1Bi.A03(99939);
        this.A06 = GOp.A0H();
        1GS r0 = (1GS) 1Bi.A03(16504);
        L88 l88 = (L88) 1Bn.A0E(context, (1BY) null, 131141);
        this.A07 = r0.A01();
        l88.A01();
        GOn.A1N(getResources(), this, 2131959069);
        this.A04 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1J, i, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        JYk.A0N = 1BK.A0N(this.A0B).AZk(36313918422981883L) ? "png" : "jpg";
        if (getId() == -1) {
            setId(2131367563);
        }
        ((JYk) this).A08 = this.A0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        if (this.A02 <= 0 && this.A03 <= 0 && this.A01 <= 0 && this.A00 <= 0) {
            super.onDraw(canvas);
            return;
        }
        Bitmap A0C = 7zL.A0C(this.A06.A03(getWidth(), getHeight()));
        super.onDraw(new Canvas(A0C));
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Bitmap A0C2 = 7zL.A0C(this.A06.A03(getWidth(), getHeight()));
        Canvas canvas2 = new Canvas(A0C2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = this.A02;
        float f2 = this.A03;
        float f3 = this.A01;
        float f4 = this.A00;
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        gradientDrawable.setColor(-12434878);
        gradientDrawable.setBounds(paddingLeft, paddingTop, width, height);
        gradientDrawable.draw(canvas2);
        Paint A09 = DKC.A09();
        Rect rect = new Rect(paddingLeft, paddingTop, width, height);
        DKD.A19(A09, PorterDuff.Mode.SRC_IN);
        canvas2.drawBitmap(A0C, rect, rect, A09);
        canvas.drawBitmap(A0C2, 0.0f, 0.0f, DKC.A09());
    }
}
