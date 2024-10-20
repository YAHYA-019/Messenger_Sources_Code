package com.google.android.gms.common.internal;

import X.0FI;
import X.1BK;
import X.C4Ny;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: GetServiceRequest.class */
public final class GetServiceRequest extends AbstractSafeParcelable {
    public Account A00;
    public Bundle A01;
    public IBinder A02;
    public String A03;
    public boolean A04;
    public Feature[] A05;
    public Feature[] A06;
    public Scope[] A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final String A0C;
    public final boolean A0D;
    public static final Parcelable.Creator CREATOR = new C4Ny(56);
    public static final Scope[] A0F = new Scope[0];
    public static final Feature[] A0E = new Feature[0];

    public GetServiceRequest(Account account, Bundle bundle, IBinder iBinder, String str, String str2, Feature[] featureArr, Feature[] featureArr2, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        scopeArr = scopeArr == null ? A0F : scopeArr;
        bundle = bundle == null ? 1BK.A05() : bundle;
        featureArr = featureArr == null ? A0E : featureArr;
        featureArr2 = featureArr2 == null ? A0E : featureArr2;
        this.A08 = i;
        this.A09 = i2;
        this.A0A = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A03 = "com.google.android.gms";
        } else {
            this.A03 = str;
        }
        if (i >= 2) {
            this.A02 = iBinder;
        } else if (iBinder != null) {
            IAccountAccessor A00 = AccountAccessor.A00(iBinder);
            account = null;
            if (A00 != null) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        zzw zzwVar = (zzw) A00;
                        int A03 = 0FI.A03(-614451690);
                        Parcel A01 = zzwVar.A01(zzwVar.A00(), 2);
                        Account account2 = (Account) (A01.readInt() == 0 ? null : (Parcelable) Account.CREATOR.createFromParcel(A01));
                        A01.recycle();
                        0FI.A09(-404792422, A03);
                        account = account2;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } else {
            account = null;
        }
        this.A00 = account;
        this.A07 = scopeArr;
        this.A01 = bundle;
        this.A05 = featureArr;
        this.A06 = featureArr2;
        this.A0D = z;
        this.A0B = i4;
        this.A04 = z2;
        this.A0C = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C4Ny.A00(parcel, this, i);
    }
}
