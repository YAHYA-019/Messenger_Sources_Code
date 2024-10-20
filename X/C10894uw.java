package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uw.class */
public final class C10894uw implements CallerContextable {
    public static final String __redex_internal_original_name = "ChatHeadsThreadKeyParser";
    public final 4iI A00 = (4iI) 1Hv.A02((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 67720);

    public static ThreadKey A00(Intent intent) {
        String str = 5QN.A01;
        if (intent.hasExtra(str)) {
            return (ThreadKey) intent.getParcelableExtra(str);
        }
        String str2 = C1xj.A0W;
        if (intent.hasExtra(str2)) {
            return ThreadKey.A0K(intent.getStringExtra(str2), true);
        }
        String str3 = C1xj.A0O;
        boolean hasExtra = intent.hasExtra(str3);
        long j = -1;
        if (hasExtra) {
            return ThreadKey.A08(intent.getLongExtra(str3, j));
        }
        String str4 = C1xj.A0S;
        if (intent.hasExtra(str4)) {
            return ThreadKey.A0E(intent.getLongExtra(str4, j));
        }
        return null;
    }
}
