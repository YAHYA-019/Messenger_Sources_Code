package X;

import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: Cjc.class */
public final class Cjc implements AXl {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ DDz A01;
    public final /* synthetic */ DFB A02;
    public final /* synthetic */ FRXParams A03;
    public final /* synthetic */ 6Iq A04;

    public Cjc(06Z r302, DDz dDz, DFB dfb, FRXParams fRXParams, 6Iq r306) {
        this.A04 = r306;
        this.A03 = fRXParams;
        this.A00 = r302;
        this.A01 = dDz;
        this.A02 = dfb;
    }

    @Override // X.AXl
    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        6Iq r0 = this.A04;
        FRXParams fRXParams = this.A03;
        Cjd cjd = new Cjd(this.A00, this.A01, this.A02, fRXParams, r0, (User) obj);
        ThreadSummary threadSummary = fRXParams.A05;
        if (threadSummary == null) {
            cjd.onResult(null);
        } else {
            ((AeX) 1Br.A0B(r0.A05)).A01(new CjX(cjd, 4), threadSummary);
        }
    }
}
