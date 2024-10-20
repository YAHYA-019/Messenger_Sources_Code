package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.Either;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.6rh, reason: invalid class name */
/* loaded from: 6rh.class */
public final class C6rh {
    public static final 2Oe A00(Either either, ThreadKey threadKey, 5SW r303, HeterogeneousMap heterogeneousMap, List list, int i) {
        11T.A0F(heterogeneousMap, 3);
        2Oe r0 = new 2Oe();
        Bundle bundle = new Bundle();
        bundle.putParcelable("thread_key", threadKey);
        bundle.putInt("root_view_id", i);
        bundle.putSerializable("extra_thread_view_source", r303);
        bundle.putParcelable("thread_int_params_metadata", heterogeneousMap);
        bundle.putParcelable("anchored_message_id_or_pk", either);
        bundle.putSerializable("match_message_ranges", list instanceof ArrayList ? (ArrayList) list : null);
        r0.setArguments(bundle);
        return r0;
    }

    private final void A01(Context context, 1Xo r303, ThreadKey threadKey, 7Qz r305, 5TY r306) {
        if (((2yD) 1Bi.A03(16385)).AZk(36322319379285376L)) {
            A02(context, r303, r305, r306);
        } else {
            1NF.A01().execute(new 7NC(context, r303, threadKey, r305, r306));
        }
    }

    public static final void A02(Context context, 1Xo r302, 7Qz r303, 5TY r304) {
        boolean z;
        synchronized (r302) {
            z = false;
            if (r302.A07.get(r304) != null) {
                z = true;
            }
        }
        if (!z) {
            r302.A04(r304, true);
        }
        C6tt.A02(context, null, r304);
        if (r303 != null) {
            r303.By6();
        }
    }

    public final void A03(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 7Qz r305) {
        11T.A0F(fbUserSession, 2);
        7NB r307 = 2Oe.A00;
        if (r307 == null) {
            r307 = new 7NB(1Bq.A00(16385));
            2Oe.A00 = r307;
        }
        5TX r0 = new 5TX();
        ((5TY) r0).A00 = context.getApplicationContext();
        BitSet bitSet = new BitSet(2);
        bitSet.clear();
        r0.A02 = threadKey;
        bitSet.set(0);
        r0.A01 = fbUserSession.BKF();
        bitSet.set(1);
        5TZ.A00(bitSet, new String[]{"threadKey", "viewerContext"}, 2);
        A01(context, r307, threadKey, r305, r0);
    }

    public final void A04(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 7Qz r305) {
        7NB r306 = 2Oe.A01;
        if (r306 == null) {
            r306 = new 7NB(1BK.A0C());
            2Oe.A01 = r306;
        }
        5Tr r0 = new 5Tr();
        ((5TY) r0).A00 = context.getApplicationContext();
        BitSet bitSet = new BitSet(3);
        bitSet.clear();
        r0.A02 = threadKey.A0u();
        bitSet.set(1);
        r0.A00 = 0PK.A00(new 03Y[]{1BK.A1G("thread_key", threadKey)});
        bitSet.set(0);
        r0.A01 = fbUserSession.BKF();
        bitSet.set(2);
        5TZ.A00(bitSet, new String[]{"bundle", "threadId", "viewerContext"}, 3);
        A01(context, r306, threadKey, r305, r0);
    }
}
