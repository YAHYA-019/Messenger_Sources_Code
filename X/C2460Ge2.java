package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ge2, reason: case insensitive filesystem */
/* loaded from: Ge2.class */
public final class C2460Ge2 extends IOr implements JOo, JOn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public RectF A04;
    public SurfaceTexture A05;
    public RHx A06;
    public HsT A07;
    public Surface A0A;
    public final JML A0B;
    public final ThreadPoolExecutor A0C;
    public boolean A09 = false;
    public WeakReference A08 = DKD.A11();

    public C2460Ge2(JML jml) {
        this.A0B = jml;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.A0C = threadPoolExecutor;
        threadPoolExecutor.prestartCoreThread();
    }

    public static boolean A00(Bitmap bitmap, C2460Ge2 c2460Ge2, File file, boolean z) {
        boolean z2;
        C1sz c1sz;
        try {
            try {
                if (file instanceof C1sz) {
                    c1sz = (C1sz) file;
                } else {
                    new File(file.getPath());
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c1sz.BL4());
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                z2 = true;
            } catch (IOException e) {
                0fH.A0r("PhotoOutput", "Unable to create FileOutputStream", e);
                z2 = false;
            }
            return z2;
        } finally {
            if (z) {
                c2460Ge2.A0B.Cbj(bitmap);
            }
        }
    }

    @Override // X.JOo
    public Integer AnF() {
        return 0S2.A00;
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return "DefaultPhotoOutput";
    }

    @Override // X.JOn
    public JJD B72() {
        return new Iiw(true);
    }

    @Override // X.JOn
    public JJD B73() {
        return new Iix(true);
    }

    @Override // X.JOo
    public int B8t() {
        return 1;
    }

    public HB9 BJV() {
        return HB9.A02;
    }

    public void BOk(JHx jHx, JEM jem) {
        int i;
        HsT hsT = new HsT(new I8U("DefaultPhotoOutput"));
        this.A07 = hsT;
        SurfaceTexture surfaceTexture = new SurfaceTexture(hsT.A00);
        this.A05 = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.A0A = surface;
        jHx.D3i(surface, this);
        int i2 = this.A02;
        if (i2 > 0 && (i = this.A01) > 0) {
            this.A03 = i2;
            this.A00 = i;
            SurfaceTexture surfaceTexture2 = this.A05;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setDefaultBufferSize(i2, i);
            }
            HsT hsT2 = this.A07;
            if (hsT2 != null) {
                hsT2.A00(this.A03, this.A00);
            }
            this.A09 = true;
        }
        this.A05.setDefaultBufferSize(this.A03, this.A00);
    }

    public void CPI() {
        int i;
        int i2;
        if (!this.A09 && (i = this.A02) > 0 && (i2 = this.A01) > 0) {
            this.A03 = i;
            this.A00 = i2;
            SurfaceTexture surfaceTexture = this.A05;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            HsT hsT = this.A07;
            if (hsT != null) {
                hsT.A00(this.A03, this.A00);
            }
            this.A09 = true;
            return;
        }
        RHx rHx = this.A06;
        if (rHx != null) {
            this.A06 = null;
            RectF rectF = this.A04;
            if (rectF == null) {
                rectF = GOq.A0M();
                this.A04 = rectF;
            }
            float f = rectF.left;
            float f2 = this.A03;
            int i3 = (int) (f * f2);
            float f3 = rectF.top;
            float f4 = this.A00;
            Rect rect = new Rect(i3, (int) (f3 * f4), (int) (rectF.right * f2), (int) (rectF.bottom * f4));
            int width = rect.width();
            int height = rect.height();
            try {
                Buffer buffer = (Buffer) this.A08.get();
                if (buffer == null) {
                    buffer = ByteBuffer.allocateDirect(rect.width() * rect.height() * 4);
                    this.A08 = 7zL.A14(buffer);
                }
                buffer.rewind();
                GLES20.glReadPixels(rect.left, rect.top, rect.width(), rect.height(), 6408, 5121, buffer);
                N34.A02("glReadPixels", AnonymousClass001.A1Z());
                this.A0C.execute(new J2Y(rHx, this, buffer, width, height));
            } catch (Throwable th) {
                0fH.A0r("PhotoOutput", "Unable to create ByteBuffer", th);
                rHx.A00.A01(AnonymousClass001.A0Q("Failed to get pixels from Surface"));
            }
        }
    }

    public void destroy() {
        release();
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A03;
    }

    public void release() {
        Surface surface = this.A0A;
        if (surface != null) {
            surface.release();
            this.A0A = null;
        }
        SurfaceTexture surfaceTexture = this.A05;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A05 = null;
        }
        HsT hsT = this.A07;
        if (hsT != null) {
            hsT.A01();
            this.A07 = null;
        }
        super.release();
    }
}
