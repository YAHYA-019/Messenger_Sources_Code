package com.facebook.drawee.view;

import X.0FI;
import X.2D9;
import X.4YV;
import X.69W;
import X.6dV;
import X.C2qv;
import X.C46q;
import X.C69f;
import X.C69w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* loaded from: DraweeView.class */
public class DraweeView extends ImageView {
    public 69W A00;
    public float A01;
    public boolean A02;
    public final 6dV A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6dV] */
    public DraweeView(Context context) {
        super(context);
        this.A03 = new Object();
        this.A01 = 0.0f;
        this.A02 = false;
        A00();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6dV] */
    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Object();
        this.A01 = 0.0f;
        this.A02 = false;
        A00();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6dV] */
    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Object();
        this.A01 = 0.0f;
        this.A02 = false;
        A00();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6dV] */
    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A03 = new Object();
        this.A01 = 0.0f;
        this.A02 = false;
        A00();
    }

    private void A00() {
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("DraweeView#init");
            }
            if (!this.A02) {
                this.A02 = true;
                this.A00 = new 69W((C69f) null);
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                }
            }
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }

    public void A04(float f) {
        if (f != this.A01) {
            this.A01 = f;
            requestLayout();
        }
    }

    public void A05(C69f c69f) {
        this.A00.A05(c69f);
        super.setImageDrawable(this.A00.A02());
    }

    public void A06(C69w c69w) {
        this.A00.A06(c69w);
        super.setImageDrawable(this.A00.A02());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(930797655);
        super.onAttachedToWindow();
        this.A00.A03();
        0FI.A0C(-913680866, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1346235683);
        super.onDetachedFromWindow();
        this.A00.A04();
        0FI.A0C(-1658255030, A06);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A00.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        if (r0 == (-2)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        if (r0 == (-2)) goto L10;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.view.DraweeView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A00.A04();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = 0FI.A05(-2129966317);
        if (this.A00.A08(motionEvent)) {
            onTouchEvent = true;
            i = -1852445464;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = 1964668756;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        A00();
        this.A00.A06((C69w) null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        A00();
        this.A00.A06((C69w) null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        A00();
        this.A00.A06((C69w) null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        A00();
        this.A00.A06((C69w) null);
        super.setImageURI(uri);
    }

    @Override // android.view.View
    public String toString() {
        C46q A00 = C2qv.A00(this);
        69W r0 = this.A00;
        C46q.A00(A00, r0 != null ? r0.toString() : "<no holder set>", "holder");
        return A00.toString();
    }
}
