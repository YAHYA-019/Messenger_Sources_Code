package X;

/* loaded from: K9T.class */
public final class K9T extends 2Ix {
    public K9T A00;
    public K9T A01;
    public K9T A02;
    public K9T A03;
    public Object A04;
    public final Object A05;

    public K9T(Object obj, Object obj2) {
        this.A05 = obj;
        this.A04 = obj2;
    }

    public Object getKey() {
        return this.A05;
    }

    public Object getValue() {
        return this.A04;
    }

    public Object setValue(Object obj) {
        Object obj2 = this.A04;
        this.A04 = obj;
        return obj2;
    }
}
