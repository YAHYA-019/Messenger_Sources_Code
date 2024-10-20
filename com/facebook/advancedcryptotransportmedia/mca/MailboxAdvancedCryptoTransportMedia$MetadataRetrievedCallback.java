package com.facebook.advancedcryptotransportmedia.mca;

import X.0Pz;
import X.0fH;
import X.11T;
import X.7zN;
import X.AnonymousClass001;
import X.C2625GjJ;
import X.GYS;
import X.JJv;
import com.facebook.msys.mcf.MsysError;

/* loaded from: MailboxAdvancedCryptoTransportMedia$MetadataRetrievedCallback.class */
public abstract class MailboxAdvancedCryptoTransportMedia$MetadataRetrievedCallback {
    private void callbackJNI(long j, long j2, int i, int i2, String str, String str2, boolean z, String str3, String str4, String str5, Number number, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, Number number2, String str6, byte[] bArr4, String str7, String str8, boolean z2, String str9, Number number3, String str10, MsysError msysError) {
        JJv jJv;
        StringBuilder A0k;
        GYS gys = (GYS) this;
        11T.A0F(str8, 19);
        if (msysError != null) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("MetadataRetrievedCallback error: ");
            A0k2.append(msysError);
            A0k2.append(", attachmentPk: ");
            A0k2.append(gys.A00);
            A0k2.append(", contentToken: ");
            0fH.A0k("[MP] ArmadilloMediaMetaDataProvider", AnonymousClass001.A0d(gys.A02, A0k2));
            jJv = gys.A01;
            A0k = AnonymousClass001.A0m(msysError, "MetadataRetrievedCallback error: ");
        } else {
            if (z || str4 != null || str5 != null || str3 != null || str2 != null || bArr != null) {
                Long l = null;
                Long A0j = number2 != null ? 7zN.A0j(number2) : null;
                Integer valueOf = Integer.valueOf(i3);
                Long A0j2 = number != null ? 7zN.A0j(number) : null;
                Long valueOf2 = Long.valueOf(j2);
                Boolean valueOf3 = Boolean.valueOf(z2);
                if (number3 != null) {
                    l = 7zN.A0j(number3);
                }
                gys.A01.C6E(new C2625GjJ(valueOf3, valueOf, A0j, A0j2, valueOf2, l, str6, str7, str4, str5, str, str2, str8, str9, str10, str3, bArr, bArr2, bArr3, bArr4, i2, i, j, z));
                return;
            }
            0fH.A0k("[MP] ArmadilloMediaMetaDataProvider", 0Pz.A0t("MetadataRetrievedCallback metadata is invalid, attachmentPk: ", ", contentToken: ", gys.A02, gys.A00));
            jJv = gys.A01;
            A0k = AnonymousClass001.A0k();
            A0k.append("MetadataRetrievedCallback metadata is invalid, isLegacyAttachment: ");
            A0k.append(z);
            A0k.append(", receiverFetchId: ");
            A0k.append(false);
            A0k.append(", receiverFetchCdnUrl: ");
            A0k.append(false);
            A0k.append(", stickerCdnUrl: ");
            A0k.append(false);
            A0k.append(", persistedPath: ");
            A0k.append(false);
            A0k.append(", plaintextHash: ");
            A0k.append(false);
        }
        jJv.Bxe(A0k.toString());
    }
}
