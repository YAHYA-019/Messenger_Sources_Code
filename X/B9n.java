package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* loaded from: B9n.class */
public final class B9n extends CP4 {
    public final C00i A00 = AbH.A0J();
    public final C00i A01 = 1BQ.A02(50015);

    public static void A00(B9n b9n, SettableFuture settableFuture, InputStream inputStream, OutputStream outputStream, String str) {
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
                inputStream.close();
                outputStream.close();
                0fH.A08(B9n.class, str, "Successfully wrote audio file to %s");
                settableFuture.set(CP4.success(new AnonymousClass244().A0W(new C1505AjS(b9n, str))));
            } catch (IOException e) {
                settableFuture.setException(new IOException("Failed to write to provided URI", e));
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        Class cls;
        String str;
        if (jSONObject != null) {
            String string = jSONObject.getString("thread_id");
            if (TextUtils.isEmpty(string)) {
                cls = B9n.class;
                str = "No sender found";
            } else {
                String string2 = jSONObject.getString("message_id");
                if (TextUtils.isEmpty(string2)) {
                    cls = B9n.class;
                    str = "No message id found";
                } else {
                    long optLong = jSONObject.optLong("message_timestamp", -1);
                    boolean optBoolean = jSONObject.optBoolean("is_group_thread", false);
                    boolean optBoolean2 = jSONObject.optBoolean("is_e2ee", false);
                    String string3 = jSONObject.getString(4YT.A00(ActionId.RTMP_CONNECTION_REQUESTED));
                    if (TextUtils.isEmpty(string3)) {
                        cls = B9n.class;
                        str = "No URI provided to store audio content";
                    } else {
                        1FV A0j = 4YU.A0j();
                        1FV A0j2 = 4YU.A0j();
                        if (optBoolean2) {
                            0fH.A0C(B9n.class, "Fetching e2ee audio from mailbox api");
                            1Uj r0 = (1Uj) 1Lo.A04(context, fbUserSession, (1BY) null, 16686);
                            MailboxFeature mailboxFeature = new MailboxFeature(r0);
                            0fH.A07(B9n.class, string2, "Message id %s");
                            int lastIndexOf = string2.lastIndexOf(95);
                            if (lastIndexOf == -1) {
                                0fH.A0E(B9n.class, "Failed to parse message id");
                                A0j2.setException(AnonymousClass001.A0L("Failed to parse message id, e2ee message id doesn't contain underscore"));
                                return A0j2;
                            }
                            try {
                                long parseLong = Long.parseLong(string2.substring(lastIndexOf + 1));
                                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                                1Um.A02(A0O, Czf.A00(mailboxFeature, A0P, 40, parseLong), A0P, false);
                                A0P.addResultCallback(new CyE(context, this, r0, A0j2, string3, 3));
                                return A0j2;
                            } catch (NumberFormatException e) {
                                A0j2.setException(new IllegalArgumentException("Failed to parse message id", e));
                                return A0j2;
                            }
                        }
                        0fH.A0C(B9n.class, "Fetching non-e2ee audio");
                        ThreadKey A02 = ((CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487)).A02(context, string, optBoolean);
                        if (A02 != null) {
                            ListenableFuture A00 = ((C5C) 1Bn.A0E(context, (1BY) null, 84534)).A00(new FetchThreadParams(1He.A04, null, ThreadCriteria.A02.A00(A02), null, 20, 0L, false, false, true, false, false), string2, "fetch_thread", optLong);
                            D4I d4i = new D4I(this, A0j, string2, 5);
                            C00i c00i = this.A00;
                            1Kd.A0D(c00i, d4i, A00);
                            1Kd.A0D(c00i, new D4T(this, context, A0j2, string3, 3), 4YV.A0b(c00i, new D3d(fbUserSession, this, 3), A0j));
                            return A0j2;
                        }
                    }
                }
            }
            0fH.A0B(cls, str);
        }
        return CP4.A01("Invalid request", 7);
    }
}
