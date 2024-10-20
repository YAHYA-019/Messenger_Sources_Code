package com.facebook.messaging.montage.composer.cameracore.view;

import X.11T;
import X.C09s;
import X.DKF;
import X.DKG;
import X.Htn;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CompositeCapturePreviewView.class */
public final class CompositeCapturePreviewView extends CustomFrameLayout {
    public final Htn A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeCapturePreviewView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeCapturePreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeCapturePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A0U(2132542636);
        this.A00 = new Htn(C09s.A01(this, 2131364131));
    }

    public /* synthetic */ CompositeCapturePreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A00.A01(i, i2, i3, i4);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A00(i, i2);
    }
}
