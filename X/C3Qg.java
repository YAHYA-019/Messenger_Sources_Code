package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.ArrayList;

/* renamed from: X.3Qg, reason: invalid class name */
/* loaded from: 3Qg.class */
public final class C3Qg {
    public static final Intent A00(Context context, ThreadKey threadKey, ArrayList arrayList) {
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        if (ThreadKey.A0K(A0u, false) == null) {
            throw AnonymousClass001.A0N("ThreadKey as string parsed resulted in null");
        }
        Intent intent = new Intent(context, (Class<?>) MsysThreadViewActivity.class);
        intent.putExtra("thread_key", threadKey);
        intent.putExtra("matched_range", arrayList);
        intent.setExtrasClassLoader(MsysThreadViewActivity.class.getClassLoader());
        return intent;
    }

    public final Intent A01(final Context context, final FbUserSession fbUserSession, final ThreadKey threadKey, HeterogeneousMap heterogeneousMap) {
        1BK.A1J(threadKey, 1, heterogeneousMap);
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        if (ThreadKey.A0K(A0u, false) == null) {
            throw AnonymousClass001.A0N("ThreadKey as string parsed resulted in null");
        }
        Intent intent = new Intent(context, (Class<?>) MsysThreadViewActivity.class);
        intent.putExtra("thread_key", threadKey);
        intent.putExtra("thread_int_params_metadata", heterogeneousMap);
        if (1BL.A0Q().AZk(36322319379285376L)) {
            C3Se.A00(context, fbUserSession, threadKey);
            return intent;
        }
        1NF.A01().execute(new Runnable() { // from class: X.3hm
            public static final String __redex_internal_original_name = "MsysThreadViewActivity$Prefetcher$prefetchData$1";

            @Override // java.lang.Runnable
            public final void run() {
                C3Se.A00(context, fbUserSession, threadKey);
            }
        });
        return intent;
    }
}
