package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.messaging.communitymessaging.selectivesync.threadlist.eventhandler.SelectiveSyncThreadListHandler$SavedSyncStateData;
import com.facebook.xapp.messaging.events.common.lifecycle.OnSaveInstanceState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4co, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4co.class */
public final class C05044co implements 1Vf {
    public final FbUserSession A00;
    public final 1Br A01 = 1Bq.A00(84490);
    public final Context A02;

    public C05044co(Context context, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A00 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        long j;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnSaveInstanceState")) {
            throw 4YV.A0f(str);
        }
        OnSaveInstanceState onSaveInstanceState = (OnSaveInstanceState) r302;
        11T.A0F(onSaveInstanceState, 0);
        C00j.A05("SelectiveSyncThreadListUiHandler.onSaveInstanceState", -705046758);
        try {
            2bI r0 = (2bI) 1Lm.A06(this.A00, 66503);
            long now = ((RealtimeSinceBootClock) this.A01.A00.get()).now();
            ConcurrentHashMap concurrentHashMap = r0.A00;
            LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(concurrentHashMap.size()));
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                Object key = A0z.getKey();
                C22K c22k = ((2bK) A0z.getValue()).A01;
                synchronized (c22k) {
                    j = c22k.A00;
                }
                AnonymousClass001.A18(key, j, linkedHashMap);
            }
            SelectiveSyncThreadListHandler$SavedSyncStateData selectiveSyncThreadListHandler$SavedSyncStateData = new SelectiveSyncThreadListHandler$SavedSyncStateData(linkedHashMap, now);
            onSaveInstanceState.A00.putParcelable("Saved_Sync_State_Data_Key", new OpaqueParcelable(selectiveSyncThreadListHandler$SavedSyncStateData));
            String A00 = 1BJ.A00(ActionId.END_START_ACTIVITY);
            StringBuilder sb = new StringBuilder();
            sb.append("Saved state: ");
            sb.append(selectiveSyncThreadListHandler$SavedSyncStateData);
            0fH.A0j(A00, sb.toString());
            C00j.A01(-1974069713);
        } catch (Throwable th) {
            C00j.A01(1280864951);
            throw th;
        }
    }
}
