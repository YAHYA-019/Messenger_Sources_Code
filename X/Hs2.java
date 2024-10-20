package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.rtc.interfaces.RoomsJoinOptions;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.BuildConfig;
import java.util.ArrayList;

/* loaded from: Hs2.class */
public final class Hs2 {
    public final 1Br A00;
    public final 1Br A01 = 1Bq.A00(84492);
    public final 1De A02;

    public Hs2(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 115771);
    }

    public void A00(Context context, Uri uri, RoomsJoinOptions roomsJoinOptions, String str) {
        Uri uri2 = uri;
        IFc iFc = (IFc) 1Lm.A05(context, 4YV.A0E(context), 67965);
        I3V i3v = (I3V) 1Br.A0B(this.A00);
        if (uri.getQueryParameter("funnel_session_id") == null) {
            uri2 = uri.buildUpon().appendQueryParameter("funnel_session_id", iFc.A07.A03()).build();
            11T.A0D(uri2);
        }
        long A01 = 1Br.A01(this.A01);
        Intent A05 = AbF.A05();
        A05.putExtra(AbstractC00603o4.A00(274), str);
        A05.putExtra(ErrorReportingConstants.FACEBOOK_APP_ID_KEY, String.valueOf(256002347743983L));
        A05.putExtra("fb_app_version", BuildConfig.VERSION_NAME);
        A05.putExtra(AbstractC00603o4.A00(275), A01);
        boolean z = roomsJoinOptions.A0A;
        ImmutableList immutableList = roomsJoinOptions.A02;
        ArrayList A17 = immutableList != null ? 1BK.A17(immutableList) : null;
        Integer num = roomsJoinOptions.A04;
        ImmutableList immutableList2 = roomsJoinOptions.A03;
        RtcCallVideoOptions A00 = roomsJoinOptions.A00();
        11T.A0A(A00);
        i3v.A01(context, A05, uri2, A00, immutableList2, num, str, (String) null, (String) null, A17, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (X.4YT.A00(199).equalsIgnoreCase(r0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (X.4YT.A00(1584).equalsIgnoreCase(r0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if ("www.m.me".equalsIgnoreCase(r0) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(android.net.Uri r302) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hs2.A01(android.net.Uri):boolean");
    }
}
