package com.facebook.messaging.media.viewer;

import X.AnonymousClass001;
import X.C2609Giy;
import X.C87p;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaPagerAdapter$MediaSaveState.class */
public final class MediaPagerAdapter$MediaSaveState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(30);
    public final C87p A00;
    public final C2609Giy A01;
    public final String A02;

    public MediaPagerAdapter$MediaSaveState(C87p c87p, C2609Giy c2609Giy, String str) {
        this.A02 = str;
        this.A01 = c2609Giy;
        this.A00 = c87p;
    }

    public MediaPagerAdapter$MediaSaveState(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = readString;
        boolean z = true;
        this.A01 = new C2609Giy(parcel.readInt(), AnonymousClass001.A1P(parcel.readInt()), 0);
        this.A00 = new C87p(parcel.readInt() <= 0 ? false : z, 6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0.A02 == false) goto L6;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A02
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            X.Giy r0 = r0.A01
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L27
            r0 = r305
            boolean r0 = r0.A02
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L2c
        L27:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
        L2c:
            r0 = r302
            r1 = r308
            r0.writeInt(r1)
            r0 = r305
            if (r0 == 0) goto L65
            r0 = r305
            int r0 = r0.A01
            r308 = r0
        L3e:
            r0 = r302
            r1 = r308
            r0.writeInt(r1)
            r0 = r301
            X.87p r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5f
            r0 = r304
            boolean r0 = r0.A00
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L5f
        L58:
            r0 = r302
            r1 = r306
            r0.writeInt(r1)
            return
        L5f:
            r0 = 0
            r306 = r0
            goto L58
        L65:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.MediaPagerAdapter$MediaSaveState.writeToParcel(android.os.Parcel, int):void");
    }
}
