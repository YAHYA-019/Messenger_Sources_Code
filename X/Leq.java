package X;

/* loaded from: Leq.class */
public final class Leq implements C2ue {
    public final /* synthetic */ C51j A00;

    public Leq(C51j c51j) {
        this.A00 = c51j;
    }

    @Override // X.C2uf
    public /* bridge */ /* synthetic */ void CNC(Object obj) {
        3NT r0 = (3NT) obj;
        C51j c51j = this.A00;
        synchronized (c51j) {
            int i = ((K8r) r0).A01;
            boolean z = true;
            if (i != 2 && i != 1 && i != 4 && i != 8) {
                z = false;
            }
            c51j.A02 = z;
        }
        c51j.A0G.execute(new Lo0(this, r0));
    }
}
