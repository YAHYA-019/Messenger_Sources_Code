package X;

import com.facebook.common.util.TriState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: Fiu.class */
public final class Fiu implements AXV {
    public final /* synthetic */ TriState A00;
    public final /* synthetic */ DZB A01;
    public final /* synthetic */ ELK A02;
    public final /* synthetic */ ImmutableList A03;

    public Fiu(TriState triState, DZB dzb, ELK elk, ImmutableList immutableList) {
        this.A00 = triState;
        this.A03 = immutableList;
        this.A01 = dzb;
        this.A02 = elk;
    }

    public final 2Yf AKs(1Im r302, C1qb c1qb) {
        11T.A0F(c1qb, 0);
        7zL.A1K(c1qb);
        2Yf qow = new QOW();
        ((QOW) qow).A04 = AnonymousClass001.A1W(this.A00, TriState.YES);
        ((QOW) qow).A02 = this.A03;
        DZB dzb = this.A01;
        ImmutableSet immutableSet = dzb.A05;
        if (immutableSet == null) {
            11T.A0L("newStickersTemplatesIds");
            throw 0Q8.createAndThrow();
        }
        ((QOW) qow).A03 = immutableSet;
        ((QOW) qow).A01 = this.A02;
        ((QOW) qow).A00 = dzb.A08;
        ((QOW) qow).A05 = true;
        return qow;
    }
}
