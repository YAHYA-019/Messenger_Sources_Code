package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.contacts.data.FbContactsContentProvider;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.0ey, reason: invalid class name */
/* loaded from: 0ey.class */
public final class C0ey extends 4xA {
    public final /* synthetic */ FbContactsContentProvider.Impl A00;

    public C0ey(FbContactsContentProvider.Impl impl) {
        this.A00 = impl;
    }

    public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        ImmutableMap A02;
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("favorite_sms_contacts");
        FbContactsContentProvider.Impl impl = this.A00;
        A02 = impl.A02();
        sQLiteQueryBuilder.setProjectionMap(A02);
        return sQLiteQueryBuilder.query(((1rD) impl.A06.get()).AUF(), strArr, str, strArr2, null, null, str2, str3);
    }
}
