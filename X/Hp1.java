package X;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.base.Platform;

/* loaded from: Hp1.class */
public final class Hp1 {
    public final TelephonyManager A00;
    public final C2dj A01;
    public final FbSharedPreferences A02 = (FbSharedPreferences) 1Bi.A03(33013);
    public final Context A03;

    public Hp1() {
        Context A09 = GOp.A09();
        this.A03 = A09;
        this.A00 = (TelephonyManager) 1Hv.A02(A09, 100178);
        this.A01 = (C2dj) 1Bi.A03(17050);
    }

    public String A00(Context context) {
        SubscriptionInfo activeSubscriptionInfo;
        String str = null;
        if (AnonymousClass001.A1N(this.A01.A00.A08("android.permission.READ_PHONE_STATE") ? 1 : 0) && (activeSubscriptionInfo = SubscriptionManager.from(context).getActiveSubscriptionInfo(SmsManager.getDefaultSmsSubscriptionId())) != null) {
            str = activeSubscriptionInfo.getNumber();
        }
        if (Platform.stringIsNullOrEmpty(str)) {
            str = this.A00.getLine1Number();
        }
        if (Platform.stringIsNullOrEmpty(str)) {
            str = this.A02.BD0(BaD.A08);
        }
        return str;
    }
}
