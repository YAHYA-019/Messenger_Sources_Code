package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Can.class */
public final class Can implements 2Ad {
    public static final ImmutableSet A02 = AbF.A11(1Hk.A0B);
    public final C00i A01 = 1BQ.A00();
    public final C00i A00 = 1BQ.A02(84196);

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap hashMap;
        CMs cMs = (CMs) this.A00.get();
        ImmutableSet immutableSet = A02;
        try {
            hashMap = AnonymousClass001.A0u();
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                1Hk r0 = (1Hk) it.next();
                JSONObject A01 = CMs.A01(CMs.A00(fbUserSession, cMs, ((CIK) 1Lo.A06(fbUserSession, 84502)).A01(r0, 100).A01().A01));
                String A0w = 7zO.A0w("%s_virtual_folder_db_threads_json.txt", new Object[]{r0.dbName});
                A0h.m11011add((Object) new BkI(A0w, R0D.A00(file, A0w, A01)));
            }
            ImmutableList build = A0h.build();
            2fE r02 = (2fE) 1Lo.A06(fbUserSession, 17064);
            ImmutableList.Builder A0h2 = 4YU.A0h();
            1Du it2 = immutableSet.iterator();
            while (it2.hasNext()) {
                1Hk r03 = (1Hk) it2.next();
                JSONObject A012 = CMs.A01(CMs.A00(fbUserSession, cMs, r02.A08(r03).A01));
                String A0w2 = 7zO.A0w("%s_virtual_folder_cache_threads_json.txt", new Object[]{r03.dbName});
                A0h2.m11011add((Object) new BkI(A0w2, R0D.A00(file, A0w2, A012)));
            }
            ImmutableList build2 = A0h2.build();
            1Du it3 = build.iterator();
            while (it3.hasNext()) {
                BkI bkI = (BkI) it3.next();
                AbM.A1S(bkI.A00, bkI.A01, hashMap);
            }
            1Du it4 = build2.iterator();
            while (it4.hasNext()) {
                BkI bkI2 = (BkI) it4.next();
                AbM.A1S(bkI2.A00, bkI2.A01, hashMap);
            }
        } catch (IOException | JSONException e) {
            1BK.A09(cMs.A00).softReport("MessageThreadsSnapshotProvider", e);
            hashMap = null;
        }
        return hashMap;
    }

    public String getName() {
        return "ThreadsVirtualFoldersExtra";
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
