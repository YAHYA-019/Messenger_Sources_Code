package X;

import com.facebook.contacts.graphql.Contact;
import com.facebook.contacts.server.FetchContactsResult;
import com.facebook.contacts.server.FetchMultipleContactsByFbidParams;
import com.facebook.user.model.Name;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Apj, reason: case insensitive filesystem */
/* loaded from: Apj.class */
public final class C1677Apj extends C4r3 {
    public static final String __redex_internal_original_name = "FetchMultipleContactsMethod";
    public final CGn A00;
    public final COi A01;
    public final C00i A02;

    public C1677Apj() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = AbJ.A0F();
        this.A00 = (CGn) 1Bn.A0A(84597);
        this.A02 = AbH.A0a();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(9);
        CGn.A00(this.A00, A0H);
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = ((FetchMultipleContactsByFbidParams) obj).A01.iterator();
        while (it.hasNext()) {
            AbK.A1Q(A0h, it);
        }
        A0H.A07("profile_ids", A0h.build());
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        boolean z;
        CFq A03;
        String A0k;
        String A0j;
        String A0l;
        String A0l2;
        String A0l3;
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = ((List) obj2).iterator();
        String str = null;
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            if (A0P != null) {
                2JX A0L = 1BL.A0L(A0P, -1479097612, 1332212163);
                2JX A0M = A0L == null ? null : 1BL.A0M(A0L, 535888496, 599211397);
                str = A0P.A0j();
                if (A0P.getTypeName() != null) {
                    z = A0P.getTypeName().equals("Page");
                    if (A0P.getTypeName().equals("User")) {
                        z = A0P.getBooleanValue(887162311);
                    }
                } else {
                    z = false;
                }
                if (A0M != null) {
                    try {
                        A03 = this.A01.A03(A0M);
                    } catch (Exception e) {
                        0fH.A0N(C1677Apj.class, "Couldn't deserialize contact", e, new Object[0]);
                        throw e;
                    }
                } else if (z && (A0k = A0P.A0k()) != null && (A0j = A0P.A0j()) != null) {
                    A03 = new CFq();
                    A03.A0a = A0k;
                    A03.A0P = new Name(A0j, "", A0j);
                    A03.A0n = A0k;
                    2JY A0B = 1BK.A0B(A0P, 2JX.class, 295369720, -1124720536);
                    if (A0B != null && (A0l3 = A0B.A0l()) != null) {
                        A03.A0o = A0l3;
                        A03.A0B = AbH.A01(A0B);
                    }
                    2JY A0B2 = 1BK.A0B(A0P, 2JX.class, 2006057137, -1124720536);
                    if (A0B2 != null && (A0l2 = A0B2.A0l()) != null) {
                        A03.A0Z = A0l2;
                        A03.A05 = AbH.A01(A0B2);
                    }
                    2JY A0B3 = 1BK.A0B(A0P, 2JX.class, -1271352164, -1124720536);
                    if (A0B3 != null && (A0l = A0B3.A0l()) != null) {
                        A03.A0e = A0l;
                        A03.A06 = AbH.A01(A0B3);
                    }
                }
                builder.m11011add((Object) new Contact(A03));
            }
        }
        return new FetchContactsResult(EnumC08284mf.A06, builder.build(), str, 1BL.A08(this.A02));
    }
}
