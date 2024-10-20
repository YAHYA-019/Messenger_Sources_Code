package X;

/* renamed from: X.28d, reason: invalid class name */
/* loaded from: 28d.class */
public final class C28d implements C28e {
    public final /* synthetic */ AnonymousClass244 A00;

    public C28d(AnonymousClass244 anonymousClass244) {
        this.A00 = anonymousClass244;
    }

    @Override // X.C28e
    public void A5G(28Y r302) {
        AnonymousClass244 anonymousClass244 = this.A00;
        C27d c27d = (C27d) anonymousClass244._serializerFactory;
        28V r0 = c27d._factoryConfig;
        anonymousClass244._serializerFactory = c27d.A09(new 28V((28Y[]) C28h.A00(r302, r0._modifiers), r0._additionalSerializers, r0._additionalKeySerializers));
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.27T, X.27S] */
    @Override // X.C28e
    public void A5Y(C27J c27j) {
        AnonymousClass244 anonymousClass244 = this.A00;
        AnonymousClass277 anonymousClass277 = (AnonymousClass277) anonymousClass244._deserializationContext._factory;
        C27I c27i = anonymousClass277._factoryConfig;
        C27J[] c27jArr = (C27J[]) C28h.A00(c27j, c27i._additionalDeserializers);
        C27P[] c27pArr = c27i._additionalKeyDeserializers;
        anonymousClass244._deserializationContext = new C27T(anonymousClass244._deserializationContext, anonymousClass277.A0I(new C27I(c27i._abstractTypeResolvers, c27i._modifiers, c27jArr, c27pArr, c27i._valueInstantiators)));
    }

    @Override // X.C28e
    public void A7K(28X r302) {
        AnonymousClass244 anonymousClass244 = this.A00;
        C27d c27d = (C27d) anonymousClass244._serializerFactory;
        28V r0 = c27d._factoryConfig;
        anonymousClass244._serializerFactory = c27d.A09(new 28V(r0._modifiers, (28X[]) C28h.A00(r302, r0._additionalSerializers), r0._additionalKeySerializers));
    }
}
