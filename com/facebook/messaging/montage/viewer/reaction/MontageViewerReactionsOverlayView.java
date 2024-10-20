package com.facebook.messaging.montage.viewer.reaction;

import X.C62j;
import X.C66h;
import X.C66i;
import X.GOo;
import X.GOp;
import X.H0C;
import X.HTp;
import X.Hna;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: MontageViewerReactionsOverlayView.class */
public class MontageViewerReactionsOverlayView extends CustomFrameLayout {
    public HTp A00;
    public C62j A01;
    public final int A02;
    public final Hna A03;
    public final C66i A04;

    public MontageViewerReactionsOverlayView(Context context) {
        this(context, null);
    }

    public MontageViewerReactionsOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerReactionsOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = GOp.A0x();
        this.A03 = new Hna(this);
        this.A02 = GOo.A01(getResources());
        C66i c66i = new C66i(this.A01);
        c66i.A09(C66h.A01());
        c66i.A06 = true;
        c66i.A02();
        c66i.A06(0.0d);
        c66i.A0A(new H0C(this, 4));
        this.A04 = c66i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.JD2] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.Hb3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(X.HU3 r302) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsOverlayView.A0V(X.HU3):void");
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.drawColor(Color.argb((int) this.A04.A09.A00, 0, 0, 0));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i = this.A02;
        return new FrameLayout.LayoutParams(i, i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        int i = this.A02;
        return new FrameLayout.LayoutParams(i, i);
    }
}
