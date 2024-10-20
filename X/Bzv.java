package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: Bzv.class */
public final class Bzv {
    public final 1Br A00 = AbG.A0N();

    /* JADX WARN: Type inference failed for: r0v36, types: [X.Ag5, X.2J3] */
    public void A00(String str, java.util.Map map) {
        C1kw A08 = AbI.A08(this.A00);
        if (C1398Ag5.A00 == null) {
            synchronized (C1398Ag5.class) {
                if (C1398Ag5.A00 == null) {
                    C1398Ag5.A00 = new C2J3(A08);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(C1398Ag5.A00, str);
        if (A0A.A0B()) {
            A0A.A06("pigeon_reserved_keyword_module", "gms_ls_upsell");
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A0A.A06(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
            A0A.A0A();
        }
    }
}
