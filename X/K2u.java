package X;

import android.database.CursorWindow;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: K2u.class */
public final class K2u extends KtH {
    public final int A00;

    public K2u(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.A00 = i2;
    }

    public final String toString() {
        String str;
        int i = ((KtH) this).A00;
        int i2 = ((KtH) this).A01;
        DataHolder dataHolder = ((KtH) this).A02;
        DataHolder.A00(dataHolder, "event_type", i);
        CursorWindow[] cursorWindowArr = dataHolder.A07;
        if (cursorWindowArr[i2].getInt(i, dataHolder.A01.getInt("event_type")) == 1) {
            str = "changed";
        } else {
            DataHolder.A00(dataHolder, "event_type", i);
            str = cursorWindowArr[i2].getInt(i, dataHolder.A01.getInt("event_type")) == 2 ? "deleted" : "unknown";
        }
        int i3 = this.A00;
        if (i >= dataHolder.A00) {
            throw JQx.A0o();
        }
        int A01 = dataHolder.A01(i);
        boolean A1W = JQx.A1W("DataItem");
        DataHolder.A00(dataHolder, "data", i);
        byte[] blob = cursorWindowArr[A01].getBlob(i, dataHolder.A01.getInt("data"));
        HashMap hashMap = new HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            KtH ktH = new KtH(dataHolder, i + i4);
            if (ktH.A00("asset_key") != null) {
                hashMap.put(ktH.A00("asset_key"), ktH);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o("DataItemRef{ ");
        DataHolder.A00(dataHolder, "path", i);
        A0o.append("uri=".concat(JQx.A0w(Uri.parse(cursorWindowArr[A01].getString(i, dataHolder.A01.getInt("path"))))));
        A0o.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        A0o.append(0Pz.A0T(", numAssets=", hashMap.size()));
        if (A1W && !hashMap.isEmpty()) {
            A0o.append(", assets=[");
            Iterator A0x = AnonymousClass001.A0x(hashMap);
            String str2 = "";
            while (true) {
                String str3 = str2;
                if (!A0x.hasNext()) {
                    break;
                }
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                A0o.append(0Pz.A0v(str3, AnonymousClass001.A0j(A0z), ": ", ((MD9) A0z.getValue()).A00("asset_id")));
                str2 = ", ";
            }
            A0o.append("]");
        }
        return 0Pz.A0z("DataEventRef{ type=", str, ", dataitem=", AnonymousClass001.A0d(" }", A0o), " }");
    }
}
