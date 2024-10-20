package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: B9s.class */
public final class B9s extends CP4 implements CallerContextable {
    public static final String __redex_internal_original_name = "LoadThreadRequestHandler";
    public final C00i A01 = 1BV.A00(68334);
    public final C00i A00 = AbH.A0J();

    public static void A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey, B9s b9s, SettableFuture settableFuture, JSONObject jSONObject) {
        0fH.A0g(threadKey.A0u(), __redex_internal_original_name, "Querying with threadKey value: %s");
        1Kd.A0D(b9s.A00, new D4S(11, b9s, settableFuture, context, fbUserSession), ((C5C) 1Bn.A0E(context, (1BY) null, 84534)).A00(new FetchThreadParams(jSONObject.optBoolean("is_user_action", false) ? 1He.A02 : 1He.A04, null, ThreadCriteria.A02.A00(threadKey), null, 5, 0L, false, false, true, false, false), (String) null, "fetch_thread_v2", jSONObject.optLong("message_timestamp", -1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        ListenableFuture A01;
        boolean z;
        synchronized (this) {
            0fH.A0j(__redex_internal_original_name, "Handling IPC request to load thread messages");
            if (jSONObject == null) {
                0fH.A0n(__redex_internal_original_name, "Empty payload provide");
                A01 = CP4.A01("Invalid request", 7);
            } else {
                try {
                    String string = jSONObject.getString("thread_id");
                    0fH.A0g(string, __redex_internal_original_name, "Parsed thread id: %s");
                    ThreadKey A0K = ThreadKey.A0K(string, true);
                    SettableFuture A0j = 4YU.A0j();
                    if (A0K != null) {
                        A00(context, fbUserSession, A0K, this, A0j, jSONObject);
                        A01 = A0j;
                    } else if (string == null) {
                        0fH.A18(__redex_internal_original_name, "Param %s, parsed to null and threadKey is still null. This should not happen by this point", new Object[]{"thread_id"});
                        A01 = A0j;
                    } else {
                        0fH.A0j(__redex_internal_original_name, "Property is not thread key identifier, treating as a threadId");
                        CbW cbW = (CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487);
                        boolean z2 = false;
                        try {
                            z = jSONObject.getBoolean("is_group_thread");
                        } catch (JSONException e) {
                            0fH.A0r(__redex_internal_original_name, "Failed to parse payload for group thread assuming false", e);
                            z = false;
                        }
                        try {
                            z2 = jSONObject.getBoolean("is_e2ee");
                        } catch (JSONException e2) {
                            0fH.A0r(__redex_internal_original_name, "Failed to parse payload is E2EE assuming false", e2);
                        }
                        0fH.A0a(string, Boolean.valueOf(z), Boolean.valueOf(z2), __redex_internal_original_name, "Searching for thread key with id: %s, isGroup: %s, isE2ee: %s");
                        1Kd.A0D(this.A00, new D4c(context, fbUserSession, this, A0j, jSONObject, string, 3), cbW.A04(string, z2, z));
                        A01 = A0j;
                    }
                } catch (JSONException e3) {
                    0fH.A14(__redex_internal_original_name, "Failed to parse payload for require property %s", new Object[]{"thread_id", e3});
                    A01 = CP4.A01("Invalid request", 7);
                }
            }
        }
        return A01;
    }
}
