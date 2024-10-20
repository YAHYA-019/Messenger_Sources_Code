package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Caf.class */
public final class Caf implements 2Ad {
    public final C00i A01 = 1BQ.A00();
    public final CI4 A00 = (CI4) 1Bi.A03(84423);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap A0u = AnonymousClass001.A0u();
        try {
            CI4 ci4 = this.A00;
            SQLiteDatabase A07 = AbN.A07(fbUserSession);
            String[] strArr = C5pa.A01;
            ImmutableList A00 = CI4.A00(A07.query("threads_metadata", strArr, null, null, null, null, null), ci4, strArr);
            JSONObject A12 = AnonymousClass001.A12();
            for (int i = 0; i < A00.size(); i++) {
                ThreadMetadata threadMetadata = (ThreadMetadata) A00.get(i);
                11T.A0F(threadMetadata, 0);
                LinkedHashMap A1C = 1BK.A1C();
                A1C.put("threadKey", threadMetadata.A01);
                A1C.put("gameData", threadMetadata.A03);
                A1C.put("mentorshipData", threadMetadata.A02);
                A1C.put("canViewerCreateChats", Boolean.valueOf(threadMetadata.A04));
                A1C.put("messengerRoomsCount", Integer.valueOf(threadMetadata.A00));
                JSONObject A122 = AnonymousClass001.A12();
                Iterator A0x = AnonymousClass001.A0x(A1C);
                while (A0x.hasNext()) {
                    AbL.A19(A0x, A122);
                }
                A12.put(Integer.toString(i), A122);
            }
            AbM.A1S(R0D.A00(file, "inbox_db_threads_metadata_json.txt", A12), "inbox_db_threads_metadata_json.txt", A0u);
            return A0u;
        } catch (IOException | JSONException e) {
            0fH.A0z("ThreadsMetadataExtraFileProvider", "Couldn't %s in directory %s", e, new Object[]{"inbox_db_threads_metadata_json.txt", file});
            return A0u;
        }
    }

    public String getName() {
        return "ThreadsMetadata";
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
        return AbN.A1W(this.A01);
    }
}
