package X;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: Frr.class */
public final class Frr implements C08j {
    public final Function1 A00;

    public Frr(Function1 function1) {
        this.A00 = function1;
    }

    @Override // X.C08j
    public ArrayList Ara() {
        return C0s8.A10(new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), new IntentFilter(7zK.A00(283)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C08j
    public void CFb(Context context, Intent intent, C01q c01q) {
        int A1X = 1BL.A1X(context, intent);
        String A00 = 7zK.A00(296);
        if (intent.hasExtra(A00)) {
            7zN.A1a(this.A00, intent.getBooleanExtra(A00, false));
            return;
        }
        Object systemService = context.getSystemService("download");
        11T.A0I(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager downloadManager = (DownloadManager) systemService;
        long longExtra = intent.getLongExtra("extra_download_id", 0L);
        DownloadManager.Query query = new DownloadManager.Query();
        long[] jArr = new long[A1X];
        jArr[0] = longExtra;
        Cursor query2 = downloadManager.query(query.setFilterById(jArr));
        if (query2 != null) {
            try {
                if (query2.moveToFirst()) {
                    int i = query2.getInt(query2.getColumnIndex("status"));
                    if (i == 8) {
                        7zN.A1a(this.A00, A1X);
                    } else if (i == 16) {
                        7zN.A1a(this.A00, false);
                    }
                }
                query2.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass127.A00(query2, th);
                    throw th2;
                }
            }
        }
    }
}
