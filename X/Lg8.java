package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Lg8.class */
public final class Lg8 implements ML1 {
    public final Kwd A00;
    public final MQo A01;
    public final L1D A02;

    public Lg8(Kwd kwd, MQo mQo, L1D l1d) {
        this.A02 = l1d;
        this.A00 = kwd;
        this.A01 = mQo;
    }

    @Override // X.ML1
    public boolean AQr(Object obj, Object obj2) {
        return JQy.A1X(((KDF) obj).unknownFields.equals(((KDF) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.ML1
    public int BA4(Object obj) {
        L8w l8w = ((KDF) obj).unknownFields;
        int i = l8w.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < l8w.A00; i2++) {
                int i3 = l8w.A03[i2] >>> 3;
                Lj4 lj4 = (Lj4) l8w.A04[i2];
                boolean z = KBw.A05;
                i += 2 + JR2.A04(i3) + 1 + JR2.A04(24) + LCa.A03(lj4);
            }
            l8w.A01 = i;
        }
        return i;
    }

    @Override // X.ML1
    public int BNo(Object obj) {
        return ((KDF) obj).unknownFields.hashCode();
    }

    @Override // X.ML1
    public final boolean BTV(Object obj) {
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.ML1
    public void BcF(Object obj) {
        L8w l8w = ((KDF) obj).unknownFields;
        if (l8w.A02) {
            l8w.A02 = false;
        }
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.ML1
    public void Be4(Object obj, Object obj2) {
        Kyg.A00(obj, obj2);
    }

    @Override // X.ML1
    public void Be5(LCz lCz, L9k l9k, Object obj) {
        KDF kdf = (KDF) obj;
        if (kdf.unknownFields == L8w.A05) {
            kdf.unknownFields = new L8w();
        }
        throw AnonymousClass001.A0Q("ensureExtensionsAreMutable");
    }

    @Override // X.ML1
    public void Be6(L0K l0k, Object obj, byte[] bArr, int i, int i2) {
        KDF kdf = (KDF) obj;
        if (kdf.unknownFields == L8w.A05) {
            kdf.unknownFields = new L8w();
        }
        throw AnonymousClass001.A0Q("ensureExtensionsAreMutable");
    }

    @Override // X.ML1
    public Object BfF() {
        KDF kdf = this.A01;
        boolean z = kdf instanceof KDF;
        KDF kdf2 = kdf;
        return z ? Lg5.A0B(kdf2, 0S2.A0N) : ((Lg6) Lg5.A0B(kdf2, 0S2.A0Y)).A01();
    }

    @Override // X.ML1
    public void DBK(Kp1 kp1, Object obj) {
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }
}
