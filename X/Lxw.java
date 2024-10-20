package X;

import java.security.GeneralSecurityException;

/* loaded from: Lxw.class */
public final class Lxw extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return Kza.A01.A00.ArR("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
