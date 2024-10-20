package X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7an, reason: invalid class name */
/* loaded from: 7an.class */
public final class C7an extends SQLiteOpenHelper implements JJS {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String A0v = 0Pz.A0v("DROP ", string, " IF EXISTS ", string2);
                    try {
                        C01m.A00(1987315401);
                        sQLiteDatabase.execSQL(A0v);
                        C01m.A00(-1426158255);
                    } catch (SQLException e) {
                        5My.A05("SADatabaseProvider", 0Pz.A0W("Error executing ", A0v), e);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        query.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
