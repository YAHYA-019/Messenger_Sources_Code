package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart;
import com.facebook.xapp.messaging.events.common.threadview.OnUnreadMessageDetected;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6vw, reason: invalid class name */
/* loaded from: 6vw.class */
public final class C6vw implements 1Vf {
    public final 1Va A00;
    public final C6w4 A01;
    public final FbUserSession A02;
    public final ThreadKey A03;

    public C6vw(FbUserSession fbUserSession, ThreadKey threadKey, 1Va r304) {
        11T.A0F(r304, 3);
        this.A03 = threadKey;
        this.A02 = fbUserSession;
        this.A00 = r304;
        C1F6 c1f6 = (C1F6) 1Bn.A0A(65595);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            C6w4 c6w4 = new C6w4(fbUserSession, threadKey);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = c6w4;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        C6w4 c6w4;
        1Va r311;
        C00i c00i;
        C6w8 c6w8;
        1Um A0O;
        MailboxFutureImpl A0Q;
        N7B n7b;
        C6qj c6qj;
        long parseLong;
        PrivacyContext privacyContext;
        int i;
        List B70;
        C6va c6va;
        boolean z;
        boolean z2;
        5vV r0;
        C5fv c5fv;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        int hashCode = str.hashCode();
        if (hashCode != -1787492718) {
            if (hashCode != -1440551537) {
                if (hashCode == -1399920744 && str.equals("com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart")) {
                    OnDataFetchRenderStart onDataFetchRenderStart = (OnDataFetchRenderStart) r302;
                    11T.A0F(onDataFetchRenderStart, 0);
                    c6w4 = this.A01;
                    5oH r02 = onDataFetchRenderStart.A00;
                    r311 = this.A00;
                    11T.A0F(r311, 1);
                    c00i = c6w4.A05.A00;
                    if (!((C6w8) c00i.get()).A00 && r02.AuO() == 2) {
                        long AtN = r02.AtN();
                        List B702 = r02.B70();
                        boolean z3 = false;
                        if (((B702 == null || (r0 = (5vW) 0QD.A0E(B702)) == null || (c5fv = r0.A00) == null) ? 0L : ((C5fu) c5fv).A02) > AtN) {
                            z3 = true;
                        }
                        c6w4.A00 = new C5o5(AtN, z3);
                        ((C6w8) c00i.get()).A01 = true;
                    }
                    if (!((C6w8) c00i.get()).A00 && c6w4.A00.A01 && (B70 = r02.B70()) != null) {
                        C00i c00i2 = c6w4.A04.A00;
                        C5jl c5jl = (C5jl) c00i2.get();
                        ThreadKey threadKey = c6w4.A07;
                        if (c5jl.A01(threadKey)) {
                            1Br.A0C(c6w4.A06);
                            long j = c6w4.A00.A00;
                            LinkedHashMap A1C = 1BK.A1C();
                            Iterator it = B70.iterator();
                            boolean z4 = false;
                            String str2 = null;
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C5fv c5fv2 = ((5vW) it.next()).A00;
                                C5fu c5fu = (C5fu) c5fv2;
                                long j2 = c5fu.A02;
                                if (j2 > j) {
                                    str2 = c5fu.A09;
                                    if (!c5fu.A0H && !(c5fv2 instanceof 5wJ) && !(c5fv2 instanceof C5uY) && !(c5fv2 instanceof 5vM)) {
                                        i2++;
                                        C5fr c5fr = c5fu.A05;
                                        if (A1C.size() < 3) {
                                            String str3 = c5fr.A06;
                                            11T.A0A(str3);
                                            if (!A1C.containsKey(str3)) {
                                                String str4 = c5fr.A09;
                                                11T.A0A(str4);
                                                A1C.put(str3, str4);
                                            }
                                        }
                                    }
                                } else if (j2 > 0) {
                                    z4 = true;
                                }
                            }
                            c6va = new C6va(null, str2, 0QD.A0V(A1C.values()), i2, j, z4);
                        } else {
                            if (((C5jl) c00i2.get()).A00.AZk(threadKey.A0z() ? 72339893649476015L : 72339893649541552L)) {
                                1Br.A0C(c6w4.A06);
                                long j3 = c6w4.A00.A00;
                                LinkedHashMap A1C2 = 1BK.A1C();
                                EnumMap enumMap = new EnumMap(C95t.class);
                                Iterator it2 = B70.iterator();
                                8Lu r330 = null;
                                C95t c95t = null;
                                String str5 = null;
                                while (true) {
                                    z = false;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    C5fv c5fv3 = ((5vW) it2.next()).A00;
                                    C5fu c5fu2 = (C5fu) c5fv3;
                                    long j4 = c5fu2.A02;
                                    if (j4 <= j3) {
                                        if (j4 > 0) {
                                            z = true;
                                        }
                                    } else if (!c5fu2.A0H && (((z2 = c5fv3 instanceof 5gR)) || (c5fv3 instanceof C5n6) || (c5fv3 instanceof C5n8))) {
                                        if (z2) {
                                            c95t = C95t.A04;
                                        } else if (c5fv3 instanceof C5n6) {
                                            c95t = C95t.A02;
                                        } else {
                                            if (!(c5fv3 instanceof C5n8)) {
                                                throw AnonymousClass001.A0L(7zK.A00(76));
                                            }
                                            c95t = C95t.A03;
                                        }
                                        Number number = (Number) enumMap.get(c95t);
                                        if (number == null) {
                                            number = 0;
                                        }
                                        AnonymousClass001.A1A(c95t, enumMap, number.intValue() + 1);
                                        C5fr c5fr2 = c5fu2.A05;
                                        if (A1C2.size() < 3) {
                                            String str6 = c5fr2.A06;
                                            11T.A0A(str6);
                                            if (!A1C2.containsKey(str6)) {
                                                String str7 = c5fr2.A09;
                                                11T.A0A(str7);
                                                A1C2.put(str6, str7);
                                            }
                                        }
                                        str5 = c5fu2.A09;
                                    }
                                }
                                if ((!enumMap.isEmpty()) && c95t != null) {
                                    r330 = new 8Lu(c95t, enumMap);
                                }
                                c6va = new C6va(r330, str5, 0QD.A0V(A1C2.values()), 0, j3, z);
                            } else {
                                c6va = C6va.A06;
                            }
                        }
                        c6w4.A01 = c6va;
                    }
                    c6w8 = (C6w8) c00i.get();
                    if (c6w8.A00 && c6w8.A02 && c6w8.A01) {
                        ((C6w8) c00i.get()).A00 = true;
                        C5jq c5jq = (C5jq) c6w4.A03.A00.get();
                        ThreadKey threadKey2 = c6w4.A07;
                        c5jq.AgW(threadKey2).A02.A00(c6w4.A00);
                        if (c6w4.A00.A01) {
                            r311.CZm(new OnUnreadMessageDetected(threadKey2));
                        }
                        C00i c00i3 = c6w4.A04.A00;
                        if (!((C5jl) c00i3.get()).A01(threadKey2)) {
                            if (!((C5jl) c00i3.get()).A00.AZk(threadKey2.A0z() ? 72339893649476015L : 72339893649541552L)) {
                                return;
                            }
                        }
                        c6w4.A09.A00(c6w4.A01);
                        boolean A01 = ((C5jl) c00i3.get()).A01(threadKey2);
                        if (11T.A0O(c6w4.A01, C6va.A06) || c6w4.A01.A05) {
                            return;
                        }
                        Executor executor = (Executor) 1Bi.A03(16467);
                        C6w5 c6w5 = c6w4.A08;
                        long j5 = c6w4.A00.A00;
                        1FV A0j = 4YU.A0j();
                        boolean A12 = threadKey2.A12();
                        if (A01) {
                            if (!A12) {
                                C6qj c6qj2 = c6w5.A00;
                                long parseLong2 = Long.parseLong(4YU.A0y(threadKey2));
                                PrivacyContext privacyContext2 = c6w5.A02;
                                N82 n82 = new N82(15, j5, A0j, c6w5);
                                A0O = 1BK.A0O(c6qj2, 0);
                                A0Q = 1BK.A0Q(A0O, n82);
                                n7b = new N7B(1, parseLong2, j5, c6qj2, A0Q, privacyContext2);
                                1Um.A02(A0O, n7b, A0Q, false);
                                c6w4.A02 = A0j;
                                1Kd.A0F(new ABj(c6w4, 12), A0j, executor);
                                return;
                            }
                            c6qj = c6w5.A00;
                            parseLong = Long.parseLong(4YU.A0y(threadKey2));
                            privacyContext = c6w5.A02;
                            N82 n822 = new N82(17, j5, A0j, c6w5);
                            A0O = 1BK.A0O(c6qj, 0);
                            A0Q = 1BK.A0Q(A0O, n822);
                            i = 3;
                            n7b = new N7B(i, parseLong, j5, c6qj, A0Q, privacyContext);
                            1Um.A02(A0O, n7b, A0Q, false);
                            c6w4.A02 = A0j;
                            1Kd.A0F(new ABj(c6w4, 12), A0j, executor);
                            return;
                        }
                        if (!A12) {
                            C6qj c6qj3 = c6w5.A00;
                            long parseLong3 = Long.parseLong(4YU.A0y(threadKey2));
                            PrivacyContext privacyContext3 = c6w5.A02;
                            N82 n823 = new N82(14, j5, A0j, c6w5);
                            A0O = 1BK.A0O(c6qj3, 0);
                            A0Q = 1BK.A0Q(A0O, n823);
                            n7b = new N7B(0, parseLong3, j5, c6qj3, A0Q, privacyContext3);
                            1Um.A02(A0O, n7b, A0Q, false);
                            c6w4.A02 = A0j;
                            1Kd.A0F(new ABj(c6w4, 12), A0j, executor);
                            return;
                        }
                        c6qj = c6w5.A00;
                        parseLong = Long.parseLong(4YU.A0y(threadKey2));
                        privacyContext = c6w5.A02;
                        N82 n824 = new N82(16, j5, A0j, c6w5);
                        A0O = 1BK.A0O(c6qj, 0);
                        A0Q = 1BK.A0Q(A0O, n824);
                        i = 2;
                        n7b = new N7B(i, parseLong, j5, c6qj, A0Q, privacyContext);
                        1Um.A02(A0O, n7b, A0Q, false);
                        c6w4.A02 = A0j;
                        1Kd.A0F(new ABj(c6w4, 12), A0j, executor);
                        return;
                    }
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                c6w4 = this.A01;
                r311 = this.A00;
                11T.A0F(r311, 0);
                c00i = c6w4.A05.A00;
                ((C6w8) c00i.get()).A02 = true;
                c6w8 = (C6w8) c00i.get();
                if (c6w8.A00) {
                    return;
                } else {
                    return;
                }
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
            C6w4 c6w42 = this.A01;
            C6w8 c6w82 = (C6w8) c6w42.A05.A00.get();
            c6w82.A02 = false;
            c6w82.A01 = false;
            c6w82.A00 = false;
            C5jn c5jn = ((C5jq) c6w42.A03.A00.get()).AgW(c6w42.A07).A02;
            C5o5 c5o5 = C5o5.A02;
            c5jn.A00(c5o5);
            ListenableFuture listenableFuture = c6w42.A02;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            c6w42.A00 = c5o5;
            C6va c6va2 = C6va.A06;
            c6w42.A01 = c6va2;
            c6w42.A09.A00(c6va2);
            return;
        }
        throw 4YV.A0f(str);
    }
}
