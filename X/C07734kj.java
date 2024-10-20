package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kj.class */
public final class C07734kj extends AbstractC07504k2 {
    public Capabilities A00;
    public List A01;
    public List A02;
    public final 1Br A03;
    public final 4kV A04;
    public final 4kV A05;
    public final InterfaceC07514k3 A06;
    public final 5nJ A07;
    public final 4kB A08;

    public C07734kj(4kB r302, InterfaceC07514k3 interfaceC07514k3, 5nJ r304) {
        11T.A0F(r304, 1);
        11T.A0F(interfaceC07514k3, 2);
        this.A07 = r304;
        this.A06 = interfaceC07514k3;
        this.A08 = r302;
        this.A00 = Capabilities.A02;
        C0ty c0ty = C0ty.A00;
        this.A01 = c0ty;
        this.A02 = c0ty;
        this.A03 = 1Bu.A00(67876);
        this.A05 = new C83u(this, 7);
        this.A04 = new C83u(this, 6);
    }

    public static final void A00(C07734kj c07734kj, List list) {
        if (11T.A0O(list, c07734kj.A02)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C5fu) ((C5fv) it.next())).A0B;
            if (str != null) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c07734kj.A08.A8N(((String) it2.next()).hashCode(), "is_pending_store", "true");
        }
        c07734kj.A02 = list;
        5nQ r0 = new 5nQ();
        ImmutableList copyOf = ImmutableList.copyOf((Iterable) list);
        11T.A0A(copyOf);
        r0.A01(copyOf);
        Capabilities capabilities = c07734kj.A00;
        r0.A04 = capabilities;
        C1pq.A08("capabilities", capabilities);
        5nQ.A00(r0, "capabilities");
        c07734kj.A05(new 5nW(r0));
    }
}
