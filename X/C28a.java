package X;

/* renamed from: X.28a, reason: invalid class name */
/* loaded from: 28a.class */
public final class C28a extends C28b {
    public C28a() {
    }

    public C28a(int i) {
    }

    @Override // X.C28b
    public C28c A00() {
        return C28c.A00;
    }

    @Override // X.C28b
    public String A01() {
        return "GuavaModule";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.27J, X.28f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.28Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.28X, java.lang.Object] */
    @Override // X.C28b
    public void A03(C28e c28e) {
        24V[] r304;
        ?? obj = new Object();
        obj._defaultBoundType = null;
        c28e.A5Y(obj);
        c28e.A7K(new Object());
        Object obj2 = new Object();
        AnonymousClass244 anonymousClass244 = ((C28d) c28e).A00;
        24R r0 = anonymousClass244._typeFactory;
        24L r308 = r0._typeCache;
        24V[] r02 = r0._modifiers;
        if (r02 == null) {
            r304 = new 24V[]{obj2};
            r308 = null;
        } else {
            r304 = (24V[]) C28h.A00(obj2, r02);
        }
        24R r03 = new 24R(r0._parser, r308, r0._classLoader, r304);
        anonymousClass244._typeFactory = r03;
        anonymousClass244._deserializationConfig = (C26L) anonymousClass244._deserializationConfig.A0D(r03);
        anonymousClass244._serializationConfig = (C25p) anonymousClass244._serializationConfig.A0D(r03);
        c28e.A5G(new Object());
    }

    public boolean equals(Object obj) {
        return AnonymousClass001.A1W(this, obj);
    }

    public int hashCode() {
        return -1784411382;
    }
}
