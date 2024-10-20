package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.01m, reason: invalid class name */
/* loaded from: 01m.class */
public abstract class C01m {
    public static final ThreadLocal A00 = new ThreadLocal() { // from class: X.01n
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void A00(int i) {
        if (A00.get() == Boolean.FALSE) {
            ExternalProviders.A07.A0A().A00(6, 20, i, 0, 0L);
        }
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, int i) {
        ExternalProviders.A07.A0A().A00(6, 21, i, 0, 0L);
        sQLiteDatabase.beginTransaction();
        A00.set(Boolean.TRUE);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, int i) {
        ExternalProviders.A07.A0A().A00(6, 21, i, 0, 0L);
        sQLiteDatabase.beginTransactionNonExclusive();
        A00.set(Boolean.TRUE);
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                A00.set(Boolean.FALSE);
            }
            ExternalProviders.A07.A0A().A00(6, 22, i, 0, 0L);
        } catch (Throwable th) {
            ExternalProviders.A07.A0A().A00(6, 22, i, 0, 0L);
            throw th;
        }
    }
}
