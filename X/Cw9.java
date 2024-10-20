package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.user.model.User;

/* loaded from: Cw9.class */
public final class Cw9 implements DHi {
    public final /* synthetic */ 6KY A00;

    public Cw9(6KY r302) {
        this.A00 = r302;
    }

    @Override // X.DHi
    public void onFailure(Throwable th) {
        String str;
        Long A0e;
        6KY r0 = this.A00;
        User user = r0.A02;
        6KY.A00(r0).A02(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, r0.A03, "block", r0.A0K, (user == null || (str = user.A13) == null || (A0e = 0CW.A0e(str)) == null) ? -1 : A0e.longValue());
    }

    @Override // X.DHi
    public void onSuccess() {
        String str;
        Long A0e;
        6KY r0 = this.A00;
        User user = r0.A02;
        long longValue = (user == null || (str = user.A13) == null || (A0e = 0CW.A0e(str)) == null) ? -1 : A0e.longValue();
        6KY.A02(r0, "BLOCKED");
        6KY.A00(r0).A02(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, r0.A03, "block", r0.A0K, longValue);
    }
}
