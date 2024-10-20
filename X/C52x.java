package X;

import android.location.Location;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* renamed from: X.52x, reason: invalid class name */
/* loaded from: 52x.class */
public final class C52x implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A09(C52x.class, "foreground_location_framework");
    public static final String __redex_internal_original_name = "ForegroundLocationRWISignalCollector";
    public 1FA A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;

    public C52x(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Bq.A00(131081);
        this.A03 = 1Bq.A00(16385);
        this.A02 = 1Bq.A00(131150);
        this.A05 = 1Lm.A01(fbUserSession, 84975);
        this.A04 = 1Bq.A00(16446);
    }

    public static final void A00(C52x c52x) {
        0fH.A0j(__redex_internal_original_name, "execute startRWISignalCollection");
        if (((41S) 1Br.A0B(c52x.A02)).A02()) {
            0fH.A0j(__redex_internal_original_name, "isForegroundLocationEnabled");
            L5D A01 = LBf.A01((C5ez) 1Br.A0B(c52x.A01), A06.A03, -1313019819);
            if (A01 != null) {
                CDn cDn = (CDn) 1Br.A0B(c52x.A05);
                synchronized (cDn) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("The value of lat is ");
                    Location location = A01.A00;
                    A0k.append(location.getLatitude());
                    A0k.append(" and long is ");
                    A0k.append(location.getLongitude());
                    0fH.A0j("ForegroundLocationRWISignalProcessor", A0k.toString());
                    if (A01.A03() != null) {
                        Float A03 = A01.A03();
                        11T.A0D(A03);
                        if (A03.floatValue() > ((float) 1Br.A06(cDn.A03).Auy(36607191674855074L))) {
                            StringBuilder A0k2 = AnonymousClass001.A0k();
                            A0k2.append("Skip this DP due to data is collected with moving with speed: ");
                            0fH.A0j("ForegroundLocationRWISignalProcessor", AnonymousClass001.A0a(A01.A03(), A0k2));
                        }
                    }
                    L5D l5d = cDn.A01;
                    if (l5d == null) {
                        0fH.A0j("ForegroundLocationRWISignalProcessor", "The first location DP");
                    } else {
                        Location location2 = l5d.A00;
                        double latitude = location2.getLatitude();
                        double longitude = location2.getLongitude();
                        double latitude2 = location.getLatitude();
                        double longitude2 = location.getLongitude();
                        float[] fArr = new float[1];
                        Location.distanceBetween(latitude, longitude, latitude2, longitude2, fArr);
                        float f = fArr[0];
                        0fH.A0j("ForegroundLocationRWISignalProcessor", 0Pz.A0S("distance ", f));
                        C00i c00i = cDn.A03.A00;
                        if (f < ((float) 1BK.A0I(c00i).Auy(36607191674920611L))) {
                            cDn.A01 = A01;
                            int i = cDn.A00 + 1;
                            cDn.A00 = i;
                            if (i >= 2yD.A00(1BK.A0I(c00i), 36607191674986148L)) {
                                CDn.A00(A01, cDn);
                            }
                        } else if (cDn.A00 >= 2yD.A00(1BK.A0I(c00i), 36607191674986148L)) {
                            CDn.A00(cDn.A01, cDn);
                        }
                    }
                    cDn.A01 = A01;
                    cDn.A00 = 1;
                }
            }
        }
    }
}
