package X;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.493, reason: invalid class name */
/* loaded from: 493.class */
public final class AnonymousClass493 implements C1lD {
    @Override // X.C1lD
    public 2FW ANC(String str) {
        List A01 = ((C1k6) ((C1jv) 1Bi.A03(66585)).A01.getValue()).A01(str);
        ArrayList A0t = AnonymousClass001.A0t(A01.size());
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0t.add(((InetAddress) it.next()).getHostAddress());
        }
        return new 2FW(A0t, 1);
    }
}
