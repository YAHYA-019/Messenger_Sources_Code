package X;

/* loaded from: K9S.class */
public final class K9S extends 2Ix {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KAf A01;

    public K9S(KAf kAf, int i) {
        this.A01 = kAf;
        this.A00 = i;
    }

    public Object getKey() {
        KAf kAf = this.A01;
        return kAf.A00.keySet().asList().get(this.A00);
    }

    public Object getValue() {
        KAf kAf = this.A01;
        int i = this.A00;
        if (kAf instanceof K9n) {
            return new K9m(((K9n) kAf).A00, i);
        }
        K9m k9m = (K9m) kAf;
        return L5M.A00(k9m.A01, k9m.A00, i)[i];
    }

    public Object setValue(Object obj) {
        KAf kAf = this.A01;
        int i = this.A00;
        if (kAf instanceof K9n) {
            throw AnonymousClass001.A0p();
        }
        K9m k9m = (K9m) kAf;
        Object[] A00 = L5M.A00(k9m.A01, k9m.A00, i);
        Object obj2 = A00[i];
        A00[i] = obj;
        return obj2;
    }
}
