package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: I3n.class */
public final class I3n {
    public final Context A05;
    public final FbUserSession A06;
    public final C01i A04 = C01g.A00(C03i.A03, C3kc.A00);
    public final 1Br A00 = 1Bq.A00(65674);
    public final 1Br A03 = 1Bq.A00(49473);
    public final 1Br A02 = 1Bq.A00(67389);
    public final 1Br A01 = 1Bq.A00(67996);

    public I3n(Context context, FbUserSession fbUserSession) {
        this.A05 = context;
        this.A06 = fbUserSession;
    }

    public static final 03Y A00(C04784by c04784by, I3n i3n, byte[] bArr, int i) {
        2H7 r0 = (2H7) i3n.A04.getValue();
        if (bArr.length != i) {
            bArr = C1A9.A0J(bArr, 0, i);
        }
        if (!c04784by.A01(new 2Ds(2EU.A02(r0.A01(bArr)))) || c04784by.A02 <= 1 || c04784by.A05 == 6) {
            return null;
        }
        return 4YV.A13(Integer.valueOf(c04784by.A01), c04784by.A00);
    }

    public 8L0 A01(String str, String str2, long j) {
        Integer num;
        byte[] bArr;
        String str3;
        Integer valueOf;
        Uri A02 = ((C03853z9) 1Br.A0B(this.A02)).A02(str, str2, j);
        if (11T.A0O(A02.getScheme(), DGWRegionHintManager.SERVICE_KEY_MSYS)) {
            1Br.A0C(this.A01);
            return new 8L0((Object) null, C7uM.A00(7zL.A09(), A02, 1BL.A0E().A05), (String) null, 2, false);
        }
        String str4 = null;
        try {
            69B r0 = (69B) ((22C) 1Lo.A04(this.A05, this.A06, (1BY) null, 65962)).A04(str, 2, j, true, false).get();
            Number number = r0.A02;
            num = number != null ? Integer.valueOf(number.intValue()) : null;
            try {
                Number number2 = r0.A03;
                valueOf = number2 != null ? Integer.valueOf(number2.intValue()) : null;
                try {
                    bArr = r0.A06;
                    try {
                        String str5 = r0.A04;
                        if (str5 != null) {
                            str4 = GOo.A0D(str5).toString();
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    bArr = null;
                }
            } catch (Exception unused3) {
                bArr = null;
                str3 = null;
                return new 8L0(num, str4, str3, 2, AnonymousClass001.A1T(bArr));
            }
        } catch (Exception unused4) {
            num = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            str3 = intValue == 0 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : intValue == 1 ? "LOCALLY_SENT" : intValue == 2 ? "RESOLVED_FROM_WA" : intValue == 3 ? "RESOLVED_FROM_EB" : intValue == 4 ? "RESOLVED_FROM_DISK_CACHE" : intValue == 5 ? "RESOLVED_FROM_IN_MEMORY_FILE_PATH" : intValue == 6 ? "RESOLVED_FROM_LOCAL_MAPPING" : intValue == 7 ? "RESOLVED_FROM_RECEIVER_FETCH" : intValue == 8 ? "RESOLVED_FROM_IN_MEMORY_DATA_BLOB" : intValue == 9 ? "LOCALLY_SENT_TEMP_FILE_LOCATION" : intValue == 10 ? "RESOLVED_FROM_STICKER_TRANSPORT" : intValue == 11 ? "RESOLVED_FROM_MEDIA_PLATFORM" : intValue == -1 ? "PENDING_DOWNLOAD" : intValue == -2 ? "CONTENT_EXPIRED" : intValue == -3 ? "USER_DELETED" : intValue == -4 ? "CONTENT_REPLACED" : intValue == -5 ? "FILE_NOT_FOUND" : intValue == -6 ? "CONTENT_DELETED_BY_MESSAGE_EXPIRATION" : intValue == -7 ? "UNKNOWN_FAILURE" : intValue == -8 ? "TRANSPORT_FAILURE" : intValue == -9 ? "WCMMS_FAILURE" : intValue == -10 ? "MEM_FAILURE" : intValue == -11 ? "LEGACY_DOWNLOAD_FAILURE" : intValue == -12 ? "CONNECTION_BLOCK_FAILURE" : intValue == -13 ? "FULL_FALLBACK_FAILURE" : intValue == -14 ? "DISK_CACHE_FILE_NOT_FOUND" : intValue == -16 ? "MISSING_ATTACHMENT_ROW" : intValue == -17 ? "INVALID_CONTENT_TOKEN" : valueOf.toString();
            return new 8L0(num, str4, str3, 2, AnonymousClass001.A1T(bArr));
        }
        str3 = null;
        return new 8L0(num, str4, str3, 2, AnonymousClass001.A1T(bArr));
    }

    public Integer A02(String str) {
        File A11 = GOp.A11(C0A2.A03(str));
        Integer num = null;
        if (A11.exists()) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(A11));
            int length = (int) A11.length();
            byte[] bArr = new byte[length];
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
            03Y A00 = A00(new C04784by((2Fg) 1Br.A0B(this.A00)), this, bArr, length);
            if (A00 != null) {
                num = (Integer) A00.first;
            }
        }
        return num;
    }
}
