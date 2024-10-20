package X;

import android.content.Context;
import java.util.BitSet;
import java.util.concurrent.Executor;

/* renamed from: X.Aza, reason: case insensitive filesystem */
/* loaded from: Aza.class */
public final class C2013Aza extends C1rj {
    public C2013Aza() {
        super("Rooms2LivePagePickerComponent");
    }

    public final Object[] A0k() {
        return 1LI.A0A;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2iw c2iw = 4YU.A0P(r302).A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        AwH awH = new AwH(r302, new B0z());
        awH.A1w(c2iw);
        B0z b0z = awH.A01;
        C1qo c1qo = awH.A02;
        b0z.A06 = c1qo.A0D(2131966249);
        BitSet bitSet = awH.A02;
        bitSet.set(3);
        b0z.A00 = 2131966228;
        b0z.A05 = c1qo.A0D(2131966250);
        bitSet.set(2);
        b0z.A04 = c1qo.A0D(2131966248);
        bitSet.set(1);
        b0z.A03 = c1qo.A0D(2131966247);
        bitSet.set(0);
        b0z.A01 = 1LI.A09(r302, C2013Aza.class, "Rooms2LivePagePickerComponent", 1162482760);
        A01.A2e(awH.A2W());
        A01.A0V();
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1162482760) {
            return null;
        }
        AbN.A0O(r302.A00.A00.A0D, "Rooms2LivePagePickerComponentSpec").A02(QqI.A09);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.66W] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ?? obj = new Object();
        Context context = r302.A0D;
        C65 c65 = (C65) 1Bn.A0E(context, (1BY) null, 85080);
        Executor executor = (Executor) 1Bi.A03(16469);
        ((66W) obj).A00 = new Object();
        IDw.A00(context, "Rooms2LivePagePickerComponentSpec");
        C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FetchPagesForRoomsBroadcasts", (String) null, "fbandroid", -898905910, 0, 2598069422L, 2598069422L, false, true));
        ((C3sb) A0L).A00 = 2;
        1Vd A0I = AbK.A0I(c65.A00);
        C00i c00i = c65.A02;
        1Kd.A0F(D4p.A00(obj, r302, 63), AbJ.A0t(c00i, D3J.A01(c65, 33), A0I.A0A(A0L, 1BK.A1E(c00i))), executor);
        ((B1S) r303).A00 = (C2iw) ((66W) obj).A00;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
