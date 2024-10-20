package X;

import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* loaded from: Ilw.class */
public final class Ilw implements AZj {
    public final /* synthetic */ H4t A00;

    public Ilw(H4t h4t) {
        this.A00 = h4t;
    }

    @Override // X.AZj
    public void Bng() {
        ((1Rv) 1Br.A0B(this.A00.A0m)).A02();
    }

    @Override // X.AZj
    public void CK2() {
        H4t h4t = this.A00;
        1Br.A0C(h4t.A0h);
        C5iw c5iw = new C5iw();
        Integer A0k = 4YU.A0k();
        c5iw.A00 = A0k;
        c5iw.A01 = A0k;
        H4t.A02(h4t, new RequestPermissionsConfig(c5iw));
    }
}
