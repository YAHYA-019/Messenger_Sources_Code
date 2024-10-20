package com.facebook.messaging.wellbeing.selfremediation.block.user.bottomsheet.data;

import X.11T;
import X.1BL;
import X.4YT;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BNJ;
import X.BNT;
import X.BOM;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: BlockBottomSheetFragmentParams.class */
public final class BlockBottomSheetFragmentParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(96);
    public final BOM A00;
    public final ThreadSummary A01;
    public final BNT A02;
    public final BNJ A03;
    public final User A04;

    public BlockBottomSheetFragmentParams(BOM bom, ThreadSummary threadSummary, BNT bnt, BNJ bnj, User user) {
        1BL.A1F(user, bnt);
        this.A04 = user;
        this.A02 = bnt;
        this.A01 = threadSummary;
        this.A03 = bnj;
        this.A00 = bom;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BlockBottomSheetFragmentParams)) {
                return false;
            }
            BlockBottomSheetFragmentParams blockBottomSheetFragmentParams = (BlockBottomSheetFragmentParams) obj;
            if (!11T.A0O(this.A04, blockBottomSheetFragmentParams.A04) || this.A02 != blockBottomSheetFragmentParams.A02 || !11T.A0O(this.A01, blockBottomSheetFragmentParams.A01) || this.A03 != blockBottomSheetFragmentParams.A03 || this.A00 != blockBottomSheetFragmentParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A02, 1BL.A03(this.A04)) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BlockBottomSheetFragmentParams(user=");
        A0k.append(this.A04);
        A0k.append(", entryPoint=");
        A0k.append(this.A02);
        A0k.append(4YT.A00(85));
        A0k.append(this.A01);
        A0k.append(", source=");
        A0k.append(this.A03);
        A0k.append(", sourceType=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A04, i);
        1BL.A12(parcel, this.A02);
        parcel.writeParcelable(this.A01, i);
        BNJ bnj = this.A03;
        if (bnj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, bnj);
        }
        BOM bom = this.A00;
        if (bom == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, bom);
        }
    }
}
