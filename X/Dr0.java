package X;

import android.graphics.Path;

/* loaded from: Dr0.class */
public final class Dr0 extends C04v implements GG2 {
    public final Dr8 A00;
    public final DrG A01;

    public Dr0(Dr8 dr8, DrG drG) {
        this.A00 = dr8;
        this.A01 = drG;
    }

    @Override // X.GG2
    public void A93(Path path, F9I f9i) {
        11T.A0H(path, f9i);
        Dr8 dr8 = this.A00;
        DrG drG = this.A01;
        Path A00 = f9i.A00(dr8, drG);
        f9i.A01(drG, new AVG(A00, 42));
        path.addPath(A00);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dr0)) {
                return false;
            }
            Dr0 dr0 = (Dr0) obj;
            if (!11T.A0O(this.A00, dr0.A00) || !11T.A0O(this.A01, dr0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }
}
