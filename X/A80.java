package X;

import com.google.common.collect.ImmutableList;

/* loaded from: A80.class */
public final class A80 implements 6wP {
    public final /* synthetic */ C1qb A00;
    public final /* synthetic */ 79M A01;

    public A80(C1qb c1qb, 79M r303) {
        this.A00 = c1qb;
        this.A01 = r303;
    }

    public void BxK(Throwable th) {
        C1qb c1qb = this.A00;
        ELK elk = ELK.A02;
        if (c1qb.A0J() != null) {
            c1qb.A0G(7zL.A0f(new Object[]{elk, null}, 1), "updateState:GalleryDataServiceSection.updateState");
        }
        2Yg.A0H(c1qb, 0S2.A0N, th, true);
    }

    public void C3q() {
        C1qb c1qb = this.A00;
        ELK elk = ELK.A01;
        if (c1qb.A0J() != null) {
            c1qb.A0H(7zL.A0f(new Object[]{elk, null}, 1), "updateState:GalleryDataServiceSection.updateState");
        }
        2Yg.A0H(c1qb, 0S2.A01, (Throwable) null, false);
    }

    public void COn(ImmutableList immutableList) {
        C2ko A0G;
        C1qb c1qb = this.A00;
        ELK elk = ELK.A03;
        if (c1qb.A0J() != null) {
            c1qb.A0G(7zL.A0f(new Object[]{elk, immutableList}, 1), "updateState:GalleryDataServiceSection.updateState");
        }
        2Yg.A0H(c1qb, 0S2.A0C, (Throwable) null, immutableList.isEmpty());
        79M r0 = this.A01;
        if (r0 == null || (A0G = 1LI.A0G(r0.A01, 1261848766)) == null) {
            return;
        }
        A0G.A00(new Object(), new Object[0]);
    }
}
