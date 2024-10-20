package X;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: H3a.class */
public class H3a extends IiG implements JJE, JJA, JQV {
    public HsY A00;
    public JL0 A01;
    public JLR A02;
    public boolean A03;
    public final AtomicBoolean A04;
    public final HhA A05;
    public volatile Rai A06;

    public H3a() {
        this(new Rai());
    }

    public H3a(Rai rai) {
        this.A04 = 7zO.A15();
        this.A03 = true;
        02W.A06(AnonymousClass001.A1T(rai), "Must provide non null filter");
        this.A06 = rai;
        this.A04.set(true);
        I2I A00 = I2I.A00();
        I7A.A01(A00, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 2);
        this.A05 = I7A.A00(A00, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public Integer Ar1() {
        return 0S2.A00;
    }

    public java.util.Map Auu() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("filter_type", "color");
        A0u.put("effect_id", this.A06.filterName);
        return A0u;
    }

    public String B78() {
        return this instanceof H3Z ? "LowlightRenderer" : "ColorFilterRenderer";
    }

    public boolean BvA(I5I i5i, long j) {
        N34.A02("onDrawFrame", new Object[0]);
        boolean A03 = i5i.A03();
        if (A03 != this.A03) {
            this.A03 = A03;
            HsY hsY = this.A00;
            if (hsY != null) {
                hsY.A01();
                this.A00 = null;
            }
        }
        if (this.A00 == null) {
            this.A00 = this.A01.AIZ(2131886099, 2131886098, this.A03);
            this.A04.set(true);
        }
        I9C A00 = this.A00.A00();
        if (this.A04.getAndSet(false)) {
            A00.A03("saturation", this.A06.saturation);
            A00.A03("brightness", this.A06.brightness);
            A00.A03("contrast", this.A06.contrast);
            A00.A03("hue", this.A06.hue);
            GLES20.glUniform1i(I9C.A00(A00, "hueColorize"), this.A06.isHueColorize ? 1 : 0);
        }
        A00.A04("sTexture", i5i.A00());
        I9C.A01(A00, i5i);
        A00.A02(this.A05);
        return true;
    }

    public void CGa(JJD jjd) {
        if (jjd.BHT().ordinal() != 1) {
            0fH.A0B(H3a.class, "Received an event we did not register for");
        } else {
            this.A06 = ((S39) jjd).A00;
            this.A04.set(true);
        }
    }

    public void CPE(JL0 jl0) {
        this.A01 = jl0;
        JLR jlr = this.A02;
        if (jlr != null) {
            jlr.CcL(this, HC9.A05);
        }
    }

    public void CPG() {
        JLR jlr = this.A02;
        if (jlr != null) {
            jlr.D5y(this, HC9.A05);
        }
        HsY hsY = this.A00;
        if (hsY != null) {
            hsY.A01();
            this.A00 = null;
        }
    }

    public void Clo(JJ9 jj9) {
    }

    public void Cqs(JQ9 jq9) {
    }

    public void Ctv(JLR jlr) {
        JLR jlr2 = this.A02;
        if (jlr2 != null) {
            jlr2.D5y(this, HC9.A05);
        }
        this.A02 = jlr;
        if (jlr != null) {
            jlr.CcL(this, HC9.A05);
        }
    }

    public final boolean Cyu() {
        return false;
    }

    public boolean isEnabled() {
        Rai rai = this.A06;
        boolean z = true;
        if (rai.saturation != 0.0f || rai.brightness != 0.0f || rai.contrast != 0.0f || rai.hue != 0.0f) {
            z = false;
        }
        return !z;
    }
}
