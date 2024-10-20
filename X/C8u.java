package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;

/* loaded from: C8u.class */
public final class C8u {
    public final C00i A00 = FbInjector.A00;
    public final C00i A01 = 1BQ.A02(100133);
    public final C00i A02 = 1BQ.A01();

    public String A00() {
        Uri uri;
        ContentResolver contentResolver = (ContentResolver) 1Hv.A02(1BK.A04(this.A00), 100181);
        ArrayList A0s = AnonymousClass001.A0s();
        if (ContactsContract.RawContactsEntity.PROFILE_CONTENT_URI != null && (uri = ContactsContract.Profile.CONTENT_URI) != null) {
            Cursor cursor = null;
            try {
                Cursor A01 = 0L0.A01(contentResolver, Uri.withAppendedPath(uri, "data"), (String) null, "contact_id", new String[]{"_id", "mimetype", "data1", "contact_last_updated_timestamp"}, (String[]) null, 191255867);
                if (A01 != null) {
                    A01.moveToPosition(-1);
                    while (A01.moveToNext()) {
                        if ("vnd.android.cursor.item/phone_v2".equals(AbH.A18(A01, "mimetype"))) {
                            String A18 = AbH.A18(A01, "data1");
                            Long.parseLong(AbH.A18(A01, "contact_last_updated_timestamp"));
                            A0s.add(new RDz(A18));
                        }
                    }
                    A01.close();
                }
            } catch (Exception unused) {
                if (0 != 0) {
                    cursor.close();
                }
            }
        }
        if (A0s.isEmpty()) {
            return null;
        }
        return ((RDz) A0s.get(0)).A00;
    }

    public String A01() {
        C00i c00i = this.A00;
        TelephonyManager telephonyManager = (TelephonyManager) 1BK.A04(c00i).getSystemService("phone");
        if (telephonyManager == null || !BRe.A00(1BK.A04(c00i))) {
            return null;
        }
        try {
            return telephonyManager.getLine1Number();
        } catch (SecurityException e) {
            1BK.A09(this.A02).D0v("OnDeviceDataUtils_getSimPhoneNumber", 0Pz.A0V("Security Exception while getting Line 1 Number: ", e));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8u.A02():java.lang.String");
    }
}
