package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.293, reason: invalid class name */
/* loaded from: 293.class */
public final class AnonymousClass293 {
    public final Context A00;
    public final java.util.Map A01;

    public AnonymousClass293(Context context, java.util.Map map) {
        this.A00 = context;
        this.A01 = map;
    }

    public final LinkedHashSet A00(String str, String str2) {
        ArrayList<03Y> arrayList;
        String str3;
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        0fH.A0j("SharedKeyRetriever", 0Pz.A0W("retrieveKey for feature: ", str2));
        AnonymousClass292[] anonymousClass292Arr = (AnonymousClass292[]) this.A01.get(3Go.A00(str2));
        if (anonymousClass292Arr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass292 anonymousClass292 : anonymousClass292Arr) {
                String str4 = anonymousClass292.appId;
                String packageName = this.A00.getPackageName();
                11T.A0A(packageName);
                boolean z = false;
                if (!11T.A0O(str4, packageName)) {
                    AnonymousClass292 anonymousClass2922 = AnonymousClass292.A02;
                    if ((!packageName.equals(anonymousClass2922.appId) || !11T.A0O(str4, AnonymousClass292.A03.appId)) && (!packageName.equals(AnonymousClass292.A03.appId) || !11T.A0O(str4, anonymousClass2922.appId))) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList2.add(anonymousClass292);
                }
            }
            arrayList = new ArrayList(C1A3.A1D(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str5 = ((AnonymousClass292) it.next()).appId;
                StringBuilder sb = new StringBuilder();
                sb.append("content://");
                sb.append(str5);
                sb.append(".ShareKey/");
                sb.append(str2);
                sb.append('/');
                sb.append(str);
                Uri uri = null;
                try {
                    uri = C0A2.A03(sb.toString());
                } catch (SecurityException unused) {
                }
                if (uri == null) {
                    throw 1BK.A0h();
                }
                arrayList.add(new 03Y(str5, uri));
            }
        } else {
            arrayList = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayList != null) {
            for (03Y r0 : arrayList) {
                String str6 = (String) r0.first;
                Uri uri2 = (Uri) r0.second;
                try {
                    Cursor A01 = 0L0.A01(this.A00.getContentResolver(), uri2, (String) null, (String) null, (String[]) null, (String[]) null, -1354073294);
                    str3 = A01 != null && A01.moveToFirst() ? A01.getString(0) : null;
                    if (A01 != null) {
                        A01.close();
                    }
                } catch (SecurityException e) {
                    1BL.A1I(e, "the security exception: ", "SharedKeyRetriever", AnonymousClass001.A0k());
                    str3 = null;
                }
                if (str3 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("no key found for uri ");
                    sb2.append(uri2);
                    0fH.A0j("SharedKeyRetriever", sb2.toString());
                } else {
                    0fH.A0j("SharedKeyRetriever", "retrieve key from content provider");
                    linkedHashSet.add(new 36N(str3, str6));
                }
            }
        }
        return linkedHashSet;
    }
}
