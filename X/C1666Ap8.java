package X;

import android.content.res.Resources;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

/* renamed from: X.Ap8, reason: case insensitive filesystem */
/* loaded from: Ap8.class */
public final class C1666Ap8 extends ETZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1666Ap8(Resources resources, DI2 di2, BRW brw, int i) {
        this.A00 = i;
        this.A01 = brw;
        this.A02 = di2;
        this.A03 = resources;
    }

    public void A01(OperationResult operationResult) {
        ((DI2) this.A02).Bt7();
    }

    public void A02(ServiceException serviceException) {
        DI2 di2 = (DI2) this.A02;
        if (di2.CyY()) {
            BRW brw = (BRW) this.A01;
            Resources resources = (Resources) this.A03;
            6HM r0 = (6HM) 1Hv.A02(AbF.A04(brw.A02), 50020);
            C8S c8s = new C8S(resources);
            c8s.A05 = AbH.A17(resources);
            c8s.A03 = serviceException;
            brw.A01 = r0.A02(new COW(c8s));
        }
        di2.Bt4(serviceException);
    }
}
