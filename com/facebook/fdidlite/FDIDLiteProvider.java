package com.facebook.fdidlite;

import X.0jU;
import X.0jW;
import X.11T;
import X.C0qt;
import android.content.Context;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.HashMap;

/* loaded from: FDIDLiteProvider.class */
public final class FDIDLiteProvider extends C0qt {
    public FDIDLiteProvider() {
    }

    public FDIDLiteProvider(int i) {
    }

    @Override // X.C0qt
    public MatrixCursor A05(Uri uri, String str, String str2, String[] strArr, String[] strArr2) {
        long longValue;
        A07();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"COL_PHONE_ID", "COL_TIMESTAMP", "COL_ORIGIN"});
        String callingPackage = getCallingPackage();
        Context context = getContext();
        if (context != null && callingPackage != null && 0jU.A00(context, callingPackage)) {
            try {
                Context context2 = getContext();
                if (context2 == null) {
                    return new MatrixCursor(new String[]{"COL_PHONE_ID", "COL_TIMESTAMP", "COL_ORIGIN"});
                }
                HashMap A00 = 0jW.A00(context2);
                if (!A00.containsKey("phone_id")) {
                    new MatrixCursor(new String[]{"COL_PHONE_ID", "COL_TIMESTAMP", "COL_ORIGIN"});
                }
                Object obj = A00.get("phone_id");
                if (A00.get("phone_id_ts") == null) {
                    longValue = 0;
                } else {
                    Long l = (Long) A00.get("phone_id_ts");
                    11T.A0D(l);
                    longValue = l.longValue();
                }
                Object obj2 = A00.get("origin");
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"COL_PHONE_ID", "COL_TIMESTAMP", "COL_ORIGIN"});
                matrixCursor2.addRow(new String[]{(String) obj, String.valueOf(longValue), (String) obj2});
                return matrixCursor2;
            } catch (Exception unused) {
            }
        }
        return matrixCursor;
    }

    @Override // X.C0qt
    public boolean A09() {
        return true;
    }
}
