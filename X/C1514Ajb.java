package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ajb, reason: case insensitive filesystem */
/* loaded from: Ajb.class */
public final class C1514Ajb extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$55";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1514Ajb(X.Ezc r302, X.EnC r303, com.facebook.quicklog.QuickPerformanceLogger r304, java.lang.Class r305, java.util.concurrent.atomic.AtomicInteger r306) {
        /*
            r301 = this;
            r0 = 10
            java.lang.String r0 = X.DKB.A00(r0)
            r307 = r0
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r304
            r2 = r305
            java.lang.String r3 = "BeforeLogout"
            java.lang.String r4 = "BusinessInboxDynamicShortcutCleaner"
            r5 = r307
            java.lang.String r6 = "type"
            r7 = r306
            r8 = 9699331(0x940003, float:1.3591658E-38)
            r9 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1514Ajb.<init>(X.Ezc, X.EnC, com.facebook.quicklog.QuickPerformanceLogger, java.lang.Class, java.util.concurrent.atomic.AtomicInteger):void");
    }

    public void A02() {
        this.A00.A0C.get();
        EnC enC = this.A01;
        if (1BK.A0N(AbJ.A0U().A00).AZk(18299249332198212L)) {
            return;
        }
        if (enC != null) {
            String str = enC.A00;
            if (11T.A0O(str, DKB.A00(8)) || 11T.A0O(str, DKB.A00(2))) {
                return;
            }
        }
        Context A00 = FbInjector.A00();
        ArrayList A01 = 4iS.A01(A00);
        if (A01.isEmpty()) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            4iO r0 = (4iO) it.next();
            String str2 = r0.A0D;
            11T.A0A(str2);
            if (11T.A0P(4YT.A00(897), 1, str2)) {
                String str3 = r0.A0D;
                11T.A0A(str3);
                A0s.add(str3);
            }
        }
        if (7zM.A1b(A0s)) {
            4iS.A06(A00, A0s);
        }
    }
}
