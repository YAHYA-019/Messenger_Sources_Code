package com.facebook.messaging.communitymessaging.channeljoining.bottomsheet;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.channeljoining.bottomsheet.model.ChannelJoiningBottomSheetSubtitleModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: ChannelJoiningBottomSheetModel.class */
public final class ChannelJoiningBottomSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(59);
    public final MigColorScheme A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelJoiningBottomSheetModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A03 = parcel.readString();
        this.A00 = (MigColorScheme) parcel.readParcelable(A0e);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A0A = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 15) : num;
        int readInt = parcel.readInt();
        ChannelJoiningBottomSheetSubtitleModel[] channelJoiningBottomSheetSubtitleModelArr = new ChannelJoiningBottomSheetSubtitleModel[readInt];
        for (int i = 0; i < readInt; i++) {
            channelJoiningBottomSheetSubtitleModelArr[i] = ChannelJoiningBottomSheetSubtitleModel.CREATOR.createFromParcel(parcel);
        }
        this.A01 = ImmutableList.copyOf(channelJoiningBottomSheetSubtitleModelArr);
        this.A08 = parcel.readString();
    }

    public ChannelJoiningBottomSheetModel(MigColorScheme migColorScheme, ImmutableList immutableList, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.A09 = z;
        C1pq.A08("channelName", str);
        this.A03 = str;
        C1pq.A08("colorScheme", migColorScheme);
        this.A00 = migColorScheme;
        this.A04 = str2;
        this.A05 = str3;
        this.A0A = z2;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = num;
        this.A01 = immutableList;
        C1pq.A08("threadId", str6);
        this.A08 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChannelJoiningBottomSheetModel)) {
                return false;
            }
            ChannelJoiningBottomSheetModel channelJoiningBottomSheetModel = (ChannelJoiningBottomSheetModel) obj;
            if (this.A09 != channelJoiningBottomSheetModel.A09 || !11T.A0O(this.A03, channelJoiningBottomSheetModel.A03) || !11T.A0O(this.A00, channelJoiningBottomSheetModel.A00) || !11T.A0O(this.A04, channelJoiningBottomSheetModel.A04) || !11T.A0O(this.A05, channelJoiningBottomSheetModel.A05) || this.A0A != channelJoiningBottomSheetModel.A0A || !11T.A0O(this.A06, channelJoiningBottomSheetModel.A06) || !11T.A0O(this.A07, channelJoiningBottomSheetModel.A07) || this.A02 != channelJoiningBottomSheetModel.A02 || !11T.A0O(this.A01, channelJoiningBottomSheetModel.A01) || !11T.A0O(this.A08, channelJoiningBottomSheetModel.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A05(this.A09))))), this.A0A)));
        return C1pq.A04(this.A08, C1pq.A04(this.A01, (A04 * 31) + C3o5.A04(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A0A ? 1 : 0);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        C3o5.A0f(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            ((ChannelJoiningBottomSheetSubtitleModel) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
    }
}
