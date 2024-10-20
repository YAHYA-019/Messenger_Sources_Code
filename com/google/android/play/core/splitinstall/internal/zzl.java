package com.google.android.play.core.splitinstall.internal;

import X.0FI;
import X.1BJ;
import X.4FE;
import X.AnonymousClass001;
import X.C2ug;
import X.C2uj;
import X.C52P;
import X.K2D;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;

/* loaded from: zzl.class */
public abstract class zzl extends Binder implements IInterface {
    public static int A00(zzbh zzbhVar, int i) {
        int A03 = 0FI.A03(i);
        zzbhVar.A01.A00.A02(zzbhVar.A00);
        return A03;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-1032421521, 0FI.A03(-1800318004));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A00;
        int i3;
        boolean z;
        int i4;
        int i5;
        int A03 = 0FI.A03(1437407141);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i5 = 1791072272;
            0FI.A09(i5, A03);
            return z;
        }
        zzbp zzbpVar = (zzbp) this;
        int A032 = 0FI.A03(1924091511);
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                zzbpVar.DDE(readInt, bundle);
                z = true;
                i4 = -2010019424;
                break;
            case 3:
                int readInt2 = parcel.readInt();
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, 1934057034);
                C2ug.A02.A03("onCompleteInstall(%d)", AnonymousClass001.A1a(readInt2));
                i3 = 1781361505;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle2 = (Bundle) C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                zzbpVar.DCL(readInt3, bundle2);
                z = true;
                i4 = -2010019424;
                break;
            case 5:
                int readInt4 = parcel.readInt();
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, 1182649588);
                C2ug.A02.A03("onGetSession(%d)", AnonymousClass001.A1a(readInt4));
                i3 = 2057390965;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 6:
                BaseBundle baseBundle = (BaseBundle) C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                zzbh zzbhVar = (zzbh) zzbpVar;
                A00 = 0FI.A03(-1631494501);
                C2uj c2uj = zzbhVar.A01.A00;
                4FE r0 = zzbhVar.A00;
                c2uj.A02(r0);
                int i6 = baseBundle.getInt(TraceFieldType.ErrorCode);
                C2ug.A02.A02(1BJ.A00(506), AnonymousClass001.A1a(i6));
                r0.A02(new K2D(i6));
                i3 = 883727599;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                C52P.A01(parcel);
                zzbpVar.DD7(createTypedArrayList);
                z = true;
                i4 = -2010019424;
                break;
            case 8:
                Bundle bundle3 = (Bundle) C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                zzbpVar.DCz(bundle3);
                z = true;
                i4 = -2010019424;
                break;
            case 9:
                Bundle bundle4 = (Bundle) C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                zzbpVar.DCf(bundle4);
                z = true;
                i4 = -2010019424;
                break;
            case 10:
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, -116363309);
                C2ug.A02.A03("onGetSplitsForAppUpdate", AnonymousClass001.A1Z());
                i3 = 1512882556;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 11:
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, 171597811);
                C2ug.A02.A03("onCompleteInstallForAppUpdate", AnonymousClass001.A1Z());
                i3 = 1551966624;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 12:
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, 678463550);
                C2ug.A02.A03("onDeferredLanguageInstall", AnonymousClass001.A1Z());
                i3 = 653500679;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            case 13:
                C52P.A00(parcel, Bundle.CREATOR);
                C52P.A01(parcel);
                A00 = A00((zzbh) zzbpVar, -1970025888);
                C2ug.A02.A03("onDeferredLanguageUninstall", AnonymousClass001.A1Z());
                i3 = -1647322115;
                0FI.A09(i3, A00);
                z = true;
                i4 = -2010019424;
                break;
            default:
                z = false;
                i4 = -1539198318;
                break;
        }
        0FI.A09(i4, A032);
        i5 = -783287010;
        0FI.A09(i5, A03);
        return z;
    }
}
