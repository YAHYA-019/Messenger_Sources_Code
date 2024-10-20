package X;

import android.graphics.Path;

/* loaded from: Dr1.class */
public final class Dr1 extends C04v implements GG2 {
    public final float A00;
    public final long A01;

    public Dr1(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        11T.A0F(path, 0);
        long j = this.A01;
        long j2 = F3K.A00;
        path.addCircle(DKH.A00(j), F3K.A00(j), this.A00, Path.Direction.CW);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr1)) {
                return false;
            }
            Dr1 dr1 = (Dr1) obj;
            long j = this.A01;
            long j2 = dr1.A01;
            long j3 = F3K.A00;
            if (j != j2 || Float.compare(this.A00, dr1.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = F3K.A00;
        return 7zQ.A02(j) + Float.floatToIntBits(this.A00);
    }
}
