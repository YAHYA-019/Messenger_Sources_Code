package X;

/* renamed from: X.4fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fV.class */
public final class C05904fV implements C15h {
    public volatile C15h A00;
    public volatile boolean A01;
    public volatile Object A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4fV, X.15h, java.lang.Object] */
    public static C15h A00(C15h c15h) {
        if (c15h instanceof C05904fV) {
            return c15h;
        }
        ?? obj = new Object();
        obj.A00 = c15h;
        obj.A01 = false;
        return obj;
    }

    @Override // X.C15h
    public Object get() {
        Object obj;
        Object obj2 = this.A02;
        if (this.A01) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A02;
            if (!this.A01) {
                obj = this.A00.get();
                Object obj3 = this.A02;
                if (obj3 != null && obj3 != obj) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Provider was invoked recursively returning different results: ");
                    A0k.append(obj3);
                    A0k.append(" & ");
                    A0k.append(obj);
                    throw AnonymousClass002.A0F(JQw.A00(44), A0k);
                }
                this.A02 = obj;
                this.A01 = true;
                this.A00 = null;
            }
        }
        return obj;
    }
}
