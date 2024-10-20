package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.common.memory.frameworkoemleakfix.di.FrameworkOemLeakFixHelper;
import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1pt, reason: invalid class name */
/* loaded from: 1pt.class */
public final class C1pt implements C1pu, C1pv, C1pw {
    public 3NY A00;
    public C1pz A01;
    public java.util.Map A02;
    public Set A03;
    public C5fj A04;
    public C1q1 A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v2 ??, still in use, count: 2, list:
          (r313v2 ??) from 0x01c2: PHI (r313v3 ??) = (r313v0 ??), (r313v1 ??), (r313v2 ??), (r313v5 ??) binds: [B:109:0x0378, B:108:0x0370, B:107:0x01c2, B:25:0x01bd] A[DONT_GENERATE, DONT_INLINE]
          (r313v2 ?? I:java.util.AbstractCollection) from 0x0369: INVOKE (r313v2 ?? I:java.util.AbstractCollection), (r0v124 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Error | Exception -> 0x0378, Error | Exception -> 0x0378, MD:(E):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public C1pt() {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1pt.<init>():void");
    }

    public C1pt(int i) {
        this.A03 = new HashSet();
    }

    private C5fj A00() {
        C5fj c5fj;
        synchronized (this) {
            if (C01083pw.A0a != null && this.A04 == null && C01083pw.A00().A01() != null) {
                C5fj A01 = C01083pw.A00().A01();
                this.A04 = A01;
                int Auy = (int) ((2yD) ((C1py) ((C1px) this.A06.get()).A0A.get()).A00.get()).Auy(36595745587989264L);
                if (Auy > 1) {
                    A01.A00 = Auy;
                } else {
                    A01.A00 = 1;
                }
            }
            c5fj = this.A04;
        }
        return c5fj;
    }

    private String A01(Object obj) {
        String str;
        synchronized (this) {
            str = "unknown";
            if (obj != null) {
                java.util.Map map = this.A02;
                if (map != null && map.containsKey(obj)) {
                    str = (String) map.get(obj);
                    map.remove(obj);
                }
            }
        }
        return str;
    }

    public static void A02(Activity activity, C1pt c1pt) {
        C1pz c1pz;
        String name = activity.getClass().getName();
        0fH.A07(C1pt.class, name, "%s onDestroy!");
        C00i c00i = ((FrameworkOemLeakFixHelper) c1pt.A08.get()).A01.A00;
        if (((2yD) c00i.get()).AZk(36320957874323313L)) {
            C54s.A01.A00(activity);
        }
        ((2yD) c00i.get()).AZk(36320957874388850L);
        WeakHashMap weakHashMap = new WeakHashMap();
        C00i c00i2 = c1pt.A06;
        if (((C1px) c00i2.get()).A04()) {
            weakHashMap.put(ErrorReportingConstants.ENDPOINT, c1pt.A01(activity));
        }
        weakHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "activity");
        if (A07(c1pt) && (c1pz = c1pt.A01) != null) {
            C1pz.A00(c1pz, activity, weakHashMap);
        }
        if (!((C1px) c00i2.get()).A02() || c1pt.A00() == null) {
            return;
        }
        C5fj A00 = c1pt.A00();
        if (C5fj.A02.nextInt(A00.A00) == 0) {
            C5fj.A00(A00, name, "activity", weakHashMap, false);
        }
    }

    public static void A03(Activity activity, C1pt c1pt) {
        if (((C1px) c1pt.A06.get()).A04()) {
            synchronized (c1pt) {
                java.util.Map map = c1pt.A02;
                if (map != null) {
                    map.put(activity, C0ft.A01());
                }
            }
        }
    }

