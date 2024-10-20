package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.TimeUnit;

/* loaded from: Cnf.class */
public final class Cnf implements DFT {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 82565);
    public final C00i A02 = 1BV.A01((1BY) null, 83222);
    public final C78 A03;

    public Cnf(1BO r302, C78 c78) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = c78;
    }

    public void C8J(Integer num) {
        C78 c78 = this.A03;
        Integer num2 = c78.A00;
        FbUserSession A05 = 1Fw.A05(this.A00);
        if (num2 == 0S2.A01) {
            C00i c00i = this.A01;
            ((C9D) c00i.get()).A02(A05, c78.A00(), true);
            ((C9D) c00i.get()).A01(A05, c78.A00(), true);
            C5R c5r = (C5R) this.A02.get();
            ThreadKey A00 = c78.A00();
            c5r.A00(A00, TimeUnit.SECONDS.toMinutes(((2Ph) c5r.A03.get()).A02(A00).A00 - TimeUnit.MILLISECONDS.toSeconds(1BL.A08(c5r.A01))));
        } else if (num2 == 0S2.A0C) {
            ((C9D) this.A01.get()).A02(A05, c78.A00(), true);
        }
        c78.A01.A1c();
    }
}
