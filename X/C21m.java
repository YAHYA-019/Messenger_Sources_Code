package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.21m, reason: invalid class name */
/* loaded from: 21m.class */
public abstract class C21m {
    public Integer A00 = 0S2.A00;

    public static final java.util.Map A01(C21m c21m) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c21m.A06().A02.iterator();
        while (it.hasNext()) {
            String str = ((FxCalAccount) it.next()).A04;
            Number number = (Number) linkedHashMap.get(str);
            1BK.A1P(str, linkedHashMap, (number != null ? number.intValue() : 0) + 1);
        }
        return 04R.A0D(linkedHashMap);
    }

    public static final void A02(C21m c21m) {
        if (System.currentTimeMillis() - c21m.A07().A00 > 86400000) {
            3zH.A00(c21m.A05(), "cache_eviction", c21m.A08(), (List) null, (java.util.Map) null);
            c21m.A0C();
        }
    }

    public double A03() {
        return -1.0d;
    }

    public int A04() {
        return 24;
    }

    public 3zH A05() {
        return (3zH) ((C21k) this).A02.A00.get();
    }

    public FxCalAccountLinkageInfo A06() {
        return ((C21k) this).A00;
    }

    public FxCalAccountLinkageInfoForSwitcher A07() {
        return ((C21k) this).A01;
    }

    public String A08() {
        return DKB.A00(457);
    }

    public LinkedHashMap A09() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [X.0ty] */
    public final List A0A(CallerContext callerContext, String str, Set set) {
        ArrayList arrayList;
        3zH A05 = A05();
        String str2 = callerContext.A03;
        11T.A0A(str2);
        3zH.A00(A05, "cache_access", str, (List) null, 04R.A05(new 03Y[]{new 03Y("caller_class", str2)}));
        if (A0K(callerContext, str)) {
            if (A0J()) {
                3zH.A00(A05(), "cache_eviction", A08(), (List) null, (java.util.Map) null);
                A0B();
            }
            A02(this);
            A0D();
            boolean A0L = A0L(callerContext, str);
            A0H(str, A01(this));
            A05().A06(str, A01(this), A09(), A03(), A0I(), A0J());
            List list = A06().A02;
            ArrayList<FxCalAccount> arrayList2 = new ArrayList();
            for (Object obj : list) {
                FxCalAccount fxCalAccount = (FxCalAccount) obj;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (0CV.A0a(AnonymousClass001.A0i(it), fxCalAccount.A04, true)) {
                            arrayList2.add(obj);
                            break;
                        }
                    }
                }
            }
            arrayList = new ArrayList(C1A3.A1D(arrayList2, 10));
            for (FxCalAccount fxCalAccount2 : arrayList2) {
                String str3 = fxCalAccount2.A03;
                if (A0L) {
                    str3 = "";
                }
                String str4 = fxCalAccount2.A05;
                if (A0L || str4 == null) {
                    str4 = "";
                }
                arrayList.add(new FxCalAccount(str3, str4, fxCalAccount2.A04, fxCalAccount2.A06, fxCalAccount2.A08, fxCalAccount2.A0A, fxCalAccount2.A07, fxCalAccount2.A09, fxCalAccount2.A00, fxCalAccount2.A02, fxCalAccount2.A01));
            }
        } else {
            3zH.A00(A05(), "access_control_failure", str, (List) null, 04R.A05(new 03Y[]{new 03Y("caller_class", str2)}));
            arrayList = C0ty.A00;
        }
        return arrayList;
    }

    public void A0B() {
        C21k c21k = (C21k) this;
        synchronized (c21k) {
            c21k.AFz();
        }
    }

    public void A0C() {
    }

    public final void A0D() {
        synchronized (this) {
            if (0S2.A00 != this.A00 || A06().A00 > 0) {
                this.A00 = A0J() ? 0S2.A0C : 0S2.A01;
            }
        }
    }

    public final void A0E(CallerContext callerContext, FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        11T.A0F(A06(), 0);
        synchronized (A06()) {
            A0G(fxCalAccountLinkageInfo);
        }
        A0F(fxCalAccountLinkageInfo);
        A0D();
        3zH A05 = A05();
        String str = callerContext.A03;
        11T.A0A(str);
        3zH.A00(A05, "cache_write", "", (List) null, 04R.A05(new 03Y[]{new 03Y("caller_class", str)}));
    }

    public void A0F(FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        synchronized (this) {
        }
    }

    public void A0G(FxCalAccountLinkageInfo fxCalAccountLinkageInfo) {
        ((C21k) this).A00 = fxCalAccountLinkageInfo;
    }

    public void A0H(String str, java.util.Map map) {
    }

    public boolean A0I() {
        return false;
    }

    public final boolean A0J() {
        boolean z = false;
        if (System.currentTimeMillis() - A06().A00 > ((A0I() && A06().A01 == 0S2.A0N) ? A04() * 60 * 60 * 1000 : 86400000L)) {
            z = true;
        }
        return z;
    }

    public boolean A0K(CallerContext callerContext, String str) {
        C21k c21k = (C21k) this;
        F2l f2l = (F2l) 1Bn.A0A(100273);
        C00i c00i = c21k.A04.A00;
        if (((2yD) c00i.get()).AZk(18302320232573393L)) {
            return 1Wg.A0G(0S2.A01, str, callerContext.A03, f2l);
        }
        String BCy = ((2yD) c00i.get()).BCy(18865270185788335L);
        11T.A0A(BCy);
        String str2 = callerContext.A03;
        11T.A0A(str2);
        Integer num = 0S2.A01;
        boolean AZk = ((2yD) c21k.A05.A00.get()).AZk(36324286473981518L);
        11T.A0F(f2l, 5);
        return EZK.A00(num, BCy, str2, str, f2l, AZk);
    }

    public boolean A0L(CallerContext callerContext, String str) {
        String BCy = ((2yD) ((C21k) this).A04.A00.get()).BCy(18865270185788335L);
        11T.A0A(BCy);
        String str2 = callerContext.A03;
        11T.A0A(str2);
        return F2m.A01(0S2.A01, BCy, str2, str);
    }
}
