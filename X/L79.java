package X;

import com.facebook.common.smartgc.art.ArtSmartGc;
import com.facebook.common.smartgc.dalvik.DalvikSmartGc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: L79.class */
public abstract class L79 {
    public static MJX A00;
    public static final AtomicBoolean A03;
    public static final RnE[] A02 = new RnE[8];
    public static final LVX[] A01 = new LVX[8];

    /* JADX WARN: Multi-variable type inference failed */
    static {
        A00 = !DalvikSmartGc.CAN_RUN_ON_THIS_PLATFORM ? !ArtSmartGc.CAN_RUN_ON_THIS_PLATFORM ? RnB.A00 : new Object() : new Object();
        A03 = 7zO.A15();
    }

    public static void A00(int i) {
        RnB rnB = A00;
        if (rnB != RnB.A00) {
            boolean z = C0cm.A00;
            if ((z ? A01[i] : A02[i]) == null || A03.getAndSet(true)) {
                return;
            }
            LVX lvx = z ? A01[i] : A02[i];
            android.util.Log.v("SmartGc", 0Pz.A0E(i, "It is a bad time to GC for section ", " with platform config: ", lvx != null ? lvx.toString() : "None"));
            if (lvx != null) {
                rnB.badTimeToDoGc(lvx);
            }
        }
    }

    public static void A01(int i) {
        RnB rnB = A00;
        if (rnB != RnB.A00) {
            if ((C0cm.A00 ? A01[i] : A02[i]) == null || !A03.getAndSet(false)) {
                return;
            }
            android.util.Log.v("SmartGc", 0Pz.A0T("It is no longer a bad time to GC for section ", i));
            rnB.notAsBadTimeToDoGc();
        }
    }
}
