package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;

/* loaded from: Hv5.class */
public abstract class Hv5 {
    public static int A00(ContentResolver contentResolver, ContentValues contentValues, Uri uri) {
        try {
            return contentResolver.update(uri, contentValues, null, null);
        } catch (SQLiteException e) {
            0fH.A0r("SqliteWrapper", "Catch a SQLiteException when update: ", e);
            throw e;
        }
    }

    public static Cursor A01(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return 0L0.A01(contentResolver, uri, str, str2, strArr, strArr2, -989945262);
        } catch (SQLiteException e) {
            0fH.A0r("SqliteWrapper", "Catch a SQLiteException when query: ", e);
            throw e;
        }
    }
}
