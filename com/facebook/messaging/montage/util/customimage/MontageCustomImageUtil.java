package com.facebook.messaging.montage.util.customimage;

import X.03Y;
import X.04R;
import X.0DR;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.C0s8;
import X.C2630Gjf;
import X.C5wh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.xsharelibraries.creation.loader.HTMomentCardMetadataManager;
import java.util.List;
import java.util.Map;

/* loaded from: MontageCustomImageUtil.class */
public final class MontageCustomImageUtil {
    public static final Map A05 = 04R.A09(new 03Y[]{1BK.A1G(C5wh.A04, 11T.A03(new C2630Gjf(2132346118, 2132346119, 5))), 1BK.A1G(C5wh.A07, C0s8.A14(new C2630Gjf(2132411094, 2132346130, 5), new C2630Gjf(2132411093, 2132346129, 5), new C2630Gjf(2132411095, 2132475999, 5))), 1BK.A1G(C5wh.A02, C0s8.A14(new C2630Gjf(2132346115, 2132346104, 5), new C2630Gjf(2132346116, 2132346105, 5), new C2630Gjf(2132346117, 2132346106, 5))), 1BK.A1G(C5wh.A06, C0s8.A14(new C2630Gjf(2132346121, 2132346108, 5), new C2630Gjf(2132346120, 2132346107, 5), new C2630Gjf(2132346122, 2132346109, 5))), 1BK.A1G(C5wh.A08, C0s8.A14(new C2630Gjf(2132346131, 2132346110, 5), new C2630Gjf(2132346133, 2132346112, 5), new C2630Gjf(2132346132, 2132346111, 5))), 1BK.A1G(C5wh.A03, 11T.A03(new C2630Gjf(2132346113, 2132346114, 5)))});
    public int A00;
    public C5wh A01;
    public List A02;
    public final 1Br A03;
    public final FbUserSession A04;

    public MontageCustomImageUtil(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A03 = 1Lm.A01(fbUserSession, 68664);
    }

    public static final Object A00(Context context, MontageCustomImageUtil montageCustomImageUtil, 0DR r303) {
        C5wh c5wh = montageCustomImageUtil.A01;
        if (c5wh == null) {
            11T.A0L("momentType");
            throw 0Q8.createAndThrow();
        }
        if (c5wh != C5wh.A05) {
            return null;
        }
        return ((HTMomentCardMetadataManager) 1Br.A0B(montageCustomImageUtil.A03)).A00(context, c5wh.momentTypeString, r303);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(android.content.Context r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.util.customimage.MontageCustomImageUtil.A01(android.content.Context, X.0DR):java.lang.Object");
    }
}
