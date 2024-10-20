package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: F7i.class */
public final class F7i {
    public final 1Br A02 = 1Bu.A00(100328);
    public final 1Br A00 = 1Bu.A00(100326);
    public final 1Br A01 = 1Bu.A00(100327);

    public static final int A00(String str) {
        if (str.length() > 0) {
            return (int) (Long.parseLong(str) % 1000000);
        }
        throw 0Pz.A05("Invalid Bugreport ID: ", str);
    }

    public final void A01(boolean z, String str, String str2) {
        int A00 = A00(str);
        if (z) {
            E15 e15 = (E15) 1Br.A0B(this.A02);
            UserFlowLogger A0Z = 4YV.A0Z(e15.A00);
            A0Z.flowEndSuccess(DKG.A04(e15, A0Z, A00));
            return;
        }
        if (str2 != null) {
            E15 e152 = (E15) 1Br.A0B(this.A02);
            UserFlowLogger A0Z2 = 4YV.A0Z(e152.A00);
            A0Z2.flowAnnotate(DKG.A04(e152, A0Z2, A00), "fail_reason", str2);
        }
        E15 e153 = (E15) 1Br.A0B(this.A02);
        String valueOf = String.valueOf(str2);
        11T.A0F(valueOf, 1);
        UserFlowLogger A0Z3 = 4YV.A0Z(e153.A00);
        A0Z3.flowEndFail(DKG.A04(e153, A0Z3, A00), valueOf, null);
    }
}
