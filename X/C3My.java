package X;

import android.content.Context;
import com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher;

/* renamed from: X.3My, reason: invalid class name */
/* loaded from: 3My.class */
public final class C3My {
    public 1BY A00;
    public final PrivacyPermissionStatusesFetcher A03;
    public final C00i A05;
    public final String A04 = C3My.class.getCanonicalName();
    public final C00i A02 = 1BQ.A02(131182);
    public final C00i A01 = 1BQ.A02(16634);

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher] */
    public C3My(1BO r302) {
        1BV A01 = 1BV.A01((1BY) null, 83719);
        this.A05 = A01;
        this.A00 = new 1BY(r302);
        Context context = (Context) A01.get();
        ?? obj = new Object();
        obj.A00 = context;
        obj.A01 = context.getPackageName();
        this.A03 = obj;
    }
}
