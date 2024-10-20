package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.JgA, reason: case insensitive filesystem */
/* loaded from: JgA.class */
public final class C3011JgA extends 5WJ {
    public int A00;
    public int A01 = -1;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public C3011JgA(SwipeDismissBehavior swipeDismissBehavior) {
        this.A02 = swipeDismissBehavior;
    }

    public int A00(View view) {
        return view.getWidth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r306 = r301.A00 - r302.getWidth();
        r307 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        r306 = r301.A00;
        r307 = r302.getWidth() + r306;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A02(android.view.View r302, int r303, int r304) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.getLayoutDirection()
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = X.AnonymousClass001.A1Q(r0, r1)
            r307 = r0
            r0 = r301
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r0.A02
            r308 = r0
            r0 = r308
            int r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4e
            r0 = r307
            if (r0 == 0) goto L5a
        L29:
            r0 = r301
            int r0 = r0.A00
            r306 = r0
            r0 = r302
            int r0 = r0.getWidth()
            r305 = r0
            r0 = r306
            r1 = r305
            int r0 = r0 - r1
            r306 = r0
            r0 = r301
            int r0 = r0.A00
            r307 = r0
        L42:
            r0 = r306
            r1 = r303
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r307
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L4e:
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L6c
            r0 = r307
            if (r0 == 0) goto L29
        L5a:
            r0 = r301
            int r0 = r0.A00
            r306 = r0
            r0 = r302
            int r0 = r0.getWidth()
            r1 = r306
            int r0 = r0 + r1
            r307 = r0
            goto L42
        L6c:
            r0 = r301
            int r0 = r0.A00
            r306 = r0
            r0 = r302
            int r0 = r0.getWidth()
            r305 = r0
            r0 = r306
            r1 = r305
            int r0 = r0 - r1
            r306 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = r302
            int r0 = r0.getWidth()
            r1 = r305
            int r0 = r0 + r1
            r307 = r0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3011JgA.A02(android.view.View, int, int):int");
    }

    public int A03(View view, int i, int i2) {
        return view.getTop();
    }

    public void A04(int i) {
        LeH leH = this.A02.A04;
        if (leH != null) {
            LeH leH2 = leH;
            LCp A00 = LCp.A00();
            MDJ mdj = leH2.A00.A07;
            if (i != 0) {
                A00.A05(mdj);
            } else {
                A00.A06(mdj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if (r303 >= 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x011e, code lost:
    
        r313 = r301.A00;
        r307 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r303 <= 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (java.lang.Math.abs(r302.getLeft() - r301.A00) >= X.GOn.A03(X.DKC.A02(r302), 0.5f)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.view.View r302, float r303, float r304) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3011JgA.A05(android.view.View, float, float):void");
    }

    public void A06(View view, int i) {
        this.A01 = i;
        this.A00 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void A07(View view, int i, int i2, int i3, int i4) {
        float f = this.A00;
        float A02 = DKC.A02(view);
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        float f2 = f + (A02 * swipeDismissBehavior.A01);
        float A022 = this.A00 + (DKC.A02(view) * swipeDismissBehavior.A00);
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= A022) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (A022 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if ((r301.A02 instanceof com.google.android.material.snackbar.BaseTransientBottomBar$Behavior ? r302 instanceof X.JYg : true) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08(android.view.View r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A01
            r304 = r0
            r0 = -1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L13
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L31
        L13:
            r0 = r301
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r0.A02
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3a
            r0 = r302
            boolean r0 = r0 instanceof X.JYg
            r304 = r0
        L2a:
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L37
        L31:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L37:
            r0 = r305
            return r0
        L3a:
            r0 = 1
            r304 = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3011JgA.A08(android.view.View, int):boolean");
    }
}
