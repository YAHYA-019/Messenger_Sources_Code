package X;

/* loaded from: Lg2.class */
public final class Lg2 implements MJ1 {
    public MJ1[] A00;

    @Override // X.MJ1
    public boolean BWR(Class cls) {
        MJ1[] mj1Arr = this.A00;
        int length = mj1Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            if (mj1Arr[i2].BWR(cls)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    @Override // X.MJ1
    public KkX BeC(Class cls) {
        MJ1[] mj1Arr = this.A00;
        int length = mj1Arr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw AnonymousClass001.A0q(JQx.A0v(cls, "No factory is available for message type: "));
            }
            MJ1 mj1 = mj1Arr[i2];
            if (mj1.BWR(cls)) {
                return mj1.BeC(cls);
            }
            i = i2 + 1;
        }
    }
}
