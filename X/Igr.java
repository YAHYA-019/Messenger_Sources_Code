package X;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: Igr.class */
public final class Igr implements 4rQ {
    public final Context A00;

    public Igr(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public String BXf() {
        return "sm";
    }

    public HashMap CZY() {
        ApplicationInfo applicationInfo;
        HashMap A0u = AnonymousClass001.A0u();
        Context context = this.A00;
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        if (storageStatsManager == null || (applicationInfo = context.getApplicationInfo()) == null) {
            return null;
        }
        try {
            StorageStats queryStatsForUid = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid);
            11T.A0A(queryStatsForUid);
            A0u.put("ustats", new Igq(this, queryStatsForUid.getAppBytes(), queryStatsForUid.getDataBytes(), queryStatsForUid.getCacheBytes()));
        } catch (IOException unused) {
        }
        return A0u;
    }
}
