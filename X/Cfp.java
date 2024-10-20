package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.concurrent.Executor;

/* loaded from: Cfp.class */
public final class Cfp implements C3m4 {
    public Bib A00;
    public final 1Br A02 = 7zM.A0O();
    public final 1Br A01 = 1Bu.A00(82655);

    @Override // X.C3m4
    public 1K9 AJC(5Do r302) {
        11T.A0F(r302, 0);
        C01643sd c01643sd = (C01643sd) r302.A01().A0K;
        11T.A0A(c01643sd);
        java.util.Map map = (java.util.Map) ((2Jf) c01643sd).A00.A00().get(c01643sd.A00);
        if (map == null) {
            throw 1BK.A0h();
        }
        Object obj = map.get("target_id");
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get(TraceFieldType.RequestID);
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = map.get("should_be_blocked");
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.String");
        return new D4E(this, str, str2, Boolean.parseBoolean((String) obj3));
    }

    @Override // X.C3m4
    public Executor Aky() {
        return 4YV.A11(this.A02);
    }

    @Override // X.C3m4
    public boolean Bf0(5Do r302) {
        11T.A0F(r302, 0);
        return 11T.A0O(r302.A01().A0K.A05, Q8h.class);
    }
}
