package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayChannelInfo.class */
public final class InspirationOverlayChannelInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A0C;
    public static final Parcelable.Creator CREATOR = new FKc(21);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final InspirationOverlayPosition A0A;
    public final Set A0B;

    public InspirationOverlayChannelInfo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt();
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A0A = parcel.readInt() != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : inspirationOverlayPosition;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0B = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayChannelInfo(InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, int i) {
        C1pq.A08("entryPoint", str);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A0A = inspirationOverlayPosition;
        C1pq.A08("stickerStyle", str5);
        this.A05 = str5;
        C1pq.A08("threadDescription", str6);
        this.A06 = str6;
        C1pq.A08("threadId", str7);
        this.A07 = str7;
        C1pq.A08("threadImageUrl", str8);
        this.A08 = str8;
        C1pq.A08("threadName", str9);
        this.A09 = str9;
        this.A0B = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (this.A0B.contains("overlayPosition")) {
            return this.A0A;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayChannelInfo)) {
                return false;
            }
            InspirationOverlayChannelInfo inspirationOverlayChannelInfo = (InspirationOverlayChannelInfo) obj;
            if (!11T.A0O(this.A01, inspirationOverlayChannelInfo.A01) || this.A00 != inspirationOverlayChannelInfo.A00 || !11T.A0O(this.A02, inspirationOverlayChannelInfo.A02) || !11T.A0O(this.A03, inspirationOverlayChannelInfo.A03) || !11T.A0O(this.A04, inspirationOverlayChannelInfo.A04) || !11T.A0O(A00(), inspirationOverlayChannelInfo.A00()) || !11T.A0O(this.A05, inspirationOverlayChannelInfo.A05) || !11T.A0O(this.A06, inspirationOverlayChannelInfo.A06) || !11T.A0O(this.A07, inspirationOverlayChannelInfo.A07) || !11T.A0O(this.A08, inspirationOverlayChannelInfo.A08) || !11T.A0O(this.A09, inspirationOverlayChannelInfo.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(A00(), C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, (C1pq.A03(this.A01) * 31) + this.A00)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        InspirationOverlayPosition inspirationOverlayPosition = this.A0A;
        if (inspirationOverlayPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationOverlayPosition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        Iterator A0S = C3o5.A0S(parcel, this.A0B);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
