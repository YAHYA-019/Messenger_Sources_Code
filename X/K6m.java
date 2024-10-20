package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Closeable;
import java.util.List;

/* loaded from: K6m.class */
public final class K6m extends K6n implements Closeable {
    public static final String A03 = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String A04 = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final L22 A00;
    public final L22 A01;
    public final JV8 A02;

    public K6m(L9t l9t) {
        super(l9t);
        MCv mCv = ((LCw) this).A00.A04;
        this.A00 = new L22(mCv);
        this.A01 = new L22(mCv);
        this.A02 = new JV8(l9t.A00, this);
    }

    public static final long A00(K6m k6m) {
        L0g.A00();
        k6m.A0I();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = k6m.A0J().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                LCw.A09(k6m, "SELECT COUNT(*) FROM hits2", e, (Object) null, "Database error", 6);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final long A01(K6m k6m, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = k6m.A0J().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return 0L;
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                LCw.A09(k6m, str, e, (Object) null, "Database error", 6);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase A0J() {
        try {
            return this.A02.getWritableDatabase();
        } catch (SQLiteException e) {
            A0F("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (r0.moveToFirst() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        r0 = r0.getLong(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        r0 = r0.getLong(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        r316 = r0.getString(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r0 = r0.getString(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        r0 = r0.getInt(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (android.text.TextUtils.isEmpty(r316) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        new java.util.HashMap(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015d, code lost:
    
        if (r316.startsWith("?") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        r316 = X.1BL.A0s("?", r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0177, code lost:
    
        r316 = X.Kyc.A00(new java.net.URI(r316));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        r316 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0189, code lost:
    
        A0G("Error parsing hit parameters", r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        new java.util.HashMap(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList A0K(long r302) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6m.A0K(long):java.util.ArrayList");
    }

    public final void A0L() {
        A0I();
        C01m.A03(A0J(), 1331138944);
    }

    public final void A0M(List list) {
        L0g.A00();
        A0I();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o("hit_id");
        A0o.append(" in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                String A0d = AnonymousClass001.A0d(")", A0o);
                try {
                    SQLiteDatabase A0J = A0J();
                    A0D("Deleting dispatched hits. count", JQx.A0p(list));
                    int delete = A0J.delete("hits2", A0d, null);
                    if (delete != list.size()) {
                        LCw.A09(this, JQx.A0p(list), Integer.valueOf(delete), A0d, "Deleted fewer hits then expected", 5);
                        return;
                    }
                    return;
                } catch (SQLiteException e) {
                    A0G("Error deleting hits", e);
                    throw e;
                }
            }
            Number number = (Number) list.get(i2);
            if (number == null || number.longValue() == 0) {
                break;
            }
            if (i2 > 0) {
                A0o.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0o.append(number);
            i = i2 + 1;
        }
        throw new SQLiteException("Invalid hit id");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        String str;
        try {
            this.A02.close();
        } catch (SQLiteException e) {
            e = e;
            str = "Sql error closing database";
            A0G(str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "Error closing database";
            A0G(str, e);
        }
    }
}
