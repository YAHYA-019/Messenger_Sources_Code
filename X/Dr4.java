package X;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: Dr4.class */
public final class Dr4 extends C04v implements GG2 {
    public final float A00;
    public final long A01;
    public final long A02;

    public Dr4(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        11T.A0F(path, 0);
        long j = this.A02;
        long j2 = F3K.A00;
        RectF A01 = FFf.A01(DKF.A00(j), F3K.A00(j), this.A01);
        float f = this.A00;
        path.addRoundRect(A01, f, f, Path.Direction.CW);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr4)) {
                return false;
            }
            Dr4 dr4 = (Dr4) obj;
            long j = this.A02;
            long j2 = dr4.A02;
            long j3 = F3K.A00;
            if (j != j2 || this.A01 != dr4.A01 || Float.compare(this.A00, dr4.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        long j2 = F3K.A00;
        return AnonymousClass002.A02(this.A01, AnonymousClass002.A01(j)) + Float.floatToIntBits(this.A00);
    }
}
