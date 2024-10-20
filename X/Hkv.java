package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: Hkv.class */
public final class Hkv {
    public final boolean A00(Context context) {
        HCL hcl;
        Activity A00 = 0Dg.A00(context);
        if (A00 == null) {
            return true;
        }
        String[] strArr = Build.VERSION.SDK_INT > 30 ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.READ_PHONE_STATE"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
        1Rv r0 = (1Rv) 1Bi.A03(67262);
        1BQ A02 = 1BQ.A02(147914);
        ArrayList A0s = AnonymousClass001.A0s();
        int length = strArr.length;
        int i = 0;
        do {
            String str = strArr[i];
            if (!r0.A08(str)) {
                if (!r0.A07(str)) {
                    A02.get();
                    11T.A0F(str, 1);
                    int hashCode = str.hashCode();
                    if (hashCode != -5573545) {
                        if (hashCode != 463403621) {
                            if (hashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                                hcl = HCL.A0M;
                                I6E.A00(hcl, "", "", null);
                            }
                        } else if (str.equals("android.permission.CAMERA")) {
                            hcl = HCL.A0L;
                            I6E.A00(hcl, "", "", null);
                        }
                    } else if (str.equals("android.permission.READ_PHONE_STATE")) {
                        hcl = HCL.A0N;
                        I6E.A00(hcl, "", "", null);
                    }
                }
                if (r0.A05(A00, str)) {
                    A0s.add(str);
                }
            }
            i++;
        } while (i < length);
        if (A0s.isEmpty()) {
            return false;
        }
        return (A0s.size() == 1 && A0s.contains("android.permission.CAMERA")) ? false : true;
    }
}
