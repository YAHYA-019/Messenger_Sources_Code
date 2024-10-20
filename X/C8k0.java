package X;

/* renamed from: X.8k0, reason: invalid class name */
/* loaded from: 8k0.class */
public final class C8k0 extends C1rj {
    public 5AY A00;

    public C8k0() {
        super("M4SwipeActionButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5AY r0 = this.A00;
        C8lx c8lx = new C8lx();
        C1rs c1rs = new C1rs(c8lx, r302, 0, 0);
        ((8O7) c1rs).A01 = c8lx;
        ((8O7) c1rs).A00 = r302;
        c8lx.A01 = true;
        c8lx.A00 = r0.A01;
        c1rs.A2S(r0.A02);
        7zN.A1C(c1rs, r302, C8k0.class, "M4SwipeActionButtonAccessoryLayout");
        c1rs.A0J();
        return ((8O7) c1rs).A01;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C8k0) r0).A00.A00.onClick(((3xC) obj).A00);
        return null;
    }
}
