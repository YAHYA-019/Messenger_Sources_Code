package com.google.android.gms.common.data;

import X.0FI;
import X.0Pz;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.Kja;
import X.LGn;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

/* loaded from: DataHolder.class */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public int[] A03;
    public final int A04;
    public final int A05;
    public final Bundle A06;
    public final CursorWindow[] A07;
    public final String[] A08;
    public static final Parcelable.Creator CREATOR = LGn.A00(80);
    public static final Kja A09 = new Kja(new String[0]);

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A04 = i;
        this.A08 = strArr;
        this.A07 = cursorWindowArr;
        this.A05 = i2;
        this.A06 = bundle;
    }

    public static final void A00(DataHolder dataHolder, String str, int i) {
        boolean z;
        Bundle bundle = dataHolder.A01;
        if (bundle == null || !bundle.containsKey(str)) {
            throw AnonymousClass001.A0L("No such column: ".concat(String.valueOf(str)));
        }
        synchronized (dataHolder) {
            z = dataHolder.A02;
        }
        if (z) {
            throw AnonymousClass001.A0L("Buffer is closed.");
        }
        if (i < 0 || i >= dataHolder.A00) {
            throw new CursorIndexOutOfBoundsException(i, dataHolder.A00);
        }
    }

    public int A01(int i) {
        int length;
        int i2 = 0;
        if (i < 0 || i >= this.A00) {
            throw JQx.A0o();
        }
        while (true) {
            int[] iArr = this.A03;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2--;
        }
        return i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    int i2 = i;
                    CursorWindow[] cursorWindowArr = this.A07;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i = i2 + 1;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        int A03 = 0FI.A03(-1964817035);
        try {
            if (this.A07.length > 0) {
                synchronized (this) {
                    z = this.A02;
                }
                if (!z) {
                    close();
                    Log.e("DataBuffer", 0Pz.A0j("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", toString(), ")"));
                }
            }
            0FI.A09(1933100537, A03);
        } catch (Throwable th) {
            0FI.A09(1213328606, A03);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.A08;
        int A0E = JQx.A0E(parcel);
        if (strArr != null) {
            int A01 = AbstractC01153q8.A01(parcel, 1);
            parcel.writeStringArray(strArr);
            AbstractC01153q8.A03(parcel, A01);
        }
        AbstractC01153q8.A0C(parcel, this.A07, 2, i);
        AbstractC01153q8.A04(parcel, 3, this.A05);
        AbstractC01153q8.A02(this.A06, parcel, 4);
        AbstractC01153q8.A04(parcel, 1000, this.A04);
        AbstractC01153q8.A03(parcel, A0E);
        if ((i & 1) != 0) {
            close();
        }
    }
}
