package X;

import android.content.Context;
import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: Fbz.class */
public final class Fbz implements JKr {
    public final /* synthetic */ Ida A00;
    public final /* synthetic */ C2k5 A01;
    public final /* synthetic */ C2lh A02;
    public final /* synthetic */ Dvt A03;

    public Fbz(Ida ida, C2k5 c2k5, C2lh c2lh, Dvt dvt) {
        this.A02 = c2lh;
        this.A03 = dvt;
        this.A01 = c2k5;
        this.A00 = ida;
    }

    @Override // X.JKr
    public void BmS(Exception exc) {
        this.A03.A02.invoke(new EJp(FyR.A00));
    }

    @Override // X.JKr
    public void BmW() {
        this.A02.A04(GBd.A00);
        Dvt dvt = this.A03;
        dvt.A02.invoke(new EJp(FyN.A00));
        Context applicationContext = this.A01.A05.A0D.getApplicationContext();
        FbMetaSessionImpl fbMetaSessionImpl = dvt.A00;
        1Wg.A07(applicationContext, this.A00, fbMetaSessionImpl, dvt.A01, GBr.A01(dvt, 27), dvt.A03);
    }

    @Override // X.JKr
    public void Bma(String str, String str2) {
    }

    @Override // X.JKr
    public void Bmg() {
    }
}
