package com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview;

import X.0FI;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1HG;
import X.4YU;
import X.GTm;
import X.GTw;
import X.GqE;
import X.Hnk;
import X.I9M;
import X.JNq;
import X.JQv;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView;

/* loaded from: ViEAndroidGLES20ScaledSurfaceView.class */
public final class ViEAndroidGLES20ScaledSurfaceView extends ViEAndroidGLES20SurfaceView implements JQv {
    public float A00;
    public float A01;
    public float A02;
    public GestureDetector A03;
    public ScaleGestureDetector A04;
    public Hnk A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public final PointF A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final JNq A0C;
    public final ScaleGestureDetector.OnScaleGestureListener A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViEAndroidGLES20ScaledSurfaceView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0A = 1HG.A00(4YU.A08(this), 115775);
        this.A0B = 1BK.A0C();
        this.A09 = new PointF();
        this.A00 = 1.0f;
        this.A06 = 0S2.A00;
        this.A0C = new GqE(this);
        this.A0D = new GTw(this, 0);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViEAndroidGLES20ScaledSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        this.A0A = 1HG.A00(4YU.A08(this), 115775);
        this.A0B = 1BK.A0C();
        this.A09 = new PointF();
        this.A00 = 1.0f;
        this.A06 = 0S2.A00;
        this.A0C = new GqE(this);
        this.A0D = new GTw(this, 0);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViEAndroidGLES20ScaledSurfaceView(Context context, boolean z, int i, int i2) {
        super(context);
        11T.A0F(context, 1);
        this.A0A = 1HG.A00(4YU.A08(this), 115775);
        this.A0B = 1BK.A0C();
        this.A09 = new PointF();
        this.A00 = 1.0f;
        this.A06 = 0S2.A00;
        this.A0C = new GqE(this);
        this.A0D = new GTw(this, 0);
        A00();
    }

    private final void A00() {
        Context context = getContext();
        this.A04 = new ScaleGestureDetector(context, this.A0D);
        this.A03 = new GestureDetector(context, (GestureDetector.OnGestureListener) new GTm(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r301.A02 != 0.0f) goto L8;
     */
    @Override // X.JQv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Chi(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.widgets.videoparticipantview.ViEAndroidGLES20ScaledSurfaceView.Chi(java.lang.String):void");
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(574540984);
        super.onAttachedToWindow();
        if (this.A07 && !this.A08) {
            this.A08 = true;
            ((I9M) 1Br.A0B(this.A0A)).A03(this.A0C, 230);
        }
        0FI.A0C(1964737780, A06);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(583312157);
        if (this.A08) {
            this.A08 = false;
            ((I9M) 1Br.A0B(this.A0A)).A02(this.A0C);
        }
        super.onDetachedFromWindow();
        0FI.A0C(-1034948954, A06);
    }
}
