package com.facebook.inspiration.model.movableoverlay;

import X.11T;
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

/* loaded from: InspirationOverlayFeelingsInfo.class */
public final class InspirationOverlayFeelingsInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A08;
    public static final Parcelable.Creator CREATOR = new FKc(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final InspirationOverlayPosition A06;
    public final Set A07;

    public InspirationOverlayFeelingsInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readInt() == 0 ? null : (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayFeelingsInfo(InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, String str3, String str4, String str5, String str6, Set set) {
        C1pq.A08("bubblePosition", str);
        this.A00 = str;
        C1pq.A08("iconId", str2);
        this.A01 = str2;
        C1pq.A08("objectId", str3);
        this.A02 = str3;
        C1pq.A08("objectText", str4);
        this.A03 = str4;
        this.A06 = inspirationOverlayPosition;
        C1pq.A08("taggableActivityId", str5);
        this.A04 = str5;
        C1pq.A08("verbText", str6);
        this.A05 = str6;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (this.A07.contains("overlayPosition")) {
            return this.A06;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayFeelingsInfo)) {
                return false;
            }
            InspirationOverlayFeelingsInfo inspirationOverlayFeelingsInfo = (InspirationOverlayFeelingsInfo) obj;
            if (!11T.A0O(this.A00, inspirationOverlayFeelingsInfo.A00) || !11T.A0O(this.A01, inspirationOverlayFeelingsInfo.A01) || !11T.A0O(this.A02, inspirationOverlayFeelingsInfo.A02) || !11T.A0O(this.A03, inspirationOverlayFeelingsInfo.A03) || !11T.A0O(A00(), inspirationOverlayFeelingsInfo.A00()) || !11T.A0O(this.A04, inspirationOverlayFeelingsInfo.A04) || !11T.A0O(this.A05, inspirationOverlayFeelingsInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        InspirationOverlayPosition inspirationOverlayPosition = this.A06;
        if (inspirationOverlayPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationOverlayPosition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
