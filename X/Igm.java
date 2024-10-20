package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Igm.class */
public final class Igm implements JGb {
    public final int A00;
    public final Object A01;

    public Igm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JGb
    public final void CFj(ImmutableList immutableList) {
        1Uv.A02(4YU.A0A("com.facebook.orca.ACTION_STICKER_SENT_FROM_STAR_TAB"), (1Uv) 1Br.A0B(this.A00 != 0 ? (1Br) this.A01 : ((C2735Gmk) this.A01).A0H));
    }
}
