package X;

import android.content.res.Resources;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.google.common.base.Platform;

/* loaded from: C6g.class */
public final class C6g {
    public final C00i A00 = 1BV.A00(67697);

    public C2fd A00(PlatformSearchData platformSearchData) {
        if (platformSearchData.A00.ordinal() == 2) {
            return C2fd.A0H;
        }
        C2fd c2fd = C2fd.A0T;
        if (platformSearchData instanceof PlatformSearchUserData) {
            PlatformSearchUserData platformSearchUserData = (PlatformSearchUserData) platformSearchData;
            if (platformSearchUserData.A06) {
                c2fd = C2fd.A01;
                ((7XR) this.A00.get()).A00(platformSearchUserData.A04, 0S2.A01);
            }
        }
        return c2fd;
    }

    public String A01(PlatformSearchData platformSearchData, boolean z) {
        String str;
        if (platformSearchData instanceof PlatformSearchGameData) {
            str = ((PlatformSearchGameData) platformSearchData).A02;
        } else {
            str = null;
            if (platformSearchData instanceof PlatformSearchUserData) {
                PlatformSearchUserData platformSearchUserData = (PlatformSearchUserData) platformSearchData;
                if (z) {
                    String str2 = platformSearchUserData.A05;
                    if (Platform.stringIsNullOrEmpty(str2)) {
                        return null;
                    }
                    return ((Resources) 7zM.A19()).getString(2131967791).concat(str2);
                }
            }
        }
        return str;
    }
}
