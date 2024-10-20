package X;

/* renamed from: X.3sw, reason: invalid class name */
/* loaded from: 3sw.class */
public final class C3sw implements InterfaceC01693sk {
    public final InterfaceC01693sk[] A00;
    public final InterfaceC01783sv A01;
    public volatile Object[] A02;

    public C3sw(InterfaceC01783sv interfaceC01783sv, InterfaceC01693sk[] interfaceC01693skArr) {
        this.A00 = interfaceC01693skArr;
        this.A01 = interfaceC01783sv;
    }

    @Override // X.InterfaceC01693sk
    public Object get(Object obj) {
        Object[] objArr = this.A02;
        InterfaceC01693sk[] interfaceC01693skArr = this.A00;
        int length = interfaceC01693skArr.length;
        Object[] objArr2 = new Object[length + 1];
        for (int i = 0; i < length; i++) {
            objArr2[i] = interfaceC01693skArr[i].get(obj);
        }
        if (objArr != null) {
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr2[i2];
                Object obj3 = objArr[i2];
                if (obj2 == null) {
                    if (obj2 == obj3) {
                    }
                } else if (obj2.equals(obj3)) {
                }
            }
            return objArr[length];
        }
        Object D4r = this.A01.D4r(objArr2);
        objArr2[length] = D4r;
        this.A02 = objArr2;
        return D4r;
    }
}
