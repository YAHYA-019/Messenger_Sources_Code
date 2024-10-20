package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Geb, reason: case insensitive filesystem */
/* loaded from: Geb.class */
public final class C2480Geb extends 1RM {
    public final Ht1 A00;
    public final /* synthetic */ IQT A01;

    public C2480Geb(Ht1 ht1, IQT iqt) {
        this.A01 = iqt;
        this.A00 = ht1;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Object obj2;
        ImmutableList.Builder A0h;
        ImmutableList A0c;
        ImmutableList A2K;
        ImmutableList of;
        2JY A0B;
        ImmutableList A0b;
        2JX A1t;
        ImmutableList A2K2;
        List list;
        2JX A0L;
        2JX A1t2;
        ImmutableList A2K3;
        GraphQLResult graphQLResult = (GraphQLResult) obj;
        if (graphQLResult == null || (obj2 = ((AbstractC08294mh) graphQLResult).A03) == null) {
            A03(null);
            return;
        }
        IQT iqt = this.A01;
        Ht1 ht1 = this.A00;
        boolean z = iqt instanceof C2782Gnz;
        if (z) {
            GOq.A0i(((C2782Gnz) iqt).A03).markerPoint(5505094, "SUCCESS_NETWORK");
        } else if (iqt instanceof C2783Go0) {
            GOq.A0i(((C2783Go0) iqt).A04).markerPoint(5505088, "SUCCESS_NETWORK");
        } else if (iqt instanceof C2785Go2) {
            GOq.A0i(((C2785Go2) iqt).A02).markerPoint(5505089, "SUCCESS_NETWORK");
        } else if (iqt instanceof C2784Go1) {
            1Br r0 = ((Hx8) 1Br.A0B(((C2784Go1) iqt).A04)).A00;
            7zP.A0e(r0).markerPoint(481237037, "art_load_success");
            7zP.A0e(r0).markerEnd(481237037, (short) 2);
        } else {
            GOq.A0i(((C2781Gny) iqt).A02).markerPoint(5505089, "SUCCESS_NETWORK");
        }
        5Ye r02 = iqt.A02;
        if (r02 != null) {
            r02.A00 = new GfG(graphQLResult, ht1, iqt);
        }
        if (z) {
            2JY r03 = (2JY) obj2;
            11T.A0F(r03, 0);
            A0h = 4YU.A0h();
            2JY A0K = AbF.A0K(r03, 2JX.class, 485448948);
            if (A0K != null && (A0L = 1BL.A0L(A0K, -1134871128, -1479939821)) != null && (A1t2 = A0L.A1t()) != null && (A2K3 = A1t2.A2K(96356950, 888407518)) != null) {
                1Du it = A2K3.iterator();
                while (it.hasNext()) {
                    C2582Ghv A27 = AbG.A0D(it).A27();
                    if (A27 != null && IQT.A05(A27)) {
                        11T.A0I(A27, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerSectionUnit");
                        String A0k = A27.A0k();
                        if (A0k != null) {
                            A0h.m11011add((Object) A0k);
                        }
                        1Du it2 = A27.A0u().iterator();
                        while (it2.hasNext()) {
                            IQT.A04(A0h, it2);
                        }
                    }
                }
            }
        } else if (iqt instanceof C2783Go0) {
            2JY r04 = (2JY) obj2;
            11T.A0F(r04, 0);
            A0h = 4YU.A0h();
            2JY A0K2 = AbF.A0K(r04, 2JX.class, 1135860104);
            if (A0K2 != null && (A0B = 1BK.A0B(A0K2, 2JX.class, -1050972529, 48867518)) != null && (A0b = A0B.A0b(-693297033, 2JX.class)) != null) {
                1Du it3 = A0b.iterator();
                while (it3.hasNext()) {
                    2JX A0T = 7zL.A0P(it3).A0T(2JX.class, -1479939821);
                    if (2JX.A0A(-1479939821, A0T) && A0T != null && (A1t = A0T.A1t()) != null && (A2K2 = A1t.A2K(96356950, 888407518)) != null) {
                        1Du it4 = A2K2.iterator();
                        while (it4.hasNext()) {
                            C2582Ghv A272 = AbG.A0D(it4).A27();
                            11T.A0I(A272, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerSectionUnit");
                            if (IQT.A05(A272)) {
                                String A0k2 = A272.A0k();
                                if (A0k2 != null) {
                                    A0h.m11011add((Object) A0k2);
                                }
                                1Du it5 = A272.A0u().iterator();
                                while (it5.hasNext()) {
                                    IQT.A04(A0h, it5);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (iqt instanceof C2785Go2) {
                of = ImmutableList.of();
                HXv hXv = new HXv(of);
                list = hXv.A00;
                if (list != null || list.isEmpty()) {
                    IQT.A01(graphQLResult, ht1, iqt, AnonymousClass001.A0u());
                } else {
                    if (r02 != null) {
                        r02.A00(hXv);
                        return;
                    }
                    return;
                }
            }
            if (iqt instanceof C2784Go1) {
                2JX r05 = (2JX) obj2;
                11T.A0F(r05, 0);
                A0h = 4YU.A0h();
                2JX A1t3 = r05.A1t();
                if (A1t3 != null && (A2K = A1t3.A2K(96356950, 888407518)) != null) {
                    11T.A0I(A1t3, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerSection.SectionUnits");
                    1Du it6 = A2K.iterator();
                    while (it6.hasNext()) {
                        C2582Ghv A273 = AbG.A0D(it6).A27();
                        11T.A0I(A273, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerSectionUnit");
                        if (IQT.A05(A273)) {
                            String A0k3 = A273.A0k();
                            if (A0k3 != null) {
                                A0h.m11011add((Object) A0k3);
                            }
                            1Du it7 = A273.A0u().iterator();
                            while (it7.hasNext()) {
                                IQT.A04(A0h, it7);
                            }
                        }
                    }
                }
            } else {
                2JY r06 = (2JY) obj2;
                A0h = 4YU.A0h();
                if (r06 != null && (A0c = r06.A0c(-397471165, C2582Ghv.class, -817923101)) != null) {
                    1Du it8 = A0c.iterator();
                    while (it8.hasNext()) {
                        C2582Ghv c2582Ghv = (C2582Ghv) it8.next();
                        if (c2582Ghv != null && IQT.A05(c2582Ghv)) {
                            String A0k4 = c2582Ghv.A0k();
                            if (A0k4 != null) {
                                A0h.m11011add((Object) A0k4);
                            }
                            ImmutableList A0u = c2582Ghv.A0u();
                            11T.A0A(A0u);
                            1Du it9 = A0u.iterator();
                            while (it9.hasNext()) {
                                2JX A0D = AbG.A0D(it9);
                                C2559GhY c2559GhY = A0D != null ? (C2559GhY) A0D.A0L(-1890252483, C2559GhY.class, -1095075201) : null;
                                11T.A0I(c2559GhY, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerSticker");
                                String A0k5 = c2559GhY.A0k();
                                if (A0k5 != null) {
                                    A0h.m11011add((Object) A0k5);
                                }
                            }
                        }
                    }
                }
            }
        }
        of = A0h.build();
        HXv hXv2 = new HXv(of);
        list = hXv2.A00;
        if (list != null) {
        }
        IQT.A01(graphQLResult, ht1, iqt, AnonymousClass001.A0u());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2480Geb.A03(java.lang.Throwable):void");
    }
}
