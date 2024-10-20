package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: Koa.class */
public final class Koa {
    public final C01i A00 = C01g.A00(C03i.A02, M2N.A00);

    public final List A00() {
        try {
            ArrayList A0s = AnonymousClass001.A0s();
            Cursor query = ((1DX) this.A00.getValue()).AUF().query("tabs_table", new String[]{"tab_id", "tab_url", "tab_title", "tracking_codes", "created_timestamp", "last_accessed_timestamp", "parent_tab_id", "parent_tab_url", "business_name", "business_image_url", "tab_type", "is_business_verified"}, null, null, null, null, 0Pz.A0W("last_accessed_timestamp", " ASC"));
            try {
                int columnIndex = query.getColumnIndex("tab_id");
                int columnIndex2 = query.getColumnIndex("tab_url");
                int columnIndex3 = query.getColumnIndex("tab_title");
                int columnIndex4 = query.getColumnIndex("tracking_codes");
                int columnIndex5 = query.getColumnIndex("created_timestamp");
                int columnIndex6 = query.getColumnIndex("last_accessed_timestamp");
                int columnIndex7 = query.getColumnIndex("parent_tab_id");
                int columnIndex8 = query.getColumnIndex("parent_tab_url");
                int columnIndex9 = query.getColumnIndex("business_name");
                int columnIndex10 = query.getColumnIndex("business_image_url");
                int columnIndex11 = query.getColumnIndex("tab_type");
                int columnIndex12 = query.getColumnIndex("is_business_verified");
                while (query.moveToNext()) {
                    String string = query.getString(columnIndex);
                    String string2 = query.getString(columnIndex2);
                    String string3 = query.getString(columnIndex3);
                    String string4 = query.getString(columnIndex4);
                    long j = query.getLong(columnIndex5);
                    long j2 = query.getLong(columnIndex6);
                    String string5 = query.getString(columnIndex7);
                    String string6 = query.getString(columnIndex8);
                    String string7 = query.getString(columnIndex9);
                    String string8 = query.getString(columnIndex10);
                    boolean A1P = !query.isNull(columnIndex12) ? AnonymousClass001.A1P(query.getInt(columnIndex12)) : false;
                    int i = 0;
                    if (!query.isNull(columnIndex11)) {
                        i = query.getInt(columnIndex11);
                    }
                    if (string != null && string2 != null && string3 != null) {
                        if (string4 == null) {
                            string4 = "";
                        }
                        if (string5 == null) {
                            string5 = "";
                        }
                        if (string6 == null) {
                            string6 = "";
                        }
                        if (string7 == null) {
                            string7 = "";
                        }
                        if (string8 == null) {
                            string8 = "";
                        }
                        A0s.add(new Jt1(string, string2, string3, string4, string5, string6, string7, string8, i, j, j2, A1P));
                    }
                }
                query.close();
                return A0s;
            } finally {
            }
        } catch (SQLiteException | IllegalStateException e) {
            0fH.A0r("BROWSER_LITE_TABS_DB_HELPER", "Error reading from Tabs database", e);
            List emptyList = Collections.emptyList();
            11T.A0A(emptyList);
            return emptyList;
        }
    }
}
