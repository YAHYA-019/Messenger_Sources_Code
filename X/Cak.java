package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: Cak.class */
public final class Cak implements 2Ad {
    public 1BY A00;
    public final C50 A01;
    public final C01s A02;
    public final 1CO A03;

    public Cak(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        C01s A0I = 1BL.A0I();
        C50 c50 = (C50) 1Bn.A0B(84520);
        1CO A0e = AbJ.A0e();
        this.A02 = A0I;
        this.A01 = c50;
        this.A03 = A0e;
    }

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        try {
            File file2 = new File(file, "recent_db_messages_json.txt");
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
            try {
                C4yz c4yz = (C4yz) 1Lo.A04((Context) null, fbUserSession, this.A00, 49423);
                C00i c00i = c4yz.A09;
                ((1Tw) c00i.get()).A00(4YT.A00(343));
                C00j.A05(4YT.A00(218), 1174087239);
                try {
                    LinkedHashMap linkedHashMap = C4yz.A00(new 4cN(), c4yz, 0Pz.A0W("timestamp_ms", " DESC"), 20, " DESC".contains(" ASC")).A00;
                    4YV.A1D(c00i);
                    C00j.A01(-802817603);
                    JSONObject A12 = AnonymousClass001.A12();
                    Iterator it = linkedHashMap.values().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i++;
                        A12.put(Integer.toString(i), this.A01.A00(4YU.A0V(it)));
                    }
                    printWriter.write(A12.toString());
                    Uri fromFile = Uri.fromFile(file2);
                    printWriter.close();
                    HashMap A0u = AnonymousClass001.A0u();
                    AbM.A1S(fromFile, "recent_db_messages_json.txt", A0u);
                    return A0u;
                } catch (Throwable th) {
                    4YV.A1D(c00i);
                    C00j.A01(-1948812743);
                    throw th;
                }
            } finally {
            }
        } catch (Exception e) {
            this.A02.softReport("RecentMessagesDbExtraFileProvider", e);
            return null;
        }
    }

    public String getName() {
        return "RecentMessagesDb";
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
        return this.A03.AZk(36310624184238616L);
    }
}
