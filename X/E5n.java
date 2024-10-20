package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: E5n.class */
public final class E5n extends ETw {
    public String A00;
    public final Ezn A01;
    public final C1790AsO A02;

    public E5n(Ezn ezn, C1790AsO c1790AsO) {
        this.A01 = ezn;
        this.A02 = c1790AsO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EoR A00(E5n e5n) {
        List list = e5n.A01.A04;
        EoR eoR = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((EoR) next).A01 == null) {
                    eoR = next;
                    break;
                }
            }
            eoR = eoR;
        }
        return eoR;
    }
}
