package X;

import com.facebook.contacts.graphql.Contact;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Amq, reason: case insensitive filesystem */
/* loaded from: Amq.class */
public final class C1609Amq extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C1609Amq(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JY A0L;
        2JY A0B;
        2JY A0B2;
        Cpv cpv;
        C1325Ae3 c1325Ae3;
        String str;
        ImmutableList of;
        Object obj2;
        2JY A0K;
        2JY A0B3;
        ImmutableList A0a;
        if (this.A00 == 0) {
            2JY r0 = (2JY) obj;
            2JY A0B4 = (r0 == null || (A0L = AbF.A0L(r0, 2JX.class, 1123660967)) == null || (A0B = 1BK.A0B(A0L, 2JX.class, 687788958, 1265446180)) == null || (A0B2 = 1BK.A0B(A0B, 2JX.class, 528648080, 1734636682)) == null) ? null : 1BK.A0B(A0B2, 2JX.class, 2138939008, 691993093);
            boolean z = true;
            if (A0B4 == null) {
                ((C7Q3) 1Br.A0B(((Brd) this.A02).A01)).A04(this.A03, true);
                return;
            }
            String A0k = A0B4.A0k();
            C7Q3 c7q3 = (C7Q3) 1Br.A0B(((Brd) this.A02).A01);
            String str2 = this.A03;
            if (A0k != null && A0k.length() != 0) {
                z = false;
            }
            c7q3.A04(str2, z);
            BkN bkN = (BkN) this.A01;
            1Ql A08 = 1Br.A08(bkN.A01);
            A08.CaL(1G3.A01(1NK.A0G, bkN.A00.A02), A0k);
            A08.commit();
            return;
        }
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0K = AbF.A0K((2JY) obj2, 2JX.class, 1818686360)) == null || (A0B3 = 1BK.A0B(A0K, 2JX.class, 1392614399, 1575413731)) == null || (A0a = A0B3.A0a(-1178308548, 2JX.class)) == null || A0a.isEmpty()) {
            cpv = (Cpv) this.A01;
            c1325Ae3 = cpv.A05;
            str = this.A03;
            of = ImmutableList.of();
        } else {
            cpv = (Cpv) this.A01;
            ImmutableList.Builder A0h = 4YU.A0h();
            for (int i = 0; i < A0a.size(); i++) {
                A0h.m11011add((Object) CJG.A01(new Contact(cpv.A04.A03(1BL.A0M(AbG.A0E(A0a, i), 535888496, 599211397)))));
            }
            of = A0h.build();
            c1325Ae3 = cpv.A05;
            str = this.A03;
        }
        c1325Ae3.BsT(AbG.A0n(of), cpv, (ByH) this.A02, str);
    }

    public void A03(Throwable th) {
        if (this.A00 != 0) {
            Cpv cpv = (Cpv) this.A01;
            cpv.A05.BsT(AbK.A0b(), cpv, null, this.A03);
            return;
        }
        C7Q3 c7q3 = (C7Q3) 1Br.A0B(((Brd) this.A02).A01);
        String str = this.A03;
        if (C7Q3.A00(c7q3)) {
            AbN.A12(1BK.A08(1BK.A07(c7q3.A00), "page_rtc_cross_page_calling_actor_id_fetch_fail"), str);
        }
    }
}
