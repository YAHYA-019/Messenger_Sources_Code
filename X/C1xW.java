package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.familycenter.dailytimelimit.blockingscreen.DailyTimeLimitBlockingScreenActivity;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.1xW, reason: invalid class name */
/* loaded from: 1xW.class */
public final class C1xW implements 1wP {
    public final FbSharedPreferences A00 = (FbSharedPreferences) 1Bi.A03(33013);

    public Integer AZS() {
        return 0S2.A03;
    }

    public Intent Arg(Activity activity) {
        return new Intent(activity, (Class<?>) DailyTimeLimitBlockingScreenActivity.class);
    }

    public boolean BQx(Context context, FbUserSession fbUserSession) {
        boolean z = false;
        if (fbUserSession != null) {
            1xX r0 = (1xX) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 66248);
            1BV r02 = new 1BV(114755);
            FbSharedPreferences fbSharedPreferences = this.A00;
            if (fbSharedPreferences.Av1(r0.A02(), 0L) != 0) {
                if (fbSharedPreferences.ArU(1G9.A05(C5b8.A01, ((1G1) fbUserSession).A05), 0) == Calendar.getInstance().get(7) && 1Br.A07(((HRM) r02.get()).A00).AZk(36325510539662085L)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean Cxc() {
        return true;
    }

    public boolean Cxq(Activity activity) {
        Class<?> cls;
        Intent intent;
        Intent intent2;
        Uri data;
        if (activity instanceof C1io) {
            return false;
        }
        if (activity != null) {
            if (InterfaceC03733yw.class.isAssignableFrom(activity.getClass())) {
                return false;
            }
            Intent intent3 = activity.getIntent();
            if (intent3 != null) {
                1G9 r0 = C5b8.A01;
                if (intent3.getBooleanExtra("thread_with_guardian", false)) {
                    return false;
                }
            }
        }
        String str = null;
        if (11T.A0O((activity == null || (intent2 = activity.getIntent()) == null || (data = intent2.getData()) == null) ? null : data.toString(), 4YT.A00(337))) {
            if (activity == null || (intent = activity.getIntent()) == null) {
                return false;
            }
            intent.setData(null);
            return false;
        }
        List list = 3Hf.A00;
        if (activity != null && (cls = activity.getClass()) != null) {
            str = cls.getSimpleName();
        }
        return !0QD.A0k(list, str);
    }
}
