package X;

import android.content.Context;
import java.util.BitSet;

/* renamed from: X.Awb, reason: case insensitive filesystem */
/* loaded from: Awb.class */
public final class C1910Awb extends C1rs {
    public 1Iw A00;
    public B0u A01;
    public final BitSet A02;
    public final String[] A03;

    public C1910Awb(1Iw r302, B0u b0u) {
        super(b0u, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "darkLogo", "description1", "description2", "description3", "descriptionIcon1", "descriptionIcon2", "descriptionIcon3", "descriptionTitle1", "descriptionTitle2", "descriptionTitle3", "lightLogo", "onPrimaryButtonClickListener", "primaryButtonText", "title"};
        BitSet A18 = 1BK.A18(15);
        this.A02 = A18;
        this.A01 = b0u;
        this.A00 = r302;
        A18.clear();
    }

    public static void A06(Context context, C1u2 c1u2, C1910Awb c1910Awb, B0u b0u, BitSet bitSet) {
        bitSet.set(4);
        B0u b0u2 = c1910Awb.A01;
        Context context2 = ((C1rs) c1910Awb).A02.A00;
        b0u2.A04 = context2.getDrawable(2132411106);
        BitSet bitSet2 = c1910Awb.A02;
        bitSet2.set(11);
        c1910Awb.A01.A00 = context2.getDrawable(2132411106);
        bitSet2.set(1);
        b0u.A01 = c1u2.A08(C1u3.A4H, context.getColor(2132214470));
        bitSet.set(5);
        b0u.A02 = c1u2.A08(C1u3.A1m, context.getColor(2132214470));
        bitSet.set(6);
        b0u.A03 = c1u2.A08(C1u3.A2m, context.getColor(2132214470));
        bitSet.set(7);
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 15);
        A0J();
        return this.A01;
    }
}
