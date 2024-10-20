package com.facebook.fboptic;

import X.0FI;
import X.AnonymousClass001;
import X.DKC;
import X.GOn;
import X.GOo;
import X.GTg;
import X.GTt;
import X.GTx;
import X.HBx;
import X.HCB;
import X.HNz;
import X.IEg;
import X.IS6;
import X.IS7;
import X.J4z;
import X.JIA;
import X.JKz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.TextureView;

/* loaded from: CameraPreviewView.class */
public class CameraPreviewView extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public OrientationEventListener A04;
    public HCB A05;
    public JKz A06;
    public HBx A07;
    public HBx A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public GestureDetector A0C;
    public ScaleGestureDetector A0D;

    public CameraPreviewView(Context context) {
        this(context, null);
    }

    public CameraPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.JKz] */
    public CameraPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HCB hcb;
        this.A04 = null;
        HCB hcb2 = HCB.A02;
        this.A05 = hcb2;
        this.A06 = new Object();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, HNz.A01, 0, 0);
        try {
            this.A08 = HBx.A00(obtainStyledAttributes.getInt(5, 0));
            this.A07 = HBx.A00(obtainStyledAttributes.getInt(3, 0));
            boolean z = true;
            this.A09 = obtainStyledAttributes.getBoolean(0, true);
            int i2 = obtainStyledAttributes.getInt(1, hcb2.infoId);
            HCB[] values = HCB.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= length) {
                    hcb = hcb2;
                    break;
                }
                hcb = values[i4];
                if (hcb.infoId == i2) {
                    break;
                } else {
                    i3 = i4 + 1;
                }
            }
            this.A05 = hcb;
            int i5 = obtainStyledAttributes.getInt(4, 3);
            this.A0A = AnonymousClass001.A1Q(i5 & 1, 1);
            this.A0B = (i5 & 2) != 2 ? false : z;
            boolean z2 = obtainStyledAttributes.getBoolean(2, false);
            IEg iEg = IEg.A0O;
            iEg.A01 = 0;
            iEg.A0D = z2;
            obtainStyledAttributes.recycle();
            setSurfaceTextureListener(this);
            this.A0C = new GestureDetector(context, (GestureDetector.OnGestureListener) new GTg(this));
            this.A0D = new ScaleGestureDetector(context, new GTx(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void A00(CameraPreviewView cameraPreviewView, int i, int i2, int i3, int i4) {
        Matrix transform = cameraPreviewView.getTransform(GOn.A0F());
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        IEg iEg = IEg.A0O;
        int A00 = IEg.A00(iEg.A05, iEg.A00);
        if (A00 == 90 || A00 == 270) {
            i4 = i3;
            i3 = i4;
        }
        float f4 = i3;
        float f5 = i4;
        float f6 = f4 / f5 > f3 ? f2 / f5 : f / f4;
        transform.setScale((f4 / f) * f6, (f5 / f2) * f6, i / 2, i2 / 2);
        cameraPreviewView.setTransform(transform);
        RectF rectF = new RectF(0.0f, 0.0f, DKC.A02(cameraPreviewView), DKC.A03(cameraPreviewView));
        transform.mapRect(rectF);
        Matrix A0F = GOn.A0F();
        float f7 = 1.0f;
        if (iEg.A05 == HCB.A03) {
            f7 = -1.0f;
        }
        A0F.setScale(f7, 1.0f);
        A0F.postRotate(IEg.A00(iEg.A05, iEg.A00));
        Matrix A0F2 = GOn.A0F();
        A0F2.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), rectF, Matrix.ScaleToFit.FILL);
        A0F.setConcat(A0F2, A0F);
        Matrix A0F3 = GOn.A0F();
        cameraPreviewView.A03 = A0F3;
        A0F.invert(A0F3);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1091775525);
        super.onAttachedToWindow();
        Context context = getContext();
        GTt gTt = this.A04;
        if (gTt == null) {
            gTt = new GTt(context, this, 0);
            this.A04 = gTt;
        }
        if (gTt.canDetectOrientation()) {
            this.A04.enable();
        }
        0FI.A0C(-906293780, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2055410452);
        super.onDetachedFromWindow();
        OrientationEventListener orientationEventListener = this.A04;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        IEg iEg = IEg.A0O;
        synchronized (this) {
        }
        iEg.A08 = null;
        0FI.A0C(1030079223, A06);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        IEg iEg = IEg.A0O;
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        HCB hcb = this.A05;
        int A04 = GOo.A04(GOo.A0G(getContext()));
        int i3 = this.A02;
        int i4 = this.A01;
        HBx hBx = this.A07;
        HBx hBx2 = this.A08;
        iEg.A07(surfaceTexture2, new IS7(this, 1), hcb, this.A06, hBx, hBx2, A04, i3, i4, 30, 0, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IEg.A0O.A08((JIA) null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        int A04 = GOo.A04(GOo.A0G(getContext()));
        GOo.A1G(new IS6(this, A04), new J4z(A04, 1, IEg.A0O));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(1843169341, 0FI.A05(-537659563));
        return false;
    }
}
