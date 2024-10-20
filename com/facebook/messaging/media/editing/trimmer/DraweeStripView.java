package com.facebook.messaging.media.editing.trimmer;

import X.0FI;
import X.5CC;
import X.5SA;
import X.69W;
import X.7zL;
import X.AbF;
import X.C69e;
import X.C69f;
import X.C69w;
import X.DKC;
import X.Ezg;
import X.HhN;
import X.IPT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import java.util.LinkedList;

/* loaded from: DraweeStripView.class */
public class DraweeStripView extends View {
    public int A00;
    public int A01;
    public Rect A02;
    public Rect A03;
    public SparseArray A04;
    public 5SA A05;
    public 5SA A06;
    public HhN A07;
    public LinkedList A08;
    public Ezg A09;

    public DraweeStripView(Context context) {
        super(context);
        A00(context);
    }

    public DraweeStripView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public DraweeStripView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A09 = new Ezg();
        this.A08 = AbF.A1F();
        this.A04 = DKC.A0E();
        float A01 = 7zL.A01(context.getResources(), 2132279379);
        5SA r0 = new 5SA();
        r0.A04(A01, 0.0f, 0.0f, A01);
        this.A05 = r0;
        5SA r02 = new 5SA();
        r02.A04(0.0f, A01, A01, 0.0f);
        this.A06 = r02;
        int i = 0;
        do {
            69W r03 = new 69W(new C69e(getResources()).A01());
            r03.A02().setCallback(this);
            this.A08.add(r03);
            this.A09.A03(r03);
            i++;
        } while (i < 20);
        this.A02 = DKC.A0C();
        this.A03 = DKC.A0C();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1241961785);
        super.onAttachedToWindow();
        this.A09.A01();
        0FI.A0C(-1906018627, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1074870735);
        super.onDetachedFromWindow();
        this.A09.A02();
        0FI.A0C(-1504868457, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        5CC r303 = null;
        int i = 0;
        while (i < this.A00) {
            SparseArray sparseArray = this.A04;
            5CC A02 = ((69W) sparseArray.valueAt(i)).A02();
            this.A03.set(((IPT) this.A07.A04.get(sparseArray.keyAt(i))).A01);
            if (r303 != null) {
                Rect rect = this.A03;
                r303.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                r303.draw(canvas);
            }
            Rect rect2 = this.A03;
            A02.setBounds(rect2.left, rect2.top, rect2.right, rect2.bottom);
            A02.setAlpha(255);
            A02.draw(canvas);
            i++;
            r303 = A02;
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A09.A01();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A09.A02();
    }

    @Override // android.view.View
    public void setScrollX(int i) {
        69W r0;
        C69f c69f;
        5SA r303;
        super.setScrollX(i);
        getDrawingRect(this.A02);
        int i2 = this.A00;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            this.A03.set(((IPT) this.A07.A04.get(this.A04.keyAt(i2))).A01);
            if (!Rect.intersects(this.A02, this.A03)) {
                69W r02 = (69W) this.A04.valueAt(i2);
                r02.A06((C69w) null);
                this.A04.removeAt(i2);
                this.A08.add(r02);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.A01) {
                this.A00 = this.A04.size();
                return;
            }
            if (this.A04.get(i4) == null) {
                this.A03.set(((IPT) this.A07.A04.get(i4)).A01);
                if (Rect.intersects(this.A02, this.A03) && (r0 = (69W) this.A08.poll()) != null) {
                    r0.A06(((IPT) this.A07.A04.get(i4)).A03);
                    this.A04.put(i4, r0);
                    if (i4 == 0) {
                        c69f = r0.A00;
                        c69f.getClass();
                        r303 = this.A05;
                    } else {
                        int i5 = this.A01 - 1;
                        c69f = r0.A00;
                        c69f.getClass();
                        r303 = i4 == i5 ? this.A06 : null;
                    }
                    c69f.A0A(r303);
                }
            }
            i3 = i4 + 1;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        Ezg ezg = this.A09;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= ezg.A00.size()) {
                break;
            }
            if (drawable == ((69W) ezg.A00.get(i2)).A02()) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }
}
