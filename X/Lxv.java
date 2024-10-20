package X;

import java.security.GeneralSecurityException;

/* loaded from: Lxv.class */
public final class Lxv extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return Kza.A01.A00.ArR("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
