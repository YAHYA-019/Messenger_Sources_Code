package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.media.download.params.SaveMediaParams;
import com.facebook.msys.mci.DeviceBackup;

/* loaded from: A1h.class */
public final class A1h implements DeviceBackup {
    public static final CallerContext A02 = CallerContext.A0B("ArmadilloMediaDeviceBackup");
    public final 6Ro A00 = (6Ro) 1Bi.A03(50098);
    public final 1Rv A01 = (1Rv) 1Bi.A03(67262);

    @Override // com.facebook.msys.mci.DeviceBackup
    public boolean backupFile(String str, String str2) {
        String str3;
        boolean A1X = 1BL.A1X(str, str2);
        boolean z = false;
        if (!1BL.A0Q().AZk(36317861202964340L)) {
            str3 = "Feature disabled by MobileConfig.";
        } else if (str.length() == 0) {
            str3 = "File URL cannot be empty.";
        } else {
            try {
                Uri A03 = C0A2.A03(str);
                if (A03 != null) {
                    if (str2.length() == 0) {
                        str3 = "MIME type cannot be empty.";
                    } else {
                        if (this.A01.A09(48U.A00)) {
                            boolean A0b = 0CV.A0b(str2, "video", A1X);
                            if (A0b || 0CV.A0b(str2, "image", A1X)) {
                                6Ro r0 = this.A00;
                                CallerContext callerContext = A02;
                                SaveMediaParams saveMediaParams = new SaveMediaParams(A03, 0S2.A00, null, null, A1X, A0b);
                                1FV A0j = 4YU.A0j();
                                Bundle A05 = 1BK.A05();
                                A05.putParcelable("savePhotoParams", saveMediaParams);
                                ABe.A00(A0j, 4YU.A0M(A05, callerContext, (BlueServiceOperationFactory) r0.A01.get(), 1BJ.A00(ActionId.MISSED_EVENT), A1X), r0, 11);
                                if (!A0j.isCancelled()) {
                                    z = true;
                                }
                            }
                            return z;
                        }
                        str3 = "Could not save file. No storage permission granted.";
                    }
                }
            } catch (SecurityException unused) {
            }
            str3 = "File URL is not valid.";
        }
        0fH.A0o("ArmadilloMediaDeviceBackup", str3);
        return false;
    }
}
