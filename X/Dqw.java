package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;

/* loaded from: Dqw.class */
public final class Dqw extends C04v implements GG1 {
    public final float A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final 8Lu A03;

    public Dqw(Shader.TileMode tileMode, 8Lu r303, float f, long j) {
        this.A03 = r303;
        this.A01 = j;
        this.A00 = f;
        this.A02 = tileMode;
    }

    @Override // X.GG1
    public Shader D4V() {
        long j = this.A01;
        long j2 = F3K.A00;
        float A00 = DKH.A00(j);
        float A002 = F3K.A00(j);
        float f = this.A00;
        8Lu r0 = this.A03;
        return new RadialGradient(A00, A002, f, (int[]) r0.A00, (float[]) r0.A01, this.A02);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dqw)) {
                return false;
            }
            Dqw dqw = (Dqw) obj;
            if (!11T.A0O(this.A03, dqw.A03)) {
                return false;
            }
            long j = this.A01;
            long j2 = dqw.A01;
            long j3 = F3K.A00;
            if (j != j2 || Float.compare(this.A00, dqw.A00) != 0 || this.A02 != dqw.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A03);
        long j = this.A01;
        long j2 = F3K.A00;
        return 1BK.A03(this.A02, 1BL.A00(AnonymousClass002.A02(j, A03), this.A00));
    }
}
