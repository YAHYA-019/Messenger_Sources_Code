package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: Dr9.class */
public final class Dr9 extends C04v implements GOW {
    public final float A00;
    public final long A01;

    public Dr9(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }

    @Override // X.GOW
    public void AOG(Canvas canvas, Paint paint) {
        long j = this.A01;
        long j2 = F3K.A00;
        canvas.drawCircle(DKH.A00(j), F3K.A00(j), this.A00, paint);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr9)) {
                return false;
            }
            Dr9 dr9 = (Dr9) obj;
            long j = this.A01;
            long j2 = dr9.A01;
            long j3 = F3K.A00;
            if (j != j2 || Float.compare(this.A00, dr9.A00) != 0) {
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
