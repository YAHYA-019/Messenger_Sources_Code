package X;

import com.facebook.contacts.graphql.Contact;
import java.util.concurrent.TimeUnit;

/* loaded from: Bzq.class */
public final class Bzq {
    public final C1ko A00;

    public Bzq() {
        5Vb r0 = (5Vb) 1Bi.A03(84874);
        C1k8 c1k8 = new C1k8();
        c1k8.A05(600L, TimeUnit.SECONDS);
        c1k8.A03(r0.A00(60, 100));
        this.A00 = c1k8.A02();
    }

    public void A00(Contact contact) {
        1Du it = BRj.A00(contact).iterator();
        while (it.hasNext()) {
            this.A00.CZv(it.next(), contact);
        }
    }
}
