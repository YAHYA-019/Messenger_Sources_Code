package X;

import android.net.NetworkInfo;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.network.FbNetworkManager;
import java.util.concurrent.Executor;

/* renamed from: X.4mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mt.class */
public final class C08394mt {
    public static final 1G2 A0E;
    public static final 1G2 A0F;
    public static final 1G2 A0G;
    public static final 1G2 A0H;
    public static final 1G2 A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C00i A0B = new 1BQ(16687);
    public final C00i A0A = new 1BQ(32897);
    public final C00i A0D = new 1BQ(49228);
    public final C00i A0C = new 1BQ(33013);

    static {
        1G2 A0D = 1G0.A05.A0D("data_analytics");
        A0I = A0D;
        A0F = A0D.A0D("total_bytes_received_foreground");
        A0E = A0D.A0D("total_bytes_received_background");
        A0H = A0D.A0D("total_bytes_sent_foreground");
        A0G = A0D.A0D("total_bytes_sent_background");
    }

    public C08394mt() {
        ((Executor) 1Bi.A03(16457)).execute(new Runnable() { // from class: X.4mu
            public static final String __redex_internal_original_name = "AnalyticsConnectionUtils$1";

            @Override // java.lang.Runnable
            public void run() {
                C00j.A05("AnalyticsConnectionUtils#readCurrentTrafficStats", 785690806);
                try {
                    C08394mt.A00(C08394mt.this);
                    C00j.A01(-1754187394);
                } catch (Throwable th) {
                    C00j.A01(685980304);
                    throw th;
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|(20:5|6|7|8|(17:10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26)|43|13|14|15|16|17|18|19|20|21|22|23|24|25|26)|47|8|(0)|43|13|14|15|16|17|18|19|20|21|22|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        X.C07974lf.A00(r302);
        r310 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fd, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        X.C07974lf.A00(r302);
        r310 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        X.C07974lf.A00(r302);
        r310 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        r302 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        X.C07974lf.A00(r302);
        r310 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.C08394mt r301) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08394mt.A00(X.4mt):void");
    }

    public static void A01(C08394mt c08394mt) {
        synchronized (c08394mt) {
            long j = c08394mt.A04;
            long j2 = c08394mt.A05;
            long j3 = c08394mt.A06;
            long j4 = c08394mt.A07;
            long j5 = c08394mt.A08;
            long j6 = c08394mt.A09;
            A00(c08394mt);
            A02(c08394mt, "total_bytes_received", c08394mt.A04, j);
            A02(c08394mt, "total_bytes_sent", c08394mt.A05, j2);
            A02(c08394mt, "total_device_bytes_received", c08394mt.A06, j3);
            A02(c08394mt, "total_device_bytes_sent", c08394mt.A07, j4);
            A02(c08394mt, "total_mobile_bytes_received", c08394mt.A08, j5);
            A02(c08394mt, "total_mobile_bytes_sent", c08394mt.A09, j6);
            AnonymousClass449 anonymousClass449 = (AnonymousClass449) c08394mt.A0A.get();
            anonymousClass449.A06("device_bytes_received_since_boot", c08394mt.A06);
            anonymousClass449.A06("device_bytes_sent_since_boot", c08394mt.A07);
            anonymousClass449.A06("mobile_device_bytes_received_since_boot", c08394mt.A08);
            anonymousClass449.A06("mobile_device_bytes_sent_since_boot", c08394mt.A09);
            anonymousClass449.A06("app_bytes_received_since_boot", c08394mt.A04);
            anonymousClass449.A06("app_bytes_sent_since_boot", c08394mt.A05);
        }
    }

    public static void A02(C08394mt c08394mt, String str, long j, long j2) {
        long j3 = j - j2;
        if (j < 0 || j3 < 0 || j3 > 524288000) {
            j3 = -1;
        }
        ((2Ct) c08394mt.A0A.get()).A06(str, j3);
    }

    public void A03(2Jy r302) {
        C00i c00i = this.A0B;
        NetworkInfo A0A = ((FbNetworkManager) c00i.get()).A0A();
        if (A0A != null) {
            String typeName = A0A.getTypeName();
            String A0W = 0Pz.A0W("", "connection");
            if (1JF.A0B(typeName)) {
                typeName = "none";
            }
            r302.A0D(A0W, typeName);
            String subtypeName = A0A.getSubtypeName();
            if (1JF.A0B(subtypeName) && A0A.getType() == 1 && ((FbNetworkManager) c00i.get()).A0L()) {
                subtypeName = AbstractC00603o4.A00(ActionId.ON_VIEW_CREATED_END);
            }
            if (1JF.A0B(subtypeName)) {
                return;
            }
            r302.A0D(0Pz.A0W("", "connection_subtype"), subtypeName);
        }
    }
}
