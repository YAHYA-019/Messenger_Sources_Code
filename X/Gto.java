package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: Gto.class */
public final class Gto extends GuG implements JQ1, JNu {
    public final int A00;
    public final int A01;
    public final SurfaceHolder.Callback A02;
    public final TextureView.SurfaceTextureListener A03;
    public final I4V A04;
    public volatile int A05;
    public volatile int A06;
    public volatile View A07;
    public volatile I5d A08;

    public Gto(JOW jow) {
        super(jow);
        this.A03 = new IJK(this, 1);
        this.A02 = new IJE(this, 0);
        this.A04 = I4V.A00();
        Hvf hvf = JNu.A01;
        Object obj = 0;
        Object obj2 = null;
        JOW jow2 = ((GuG) this).A00;
        Object Adn = jow2.Adn(hvf);
        this.A01 = AnonymousClass001.A03(Adn != null ? Adn : obj2);
        Object Adn2 = jow2.Adn(JNu.A00);
        this.A00 = AnonymousClass001.A03(Adn2 != null ? Adn2 : obj);
        View view = (View) jow2.Adn(HOJ.A03);
        CtI(view == null ? (View) jow2.Adn(HOJ.A02) : view);
    }

    public static void A00(Gto gto) {
        synchronized (gto) {
            View view = gto.A07;
            gto.A07 = null;
            if (view instanceof TextureView) {
                ((TextureView) view).setSurfaceTextureListener(null);
            } else if (view instanceof SurfaceView) {
                ((SurfaceView) view).getHolder().removeCallback(gto.A02);
            }
            I5d i5d = gto.A08;
            gto.A08 = null;
            if (i5d != null) {
                A01(gto, i5d);
                i5d.A01();
            }
        }
    }

    public static void A01(Gto gto, I5d i5d) {
        List list = gto.A04.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((JLp) list.get(i2)).CDh(i5d);
            i = i2 + 1;
        }
    }

    public static void A02(Gto gto, I5d i5d, int i, int i2) {
        List list = gto.A04.A00;
        int size = list.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                return;
            }
            ((JLp) list.get(i4)).CDi(i5d, i, i2);
            i3 = i4 + 1;
        }
    }

    @Override // X.JQ1
    public void A78(JLp jLp) {
        if (this.A04.A02(jLp)) {
            if (this.A07 != null) {
                jLp.CDl(this.A07);
            }
            I5d i5d = this.A08;
            if (i5d != null) {
                jLp.CDg(i5d);
                int i = this.A06;
                int i2 = this.A05;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                jLp.CDi(i5d, i, i2);
            }
        }
    }

    @Override // X.JQ1
    public View AeA() {
        return B4V();
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JQ1.A00;
    }

    @Override // X.JQ1
    public void B4H(IOF iof) {
        IllegalStateException A0N;
        Surface A00;
        View view = this.A07;
        if (view instanceof TextureView) {
            try {
                IOF.A00((TextureView) view, iof, view.getWidth(), view.getHeight());
                return;
            } catch (Throwable th) {
                A0N = new IllegalStateException("Failed to acquire bitmap", th);
            }
        } else {
            I5d i5d = this.A08;
            if (i5d == null || (A00 = i5d.A00()) == null) {
                A0N = AnonymousClass001.A0N("Preview view or surface is null");
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(this.A06, this.A05, Bitmap.Config.ARGB_8888);
                    PixelCopy.request(A00, createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new IJC(createBitmap, iof, 1), ((JQ7) ((GuG) this).A00.AdD(JQ7.A00)).A00);
                    return;
                } catch (Throwable th2) {
                    A0N = new IllegalStateException("Failed to acquire bitmap", th2);
                }
            }
        }
        iof.BnG(A0N);
    }

    @Override // X.JQ1
    public View B4V() {
        View view;
        synchronized (this) {
            if (this.A07 == null) {
                throw AnonymousClass001.A0N("Preview view is null when invoking getPreviewView()");
            }
            view = this.A07;
        }
        return view;
    }

    @Override // X.JQ1
    public boolean BNN() {
        return AnonymousClass001.A1T(this.A07);
    }

    @Override // X.JQ1
    public void Cf0(JLp jLp) {
        this.A04.A03(jLp);
    }

    @Override // X.JQ1
    public void CtI(View view) {
        synchronized (this) {
            if (this.A07 != view) {
                A00(this);
                this.A07 = view;
                Iterator it = this.A04.A00.iterator();
                while (it.hasNext()) {
                    ((JLp) it.next()).CDl(this.A07);
                }
                if (view instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) view;
                    SurfaceHolder holder = surfaceView.getHolder();
                    SurfaceHolder.Callback callback = this.A02;
                    holder.addCallback(callback);
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    if (holder2.getSurface() != null && holder2.getSurface().isValid()) {
                        callback.surfaceCreated(holder2);
                        Rect surfaceFrame = holder2.getSurfaceFrame();
                        surfaceFrame.getClass();
                        int i = surfaceFrame.right - surfaceFrame.left;
                        int i2 = surfaceFrame.bottom - surfaceFrame.top;
                        if (i > 0 && i2 > 0) {
                            callback.surfaceChanged(holder2, -1, i, i2);
                        }
                    }
                } else if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    TextureView.SurfaceTextureListener surfaceTextureListener = this.A03;
                    textureView.setSurfaceTextureListener(surfaceTextureListener);
                    SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    if (surfaceTexture != null && width > 0 && height > 0) {
                        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, width, height);
                    }
                }
            }
        }
    }
}
