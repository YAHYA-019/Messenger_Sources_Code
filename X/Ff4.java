package X;

import com.facebook.zero.sdk.json.JSONObjectImpl;
import java.io.IOException;

/* loaded from: Ff4.class */
public final class Ff4 implements 5SG {
    public final /* synthetic */ F6b A00;
    public final /* synthetic */ GIr A01;

    public Ff4(F6b f6b, GIr gIr) {
        this.A00 = f6b;
        this.A01 = gIr;
    }

    public void Bxs(int i, Throwable th) {
        this.A01.Bxs(i, th);
    }

    public void COq(String str, int i) {
        JSONObjectImpl A00;
        try {
            GIr gIr = this.A01;
            if (str == null) {
                A00 = null;
            } else {
                A00 = C4V1.A01.A00(DKF.A0u(str, str));
            }
            gIr.COm(A00);
        } catch (IOException e) {
            this.A01.Bxs(i, e);
        }
    }
}
