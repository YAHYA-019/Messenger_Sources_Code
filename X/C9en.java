package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.9en, reason: invalid class name */
/* loaded from: 9en.class */
public abstract class C9en {
    public static final int[] A01 = {1, 2, 3, 6};
    public static final int[] A03 = {48000, 44100, 32000};
    public static final int[] A04 = {24000, 22050, 16000};
    public static final int[] A02 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] A00 = {32, 40, 48, 56, 64, 80, 96, ActionId.MISSED_EVENT, 128, ActionId.OFFLINE, 192, 224, 256, 320, 384, 448, 512, 576, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT};
    public static final int[] A05 = {69, 87, ActionId.ACTION_BAR_COMPLETE, ActionId.HEADER_DATA_LOADED, ActionId.APP_FIRST_VIEW_CONTROLLER, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int A00(int i, int i2) {
        int i3;
        int i4 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = A03;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = A05;
        if (i4 >= 19) {
            return -1;
        }
        int i5 = iArr[i];
        if (i5 == 44100) {
            i3 = (iArr2[i4] + (i2 % 2)) * 2;
        } else {
            int i6 = A00[i4];
            i3 = i6 * 4;
            if (i5 == 32000) {
                return i6 * 6;
            }
        }
        return i3;
    }
}
