package fxcache.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zK;
import X.7zN;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FxCalAccountWithSwitcherInfo.class */
public final class FxCalAccountWithSwitcherInfo implements Parcelable {
    public String A04 = "";
    public String A06 = "";
    public String A05 = "";
    public String A07 = "";
    public String A09 = "";
    public String A0C = "";
    public String A08 = "";
    public int A00 = 0;
    public int A03 = 0;
    public int A01 = 0;
    public String A0B = "";
    public boolean A0D = false;
    public String A0A = "";
    public int A02 = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FxCalAccountWithSwitcherInfo)) {
                return false;
            }
            FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) obj;
            if (!11T.A0O(this.A04, fxCalAccountWithSwitcherInfo.A04) || !11T.A0O(this.A06, fxCalAccountWithSwitcherInfo.A06) || !11T.A0O(this.A05, fxCalAccountWithSwitcherInfo.A05) || !11T.A0O(this.A07, fxCalAccountWithSwitcherInfo.A07) || !11T.A0O(this.A09, fxCalAccountWithSwitcherInfo.A09) || !11T.A0O(this.A0C, fxCalAccountWithSwitcherInfo.A0C) || !11T.A0O(this.A08, fxCalAccountWithSwitcherInfo.A08) || this.A00 != fxCalAccountWithSwitcherInfo.A00 || this.A03 != fxCalAccountWithSwitcherInfo.A03 || this.A01 != fxCalAccountWithSwitcherInfo.A01 || !11T.A0O(this.A0B, fxCalAccountWithSwitcherInfo.A0B) || this.A0D != fxCalAccountWithSwitcherInfo.A0D || !11T.A0O(this.A0A, fxCalAccountWithSwitcherInfo.A0A) || this.A02 != fxCalAccountWithSwitcherInfo.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass002.A07(this.A05, (4YV.A02(this.A04) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A08)) * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31) + 1BL.A05(this.A0B)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + 7zN.A05(this.A0A)) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FxCalAccountWithSwitcherInfo(accountId=");
        A0k.append(this.A04);
        A0k.append(AbstractC00603o4.A00(322));
        A0k.append(this.A06);
        A0k.append(", accountType=");
        A0k.append(this.A05);
        A0k.append(", name=");
        A0k.append(this.A07);
        A0k.append(7zK.A00(5));
        A0k.append(this.A09);
        A0k.append(AbstractC00603o4.A00(94));
        A0k.append(this.A0C);
        A0k.append(AbstractC00603o4.A00(323));
        A0k.append(this.A08);
        A0k.append(AbstractC00603o4.A00(92));
        A0k.append(this.A00);
        A0k.append(AbstractC00603o4.A00(325));
        A0k.append(this.A03);
        A0k.append(", igL28=");
        A0k.append(this.A01);
        A0k.append(AbstractC00603o4.A00(326));
        A0k.append(this.A0B);
        A0k.append(", hasThreadsAccount=");
        A0k.append(this.A0D);
        A0k.append(", threadsProfilePictureUrl=");
        A0k.append(this.A0A);
        A0k.append(", threadsBadgeCount=");
        return DKH.A0p(A0k, this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A02);
    }
}
