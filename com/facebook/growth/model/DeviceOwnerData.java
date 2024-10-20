package com.facebook.growth.model;

import X.1JF;
import X.7zL;
import X.AnonymousClass001;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: DeviceOwnerData.class */
public final class DeviceOwnerData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(91);
    public Birthday A00 = null;
    public LinkedHashSet A02 = 7zL.A15();
    public LinkedHashSet A03 = 7zL.A15();
    public Set A04 = 7zL.A15();
    public Set A05 = 7zL.A15();
    public String A01 = "";

    public ImmutableList A00() {
        ImmutableList copyOf;
        synchronized (this) {
            copyOf = ImmutableList.copyOf((Collection) this.A02);
        }
        return copyOf;
    }

    public String A01() {
        String str;
        synchronized (this) {
            str = this.A01;
        }
        return str;
    }

    public void A02(DeviceOwnerData deviceOwnerData) {
        synchronized (this) {
            if (deviceOwnerData != null) {
                if (this.A00 == null) {
                    this.A00 = deviceOwnerData.A00;
                }
                Iterator it = deviceOwnerData.A02.iterator();
                while (it.hasNext()) {
                    this.A02.add(AnonymousClass001.A0i(it));
                }
                Iterator it2 = deviceOwnerData.A03.iterator();
                while (it2.hasNext()) {
                    this.A03.add(AnonymousClass001.A0i(it2));
                }
                Iterator it3 = deviceOwnerData.A04.iterator();
                while (it3.hasNext()) {
                    this.A04.add((FullName) it3.next());
                }
                Iterator it4 = deviceOwnerData.A05.iterator();
                while (it4.hasNext()) {
                    this.A05.add(AnonymousClass001.A0i(it4));
                }
                if (1JF.A0A(this.A01)) {
                    this.A01 = deviceOwnerData.A01;
                }
            }
        }
    }

    public void A03(String str) {
        synchronized (this) {
            this.A02.add(str);
        }
    }

    public void A04(String str) {
        synchronized (this) {
            this.A01 = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeStringArray((String[]) this.A02.toArray(new String[0]));
        parcel.writeStringArray((String[]) this.A03.toArray(new String[0]));
        parcel.writeTypedArray((FullName[]) this.A04.toArray(new FullName[0]), i);
        parcel.writeStringArray((String[]) this.A05.toArray(new String[0]));
        parcel.writeString(this.A01);
    }
}
