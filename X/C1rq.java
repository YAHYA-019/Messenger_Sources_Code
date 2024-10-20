package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rq, reason: invalid class name */
/* loaded from: 1rq.class */
public final class C1rq extends C1rr {
    public C1rh A00;

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        return this.A00;
    }

    @Override // X.C1rr
    public /* bridge */ /* synthetic */ C1rr A2W(C1rs c1rs) {
        A2e(c1rs);
        return this;
    }

    @Override // X.C1rr
    public /* bridge */ /* synthetic */ C1rr A2X(1LI r302) {
        A2f(r302);
        return this;
    }

    @Override // X.C1rr
    public /* bridge */ /* synthetic */ C1rr A2Y(C1ro c1ro) {
        A2g(c1ro);
        return this;
    }

    public final void A2b() {
        A2h(C1ro.CENTER);
    }

    public final void A2c() {
        A2i(C1rp.CENTER);
    }

    public final void A2d() {
        A2i(C1rp.SPACE_BETWEEN);
    }

    public void A2e(C1rs c1rs) {
        if (c1rs != null) {
            A2f(c1rs.A2V());
        }
    }

    public void A2f(1LI r302) {
        if (r302 != null) {
            C1rh c1rh = this.A00;
            List list = c1rh.A04;
            if (list == null) {
                list = new ArrayList();
                c1rh.A04 = list;
            }
            list.add(r302);
        }
    }

    public void A2g(C1ro c1ro) {
        this.A00.A00 = c1ro;
    }

    public void A2h(C1ro c1ro) {
        this.A00.A01 = c1ro;
    }

    public void A2i(C1rp c1rp) {
        this.A00.A02 = c1rp;
    }
}
