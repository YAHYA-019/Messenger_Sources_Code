package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.inbox2.activenow.model.Entity;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.presence.unifiedpresence.UnifiedPresenceViewLoggerItem;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.proxygen.HTTPClient;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;

/* renamed from: X.3ix, reason: invalid class name */
/* loaded from: 3ix.class */
public final class C3ix implements Callable {
    public final int A00;
    public final Object A01;

    public C3ix(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, AbstractMap abstractMap) {
        Long valueOf = Long.valueOf(((2UQ) obj).Auq().A04);
        Object obj2 = abstractMap.get(valueOf);
        if (obj2 == null) {
            obj2 = new ArrayList();
            abstractMap.put(valueOf, obj2);
        }
        return obj2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        2TM r304;
        ImmutableList A0a;
        Object obj;
        HTTPClient hTTPClient;
        switch (this.A00) {
            case 0:
                return ((C00m) this.A01).invoke();
            case 1:
                C1sq c1sq = (C1sq) this.A01;
                synchronized (c1sq) {
                    if (c1sq.A08) {
                        new C1u0(null, null, "TreeFuture released");
                    } else {
                        1tB.A00(JQw.A00(ActionId.VIDEO_REQUESTED_PLAYING), new M3m(c1sq.A05(), 10), c1sq.A02());
                        C1ty A03 = c1sq.A03();
                        synchronized (c1sq) {
                            if (c1sq.A08) {
                                new C1u0(null, null, "TreeFuture released");
                            } else {
                                new C1u0(A03, null, null);
                            }
                        }
                    }
                }
                return obj;
            case 2:
                2Tn r0 = (2Tn) this.A01;
                C00j.A05("MessagingContactRankingScoreAccessor.getTopCloseConnections", -1482327147);
                try {
                    ImmutableList immutableList = 2Tn.A00(r0, 2Tn.A01(r0)).A01;
                    int min = Math.min(13, immutableList.size());
                    ArrayList A0t = AnonymousClass001.A0t(min);
                    for (int i = 0; i < min; i++) {
                        A0t.add(((2Vb) ((2Va) immutableList.get(i))).A04);
                    }
                    C00j.A01(260035779);
                    return A0t;
                } catch (Throwable th) {
                    C00j.A01(1688648196);
                    throw th;
                }
            case 3:
                java.util.Map map = (java.util.Map) ((0CL) this.A01).element;
                LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(map.size()));
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    linkedHashMap.put(A0z.getKey(), ((Future) A0z.getValue()).get());
                }
                LinkedHashMap A1C = 1BK.A1C();
                Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
                while (A0x.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0x);
                    if (A0z2.getValue() != null) {
                        1BL.A1O(A1C, A0z2);
                    }
                }
                return ImmutableMap.copyOf((java.util.Map) A1C);
            case 4:
                ((2TA) this.A01).A05.clear();
                return AnonymousClass001.A0K();
            case 5:
                2TX r02 = (2TX) this.A01;
                synchronized (r02) {
                    2T6 r03 = r02.A0F;
                    if (r02.A01.A00.isEmpty() || r02.A00.A00.isEmpty()) {
                        r304 = r02.A00;
                    } else {
                        ImmutableList.Builder builder = ImmutableList.builder();
                        ImmutableList.Builder builder2 = ImmutableList.builder();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        ImmutableList immutableList2 = r02.A01.A00;
                        11T.A09(immutableList2);
                        Iterator it = immutableList2.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(((MontageBucketPreview) it.next()).A06);
                        }
                        ImmutableList immutableList3 = r02.A00.A00;
                        11T.A09(immutableList3);
                        int i2 = 0;
                        Iterator it2 = immutableList3.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                C0s8.A18();
                                th = 0Q8.createAndThrow();
                                throw th;
                            }
                            C2xf c2xf = (C2xf) next;
                            if (!linkedHashSet.contains(((User) c2xf.A02).A0k)) {
                                builder.m11011add((Object) c2xf);
                                builder2.m11011add(r02.A00.A01.get(i2));
                            }
                            i2 = i3;
                        }
                        new 2TM(builder.build(), builder2.build(), r02.A00.A02);
                    }
                    ImmutableList A02 = r03.A02(r304);
                    if (((2Tc) 1Br.A0B(r02.A0C)).A00()) {
                        ImmutableMap immutableMap = r02.A03;
                        2TM r04 = r02.A01;
                        ImmutableList.Builder builder3 = ImmutableList.builder();
                        ImmutableList immutableList4 = r04.A00;
                        11T.A09(immutableList4);
                        int A00 = 02J.A00(C1A3.A1D(immutableList4, 10));
                        if (A00 < 16) {
                            A00 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A00);
                        Iterator it3 = immutableList4.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            linkedHashMap2.put(((MontageBucketPreview) next2).A06.id, next2);
                        }
                        2TM A002 = ((5aO) 1Br.A0B(r03.A01)).A00(r03.A09, 1BL.A0a(immutableMap.values()));
                        ImmutableList immutableList5 = A002.A00;
                        11T.A09(immutableList5);
                        int size = immutableList5.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            User user = (User) ((C2xf) immutableList5.get(i4)).A02;
                            if (!11T.A0O(((1EZ) 1Br.A0B(r03.A08)).Aue().mUserId, user.A13)) {
                                RichStatus richStatus = (RichStatus) ((C2xf) immutableList5.get(i4)).A01;
                                UserKey userKey = user.A0k;
                                11T.A0A(userKey);
                                String str = userKey.id;
                                11T.A0A(str);
                                MontageBucketPreview montageBucketPreview = linkedHashMap2.containsKey(str) ? (MontageBucketPreview) linkedHashMap2.get(str) : null;
                                if (((2Tc) 1Br.A0B(r03.A07)).A00.AZk(36325171237638517L)) {
                                    2TA r05 = r03.A0A;
                                    String str2 = user.A13;
                                    11T.A0A(str2);
                                    long parseLong = Long.parseLong(str2);
                                    ConcurrentMap concurrentMap = r05.A06;
                                    11T.A09(concurrentMap);
                                    synchronized (concurrentMap) {
                                        try {
                                            concurrentMap.put(Long.valueOf(parseLong), Optional.fromNullable(montageBucketPreview));
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                                Entity A003 = Entity.A00(user);
                                C2fr A0R = ((2fZ) 1Br.A0B(r03.A03)).A0R(user, 2T6.A01(r03, userKey));
                                Object obj2 = A002.A01.get(i4);
                                11T.A0A(obj2);
                                RankingLoggingItem rankingLoggingItem = (RankingLoggingItem) obj2;
                                boolean BX3 = 2T6.A00(r03).BX3(userKey);
                                1XZ A004 = 2T6.A00(r03);
                                1Br.A0C(r03.A00);
                                boolean DAK = A004.DAK(userKey, 5);
                                UnifiedPresenceViewLoggerItem A04 = ((2gQ) 1Br.A0B(r03.A05)).A04(richStatus, userKey);
                                boolean A0C = user.A0C();
                                11T.A0F(rankingLoggingItem, 3);
                                builder3.m11011add((Object) new 3xR(rankingLoggingItem, 2T6.A0E, A003, montageBucketPreview, A04, A0R, BX3, DAK, A0C, false));
                            }
                        }
                        ImmutableList A01 = 1Fj.A01(builder3);
                        2TM r06 = r02.A01;
                        ImmutableList.Builder builder4 = ImmutableList.builder();
                        ImmutableList immutableList6 = r06.A00;
                        int size2 = immutableList6.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            UserKey userKey2 = ((MontageBucketPreview) immutableList6.get(i5)).A06;
                            String str3 = userKey2.id;
                            11T.A0A(str3);
                            if (!11T.A0O(((1EZ) 1Br.A0B(r03.A08)).Aue().mUserId, str3)) {
                                MontageBucketPreview montageBucketPreview2 = (MontageBucketPreview) immutableList6.get(i5);
                                Long Asz = 2T6.A00(r03).Asz(userKey2);
                                User user2 = montageBucketPreview2.A05;
                                Entity A005 = Entity.A00(user2);
                                C2fq A0J = ((2fZ) 1Br.A0B(r03.A03)).A0J(userKey2, 2T6.A01(r03, userKey2));
                                Object obj3 = r06.A01.get(i5);
                                11T.A0A(obj3);
                                RankingLoggingItem rankingLoggingItem2 = (RankingLoggingItem) obj3;
                                boolean BX32 = 2T6.A00(r03).BX3(userKey2);
                                1XZ A006 = 2T6.A00(r03);
                                1Br.A0C(r03.A00);
                                boolean DAK2 = A006.DAK(userKey2, 5);
                                UnifiedPresenceViewLoggerItem A05 = Asz == null ? null : ((2gQ) 1Br.A0B(r03.A05)).A05(userKey2);
                                boolean A0C2 = user2.A0C();
                                11T.A0F(rankingLoggingItem2, 3);
                                builder4.m11011add((Object) new 3xR(rankingLoggingItem2, 2T6.A0E, A005, montageBucketPreview2, A05, A0J, BX32, DAK2, A0C2, false));
                            }
                        }
                        ImmutableList A012 = 1Fj.A01(builder4);
                        5aO r07 = (5aO) 1Br.A0B(r02.A08);
                        2T9 r08 = r02.A0E;
                        11T.A0F(r08, 3);
                        ArrayList A0O = 0QD.A0O(A012, A01);
                        LinkedHashMap A1C2 = 1BK.A1C();
                        Iterator it4 = A0O.iterator();
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            ((List) A00(next3, A1C2)).add(next3);
                        }
                        Collection values = A1C2.values();
                        ArrayList A1E = C1A3.A1E(values);
                        Iterator it5 = values.iterator();
                        while (it5.hasNext()) {
                            A1E.add(0QD.A0D((List) it5.next()));
                        }
                        ArrayList A0O2 = 0QD.A0O(A02, A1E);
                        LinkedHashMap A1C3 = 1BK.A1C();
                        Iterator it6 = A0O2.iterator();
                        while (it6.hasNext()) {
                            Object next4 = it6.next();
                            ((List) A00(next4, A1C3)).add(next4);
                        }
                        Collection values2 = A1C3.values();
                        ArrayList A1E2 = C1A3.A1E(values2);
                        Iterator it7 = values2.iterator();
                        while (it7.hasNext()) {
                            A1E2.add(0QD.A0D((List) it7.next()));
                        }
                        ImmutableList A0a2 = 1BL.A0a(A1E2);
                        boolean A007 = ((5TN) 1Br.A0B(r07.A02)).A00();
                        2eG r09 = (2eG) 1Br.A0B(r07.A01);
                        A0a = 2eI.A00(r08, (2eI) 1Br.A0B(r07.A03), A007 ? r09.A01() : r09.A00(), A0a2, new String[0], true).A00;
                        11T.A09(A0a);
                    } else {
                        ImmutableMap immutableMap2 = r02.A03;
                        ImmutableList.Builder builder5 = ImmutableList.builder();
                        2TM A008 = ((5aO) 1Br.A0B(r03.A01)).A00(r03.A09, 1BL.A0a(immutableMap2.values()));
                        ImmutableList immutableList7 = A008.A00;
                        11T.A09(immutableList7);
                        int size3 = immutableList7.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            User user3 = (User) ((C2xf) immutableList7.get(i6)).A02;
                            if (!11T.A0O(((1EZ) 1Br.A0B(r03.A08)).Aue().mUserId, user3.A13)) {
                                RichStatus richStatus2 = (RichStatus) ((C2xf) immutableList7.get(i6)).A01;
                                UserKey userKey3 = user3.A0k;
                                11T.A0A(userKey3);
                                Entity A009 = Entity.A00(user3);
                                C2fr A0R2 = ((2fZ) 1Br.A0B(r03.A03)).A0R(user3, 2T6.A01(r03, userKey3));
                                Object obj4 = A008.A01.get(i6);
                                11T.A0A(obj4);
                                RankingLoggingItem rankingLoggingItem3 = (RankingLoggingItem) obj4;
                                boolean BX33 = 2T6.A00(r03).BX3(userKey3);
                                1XZ A0010 = 2T6.A00(r03);
                                1Br.A0C(r03.A00);
                                boolean DAK3 = A0010.DAK(userKey3, 5);
                                UnifiedPresenceViewLoggerItem A042 = ((2gQ) 1Br.A0B(r03.A05)).A04(richStatus2, userKey3);
                                boolean A0C3 = user3.A0C();
                                11T.A0F(rankingLoggingItem3, 3);
                                builder5.m11011add((Object) new 3xR(rankingLoggingItem3, 2T6.A0E, A009, (MontageBucketPreview) null, A042, A0R2, BX33, DAK3, A0C3, false));
                            }
                        }
                        ImmutableList A013 = 1Fj.A01(builder5);
                        5aO r010 = (5aO) 1Br.A0B(r02.A08);
                        2T9 r011 = r02.A0E;
                        11T.A0F(r011, 2);
                        if (2TI.A00((2TI) 1Br.A0B(r010.A00)).AZk(36321567760990718L)) {
                            String A0011 = ((2eG) 1Br.A0B(r010.A01)).A00();
                            ArrayList A0O3 = 0QD.A0O(A02, A013);
                            LinkedHashMap A1C4 = 1BK.A1C();
                            Iterator it8 = A0O3.iterator();
                            while (it8.hasNext()) {
                                Object next5 = it8.next();
                                ((List) A00(next5, A1C4)).add(next5);
                            }
                            Collection values3 = A1C4.values();
                            ArrayList A0z3 = 1BL.A0z(values3);
                            Iterator it9 = values3.iterator();
                            while (it9.hasNext()) {
                                A0z3.add(0QD.A0D((List) it9.next()));
                            }
                            A0a = 2eI.A00(r011, (2eI) 1Br.A0B(r010.A03), A0011, A0z3, new String[0], true).A00;
                            11T.A09(A0a);
                        } else {
                            int A0012 = 02J.A00(C1A3.A1D(A013, 10));
                            if (A0012 < 16) {
                                A0012 = 16;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(A0012);
                            Iterator it10 = A013.iterator();
                            while (it10.hasNext()) {
                                Object next6 = it10.next();
                                linkedHashMap3.put(Long.valueOf(((2UQ) next6).Auq().A04), next6);
                            }
                            ArrayList A0s = AnonymousClass001.A0s();
                            ArrayList A0s2 = AnonymousClass001.A0s();
                            1Du it11 = A02.iterator();
                            while (it11.hasNext()) {
                                2UQ r012 = (2UQ) it11.next();
                                if (linkedHashMap3.containsKey(Long.valueOf(r012.Auq().A04))) {
                                    Object obj5 = linkedHashMap3.get(Long.valueOf(r012.Auq().A04));
                                    if (obj5 != null) {
                                        A0s.add(obj5);
                                    }
                                } else {
                                    A0s2.add(r012);
                                }
                            }
                            Set A0h = 0QD.A0h(A013, 0QD.A0f(A0s));
                            if (A0s.isEmpty()) {
                                List A0V = 0QD.A0V(A0h);
                                if (!A0V.isEmpty()) {
                                    11T.A0F(A0s2, 0);
                                    ArrayList A17 = 1BK.A17(A0s2);
                                    A17.add(Math.min(A0s2.size(), 2), A0V.get(0));
                                    A17.addAll(A0V.subList(1, A0V.size()));
                                    A0s2 = A17;
                                }
                            } else {
                                A0s2 = 0QD.A0O(A0h, 0QD.A0O(A0s2, A0s));
                            }
                            A0a = 1BL.A0a(A0s2);
                        }
                    }
                }
                return A0a;
            default:
                hTTPClient = ((C29s) ((C21x) ((C00i) this.A01).get())).A08;
                return hTTPClient;
        }
    }
}
