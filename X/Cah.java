package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: Cah.class */
public final class Cah implements 2Ad {
    public final 1Br A00 = AbG.A0M();
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A01 = 1Bu.A00(84520);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        11T.A0H(file, fbUserSession);
        try {
            File file2 = new File(file, "recent_db_montage_messages_json.txt");
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
            try {
                C4yz c4yz = (C4yz) 1Lo.A08(fbUserSession, 49423);
                1F9 r0 = 1F9.A0M;
                C00i c00i = c4yz.A09;
                ((1Tw) c00i.get()).A00(4YT.A00(343));
                C00j.A05(4YT.A00(218), 1174087239);
                try {
                    4cN r02 = new 4cN();
                    4cO.A00(r02, "folder", r0.dbName);
                    LinkedHashMap linkedHashMap = C4yz.A00(r02, c4yz, 0Pz.A0W("timestamp_ms", " DESC"), 20, " DESC".contains(" ASC")).A00;
                    4YV.A1D(c00i);
                    C00j.A01(-802817603);
                    11T.A0A(linkedHashMap);
                    JSONObject A12 = AnonymousClass001.A12();
                    Iterator it = linkedHashMap.values().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i++;
                        A12.put(String.valueOf(i), ((C50) 1Br.A0B(this.A01)).A00(4YU.A0V(it)));
                    }
                    printWriter.write(A12.toString());
                    Uri fromFile = Uri.fromFile(file2);
                    11T.A0A(fromFile);
                    printWriter.close();
                    return 1BK.A1D("recent_db_montage_messages_json.txt", fromFile.toString());
                } catch (Throwable th) {
                    4YV.A1D(c00i);
                    C00j.A01(-1948812743);
                    throw th;
                }
            } finally {
            }
        } catch (Exception e) {
            1Br.A04(this.A00).softReport("RecentMontageMessagesDbExtraFileProvider", e);
            return null;
        }
    }

    public String getName() {
        return "RecentMontageMessagesDb";
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
        return 1Br.A07(this.A02).AZk(36310624185090595L);
    }
}
