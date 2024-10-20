package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: Cek.class */
public final class Cek implements C4Av {
    public final Fch A00 = (Fch) 1Bi.A03(98927);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        Class cls;
        String str;
        Boolean A0d = 1BK.A0d();
        try {
            if (r302.A01()) {
                0fH.A0C(Cek.class, "Starting fetch incoming payment requests in background.");
                1Yz.A00(this.A00.A04(EKm.A01));
                A0d = true;
            }
        } catch (CancellationException e) {
            e = e;
            cls = Cek.class;
            str = "CancellationException";
            0fH.A0H(cls, str, e);
            return A0d.booleanValue();
        } catch (ExecutionException e2) {
            e = e2;
            cls = Cek.class;
            str = "ExecutionException";
            0fH.A0H(cls, str, e);
            return A0d.booleanValue();
        } catch (Exception e3) {
            e = e3;
            cls = Cek.class;
            str = "Error";
            0fH.A0H(cls, str, e);
            return A0d.booleanValue();
        }
        return A0d.booleanValue();
    }
}
