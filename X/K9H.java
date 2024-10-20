package X;

import com.google.common.base.Preconditions;

/* loaded from: K9H.class */
public final class K9H extends 1Ds {
    public final /* synthetic */ KAf A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9H(KAf kAf, int i) {
        super(i, 0);
        this.A00 = kAf;
    }

    public /* bridge */ /* synthetic */ Object A00(int i) {
        KAf kAf = this.A00;
        Preconditions.checkElementIndex(i, kAf.size());
        return new K9S(kAf, i);
    }
}
