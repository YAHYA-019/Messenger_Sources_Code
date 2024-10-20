package X;

import com.google.common.base.Optional;

/* loaded from: Fd9.class */
public final class Fd9 implements 3lO {
    public final /* synthetic */ C07324jj A00;
    public final /* synthetic */ String A01;

    public Fd9(C07324jj c07324jj, String str) {
        this.A00 = c07324jj;
        this.A01 = str;
    }

    public void Bhf() {
        C07324jj c07324jj = this.A00;
        Optional optional = 4YU.A0K(c07324jj.A03).A01;
        if (optional.isPresent()) {
            ((1vJ) optional.get()).A03.remove(this);
        }
        C07324jj.A00(c07324jj, this.A01, 2132214263);
    }
}
