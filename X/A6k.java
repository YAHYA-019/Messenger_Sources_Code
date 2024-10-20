package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: A6k.class */
public final class A6k implements C6zy {
    public static final 1G2 A04 = 1G3.A00(1G0.A00, "emoji_default_expression");
    public Boolean A00;
    public int A01;
    public final 1Br A02 = 1BK.A0E();
    public final 1Br A03 = 1Bq.A00(49412);

    private final void A00(C77n c77n, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.A00 = valueOf;
        int i = 0;
        if (7zR.A1X(valueOf)) {
            ImmutableList immutableList = ((C77u) c77n.AUP(C77u.class)).A01;
            11T.A0A(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                if (!11T.A0O(((C77r) it.next()).A02.getClass(), C6zu.A00.getClass())) {
                    i++;
                } else if (i == -1) {
                    return;
                }
            }
            return;
        }
        this.A01 = i;
    }

    @Override // X.C6zy
    public C6zq AVR(C77n c77n, C77r c77r) {
        11T.A0F(c77r, 1);
        return ((C77v) c77n.AUP(C77v.class)).A05 ? C6zu.A03 : c77r.A02;
    }

    @Override // X.C6zy
    public int Ah5(C77n c77n) {
        if (this.A00 == null) {
            A00(c77n, 1BK.A1T(1Br.A09(this.A02), A04));
            AnonymousClass001.A0K().equals(this.A00);
        }
        return this.A01;
    }

    @Override // X.C6zy
    public void Bdr(C77n c77n, 7BV r303) {
        if (this.A00 == null) {
            A00(c77n, 1BK.A1T(1Br.A09(this.A02), A04));
        }
        if (AnonymousClass001.A0K().equals(this.A00)) {
            return;
        }
        if (0S2.A0N != r303.A00) {
            ((C12044yi) 1Br.A0B(this.A03)).A05("CONSECUTIVE_EMOJI_SENDS", null);
        }
        if (((C77v) c77n.AUP(C77v.class)).A05) {
            return;
        }
        C00i c00i = this.A03.A00;
        ((C12044yi) c00i.get()).A06("CONSECUTIVE_EMOJI_SENDS", null);
        if (((C12044yi) c00i.get()).A03("CONSECUTIVE_EMOJI_SENDS", null) > 5) {
            1Ql.A01(1Br.A08(this.A02), A04, true);
            A00(c77n, true);
        }
    }
}
