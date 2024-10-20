package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: B9i.class */
public final class B9i extends CP4 {
    public final C00i A01 = 1BQ.A02(16433);
    public final C00i A00 = 1BV.A00(148148);

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        int i;
        String str;
        String str2;
        0fH.A0l("AnswerCallRequestHandler", "Handled answer call");
        CallModel A0W = AbL.A0W(1Lo.A04(context, fbUserSession, (1BY) null, 33088));
        if (A0W == null || A0W.inCallState != 2) {
            i = 7;
            str = "Invalid request";
        } else {
            boolean z = A0W.inviteRequestedVideo;
            this.A00.get();
            if (IRF.A0Y((Activity) null, (IRF) 1Lo.A04(context, fbUserSession, (1BY) null, 99979), z)) {
                ListenableFuture D3C = AbF.A13(this.A01).D3C(new DBG(12, context, fbUserSession, this));
                D3C.getClass();
                try {
                    Boolean bool = (Boolean) 1Yz.A00(D3C);
                    0fH.A0h(String.valueOf(bool), "AnswerCallRequestHandler", "Handled answer call: %s");
                    if (bool.booleanValue()) {
                        str2 = CP4.success((Object) null);
                        return 1Kd.A0A(str2);
                    }
                    i = 0;
                    str = "Unkown error";
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new Error(cause);
                    }
                    throw new RuntimeException(cause);
                }
            } else {
                i = 4;
                str = "Permission error";
            }
        }
        str2 = CP4.error(i, str);
        return 1Kd.A0A(str2);
    }
}
