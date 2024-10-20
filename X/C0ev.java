package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.contacts.data.FbContactsContentProvider;

/* renamed from: X.0ev, reason: invalid class name */
/* loaded from: 0ev.class */
public final class C0ev extends 4xA {
    public final /* synthetic */ FbContactsContentProvider.Impl A00;

    public C0ev(FbContactsContentProvider.Impl impl) {
        this.A00 = impl;
    }

    public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        FbContactsContentProvider.Impl impl = this.A00;
        String A06 = FbContactsContentProvider.Impl.A06(impl, str2);
        String A07 = FbContactsContentProvider.Impl.A07(str, A06);
        sQLiteQueryBuilder.setTables(impl.A0e("contacts", A07, A06, strArr));
        sQLiteQueryBuilder.setProjectionMap(FbContactsContentProvider.Impl.A04(impl));
        return sQLiteQueryBuilder.query(((1rD) impl.A06.get()).AUF(), strArr, A07, strArr2, null, null, str2, str3);
    }
}
