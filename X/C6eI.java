package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.6eI, reason: invalid class name */
/* loaded from: 6eI.class */
public final class C6eI {
    public final java.util.Map A01 = new LinkedHashMap();
    public java.util.Map A00 = new LinkedHashMap();

    public final void A00(JXt jXt, String str) {
        java.util.Map map = this.A01;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C7sW c7sW = new C7sW(str);
            Khs khs = (Khs) this.A00.remove(str);
            if (khs != null) {
                c7sW.A00(khs);
            }
            map.put(str, c7sW);
            obj2 = c7sW;
        }
        C7sW c7sW2 = (C7sW) obj2;
        c7sW2.A02 = new WeakReference(jXt);
        String A0W = 0Pz.A0W(c7sW2.A04, "back");
        if (!11T.A0O(jXt.A01, A0W)) {
            11T.A0F(A0W, 0);
            jXt.A01 = A0W;
            jXt.A05.clear();
            jXt.A03.removeCallbacksAndMessages(null);
            jXt.invalidate();
            Path path = new Path();
            path.moveTo(-13.0f, 15.0f);
            path.lineTo(5.0f, -18.0f);
            jXt.A05(path, 0.5f, 5.0f, 51, 500L, false);
            Path path2 = new Path();
            path2.moveTo(-6.0f, -3.0f);
            path2.lineTo(6.0f, -15.0f);
            jXt.A05(path2, 0.5f, -5.0f, 53, 650L, false);
        }
        Khs khs2 = c7sW2.A00;
        if (khs2 != null) {
            jXt.A06(khs2);
            c7sW2.A00 = null;
        }
    }

    public final void A01(JXt jXt, String str) {
        java.util.Map map = this.A01;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            C7sW c7sW = new C7sW(str);
            Khs khs = (Khs) this.A00.remove(str);
            if (khs != null) {
                c7sW.A00(khs);
            }
            map.put(str, c7sW);
            obj2 = c7sW;
        }
        C7sW c7sW2 = (C7sW) obj2;
        c7sW2.A03 = new WeakReference(jXt);
        String A0W = 0Pz.A0W(c7sW2.A04, "front");
        if (!11T.A0O(jXt.A01, A0W)) {
            11T.A0F(A0W, 0);
            jXt.A01 = A0W;
            jXt.A05.clear();
            jXt.A03.removeCallbacksAndMessages(null);
            jXt.invalidate();
            Path path = new Path();
            path.moveTo(-11.0f, 19.0f);
            path.quadTo(-5.0f, 13.0f, 12.0f, 7.0f);
            jXt.A05(path, 0.67f, 15.0f, 85, 0L, true);
            Path path2 = new Path();
            path2.moveTo(22.0f, 12.0f);
            path2.quadTo(-8.0f, 12.0f, -8.0f, 12.0f);
            jXt.A05(path2, 0.5f, -15.0f, 83, 200L, true);
            Path path3 = new Path();
            path3.moveTo(45.0f, 20.0f);
            path3.lineTo(15.0f, 20.0f);
            path3.arcTo(new RectF(-15.0f, -40.0f, 45.0f, 20.0f), 90.0f, 90.0f);
            jXt.A05(path3, 1.0f, -15.0f, 51, 425L, true);
            Path path4 = new Path();
            path4.lineTo(-10.0f, -21.0f);
            jXt.A05(path4, 0.33f, -15.0f, 53, 575L, true);
        }
        Khs khs2 = c7sW2.A01;
        if (khs2 != null) {
            jXt.A06(khs2);
            c7sW2.A01 = null;
        }
    }

    public final void A02(JXt jXt, String str) {
        java.util.Map map = this.A01;
        C7sW c7sW = (C7sW) map.get(str);
        if (c7sW != null) {
            WeakReference weakReference = c7sW.A02;
            if (weakReference != null) {
                if (weakReference.get() != jXt) {
                    return;
                } else {
                    c7sW.A02 = null;
                }
            }
            if (c7sW.A03 == null) {
                map.remove(str);
            }
        }
    }

    public final void A03(JXt jXt, String str) {
        java.util.Map map = this.A01;
        C7sW c7sW = (C7sW) map.get(str);
        if (c7sW != null) {
            WeakReference weakReference = c7sW.A03;
            if (weakReference != null && weakReference.get() == jXt) {
                c7sW.A03 = null;
                weakReference = null;
            }
            if (c7sW.A02 == null && weakReference == null) {
                map.remove(str);
            }
        }
    }
}
