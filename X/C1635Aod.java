package X;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: X.Aod, reason: case insensitive filesystem */
/* loaded from: Aod.class */
public final class C1635Aod extends 4xA {
    public final C1652Aou A00 = (C1652Aou) 1Bi.A03(85005);

    public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        return this.A00.AUF().query("metainfo", strArr, str, strArr2, null, null, str2, str3);
    }
}
