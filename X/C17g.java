package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.17g, reason: invalid class name */
/* loaded from: 17g.class */
public final class C17g implements Runnable {
    public static final String __redex_internal_original_name = "FbnsConnectionManager$CallbackHandler$3";
    public final /* synthetic */ C0kv A00;
    public final /* synthetic */ 18A A01;

    public C17g(C0kv c0kv, 18A r303) {
        this.A00 = c0kv;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        C18d c18d = (C18d) this.A01.A04.A05();
        C0kv c0kv = this.A00;
        C17n c17n = c0kv.A02;
        0fH.A0g(c18d, c17n.A0Y, "connection/failed; reason=%s");
        C04O c04o = c17n.A0I;
        String obj = c18d.toString();
        11T.A0F(obj, 0);
        List list = c04o.A01;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((04P) it.next()).C7q(obj);
            }
        }
        if (c18d.equals(C18d.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || c18d.equals(C18d.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            19M r0 = c17n.A0W;
            synchronized (r0) {
                r0.A0D = true;
            }
        }
        18Q r02 = c17n.A14;
        18Q r03 = c0kv.A00;
        if (r02 == r03) {
            C18f c18f = C18f.CONNECT_FAILED;
            if (c18d.equals(C18d.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                c17n.A0J.clear();
            } else if (c18d.equals(C18d.FAILED_CONNECTION_REFUSED_REVOKED_PUBLIC_KEY)) {
                c17n.A0S.CXE();
                throw null;
            }
            C17n.A04(new 0wZ(c18d), c17n, c18f);
        } else if (c17n.A15 == r03) {
            C17n.A05(c17n);
        }
        ((C17v) c17n.A0E.A05(C1Au.class)).A03(C17y.A05, c18d.name());
    }
}
