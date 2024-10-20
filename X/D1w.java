package X;

import java.util.List;

/* loaded from: D1w.class */
public final class D1w implements InterfaceC07434jv {
    public final InterfaceC07434jv A00;
    public final InterfaceC07434jv A01;
    public final InterfaceC07434jv A02;

    public D1w(InterfaceC07434jv interfaceC07434jv, InterfaceC07434jv interfaceC07434jv2, InterfaceC07434jv interfaceC07434jv3) {
        this.A01 = interfaceC07434jv;
        this.A02 = interfaceC07434jv2;
        this.A00 = interfaceC07434jv3;
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        List list = (List) this.A02.A4o(obj, obj2);
        if (list == null || list.isEmpty()) {
            return C0ty.A00;
        }
        Object A4o = this.A01.A4o(obj, obj2);
        Object A4o2 = this.A00.A4o(obj, obj2);
        List A12 = C0s8.A12(A4o);
        if (A4o2 == null) {
            return 0QD.A0O(list, A12);
        }
        return 0QD.A0O(11T.A03(A4o2), 0QD.A0O(list, A12));
    }
}
