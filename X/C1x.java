package X;

/* loaded from: C1x.class */
public final class C1x {
    public final /* synthetic */ C1617Anv A00;

    public C1x(C1617Anv c1617Anv) {
        this.A00 = c1617Anv;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.LiveData, java.lang.Object, X.Anv] */
    public void A00(Object obj, String str) {
        11T.A0F(obj, 0);
        ?? r0 = this.A00;
        if (!r0.hasActiveObservers()) {
            throw AnonymousClass001.A0L("Data is inactive. Did you forget to unsubscribe?");
        }
        Object value = r0.getValue();
        11T.A0D(value);
        2Sh r02 = (2Sh) value;
        G9N g9n = new G9N(r02, (Object) r0, obj, str, 8);
        if (1Br.A07(((BjS) 1Br.A0B(r0.A03)).A00).AZk(36320446773345676L)) {
            if (11T.A0O(str == null ? AbH.A14(r02, obj.getClass()) : r02.A01(str, (Class) null), obj)) {
                return;
            }
        }
        g9n.invoke();
    }
}
