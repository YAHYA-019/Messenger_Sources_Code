package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* loaded from: Dqv.class */
public final class Dqv extends C04v implements GG1 {
    public final long A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final 8Lu A03;

    public Dqv(Shader.TileMode tileMode, 8Lu r303, long j, long j2) {
        this.A03 = r303;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = tileMode;
    }

    @Override // X.GG1
    public Shader D4V() {
        long j = this.A01;
        long j2 = F3K.A00;
        float A00 = DKF.A00(j);
        float A002 = F3K.A00(j);
        long j3 = this.A00;
        float A003 = DKF.A00(j3);
        float A004 = F3K.A00(j3);
        8Lu r0 = this.A03;
        return new LinearGradient(A00, A002, A003, A004, (int[]) r0.A00, (float[]) r0.A01, this.A02);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dqv)) {
                return false;
            }
            Dqv dqv = (Dqv) obj;
            if (!11T.A0O(this.A03, dqv.A03)) {
                return false;
            }
            long j = this.A01;
            long j2 = dqv.A01;
            long j3 = F3K.A00;
            if (j != j2 || this.A00 != dqv.A00 || this.A02 != dqv.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A03);
        long j = this.A01;
        long j2 = F3K.A00;
        return 1BK.A03(this.A02, AnonymousClass002.A02(this.A00, AnonymousClass002.A02(j, A03)));
    }
}
