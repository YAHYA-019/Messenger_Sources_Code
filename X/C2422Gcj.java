package X;

import android.graphics.SurfaceTexture;
import java.util.HashMap;

/* renamed from: X.Gcj, reason: case insensitive filesystem */
/* loaded from: Gcj.class */
public final class C2422Gcj extends Ic7 implements JPx {
    public int A00;
    public JED A01;
    public JLp A02;
    public final I4V A03;
    public final HashMap A04;

    public C2422Gcj(JOW jow) {
        super.A00 = jow;
        this.A03 = I4V.A00();
        this.A04 = AnonymousClass001.A0u();
    }

    @Override // X.JPx
    public void A6x(SurfaceTexture surfaceTexture, boolean z) {
        11T.A0F(surfaceTexture, 0);
        HashMap hashMap = this.A04;
        if (hashMap.get(surfaceTexture) == null) {
            I5d i5d = new I5d(surfaceTexture, false, false);
            i5d.A0E = true;
            i5d.A0A = 1;
            i5d.A08 = 1;
            hashMap.put(surfaceTexture, i5d);
            JQC A07 = Ic7.A07(this, JQ3.A00);
            11T.A0A(A07);
            ((JQ3) A07).A6y(i5d);
        }
    }

    @Override // X.JPx
    public void Cet(SurfaceTexture surfaceTexture) {
        11T.A0F(surfaceTexture, 0);
        I5d i5d = (I5d) this.A04.remove(surfaceTexture);
        if (i5d != null) {
            JQC A07 = Ic7.A07(this, JQ3.A00);
            11T.A0A(A07);
            ((JQ3) A07).Ceu(i5d);
        }
    }
}
