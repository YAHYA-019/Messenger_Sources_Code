package X;

import android.graphics.Path;

/* loaded from: Dr3.class */
public final class Dr3 extends C04v implements GG2 {
    public final long A00;
    public final long A01;
    public final long A02;

    public Dr3(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        11T.A0F(path, 0);
        long j = this.A00;
        long j2 = F3K.A00;
        float A00 = DKF.A00(j);
        float A002 = F3K.A00(j);
        long j3 = this.A01;
        float A003 = DKF.A00(j3);
        float A004 = F3K.A00(j3);
        long j4 = this.A02;
        path.cubicTo(A00, A002, A003, A004, DKF.A00(j4), F3K.A00(j4));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr3)) {
                return false;
            }
            Dr3 dr3 = (Dr3) obj;
            long j = this.A00;
            long j2 = dr3.A00;
            long j3 = F3K.A00;
            if (j != j2 || this.A01 != dr3.A01 || this.A02 != dr3.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = F3K.A00;
        int A02 = AnonymousClass002.A02(this.A01, AnonymousClass002.A01(j));
        long j3 = this.A02;
        return A02 + ((int) (j3 ^ (j3 >>> 32)));
    }
}
