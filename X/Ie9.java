package X;

import android.util.SparseArray;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;

/* loaded from: Ie9.class */
public class Ie9 implements JOV {
    public static final java.util.Map A01 = Collections.emptyMap();
    public final SparseArray A00 = DKC.A0E();

    public Ie9(HBx hBx, HBx hBx2, JGJ jgj, JLI jli, boolean z, boolean z2) {
        A00(JOV.A0R, hBx);
        A00(JOV.A0W, hBx2);
        A00(JOV.A0U, jli);
        A00(JOV.A0A, jgj);
        A00(JOV.A0F, false);
        A00(JOV.A0S, false);
        A00(JOV.A0G, Boolean.valueOf(z));
        A00(JOV.A05, Boolean.valueOf(z2));
    }

    public void A00(HX5 hx5, Object obj) {
        this.A00.put(hx5.A00, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x006a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a9. Please report as an issue. */
    public Object AUY(HX5 hx5) {
        int i;
        SparseArray sparseArray = this.A00;
        int i2 = hx5.A00;
        Object obj = sparseArray.get(i2);
        if (obj != null) {
            return obj;
        }
        if (i2 == 0) {
            return Boolean.TRUE;
        }
        if (i2 != 3 && i2 != 31 && i2 != 33 && i2 != 43 && i2 != 7 && i2 != 8) {
            if (i2 == 23) {
                i = 0;
            } else if (i2 != 24) {
                switch (i2) {
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                        break;
                    case 12:
                        return A01;
                    default:
                        switch (i2) {
                            default:
                                switch (i2) {
                                    case 26:
                                        break;
                                    case 27:
                                        i = 400;
                                        break;
                                    case 28:
                                        return 30000000L;
                                    case 29:
                                        i = 16;
                                        break;
                                    default:
                                        switch (i2) {
                                            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                                            case 46:
                                            case ActionId.ON_START_END /* 47 */:
                                                break;
                                            case ActionId.QUEUED /* 48 */:
                                                return this;
                                            default:
                                                throw GOp.A16("Invalid Settings key: ", i2);
                                        }
                                }
                            case 16:
                            case 17:
                            case 18:
                                return Boolean.FALSE;
                        }
                }
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
        return Boolean.FALSE;
    }
}
