package X;

import com.facebook.auth.usersession.FbUserSession;
import java.io.File;

/* loaded from: Caj.class */
public final class Caj implements 2Ad {
    public final Bxq A02;
    public final 1Br A00 = AbG.A0M();
    public final 1Br A01 = 1BK.A0C();
    public final COh A03 = (COh) 1Bi.A03(84503);

    public Caj() {
        1F9 r0 = 1F9.A0M;
        r0.getClass();
        this.A02 = new Bxq(r0, "montage_cache_messages_json.txt", "montage_db_messages_json.txt", null, null, null, null, 5, 20);
    }

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        11T.A0H(file, fbUserSession);
        try {
            return this.A03.A03(fbUserSession, this.A02, file);
        } catch (Exception e) {
            1Br.A04(this.A00).softReport("MontageThreadsExtraFileProvider", e);
            return null;
        }
    }

    public String getName() {
        return "MontageMessages";
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
        return 1Br.A07(this.A01).AZl(2342153633397277201L, false);
    }
}
