package X;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: Dr5.class */
public final class Dr5 extends C04v implements GG2 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    public Dr5(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        11T.A0F(path, 0);
        long j = this.A03;
        float f = this.A01;
        03Y A00 = EXK.A00(this.A02, this.A00, this.A04);
        float A002 = 7zM.A00(A00.first);
        float A003 = 7zM.A00(A00.second);
        long j2 = F3K.A00;
        float A004 = DKH.A00(j);
        float f2 = A004 - f;
        float A005 = F3K.A00(j);
        path.arcTo(new RectF(f2, A005 - f, A004 + f, A005 + f), A002, A003);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr5)) {
                return false;
            }
            Dr5 dr5 = (Dr5) obj;
            long j = this.A03;
            long j2 = dr5.A03;
            long j3 = F3K.A00;
            if (j != j2 || Float.compare(this.A01, dr5.A01) != 0 || Float.compare(this.A02, dr5.A02) != 0 || Float.compare(this.A00, dr5.A00) != 0 || this.A04 != dr5.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A03;
        long j2 = F3K.A00;
        return 1BL.A00(1BL.A00(1BL.A00(7zQ.A02(j), this.A01), this.A02), this.A00) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }
}
