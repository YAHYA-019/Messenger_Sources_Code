package X;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: X.4Xa, reason: invalid class name */
/* loaded from: 4Xa.class */
public final class C4Xa implements Comparator {
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();
    public final InterfaceC02493vG A02;
    public final boolean A03;

    public C4Xa(InterfaceC02493vG interfaceC02493vG, boolean z) {
        this.A03 = z;
        this.A02 = interfaceC02493vG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r301.A03 != false) goto L27;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compare(java.lang.Object r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.Rect r0 = r0.A00
            r304 = r0
            r0 = r301
            android.graphics.Rect r0 = r0.A01
            r305 = r0
            r0 = r302
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r0
            r302 = r0
            r0 = r302
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r1 = r304
            r0.getBoundsInParent(r1)
            r0 = r303
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r0
            r303 = r0
            r0 = r303
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r306 = r0
            r0 = r306
            r1 = r305
            r0.getBoundsInParent(r1)
            r0 = r304
            int r0 = r0.top
            r307 = r0
            r0 = r305
            int r0 = r0.top
            r308 = r0
            r0 = -1
            r309 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto Lbe
            r0 = 1
            r310 = r0
            r0 = r307
            r1 = r308
            if (r0 > r1) goto L9f
            r0 = r304
            int r0 = r0.left
            r307 = r0
            r0 = r305
            int r0 = r0.left
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto Lb0
            r0 = r307
            r1 = r308
            if (r0 > r1) goto La2
            r0 = r304
            int r0 = r0.bottom
            r307 = r0
            r0 = r305
            int r0 = r0.bottom
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto Lbe
            r0 = r307
            r1 = r308
            if (r0 > r1) goto L9f
            r0 = r304
            int r0 = r0.right
            r307 = r0
            r0 = r305
            int r0 = r0.right
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto Lb0
            r0 = r307
            r1 = r308
            if (r0 > r1) goto La2
            r0 = 0
            r310 = r0
        L9f:
            r0 = r310
            return r0
        La2:
            r0 = r301
            boolean r0 = r0.A03
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lbb
            r0 = r309
            return r0
        Lb0:
            r0 = r301
            boolean r0 = r0.A03
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lbe
        Lbb:
            r0 = 1
            r309 = r0
        Lbe:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Xa.compare(java.lang.Object, java.lang.Object):int");
    }
}
