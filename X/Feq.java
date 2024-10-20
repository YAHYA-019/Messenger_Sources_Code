package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.dsp.core.ColorData;

/* loaded from: Feq.class */
public final class Feq implements GKK {
    public static final Feq A00 = new Object();

    public ColorData AGf(2MR r302) {
        int i = -16751392;
        switch (DKC.A05(r302, 0)) {
            case 18:
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
            case 214:
                break;
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                i = -1697477;
                break;
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
            case ActionId.ACTIVITY_RESUME /* 143 */:
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
            case 180:
            case 184:
                return DKC.A0N(-1);
            case ActionId.FORMAT_ERROR /* 148 */:
                return DKC.A0N(0);
            case ActionId.PRIVACY_VIOLATION /* 149 */:
            case 150:
            case 178:
            case 182:
                return DKC.A0O(-14931149, -1);
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                return DKC.A0O(-15787746, -1);
            case 173:
                return DKC.A0O(-2169879, -12166551);
            case 177:
                i = 1795162112;
                break;
            case 188:
                return DKC.A0O(-12166551, -1);
            case 202:
                return DKC.A0O(-1, -14931149);
            case 221:
                i = -8022620;
                break;
            default:
                return null;
        }
        return DKC.A0N(i);
    }

    public Integer AIK(EPF epf) {
        int A0C = DKE.A0C(epf);
        int i = 100;
        if (A0C != 6 && A0C != 7 && A0C != 8) {
            if (A0C != 45) {
                return null;
            }
            i = 12;
        }
        return Integer.valueOf(i);
    }

    public EPD B1Q() {
        return EPD.A0E;
    }

    public Dq2 Cwy(Integer num) {
        return null;
    }

    public Float D0g(EPH eph) {
        float f;
        int A0C = DKE.A0C(eph);
        if (A0C == 21) {
            f = 48.0f;
        } else if (A0C == 23) {
            f = 40.0f;
        } else {
            if (A0C != 25) {
                return null;
            }
            f = 36.0f;
        }
        return Float.valueOf(f);
    }

    public Float D16(EPJ epj) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0152, code lost:
    
        if (r306 == null) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x020e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00aa. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02af A[PHI: r314
  0x02af: PHI (r314v1 float) = (r314v0 float), (r314v2 float), (r314v3 float) binds: [B:25:0x020e, B:34:0x02ab, B:32:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2KP D5Q(X.EMF r302) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Feq.D5Q(X.EMF):X.2KP");
    }
}
