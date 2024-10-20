package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.repack.protobuf.MessageLite;

/* loaded from: Lgg.class */
public final class Lgg implements MLr {
    public final Kwh A00;
    public final MessageLite A01;
    public final L1E A02;

    public Lgg(Kwh kwh, MessageLite messageLite, L1E l1e) {
        this.A02 = l1e;
        this.A00 = kwh;
        this.A01 = messageLite;
    }

    @Override // X.MLr
    public boolean AQr(Object obj, Object obj2) {
        return JQy.A1X(((KJb) obj).unknownFields.equals(((KJb) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.MLr
    public int BA4(Object obj) {
        L57 l57 = ((KJb) obj).unknownFields;
        int i = l57.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < l57.A00; i2++) {
                int i3 = l57.A03[i2] >>> 3;
                Lj5 lj5 = (Lj5) l57.A04[i2];
                boolean z = KEH.A02;
                int A04 = 2 + JR2.A04(i3) + 1;
                int A06 = Kwg.A06(3);
                int A02 = lj5.A02();
                i += A04 + A06 + JR2.A04(A02) + A02;
            }
            l57.A01 = i;
        }
        return i;
    }

    @Override // X.MLr
    public int BNo(Object obj) {
        return ((KJb) obj).unknownFields.hashCode();
    }

    @Override // X.MLr
    public final boolean BTV(Object obj) {
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.MLr
    public void BcF(Object obj) {
        ((KJb) obj).unknownFields.A02 = false;
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    @Override // X.MLr
    public void Be4(Object obj, Object obj2) {
        LEh.A0Q(obj, obj2);
    }

    @Override // X.MLr
    public void Be7(LDr lDr, L9l l9l, Object obj) {
        KJb kJb = (KJb) obj;
        if (kJb.unknownFields == L57.A05) {
            kJb.unknownFields = new L57();
        }
        throw AnonymousClass001.A0Q("ensureExtensionsAreMutable");
    }

    @Override // X.MLr
    public void Be8(L0L l0l, Object obj, byte[] bArr, int i, int i2) {
        KJb kJb = (KJb) obj;
        if (kJb.unknownFields == L57.A05) {
            kJb.unknownFields = new L57();
        }
        throw AnonymousClass001.A0Q("ensureExtensionsAreMutable");
    }

    @Override // X.MLr
    public Object BfF() {
        KGw newBuilderForType = this.A01.newBuilderForType();
        KGw.A01(newBuilderForType);
        return newBuilderForType.A00;
    }

    @Override // X.MLr
    public void DBL(Kg7 kg7, Object obj) {
        throw AnonymousClass001.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }
}
