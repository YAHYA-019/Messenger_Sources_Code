package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerPack;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6z4, reason: invalid class name */
/* loaded from: 6z4.class */
public final class C6z4 implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final int A02;
    public final FbUserSession A03;
    public final 5oY A04;
    public final C6yf A05;
    public final 6wX A06;
    public final C6xN A07;
    public final C6xN A08;
    public final C6xN A09;
    public final C6xN A0A;
    public final C6xN A0B;
    public final C6xN A0C;
    public final C6xN A0D = new C6xN();
    public final 6yL A0E;
    public final C6wj A0F;
    public final C6ys A0G;
    public final C6ys A0H;
    public final C6ws A0I;
    public final C6ws A0J;
    public final C6ws A0K;
    public final C6ws A0L;
    public final C6ws A0M;
    public final C6wv A0N;
    public final C6wv A0O;
    public final 6yR A0P;
    public final C6yv A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.6xN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.6xN] */
    public C6z4(6yF r302) {
        ?? obj = new Object();
        obj.A00 = false;
        this.A0A = obj;
        this.A08 = new C6xN();
        this.A07 = new C6xN();
        ?? obj2 = new Object();
        obj2.A00 = false;
        this.A09 = obj2;
        ?? obj3 = new Object();
        obj3.A00 = false;
        this.A0B = obj3;
        this.A0C = new C6xN();
        this.A0F = r302.A06;
        this.A04 = r302.A02;
        this.A06 = r302.A04;
        C6ws c6ws = r302.A09;
        c6ws.getClass();
        this.A0I = c6ws;
        this.A0T = r302.A0L;
        this.A0V = r302.A0N;
        C6wv c6wv = r302.A0E;
        c6wv.getClass();
        this.A0N = c6wv;
        this.A0H = r302.A08;
        this.A0G = r302.A07;
        FbUserSession fbUserSession = r302.A01;
        fbUserSession.getClass();
        this.A03 = fbUserSession;
        this.A0S = r302.A0K;
        this.A0Q = r302.A0H;
        this.A0L = r302.A0C;
        this.A0E = r302.A05;
        C6wv c6wv2 = r302.A0F;
        c6wv2.getClass();
        this.A0O = c6wv2;
        C6ws c6ws2 = r302.A0D;
        c6ws2.getClass();
        this.A0M = c6ws2;
        C6yf c6yf = r302.A03;
        c6yf.getClass();
        this.A05 = c6yf;
        this.A0P = r302.A0G;
        this.A0U = r302.A0M;
        this.A02 = r302.A00;
        C6ws c6ws3 = r302.A0A;
        c6ws3.getClass();
        this.A0J = c6ws3;
        C6ws c6ws4 = r302.A0B;
        c6ws4.getClass();
        this.A0K = c6ws4;
        this.A0R = r302.A0J;
        this.A00 = r302.A0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.7FN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(X.6RU r302) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6z4.A00(X.6RU):void");
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7BB.class, 7BC.class, 7BD.class, 7BE.class, 7BF.class, 7BG.class, 7An.class, 7B5.class, 7BH.class, C6zq.class, C6zr.class, 7BI.class, 7BJ.class, 7BK.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "StickerPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1051, types: [X.6yn, X.6ym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1129, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v709, types: [X.6yn, X.6ym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v716, types: [X.835] */
    /* JADX WARN: Type inference failed for: r303v0, types: [X.77n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r308v9, types: [X.5fp, X.5fq] */
    /* JADX WARN: Type inference failed for: r310v25, types: [com.google.common.collect.ImmutableList] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        7C6 A00;
        int i;
        String str;
        String str2;
        String str3;
        Boolean bool;
        C5w5 c5w5;
        boolean z;
        Object obj;
        AnonymousClass783 anonymousClass783;
        Object obj2;
        String str4;
        Object obj3;
        ImmutableList.Builder A0h;
        Object obj4;
        Object obj5;
        Object obj6;
        C6xq anonymousClass784;
        String str5;
        Object obj7;
        Integer valueOf;
        int intValue;
        Integer valueOf2;
        if (r305 instanceof C6zr) {
            A00(r304);
            AnonymousClass784 anonymousClass7842 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
            C6ws c6ws = this.A0I;
            C6ws c6ws2 = this.A0M;
            C6wv c6wv = this.A0O;
            C6wv c6wv2 = this.A0N;
            7FN r0 = (7FN) this.A0C.A00;
            C6zr c6zr = (C6zr) r305;
            C6xN c6xN = this.A09;
            C6xN c6xN2 = this.A0B;
            C6xN c6xN3 = this.A0A;
            boolean z2 = this.A0U;
            C6xN c6xN4 = this.A08;
            C6xN c6xN5 = this.A07;
            6yL r02 = 6yG.A00;
            11T.A0F(r304, 0);
            11T.A0F(anonymousClass7842, 2);
            1BK.A1L(r0, 7, c6zr);
            11T.A0F(c6xN, 9);
            11T.A0F(c6xN2, 10);
            11T.A0F(c6xN3, 11);
            11T.A0F(c6xN4, 13);
            11T.A0F(c6xN5, 14);
            c6xN3.A00 = Boolean.valueOf(c6zr.A01);
            if (z2) {
                7FK r03 = (7FK) c6xN4.A00;
                if (r03 != null) {
                    r03.A01 = null;
                    r03.A02.set(false);
                }
                7FK r04 = (7FK) c6xN5.A00;
                if (r04 != null) {
                    r04.A01 = null;
                    r04.A02.set(false);
                }
            }
            if (anonymousClass7842.A05) {
                A00 = c6zr.A00;
                if (A00 == null) {
                    return;
                }
            } else {
                c6xN.A00 = false;
                c6xN2.A00 = false;
                7FT r05 = 7FT.A07;
                Integer num = 0S2.A00;
                7FI.A02(r304, new 7FU(r05, num, num));
                6Sh r06 = c6zr.A00;
                if (anonymousClass7842.A08) {
                    r0.ASB(r06, c6ws, c6ws2, c6wv, c6wv2, new WeakReference(r304));
                } else {
                    if (z2) {
                        WeakReference weakReference = new WeakReference(r304);
                        Integer num2 = 0S2.A0C;
                        Bundle bundle = Bundle.EMPTY;
                        11T.A0B(bundle);
                        r0.ASJ(c6wv.AUS(bundle), num2, "recent_stickers_id", weakReference);
                    }
                    if (r06 != null) {
                        7FI.A02(r304, r06);
                    }
                }
                AnonymousClass783 anonymousClass7832 = new AnonymousClass783(anonymousClass7842);
                anonymousClass7832.A05 = true;
                String A0t = 1BK.A0t();
                anonymousClass7832.A03 = A0t;
                C1pq.A08("stickerImpressionId", A0t);
                c77n.ClL(new AnonymousClass784(anonymousClass7832));
                C98g c98g = C98g.A07;
                ImmutableMap of = ImmutableMap.of((Object) "composer_surface", (Object) "row_selector");
                11T.A0A(of);
                A00 = new 7C6(c98g, of);
            }
        } else {
            if (!(r305 instanceof 7B5)) {
                if (r305 instanceof C6zq) {
                    A00(r304);
                    6yG.A02((C77n) c77n, r304, this.A0B, this.A09, this.A0A, (AnonymousClass784) c77n.AUP(AnonymousClass784.class), this.A0V);
                    return;
                }
                if (!(r305 instanceof 7BK)) {
                    if (r305 instanceof 7An) {
                        A00(r304);
                        6wX r07 = this.A06;
                        boolean z3 = this.A0V;
                        AnonymousClass784 anonymousClass7843 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                        C6xN c6xN6 = this.A0B;
                        C6xN c6xN7 = this.A09;
                        C6xN c6xN8 = this.A0A;
                        6yL r08 = 6yG.A00;
                        11T.A0F(r304, 0);
                        11T.A0F(anonymousClass7843, 4);
                        11T.A0F(c6xN6, 5);
                        11T.A0F(c6xN7, 6);
                        11T.A0F(c6xN8, 7);
                        if ((anonymousClass7843.A05 && anonymousClass7843.A07 && r07 != null && r07.AGZ()) || 6yG.A02((C77n) c77n, r304, c6xN6, c6xN7, c6xN8, anonymousClass7843, z3)) {
                            7FI.A00(r304);
                            return;
                        }
                        return;
                    }
                    if (r305 instanceof 7BD) {
                        A00(r304);
                        7BD r09 = (7BD) r305;
                        C6ws c6ws3 = this.A0K;
                        C6ws c6ws4 = this.A0J;
                        C6ws c6ws5 = this.A0L;
                        boolean z4 = this.A0T;
                        7FN r010 = (7FN) this.A0C.A00;
                        7FP r011 = (7FP) this.A0D.A00;
                        AnonymousClass784 anonymousClass7844 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                        7FK r012 = (7FK) this.A08.A00;
                        7FK r013 = (7FK) this.A07.A00;
                        6yL r014 = 6yG.A00;
                        4YV.A1N(r304, r09);
                        1BK.A1L(r010, 7, r011);
                        11T.A0F(anonymousClass7844, 9);
                        11T.A0F(r012, 10);
                        11T.A0F(r013, 11);
                        if (r09 instanceof C7gu) {
                            String str6 = ((C7gu) r09).A00;
                            ImmutableList immutableList = anonymousClass7844.A02;
                            11T.A0A(immutableList);
                            ArrayList A0s = AnonymousClass001.A0s();
                            Iterator it = immutableList.iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    if (11T.A0O(((C6ys) next).A04, str6) && (valueOf2 = Integer.valueOf(i2)) != null) {
                                        A0s.add(valueOf2);
                                    }
                                    i2 = i3;
                                }
                            }
                            valueOf = (Number) 0QD.A0E(A0s);
                        } else {
                            if (!(r09 instanceof C7gv)) {
                                throw 1BK.A1F();
                            }
                            valueOf = Integer.valueOf(((C7gv) r09).A00);
                        }
                        if (valueOf == null || (intValue = valueOf.intValue()) == anonymousClass7844.A00 || !anonymousClass7844.A05) {
                            return;
                        }
                        ImmutableList.Builder A0h2 = 4YU.A0h();
                        ImmutableList immutableList2 = anonymousClass7844.A02;
                        int size = immutableList2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C6ys c6ys = (C6ys) 4YU.A0q(immutableList2, i4);
                            if (AnonymousClass001.A1Q(i4, intValue) != c6ys.A06) {
                                if (c6ys instanceof C93T) {
                                    C93T c93t = (C93T) c6ys;
                                    11T.A0F(c93t, 0);
                                    C6yn c6yn = new C6yn(c93t);
                                    StickerPack stickerPack = c93t.A00;
                                    11T.A0F(stickerPack, 0);
                                    new AVF(stickerPack, 44).invoke(c6yn);
                                    4YU.A1C(9, c6yn, AnonymousClass001.A1Q(i4, intValue));
                                    c6ys = new C93T(c6yn);
                                } else if (c6ys instanceof 93S) {
                                    C6yn c6yn2 = new C6yn(c6ys);
                                    4YU.A1C(9, c6yn2, AnonymousClass001.A1Q(i4, intValue));
                                    c6ys = new C6ys(c6yn2);
                                } else if (c6ys instanceof C93V) {
                                    93R A002 = 9EG.A00((C93V) c6ys);
                                    4YU.A1C(9, A002, AnonymousClass001.A1Q(i4, intValue));
                                    c6ys = new C93V(A002);
                                } else if (c6ys instanceof C93U) {
                                    C93U c93u = (C93U) c6ys;
                                    11T.A0F(c93u, 0);
                                    C6yn c6yn3 = new C6yn(c93u);
                                    4YU.A1C(6, c6yn3, c93u.A00);
                                    4YU.A1C(9, c6yn3, AnonymousClass001.A1Q(i4, intValue));
                                    c6ys = new C93U(c6yn3);
                                } else if (c6ys instanceof C6yr) {
                                    C6yr c6yr = (C6yr) c6ys;
                                    11T.A0F(c6yr, 0);
                                    ?? c6yn4 = new C6yn(c6yr);
                                    4YU.A1C(7, (Object) c6yn4, c6yr.A00);
                                    4YU.A1C(9, (Object) c6yn4, AnonymousClass001.A1Q(i4, intValue));
                                    c6ys = new C6yr(c6yn4);
                                }
                            }
                            A0h2.m11011add((Object) c6ys);
                        }
                        AnonymousClass783 anonymousClass7833 = new AnonymousClass783(anonymousClass7844);
                        anonymousClass7833.A00 = intValue;
                        ImmutableList build = A0h2.build();
                        anonymousClass7833.A02 = build;
                        C1pq.A08("stickerTabs", build);
                        AnonymousClass784 anonymousClass7845 = new AnonymousClass784(anonymousClass7833);
                        c77n.ClL(anonymousClass7845);
                        ImmutableList immutableList3 = anonymousClass7845.A02;
                        if (immutableList3.size() > 0) {
                            6yG.A01(r010, (C6ys) 4YU.A0q(immutableList3, intValue), c6ws3, c6ws4, c6ws5, r012, r013, new WeakReference(r304), z4);
                        }
                        r011.A00.set(intValue);
                        return;
                    }
                    if (r305 instanceof 7BJ) {
                        A00(r304);
                        7BJ r015 = (7BJ) r305;
                        boolean z5 = this.A0R;
                        C6ys c6ys2 = this.A0H;
                        C6ys c6ys3 = this.A0G;
                        C6ws c6ws6 = this.A0K;
                        C6ws c6ws7 = this.A0J;
                        C6ws c6ws8 = this.A0L;
                        boolean z6 = this.A0T;
                        boolean z7 = this.A0S;
                        C6wj c6wj = this.A0F;
                        AnonymousClass784 anonymousClass7846 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                        7FN r016 = (7FN) this.A0C.A00;
                        7FP r017 = (7FP) this.A0D.A00;
                        7FK r018 = (7FK) this.A08.A00;
                        7FK r019 = (7FK) this.A07.A00;
                        6yL r020 = 6yG.A00;
                        11T.A0F(r304, 0);
                        i = 1;
                        11T.A0F(r015, 2);
                        11T.A0F(anonymousClass7846, 12);
                        11T.A0F(r016, 13);
                        11T.A0F(r017, 14);
                        11T.A0F(r018, 15);
                        11T.A0F(r019, 16);
                        if (z6 && r015.A00 == 0S2.A1G && (obj7 = r015.A01) != null) {
                            List list = (List) obj7;
                            if (1BK.A1Y(list)) {
                                A0h = 4YU.A0h();
                                1Du it2 = anonymousClass7846.A02.iterator();
                                while (it2.hasNext()) {
                                    C6ys c6ys4 = (C6ys) it2.next();
                                    if (c6ys4 instanceof C93V) {
                                        C93V c93v = (C93V) c6ys4;
                                        List list2 = c93v.A05;
                                        if (list2 != null && list2.equals(list)) {
                                            return;
                                        }
                                        93R A003 = 9EG.A00(c93v);
                                        new AVF(list, 45).invoke(A003);
                                        c6ys4 = new C93V(A003);
                                    }
                                    A0h.m11011add((Object) c6ys4);
                                }
                                anonymousClass783 = new AnonymousClass783(anonymousClass7846);
                                ?? build2 = A0h.build();
                                anonymousClass783.A02 = build2;
                                str4 = "stickerTabs";
                                str5 = build2;
                                C1pq.A08(str4, str5);
                                anonymousClass784 = new AnonymousClass784(anonymousClass783);
                            }
                        }
                        Integer num3 = r015.A00;
                        if (num3 == 0S2.A01 && (obj6 = r015.A01) != null) {
                            String str7 = r015.A02;
                            A0h = 4YU.A0h();
                            1Du it3 = anonymousClass7846.A02.iterator();
                            while (it3.hasNext()) {
                                C6ys c6ys5 = (C6ys) it3.next();
                                if ((c6ys5 instanceof C93T) && 11T.A0O(c6ys5.A04, str7)) {
                                    C93T c93t2 = (C93T) c6ys5;
                                    11T.A0F(c93t2, 0);
                                    C6yn c6yn5 = new C6yn(c93t2);
                                    StickerPack stickerPack2 = c93t2.A00;
                                    11T.A0F(stickerPack2, 0);
                                    new AVF(stickerPack2, 44).invoke(c6yn5);
                                    new AnonymousClass835(obj6, 45).invoke(c6yn5);
                                    c6ys5 = new C93T(c6yn5);
                                } else if (c6ys5 instanceof C93V) {
                                    C93V c93v2 = (C93V) c6ys5;
                                    StickerPack stickerPack3 = c93v2.A00;
                                    if (11T.A0O(stickerPack3 != null ? stickerPack3.A0B : null, str7)) {
                                        93R A004 = 9EG.A00(c93v2);
                                        new AVF(obj6, 45).invoke(A004);
                                        c6ys5 = new C93V(A004);
                                    }
                                }
                                A0h.m11011add((Object) c6ys5);
                            }
                        } else if (num3 != 0S2.A0N || (obj5 = r015.A01) == null || !((List) obj5).isEmpty() || r017.A00.get() != 0 || !z5) {
                            if (num3 == 0S2.A0C && (obj4 = r015.A01) != null) {
                                List list3 = (List) obj4;
                                if (!z7) {
                                    ArrayList A0s2 = AnonymousClass001.A0s();
                                    for (Object obj8 : list3) {
                                        if (!C7ln.A00((Sticker) obj8)) {
                                            A0s2.add(obj8);
                                        }
                                    }
                                    list3 = A0s2;
                                }
                                A0h = 4YU.A0h();
                                1Du it4 = anonymousClass7846.A02.iterator();
                                while (it4.hasNext()) {
                                    C6ys c6ys6 = (C6ys) it4.next();
                                    if (c6ys6 instanceof 93S) {
                                        List list4 = c6ys6.A05;
                                        if (list4 != null && list4.equals(list3)) {
                                            return;
                                        }
                                        C6yn c6yn6 = new C6yn(c6ys6);
                                        new AnonymousClass835(list3, 45).invoke(c6yn6);
                                        c6ys6 = new C6ys(c6yn6);
                                    }
                                    A0h.m11011add((Object) c6ys6);
                                }
                            } else if (num3 == 0S2.A0Y && (obj3 = r015.A01) != null) {
                                A0h = 4YU.A0h();
                                1Du it5 = anonymousClass7846.A02.iterator();
                                while (it5.hasNext()) {
                                    C6ys c6ys7 = (C6ys) it5.next();
                                    if (c6ys7 instanceof C6yr) {
                                        C6yr c6yr2 = (C6yr) c6ys7;
                                        List list5 = c6yr2.A05;
                                        if (list5 != null && list5.equals(obj3)) {
                                            return;
                                        }
                                        ?? c6yn7 = new C6yn(c6yr2);
                                        4YU.A1C(7, (Object) c6yn7, c6yr2.A00);
                                        new AnonymousClass835(obj3, 45).invoke(c6yn7);
                                        c6ys7 = new C6yr(c6yn7);
                                    }
                                    A0h.m11011add((Object) c6ys7);
                                }
                            } else if (num3 == 0S2.A0j && (obj2 = r015.A01) != null) {
                                C7q9 c7q9 = (C7q9) obj2;
                                ImmutableList A0a = 1BL.A0a(c7q9.A01);
                                ImmutableList.Builder A0h3 = 4YU.A0h();
                                1Du it6 = anonymousClass7846.A02.iterator();
                                while (it6.hasNext()) {
                                    C6ys c6ys8 = (C6ys) it6.next();
                                    if (c6ys8 instanceof C93V) {
                                        93R A005 = 9EG.A00((C93V) c6ys8);
                                        new AnonymousClass835(A0a, 45).invoke(A005);
                                        c6ys8 = new C93V(A005);
                                    }
                                    A0h3.m11011add((Object) c6ys8);
                                }
                                anonymousClass783 = new AnonymousClass783(anonymousClass7846);
                                ImmutableList build3 = A0h3.build();
                                anonymousClass783.A02 = build3;
                                C1pq.A08("stickerTabs", build3);
                                String str8 = c7q9.A00;
                                anonymousClass783.A04 = str8;
                                str4 = "stickerRankingId";
                                str5 = str8;
                                C1pq.A08(str4, str5);
                                anonymousClass784 = new AnonymousClass784(anonymousClass783);
                            } else {
                                if (num3 != 0S2.A15 || (obj = r015.A01) == null) {
                                    if (num3 == 0S2.A00) {
                                        WeakReference weakReference2 = new WeakReference(r304);
                                        List list6 = (List) r015.A01;
                                        ImmutableList.Builder A0h4 = 4YU.A0h();
                                        int i5 = z5 ? 1 : 2;
                                        if (c6ys3 != null) {
                                            i5++;
                                        }
                                        if (c6ys2 != null) {
                                            i5++;
                                        }
                                        AtomicInteger atomicInteger = r017.A00;
                                        int i6 = atomicInteger.get();
                                        AtomicInteger atomicInteger2 = r017.A01;
                                        int i7 = atomicInteger2.get();
                                        if (i7 != -1) {
                                            i6 = (i6 - i7) + i5;
                                            if (i6 < 0) {
                                                i6 = 0;
                                            }
                                        }
                                        int i8 = !z5 ? 1 : 0;
                                        if (!z5) {
                                            C6yn c6yn8 = new C6yn();
                                            new C83K("sticker_search_id", 5).invoke(c6yn8);
                                            4YU.A1B(2132345369, 5, c6yn8);
                                            4YU.A1B(-8091765, 4, c6yn8);
                                            4YU.A1B(2131966345, 3, c6yn8);
                                            4YU.A1C(9, c6yn8, AnonymousClass001.A1O(i6));
                                            if (!z6 && list6 != null && !list6.isEmpty()) {
                                                new AVF(list6.get(0), 46).invoke(c6yn8);
                                            }
                                            A0h4.m11011add((Object) new C93V(c6yn8));
                                        }
                                        6RU r021 = (6RU) weakReference2.get();
                                        Context context = r021 != null ? r021.A00 : null;
                                        C6yn c6yn9 = new C6yn();
                                        new C83K("recent_stickers_id", 5).invoke(c6yn9);
                                        4YU.A1B(2132345438, 5, c6yn9);
                                        2MR r022 = 2MR.A2S;
                                        2Mg r023 = 2Me.A02;
                                        4YU.A1B(r023.A03(context, r022), 4, c6yn9);
                                        4YU.A1B(r023.A03(context, 2MR.A1g), 6, c6yn9);
                                        4YU.A1B(2131964222, 3, c6yn9);
                                        4YU.A1C(9, c6yn9, AnonymousClass001.A1Q(i6, i8));
                                        A0h4.m11011add((Object) new C6ys(c6yn9));
                                        if (c6ys2 != null) {
                                            A0h4.m11011add((Object) c6ys2);
                                        }
                                        if (c6ys3 != null) {
                                            A0h4.m11011add((Object) c6ys3);
                                        }
                                        int i9 = i6 - i5;
                                        if (list6 != null) {
                                            int i10 = 0;
                                            for (Object obj9 : list6) {
                                                int i11 = i10 + 1;
                                                if (i10 >= 0) {
                                                    StickerPack stickerPack4 = (StickerPack) obj9;
                                                    if (z5) {
                                                        z = true;
                                                        if (i10 == i9) {
                                                            C6yn c6yn10 = new C6yn();
                                                            new C83K(stickerPack4.A0B, 5).invoke(c6yn10);
                                                            4YU.A1C(9, c6yn10, z);
                                                            new AVF(stickerPack4, 44).invoke(c6yn10);
                                                            A0h4.m11011add((Object) new C93T(c6yn10));
                                                            i10 = i11;
                                                        }
                                                    }
                                                    z = false;
                                                    C6yn c6yn102 = new C6yn();
                                                    new C83K(stickerPack4.A0B, 5).invoke(c6yn102);
                                                    4YU.A1C(9, c6yn102, z);
                                                    new AVF(stickerPack4, 44).invoke(c6yn102);
                                                    A0h4.m11011add((Object) new C93T(c6yn102));
                                                    i10 = i11;
                                                }
                                            }
                                        }
                                        ImmutableList build4 = A0h4.build();
                                        int size2 = build4.size() - 1;
                                        if (size2 < 0) {
                                            size2 = 0;
                                        }
                                        int min = Math.min(i6, size2);
                                        atomicInteger2.set(i5);
                                        atomicInteger.set(min);
                                        AnonymousClass783 anonymousClass7834 = new AnonymousClass783(anonymousClass7846);
                                        anonymousClass7834.A02 = build4;
                                        anonymousClass7834.A00 = min;
                                        anonymousClass7834.A08 = false;
                                        c77n.ClL(new AnonymousClass784(anonymousClass7834));
                                        if (build4.size() > 0) {
                                            if (c6wj != C6wj.A03) {
                                                6yG.A01(r016, (C6ys) 4YU.A0q(build4, min), c6ws6, c6ws7, c6ws8, r018, r019, weakReference2, z6);
                                                return;
                                            }
                                            1Du it7 = build4.iterator();
                                            while (it7.hasNext()) {
                                                C6ys c6ys9 = (C6ys) it7.next();
                                                11T.A0D(c6ys9);
                                                6yG.A01(r016, c6ys9, c6ws6, c6ws7, c6ws8, r018, r019, weakReference2, z6);
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                int size3 = ((List) obj).size();
                                anonymousClass783 = new AnonymousClass783(anonymousClass7846);
                                anonymousClass783.A01 = size3;
                                anonymousClass784 = new AnonymousClass784(anonymousClass783);
                            }
                        }
                        anonymousClass783 = new AnonymousClass783(anonymousClass7846);
                        ?? build22 = A0h.build();
                        anonymousClass783.A02 = build22;
                        str4 = "stickerTabs";
                        str5 = build22;
                        C1pq.A08(str4, str5);
                        anonymousClass784 = new AnonymousClass784(anonymousClass783);
                    } else {
                        if (r305 instanceof 7BE) {
                            A00(r304);
                            C6yv c6yv = this.A0Q;
                            Object obj10 = this.A0C.A00;
                            Object obj11 = this.A07.A00;
                            6yL r024 = 6yG.A00;
                            4YV.A1N(r304, obj10);
                            11T.A0F(obj11, 3);
                            if (c6yv != null) {
                                c6yv.A00 = new AQu(10, obj11, obj10, r304);
                                return;
                            }
                            return;
                        }
                        if (r305 instanceof 7BB) {
                            A00(r304);
                            7BB r025 = (7BB) r305;
                            7FK r026 = (7FK) this.A08.A00;
                            5oY r027 = this.A04;
                            int i12 = this.A02;
                            6wX r028 = this.A06;
                            AnonymousClass784 anonymousClass7847 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                            C6xN c6xN9 = this.A09;
                            6yL r029 = 6yG.A00;
                            boolean A1X = 1BL.A1X(r304, r025);
                            11T.A0F(r026, 2);
                            4YV.A1M(anonymousClass7847, 6, c6xN9);
                            1Bn.A0A(49988);
                            Sticker sticker = r025.A00;
                            if (!6Bl.A02(sticker)) {
                                r026.add(sticker);
                            }
                            Integer num4 = 0S2.A01;
                            7FI.A02(r304, new 7BV(num4));
                            String A0s3 = 4YU.A0s();
                            String A006 = r027 != null ? r027.A00(i12) : null;
                            11T.A0F(A0s3, 2);
                            boolean A007 = C7ln.A00(sticker);
                            7Gc r030 = new 7Gc();
                            r030.A02(A007 ? "custom_sticker" : "sticker");
                            r030.A03("composer_sticker");
                            4YU.A1B(A1X ? 1 : 0, 2, r030);
                            7AQ.A00(r304, r030, A0s3);
                            if (A007) {
                                str2 = "930215145186465";
                                bool = false;
                                ?? c5fp = new C5fp();
                                c5fp.A0B = A0s3;
                                c5fp.A0A = A006;
                                str3 = 5wW.A00(sticker, (C5fp) c5fp, num4, A1X);
                                c5w5 = c5fp;
                            } else {
                                str2 = sticker.A0H;
                                C5w5 c5w52 = new C5w5();
                                str3 = sticker.A0F;
                                c5w52.A06(str3);
                                c5w52.A00 = sticker;
                                c5w52.A0B = A0s3;
                                c5w52.A0A = A006;
                                bool = null;
                                c5w5 = c5w52;
                            }
                            c5w5.A02(C5gN.A00, new C5wn(bool, null, null, str2, str3));
                            7FI.A02(r304, new 7Ad(c5w5, "composer_sticker", "composer_sticker"));
                            Object obj12 = c6xN9.A00;
                            Boolean valueOf3 = Boolean.valueOf(A1X);
                            if (!11T.A0O(obj12, valueOf3)) {
                                c6xN9.A00 = valueOf3;
                            }
                            if (anonymousClass7847.A05 && anonymousClass7847.A07 && r028 != null) {
                                r028.AGZ();
                                return;
                            }
                            return;
                        }
                        if (r305 instanceof 7BI) {
                            A00(r304);
                            C6wv c6wv3 = this.A0O;
                            7BI r031 = (7BI) r305;
                            7FN r032 = (7FN) this.A0C.A00;
                            6yL r033 = 6yG.A00;
                            11T.A0F(r304, 0);
                            11T.A0F(r031, 2);
                            11T.A0F(r032, 3);
                            if (r031.A01 != -1 || r031.A00 != 7378) {
                                return;
                            }
                            WeakReference weakReference3 = new WeakReference(r304);
                            Integer num5 = 0S2.A0C;
                            Bundle bundle2 = Bundle.EMPTY;
                            11T.A0B(bundle2);
                            str = "recent_stickers_id";
                            r032.ASJ(c6wv3.AUS(bundle2), num5, str, weakReference3);
                        } else {
                            if (r305 instanceof 7BF) {
                                A00(r304);
                                C6yf c6yf = this.A05;
                                AnonymousClass784 anonymousClass7848 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                                6yL r034 = 6yG.A00;
                                11T.A0F(r304, 0);
                                11T.A0F(anonymousClass7848, 4);
                                AnonymousClass783 anonymousClass7835 = new AnonymousClass783(anonymousClass7848);
                                anonymousClass7835.A05 = false;
                                anonymousClass7835.A08 = true;
                                c77n.ClL(new AnonymousClass784(anonymousClass7835));
                                7FI.A02(r304, 7Ax.A02);
                                Bundle bundle3 = Bundle.EMPTY;
                                11T.A0B(bundle3);
                                c6yf.A02(bundle3);
                                return;
                            }
                            if (r305 instanceof 7BC) {
                                A00(r304);
                                7BC r035 = (7BC) r305;
                                C6xN c6xN10 = this.A0B;
                                6yL r036 = 6yG.A00;
                                11T.A0F(r304, 0);
                                11T.A0G(r035, 1, c6xN10);
                                c6xN10.A00 = true;
                                A00 = new A4g(r035.A00);
                            } else if (r305 instanceof 7BG) {
                                A00(r304);
                                AnonymousClass784 anonymousClass7849 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
                                7BG r037 = (7BG) r305;
                                6yL r038 = this.A0E;
                                C6yf c6yf2 = this.A05;
                                6yL r039 = 6yG.A00;
                                i = 0;
                                11T.A0F(r304, 0);
                                1BK.A1J(anonymousClass7849, 2, r037);
                                Integer num6 = r037.A00;
                                if (num6 == null) {
                                    ARW arw = new ARW(19, (Object) c77n, c6yf2, r304, r037, anonymousClass7849);
                                    String str9 = r037.A02;
                                    String str10 = r037.A03;
                                    if (str9 != null) {
                                        r038.ASE(str9, arw);
                                        return;
                                    } else {
                                        if (str10 != null) {
                                            if (87A.A00(str10)) {
                                                arw.invoke(new Object());
                                                return;
                                            } else {
                                                r038.ASF(str10, arw);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                }
                                Integer num7 = r037.A01;
                                if (num7 == null) {
                                    return;
                                }
                                int intValue2 = num7.intValue();
                                if (intValue2 == 1) {
                                    str = "avatar_stickers_id";
                                } else {
                                    if (intValue2 == 0) {
                                        if (num6 == 0S2.A00) {
                                            String str11 = r037.A03;
                                            ImmutableList immutableList4 = anonymousClass7849.A02;
                                            11T.A0A(immutableList4);
                                            Iterator it8 = immutableList4.iterator();
                                            while (it8.hasNext()) {
                                                if (!11T.A0O(((C6ys) it8.next()).A04, str11)) {
                                                    i++;
                                                } else if (i == -1) {
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    if (intValue2 != 2) {
                                        return;
                                    } else {
                                        str = "sticker_search_id";
                                    }
                                }
                            } else {
                                if (!(r305 instanceof 7BH)) {
                                    return;
                                }
                                A00(r304);
                                7BH r040 = (7BH) r305;
                                7FK r041 = (7FK) this.A08.A00;
                                6yL r042 = 6yG.A00;
                                11T.A0H(r304, r040);
                                11T.A0F(r041, 2);
                                r041.Cdm(r040.A00);
                                A00 = R40.A00(0S2.A0C, r040.A01, r040.A02);
                            }
                        }
                        A00 = new C7gu(str);
                    }
                    A00 = new C7gv(i);
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                A00(r304);
                C77w c77w = (C77w) c77n.AUk(null, C77w.class);
                6yL r043 = 6yG.A00;
                if (c77w == null) {
                    return;
                } else {
                    anonymousClass784 = new C77w(c77w.A00, c77w.A01, false, c77w.A03);
                }
                c77n.ClL(anonymousClass784);
                return;
            }
            A00(r304);
            boolean z8 = this.A0V;
            7B5 r044 = (7B5) r305;
            AnonymousClass784 anonymousClass78410 = (AnonymousClass784) c77n.AUP(AnonymousClass784.class);
            C77w c77w2 = (C77w) c77n.AUk(null, C77w.class);
            C6xN c6xN11 = this.A0A;
            6yL r045 = 6yG.A00;
            11T.A0F(r304, 0);
            1BK.A1K(r044, 3, anonymousClass78410);
            11T.A0F(c6xN11, 6);
            if (!anonymousClass78410.A05 || anonymousClass78410.A07 == r044.isExpanded || !1BK.A1X(c6xN11.A00, true)) {
                return;
            }
            ImmutableList A008 = 6yG.A00(anonymousClass78410, r044.isExpanded);
            AnonymousClass783 anonymousClass7836 = new AnonymousClass783(anonymousClass78410);
            anonymousClass7836.A02 = A008;
            C1pq.A08("stickerTabs", A008);
            anonymousClass7836.A07 = r044.isExpanded;
            c77n.ClL(new AnonymousClass784(anonymousClass7836));
            if (!r044.isExpanded) {
                7FI.A02(r304, 7Aw.A02);
                7FI.A02(r304, 7BK.A02);
            } else if (c77w2 != null) {
                c77n.ClL(new C77w(c77w2.A00, c77w2.A01, true, c77w2.A03));
            }
            if (z8) {
                return;
            }
            A00 = new C7Az(r044.isExpanded ? 48 : 16);
        }
        7FI.A02(r304, A00);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
