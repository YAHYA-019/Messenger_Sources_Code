package X;

import android.graphics.Path;

/* loaded from: Dqz.class */
public final class Dqz extends C04v implements GG2 {
    public final int A00;
    public final long A01;

    public Dqz(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        int i = this.A00;
        11T.A0F(path, 0);
        long j = this.A01;
        long j2 = F3K.A00;
        float A00 = DKH.A00(j);
        float A002 = F3K.A00(j);
        if (i != 0) {
            path.moveTo(A00, A002);
        } else {
            path.lineTo(A00, A002);
        }
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof Dqz)) {
            return false;
        }
        Dqz dqz = (Dqz) obj;
        if (dqz.A00 != i) {
            return false;
        }
        long j = this.A01;
        long j2 = dqz.A01;
        long j3 = F3K.A00;
        return j == j2;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = F3K.A00;
        return 1BL.A01(j);
    }
}
