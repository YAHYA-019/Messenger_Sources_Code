package X;

import java.security.KeyStore;

/* loaded from: GA0.class */
public final class GA0 extends C00q implements C00m {
    public static final GA0 A00 = new GA0();

    public GA0() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }
}
