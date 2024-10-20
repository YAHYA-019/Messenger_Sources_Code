package com.facebook.messaging.communitymessaging.channeljoining.bottomsheet.model;

import X.11T;
import X.2KE;
import X.7zL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ChannelJoiningBottomSheetSubtitleModel.class */
public final class ChannelJoiningBottomSheetSubtitleModel implements Parcelable {
    public static volatile 2KE A04;
    public static volatile Float A05;
    public static final Parcelable.Creator CREATOR = CSW.A00(60);
    public final String A00;
    public final 2KE A01;
    public final Float A02;
    public final Set A03;

    public ChannelJoiningBottomSheetSubtitleModel(2KE r302, Float f, String str, Set set) {
        this.A02 = f;
        C1pq.A08("subtitleString", str);
        this.A00 = str;
        this.A01 = r302;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public ChannelJoiningBottomSheetSubtitleModel(Parcel parcel) {
        2KE r305 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = Float.valueOf(parcel.readFloat());
        }
        this.A00 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? 2KE.values()[parcel.readInt()] : r305;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public float A00() {
        Float f;
        if (this.A03.contains("bottomPadding")) {
            f = this.A02;
        } else {
            if (A05 == null) {
                synchronized (this) {
                    if (A05 == null) {
                        A05 = Float.valueOf(7zL.A02());
                    }
                }
            }
            f = A05;
        }
        return f.floatValue();
    }

    public 2KE A01() {
        if (this.A03.contains("textStyle")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = 2KE.A09;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChannelJoiningBottomSheetSubtitleModel)) {
                return false;
            }
            ChannelJoiningBottomSheetSubtitleModel channelJoiningBottomSheetSubtitleModel = (ChannelJoiningBottomSheetSubtitleModel) obj;
            if (A00() != channelJoiningBottomSheetSubtitleModel.A00() || !11T.A0O(this.A00, channelJoiningBottomSheetSubtitleModel.A00) || A01() != channelJoiningBottomSheetSubtitleModel.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A042 = C1pq.A04(this.A00, Float.floatToIntBits(A00()) + 31);
        return (A042 * 31) + C3o5.A03(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.A00);
        C3o5.A0e(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
