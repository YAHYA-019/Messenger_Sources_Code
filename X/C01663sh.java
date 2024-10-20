package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;
import com.google.common.collect.SingletonImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3sh.class */
public final class C01663sh {
    public long A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final HashMap A04;
    public final CopyOnWriteArrayList A05;
    public final C00i A06;
    public final C00i A07 = new 1BQ(98605);
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final InterfaceC01693sk A0C;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.3sx] */
    public C01663sh() {
        Object obj = new Object();
        final InterfaceC01713sm interfaceC01713sm = new InterfaceC01713sm() { // from class: X.3sl
        };
        InterfaceC01693sk interfaceC01693sk = AbstractC01723sn.A00;
        final ?? r0 = new Object() { // from class: X.3sx
        };
        this.A0C = new C3sw(new InterfaceC01783sv() { // from class: X.3t0
            @Override // X.InterfaceC01783sv
            public Object D4r(Object[] objArr) {
                F6v f6v = (F6v) objArr[0];
                ETV etv = (ETV) objArr[1];
                if (etv == null || f6v == null || System.currentTimeMillis() - (f6v.A03 * 1000) >= etv.A01) {
                    return null;
                }
                return etv;
            }
        }, new InterfaceC01693sk[]{interfaceC01693sk, obj});
        this.A06 = new 1BQ(98604);
        1BQ r02 = new 1BQ(16650);
        this.A0B = r02;
        this.A01 = new 1BQ(98676);
        this.A05 = new CopyOnWriteArrayList();
        this.A04 = new HashMap();
        this.A02 = new 1BQ(67660);
        this.A03 = new 1BQ(49165);
        this.A08 = new 1BQ(49257);
        this.A09 = new 1BQ(49726);
        this.A0A = new 1BQ(67586);
        this.A00 = 0L;
        ((ZeroSDKServiceProvider) r02.get()).A07.A01.A00(new C3t6(C01853t4.A00, new InterfaceC01833t2() { // from class: X.3t1
            @Override // X.InterfaceC01833t2
            public void CN8() {
                C01663sh c01663sh = C01663sh.this;
                if (!c01663sh.A0G() || C01663sh.A01(c01663sh).A05 <= c01663sh.A00) {
                    return;
                }
                c01663sh.A00 = C01663sh.A01(c01663sh).A05;
                Iterator it = c01663sh.A05.iterator();
                while (it.hasNext()) {
                    ((Bzy) it.next()).A00();
                }
            }
        }));
    }

    public static 3oH A00(C01663sh c01663sh) {
        3oH r0 = ((ZeroSDKServiceProvider) c01663sh.A0B.get()).A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0T("Headers component enabled but store is null");
    }

    public static F6v A01(C01663sh c01663sh) {
        return ((Eqk) A00(c01663sh).getState()).A02;
    }

    public static ETU A02(C01663sh c01663sh) {
        if (!c01663sh.A0G()) {
            return null;
        }
        return (ETU) AbstractC01723sn.A03.get(A00(c01663sh).getState());
    }

    public static void A03(FbUserSession fbUserSession, C01663sh c01663sh) {
        c01663sh.A09.get();
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) ((5SM) ((5SL) 1Lo.A06(fbUserSession, 49727)).A02.get()).A01.get();
        1G9 r0 = 5SM.A02;
        fbSharedPreferences.AFq(new SingletonImmutableSet(1G9.A03(r0, r0)));
    }

    public static void A04(C01663sh c01663sh, int i) {
        boolean z;
        if (c01663sh.A0G()) {
            z = A01(c01663sh).A0O;
        } else {
            4Yv r0 = ((4Yr) c01663sh.A01.get()).A01.A01;
            synchronized (r0) {
                z = r0.A0I;
            }
        }
        if (z) {
            int A05 = c01663sh.A05();
            ETV A07 = c01663sh.A07(1Fw.A00(), "headwind_user_signal");
            if (A07 != null) {
                String str = A07.A02;
                if (EYA.A00(str)) {
                    return;
                }
                C4Us c4Us = (C4Us) c01663sh.A0A.get();
                String valueOf = String.valueOf(A05);
                long A08 = 1BL.A08(c4Us.A00);
                2R2 r02 = new 2R2(1BK.A08(1BK.A07(((Eww) c4Us.A02.get()).A00), "fos_headwind_user_signal"), ActionId.APP_FIRST_VIEW_CONTROLLER);
                if (((0D7) r02).A00.isSampled()) {
                    r02.A0E("timestamp", String.valueOf(A08));
                    r02.A0E("carrier_id", valueOf);
                    r02.A09(i != 1 ? i != 2 ? C4Rd.TRANSPARENCY_OPT_OUT_ACTION : C4Rd.FOS_TOS_ACTION : C4Rd.TRANSPARENCY_ACTION, "signal_type");
                    r02.A0E("encrypted_payload", str);
                    r02.BZL();
                }
                1G3 A0D = C4Us.A03.A0D(0Pz.A0W(valueOf, "/")).A0D(0Pz.A0D(i, "/"));
                C00i c00i = c4Us.A01;
                1Ql A0V = 1BL.A0V(c00i);
                A0V.CaL(A0D.A0D("encrypted"), str);
                A0V.commitImmediately();
                1Ql A0V2 = 1BL.A0V(c00i);
                A0V2.CaH(A0D.A0D("timestamp"), A08);
                A0V2.commitImmediately();
            }
        }
    }

    public int A05() {
        return !A0G() ? ((4Yr) this.A01.get()).A00() : A01(this).A00;
    }

    public int A06() {
        int i;
        if (A0G()) {
            return A01(this).A01;
        }
        4Yv r0 = ((4Yr) this.A01.get()).A01.A01;
        synchronized (r0) {
            i = r0.A01;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, X.ETV] */
    public ETV A07(FbUserSession fbUserSession, String str) {
        String str2;
        4Yu A00;
        if (A0G()) {
            String str3 = (String) AbstractC01723sn.A02.get(A00(this).getState());
            if (str3 == null) {
                this.A06.get();
                F6v f6v = ((Eqk) A00(this).getState()).A02;
                if (f6v == null || (str2 = f6v.A0J) == null) {
                    return null;
                }
                return (ETV) new HashMap(f6v.A08.A00).get(str2);
            }
            this.A09.get();
            A00 = ((5SL) 1Lo.A06(fbUserSession, 49727)).A00(str3, str, (List) null);
        } else {
            4Yt r0 = ((4Yr) this.A01.get()).A01;
            4Yv r02 = r0.A01;
            synchronized (r02) {
                String str4 = r02.A09;
                A00 = str4 != null ? r0.A04.A00(str4, str, r02.A0D) : 4Yt.A00(r0, r02.A0C);
            }
            4Yt.A01(A00, r0, "account_access", str);
        }
        if (A00 == null) {
            return null;
        }
        long j = A00.A01;
        String str5 = A00.A02;
        String str6 = A00.A03;
        int i = A00.A00;
        ?? obj = new Object();
        ((ETV) obj).A01 = j;
        ((ETV) obj).A02 = str5;
        ((ETV) obj).A03 = str6;
        ((ETV) obj).A00 = i;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, X.ETV] */
    public ETV A08(FbUserSession fbUserSession, String str) {
        4Yu A00;
        if (A0G()) {
            String str2 = (String) AbstractC01723sn.A02.get(A00(this).getState());
            if (str2 == null) {
                return (ETV) (1BK.A0N(((C08554nH) this.A08.get()).A01).AZk(36322572782225058L) ? this.A0C : (InterfaceC01693sk) this.A07.get()).get(A00(this).getState());
            }
            this.A09.get();
            A00 = ((5SL) 1Lo.A06(fbUserSession, 49727)).A00(str2, str, (List) null);
        } else {
            4Yt r0 = ((4Yr) this.A01.get()).A01;
            4Yv r02 = r0.A01;
            synchronized (r02) {
                String str3 = r02.A09;
                A00 = str3 != null ? r0.A04.A00(str3, str, r02.A0D) : 4Yt.A00(r0, r02.A0B);
            }
            4Yt.A01(A00, r0, "fos", str);
        }
        if (A00 == null) {
            return null;
        }
        long j = A00.A01;
        String str4 = A00.A02;
        String str5 = A00.A03;
        int i = A00.A00;
        ?? obj = new Object();
        ((ETV) obj).A01 = j;
        ((ETV) obj).A02 = str4;
        ((ETV) obj).A03 = str5;
        ((ETV) obj).A00 = i;
        return obj;
    }

    public String A09() {
        String str;
        if (A0G()) {
            return A01(this).A0B;
        }
        4Yv r0 = ((4Yr) this.A01.get()).A01.A01;
        synchronized (r0) {
            str = r0.A07;
        }
        return str;
    }

    public String A0A() {
        return !A0G() ? ((4Yr) this.A01.get()).A01() : A01(this).A0H;
    }

    public void A0B(FbUserSession fbUserSession, String str) {
        Integer num;
        C00i c00i = this.A01;
        4Yt r0 = ((4Yr) c00i.get()).A01;
        4Yv r02 = r0.A01;
        synchronized (r02) {
            r02.A0E = AnonymousClass001.A0u();
            r02.A08 = "";
            4Yt.A02(r0);
            4Yo r03 = r0.A02.A00;
            num = 0S2.A0D;
            r03.A02("", num, str);
        }
        4Yt r04 = ((4Yr) c00i.get()).A01;
        4Yv r05 = r04.A01;
        synchronized (r05) {
            r05.A04 = 0L;
            4Ys r06 = r04.A02;
            r06.A00.A02("", num, 0Pz.A0W("jio:", str));
        }
        A03(fbUserSession, this);
        A00(this).ANn(new Object());
    }

    public void A0C(Bzy bzy) {
        synchronized (this) {
            HashMap hashMap = this.A04;
            Bo4 bo4 = (Bo4) hashMap.get(bzy);
            if (bo4 != null) {
                HashSet hashSet = ((4Yr) this.A01.get()).A00.A09;
                synchronized (hashSet) {
                    hashSet.remove(bo4);
                }
                hashMap.remove(bzy);
            }
            this.A05.remove(bzy);
        }
    }

    public void A0D(String str) {
        if (A0G()) {
            A00(this).ANn(new EDy(str, true, (String) null));
        } else {
            ((4Yr) this.A01.get()).A00.A06(str);
        }
    }

    public void A0E(String str) {
        boolean z;
        if (A0G()) {
            A00(this).ANn(new EDy(str, false, (String) null));
            return;
        }
        4Yx r0 = ((4Yr) this.A01.get()).A00;
        String obj = C04I.A00().toString();
        1Ql edit = ((FbSharedPreferences) r0.A07.get()).edit();
        edit.CaL(4Z1.A00, obj);
        edit.commit();
        4Ys r02 = r0.A03;
        r02.A03(str, obj);
        4Ym r03 = r0.A05;
        if (C0et.A0P == r03.A00 && ((2yD) r03.A06.get()).AZk(18300400381731055L)) {
            r02.A00.A02(obj, 0S2.A01, "disabled");
            4Yn r04 = r02.A01;
            r04.A03("headers_disabled");
            r04.A00();
            4Yx.A03(r0);
            return;
        }
        synchronized (r0.A08) {
            if (4Yx.A05(r0)) {
                r02.A00.A02(obj, 0S2.A01, "already_running");
                r02.A01.A03("already_running");
            } else {
                4Yt r05 = r0.A02;
                4Yv r06 = r05.A01;
                synchronized (r06) {
                    long j = r06.A0J ? r06.A03 : r06.A02;
                    long j2 = r06.A05;
                    if (j == 0 || j2 == 0) {
                        z = false;
                    } else {
                        z = false;
                        if (r05.A00.now() - j2 < j * 1000) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    r02.A00.A02(obj, 0S2.A01, "data_still_fresh");
                    4Yn r07 = r02.A01;
                    r07.A03("headers_data_fresh");
                    r07.A01();
                    4Yx.A02(r0);
                    4Yx.A03(r0);
                } else {
                    4Yx.A04(r0, str, obj);
                }
            }
        }
    }

    public boolean A0F() {
        boolean z;
        if (A0G()) {
            return A01(this).A0L;
        }
        4Yv r0 = ((4Yr) this.A01.get()).A01.A01;
        synchronized (r0) {
            z = r0.A0G;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (((X.Eqk) r0.getState()).A06 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A0B
            java.lang.Object r0 = r0.get()
            com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider r0 = (com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider) r0
            X.3oH r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r302
            java.lang.Object r0 = r0.getState()
            X.Eqk r0 = (X.Eqk) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A06
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01663sh.A0G():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0.A01.isEmpty() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0H() {
        /*
            r301 = this;
            r0 = r301
            X.ETU r0 = A02(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r302
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
            r0 = r302
            java.lang.String r0 = r0.A01
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L28
        L24:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01663sh.A0H():boolean");
    }
}
