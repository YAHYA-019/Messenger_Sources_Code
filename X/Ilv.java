package X;

import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* loaded from: Ilv.class */
public final class Ilv implements AZj {
    public final /* synthetic */ IEh A00;

    public Ilv(IEh iEh) {
        this.A00 = iEh;
    }

    @Override // X.AZj
    public void Bng() {
        IEh iEh = this.A00;
        iEh.A0N = true;
        ((1Rv) iEh.A0c.get()).A02();
    }

    @Override // X.AZj
    public void CK2() {
        IEh iEh = this.A00;
        iEh.A0a.get();
        C5iw c5iw = new C5iw();
        Integer A0k = 4YU.A0k();
        c5iw.A00 = A0k;
        c5iw.A01 = A0k;
        IEh.A04(iEh, new RequestPermissionsConfig(c5iw));
    }
}
