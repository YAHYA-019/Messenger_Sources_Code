package org.microg.safeparcel;

import X.LGc;
import android.os.Parcel;
import org.json.JSONObject;

/* loaded from: AutoSafeParcelable.class */
public abstract class AutoSafeParcelable implements SafeParcelable {
    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt((char) (-1));
        return parcel.dataPosition();
    }

    public static LGc A01(Class cls) {
        return new LGc(cls, 1);
    }

    public static Float A02(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Float.valueOf((float) jSONObject.optDouble(str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x05a7, code lost:
    
        r305 = r305.getSuperclass();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00be. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.microg.safeparcel.AutoSafeParcelable.writeToParcel(android.os.Parcel, int):void");
    }
}
