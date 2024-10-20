package X;

/* renamed from: X.4Gs, reason: invalid class name */
/* loaded from: 4Gs.class */
public final class C4Gs implements C4Gf {
    @Override // X.C4Gf
    public C4Gy A8f(C4Gc c4Gc, 44I r303) {
        11T.A0F(c4Gc, 1);
        C4Nx c4Nx = c4Gc.A05;
        if (c4Nx != null && !c4Gc.A0J) {
            C2vh c2vh = c4Nx.A01;
            long j = c4Nx.A00;
            if (j > 0) {
                4HD r0 = (4HD) 1Br.A0B(c4Nx.A02.A00);
                C2vg c2vg = (C2vg) c2vh;
                if (c4Gc.A00 < 1BK.A0R(r0.A00).Av1(4HD.A01(r0, "qp_sdk_clash", c2vg.locationName), 0L) + j) {
                    return C4Gx.A03(0Pz.A0W("In location cooldown for location ", c2vg.locationName));
                }
            }
        }
        return C4Gx.A00();
    }

    @Override // X.C4Gf
    public String DAM() {
        return "client_clash_management";
    }
}
