package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: L94.class */
public abstract class L94 {
    public static final java.util.Map A09 = 1BK.A1C();
    public int A00;
    public C3047JhG A01;
    public String A02;
    public String A03;
    public CharSequence A05;
    public final String A07;
    public final List A08 = AnonymousClass001.A0s();
    public final 0AE A06 = new 0AE();
    public java.util.Map A04 = 1BK.A1C();

    public L94(KTb kTb) {
        this.A07 = L2u.A01.A00(kTb.getClass());
    }

    public static final List A00(java.util.Map map, Function1 function1) {
        11T.A0F(map, 0);
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            KtP ktP = (KtP) A0z.getValue();
            if (ktP != null && !ktP.A03 && !ktP.A02) {
                1BL.A1O(A1C, A0z);
            }
        }
        Set keySet = A1C.keySet();
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : keySet) {
            if (7zR.A1a(obj, function1)) {
                A0s.add(obj);
            }
        }
        return A0s;
    }

    public final Bundle A01(Bundle bundle) {
        Bundle A05;
        boolean z;
        if (bundle == null && this.A04.isEmpty()) {
            A05 = null;
        } else {
            A05 = 1BK.A05();
            java.util.Map map = this.A04;
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String A0j = AnonymousClass001.A0j(A0z);
                KtP ktP = (KtP) A0z.getValue();
                11T.A0F(A0j, 0);
                if (ktP.A02) {
                    ktP.A00.A03(A05, ktP.A01, A0j);
                }
            }
            if (bundle != null) {
                A05.putAll(bundle);
                Iterator A0y2 = AnonymousClass001.A0y(map);
                while (A0y2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                    String A0j2 = AnonymousClass001.A0j(A0z2);
                    KtP ktP2 = (KtP) A0z2.getValue();
                    11T.A0F(A0j2, 0);
                    if (!ktP2.A03 && A05.containsKey(A0j2) && A05.get(A0j2) == null) {
                        z = false;
                    } else {
                        try {
                            ktP2.A00.A00(A05, A0j2);
                            z = true;
                        } catch (ClassCastException unused) {
                            z = false;
                        }
                    }
                    if (!z) {
                        throw AnonymousClass001.A0L(0Pz.A0z("Wrong argument type for '", A0j2, "' in argument bundle. ", ktP2.A00.A02(), " expected."));
                    }
                }
            }
        }
        return A05;
    }

    public final KtA A02() {
        KtA ktA;
        0AE r0 = this.A06;
        if (!AnonymousClass001.A1O(r0.A00()) && (ktA = (KtA) C0Ak.A00(r0, 2131364133)) != null) {
            return ktA;
        }
        C3047JhG c3047JhG = this.A01;
        if (c3047JhG != null) {
            return c3047JhG.A02();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x044b, code lost:
    
        if (X.1BK.A1Y(A00(r0, new X.M6z(r314, 1))) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        if (r0.equals(r0.A04) == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Lio A03(X.Kpg r302) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L94.A03(X.Kpg):X.Lio");
    }

    public void A04(Context context, AttributeSet attributeSet) {
        Object obj;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, Kcz.A04);
        11T.A0A(obtainAttributes);
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.A00 = 0;
            this.A02 = null;
        } else {
            if (!7zL.A1V(string)) {
                throw AnonymousClass001.A0L("Cannot have an empty route");
            }
            String A0W = 0Pz.A0W("android-app://androidx.navigation/", string);
            this.A00 = A0W.hashCode();
            this.A02 = null;
            A05(new LCH(A0W, (String) null, (String) null));
        }
        List list = this.A08;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((LCH) obj).A06;
            String str2 = this.A03;
            if (11T.A0O(str, str2 != null ? 0Pz.A0W("android-app://androidx.navigation/", str2) : "")) {
                break;
            }
        }
        C0B7.A00(list).remove(obj);
        this.A03 = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.A00 = resourceId;
            this.A02 = null;
            this.A02 = KVL.A00(context, resourceId);
        }
        this.A05 = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public final void A05(LCH lch) {
        List A00 = A00(this.A04, new M6z(lch, 2));
        if (A00.isEmpty()) {
            this.A08.add(lch);
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Deep link ");
        A0k.append(lch.A06);
        A0k.append(" can't be used to open destination ");
        A0k.append(this);
        throw AnonymousClass002.A0C(A00, ".\nFollowing required arguments are missing: ", A0k);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L94.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Set<String> keySet;
        int A06 = (this.A00 * 31) + 1BL.A06(this.A03);
        for (LCH lch : this.A08) {
            A06 = (((((A06 * 31) + 1BL.A06(lch.A06)) * 31) + 1BL.A06(lch.A04)) * 31) + 1BL.A06(lch.A05);
        }
        0AE r0 = this.A06;
        11T.A0F(r0, 0);
        C0nh c0nh = new C0nh(r0);
        while (c0nh.hasNext()) {
            KtA ktA = (KtA) c0nh.next();
            A06 = (((A06 * 31) + ktA.A02) * 31) + AnonymousClass002.A04(ktA.A01);
            Bundle bundle = ktA.A00;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Iterator<String> it = keySet.iterator();
                while (it.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it);
                    Bundle bundle2 = ktA.A00;
                    11T.A0D(bundle2);
                    A06 = (A06 * 31) + AnonymousClass002.A04(bundle2.get(A0i));
                }
            }
        }
        java.util.Map map = this.A04;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(A1B);
            A06 = AnonymousClass002.A07(A0i2, A06 * 31) + AnonymousClass002.A04(map.get(A0i2));
        }
        return A06;
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("(");
        String str = this.A02;
        if (str == null) {
            A10.append("0x");
            str = Integer.toHexString(this.A00);
        }
        A10.append(str);
        A10.append(")");
        String str2 = this.A03;
        if (str2 != null && !0CU.A0O(str2)) {
            A10.append(" route=");
            A10.append(this.A03);
        }
        CharSequence charSequence = this.A05;
        if (charSequence != null) {
            A10.append(" label=");
            A10.append(charSequence);
        }
        return 11T.A02(A10);
    }
}
