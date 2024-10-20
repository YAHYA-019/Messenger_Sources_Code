package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.Set;

/* loaded from: Kry.class */
public abstract class Kry {
    public long A00;
    public MotionEvent A01;
    public MotionEvent A02;
    public Object A03;
    public boolean A04 = true;
    public final Context A05;
    public final LCT A06;
    public final WindowManager A07;

    public Kry(Context context, LCT lct) {
        this.A05 = context;
        this.A07 = (WindowManager) context.getSystemService("window");
        this.A06 = lct;
    }

    public boolean A03(int i) {
        if (this.A03 == null || !this.A04) {
            return false;
        }
        LCT lct = this.A06;
        for (Set set : lct.mutuallyExclusiveGestures) {
            if (JQx.A1Y(set, i)) {
                for (Object obj : set) {
                    for (KK7 kk7 : lct.detectors) {
                        if (kk7 instanceof KK7) {
                            KK7 kk72 = kk7;
                            if (kk72.A05.contains(obj) && kk72.A03) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public abstract boolean A04(MotionEvent motionEvent);
}
