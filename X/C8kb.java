package X;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8kb, reason: invalid class name */
/* loaded from: 8kb.class */
public final class C8kb extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public 1Im A03;
    public 78I A04;
    public List A05;

    public C8kb() {
        super("MentionsResultsComponent");
        this.A05 = Collections.emptyList();
        this.A00 = -7829368;
        this.A01 = -9473418;
        this.A02 = -16250871;
    }

    public final Object[] A0k() {
        return 7zU.A1b(this.A05, this.A04, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2hd c2hd;
        78I r0 = this.A04;
        List<8eK> list = this.A05;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        boolean A1X = 1BL.A1X(r302, r0);
        Dud A01 = Dzc.A01(r302);
        2cM A00 = 2cK.A00(r302);
        A00.A0e();
        if ((list == null || 1BK.A1Y(list) != A1X) && !1BK.A1Y(r0.A01)) {
            c2hd = null;
        } else {
            C83f A002 = C2hd.A00(r302);
            A002.A0e();
            A002.A2Z(0);
            A002.A2Y(i);
            A002.A00.A02 = A1X ? 1 : 0;
            c2hd = A002.A2V();
        }
        A00.A2e(c2hd);
        ImmutableList immutableList = r0.A00;
        C6qi c6qi = C6qi.A02;
        if (immutableList.contains(c6qi) && list != null) {
            for (8eK r02 : list) {
                if (r02.A01 == c6qi) {
                    A00.A2e(r02);
                }
            }
        }
        Iterator it = r0.A01.iterator();
        while (it.hasNext()) {
            C5fr c5fr = (C5fr) it.next();
            11T.A0D(c5fr);
            A00.A2e(new 8gL(c5fr, AVF.A01(r302, 34), i2, i3));
        }
        if (list != null) {
            for (8eK r03 : list) {
                C6qi c6qi2 = r03.A01;
                if (c6qi2 != c6qi && immutableList.contains(c6qi2)) {
                    A00.A2e(r03);
                }
            }
        }
        return 7zM.A0w(A00.A00, A01);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
