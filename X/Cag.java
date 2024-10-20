package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: Cag.class */
public final class Cag implements 2Ad {
    public final C00i A00 = 1BQ.A00();
    public final C00i A01 = 1BQ.A02(84203);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        CDD cdd = (CDD) this.A01.get();
        try {
            C12064ym c12064ym = (C12064ym) cdd.A01.get();
            ImmutableList.of();
            C00j.A05(4YT.A00(576), 471752587);
            try {
                C2eo c2eo = (C2eo) 1Lo.A04((Context) null, c12064ym.A01, c12064ym.A00, 33132);
                C2es c2es = new C2es(null, null, null, null, 7zN.A0h(), 0, null, null, null, AnonymousClass001.A0v(), false, false, false, false, true, false, false, false);
                0fH.A0g("", "MsysContactAdapterImpl", "loadContactListAsUsers \"%s\" called");
                ImmutableList A00 = C2eo.A00(c2es, c2eo, (C1qy) c2eo.A08.get());
                C00j.A01(-1040633201);
                Uri A002 = R0D.A00(file, "users_db_json.txt", CDD.A00(A00));
                Uri A003 = R0D.A00(file, "users_cache_json.txt", CDD.A00(Collections.unmodifiableCollection(((23F) cdd.A02.get()).A00.values())));
                HashMap A0u = AnonymousClass001.A0u();
                AbM.A1S(A002, "users_db_json.txt", A0u);
                AbM.A1S(A003, "users_cache_json.txt", A0u);
                return A0u;
            } catch (Throwable th) {
                C00j.A01(16115432);
                throw th;
            }
        } catch (Exception e) {
            1BK.A09(cdd.A00).softReport("UsersSnapshotProvider", e);
            return null;
        }
    }

    public String getName() {
        return "UsersExtra";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return true;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return AbN.A1W(this.A00);
    }
}
