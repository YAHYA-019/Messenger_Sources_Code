package X;

import android.media.CamcorderProfile;
import java.io.File;

/* loaded from: Ic6.class */
public final class Ic6 implements JLo {
    public JNZ A00;
    public JKM A01;
    public I50 A02;
    public JKN A03;
    public boolean A04;

    @Override // X.JLo
    public void BOn(JOW jow) {
        this.A00 = ((JQ3) jow.AdC(JQ3.A00)).BDt();
    }

    @Override // X.JLo
    public void D2Q(JKM jkm, I1h i1h) {
        try {
            this.A04 = true;
            this.A01 = jkm;
            JKN BJa = this.A00.BJa();
            BJa.getClass();
            this.A03 = BJa;
            CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
            camcorderProfile.getClass();
            Object A00 = i1h.A00(I1h.A04);
            if (A00 == null) {
                File file = (File) i1h.A00(I1h.A02);
                if (file != null) {
                    A00 = file.getAbsolutePath();
                }
            }
            A00.getClass();
            I50 D2P = BJa.D2P(camcorderProfile, null, (String) A00, null, 0, 0, false, true, false);
            this.A02 = D2P;
            jkm.CTl(D2P);
        } catch (Exception e) {
            jkm.CTi(e);
            this.A01 = null;
            this.A02 = null;
            this.A03 = null;
            this.A04 = false;
        }
    }

    @Override // X.JLo
    public void D2y() {
        JKM jkm = this.A01;
        try {
            if (this.A04) {
                try {
                    JKN jkn = this.A03;
                    jkn.getClass();
                    jkn.D2y();
                    if (jkm != null) {
                        I50 i50 = this.A02;
                        i50.getClass();
                        jkm.CTm(i50);
                    }
                } catch (Exception e) {
                    if (jkm != null) {
                        jkm.CTi(e);
                    }
                }
            }
        } finally {
            this.A01 = null;
            this.A02 = null;
            this.A03 = null;
            this.A04 = false;
        }
    }

    @Override // X.JLo
    public void D2z(boolean z) {
        D2y();
    }

    @Override // X.JLo
    public void release() {
        D2y();
    }
}
