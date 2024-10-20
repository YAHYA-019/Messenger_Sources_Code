package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.facebook.contacts.data.FbContactsContentProvider;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.0ex, reason: invalid class name */
/* loaded from: 0ex.class */
public final class C0ex extends 4xA {
    public final /* synthetic */ FbContactsContentProvider.Impl A00;

    public C0ex(FbContactsContentProvider.Impl impl) {
        this.A00 = impl;
    }

    public static Iterable A00(Iterable iterable) {
        return 2Ri.A02(new 0eH(), iterable);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String A01(X.3LX r302) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ex.A01(X.3LX):java.lang.String");
    }

    public static String A02(Iterable iterable) {
        return 0Pz.A0j("(", Joiner.on(',').join(A00(iterable)), ")");
    }

    public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        ImmutableMap A00;
        FbContactsContentProvider.Impl impl = this.A00;
        String A01 = A01(((C2eb) impl.A07.get()).A04.A00(uri));
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        String A06 = FbContactsContentProvider.Impl.A06(impl, str2);
        String A07 = FbContactsContentProvider.Impl.A07(str, A06);
        sQLiteQueryBuilder.setTables(impl.A0e(0Pz.A0j("(", A01, ")"), A07, A06, strArr));
        A00 = impl.A00();
        sQLiteQueryBuilder.setProjectionMap(A00);
        C00j.A05("FbContactsContentProvider.doSearchQuery", -278051456);
        try {
            Cursor query = sQLiteQueryBuilder.query(((1rC) impl.A06.get()).AUF(), strArr, A07, strArr2, null, null, str2, str3);
            0fH.A0g(Long.valueOf(C00j.A00(-215282658)), "FbContactsContentProvider", "FbContactsContentProvider.doSearchQuery %d ms");
            return query;
        } catch (Throwable th) {
            0fH.A0g(Long.valueOf(C00j.A00(-1258645591)), "FbContactsContentProvider", "FbContactsContentProvider.doSearchQuery %d ms");
            throw th;
        }
    }
}
