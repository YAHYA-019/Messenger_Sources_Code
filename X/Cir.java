package X;

import android.content.Context;
import android.widget.Toast;

/* loaded from: Cir.class */
public final class Cir implements DGh {
    public final /* synthetic */ CIF A00;

    public Cir(CIF cif) {
        this.A00 = cif;
    }

    @Override // X.DGh
    public void BYC() {
        C00m c00m = this.A00.A02;
        if (c00m == null) {
            11T.A0L("errorCallback");
            throw 0Q8.createAndThrow();
        }
        c00m.invoke();
    }

    @Override // X.DGh
    public void BYD() {
        String str;
        CIF cif = this.A00;
        DHc dHc = cif.A01;
        if (dHc == null) {
            str = "threadChangeListener";
        } else {
            dHc.C3T();
            if (!cif.A03) {
                return;
            }
            Context context = cif.A00;
            if (context != null) {
                Toast.makeText(context, 2131955657, 0).show();
                cif.A03 = false;
                return;
            }
            str = "context";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
