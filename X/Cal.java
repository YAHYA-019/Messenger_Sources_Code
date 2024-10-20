package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.RegularImmutableMap;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Cal.class */
public final class Cal implements 2Ad {
    public final C00i A00;
    public final Message A01;
    public final Context A02;
    public final C00i A03 = 1BQ.A01();
    public final C00i A04 = 1BQ.A00();

    public Cal(Context context, Message message) {
        this.A02 = context;
        this.A00 = 7zL.A0R(context, 84520);
        this.A01 = message;
    }

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        try {
            File file2 = new File(file, "message_send_fail_json.txt");
            PrintWriter printWriter = new PrintWriter(file2);
            try {
                JSONObject A00 = ((C50) this.A00.get()).A00(this.A01);
                if (A00 != null) {
                    printWriter.write(A00.toString());
                }
                printWriter.close();
                Uri fromFile = Uri.fromFile(file2);
                HashMap A0u = AnonymousClass001.A0u();
                AbM.A1S(fromFile, "message_send_fail_json.txt", A0u);
                return A0u;
            } finally {
            }
        } catch (IOException e) {
            1BK.A09(this.A03).softReport("MessageSendFailedDataFileProvider", e);
            throw e;
        } catch (JSONException e2) {
            1BK.A09(this.A03).softReport("MessageSendFailedDataFileProvider", e2);
            return RegularImmutableMap.A03;
        }
    }

    public String getName() {
        return "MessageSendFailedExtraData";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return 1BK.A0N(this.A04).AZk(2342153633397998105L);
    }
}
