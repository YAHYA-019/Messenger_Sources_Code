package com.facebook.messaging.reactions;

import X.0FI;
import X.7sO;
import X.C09s;
import X.C2rY;
import X.C62n;
import X.C9ua;
import X.Hnc;
import X.LWg;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MessageReactionsOverlayView.class */
public class MessageReactionsOverlayView extends CustomFrameLayout {
    public View A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public FbDraweeView A04;
    public C62n A05;
    public FastMessageReactionsPanelView A06;
    public Hnc A07;
    public 7sO A08;
    public C9ua A09;
    public Capabilities A0A;
    public boolean A0B;
    public boolean A0C;
    public float[] A0D;
    public final Point A0E;

    public MessageReactionsOverlayView(Context context) {
        super(context);
        this.A0E = new Point();
        this.A0C = false;
        this.A0B = false;
        A00();
    }

    public MessageReactionsOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = new Point();
        this.A0C = false;
        this.A0B = false;
        A00();
    }

    public MessageReactionsOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = new Point();
        this.A0C = false;
        this.A0B = false;
        A00();
    }

    private void A00() {
        A0U(2132542549);
        this.A01 = (ViewGroup) C09s.A01(this, 2131365632);
        this.A06 = (FastMessageReactionsPanelView) C09s.A01(this, 2131363989);
        this.A03 = (ImageView) C09s.A01(this, 2131365630);
        this.A04 = (FbDraweeView) C09s.A01(this, 2131365631);
        this.A05 = new C62n(new LWg(this, 0), null);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1441860414);
        super.onAttachedToWindow();
        this.A05.A00();
        0FI.A0C(792966740, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(435054702);
        super.onDetachedFromWindow();
        this.A05.A01();
        0FI.A0C(287019965, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ViewGroup viewGroup;
        int i6;
        7sO r0;
        View view;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = this.A0C;
        Resources resources = getResources();
        int i8 = 2132279306;
        if (z2) {
            i8 = 2132279369;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i8);
        if (this.A0D != null) {
            int i9 = 2132279437;
            if (this.A0C) {
                i9 = 2132279368;
            }
            i5 = ((int) this.A0D[1]) - resources.getDimensionPixelSize(i9);
        } else {
            i5 = this.A0E.y - dimensionPixelSize;
        }
        View view2 = this.A00;
        if (view2 != null) {
            if (i5 > view2.getTop()) {
                i5 = this.A00.getTop() - dimensionPixelSize;
            }
        }
        int measuredHeight = this.A01.getMeasuredHeight();
        int i10 = i5 - measuredHeight;
        if (i10 < 0) {
            i10 = 0;
            i5 = measuredHeight;
        }
        if (this.A0C) {
            View view3 = this.A00;
            if (view3 != null) {
                view3.setAlpha(0.0f);
                float bottom = this.A00.getBottom() - this.A00.getTop();
                int dimensionPixelSize2 = i5 + resources.getDimensionPixelSize(2132279327);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(2132279327);
                this.A00.setTop(dimensionPixelSize2);
                this.A00.setBottom((int) (dimensionPixelSize2 + bottom));
                Context context = getContext();
                boolean A00 = C2rY.A00(context);
                int i11 = 0;
                boolean z3 = this.A0B;
                if (A00 ? z3 : !z3) {
                    if (context.getResources().getBoolean(2131034121)) {
                        i11 = context.getResources().getDimensionPixelSize(2131165235);
                    }
                    int i12 = dimensionPixelSize3 + i11;
                    this.A01.setLeft(i12);
                    this.A00.setLeft(i12);
                    view = this.A00;
                    i7 = view.getRight() + dimensionPixelSize3 + i11;
                } else {
                    int i13 = context.getResources().getDisplayMetrics().widthPixels;
                    int right = this.A01.getRight() - this.A01.getLeft();
                    int right2 = this.A00.getRight() - this.A00.getLeft();
                    this.A01.setLeft((i13 - right) - dimensionPixelSize3);
                    this.A00.setLeft((i13 - right2) - dimensionPixelSize3);
                    view = this.A00;
                    i7 = i13 - dimensionPixelSize3;
                }
                view.setRight(i7);
            }
        } else {
            Context context2 = getContext();
            if (context2.getResources().getBoolean(2131034121)) {
                int dimensionPixelSize4 = resources.getDimensionPixelSize(2132279327);
                if (this.A0B) {
                    int i14 = context2.getResources().getDisplayMetrics().widthPixels;
                    int right3 = this.A01.getRight() - this.A01.getLeft();
                    viewGroup = this.A01;
                    i6 = (i14 - right3) - dimensionPixelSize4;
                } else {
                    int dimensionPixelSize5 = context2.getResources().getDimensionPixelSize(2131165235);
                    viewGroup = this.A01;
                    i6 = dimensionPixelSize4 + dimensionPixelSize5;
                }
                viewGroup.setLeft(i6);
            }
        }
        this.A01.setBottom(i5);
        this.A01.setTop(i10);
        if (!this.A0C || (r0 = this.A08) == null) {
            return;
        }
        r0.A00(50);
    }
}
