package X;

import android.os.Parcelable;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContextable;

/* renamed from: X.3Vh, reason: invalid class name */
/* loaded from: 3Vh.class */
public final class C3Vh implements CallerContextable {
    public static final String __redex_internal_original_name = "ViewerContextUtil";
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 131330);
    public final C00i A03 = 1BQ.A02(98745);
    public final C00i A01 = 1BV.A01((1BY) null, 131329);
    public final C00i A05 = 1BV.A01((1BY) null, 16428);
    public final C00i A04 = 1BV.A01((1BY) null, 83431);

    public C3Vh(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static final C3Vh A00(1BO r301) {
        return new C3Vh(r301);
    }

    public ViewerContext A01(String str, String str2, String str3) {
        ViewerContext BKF = ((1EZ) this.A05.get()).BKF();
        Parcelable.Creator creator = ViewerContext.CREATOR;
        return str.length() == 0 ? ViewerContext.A01 : new ViewerContext(null, str2, BKF.mSessionCookiesString, BKF.mSessionKey, BKF.mSessionSecret, str, str3, false, false, false, true, false, false);
    }
}
