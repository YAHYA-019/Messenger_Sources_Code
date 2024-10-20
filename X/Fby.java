package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: Fby.class */
public final class Fby implements JKr {
    public final /* synthetic */ Ida A00;
    public final /* synthetic */ C2k5 A01;
    public final /* synthetic */ DvC A02;

    public Fby(Ida ida, C2k5 c2k5, DvC dvC) {
        this.A01 = c2k5;
        this.A02 = dvC;
        this.A00 = ida;
    }

    @Override // X.JKr
    public void BmS(Exception exc) {
    }

    @Override // X.JKr
    public void BmW() {
        Context applicationContext = this.A01.A05.A0D.getApplicationContext();
        DvC dvC = this.A02;
        FbMetaSessionImpl fbMetaSessionImpl = dvC.A00;
        1Wg.A07(applicationContext, this.A00, fbMetaSessionImpl, dvC.A01, GBr.A01(dvC, 29), ViewModelKt.getViewModelScope(dvC.A02));
    }

    @Override // X.JKr
    public void Bma(String str, String str2) {
    }

    @Override // X.JKr
    public void Bmg() {
    }
}
