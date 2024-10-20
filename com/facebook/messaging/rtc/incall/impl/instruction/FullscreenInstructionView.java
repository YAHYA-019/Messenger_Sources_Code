package com.facebook.messaging.rtc.incall.impl.instruction;

import X.0FI;
import X.4YU;
import X.7zL;
import X.C00i;
import X.GOq;
import X.GS2;
import X.GSD;
import X.IZb;
import X.JDB;
import X.JFq;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.resources.ui.FbTextView;

/* loaded from: FullscreenInstructionView.class */
public class FullscreenInstructionView extends FbTextView implements JFq {
    public C00i A00;
    public final AnimatorListenerAdapter A01;

    /* JADX WARN: Multi-variable type inference failed */
    public FullscreenInstructionView(Context context) {
        super(context);
        this.A01 = new GSD(this, 10);
        this.A00 = 7zL.A0R(getContext(), 115299);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullscreenInstructionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new GSD(this, 10);
        this.A00 = 7zL.A0R(getContext(), 115299);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FullscreenInstructionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = new GSD(this, 10);
        this.A00 = 7zL.A0R(getContext(), 115299);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZb iZb = (IZb) jdb;
        if (!iZb.A01) {
            if (getVisibility() != 8) {
                clearAnimation();
                GOq.A0O(this).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(this.A01);
                return;
            }
            return;
        }
        String str = iZb.A00;
        setText(str);
        if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
            GOq.A0P(this).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(null);
            announceForAccessibility(str);
        }
    }

    @Override // com.facebook.resources.ui.FbTextView
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-103338568);
        super.onAttachedToWindow();
        ((GS2) 4YU.A0p(this.A00)).A0Y(this);
        0FI.A0C(575503362, A06);
    }

    @Override // com.facebook.resources.ui.FbTextView
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(868246976);
        ((GS2) 4YU.A0p(this.A00)).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-556357302, A06);
    }
}
