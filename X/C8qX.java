package X;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qX, reason: invalid class name */
/* loaded from: 8qX.class */
public final class C8qX extends 2Yf {
    public 9Wy A00;
    public List A01;

    public C8qX() {
        super("FriendsTabActiveNowListItemSection");
        this.A01 = Collections.emptyList();
    }

    public void A0Q(C1qb c1qb) {
        9Wy r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public 2Ys A0d(C1qb c1qb) {
        List list = this.A01;
        boolean A1X = 1BL.A1X(c1qb, list);
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        C83f A00 = C2hd.A00(c1qb);
        A00.A2Z(0);
        A00.A2Y(0);
        A00.A00.A02 = A1X ? 1 : 0;
        A0I.A04(A00);
        A0l.A00(A0I);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2hf A0s = 7zM.A0s(c1qb, (ImmutableList) it.next());
            A0s.A05(2Yg.A07(c1qb, C8qX.class, "FriendsTabActiveNowListItemSection"));
            A0s.A04(2Yg.A04(c1qb, C8qX.class, "FriendsTabActiveNowListItemSection"));
            A0s.A03(2Yg.A0A(c1qb, C8qX.class, "FriendsTabActiveNowListItemSection", -680621655));
            A0l.A00(A0s);
        }
        2Ys r0 = A0l.A00;
        11T.A0A(r0);
        return r0;
    }

    public Object A0e(1Im r302, Object obj) {
        boolean BVd;
        int i = r302.A01;
        if (i == -680621655) {
            C4I1 c4i1 = (C4I1) obj;
            AnonymousClass544 anonymousClass544 = (AnonymousClass544) c4i1.A01;
            AnonymousClass544 anonymousClass5442 = (AnonymousClass544) c4i1.A00;
            11T.A0F(anonymousClass544, 1);
            BVd = anonymousClass544.BVd(anonymousClass5442);
        } else {
            if (i == 239257522) {
                1Iw r0 = r302.A00.A00;
                AnonymousClass544 anonymousClass5443 = (AnonymousClass544) ((C2i6) obj).A01;
                11T.A0H(r0, anonymousClass5443);
                return 7zM.A0t(7zM.A10(anonymousClass5443, 55M.A00(r0)), 7zL.A0m());
            }
            if (i != 1171108835) {
                return null;
            }
            C2hu c2hu = (C2hu) obj;
            AnonymousClass544 anonymousClass5444 = (AnonymousClass544) c2hu.A01;
            AnonymousClass544 anonymousClass5445 = (AnonymousClass544) c2hu.A00;
            1BL.A1F(anonymousClass5444, anonymousClass5445);
            BVd = AnonymousClass001.A1O((anonymousClass5444.getId() > anonymousClass5445.getId() ? 1 : (anonymousClass5444.getId() == anonymousClass5445.getId() ? 0 : -1)));
        }
        return Boolean.valueOf(BVd);
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qX c8qX = (C8qX) r302;
            9Wy r0 = this.A00;
            9Wy r02 = c8qX.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            List list = this.A01;
            List list2 = c8qX.A01;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
        }
        return true;
    }
}
