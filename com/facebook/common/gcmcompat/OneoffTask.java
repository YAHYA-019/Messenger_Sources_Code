package com.facebook.common.gcmcompat;

import X.0Pz;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.DKf;
import X.JR0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: OneoffTask.class */
public final class OneoffTask implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(95);
    public long A00;
    public long A01;
    public final int A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public OneoffTask(Bundle bundle, String str, String str2, long j, long j2, boolean z) {
        this.A03 = bundle;
        this.A02 = 0;
        this.A07 = false;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = true;
        this.A08 = z;
        this.A01 = j2;
        this.A00 = j;
    }

    public OneoffTask(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = 1BM.A07(parcel);
        this.A02 = parcel.readInt();
        this.A07 = AbJ.A1W(parcel);
        this.A03 = parcel.readBundle(4YV.A0e(this));
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
    }

    public static void A00(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            if (obtain.dataSize() > 10240) {
                obtain.recycle();
                throw 0Pz.A05("Extras exceeding maximum size(10240 bytes): ", Integer.toString(obtain.dataSize()));
            }
            obtain.recycle();
            Iterator A0w = JR0.A0w(bundle);
            while (A0w.hasNext()) {
                Object obj = bundle.get(AnonymousClass001.A0i(A0w));
                if (obj instanceof Bundle) {
                    A00((Bundle) obj);
                } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    throw AnonymousClass001.A0L("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                }
            }
        }
    }

    public static void A01(String str) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L("Must provide a valid tag.");
        }
        if (str.length() > 100) {
            throw AnonymousClass001.A0L("Tag is larger than max permissible tag length (100)");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeBundle(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
