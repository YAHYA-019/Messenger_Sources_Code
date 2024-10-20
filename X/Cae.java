package X;

import com.facebook.auth.usersession.FbUserSession;
import java.io.File;

/* loaded from: Cae.class */
public final class Cae implements 2Ad {
    public final C00i A01 = 1BQ.A00();
    public final C00i A00 = 1BQ.A02(84196);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        return ((CMs) this.A00.get()).A02(fbUserSession, 1F9.A0I, file, "inbox_db_threads_json.txt", "inbox_cache_threads_json.txt");
    }

    public String getName() {
        return "ThreadsExtra";
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
