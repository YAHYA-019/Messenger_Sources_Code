package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.common.dextricks.DexStore;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4O8, reason: invalid class name */
/* loaded from: 4O8.class */
public abstract class C4O8 implements 0RA {
    public final Set A00;
    public final Set A01 = 02H.A02(new String[]{"FamilyAppsUserValuesProvider", "FirstPartyUserValuesProvider/user_values"});

    public C4O8() {
        Set set = DKL.A00;
        Set singleton = Collections.singleton("m.facebook.com");
        11T.A0A(singleton);
        this.A00 = AnonymousClass041.A04(singleton, set);
    }

    public void BdP(Context context, ProviderInfo providerInfo, Cursor cursor, Uri uri) {
        2yD A07;
        long j;
        0EY A01;
        String A04;
        String str;
        11T.A0G(uri, 0, providerInfo);
        11T.A0F(context, 3);
        boolean z = this instanceof 4RI;
        if (z) {
            A07 = 1Br.A07(((4RI) this).A02);
            j = 36327065318217665L;
        } else {
            A07 = 1Br.A07(((C4O7) this).A01);
            j = 36325824072668173L;
        }
        if (!A07.AZk(j) || cursor == null) {
            return;
        }
        1UG A08 = 1BK.A08(z ? 1Br.A02(((4RI) this).A01) : 1Br.A02(((C4O7) this).A00), "mobile_privacy_uii_detection_data_read");
        if (A08.isSampled()) {
            Set set = this.A01;
            Object A0G = 0QD.A0G(0CU.A0M(11T.A02(uri), new String[]{"."}, 0));
            if (A0G == null) {
                A0G = "";
            }
            if (set.contains(A0G) || (A01 = 0EX.A01(context, (Intent) null, (C0w6) null, DexStore.DAYS_TO_MS_FACTOR, 0L)) == null || (A04 = A01.A04()) == null || !DKL.A00.contains(1BK.A13(A04))) {
                return;
            }
            0DA r0 = new 0DA();
            StringBuilder A0k = AnonymousClass001.A0k();
            String[] columnNames = cursor.getColumnNames();
            if (cursor.moveToFirst()) {
                11T.A0D(columnNames);
                for (String str2 : columnNames) {
                    A0k.append(str2);
                    A0k.append(":");
                    int columnIndex = cursor.getColumnIndex(str2);
                    try {
                        str = cursor.getString(columnIndex);
                        11T.A0D(str);
                    } catch (Exception unused) {
                        try {
                            str = String.valueOf(cursor.getLong(columnIndex));
                        } catch (Exception unused2) {
                            try {
                                str = String.valueOf(cursor.getInt(columnIndex));
                            } catch (Exception unused3) {
                                str = "";
                            }
                        }
                    }
                    A0k.append(str);
                    A0k.append(";");
                }
            }
            cursor.moveToFirst();
            r0.A07("key_value_pairs", 11T.A02(A0k));
            r0.A07("storage_url", uri.toString());
            r0.A07("origin_class_name", ((PackageItemInfo) providerInfo).name);
            r0.A07("origin_authority", providerInfo.authority);
            r0.A07("caller_app_identity", A04);
            A08.A7T(r0, "android_shared_storage_payload");
            A08.A5c(C4Rc.SHAREDSTORAGE, "data_source_common_name");
            A08.A5c(C4Rb.WRITE, "cross_app_data_access_context");
            0DA r02 = new 0DA();
            r02.A01(C4Rc.CONTENTPROVIDER, "framework_name");
            A08.A7T(r02, "data_source_info");
            A08.BZL();
        }
    }
}
