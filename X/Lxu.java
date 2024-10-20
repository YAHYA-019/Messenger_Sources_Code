package X;

import java.security.GeneralSecurityException;

/* loaded from: Lxu.class */
public final class Lxu extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return Kza.A01.A00.ArR("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
