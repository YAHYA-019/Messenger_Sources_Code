package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.contacts.data.FbContactsContentProvider;

/* renamed from: X.0ew, reason: invalid class name */
/* loaded from: 0ew.class */
public final class C0ew extends 4xA {
    public final /* synthetic */ FbContactsContentProvider.Impl A00;

    public C0ew(FbContactsContentProvider.Impl impl) {
        this.A00 = impl;
    }

    public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("(SELECT idx.type as index_type, idx.indexed_data as index_data, c.fbid as contact_user_id  FROM contacts_indexed_data as idx INNER JOIN contacts as c ON (idx.contact_internal_id = c.internal_id))");
        return sQLiteQueryBuilder.query(((1rD) this.A00.A06.get()).AUF(), strArr, str, strArr2, null, null, str2, str3);
    }
}
