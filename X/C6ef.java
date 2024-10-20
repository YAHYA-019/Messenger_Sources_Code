package X;

import android.content.Context;
import java.util.BitSet;

/* renamed from: X.6ef, reason: invalid class name */
/* loaded from: 6ef.class */
public final class C6ef extends C63h {
    public 1BY A00;
    public final C00i A01;
    public final IaW A02;
    public final FkB A03;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.FkB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.IaW, java.lang.Object] */
    public C6ef(1BO r302) {
        super((Context) 1Bn.A0E((Context) null, (1BY) null, 83719));
        this.A01 = new 1BV((1BY) null, 67318);
        this.A02 = new Object();
        this.A03 = new Object();
        this.A00 = new 1BY(r302);
    }

    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        8P8 r0 = new 8P8(r302, new C8jk());
        C8jk c8jk = r0.A01;
        c8jk.A03 = anonymousClass622;
        BitSet bitSet = r0.A02;
        bitSet.set(2);
        c8jk.A05 = r306;
        c8jk.A00 = r303;
        c8jk.A04 = (7Wj) this.A01.get();
        bitSet.set(3);
        c8jk.A01 = this.A02;
        bitSet.set(0);
        c8jk.A02 = this.A03;
        bitSet.set(1);
        C1rs.A02(bitSet, r0.A03);
        r0.A0J();
        return c8jk;
    }
}