    public static void A04(Fragment fragment, C1pt c1pt) {
        C1pz c1pz;
        0fH.A07(C1pt.class, fragment, "onDestroy fragment %s");
        WeakHashMap weakHashMap = new WeakHashMap();
        C00i c00i = c1pt.A06;
        if (((C1px) c00i.get()).A04()) {
            weakHashMap.put(ErrorReportingConstants.ENDPOINT, c1pt.A01(fragment));
        }
        weakHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "fragment");
        if (A07(c1pt) && (c1pz = c1pt.A01) != null) {
            C1pz.A00(c1pz, fragment, weakHashMap);
        }
        if (!((C1px) c00i.get()).A02() || c1pt.A00() == null) {
            return;
        }
        C5fj A00 = c1pt.A00();
        if (C5fj.A02.nextInt(A00.A00) == 0) {
            C5fj.A00(A00, fragment.getClass().getName(), "fragment", weakHashMap, false);
        }
    }

    public static void A05(Fragment fragment, C1pt c1pt) {
        if (((C1px) c1pt.A06.get()).A04()) {
            synchronized (c1pt) {
                java.util.Map map = c1pt.A02;
                if (map != null) {
                    map.put(fragment, C0ft.A01());
                }
            }
        }
    }

    public static void A06(Fragment fragment, C1pt c1pt) {
        if (A07(c1pt)) {
            if (fragment instanceof 1pK) {
                ((1pK) fragment).A1T(c1pt);
            } else {
                if (!(fragment instanceof 2Ov)) {
                    0fH.A0S(C1pt.class, "Fragment %s is not a tracked. Please check its type", new Object[]{fragment});
                    return;
                }
                ((2Ov) fragment).A19(c1pt);
            }
            0fH.A07(C1pt.class, fragment, "Attached to fragment %s");
        }
    }

    public static boolean A07(C1pt c1pt) {
        return ((C1px) c1pt.A06.get()).A05();
    }

    public void A08(Object obj, String str) {
        synchronized (this) {
            if (A07(this)) {
                C1pz c1pz = this.A01;
                if (c1pz != null) {
                    0fH.A07(C1pt.class, obj, "trackObject Object %s");
                    C1pz.A00(c1pz, obj, Collections.singletonMap(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str));
                }
            }
        }
    }

    @Override // X.C1pu
    public void Bhs(Intent intent, Fragment fragment, int i, int i2) {
    }

    @Override // X.C1pu
    public void BiD(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiF(Context context, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiN(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiO(Fragment fragment, boolean z) {
    }

    @Override // X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void Bic(Fragment fragment) {
    }

    @Override // X.C1pu
    public void Bjc(Fragment fragment, Fragment fragment2) {
        if (((C1px) this.A06.get()).A01()) {
            return;
        }
        A06(fragment2, this);
    }

    @Override // X.C1pu
    public void Bl8(Fragment fragment) {
    }

    @Override // X.C1pu
    public void BlB(Bundle bundle) {
    }

    @Override // X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        if (((C1px) this.A06.get()).A01()) {
            return;
        }
        A04(fragment, this);
    }

    @Override // X.C1pw
    public void C3R(Collection collection) {
        C1q1 c1q1;
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = this.A03.iterator();
        if (it.hasNext()) {
            it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                Object obj = ((Reference) it2.next()).get();
                if (obj != null) {
                    obj.toString();
                }
            }
            throw AnonymousClass001.A0Q("handleLeak");
        }
        C00i c00i = this.A06;
        if (((C1px) c00i.get()).A03()) {
            C3R1 c3r1 = (C3R1) this.A09.get();
            if (!c3r1.A03.get()) {
                c3r1.mReferenceHolder.addAll(collection);
                c3r1.mLeakTypeMap.clear();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    Reference reference = (Reference) it3.next();
                    Object obj2 = reference.get();
                    if (obj2 != null && (reference instanceof KeyedWeakReference)) {
                        c3r1.mLeakTypeMap.put(AnonymousClass001.A0Y(obj2), Collections.unmodifiableMap(((KeyedWeakReference) reference).mMetadata).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                    }
                }
                c3r1.A00 = true;
            }
        }
        ((C3R1) this.A09.get()).A00();
        3NY r0 = this.A00;
        if (r0 != null) {
            c00i.get();
            if (C1px.A00()) {
                r0.A00(collection);
            }
        }
        if (((C1px) c00i.get()).A06() && (c1q1 = this.A05) != null) {
            c1q1.C3Q(collection);
        }
        if (!((C1px) c00i.get()).A02() || A00() == null) {
            return;
        }
        A00().C3Q(collection);
    }

    @Override // X.C1pw
    public void C9V() {
        3NY r0 = this.A00;
        if (r0 != null) {
            this.A06.get();
            if (C1px.A00()) {
                r0.A00(Collections.emptyList());
            }
        }
    }

    @Override // X.C1pu
    public void CAx(Fragment fragment) {
    }

    @Override // X.C1pu
    public void CHq(Fragment fragment) {
        if (((C1px) this.A06.get()).A01()) {
            return;
        }
        A05(fragment, this);
    }

    @Override // X.C1pu
    public void CIe(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void CL1(Fragment fragment, boolean z, boolean z2) {
    }

    @Override // X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
    }
}
