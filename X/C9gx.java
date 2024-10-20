package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;

/* renamed from: X.9gx, reason: invalid class name */
/* loaded from: 9gx.class */
public final class C9gx {
    public final 1Br A00 = 1Bu.A00(115920);

    public static final long A00(ThreadKey threadKey) {
        int A04 = 7zR.A04(threadKey.A06);
        long j = -1;
        if (A04 == 14) {
            return -2;
        }
        if (A04 != 13) {
            if (A04 == 0) {
                return 1L;
            }
            if (A04 == 1) {
                j = 2;
            }
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    public final long A01(Sticker sticker) {
        String A00 = ((Ho2) 1Br.A0B(this.A00)).A00(sticker);
        if (A00 != null) {
            switch (A00.hashCode()) {
                case -1446666299:
                    if (A00.equals("keyframes")) {
                        return 2;
                    }
                    break;
                case -1096937569:
                    if (A00.equals("lottie")) {
                        return 3;
                    }
                    break;
                case 111145:
                    if (A00.equals("png")) {
                        return 0L;
                    }
                    break;
                case 3645340:
                    if (A00.equals("webp")) {
                        return 1L;
                    }
                    break;
            }
        }
        return -1;
    }
}
