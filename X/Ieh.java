package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* loaded from: Ieh.class */
public final class Ieh implements JNQ {
    public int A00;
    public int A01;
    public ICm A02;
    public int A03;
    public int A04;
    public TextureView A05;
    public boolean A06 = true;
    public final View.OnAttachStateChangeListener A08 = new IJR(this, 4);
    public final TextureView.SurfaceTextureListener A07 = new IJK(this, 4);

    public Ieh() {
    }

    public Ieh(View view, JNQ jnq) {
        this.A04 = jnq.AbL();
        this.A03 = jnq.AbK();
        CwS(view);
    }

    public int AbK() {
        return this.A03;
    }

    public int AbL() {
        return this.A04;
    }

    public Bitmap B4N() {
        try {
            Bitmap bitmap = this.A05.getBitmap();
            if (bitmap == null) {
                return null;
            }
            if (this.A02.A0K == H9N.A01 || !this.A06) {
                return bitmap;
            }
            return GOq.A0K(bitmap, this.A05.getTransform(null), getWidth(), getHeight());
        } catch (OutOfMemoryError | RuntimeException unused) {
            return null;
        }
    }

    public View BJw() {
        return this.A05;
    }

    public boolean BTa() {
        return !this.A02.A0G && this.A05.isAvailable() && this.A02.A0E && this.A05.isAttachedToWindow();
    }

    public void Cml(ICm iCm) {
        this.A02 = iCm;
    }

    public void Cmm(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
    }

    public void Cvg(Matrix matrix) {
        if (this.A06) {
            this.A05.setTransform(matrix);
        }
    }

    public void Cvi(boolean z) {
        this.A06 = z;
    }

    public void CwS(View view) {
        if (!(view instanceof TextureView)) {
            throw AnonymousClass001.A0L("Camera view must be a TextureView");
        }
        TextureView textureView = (TextureView) view;
        this.A05 = textureView;
        textureView.addOnAttachStateChangeListener(this.A08);
        this.A05.setSurfaceTextureListener(this.A07);
    }

    public Context getContext() {
        return this.A05.getContext();
    }

    public int getHeight() {
        return this.A05.getHeight() > 0 ? this.A05.getHeight() : this.A03;
    }

    public int getWidth() {
        return this.A05.getWidth() > 0 ? this.A05.getWidth() : this.A04;
    }

    public boolean isAvailable() {
        TextureView textureView = this.A05;
        boolean z = false;
        if (textureView != null) {
            if (!textureView.isAvailable()) {
                this.A05.requestLayout();
                return false;
            }
            if (this.A01 == 0 || this.A00 == 0) {
                this.A01 = getWidth();
                this.A00 = getHeight();
                HyC.A00(this.A02).CIv(this.A05.getSurfaceTexture(), this.A01, this.A00);
            }
            z = true;
        }
        return z;
    }

    public void release() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            textureView.removeOnAttachStateChangeListener(this.A08);
            this.A05.setSurfaceTextureListener(null);
        }
    }
}
