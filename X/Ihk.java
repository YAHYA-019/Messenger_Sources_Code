package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Ihk.class */
public final class Ihk implements JON {
    public 6pQ A00;
    public IJL A01;
    public TextureView A02;
    public final Handler A03;
    public final 6UD A04;
    public final I0c A05;
    public final Ihm A06;
    public final JQS A07;

    public Ihk(Handler handler, 6UD r303, I0c i0c, Ihm ihm, JQS jqs) {
        this.A05 = i0c;
        this.A07 = jqs;
        this.A04 = r303;
        this.A03 = handler;
        this.A06 = ihm;
    }

    public void A98(6VK r302) {
        this.A00 = r302.A06;
    }

    public View AKa(Context context, IhE ihE, 6UQ r304) {
        JQS jqs = this.A07;
        jqs.CUZ();
        I0c i0c = this.A05;
        if (!i0c.A0M || this.A04 != null) {
            this.A02 = null;
        }
        TextureView textureView = this.A02;
        if (textureView == null) {
            6UD r0 = this.A04;
            textureView = r0 != null ? r0.BfJ(false) : new TextureView(context);
        }
        if (this.A02 != null) {
            6pQ r02 = this.A00;
            if (r02 != null) {
                r02.release();
            }
            ihE.A05();
            return textureView;
        }
        this.A02 = textureView;
        IJL ijl = new IJL(this.A03, textureView, ihE, r304, i0c, jqs);
        this.A01 = ijl;
        textureView.setSurfaceTextureListener(ijl);
        6pQ r03 = this.A00;
        if (r03 != null) {
            textureView.setSurfaceTexture(r03);
            Surface surface = r03.A00;
            11T.A0A(surface);
            ijl.A01 = surface;
            ijl.A06.CV0(surface);
            this.A00 = null;
        }
        return textureView;
    }

    public Surface AoF() {
        IJL ijl = this.A01;
        if (ijl != null) {
            return ijl.A01;
        }
        return null;
    }

    public Ihm AoG() {
        return this.A06;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.HfT] */
    public HfT B3d() {
        I0c i0c = this.A05;
        ?? obj = new Object();
        obj.A01 = i0c.A04;
        obj.A00 = i0c.A00;
        obj.A02 = i0c.A0O;
        return obj;
    }

    public /* bridge */ /* synthetic */ JDS BDr() {
        IJL ijl = this.A01;
        IhK ihK = null;
        if (ijl != null) {
            SurfaceTexture surfaceTexture = ijl.A00;
            Surface surface = ijl.A01;
            if (surfaceTexture != null && surface != null) {
                ihK = new IhK(surfaceTexture, surface);
            }
        }
        return ihK;
    }

    public boolean BSs() {
        return true;
    }

    public void BtP(ViewGroup viewGroup) {
        this.A07.CUe();
    }

    public /* synthetic */ void CGA() {
    }

    public /* synthetic */ void CUI(int i, int i2, float f) {
    }
}
