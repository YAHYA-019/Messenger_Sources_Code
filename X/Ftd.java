package X;

import com.facebook.zero.common.util.CarrierAndSimMccMnc;
import com.facebook.zero.protocol.params.FetchZeroTokenRequestParams;
import com.facebook.zero.protocol.params.ZeroRequestBaseParams;

/* loaded from: Ftd.class */
public final class Ftd implements GGj {
    public EoG A00;

    /* JADX WARN: Type inference failed for: r0v34, types: [com.facebook.zero.protocol.params.FetchZeroTokenRequestParams, com.facebook.zero.protocol.params.ZeroRequestBaseParams] */
    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EEV eev = (AbstractC10314t5) obj;
        if (eev instanceof EEV) {
            EEV eev2 = eev;
            EoG eoG = this.A00;
            1QE r0 = eev2.A00;
            String str = eev2.A01;
            String str2 = eev2.A02;
            Emc emc = new Emc(r302, eev2, this);
            3sU r02 = (3sU) eoG.A00.get();
            C00i c00i = eoG.A02;
            CarrierAndSimMccMnc A00 = ((3sT) c00i.get()).A00();
            String A0s = DKE.A0s(c00i);
            boolean A1W = AnonymousClass001.A1W(r0, 1QE.A01);
            if (str2 == null) {
                str2 = "";
            }
            ?? zeroRequestBaseParams = new ZeroRequestBaseParams(A00, A0s);
            zeroRequestBaseParams.A03 = A1W;
            zeroRequestBaseParams.A02 = false;
            zeroRequestBaseParams.A00 = str2;
            zeroRequestBaseParams.A01 = str;
            r02.A04((FetchZeroTokenRequestParams) zeroRequestBaseParams, new Fw6(emc, eoG, r0, str, 3));
        }
    }
}
