package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.media.AudioAttributesCompat;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.rtc.interfaces.LinkLogMetadata;
import com.facebook.rtc.interfaces.RoomsJoinOptions;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.facebook.rtc.launch.CallStartOutcome;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: D30.class */
public final class D30 implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public D30(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        7hZ A02;
        ImmutableCollection immutableCollection;
        ImmutableList A022;
        B7K b7k;
        DataSourceIdentifier dataSourceIdentifier;
        switch (this.A00) {
            case 0:
                CN9 cn9 = (CN9) this.A01;
                immutableCollection = (ImmutableCollection) this.A02;
                List list = (List) this.A04;
                List list2 = (List) this.A03;
                ImmutableList immutableList = ((RYU) obj).A00;
                HashSet A0v = AnonymousClass001.A0v();
                HashSet A0v2 = AnonymousClass001.A0v();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbK.A1T(A0v, it);
                    }
                }
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AbK.A1T(A0v2, it2);
                    }
                }
                ArrayList A17 = 1BK.A17(immutableCollection);
                ImmutableList.Builder builder = ImmutableList.builder();
                0QO r0 = new 0QO(0);
                0QO r02 = new 0QO(0);
                1Du it3 = immutableCollection.iterator();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (it3.hasNext()) {
                    B7H b7h = (BRA) it3.next();
                    if (b7h instanceof B7K) {
                        B7K b7k2 = (B7K) b7h;
                        if (!z2) {
                            boolean isEmpty = immutableList.isEmpty();
                            if (!"".isEmpty() || z3 || isEmpty) {
                                DataSourceIdentifier dataSourceIdentifier2 = b7k2.A02;
                                if (dataSourceIdentifier2 != ClientDataSourceIdentifier.A06 && dataSourceIdentifier2 != ClientDataSourceIdentifier.A07) {
                                    User user = b7k2.A05;
                                    r0.put(user.A13, new B7K(b7k2.A01, ClientDataSourceIdentifier.A0u, b7k2.A03, b7k2.A04, user));
                                }
                            }
                        }
                    } else if (b7h instanceof B7J) {
                        EnumC1297Ada enumC1297Ada = (EnumC1297Ada) ((B7J) b7h).A01;
                        R14 r14 = R14.$redex_init_class;
                        int ordinal = enumC1297Ada.ordinal();
                        if (ordinal == 4) {
                            builder.m11011add((Object) b7h);
                            A17.remove(b7h);
                            z2 = true;
                        } else if (ordinal != 1) {
                            z2 = false;
                            z3 = true;
                        } else {
                            builder.m11011add((Object) b7h);
                            A17.remove(b7h);
                            z2 = false;
                        }
                    } else {
                        if (z2 && (b7h instanceof B7H)) {
                            builder.m11011add((Object) b7h);
                        } else if (b7h instanceof B7H) {
                            B7H b7h2 = b7h;
                            ThreadSummary threadSummary = b7h2.A01;
                            if (threadSummary.A0n.A0x()) {
                                1Du A12 = AbF.A12(threadSummary);
                                while (A12.hasNext()) {
                                    String A00 = AbH.A0j(A12).A00();
                                    if (A00 != null && !A00.equals(cn9.A05)) {
                                        r02.put(A00, b7h2);
                                    }
                                }
                            }
                        }
                        A17.remove(b7h);
                    }
                }
                ImmutableList.Builder builder2 = ImmutableList.builder();
                1Du it4 = immutableList.iterator();
                while (it4.hasNext()) {
                    String str = ((BmG) it4.next()).A01;
                    if (r0.get(str) == null) {
                        builder2.m11011add((Object) str);
                    }
                }
                2Tv r03 = (2Tv) 1Bn.A0E((Context) null, cn9.A00, 65918);
                ImmutableList build = builder2.build();
                r03.A00 = build;
                if (build == null) {
                    A022 = ImmutableList.of();
                    11T.A0D(A022);
                } else {
                    A022 = r03.A02(UserKey.A03(build));
                }
                1Du it5 = A022.iterator();
                while (it5.hasNext()) {
                    User A0t = AbG.A0t(it5);
                    String str2 = A0t.A13;
                    53N A023 = 53N.A02(A0t);
                    r0.put(str2, new B7K((RankingLoggingItem) null, ClientDataSourceIdentifier.A0u, A023, A0t.A0D() ? A023 == 53N.A0G ? EnumC1297Ada.A0l : EnumC1297Ada.A0k : EnumC1297Ada.A0e, A0t));
                }
                r0.keySet().removeAll(A0v2);
                r02.keySet().removeAll(A0v2);
                1Du it6 = immutableList.iterator();
                while (it6.hasNext()) {
                    String str3 = ((BmG) it6.next()).A01;
                    Object obj2 = r0.get(str3);
                    if (obj2 != null && !A0v.contains(str3)) {
                        builder.m11011add(obj2);
                        r0.remove(str3);
                    }
                    Object obj3 = r02.get(str3);
                    if (obj3 != null) {
                        builder.m11011add(obj3);
                        r02.remove(str3);
                    }
                }
                Iterator it7 = A17.iterator();
                while (it7.hasNext()) {
                    B7K b7k3 = (BRA) it7.next();
                    if (!(b7k3 instanceof B7K) || (dataSourceIdentifier = (b7k = b7k3).A02) == ClientDataSourceIdentifier.A06 || dataSourceIdentifier == ClientDataSourceIdentifier.A07) {
                        if (!z) {
                            Iterator it8 = A0v.iterator();
                            while (it8.hasNext()) {
                                Object next = it8.next();
                                if (r0.get(next) != null) {
                                    builder.m11011add(r0.get(next));
                                    r0.remove(next);
                                }
                                if (r02.get(next) != null) {
                                    builder.m11011add(r02.get(next));
                                    r02.remove(next);
                                }
                            }
                            z = true;
                        }
                        builder.m11011add((Object) b7k3);
                    } else {
                        String str4 = b7k.A05.A13;
                        if (r0.get(str4) != null && !A0v.contains(str4)) {
                            builder.m11011add((Object) b7k3);
                            r0.remove(str4);
                        }
                        Object obj4 = r02.get(str4);
                        if (obj4 != null && !A0v.contains(str4)) {
                            builder.m11011add(obj4);
                            r02.remove(str4);
                        }
                    }
                }
                Iterator it9 = r0.entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(it9);
                    builder.m11011add(A0z.getValue());
                    if (r02.get(A0z.getKey()) != null) {
                        builder.m11011add(r02.get(A0z.getKey()));
                    }
                }
                ImmutableList build2 = builder.build();
                if (!1BK.A0N(AbF.A0m(cn9.A03).A01).AZk(36314360805466004L)) {
                    return build2;
                }
                return immutableCollection;
            case 1:
                Throwable th = (Throwable) obj;
                if (th == null) {
                    throw 1BK.A0h();
                }
                JMR jmr = (JMR) this.A04;
                jmr.Bcv("enter_room", (String) null);
                jmr.ARr(th.getMessage());
                ((IFc) this.A01).A0O("room_enter_failure", th.getMessage(), ((VideoChatLink) this.A02).A0T, ((QAR) this.A03).A04);
                return new CallStartOutcome(H9h.A02, null);
            case 2:
                IAY iay = (IAY) this.A04;
                IAY.A00(iay).A00();
                if (1BK.A1X(obj, true)) {
                    VideoChatLink videoChatLink = (VideoChatLink) this.A01;
                    if (videoChatLink.A0c) {
                        2JX r04 = videoChatLink.A07;
                        if (!11T.A0O(r04 != null ? r04.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(753), 756133218) : null, "IN_PROGRESS")) {
                            List list3 = (List) this.A02;
                            RoomsJoinOptions roomsJoinOptions = (RoomsJoinOptions) this.A03;
                            CEH ceh = (CEH) 1Br.A0B(iay.A04);
                            FbUserSession fbUserSession = iay.A00;
                            FragmentActivity fragmentActivity = IAY.A00(iay).A00;
                            if (fragmentActivity == null) {
                                11T.A0L("fragmentActivity");
                                throw 0Q8.createAndThrow();
                            }
                            RtcCallVideoOptions A002 = roomsJoinOptions.A00();
                            RtcCallVideoOptions rtcCallVideoOptions = new RtcCallVideoOptions(A002.A01, A002.A00);
                            boolean z4 = roomsJoinOptions.A0D;
                            LinkLogMetadata linkLogMetadata = roomsJoinOptions.A01;
                            QAR qar = new QAR(videoChatLink, rtcCallVideoOptions, roomsJoinOptions.A05, (String) null, linkLogMetadata != null ? linkLogMetadata.A04 : null, list3, z4);
                            11T.A0F(fbUserSession, 0);
                            CEH.A00(fragmentActivity, fbUserSession, qar, ceh);
                        }
                    }
                    IAY.A01(videoChatLink, iay, (RoomsJoinOptions) this.A03);
                    CP1 cp1 = iay.A0C;
                    2Qb r05 = (2Qb) cp1.A0B.get();
                    if (!r05.A0G) {
                        r05.A0G = true;
                        Iterator it10 = r05.A0V.iterator();
                        while (it10.hasNext()) {
                            ((1qP) it10.next()).A0D();
                        }
                        2Qb.A03(r05);
                    }
                    C00i c00i = cp1.A04;
                    IFc iFc = (IFc) c00i.get();
                    String str5 = videoChatLink.A0T;
                    AbN.A1G(iFc, "meetup_initiate_join_attempt", str5);
                    AbN.A1K(4zI.A03, "meetup_initiate_join_attempt", str5);
                    Bmh bmh = (Bmh) cp1.A07.get();
                    FbUserSession fbUserSession2 = cp1.A03;
                    String A03 = ((IFc) c00i.get()).A07.A03();
                    11T.A0F(fbUserSession2, 0);
                    11T.A0F(str5, 1);
                    if (0CU.A0O(str5)) {
                        A02 = new 7hZ(AnonymousClass001.A0L("linkUrl is null or empty"));
                    } else {
                        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str5, "messenger_call_invite_link_id");
                        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, A03, "funnel_session_id");
                        4YV.A1A(A0J, A0N, "data");
                        ListenableFuture A0z2 = AbK.A0z(1VX.A06(AbI.A04(bmh.A00), fbUserSession2), 5Dh.A00(A0N, new C01643sd(C1736Ar6.class, "NotifyJoinAttempt", null, "data", "fbandroid", 742101856, 384, 2898598324L, 2898598324L, false, true)), 322006035685628L);
                        11T.A0A(A0z2);
                        A02 = 2FP.A02(new FvR(0), A0z2, 4YV.A11(bmh.A01));
                    }
                    Inf inf = new Inf(videoChatLink, cp1, 31);
                    C00i c00i2 = cp1.A0C;
                    1Kd.A0D(c00i2, inf, A02);
                    ((ScheduledExecutorService) c00i2.get()).schedule((Runnable) new D6H(cp1), 30, TimeUnit.SECONDS);
                    IRF irf = (IRF) cp1.A05.get();
                    IEj A01 = IRF.A01(irf);
                    I4m i4m = ((HkQ) 1Br.A0B(irf.A1U)).A09;
                    AudioAttributesCompat audioAttributesCompat = IEj.A0N;
                    A01.A08(i4m, true);
                } else {
                    IFc iFc2 = iay.A0D;
                    String str6 = ((VideoChatLink) this.A01).A0T;
                    LinkLogMetadata linkLogMetadata2 = ((RoomsJoinOptions) this.A03).A01;
                    iFc2.A0O("media_permission_error", "user_denied_permission", str6, linkLogMetadata2 != null ? linkLogMetadata2.A04 : null);
                }
                return 04S.A00;
            default:
                ImmutableCollection immutableCollection2 = (ImmutableCollection) obj;
                if (immutableCollection2 == null) {
                    immutableCollection = ImmutableList.of();
                    return immutableCollection;
                }
                0QO r06 = new 0QO(immutableCollection2.size());
                1Du it11 = immutableCollection2.iterator();
                while (it11.hasNext()) {
                    ThreadSummary A0j = AbF.A0j(it11);
                    if (A0j != null) {
                        CtH ctH = (CtH) this.A04;
                        Context context = ctH.A00;
                        1Bu.A06(context, 83543);
                        if (new CHT(context, ctH.A01).A01(A0j)) {
                            ThreadKey A0f = AbF.A0f(A0j);
                            if (ThreadKey.A0a(A0f)) {
                                String A0y = 4YU.A0y(A0f);
                                SettableFuture A0j2 = 4YU.A0j();
                                AbI.A0C(ctH.A04).A0E(new Czk(A0j2, ActionId.ACTION_BAR_COMPLETE), ctH.A0A, A0f.A04);
                                1qX r07 = (1qX) A0j2.get();
                                ImmutableList.Builder builder3 = ImmutableList.builder();
                                C1zm A0g = AbF.A0g(A0j);
                                A0g.A2A = 7zP.A0u(r07, 0);
                                String A0v3 = 7zP.A0v(r07, 0);
                                if (A0v3 != null && A0v3.length() != 0) {
                                    Uri uri = null;
                                    try {
                                        uri = C0A2.A03(A0v3);
                                    } catch (SecurityException unused) {
                                    }
                                    A0g.A0V = uri;
                                }
                                1Br.A0C(ctH.A09);
                                if (A0v3 != null && A0v3.length() != 0) {
                                    try {
                                        Uri A032 = C0A2.A03(A0v3);
                                        if (A032 != null) {
                                            builder3.m11011add((Object) A032);
                                        }
                                    } catch (SecurityException unused2) {
                                    }
                                }
                                String A0k = 7zP.A0k(r07, 0);
                                if (A0k != null && A0k.length() != 0) {
                                    try {
                                        Uri A033 = C0A2.A03(A0k);
                                        if (A033 != null) {
                                            builder3.m11011add((Object) A033);
                                        }
                                    } catch (SecurityException unused3) {
                                    }
                                }
                                A0g.A1H = builder3.build();
                                r06.put(A0y, AbF.A0i(A0g));
                            } else {
                                r06.put(String.valueOf(A0f.A0z() ? A0f.A0s() : A0f.A0r()), A0j);
                            }
                        }
                    }
                }
                ImmutableList immutableList2 = (ImmutableList) this.A01;
                if (immutableList2 != null && !immutableList2.isEmpty()) {
                    1Du it12 = immutableList2.iterator();
                    while (it12.hasNext()) {
                        ThreadKey A0k2 = AbG.A0k(it12);
                        CtH ctH2 = (CtH) this.A04;
                        11T.A0D(A0k2);
                        SettableFuture A0j3 = 4YU.A0j();
                        AbI.A0C(ctH2.A04).A0E(new Czk(A0j3, ActionId.LEGACY_MARKER), ctH2.A0A, A0k2.A04);
                        try {
                            BEB beb = (BEB) A0j3.get();
                            ImmutableList.Builder builder4 = ImmutableList.builder();
                            String A0q = 4YV.A0q(beb, 0);
                            String string = ((1qX) beb).mResultSet.getString(0, 18);
                            if (A0q != null && A0q.length() != 0 && string != null && string.length() != 0) {
                                char[] cArr = new char[1];
                                cArr[0] = ',';
                                List A0L = 0CU.A0L(A0q, cArr, 0);
                                char[] cArr2 = new char[1];
                                cArr2[0] = ',';
                                List A0L2 = 0CU.A0L(string, cArr2, 0);
                                int size = A0L.size();
                                for (int i = 0; i < size; i++) {
                                    3pI r08 = new 3pI();
                                    r08.A09 = UserKey.A00(1BK.A0n(1BK.A14(A0L, i)));
                                    r08.A0B = 1uP.A00(AbH.A12(1BK.A14(A0L2, i)));
                                    builder4.m11011add((Object) AbL.A0G(r08.A00()));
                                }
                            }
                            C1zm A0o = AbH.A0o(A0k2);
                            A0o.A0l = ThreadKey.A03(((1qX) beb).mResultSet.getLong(0, 13));
                            A0o.A0g = 1F9.A0B;
                            A0o.A20 = 4YU.A11(beb, 0, 1);
                            A0o.A2H = true;
                            A0o.A2A = 7zP.A0u(beb, 0);
                            A0o.A0N = ((1qX) beb).mResultSet.getLong(0, 14);
                            A0o.A0E(builder4.build());
                            String A0v4 = 7zP.A0v(beb, 0);
                            if (A0v4 != null && A0v4.length() != 0) {
                                Uri uri2 = null;
                                try {
                                    uri2 = C0A2.A03(A0v4);
                                } catch (SecurityException unused4) {
                                }
                                A0o.A0V = uri2;
                            }
                            1Br.A0C(ctH2.A09);
                            ImmutableList.Builder builder5 = ImmutableList.builder();
                            if (A0v4 != null && A0v4.length() != 0) {
                                try {
                                    Uri A034 = C0A2.A03(A0v4);
                                    if (A034 != null) {
                                        builder5.m11011add((Object) A034);
                                    }
                                } catch (SecurityException unused5) {
                                }
                            }
                            String A0k3 = 7zP.A0k(beb, 0);
                            if (A0k3 != null && A0k3.length() != 0) {
                                try {
                                    Uri A035 = C0A2.A03(A0k3);
                                    if (A035 != null) {
                                        builder5.m11011add((Object) A035);
                                    }
                                } catch (SecurityException unused6) {
                                }
                            }
                            A0o.A1H = builder5.build();
                            if (A0k3 != null && A0k3.length() != 0) {
                                Uri uri3 = null;
                                try {
                                    uri3 = C0A2.A03(A0k3);
                                } catch (SecurityException unused7) {
                                }
                                A0o.A0V = uri3;
                            }
                            r06.put(4YU.A0y(A0k2), AbF.A0i(A0o));
                        } catch (Exception e) {
                            0fH.A0y("ThreadsFetcher", "fetch community chat thread [%s] metadata failed", e, new Object[]{A0k2.toString()});
                        }
                    }
                }
                ImmutableList.Builder builder6 = ImmutableList.builder();
                1Du it13 = ((ImmutableCollection) this.A02).iterator();
                while (it13.hasNext()) {
                    ThreadKey A0k4 = AbG.A0k(it13);
                    0QO r09 = (0QO) this.A03;
                    Object obj5 = (r09 == null || !r09.containsKey(A0k4)) ? r06.get(String.valueOf(A0k4.A0z() ? A0k4.A0s() : A0k4.A0r())) : r09.get(A0k4);
                    if (obj5 != null) {
                        builder6.m11011add(obj5);
                    }
                }
                return builder6.build();
        }
    }
}
