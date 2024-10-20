package X;

import android.database.Cursor;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;

/* loaded from: Cab.class */
public final class Cab implements 2Ad {
    public final 82O A00 = (82O) 1Bn.A0A(65588);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap A0u = AnonymousClass001.A0u();
        File file2 = new File(file, "inbox_units_json.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            Cursor query = this.A00.A0C(fbUserSession, "MESSENGER_INBOX2").A03.AUF().query("units", new String[]{"pos", PublicKeyCredentialControllerUtility.JSON_KEY_ID, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "update_ts_ms", "before_threads", "service_type", "service_subkey", "service_tertiary_key"}, null, null, null, null, "pos");
            try {
                C26T c26t = C26T.A00;
                C03353xs c03353xs = new C03353xs(c26t);
                while (query.moveToNext()) {
                    2DM A0g = 4YU.A0g(c26t);
                    A0g.A0i("pos", query.getInt(0));
                    A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID, query.getString(1));
                    A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, query.getString(2));
                    A0g.A0i("update_ts_ms", query.getInt(3));
                    A0g.A0i("before_threads", query.getInt(4));
                    A0g.A0o("service_type", query.getString(5));
                    A0g.A0o("service_subkey", query.getString(6));
                    A0g.A0o("service_tertiary_key", query.getString(7));
                    c03353xs.A0d(A0g);
                }
                printWriter.print(c03353xs);
                printWriter.flush();
                Uri fromFile = Uri.fromFile(file2);
                Closeables.A00(fileOutputStream, false);
                AbM.A1S(fromFile, "inbox_units_json.txt", A0u);
                return A0u;
            } finally {
                query.close();
            }
        } catch (Throwable th) {
            Closeables.A00(fileOutputStream, false);
            throw th;
        }
    }

    public String getName() {
        return "InboxUnitStore";
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
        return true;
    }
}
