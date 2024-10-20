package X;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: Fr8.class */
public final class Fr8 implements 29I {
    public static final GH0 A02 = Fwb.A00;
    public final FyG A00;
    public final DLQ A01;

    public Fr8(FyG fyG, DLQ dlq) {
        this.A00 = fyG;
        this.A01 = dlq;
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, X.F8i] */
    /* JADX WARN: Type inference failed for: r0v218, types: [java.lang.Object, X.F8i] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, X.F8i] */
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        List list = (List) obj2;
        11T.A0F(context, 0);
        1BL.A1F(obj, list);
        ThreadLocal threadLocal = EbC.A01;
        if (threadLocal.get() == null) {
            throw 1BK.A0h();
        }
        FyG fyG = this.A00;
        DLQ dlq = this.A01;
        Object A05 = fyG.A05(dlq, A02, 2131362435);
        11T.A0A(A05);
        Ege ege = (Ege) A05;
        long A00 = EYp.A00(getClass(), dlq.A04);
        long[] jArr = ege.A00;
        FHF fhf = (FHF) threadLocal.get();
        if (fhf == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DLQ A0s = DKC.A0s(it);
                long j = (A0s.A04 << 27) | 8070450532247928832L;
                if (jArr == null || EYo.A00(j)) {
                    FHF fhf2 = (FHF) threadLocal.get();
                    if (fhf2 == null) {
                        11T.A0B(F3d.A00);
                        try {
                            DKH.A1S(0Pz.A0T("bindExtension: ", A0s.A05));
                            FGp.A00().A09.A04(fyG, A0s, dlq, obj);
                        } finally {
                        }
                    } else {
                        ?? obj4 = new Object();
                        Object obj5 = FHF.A02()[1];
                        FHF.A01((Object) obj4, 1);
                        Object obj6 = obj5;
                        if (!(obj5 instanceof F8i)) {
                            obj6 = null;
                        }
                        try {
                            F8i f8i = (F8i) obj6;
                            11T.A0B(F3d.A00);
                            try {
                                DKH.A1S(0Pz.A0T("bindExtension: ", A0s.A05));
                                FGp.A00().A09.A04(fyG, A0s, dlq, obj);
                                if (!obj4.A02() && f8i != null) {
                                    f8i.A01(j);
                                }
                                FHF.A01(obj5, 1);
                                if (!obj4.A02()) {
                                    fhf2.A03.A01(new Ems(null, null, F8i.A00(obj4)), j, false);
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            FHF.A01(obj5, 1);
                            throw th;
                        }
                    }
                } else if (02L.A0E(jArr, j)) {
                    Object obj7 = FHF.A02()[1];
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    F8i f8i2 = (F8i) obj7;
                    if (f8i2 != null) {
                        f8i2.A01(j);
                    }
                }
            }
        } else {
            ?? obj8 = new Object();
            Object obj9 = FHF.A02()[1];
            FHF.A01((Object) obj8, 1);
            Object obj10 = obj9;
            if (!(obj9 instanceof F8i)) {
                obj10 = null;
            }
            try {
                F8i f8i3 = (F8i) obj10;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    DLQ A0s2 = DKC.A0s(it2);
                    long j2 = (A0s2.A04 << 27) | 8070450532247928832L;
                    if (jArr == null || EYo.A00(j2)) {
                        FHF fhf3 = (FHF) threadLocal.get();
                        if (fhf3 == null) {
                            11T.A0B(F3d.A00);
                            try {
                                DKH.A1S(0Pz.A0T("bindExtension: ", A0s2.A05));
                                FGp.A00().A09.A04(fyG, A0s2, dlq, obj);
                            } catch (Throwable th2) {
                                th = th2;
                                DKE.A1B();
                                throw th;
                            }
                        } else {
                            ?? obj11 = new Object();
                            Object obj12 = FHF.A02()[1];
                            FHF.A01((Object) obj11, 1);
                            Object obj13 = obj12;
                            if (!(obj12 instanceof F8i)) {
                                obj13 = null;
                            }
                            try {
                                F8i f8i4 = (F8i) obj13;
                                11T.A0B(F3d.A00);
                                try {
                                    DKH.A1S(0Pz.A0T("bindExtension: ", A0s2.A05));
                                    FGp.A00().A09.A04(fyG, A0s2, dlq, obj);
                                    if (!obj11.A02() && f8i4 != null) {
                                        f8i4.A01(j2);
                                    }
                                    FHF.A01(obj12, 1);
                                    if (!obj11.A02()) {
                                        Ewt ewt = fhf3.A03;
                                        LinkedHashSet linkedHashSet = obj11.A00;
                                        ewt.A01(new Ems(null, null, linkedHashSet != null ? 0QD.A0o(linkedHashSet) : null), j2, false);
                                    }
                                } finally {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                FHF.A01(obj12, 1);
                                throw th;
                            }
                        }
                    } else if (02L.A0E(jArr, j2)) {
                        Object obj14 = FHF.A02()[1];
                        if (obj14 == null) {
                            obj14 = null;
                        }
                        F8i f8i5 = (F8i) obj14;
                        if (f8i5 != null) {
                            f8i5.A01(j2);
                        }
                    }
                }
                if (!obj8.A02() && f8i3 != null) {
                    f8i3.A01(A00);
                }
                FHF.A01(obj9, 1);
                if (!obj8.A02()) {
                    fhf.A03.A01(new Ems(null, null, F8i.A00(obj8)), A00, false);
                    ege.A00 = null;
                    return null;
                }
            } catch (Throwable th4) {
                FHF.A01(obj9, 1);
                throw th4;
            }
        }
        ege.A00 = null;
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        Ems A00;
        FHF A0i = DKD.A0i();
        if (A0i == null) {
            throw 1BK.A0h();
        }
        DLQ dlq = this.A01;
        long A002 = EYp.A00(getClass(), dlq.A04);
        Ewt ewt = A0i.A04;
        if (ewt == null || (A00 = ewt.A00(A002)) == null) {
            return false;
        }
        boolean A003 = EYo.A00(A002);
        if (A003) {
            Object A05 = this.A00.A05(dlq, A02, 2131362435);
            11T.A0A(A05);
            ((Ege) A05).A00 = A00.A02;
            return A003;
        }
        Object obj5 = FHF.A02()[1];
        if (obj5 == null) {
            obj5 = null;
        }
        F8i f8i = (F8i) obj5;
        if (f8i != null) {
            f8i.A01(A002);
        }
        return A003;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj2;
        1BL.A1F(obj, list);
        FyG fyG = this.A00;
        DLQ dlq = this.A01;
        Object A05 = fyG.A05(dlq, A02, 2131362435);
        11T.A0A(A05);
        long[] jArr = ((Ege) A05).A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DLQ A0s = DKC.A0s(it);
            long j = (A0s.A04 << 27) | 8070450532247928832L;
            if (jArr == null || (02L.A0E(jArr, j) && EYo.A00(j))) {
                11T.A0B(F3d.A00);
                try {
                    DKH.A1S(0Pz.A0T("unbindExtension: ", A0s.A05));
                    FGp.A00().A09.A05(fyG, A0s, dlq, obj);
                    DKE.A1B();
                } catch (Throwable th) {
                    DKE.A1B();
                    throw th;
                }
            }
        }
    }
}
