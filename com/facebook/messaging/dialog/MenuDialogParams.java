package com.facebook.messaging.dialog;

import X.1BK;
import X.7Z3;
import X.7zL;
import X.7zM;
import X.AnonymousClass001;
import X.C23u;
import X.FJ8;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: MenuDialogParams.class */
public final class MenuDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(39);
    public final int A00;
    public final ImmutableList A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public MenuDialogParams(7Z3 r302) {
        int i = r302.A00;
        this.A00 = i;
        String str = r302.A02;
        this.A03 = str;
        this.A04 = r302.A04;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) r302.A03);
        this.A01 = copyOf;
        this.A02 = r302.A01;
        Preconditions.checkArgument((str == null) ^ AnonymousClass001.A1O(i));
        Preconditions.checkArgument(7zM.A1b(copyOf));
    }

    public MenuDialogParams(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = false;
        ClassLoader classLoader = MenuDialogItem.class.getClassLoader();
        this.A01 = ImmutableList.copyOf((Collection) parcel.readArrayList(classLoader));
        Bundle readBundle = parcel.readBundle(classLoader);
        Object obj = null;
        if (readBundle != null) {
            try {
                obj = FJ8.A03(readBundle, "extra_data");
                if (obj instanceof Bundle) {
                    ((Bundle) obj).setClassLoader(classLoader);
                }
            } catch (IllegalStateException unused) {
                this.A02 = null;
                return;
            }
        }
        this.A02 = obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeList(this.A01);
        Bundle A05 = 1BK.A05();
        Object obj = this.A02;
        if (obj instanceof C23u) {
            FJ8.A08(A05, (C23u) obj, "extra_data");
        } else if (obj instanceof Parcelable) {
            A05.putParcelable("extra_data", (Parcelable) obj);
        } else if (obj != null) {
            throw new UnsupportedOperationException();
        }
        parcel.writeBundle(A05);
    }
}
