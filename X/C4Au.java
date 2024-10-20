package X;

import com.facebook.analytics.mobileconfigreliability.MobileConfigSampledAccessListenerImpl;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4Au, reason: invalid class name */
/* loaded from: 4Au.class */
public final class C4Au implements C4Ah, C4Av {
    public static final String __redex_internal_original_name = "MobileConfigEmergencyPushConditionalWorker";
    public 1BY A00;
    public final Set A02 = 1Bi.A06(237);
    public final C00i A01 = new 1BV((1BY) null, 49316);

    public C4Au(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return new C4Xg(this, 28);
    }

    @Override // X.C4Ah
    public long Aro() {
        return 3600000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(357833938572702L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        1CL AvS = ((1CE) 1Bi.A03(98728)).AvS();
        C09804rk.A01(AvS, (C09804rk) this.A01.get());
        0fH.A0l(__redex_internal_original_name, "Update emergency push configs");
        AvS.updateEmergencyPushConfigs();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((MobileConfigSampledAccessListenerImpl) it.next()).A02(0S2.A1J);
        }
        return true;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return ((2yD) 1Bi.A03(16385)).AZr(1GD.A05, 36311551895997447L);
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}
