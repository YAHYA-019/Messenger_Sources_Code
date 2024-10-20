package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: I6N.class */
public abstract class I6N {
    public static final I6N $redex_init_class = null;

    static {
        5LH.A00("goog.exo.database");
    }

    public static int A00(SQLiteDatabase sQLiteDatabase, String str, int i) {
        try {
            if (!Util.A0O(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                query.close();
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str, int i, int i2) {
        try {
            C01m.A00(116884819);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            C01m.A00(-158497732);
            ContentValues contentValues = new ContentValues();
            4YU.A1E(contentValues, "feature", i);
            contentValues.put("instance_uid", str);
            4YU.A1E(contentValues, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, i2);
            C01m.A00(1423088508);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
            C01m.A00(-603507370);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}
