package X;

import android.content.Context;
import android.database.Cursor;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SingletonImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Cq0.class */
public final class Cq0 implements DIW {
    public static final Function A0F = D3E.A00;
    public 5O6 A00;
    public final Context A03;
    public final FbUserSession A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final 1Br A0A;
    public final C9C A0B;
    public final Function A0C;
    public final boolean A0D;
    public final C00i A0E;
    public final 1Br A09 = AbG.A0S();
    public ImmutableList A02 = ImmutableList.of();
    public ImmutableList A01 = ImmutableList.of();

    public Cq0(Context context, FbUserSession fbUserSession, boolean z) {
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A0D = z;
        this.A0A = 1Bu.A01(context, 84334);
        1Bu.A06(context, 84385);
        this.A0B = new C9C(context, fbUserSession);
        this.A0E = 1Bu.A01(context, 50092);
        this.A05 = 1Bu.A01(context, 84299);
        this.A06 = 1Bu.A01(context, 84426);
        this.A07 = 1Bu.A01(context, 84349);
        this.A08 = 1Bu.A01(context, 82526);
        this.A0C = D3J.A01(this, 49);
    }

    public final ImmutableList A00(C96 c96) {
        ImmutableList of;
        ImmutableList copyOf;
        C00i c00i;
        int A03;
        int A04;
        ImmutableList of2;
        ImmutableList A0a;
        ImmutableList copyOf2;
        ImmutableList A0b;
        FbUserSession fbUserSession = this.A04;
        C1333AeN A00 = ((C6p) 1Lm.A05(this.A03, fbUserSession, 84346)).A00(c96, "GroupChatsSectionDataSource");
        if (A00 != null) {
            ImmutableList immutableList = A00.A01;
            if (09K.A00(immutableList)) {
                0fH.A0m("GroupChatsSectionDataSource", "Using cached section data");
                return immutableList;
            }
        }
        ImmutableList immutableList2 = c96 != null ? c96.A03 : null;
        if (this.A02.isEmpty()) {
            0fH.A0m("GroupChatsSectionDataSource", "loading threads from threads db");
            ImmutableList.Builder builder = ImmutableList.builder();
            try {
                c00i = this.A09.A00;
                A03 = AbH.A0p(c00i).A03() == 0 ? -1 : AbH.A0p(c00i).A03();
                A04 = AbH.A0p(c00i).A04() != 0 ? AbH.A0p(c00i).A04() : -1;
            } catch (Exception e) {
                0fH.A0r("GroupChatsSectionDataSource", "Exception when initializing thread iterator", e);
            }
            if (AbH.A0p(c00i).A06()) {
                this.A0B.A02("");
                throw 0Q8.createAndThrow();
            }
            ImmutableList A002 = this.A0B.A00("", A03, A04);
            11T.A0D(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                builder.m11011add((Object) AbF.A0j(it));
            }
            ImmutableList A01 = 1Fj.A01(builder);
            0fH.A0m("GroupChatsSectionDataSource", "loading threads from search cache");
            CQk cQk = (CQk) this.A06.get();
            SingletonImmutableSet A11 = AbF.A11(BNK.A0A);
            1GU.A00(cQk.A02);
            StringBuilder A06 = CQk.A06();
            ImmutableList.Builder builder2 = ImmutableList.builder();
            4sQ A02 = CQk.A02(A11);
            if (A02 != null) {
                A06.append(A02.A02());
                for (String str : A02.A03()) {
                    builder2.m11011add((Object) str);
                }
            }
            Cursor rawQuery = cQk.A04.AUF().rawQuery(A06.toString(), 1BK.A1b(builder2.build(), 0));
            try {
                ImmutableList A05 = CQk.A05(rawQuery, cQk);
                0fH.A0i(1BK.A0k(A05), "SearchCacheDb", "size of cached items with specific types %d");
                if (rawQuery != null) {
                    rawQuery.close();
                }
                AcZ acZ = cQk.A03;
                1GU.A00(acZ.A01);
                try {
                    StringBuilder sb = new StringBuilder("SELECT ");
                    CQk.A09(sb, Ba2.A03);
                    sb.append(" FROM ");
                    sb.append("recent_search_items");
                    sb.append(" WHERE ");
                    ImmutableList.Builder builder3 = ImmutableList.builder();
                    4sQ A022 = CQk.A02(A11);
                    if (A022 != null) {
                        sb.append(A022.A02());
                        for (String str2 : A022.A03()) {
                            builder3.m11011add((Object) str2);
                        }
                    }
                    Cursor rawQuery2 = acZ.A05.AUF().rawQuery(sb.toString(), 1BK.A1b(builder3.build(), 0));
                    try {
                        ImmutableList.Builder builder4 = ImmutableList.builder();
                        while (rawQuery2.moveToNext()) {
                            builder4.m11011add((Object) AcZ.A00(rawQuery2));
                        }
                        of = builder4.build();
                        rawQuery2.close();
                    } finally {
                    }
                } catch (Exception e2) {
                    0fH.A0x("RecentSearchDb#search", "Exception loading recents with types", e2);
                    of = ImmutableList.of();
                }
                0fH.A0i(1BK.A0k(of), "SearchCacheDb", "size of recent search items with specific types %d");
                if (A05.isEmpty() && of.isEmpty()) {
                    of = ImmutableList.of();
                } else if (!A05.isEmpty()) {
                    of = of.isEmpty() ? A05 : AbI.A0t(A05, of);
                }
                ArrayList A0y = 7zO.A0y(of);
                Iterator it2 = of.iterator();
                while (it2.hasNext()) {
                    Object apply = this.A0C.apply(it2.next());
                    if (apply != null) {
                        A0y.add(apply);
                    }
                }
                copyOf = ImmutableList.copyOf((Collection) 0QD.A0O(0QD.A0V(A0y), A01));
                this.A02 = copyOf;
                11T.A0A(copyOf);
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        } else {
            copyOf = this.A02;
            11T.A09(copyOf);
        }
        C00i c00i2 = this.A09.A00;
        if (!AbH.A0p(c00i2).A0I()) {
            of2 = ImmutableList.of();
        } else if (this.A01.isEmpty()) {
            0fH.A0m("GroupChatsSectionDataSource", "loading armadillo threads");
            ImmutableList A012 = this.A0B.A01("", -1, -1, ((5PC) this.A08.get()).A01());
            this.A01 = A012;
            ArrayList A0s = AnonymousClass001.A0s();
            1Du it3 = A012.iterator();
            while (it3.hasNext()) {
                ThreadSummary A0j = AbF.A0j(it3);
                if (A0j.A0n.A0w()) {
                    A0s.add(A0j);
                }
            }
            of2 = ImmutableList.copyOf((Collection) A0s);
            this.A01 = of2;
            11T.A0A(of2);
        } else {
            of2 = this.A01;
            11T.A09(of2);
        }
        0fH.A0i(Integer.valueOf(this.A02.size() + this.A01.size()), "GroupChatsSectionDataSource", "Local groups count %d");
        if (immutableList2 != null) {
            D3Y d3y = new D3Y(immutableList2, 21);
            A0a = 1BL.A0a(C52z.A00(d3y, copyOf));
            copyOf2 = AbH.A0x(d3y, of2);
        } else {
            A0a = 1BL.A0a(copyOf);
            copyOf2 = ImmutableList.copyOf((Collection) of2);
        }
        ArrayList A0y2 = 7zO.A0y(copyOf2);
        Iterator it4 = A0a.iterator();
        while (it4.hasNext()) {
            Object apply2 = A0F.apply(it4.next());
            if (apply2 != null) {
                A0y2.add(apply2);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it5 = copyOf2.iterator();
        while (it5.hasNext()) {
            Object apply3 = A0F.apply(it5.next());
            if (apply3 != null) {
                A0s2.add(apply3);
            }
        }
        C00i c00i3 = this.A0E;
        6QB r0 = (6QB) c00i3.get();
        B4d b4d = B4d.A00;
        2To r02 = 2To.A09;
        ImmutableList immutableList3 = 6QB.A00(fbUserSession, b4d, r0, r02, new DAi(Crw.A00), A0y2).A00;
        11T.A09(immutableList3);
        if (AbH.A0p(c00i2).A0I()) {
            A0b = 6QB.A00(fbUserSession, b4d, (6QB) c00i3.get(), r02, new DAi(Crx.A00), A0s2).A00;
            11T.A09(A0b);
        } else {
            A0b = 1BK.A0b();
        }
        0fH.A0i(Integer.valueOf(immutableList3.size() + A0b.size()), "GroupChatsSectionDataSource", "group threads with selected users count %d");
        ImmutableList copyOf3 = ImmutableList.copyOf((Collection) 0QD.A0O(A0b, immutableList3));
        if (this.A0D) {
            11T.A0D(copyOf3);
            if (!copyOf3.isEmpty() && this.A00 != null) {
                ((AcX) 1BK.A0r(copyOf3)).A01 = this.A00;
            }
            5O6 r03 = this.A00;
            if (r03 != null) {
                AbF.A1S(r03, copyOf3);
                ((2eN) 1Br.A0B(this.A0A)).A01(this.A00, "search ended");
            }
        }
        11T.A0D(copyOf3);
        return copyOf3;
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        ImmutableList of;
        Integer num;
        boolean z;
        String str;
        ImmutableList immutableList;
        C96 c96 = (C96) obj;
        if (c96 == null || (!(z = this.A0D) && ((immutableList = c96.A03) == null || immutableList.isEmpty()))) {
            of = ImmutableList.of();
            num = 0S2.A01;
        } else {
            FbUserSession fbUserSession = this.A04;
            Context context = this.A03;
            1Br A00 = 1Lm.A00(context, fbUserSession, 84248);
            C00i c00i = this.A09.A00;
            if (!AbK.A0l(c00i).AZk(36323242798631297L) || (str = ((AcP) 1Lm.A05(context, fbUserSession, 84248)).A05) == null || str.length() == 0) {
                if (z) {
                    C00i c00i2 = A00.A00;
                    if (((AcP) c00i2.get()).A0G.A02 != null && byH != null) {
                        String A04 = AcP.A04((AcP) c00i2.get());
                        String str2 = byH.A04;
                        11T.A0A(str2);
                        String A002 = 53M.A00(byH.A00);
                        11T.A0A(A002);
                        this.A00 = AbK.A0R(ClientDataSourceIdentifier.A0S, A04, str2, A002);
                        ((2eN) 1Br.A0B(this.A0A)).A01(this.A00, "search started");
                    }
                }
                EnumC1297Ada enumC1297Ada = EnumC1297Ada.A0j;
                this.A05.get();
                ImmutableList A003 = CB5.A00(A00(c96), 2yD.A00(C1gb.A02(AbH.A0p(c00i)), z ? 36606242489900426L : 36598159360528296L));
                11T.A0A(A003);
                C1333AeN c1333AeN = new C1333AeN(enumC1297Ada, A003, null);
                ((C6p) 1Lm.A05(context, fbUserSession, 84346)).A01(null, c1333AeN, "GroupChatsSectionDataSource");
                C1323Ae1 c1323Ae1 = C1323Ae1.A03;
                return new C1323Ae1(ImmutableList.of((Object) c1333AeN), 0S2.A01, c1333AeN.A01.size());
            }
            C1323Ae1 c1323Ae12 = C1323Ae1.A03;
            of = ImmutableList.of();
            num = 0S2.A0Y;
        }
        return new C1323Ae1(of, num);
    }

    public String getFriendlyName() {
        return "GroupChatsSectionDataSource";
    }
}
