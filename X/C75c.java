package X;

import com.facebook.acra.constants.ActionId;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.75c, reason: invalid class name */
/* loaded from: 75c.class */
public final class C75c {
    public final 75Q A00;
    public final 74V A01;
    public final 2Of A02;
    public final C5nC A03;
    public final C74a A04;
    public final 74R A05;
    public final boolean A06;

    public C75c(75Q r302, 74V r303, 2Of r304, C5nC c5nC, C74a c74a, 74R r307, boolean z) {
        11T.A0F(r307, 1);
        11T.A0F(r303, 2);
        11T.A0F(c5nC, 3);
        11T.A0F(c74a, 4);
        11T.A0F(r304, 7);
        11T.A0F(r302, 8);
        this.A05 = r307;
        this.A01 = r303;
        this.A03 = c5nC;
        this.A04 = c74a;
        this.A06 = z;
        this.A02 = r304;
        this.A00 = r302;
    }

    public void A00(5vW r302) {
        74R r0 = this.A05;
        r0.A01();
        75Q r02 = this.A00;
        1xC r03 = (1xC) 1Lm.A07(1Fw.A04((1EZ) r02.A01.A00.get()), r02.A00.A00, 33148);
        r03.A03(new A1b(r03, 30));
        Long l = null;
        C74a c74a = this.A04;
        5vV r04 = (5vV) r302;
        C5fv c5fv = r04.A00;
        c74a.BaS("double_tap", "reaction", null, c74a.ATq(c5fv));
        List A00 = r0.A00();
        74V r05 = this.A01;
        C5fu c5fu = (C5fu) c5fv;
        String str = c5fu.A09;
        String str2 = (String) 0QD.A0D(A00);
        if (this.A06) {
            l = Long.valueOf(7mG.A00(this.A02, (String) null));
        }
        r05.A7C(r04.A01.A00, l, Long.valueOf(c5fu.A02), str, str2);
    }

    public boolean A01(5vW r302) {
        5vV r0 = (5vV) r302;
        C5fv c5fv = r0.A00;
        this.A05.A01();
        if (!(!r0.A00().isEmpty())) {
            return false;
        }
        BitSet bitSet = r0.A01.A00.A00;
        if (!bitSet.get(18) && !bitSet.get(ActionId.APP_FIRST_VIEW_CONTROLLER)) {
            return false;
        }
        11T.A0F(c5fv, 0);
        return (C5ul.A01(c5fv) ^ true) && this.A03.BRy(c5fv);
    }
}
