package X;

import java.util.UUID;

/* loaded from: LaU.class */
public final class LaU implements MFu {
    @Override // X.MFu
    public MLC A3v(UUID uuid) {
        MFu mFu = LaX.A03;
        C0k4.A00(mFu);
        MLC A3v = mFu.A3v(uuid);
        C0k4.A00(A3v);
        if (!"L3".isEmpty()) {
            try {
                A3v.CtY("securityLevel", "L3");
            } catch (Exception unused) {
            }
        }
        return A3v;
    }
}
