package X;

/* loaded from: Lga.class */
public final class Lga implements MJ2 {
    public MJ2[] A00;

    @Override // X.MJ2
    public boolean BWR(Class cls) {
        MJ2[] mj2Arr = this.A00;
        int length = mj2Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            if (mj2Arr[i2].BWR(cls)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    @Override // X.MJ2
    public KkZ BeD(Class cls) {
        MJ2[] mj2Arr = this.A00;
        int length = mj2Arr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw AnonymousClass001.A0q(JQx.A0v(cls, "No factory is available for message type: "));
            }
            MJ2 mj2 = mj2Arr[i2];
            if (mj2.BWR(cls)) {
                return mj2.BeD(cls);
            }
            i = i2 + 1;
        }
    }
}
