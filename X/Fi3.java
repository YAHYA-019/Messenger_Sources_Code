package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: Fi3.class */
public final class Fi3 implements 1Ro {
    public static final String __redex_internal_original_name = "BugReportUploadMethod";
    public 1BY A00;
    public final C03z A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05 = 1BQ.A02(16504);
    public final C00i A06 = 1BQ.A00();
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final Context A0C;

    public Fi3(1BO r302) {
        Context A04 = AbF.A04((1BY) null);
        this.A0C = A04;
        this.A09 = AbF.A0Q(A04, 100178);
        this.A04 = 1BV.A01((1BY) null, 100164);
        this.A08 = 1BV.A01((1BY) null, 100206);
        this.A0B = 1BQ.A02(65755);
        this.A0A = AbH.A0T();
        this.A03 = 1BQ.A02(16617);
        this.A02 = FbInjector.A00;
        this.A07 = 1BQ.A02(66062);
        this.A00 = 7zL.A0Q(r302);
        this.A01 = C03z.A00();
    }

    public static final List A00(String str, String str2, List list) {
        String formatStrLocaleSafe;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return A0s;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            File A0E = AnonymousClass001.A0E(((BugReportAttachment) next).A03);
            if (A0E.exists() && A0E.canRead() && (formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s-%d.%s", str, Integer.valueOf(i2), str2)) != null) {
                A0s.add(formatStrLocaleSafe);
            }
            i = i3;
        }
    }

    public static final 03Y A01(List list) {
        11T.A0F(list, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(list));
        for (Object obj : list) {
            File A0E = AnonymousClass001.A0E(((BugReportAttachment) obj).A03);
            linkedHashMap.put(obj, (A0E.exists() && A0E.canRead()) ? ELq.A06 : ELq.A03);
        }
        List A0J = 0RB.A0J(linkedHashMap);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj2 : A0J) {
            if (((03Y) obj2).second == ELq.A06) {
                A0s.add(obj2);
            } else {
                A0s2.add(obj2);
            }
        }
        return 1BK.A1G(A0s, A0s2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v32 java.lang.String, still in use, count: 2, list:
          (r321v32 java.lang.String) from 0x01c7: PHI (r321v31 java.lang.String) = (r321v28 java.lang.String), (r321v32 java.lang.String) binds: [B:479:0x06c7, B:19:0x01c4] A[DONT_GENERATE, DONT_INLINE]
          (r321v32 java.lang.String) from 0x01c4: IF  (r321v32 java.lang.String) != (null java.lang.String)  -> B:20:0x01c7 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1253, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v532, types: [org.json.JSONObject, java.lang.Object] */
    public /* bridge */ /* synthetic */ X.C04103zy B7F(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 6600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fi3.B7F(java.lang.Object):X.3zy");
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        int i = anonymousClass439.A00;
        if (i == 200) {
            Present A0a = 1BK.A0a(AbH.A1A(anonymousClass439.A01(), PublicKeyCredentialControllerUtility.JSON_KEY_ID));
            Absent absent = Absent.INSTANCE;
            return new Eth(A0a, absent, absent);
        }
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = anonymousClass439.A02;
        0fH.A0B(Fi3.class, 7zO.A0w("Bug report upload failed: %s", new Object[]{StringFormatUtil.formatStrLocaleSafe("error code: %d, msg: %s", valueOf, obj2.toString())}));
        return new Eth(Absent.INSTANCE, 1BK.A0a(valueOf), 1BK.A0a(obj2.toString()));
    }
}
