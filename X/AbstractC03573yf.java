package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.3yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yf.class */
public abstract class AbstractC03573yf {
    public static final EnumC03583yg A00(ThreadKey threadKey) {
        if (threadKey != null) {
            if (threadKey.A1Q()) {
                return EnumC03583yg.A0I;
            }
            if (threadKey.A1K()) {
                return EnumC03583yg.A0G;
            }
            if (threadKey.A1F()) {
                return EnumC03583yg.A0D;
            }
            if (threadKey.A1I()) {
                return EnumC03583yg.A0E;
            }
            if (threadKey.A19()) {
                return EnumC03583yg.A0K;
            }
            if (threadKey.A1O()) {
                return EnumC03583yg.A0J;
            }
            if (threadKey.A1J()) {
                return EnumC03583yg.A0F;
            }
            if (threadKey.A06 == C1yg.PENDING_GENERAL_THREAD) {
                return EnumC03583yg.A0H;
            }
            if (threadKey.A0x()) {
                return EnumC03583yg.A03;
            }
            if (threadKey.A0w()) {
                return EnumC03583yg.A02;
            }
            if (threadKey.A0y()) {
                return EnumC03583yg.A01;
            }
            if (threadKey.A1A()) {
                return EnumC03583yg.A08;
            }
        }
        return EnumC03583yg.A0M;
    }
}
