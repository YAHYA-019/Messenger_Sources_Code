package X;

import java.security.GeneralSecurityException;

/* loaded from: Lxr.class */
public final class Lxr extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return Kza.A01.A00.ArR("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
