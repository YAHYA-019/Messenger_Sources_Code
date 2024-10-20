package X;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: Kxp.class */
public abstract class Kxp {
    public static final KYY A00 = new Object();

    public static void A00(L0X l0x) {
        L1e l1e;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A1A = 1BK.A1A(l0x.A03);
        while (A1A.hasNext()) {
            Iterator A1G = GOn.A1G(A1A.next());
            while (A1G.hasNext()) {
                Klv klv = (Klv) A1G.next();
                int ordinal = klv.A01.ordinal();
                if (ordinal == 1) {
                    l1e = L1e.A03;
                } else if (ordinal == 2) {
                    l1e = L1e.A02;
                } else {
                    if (ordinal != 3) {
                        throw AnonymousClass001.A0N("Unknown key status");
                    }
                    l1e = L1e.A01;
                }
                int i = klv.A00;
                String str = klv.A05;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                A0s.add(new KtV(l1e, str, klv.A02.name(), i));
            }
        }
        Klv klv2 = l0x.A00;
        if (klv2 != null) {
            int i2 = klv2.A00;
            if (Integer.valueOf(i2) != null) {
                try {
                    Iterator it = A0s.iterator();
                    do {
                        if (!it.hasNext()) {
                            throw JQx.A10("primary key ID is not present in entries");
                        }
                    } while (((KtV) it.next()).A00 != i2);
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        Collections.unmodifiableList(A0s);
    }
}
