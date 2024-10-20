package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.BitSet;

/* renamed from: X.579, reason: invalid class name */
/* loaded from: 579.class */
public final class AnonymousClass579 implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        C1rq A00;
        57A r0 = (57A) anonymousClass544;
        boolean A1X = 1BL.A1X(r302, r0);
        MediaResource mediaResource = r0.A02;
        String str = mediaResource.A0n;
        if (str == null || str.length() == 0) {
            A00 = C1rg.A00(r302);
        } else {
            66I r02 = (66I) 1Bi.A03(49956);
            A00 = C1rg.A00(r302);
            4YU.A1L(A00, 2RH.A03);
            A00.A1A(4YU.A00(2RH.A05));
            8Pt r03 = new 8Pt(r302, new 8nP());
            8nP r04 = r03.A01;
            r04.A08 = str;
            BitSet bitSet = r03.A02;
            bitSet.set(8);
            r04.A07 = r02.A01((int) mediaResource.A07);
            bitSet.set(7);
            r04.A02 = C1u3.A2M;
            bitSet.set(5);
            r04.A09 = r0.A03;
            bitSet.set(6);
            4YW.A0B(4YU.A0E(r302), r04, bitSet, 2131967780, A1X ? 1 : 0);
            bitSet.set(0);
            r04.A04 = r0.A01;
            bitSet.set(4);
            r04.A03 = new 9xX(r0);
            bitSet.set(3);
            C1rs.A05(bitSet, r03.A03, 9);
            r03.A0J();
            A00.A2f(r04);
        }
        return A00.A00;
    }

    public Class BDi() {
        return 57A.class;
    }
}
