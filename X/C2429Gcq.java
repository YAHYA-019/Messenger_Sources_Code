package X;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;

/* renamed from: X.Gcq, reason: case insensitive filesystem */
/* loaded from: Gcq.class */
public final class C2429Gcq extends Ic7 implements JQ1, JQC {
    public final Context A00;
    public final TextureView.SurfaceTextureListener A01;
    public final I4V A02;
    public volatile int A03;
    public volatile int A04;
    public volatile TextureView A05;
    public volatile HPB A06;
    public volatile I5d A07;
    public volatile FrameLayout A08;

    public C2429Gcq(JOW jow) {
        super.A00 = jow;
        this.A01 = new IJK(this, 0);
        this.A00 = jow.getContext();
        this.A02 = I4V.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.JQ1
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public TextureView B4V() {
        TextureView textureView;
        synchronized (this) {
            if (this.A05 == null) {
                GU8 gu8 = new GU8(this.A00);
                this.A06 = gu8.A00;
                gu8.setSurfaceTextureListener(this.A01);
                this.A05 = gu8;
                Iterator it = this.A02.A00.iterator();
                while (it.hasNext()) {
                    ((JLp) it.next()).CDl(this.A05);
                }
            }
            textureView = this.A05;
        }
        return textureView;
    }

    @Override // X.JQ1
    public void A78(JLp jLp) {
        if (this.A02.A02(jLp)) {
            if (this.A05 != null) {
                jLp.CDl(this.A05);
            }
            I5d i5d = this.A07;
            if (i5d != null) {
                jLp.CDg(i5d);
                int i = this.A04;
                int i2 = this.A03;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                jLp.CDi(i5d, i, i2);
            }
        }
    }

    @Override // X.JQ1
    public View AeA() {
        if (this.A08 == null) {
            FrameLayout frameLayout = new FrameLayout(this.A00);
            frameLayout.addView(B4V(), new FrameLayout.LayoutParams(-1, -1, 17));
            this.A08 = frameLayout;
        }
        return this.A08;
    }

    @Override // X.JQ1
    public void B4H(IOF iof) {
        IllegalStateException illegalStateException;
        synchronized (this) {
            TextureView textureView = this.A05;
            if (textureView == null) {
                illegalStateException = AnonymousClass001.A0N("Preview view is null");
            } else {
                try {
                    IOF.A00(textureView, iof, textureView.getWidth(), textureView.getHeight());
                } catch (Throwable th) {
                    new IllegalStateException("Failed to acquire bitmap", th);
                }
            }
            iof.BnG(illegalStateException);
        }
    }

    @Override // X.JQ1
    public boolean BNN() {
        return AnonymousClass001.A1T(this.A05);
    }

    @Override // X.JQ1
    public void Cf0(JLp jLp) {
        this.A02.A03(jLp);
    }

    @Override // X.JQ1
    public void CtI(View view) {
        throw AnonymousClass001.A0q("setPreviewView() is not supported");
    }
}
