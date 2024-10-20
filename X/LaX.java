package X;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.util.Util;
import java.util.UUID;

/* loaded from: LaX.class */
public final class LaX implements MLC {
    public static final MFu A03 = new MFu() { // from class: X.LaV
        /* JADX WARN: Type inference failed for: r0v15, types: [X.MLC, java.lang.Object] */
        @Override // X.MFu
        public final MLC A3v(UUID uuid) {
            Throwable th;
            try {
                try {
                    try {
                        return new LaX(uuid);
                    } catch (UnsupportedSchemeException e) {
                        new 5Mq(e, 1);
                        throw th;
                    }
                } catch (Exception e2) {
                    new 5Mq(e2, 2);
                    throw th;
                }
            } catch (5Mq unused) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                A0k.append(uuid);
                5My.A02("FrameworkMediaDrm", AnonymousClass001.A0d(".", A0k));
                return new Object();
            }
        }
    };
    public int A00;
    public final MediaDrm A01;
    public final UUID A02;

    public LaX(UUID uuid) {
        uuid.getClass();
        if (!(!6Za.A01.equals(uuid))) {
            throw AnonymousClass001.A0L(String.valueOf("Use C.CLEARKEY_UUID instead"));
        }
        this.A02 = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.A01 = mediaDrm;
        this.A00 = 1;
        if (6Za.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static byte[] A00(UUID uuid, byte[] bArr) {
        KjP A00 = KwS.A00(bArr);
        if (A00 == null) {
            return null;
        }
        UUID uuid2 = A00.A01;
        if (uuid.equals(uuid2)) {
            return A00.A02;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UUID mismatch. Expected: ");
        A0k.append(uuid);
        A0k.append(", got: ");
        A0k.append(uuid2);
        5My.A04("PsshAtomUtil", AnonymousClass001.A0d(".", A0k));
        return null;
    }

    public void AGV(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    public /* bridge */ /* synthetic */ MCd AJO(byte[] bArr) {
        UUID uuid = this.A02;
        return new LaK(new MediaCrypto(uuid, bArr), uuid, bArr);
    }

    public int Af7() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Kft Asp(java.util.HashMap r302, java.util.List r303, byte[] r304, int r305) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LaX.Asp(java.util.HashMap, java.util.List, byte[], int):X.Kft");
    }

    public Khy B5S() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new Khy(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] CWD() {
        return this.A01.openSession();
    }

    public byte[] CZi(byte[] bArr, byte[] bArr2) {
        6Za.A00.equals(this.A02);
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    public void CZj(byte[] bArr) {
        this.A01.provideProvisionResponse(bArr);
    }

    public java.util.Map CaU(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    public boolean ChN(String str, byte[] bArr) {
        if (Util.A00 >= 31) {
            return KwQ.A01(this.A01, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.A02, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public void CiI(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    public void Crp(MCh mCh) {
        this.A01.setOnEventListener(new LFx(mCh, this));
    }

    public void Cst(6YT r302, byte[] bArr) {
        if (Util.A00 >= 31) {
            try {
                KwQ.A00(this.A01, r302, bArr);
            } catch (UnsupportedOperationException unused) {
                5My.A04("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public void CtY(String str, String str2) {
        this.A01.setPropertyString("securityLevel", str2);
    }

    public void release() {
        synchronized (this) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A01.release();
            }
        }
    }
}
