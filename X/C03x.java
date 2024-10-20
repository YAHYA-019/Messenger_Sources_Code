package X;

/* renamed from: X.03x, reason: invalid class name */
/* loaded from: 03x.class */
public class C03x implements C03y {
    public int A00;
    public final Object[] A01;

    public C03x(int i) {
        if (i <= 0) {
            throw AnonymousClass001.A0L("The max pool size must be > 0");
        }
        this.A01 = new Object[i];
    }

    @Override // X.C03y
    public Object A3p() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        11T.A0I(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.A00--;
        return obj;
    }

    @Override // X.C03y
    public boolean Ccj(Object obj) {
        11T.A0F(obj, 0);
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] == obj) {
                throw AnonymousClass001.A0N("Already in the pool!");
            }
        }
        Object[] objArr = this.A01;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.A00 = i + 1;
        return true;
    }
}
