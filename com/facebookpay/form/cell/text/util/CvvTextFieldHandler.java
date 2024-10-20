package com.facebookpay.form.cell.text.util;

import X.11T;
import X.KOm;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CvvTextFieldHandler.class */
public final class CvvTextFieldHandler implements Parcelable {
    public static final LGp CREATOR = LGp.A00(79);
    public final KOm A00;

    public CvvTextFieldHandler(KOm kOm) {
        this.A00 = kOm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r303.equals(r301.A00 == X.KOm.A05 ? "••••" : "•••") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(java.lang.String r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L44
            r0 = r303
            if (r0 == 0) goto L44
            r0 = r303
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L44
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L44
            r0 = r301
            X.KOm r0 = r0.A00
            r306 = r0
            X.KOm r0 = X.KOm.A05
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L48
            java.lang.String r0 = "••••"
            r307 = r0
        L37:
            r0 = r303
            r1 = r307
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L46
        L44:
            r0 = 0
            r304 = r0
        L46:
            r0 = r304
            return r0
        L48:
            java.lang.String r0 = "•••"
            r307 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.text.util.CvvTextFieldHandler.A00(java.lang.String, java.lang.String):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        KOm kOm = this.A00;
        parcel.writeString(kOm != null ? kOm.name() : null);
    }
}
