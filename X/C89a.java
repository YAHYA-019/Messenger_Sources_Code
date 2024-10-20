package X;

import java.util.BitSet;

/* renamed from: X.89a, reason: invalid class name */
/* loaded from: 89a.class */
public final class C89a extends C1rs {
    public 1Iw A00;
    public 89Z A01;
    public final BitSet A02;
    public final String[] A03;

    public C89a(1Iw r302, 89Z r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "hasBottomUnwrappedContent", "hasTopUnwrappedContent", "item", "listClickListener", "photoClickListener", "theme"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 89Z A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
