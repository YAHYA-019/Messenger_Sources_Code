package X;

import android.os.Looper;

/* loaded from: Im9.class */
public final class Im9 implements JN5 {
    public final /* synthetic */ H5r A00;

    public Im9(H5r h5r) {
        this.A00 = h5r;
    }

    @Override // X.JN5
    public void C1G() {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A0C, h5r.A0A);
    }

    @Override // X.JN5
    public void C4m() {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A00, h5r.A09);
    }

    @Override // X.JN5
    public void CB5(long j) {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A0C, h5r.A0A);
    }

    @Override // X.JN5
    public void CC8() {
    }

    @Override // X.JN5
    public void CC9() {
    }

    @Override // X.JN5
    public void CCK() {
    }

    @Override // X.JN5
    public void CHx() {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A01, h5r.A0B);
    }

    @Override // X.JN5
    public void CN3() {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A01, h5r.A0B);
    }

    @Override // X.JN5
    public void CNp() {
        H5r h5r = this.A00;
        H5r.A01(h5r, 0S2.A0C, h5r.A0A);
    }

    @Override // X.JN5
    public void CSd(long j, float f) {
        H5r h5r = this.A00;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h5r.A02(j, f);
        } else {
            1BK.A1E(h5r.A06).execute(new J1g(h5r, f, j));
        }
    }

    @Override // X.JN5
    public void CSg(double d) {
    }
}
