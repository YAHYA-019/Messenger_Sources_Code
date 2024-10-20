package X;

/* loaded from: LdY.class */
public final class LdY implements MIw {
    public final MIw[] A00;

    public LdY(MIw... mIwArr) {
        this.A00 = mIwArr;
    }

    @Override // X.MIw
    public final MJf DCJ(Class cls) {
        int i = 0;
        do {
            MIw mIw = this.A00[i];
            if (mIw.DCT(cls)) {
                return mIw.DCJ(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass001.A0q("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.MIw
    public final boolean DCT(Class cls) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (!this.A00[i].DCT(cls)) {
                i++;
                if (i >= 2) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }
}
