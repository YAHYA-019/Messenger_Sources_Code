package androidx.fragment.app;

import X.06Z;
import X.0Pz;
import X.0qB;
import X.AnonymousClass001;
import X.C06c;
import X.C09x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: BackStackRecordState.class */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qB(0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    public BackStackRecordState(C06c c06c) {
        ArrayList arrayList = c06c.A0C;
        int size = arrayList.size();
        int[] iArr = new int[size * 6];
        this.A0D = iArr;
        if (!c06c.A0F) {
            throw AnonymousClass001.A0N("Not on back stack");
        }
        ArrayList arrayList2 = new ArrayList(size);
        this.A07 = arrayList2;
        int[] iArr2 = new int[size];
        this.A0C = iArr2;
        int[] iArr3 = new int[size];
        this.A0B = iArr3;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C09x c09x = (C09x) arrayList.get(i2);
            int i3 = i + 1;
            iArr[i] = c09x.A00;
            Fragment fragment = c09x.A05;
            arrayList2.add(fragment != null ? fragment.mWho : null);
            int i4 = i3 + 1;
            iArr[i3] = c09x.A08 ? 1 : 0;
            int i5 = i4 + 1;
            iArr[i4] = c09x.A01;
            int i6 = i5 + 1;
            iArr[i5] = c09x.A02;
            int i7 = i6 + 1;
            iArr[i6] = c09x.A03;
            i = i7 + 1;
            iArr[i7] = c09x.A04;
            iArr2[i2] = c09x.A07.ordinal();
            iArr3[i2] = c09x.A06.ordinal();
        }
        this.A03 = c06c.A06;
        this.A06 = c06c.A0A;
        this.A02 = c06c.A07;
        this.A01 = c06c.A01;
        this.A05 = c06c.A09;
        this.A00 = c06c.A00;
        this.A04 = c06c.A08;
        this.A08 = c06c.A0D;
        this.A09 = c06c.A0E;
        this.A0A = c06c.A0G;
    }

    public BackStackRecordState(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = parcel.readInt() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.09x, java.lang.Object] */
    private void A00(C06c c06c) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int[] iArr = this.A0D;
            boolean z = true;
            if (i >= iArr.length) {
                c06c.A06 = this.A03;
                c06c.A0A = this.A06;
                c06c.A0F = true;
                c06c.A01 = this.A01;
                c06c.A09 = this.A05;
                c06c.A00 = this.A00;
                c06c.A08 = this.A04;
                c06c.A0D = this.A08;
                c06c.A0E = this.A09;
                c06c.A0G = this.A0A;
                return;
            }
            ?? obj = new Object();
            int i4 = i + 1;
            obj.A00 = iArr[i];
            if (06Z.A0O(2)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Instantiate ");
                A0k.append(c06c);
                A0k.append(" op #");
                A0k.append(i3);
                A0k.append(" base fragment #");
                A0k.append(iArr[i4]);
                AnonymousClass001.A17(A0k);
            }
            obj.A07 = Lifecycle.State.values()[this.A0C[i3]];
            obj.A06 = Lifecycle.State.values()[this.A0B[i3]];
            int i5 = i4 + 1;
            if (iArr[i4] == 0) {
                z = false;
            }
            obj.A08 = z;
            int i6 = i5 + 1;
            int i7 = iArr[i5];
            obj.A01 = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            obj.A02 = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            obj.A03 = i11;
            i = i10 + 1;
            int i12 = iArr[i10];
            obj.A04 = i12;
            c06c.A02 = i7;
            c06c.A03 = i9;
            c06c.A04 = i11;
            c06c.A05 = i12;
            c06c.A0S(obj);
            i2 = i3 + 1;
        }
    }

    public C06c A01(06Z r302) {
        C06c c06c = new C06c(r302);
        A00(c06c);
        c06c.A07 = this.A02;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A07;
            if (i2 >= arrayList.size()) {
                c06c.A0B(1);
                return c06c;
            }
            String str = (String) arrayList.get(i2);
            if (str != null) {
                ((C09x) c06c.A0C.get(i2)).A05 = r302.A0a(str);
            }
            i = i2 + 1;
        }
    }

    public C06c A02(06Z r302, Map map) {
        C06c c06c = new C06c(r302);
        A00(c06c);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A07;
            if (i >= arrayList.size()) {
                return c06c;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment == null) {
                    throw AnonymousClass001.A0N(0Pz.A0z("Restoring FragmentTransaction ", this.A06, " failed due to missing saved state for Fragment (", str, ")"));
                }
                ((C09x) c06c.A0C.get(i)).A05 = fragment;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
