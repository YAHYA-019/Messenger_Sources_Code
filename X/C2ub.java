package X;

/* renamed from: X.2ub, reason: invalid class name */
/* loaded from: 2ub.class */
public final class C2ub implements 2uP {
    public final 2uP A00;
    public final 2uL A01;

    public C2ub(2uP r302, 2uL r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public final /* bridge */ /* synthetic */ Object DCA() {
        Object DCA = this.A00.DCA();
        if (DCA != null) {
            return DCA;
        }
        throw AnonymousClass001.A0Q("Cannot return null from a non-@Nullable @Provides method");
    }
}
