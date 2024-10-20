package X;

import org.json.JSONObject;

/* loaded from: Fpg.class */
public final class Fpg implements GGF {
    public final /* synthetic */ G6I A00;

    public Fpg(G6I g6i) {
        this.A00 = g6i;
    }

    public void ANl() {
        G6I g6i = this.A00;
        boolean z = g6i.A07;
        DZW dzw = g6i.A00.A00;
        if (z) {
            dzw.A0B.A01();
            return;
        }
        EzV ezV = dzw.A0B;
        JSONObject A12 = AnonymousClass001.A12();
        String str = ezV.A02;
        if (str != null && str.length() != 0) {
            ((EtR) ezV.A0D.get()).A00(ezV.A02, A12);
        }
        ezV.A00();
    }
}
