package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* loaded from: Ieg.class */
public final class Ieg implements JNQ {
    public SurfaceView A00;
    public ICm A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public final View.OnAttachStateChangeListener A07 = new IJR(this, 3);
    public final SurfaceHolder.Callback A06 = new IJE(this, 2);

    public Ieg() {
    }

    public Ieg(View view, JNQ jnq) {
        this.A05 = jnq.AbL();
        this.A04 = jnq.AbK();
        CwS(view);
    }

    public int AbK() {
        return this.A04;
    }

    public int AbL() {
        return this.A05;
    }

    public Bitmap B4N() {
        return null;
    }

    public View BJw() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r301.A00.isAttachedToWindow() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BTa() {
        /*
            r301 = this;
            r0 = r301
            X.ICm r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0G
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L32
            r0 = r301
            boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L32
            r0 = r302
            boolean r0 = r0.A0E
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L32
            r0 = r301
            android.view.SurfaceView r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = r0.isAttachedToWindow()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L36
        L32:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L36:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ieg.BTa():boolean");
    }

    public void Cml(ICm iCm) {
        this.A01 = iCm;
    }

    public void Cmm(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    public void Cvg(Matrix matrix) {
    }

    public void Cvi(boolean z) {
    }

    public void CwS(View view) {
        if (!(view instanceof SurfaceView)) {
            throw AnonymousClass001.A0L("Camera view must be a SurfaceView");
        }
        this.A02 = false;
        SurfaceView surfaceView = (SurfaceView) view;
        this.A00 = surfaceView;
        surfaceView.addOnAttachStateChangeListener(this.A07);
        this.A00.getHolder().addCallback(this.A06);
    }

    public Context getContext() {
        return this.A00.getContext();
    }

    public int getHeight() {
        return this.A00.getHeight() > 0 ? this.A00.getHeight() : this.A04;
    }

    public int getWidth() {
        return this.A00.getWidth() > 0 ? this.A00.getWidth() : this.A05;
    }

    public boolean isAvailable() {
        SurfaceView surfaceView = this.A00;
        if (surfaceView == null) {
            return false;
        }
        this.A02 = true;
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface() == null || !holder.getSurface().isValid()) {
            return false;
        }
        this.A06.surfaceCreated(holder);
        return false;
    }

    public void release() {
        this.A02 = false;
        SurfaceView surfaceView = this.A00;
        if (surfaceView != null) {
            surfaceView.removeOnAttachStateChangeListener(this.A07);
            this.A00.getHolder().removeCallback(this.A06);
        }
    }
}
