package X;

/* loaded from: Leu.class */
public final class Leu implements MGT {
    public static final Object A02 = AnonymousClass001.A0R();
    public volatile MGT A00;
    public volatile Object A01;

    @Override // X.MGT
    public final Object A3b() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.A3b();
                Object obj4 = this.A01;
                if (obj4 != obj3 && obj4 != obj) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Scoped provider was invoked recursively returning different results: ");
                    A0k.append(obj4);
                    A0k.append(" & ");
                    A0k.append(obj);
                    throw AnonymousClass002.A0F(". This is likely due to a circular dependency.", A0k);
                }
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }
}