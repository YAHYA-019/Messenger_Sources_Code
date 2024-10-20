package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* loaded from: F8v.class */
public final class F8v {
    public final EpO A00;
    public final F60 A01;
    public final F4T A02;

    public F8v(EpO epO, F60 f60, F4T f4t) {
        this.A00 = epO;
        this.A02 = f4t;
        this.A01 = f60;
    }

    public static void A00(LiveData liveData, F60 f60) {
        liveData.observeForever(new FZ9(liveData, (Observer) FZB.A00(f60, 67), 15));
    }

    public LiveData A01() {
        FHJ fhj = this.A01.A01;
        EH5 eh5 = fhj.A01;
        FH8.A02(eh5);
        return G7P.A00(G7P.A00(((FH8) eh5).A03, fhj, 20), this, 17);
    }

    public DSD A02(FEq fEq, String str) {
        F4T f4t = this.A02;
        FYl fYl = new FYl(this, fEq, str, 6);
        F60 f60 = this.A01;
        7zS.A16(0, f4t, f60, fEq);
        EHA eha = new EHA(fYl, f60, f4t, fEq);
        FH8.A02(eha);
        DSD dsd = ((FH8) eha).A03;
        dsd.observeForever(new FZ9((LiveData) dsd, (Observer) FZB.A00(f60, 68), 17));
        return dsd;
    }
}
