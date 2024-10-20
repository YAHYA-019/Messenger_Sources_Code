package com.facebook.debug.activitytracer;

import X.0JL;
import X.0JQ;
import X.0KF;
import X.0Pz;
import X.11T;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1FP;
import X.1GU;
import X.AnonymousClass001;
import X.C00i;
import X.C2xd;
import X.C4Dv;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.inject.FbInjector;
import java.util.Set;

/* loaded from: ActivityTracer.class */
public class ActivityTracer {
    public C4Dv A00;
    public final C00i A02 = new 1BQ(16458);
    public final 1FP A04 = (1FP) 1Bi.A03(67765);
    public final C2xd A05 = (C2xd) 1Bn.A0A(17148);
    public final Set A03 = 1Bi.A06(250);
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public static final String A00(long j) {
        long A02 = 0KF.A02((float) j);
        long max = Math.max(0L, (A02 / 1000) % 60);
        long max2 = Math.max(A02 % 1000, 0L);
        String substring = String.valueOf(100 + max).substring(1, 3);
        11T.A0A(substring);
        String substring2 = String.valueOf(1000 + max2).substring(1, 4);
        11T.A0A(substring2);
        return 0Pz.A0Y(substring, substring2, '.');
    }

    public static final String A01(long j) {
        String str;
        long A02 = 0KF.A02((float) j);
        StringBuilder A0l = AnonymousClass001.A0l(10);
        if (A02 < 10) {
            str = "____";
        } else if (A02 < 100) {
            str = "___";
        } else {
            if (A02 >= 1000) {
                if (A02 < 10000) {
                    str = "_";
                }
                A0l.append(A02);
                return 11T.A02(A0l);
            }
            str = "__";
        }
        A0l.append(str);
        A0l.append(A02);
        return 11T.A02(A0l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x05bc, code lost:
    
        if (r320 > 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0271, code lost:
    
        if (r0 != 5) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028e A[LOOP:1: B:52:0x0287->B:54:0x028e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v343, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.facebook.debug.activitytracer.ActivityTracer r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.debug.activitytracer.ActivityTracer.A02(com.facebook.debug.activitytracer.ActivityTracer, java.lang.String):boolean");
    }

    public C4Dv A03(String str, String str2) {
        C00i c00i = this.A02;
        ((1GU) c00i.get()).AAs();
        if (this.A00 != null) {
            return null;
        }
        0JQ A00 = 0JL.A00(str2);
        C2xd c2xd = this.A05;
        Context A01 = FbInjector.A01();
        FbInjector.A04(c2xd.A00.B92().Aqm());
        1Bn.A0M(c2xd);
        try {
            C4Dv c4Dv = new C4Dv(A00, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = c4Dv;
            ((1GU) c00i.get()).Ciz(new Runnable() { // from class: X.4Dw
                public static final String __redex_internal_original_name = "ActivityTracer$1";

                @Override // java.lang.Runnable
                public void run() {
                    Looper.myQueue().addIdleHandler(new 4OX(this, 1));
                }
            });
            return this.A00;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
