package X;

import android.graphics.Path;

/* loaded from: Dr2.class */
public final class Dr2 extends C04v implements GG2 {
    public final int A00;
    public final long A01;
    public final long A02;

    public Dr2(long j, long j2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A01 = j2;
        }
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        if (this.A00 == 0) {
            11T.A0F(path, 0);
            long j = this.A02;
            long j2 = F3K.A00;
            path.addOval(FFf.A01(DKF.A00(j), F3K.A00(j), this.A01), Path.Direction.CW);
            return;
        }
        11T.A0F(path, 0);
        long j3 = this.A01;
        long j4 = F3K.A00;
        float A00 = DKF.A00(j3);
        float A002 = F3K.A00(j3);
        long j5 = this.A02;
        path.quadTo(A00, A002, DKF.A00(j5), F3K.A00(j5));
    }

    public boolean equals(Object obj) {
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dr2)) {
                return false;
            }
            Dr2 dr2 = (Dr2) obj;
            if (dr2.A00 != 1) {
                return false;
            }
            long j3 = this.A01;
            long j4 = dr2.A01;
            long j5 = F3K.A00;
            if (j3 != j4) {
                return false;
            }
            j = this.A02;
            j2 = dr2.A02;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dr2)) {
                return false;
            }
            Dr2 dr22 = (Dr2) obj;
            if (dr22.A00 != 0) {
                return false;
            }
            long j6 = this.A02;
            long j7 = dr22.A02;
            long j8 = F3K.A00;
            if (j6 != j7) {
                return false;
            }
            j = this.A01;
            j2 = dr22.A01;
        }
        return j == j2;
    }

    public int hashCode() {
        byte b;
        int A01;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A01;
            long j3 = F3K.A00;
            b = 32;
            A01 = AnonymousClass002.A01(j2);
            j = this.A02;
        } else {
            long j4 = this.A02;
            long j5 = F3K.A00;
            b = 32;
            A01 = AnonymousClass002.A01(j4);
            j = this.A01;
        }
        return A01 + ((int) (j ^ (j >>> (b == true ? 1L : 0L))));
    }
}
