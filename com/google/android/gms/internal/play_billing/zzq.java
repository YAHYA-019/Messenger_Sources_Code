package com.google.android.gms.internal.play_billing;

import X.0FI;
import X.JQy;
import X.L9a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zzq.class */
public final class zzq implements IInterface, zzs {
    public final IBinder A00;

    public zzq(IBinder iBinder) {
        this("com.android.vending.billing.IInAppBillingService", iBinder);
        0FI.A09(-54439185, 0FI.A03(-1240290399));
    }

    public zzq(String str, IBinder iBinder) {
        int A03 = 0FI.A03(678282863);
        this.A00 = iBinder;
        0FI.A09(-1496362575, A03);
    }

    public static Bundle A00(Parcel parcel, zzq zzqVar, int i) {
        Parcel A03 = zzqVar.A03(parcel, i);
        Bundle bundle = (Bundle) L9a.A00(A03, Bundle.CREATOR);
        A03.recycle();
        return bundle;
    }

    public static void A01(Parcel parcel, String str, String str2, int i) {
        parcel.writeInt(i);
        parcel.writeString(str);
        parcel.writeString(str2);
    }

    private final Parcel A02() {
        int A03 = 0FI.A03(-1274318119);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        0FI.A09(-795885213, A03);
        return obtain;
    }

    private final Parcel A03(Parcel parcel, int i) {
        int A03 = 0FI.A03(191137988);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                JQy.A14(this.A00, parcel, obtain, i);
                parcel.recycle();
                0FI.A09(1188140812, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                0FI.A09(1426428882, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            0FI.A09(1628576773, A03);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int DC4(int i, String str, String str2) {
        int A03 = 0FI.A03(-638272200);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        Parcel A032 = A03(A02, 5);
        int readInt = A032.readInt();
        A032.recycle();
        0FI.A09(-1484769603, A03);
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int DCV(Bundle bundle, String str, String str2, int i) {
        int A03 = 0FI.A03(-1198202798);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        L9a.A01(A02, bundle);
        Parcel A032 = A03(A02, 10);
        int readInt = A032.readInt();
        A032.recycle();
        0FI.A09(72009387, A03);
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DCb(Bundle bundle, String str, String str2, int i) {
        int A03 = 0FI.A03(1246135016);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 902);
        0FI.A09(152304438, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DCj(Bundle bundle, String str, String str2, int i) {
        int A03 = 0FI.A03(272557791);
        Parcel A02 = A02();
        A01(A02, str, str2, 9);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 12);
        0FI.A09(1058619827, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DCp(String str, String str2, String str3, String str4, int i) {
        int A03 = 0FI.A03(-1307383102);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        A02.writeString(null);
        Bundle A00 = A00(A02, this, 3);
        0FI.A09(-364791396, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DCw(Bundle bundle, String str, String str2, String str3, String str4, int i) {
        int A03 = 0FI.A03(970179152);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        A02.writeString(null);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 8);
        0FI.A09(-1636542717, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DD2(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = 0FI.A03(1867122103);
        Parcel A02 = A02();
        A01(A02, str, str2, 6);
        A02.writeString(str3);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 9);
        0FI.A09(-2143232390, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DD6(String str, String str2, String str3, int i) {
        int A03 = 0FI.A03(-744358610);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        A02.writeString(str3);
        Bundle A00 = A00(A02, this, 4);
        0FI.A09(1149163865, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DDA(Bundle bundle, String str, String str2, String str3, int i) {
        int A03 = 0FI.A03(277151362);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        A02.writeString(str3);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 11);
        0FI.A09(1936986514, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DDD(Bundle bundle, String str, String str2, int i) {
        int A03 = 0FI.A03(-1186087047);
        Parcel A02 = A02();
        A01(A02, str, str2, 3);
        L9a.A01(A02, bundle);
        Bundle A00 = A00(A02, this, 2);
        0FI.A09(250668223, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final Bundle DDG(Bundle bundle, Bundle bundle2, String str, String str2, int i) {
        int A03 = 0FI.A03(1543223846);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        L9a.A01(A02, bundle);
        L9a.A01(A02, bundle2);
        Bundle A00 = A00(A02, this, 901);
        0FI.A09(-2333570, A03);
        return A00;
    }

    @Override // com.google.android.gms.internal.play_billing.zzs
    public final int DDV(int i, String str, String str2) {
        int A03 = 0FI.A03(1533316962);
        Parcel A02 = A02();
        A01(A02, str, str2, i);
        Parcel A032 = A03(A02, 1);
        int readInt = A032.readInt();
        A032.recycle();
        0FI.A09(1329997573, A03);
        return readInt;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = 0FI.A03(-484911195);
        IBinder iBinder = this.A00;
        0FI.A09(631168460, A03);
        return iBinder;
    }
}
