package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* loaded from: F1n.class */
public abstract class F1n {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r301 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.1Iw r301, X.C2iw r302, X.GEv r303) {
        /*
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = r302
            X.1BL.A1F(r0, r1)
            r0 = r302
            X.1rv r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La9
            r0 = r305
            android.view.View r0 = r0.AyN()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto La9
            r0 = r306
            boolean r0 = r0 instanceof com.facebook.litho.LithoView
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La9
            r0 = r306
            com.facebook.litho.LithoView r0 = (com.facebook.litho.LithoView) r0
            r306 = r0
            r0 = r306
            com.facebook.litho.ComponentTree r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La9
            r0 = r305
            X.23N r0 = r0.A07
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La9
            X.1sP.A00()
            r0 = r305
            java.util.Map r0 = r0.A0S
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r305 = r0
            r0 = r305
            if (r0 != 0) goto Laa
            r0 = r301
            X.1LI r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L78
            r0 = r305
            java.lang.String r0 = r0.A0a()
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L7b
        L78:
            java.lang.String r0 = "null"
            r301 = r0
        L7b:
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r306 = r0
            r0 = r306
            java.lang.String r1 = "Cannot find a component with handle "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = " to use as anchor.\nComponent: "
            r1 = r301
            r2 = r306
            java.lang.String r0 = X.1BL.A0u(r0, r1, r2)
            r306 = r0
            java.lang.String r0 = "LithoTooltipController:InvalidHandle"
            r305 = r0
            r0 = r305
            r1 = r304
            r2 = r306
            X.C53s.A01(r0, r1, r2)
        La9:
            return
        Laa:
            r0 = r303
            r1 = r305
            r2 = r306
            r3 = 0
            r4 = 0
            r0.D07(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F1n.A00(X.1Iw, X.2iw, X.GEv):void");
    }

    public static final void A01(1Iw r301, GEv gEv, String str) {
        View AyN;
        LithoView lithoView;
        ComponentTree componentTree;
        C23N c23n;
        C1qq c1qq = r301.A04;
        if (c1qq == null || (AyN = c1qq.A02.AyN()) == null || !(AyN instanceof LithoView) || (componentTree = (lithoView = (LithoView) AyN).A00) == null || (c23n = componentTree.A07) == null) {
            return;
        }
        if (r301.A02 != null) {
            str = C1ta.getKeyWithSeparator(r301.A0C(), str);
            if (str == null) {
                throw 1BK.A0e();
            }
        }
        1sP.A00();
        java.util.Map map = c23n.A0T;
        Rect rect = (Rect) map.get(str);
        if (!map.containsKey(str) || rect == null) {
            C53s.A01("LithoTooltipController:InvalidKey", 0S2.A01, 0Pz.A0j("Cannot find a component with key ", str, " to use as anchor."));
        } else {
            gEv.D07(rect, lithoView, 0, 0);
        }
    }
}
