package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: L3C.class */
public final class L3C {
    public final L0V A01;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A00 = true;

    public L3C(L0V l0v) {
        this.A01 = l0v;
        l0v.A01 = this;
    }

    public static L3C A00() {
        return new L3C(new L0V(Choreographer.getInstance()));
    }

    public Kuo A01() {
        Kuo kuo = new Kuo(this);
        java.util.Map map = this.A02;
        String str = kuo.A0C;
        if (map.containsKey(str)) {
            throw AnonymousClass001.A0L("spring is already registered");
        }
        map.put(str, kuo);
        return kuo;
    }

    public void A02(String str) {
        Object obj = this.A02.get(str);
        if (obj == null) {
            throw 1BL.A0f("springId ", str, " does not reference a registered spring");
        }
        this.A03.add(obj);
        if (this.A00) {
            this.A00 = false;
            L0V l0v = this.A01;
            if (l0v.A02) {
                return;
            }
            l0v.A02 = true;
            l0v.A00 = SystemClock.uptimeMillis();
            Choreographer choreographer = l0v.A04;
            Choreographer.FrameCallback frameCallback = l0v.A03;
            choreographer.removeFrameCallback(frameCallback);
            choreographer.postFrameCallback(frameCallback);
        }
    }
}
