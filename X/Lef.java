package X;

/* loaded from: Lef.class */
public final class Lef implements MGS {
    public final MGS A00;

    public Lef(MGS mgs) {
        this.A00 = mgs;
    }

    @Override // X.MGS
    public final /* bridge */ /* synthetic */ Object DCA() {
        Object DCA = this.A00.DCA();
        if (DCA != null) {
            return DCA;
        }
        throw AnonymousClass001.A0Q(1BJ.A00(24));
    }
}
