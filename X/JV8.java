package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import java.io.File;
import java.util.HashSet;

/* loaded from: JV8.class */
public final class JV8 extends SQLiteOpenHelper {
    public final /* synthetic */ K6m A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JV8(Context context, K6m k6m) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A00 = k6m;
    }

    public static HashSet A00(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet A0v = AnonymousClass001.A0v();
        StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(str) + 22);
        A0l.append(AnonymousClass000.A00(ActionId.NOTIFY_SUBSCRIBERS));
        A0l.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery(AnonymousClass001.A0d(" LIMIT 0", A0l), null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            int i = 0;
            while (true) {
                if (i >= columnNames.length) {
                    return A0v;
                }
                A0v.add(columnNames[i]);
                i++;
            }
        } finally {
            rawQuery.close();
        }
    }

    private final boolean A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                this.A00.A0C(str, e, "Error querying for table");
                if (0 == 0) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        K6m k6m = this.A00;
        L22 l22 = k6m.A01;
        if (!l22.A00(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            l22.A00 = SystemClock.elapsedRealtime();
            LCw.A0A(k6m, "Opening the database failed, dropping the table and recreating it", 6);
            ((LCw) k6m).A00.A00.getDatabasePath("google_analytics_v4.db").delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                l22.A00 = 0L;
                return writableDatabase;
            } catch (SQLiteException e) {
                k6m.A0G("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            KYF.A00("Invalid version number", Build.VERSION.SDK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r302) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JV8.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
