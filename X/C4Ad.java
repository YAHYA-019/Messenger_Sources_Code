package X;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.executors.annotations.SharedImportantExecutor;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.push.fcm.FcmRegistrarFbJobIntentService;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4Ad, reason: invalid class name */
/* loaded from: 4Ad.class */
public final class C4Ad implements 4AG {
    public static final Set A0F = new C4Xy(ActionId.DATA_LOAD_START);
    public final 1PA A00;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final 4Ye A06;
    public final 1P5 A07;
    public final Context A08;
    public final C00i A09;
    public final C00i A0A;
    public final 1OZ A0B;
    public final C1Oc A0C;
    public final 1OX A0E;
    public final 4AN A05 = new 4Yb(this);
    public final FbNetworkManager A01 = (FbNetworkManager) 1Bi.A05(FbNetworkManager.class, (Class) null);
    public final 4AX A0D = (4AX) 1Bi.A05(4AX.class, (Class) null);

    public C4Ad() {
        1OX r0 = (1OX) 1Bi.A05(1OX.class, (Class) null);
        this.A0E = r0;
        this.A04 = 1Bi.A02(ExecutorService.class, SharedImportantExecutor.class);
        this.A09 = 1Bi.A02(1P7.class, (Class) null);
        this.A03 = 1Bi.A02(4Yd.class, (Class) null);
        this.A02 = 1Bi.A02(1OQ.class, (Class) null);
        1OZ r02 = 1OZ.A04;
        this.A0B = r02;
        1Bn.A00();
        Context A00 = FbInjector.A00();
        this.A08 = A00;
        this.A06 = (4Ye) 1Bn.A0H(4Ye.class, (Class) null);
        this.A0A = 1Bi.A02(1XS.class, (Class) null);
        1I6 r03 = (1I7) 1Hv.A03(FbInjector.A00(), 1I7.class, LocalBroadcast.class);
        this.A07 = r0.A01(r02);
        this.A0C = r0.A00(r02);
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0F(A00, 1EZ.class, (Class) null));
        1P9 r04 = new 1P9(r03);
        r04.A05(new C4Om(this, A04, 3), "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
        this.A00 = r04.A02();
    }

    public static 4rD A00(C4Ad c4Ad) {
        C1Oc c1Oc = c4Ad.A0C;
        if (1JF.A0B(c1Oc.A05())) {
            return 4rD.A03;
        }
        if (c1Oc.A0B()) {
            return 4rD.A04;
        }
        1P5 r0 = c4Ad.A07;
        4Ye r02 = c4Ad.A06;
        return r0.A03(r02.A01, r02.A00) > 0 ? 4rD.A02 : 4rD.A01;
    }

    public static void A01(Context context, String str, int i) {
        0fH.A0j("FcmRegistrar", "register with FbJobIntentService");
        Intent intent = new Intent("register");
        intent.putExtra("reason", str);
        intent.putExtra("jobid", i);
        0Fc.A00(context, intent, FcmRegistrarFbJobIntentService.class);
    }

    public static void A02(1XS r301, String str, int i) {
        4CX r0 = new 4CX();
        PersistableBundle persistableBundle = r0.A00;
        persistableBundle.putString("serviceType", "FCM");
        persistableBundle.putString("reason", str);
        persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
        1XS.A01(r301, r0, i, 1, -1, LocationComponentOptions.STALE_STATE_DELAY_MS, true);
    }

    public static boolean A03(FbUserSession fbUserSession, C4Ad c4Ad, String str) {
        if (((1OQ) c4Ad.A02.get()).Bgz(str)) {
            return true;
        }
        if (4rD.A01 != A00(c4Ad)) {
            return false;
        }
        c4Ad.A0D.A07(fbUserSession, c4Ad.A05, c4Ad.A0B);
        return false;
    }

    public void A04(int i) {
        String A0T = 0Pz.A0T("force_", i);
        C00i c00i = this.A0A;
        if (c00i.get() != null) {
            A02((1XS) c00i.get(), A0T, 2131365116);
        } else {
            A01(this.A08, A0T, 2131365116);
        }
    }

    public void A05(FbUserSession fbUserSession, String str) {
        0fH.A0g(str, "FcmRegistrar", "register with reason: %s");
        this.A0C.A07();
        C00i c00i = this.A0A;
        if (c00i.get() == null) {
            A01(this.A08, str, 2131365115);
            return;
        }
        if (this.A01.A0M()) {
            ((Executor) this.A04.get()).execute(new 4XF(fbUserSession, this, str));
        }
        A02((1XS) c00i.get(), str, 2131365115);
    }

    public void A06(FbUserSession fbUserSession, boolean z) {
        String str;
        4rD A00 = A00(this);
        String obj = A00.toString();
        0fH.A0d(obj, Boolean.valueOf(z), "FcmRegistrar", "Check push status: tokenStatus %s, force FB register %b");
        ((1P7) this.A09.get()).A01(4rH.A04.toString(), obj, this.A0C.A05());
        int ordinal = A00.ordinal();
        if (ordinal == 0) {
            4AX r0 = this.A0D;
            1OZ r02 = this.A0B;
            4AN r03 = this.A05;
            if (z) {
                r0.A07(fbUserSession, r03, r02);
                return;
            } else {
                r0.A06(fbUserSession, r03, r02);
                return;
            }
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    Cc4(fbUserSession);
                    return;
                }
                return;
            }
            str = "upgrade";
        } else {
            if (this.A0A.get() == null && !this.A01.A0M()) {
                this.A00.A00();
                return;
            }
            str = "expire";
        }
        A05(fbUserSession, str);
    }

    public 4AN Aax() {
        return this.A05;
    }

    public 1OZ BAD() {
        return this.A0B;
    }

    public void Cc4(FbUserSession fbUserSession) {
        0fH.A0j("FcmRegistrar", "register");
        A05(fbUserSession, "register");
    }
}
