package X;

import com.facebook.auth.usersession.FbUserSession;
import java.io.File;

/* loaded from: Cad.class */
public final class Cad implements 2Ad {
    public final 1Br A00 = 1BK.A0C();
    public final CMs A01 = (CMs) 1Bi.A03(84196);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        11T.A0H(file, fbUserSession);
        return this.A01.A02(fbUserSession, 1F9.A0M, file, "montage_db_threads_json.txt", "montage_cache_threads_json.txt");
    }

    public String getName() {
        return "MontageThreads";
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
        return 1Br.A07(this.A00).AZk(2342153633397277201L);
    }
}
