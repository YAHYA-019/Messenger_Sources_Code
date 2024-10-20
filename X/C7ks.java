package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.7ks, reason: invalid class name */
/* loaded from: 7ks.class */
public abstract class C7ks {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    public static final EnumC03583yg A00(ThreadKey threadKey, boolean z) {
        C1yg c1yg;
        if (threadKey != null && (c1yg = threadKey.A06) != null) {
            switch (c1yg.ordinal()) {
                case 0:
                    return EnumC03583yg.A0G;
                case 1:
                    return EnumC03583yg.A0D;
                case 3:
                case 4:
                    return EnumC03583yg.A0K;
                case 8:
                    return EnumC03583yg.A0J;
                case 9:
                    return EnumC03583yg.A0F;
                case 10:
                    return EnumC03583yg.A0L;
                case 13:
                    if (z) {
                        return EnumC03583yg.A03;
                    }
                    break;
                case 14:
                    if (z) {
                        return EnumC03583yg.A02;
                    }
                    break;
                case 23:
                    return EnumC03583yg.A0E;
            }
        }
        return EnumC03583yg.A0M;
    }
}
