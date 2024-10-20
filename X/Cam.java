package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import java.io.File;

/* loaded from: Cam.class */
public final class Cam implements 2Ad {
    public Bxq A00;
    public final C00i A01 = 1BQ.A01();
    public final C00i A02 = 1BQ.A00();
    public final COh A03 = (COh) 1Bi.A03(84503);
    public final C15h A04;

    public Cam() {
        DBe A00 = DBe.A00(this, 36);
        this.A04 = A00;
        int i = 20;
        int i2 = 20;
        if (A00.get() != TriState.YES) {
            i = 5;
            i2 = 10;
        }
        1F9 r0 = 1F9.A0I;
        r0.getClass();
        this.A00 = new Bxq(r0, "cache_messages_json.txt", "db_messages_json.txt", "ui_messages_json.txt", "ui_threads_json.txt", "view_messages_json.txt", "ui_uncommitted_messages_json.txt", i2, i);
    }

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        try {
            return this.A03.A03(fbUserSession, this.A00, file);
        } catch (Exception e) {
            1BK.A09(this.A01).softReport("ThreadedMessagesExtraFileProvider", e);
            return null;
        }
    }

    public String getName() {
        return "ThreadedMessages";
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
        return AbN.A1W(this.A02);
    }
}
