package X;

import java.util.List;

/* loaded from: Jum.class */
public final class Jum extends Kta implements MEq {
    public final /* synthetic */ LXl A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jum(MEq mEq, MKa mKa, LXl lXl, String str) {
        super(mKa, lXl, mEq);
        this.A00 = lXl;
        this.A01 = str;
    }

    @Override // X.MEq
    public void CEr(L1w l1w, List list) {
        11T.A0F(l1w, 0);
        A01(l1w, new 83T(l1w, list, 5));
    }
}
