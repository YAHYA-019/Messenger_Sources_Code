package androidx.fragment.app;

import X.0qE;
import X.AnonymousClass001;
import X.C06l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* loaded from: FragmentState.class */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(2);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String mClassName;
    public final String mWho;

    public FragmentState(Parcel parcel) {
        this.mClassName = parcel.readString();
        this.mWho = parcel.readString();
        boolean z = true;
        this.A07 = parcel.readInt() != 0;
        this.A09 = parcel.readInt() != 0;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A0B = parcel.readInt() != 0;
        this.A0A = parcel.readInt() != 0;
        this.A06 = parcel.readInt() != 0;
        this.A08 = parcel.readInt() != 0;
        this.A02 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0C = parcel.readInt() == 0 ? false : z;
    }

    public FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mWho = fragment.mWho;
        this.A07 = fragment.mFromLayout;
        this.A09 = fragment.mInDynamicContainer;
        this.A01 = fragment.mFragmentId;
        this.A00 = fragment.mContainerId;
        this.A04 = fragment.mTag;
        this.A0B = fragment.mRetainInstance;
        this.A0A = fragment.mRemoving;
        this.A06 = fragment.mDetached;
        this.A08 = fragment.mHidden;
        this.A02 = fragment.mMaxState.ordinal();
        this.A05 = fragment.mTargetWho;
        this.A03 = fragment.mTargetRequestCode;
        this.A0C = fragment.mUserVisibleHint;
    }

    public Fragment A00(C06l c06l, ClassLoader classLoader) {
        Fragment A02 = c06l.A02(classLoader, this.mClassName);
        A02.mWho = this.mWho;
        A02.mFromLayout = this.A07;
        A02.mInDynamicContainer = this.A09;
        A02.mRestored = true;
        A02.mFragmentId = this.A01;
        A02.mContainerId = this.A00;
        A02.mTag = this.A04;
        A02.mRetainInstance = this.A0B;
        A02.mRemoving = this.A0A;
        A02.mDetached = this.A06;
        A02.mHidden = this.A08;
        A02.mMaxState = Lifecycle.State.values()[this.A02];
        A02.mTargetWho = this.A05;
        A02.mTargetRequestCode = this.A03;
        A02.mUserVisibleHint = this.A0C;
        return A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(128);
        A0l.append("FragmentState{");
        A0l.append(this.mClassName);
        A0l.append(" (");
        A0l.append(this.mWho);
        A0l.append(")}:");
        if (this.A07) {
            A0l.append(" fromLayout");
        }
        if (this.A09) {
            A0l.append(" dynamicContainer");
        }
        int i = this.A00;
        if (i != 0) {
            A0l.append(" id=0x");
            A0l.append(Integer.toHexString(i));
        }
        String str = this.A04;
        if (str != null && !str.isEmpty()) {
            A0l.append(" tag=");
            A0l.append(str);
        }
        if (this.A0B) {
            A0l.append(" retainInstance");
        }
        if (this.A0A) {
            A0l.append(" removing");
        }
        if (this.A06) {
            A0l.append(" detached");
        }
        if (this.A08) {
            A0l.append(" hidden");
        }
        String str2 = this.A05;
        if (str2 != null) {
            A0l.append(" targetWho=");
            A0l.append(str2);
            A0l.append(" targetRequestCode=");
            A0l.append(this.A03);
        }
        if (this.A0C) {
            A0l.append(" userVisibleHint");
        }
        return A0l.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClassName);
        parcel.writeString(this.mWho);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0C ? 1 : 0);
    }
}
