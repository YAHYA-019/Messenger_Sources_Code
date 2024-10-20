package X;

/* loaded from: B1m.class */
public final class B1m extends 2Yv {
    public int A00;
    public String A01;

    public void A02(C2l4 c2l4) {
        Object obj;
        Object obj2;
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i != ((-1) << (-1))) {
            if (i == -2147483647) {
                obj2 = objArr[0];
            } else if (i == 0) {
                obj = (Integer) objArr[0];
            } else if (i != 1) {
                return;
            } else {
                obj2 = (String) objArr[0];
            }
            this.A01 = (String) obj2;
            return;
        }
        obj = objArr[0];
        this.A00 = AnonymousClass001.A03(obj);
    }
}
