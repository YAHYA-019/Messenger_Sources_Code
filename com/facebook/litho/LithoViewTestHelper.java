package com.facebook.litho;

import X.0CU;
import X.11T;
import X.32I;
import X.AnonymousClass001;
import X.C3RL;
import android.view.View;
import android.view.ViewParent;
import java.util.Deque;

/* loaded from: LithoViewTestHelper.class */
public final class LithoViewTestHelper {
    /* JADX WARN: Code restructure failed: missing block: B:106:0x044d, code lost:
    
        if (r326 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a9, code lost:
    
        if (r0.getVisibility() != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C3RL r301, com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription r302, java.lang.StringBuilder r303, int r304, int r305, int r306, boolean r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoViewTestHelper.A00(X.3RL, com.facebook.litho.DebugComponentDescriptionHelper$ExtraDescription, java.lang.StringBuilder, int, int, int, boolean, boolean):void");
    }

    public static final TestItem findTestItem(LithoView lithoView, String str) {
        11T.A0F(lithoView, 0);
        Deque findTestItems = lithoView.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static final Deque findTestItems(LithoView lithoView, String str) {
        11T.A0H(lithoView, str);
        return lithoView.findTestItems(str);
    }

    public static final String rootInstanceToString(C3RL c3rl, boolean z, int i) {
        int i2 = i;
        if (c3rl == null) {
            return "";
        }
        BaseMountingView A01 = c3rl.A01();
        StringBuilder A0k = AnonymousClass001.A0k();
        if (z && A01 != null) {
            i2 = 3;
            for (ViewParent parent = A01.getParent(); parent != null; parent = parent.getParent()) {
                i2++;
            }
        }
        A0k.append("\n");
        A00(c3rl, null, A0k, i2, 0, 0, z, false);
        return 11T.A02(A0k);
    }

    public static final String viewToString(BaseMountingView baseMountingView) {
        11T.A0F(baseMountingView, 0);
        return 0CU.A06(viewToString(baseMountingView, false)).toString();
    }

    public static final String viewToString(BaseMountingView baseMountingView, boolean z) {
        11T.A0F(baseMountingView, 0);
        return rootInstanceToString(32I.A00(C3RL.A08, baseMountingView.A0b()), z, 0);
    }

    public static final String viewToStringForE2E(View view, int i, boolean z) {
        11T.A0F(view, 0);
        return viewToStringForE2E(view, i, z, null);
    }

    public static final String viewToStringForE2E(View view, int i, boolean z, DebugComponentDescriptionHelper$ExtraDescription debugComponentDescriptionHelper$ExtraDescription) {
        11T.A0F(view, 0);
        String str = "";
        if (view instanceof BaseMountingView) {
            32I r0 = C3RL.A08;
            BaseMountingView baseMountingView = (BaseMountingView) view;
            11T.A0F(baseMountingView, 0);
            C3RL A00 = 32I.A00(r0, baseMountingView.A0b());
            if (A00 != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A00(A00, debugComponentDescriptionHelper$ExtraDescription, A0k, i, 0, 0, true, z);
                str = 11T.A02(A0k);
            }
        }
        return str;
    }
}
