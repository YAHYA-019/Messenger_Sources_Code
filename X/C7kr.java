package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.7kr, reason: invalid class name */
/* loaded from: 7kr.class */
public abstract class C7kr {
    public static final EnumC03583yg A00(ThreadKey threadKey) {
        EnumC03583yg enumC03583yg = null;
        C1yg c1yg = threadKey.A06;
        if (c1yg != null) {
            int ordinal = c1yg.ordinal();
            if (ordinal == 0) {
                return EnumC03583yg.A0G;
            }
            if (ordinal == 1) {
                return EnumC03583yg.A0D;
            }
            if (ordinal == 23) {
                enumC03583yg = EnumC03583yg.A0E;
            }
        }
        return enumC03583yg;
    }
}
