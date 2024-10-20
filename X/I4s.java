package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* loaded from: I4s.class */
public final class I4s {
    public final int A00;
    public final float[] A01 = GOn.A1a();
    public final I5G A02;
    public final Object A03;
    public volatile int A04;
    public volatile int A05;
    public volatile long A06;
    public volatile I5d A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public I4s(I5G i5g, Object obj) {
        this.A02 = i5g;
        this.A03 = obj;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        A00("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        A00(0Pz.A0T("glBindTexture ", i));
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        A00("glTexParameter");
        this.A00 = i;
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String A0j = 0Pz.A0j(str, ": glError 0x", Integer.toHexString(glGetError));
        android.util.Log.e("EglSurfaceInput", A0j);
        throw AnonymousClass001.A0T(A0j);
    }

    public void A01() {
        I5d i5d = this.A07;
        this.A07 = null;
        if (i5d != null) {
            synchronized (i5d) {
                try {
                    SurfaceTexture surfaceTexture = i5d.A0C;
                    if (surfaceTexture != null) {
                        this.A02.A01();
                        synchronized (this.A03) {
                            surfaceTexture.detachFromGLContext();
                        }
                        if (this.A08) {
                            surfaceTexture.setOnFrameAvailableListener(null);
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            this.A08 = false;
        }
    }

    public void A02(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, I5d i5d) {
        SurfaceTexture surfaceTexture;
        if (i5d != this.A07) {
            A01();
            synchronized (i5d) {
                try {
                    surfaceTexture = i5d.A0C;
                } catch (RuntimeException unused) {
                }
                if (surfaceTexture == null) {
                    return;
                }
                if (onFrameAvailableListener != null) {
                    this.A02.A01();
                    surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener);
                    synchronized (this.A03) {
                        surfaceTexture.updateTexImage();
                    }
                }
                this.A07 = i5d;
                this.A08 = AnonymousClass001.A1T(onFrameAvailableListener);
            }
        }
    }

    public boolean A03(SurfaceTexture surfaceTexture) {
        long timestamp;
        I5d i5d = this.A07;
        if (i5d == null) {
            return false;
        }
        if (surfaceTexture == null) {
            surfaceTexture = i5d.A0C;
        }
        if (i5d.A0C != surfaceTexture) {
            return false;
        }
        try {
            this.A02.A01();
            synchronized (this.A03) {
                try {
                    synchronized (i5d) {
                        SurfaceTexture surfaceTexture2 = i5d.A0C;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.updateTexImage();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            synchronized (i5d) {
                try {
                    SurfaceTexture surfaceTexture3 = i5d.A0C;
                    timestamp = surfaceTexture3 != null ? surfaceTexture3.getTimestamp() : 0L;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            this.A06 = timestamp;
            this.A05 = i5d.A0B;
            this.A04 = i5d.A06;
            this.A09 = i5d.A0G;
            float[] fArr = this.A01;
            synchronized (i5d) {
                SurfaceTexture surfaceTexture4 = i5d.A0C;
                if (surfaceTexture4 != null) {
                    surfaceTexture4.getTransformMatrix(fArr);
                } else {
                    Matrix.setIdentityM(fArr, 0);
                }
                i5d.A03(fArr);
            }
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
