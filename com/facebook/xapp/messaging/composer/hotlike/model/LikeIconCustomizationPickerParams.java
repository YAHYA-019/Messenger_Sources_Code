package com.facebook.xapp.messaging.composer.hotlike.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YT;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.collect.ImmutableList;

/* loaded from: LikeIconCustomizationPickerParams.class */
public final class LikeIconCustomizationPickerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(48);
    public final int A00;
    public final ThreadKey A01;
    public final Emoji A02;
    public final ImmutableList A03;
    public final boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    public LikeIconCustomizationPickerParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        EmojiSet[] emojiSetArr = new EmojiSet[readInt];
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            emojiSetArr[i2] = EmojiSet.CREATOR.createFromParcel(parcel);
            i = i2 + 1;
        }
        this.A03 = ImmutableList.copyOf(emojiSetArr);
        this.A04 = parcel.readInt() == 1 ? true : z;
        this.A02 = parcel.readInt() == 0 ? null : (Emoji) parcel.readParcelable(A0e);
        this.A01 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public LikeIconCustomizationPickerParams(ThreadKey threadKey, Emoji emoji, ImmutableList immutableList, int i, boolean z) {
        this.A00 = i;
        C1pq.A08(4YT.A00(1054), immutableList);
        this.A03 = immutableList;
        this.A04 = z;
        this.A02 = emoji;
        C1pq.A08("threadKey", threadKey);
        this.A01 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LikeIconCustomizationPickerParams)) {
                return false;
            }
            LikeIconCustomizationPickerParams likeIconCustomizationPickerParams = (LikeIconCustomizationPickerParams) obj;
            if (this.A00 != likeIconCustomizationPickerParams.A00 || !11T.A0O(this.A03, likeIconCustomizationPickerParams.A03) || this.A04 != likeIconCustomizationPickerParams.A04 || !11T.A0O(this.A02, likeIconCustomizationPickerParams.A02) || !11T.A0O(this.A01, likeIconCustomizationPickerParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A03, this.A00 + 31), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            ((EmojiSet) A0b.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        4YW.A0D(parcel, this.A02, i);
        this.A01.writeToParcel(parcel, i);
    }
}
