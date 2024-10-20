package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.timeline.majorlifeevent.creation.media.model.DefaultContent;
import com.facebook.timeline.majorlifeevent.creation.model.ComposerDateInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerMajorLifeEventData.class */
public final class ComposerMajorLifeEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(41);
    public final LifeEventAttachmentData A00;
    public final DefaultContent A01;
    public final ComposerDateInfo A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public ComposerMajorLifeEventData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A07 = parcel.readString();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ComposerDateInfo) ComposerDateInfo.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt = parcel.readInt();
            DefaultContent[] defaultContentArr = new DefaultContent[readInt];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                } else {
                    i2 = DKG.A02(parcel, DefaultContent.CREATOR, defaultContentArr, i3);
                }
            }
            this.A03 = ImmutableList.copyOf(defaultContentArr);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (DefaultContent) DefaultContent.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (LifeEventAttachmentData) parcel.readParcelable(A0e);
        }
        int readInt2 = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt2];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= readInt2) {
                break;
            } else {
                i4 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i5);
            }
        }
        this.A04 = ImmutableList.copyOf(mediaDataArr);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt3 = parcel.readInt();
            MediaData[] mediaDataArr2 = new MediaData[readInt3];
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= readInt3) {
                    break;
                } else {
                    i6 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr2, i7);
                }
            }
            this.A05 = ImmutableList.copyOf(mediaDataArr2);
        }
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            String[] strArr = new String[readInt4];
            while (i < readInt4) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A06 = immutableList;
    }

    public ComposerMajorLifeEventData(LifeEventAttachmentData lifeEventAttachmentData, DefaultContent defaultContent, ComposerDateInfo composerDateInfo, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, String str, String str2, String str3, String str4) {
        C1pq.A08("categoryName", str);
        this.A07 = str;
        this.A02 = composerDateInfo;
        this.A03 = immutableList;
        this.A08 = str2;
        this.A01 = defaultContent;
        this.A09 = str3;
        this.A0A = str4;
        this.A00 = lifeEventAttachmentData;
        C1pq.A08("mediaList", immutableList2);
        this.A04 = immutableList2;
        this.A05 = immutableList3;
        this.A06 = immutableList4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMajorLifeEventData)) {
                return false;
            }
            ComposerMajorLifeEventData composerMajorLifeEventData = (ComposerMajorLifeEventData) obj;
            if (!11T.A0O(this.A07, composerMajorLifeEventData.A07) || !11T.A0O(this.A02, composerMajorLifeEventData.A02) || !11T.A0O(this.A03, composerMajorLifeEventData.A03) || !11T.A0O(this.A08, composerMajorLifeEventData.A08) || !11T.A0O(this.A01, composerMajorLifeEventData.A01) || !11T.A0O(this.A09, composerMajorLifeEventData.A09) || !11T.A0O(this.A0A, composerMajorLifeEventData.A0A) || !11T.A0O(this.A00, composerMajorLifeEventData.A00) || !11T.A0O(this.A04, composerMajorLifeEventData.A04) || !11T.A0O(this.A05, composerMajorLifeEventData.A05) || !11T.A0O(this.A06, composerMajorLifeEventData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A07)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        ComposerDateInfo composerDateInfo = this.A02;
        if (composerDateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerDateInfo.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((DefaultContent) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        1BL.A13(parcel, this.A08);
        DefaultContent defaultContent = this.A01;
        if (defaultContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultContent.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        C3o5.A0d(parcel, this.A00, i);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        ImmutableList immutableList2 = this.A05;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                DKG.A1I(parcel, A0Y2, i);
            }
        }
        ImmutableList immutableList3 = this.A06;
        if (immutableList3 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
        while (A0Y3.hasNext()) {
            C3o5.A0h(parcel, A0Y3);
        }
    }
}
