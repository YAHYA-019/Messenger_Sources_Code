package X;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Kvc.class */
public abstract class Kvc {
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v7 java.lang.String, still in use, count: 2, list:
          (r302v7 java.lang.String) from 0x008c: PHI (r302v8 java.lang.String) = (r302v7 java.lang.String) binds: [B:34:0x0105] A[DONT_GENERATE, DONT_INLINE]
          (r302v7 java.lang.String) from 0x0105: IF  (r302v7 java.lang.String) != (null java.lang.String)  -> B:24:0x008c A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.0w6, java.lang.Object] */
    public static final android.util.Pair A00(X.L36 r301) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kvc.A00(X.L36):android.util.Pair");
    }

    public static final void A01(Context context, L36 l36) {
        String str;
        String str2;
        11T.A0F(l36, 1);
        Pair A00 = A00(l36);
        if (AnonymousClass001.A1V(A00.first)) {
            HashMap A0u = AnonymousClass001.A0u();
            ArrayList A0s = AnonymousClass001.A0s();
            MKr mKr = l36.A00;
            String AX4 = mKr.AX4();
            if (AX4.length() > 0) {
                L52 l52 = new L52();
                String str3 = l36.A01.A04;
                StringBuilder sb = l52.A00;
                JR0.A1J(sb, AX4);
                JR0.A1I(sb, str3);
                L52.A00(l52, mKr.Aec());
                long AX5 = mKr.AX5();
                JR0.A1J(sb, "Max-Age");
                sb.append(AX5);
                str = AnonymousClass001.A0d(";", sb);
                11T.A0A(str);
            } else {
                str = "";
            }
            if (str.length() > 0) {
                A0s.add(str);
            }
            String AV3 = mKr.AV3();
            boolean z = false;
            boolean A1P = AnonymousClass001.A1P(AV3.length());
            String str4 = l36.A02.A02;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (A1P && (!z)) {
                L52 l522 = new L52();
                StringBuilder sb2 = l522.A00;
                JR0.A1J(sb2, AV3);
                JR0.A1I(sb2, str4);
                L52.A00(l522, mKr.Aec());
                str2 = 11T.A02(sb2);
            } else {
                str2 = "";
            }
            if (str2.length() > 0) {
                A0s.add(str2);
            }
            A0u.put(A00.second, A0s);
            LCd.A03("BwICookieWorks", "For url %s, setting bwi cookies- %s", DKG.A1b(A0u, A00.second));
            L9d.A02(context, A0u, true);
        }
    }
}
