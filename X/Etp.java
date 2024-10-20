package X;

import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: Etp.class */
public final class Etp {
    public final C00i A01 = 1BV.A00(85192);
    public final C00i A02 = FbInjector.A00;
    public final 2Iq A00 = (2Iq) 1Bi.A03(16960);

    public String A00() {
        2Iq r304;
        String str;
        String string = Settings.Secure.getString(1BK.A04(this.A02).getContentResolver(), "android_id");
        C00i c00i = this.A01;
        c00i.get();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        11T.A0A(googleApiAvailability);
        if (AnonymousClass001.A1O(googleApiAvailability.A03(7zL.A09()))) {
            try {
                String A01 = ((5DO) c00i.get()).A01();
                if (!TextUtils.isEmpty(A01)) {
                    return A01;
                }
                r304 = this.A00;
                str = "sem_adid_error_with_null_on_advertisingIdInfo";
            } catch (Exception e) {
                this.A00.A00(0Pz.A1B("sem_adid_error_with_", e));
                return string;
            }
        } else {
            r304 = this.A00;
            str = "sem_adid_error_with_no_google_play_services";
        }
        r304.A00(str);
        return string;
    }
}
