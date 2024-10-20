package com.facebook.samples.zoomable;

import X.0Cp;
import X.0FI;
import X.4YT;
import X.4gI;
import X.4gJ;
import X.AbstractC2326GOr;
import X.C69e;
import X.C69f;
import X.C69v;
import X.C69w;
import X.C69x;
import X.C6dW;
import X.DKC;
import X.GOn;
import X.GOo;
import X.GTn;
import X.GzR;
import X.I1o;
import X.I7c;
import X.IDm;
import X.IgJ;
import X.InterfaceC07034in;
import X.JKT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;
import java.util.List;

/* loaded from: ZoomableDraweeView.class */
public class ZoomableDraweeView extends DraweeView implements 0Cp {
    public IDm A00;
    public boolean A01;
    public boolean A02;
    public GestureDetector A03;
    public final 4gJ A04;
    public final GTn A05;
    public final RectF A06;
    public final RectF A07;
    public final JKT A08;

    public ZoomableDraweeView(Context context) {
        super(context);
        this.A06 = DKC.A0D();
        this.A07 = DKC.A0D();
        this.A04 = AbstractC2326GOr.A0E(this);
        this.A08 = new IgJ(this);
        this.A05 = new GTn();
        A01(context, null);
        A00();
    }

    public ZoomableDraweeView(Context context, C69f c69f) {
        super(context);
        this.A06 = DKC.A0D();
        this.A07 = DKC.A0D();
        this.A04 = AbstractC2326GOr.A0E(this);
        this.A08 = new IgJ(this);
        this.A05 = new GTn();
        A05(c69f);
        A00();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = DKC.A0D();
        this.A07 = DKC.A0D();
        this.A04 = AbstractC2326GOr.A0E(this);
        this.A08 = new IgJ(this);
        this.A05 = new GTn();
        A01(context, attributeSet);
        A00();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = DKC.A0D();
        this.A07 = DKC.A0D();
        this.A04 = AbstractC2326GOr.A0E(this);
        this.A08 = new IgJ(this);
        this.A05 = new GTn();
        A01(context, attributeSet);
        A00();
    }

    private void A00() {
        RectF rectF = IDm.A0C;
        GzR gzR = new GzR(new I1o(new I7c()));
        this.A00 = gzR;
        ((IDm) gzR).A02 = this.A08;
        this.A03 = new GestureDetector(getContext(), (GestureDetector.OnGestureListener) this.A05);
    }

    private void A01(Context context, AttributeSet attributeSet) {
        C69e c69e = new C69e(context.getResources());
        c69e.A02(InterfaceC07034in.A04);
        C6dW.A02(context, attributeSet, c69e);
        A04(c69e.A00);
        A05(c69e.A01());
    }

    public static void A02(C69w c69w, ZoomableDraweeView zoomableDraweeView) {
        C69w c69w2 = ((DraweeView) zoomableDraweeView).A00.A01;
        if (c69w2 instanceof C69v) {
            C69v c69v = (C69v) c69w2;
            4gI r0 = zoomableDraweeView.A04;
            r0.getClass();
            4gI r02 = c69v.A01;
            if (r02 instanceof C69x) {
                4gI r03 = r02;
                synchronized (r03) {
                    List list = r03.A00;
                    int indexOf = list.indexOf(r0);
                    if (indexOf != -1) {
                        list.set(indexOf, null);
                    }
                }
            } else if (r02 == r0) {
                c69v.A01 = null;
            }
        }
        if (c69w instanceof C69v) {
            ((C69v) c69w).A0E(zoomableDraweeView.A04);
        }
        super.A06(c69w);
    }

    public static void A03(ZoomableDraweeView zoomableDraweeView) {
        RectF rectF = zoomableDraweeView.A06;
        C69f c69f = ((DraweeView) zoomableDraweeView).A00.A00;
        c69f.getClass();
        c69f.A04.A02(rectF);
        RectF rectF2 = zoomableDraweeView.A07;
        rectF2.set(0.0f, 0.0f, DKC.A02(zoomableDraweeView), DKC.A03(zoomableDraweeView));
        IDm iDm = zoomableDraweeView.A00;
        RectF rectF3 = iDm.A06;
        if (!rectF.equals(rectF3)) {
            rectF3.set(rectF);
            IDm.A01(iDm);
        }
        zoomableDraweeView.A00.A08.set(rectF2);
        zoomableDraweeView.hashCode();
    }

    @Override // com.facebook.drawee.view.DraweeView
    public void A06(C69w c69w) {
        A02(null, this);
        IDm iDm = this.A00;
        iDm.A03 = false;
        iDm.A04();
        A02(c69w, this);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return (int) this.A00.A08.width();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        IDm iDm = this.A00;
        return (int) (iDm.A08.left - iDm.A07.left);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return (int) this.A00.A07.width();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return (int) this.A00.A08.height();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        IDm iDm = this.A00;
        return (int) (iDm.A08.top - iDm.A07.top);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return (int) this.A00.A07.height();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object A0B;
        int save = canvas.save();
        canvas.concat(this.A00.A04);
        try {
            super.onDraw(canvas);
            canvas.restoreToCount(save);
        } catch (Exception e) {
            C69w c69w = super.A00.A01;
            if (c69w != null && (c69w instanceof C69v) && (A0B = ((C69v) c69w).A0B()) != null) {
                throw new RuntimeException(String.format(4YT.A00(222), GOo.A1a(A0B)), e);
            }
            throw e;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hashCode();
        super.onLayout(z, i, i2, i3, i4);
        A03(this);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(1317926661);
        motionEvent.getActionMasked();
        hashCode();
        boolean z = true;
        if (this.A03.onTouchEvent(motionEvent)) {
            hashCode();
            i = -508235156;
        } else if (this.A00.A08(motionEvent)) {
            hashCode();
            if (!this.A01 && !this.A00.A07()) {
                GOn.A1O(this, true);
            }
            i = 1913471510;
        } else if (super.onTouchEvent(motionEvent)) {
            hashCode();
            i = 353779372;
        } else {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.A03.onTouchEvent(obtain);
            this.A00.A08(obtain);
            obtain.recycle();
            z = false;
            i = 1095980062;
        }
        0FI.A0B(i, A05);
        return z;
    }
}
