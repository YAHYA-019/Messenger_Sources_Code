package X;

/* renamed from: X.31h, reason: invalid class name */
/* loaded from: 31h.class */
public final class C31h implements InterfaceC01743sp {
    public final int A00;
    public final Object A01;

    public C31h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC01743sp
    public final void BQ3(AbstractC08294mh abstractC08294mh) {
        switch (this.A00) {
            case 1:
            case 4:
                ((1FX) this.A01).set(abstractC08294mh);
                return;
            default:
                ((1K9) this.A01).onSuccess(abstractC08294mh);
                return;
        }
    }
}
