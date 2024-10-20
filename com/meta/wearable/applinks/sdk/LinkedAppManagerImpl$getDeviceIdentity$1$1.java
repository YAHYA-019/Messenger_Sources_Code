package com.meta.wearable.applinks.sdk;

import X.02L;
import X.0FI;
import X.0fH;
import X.11T;
import X.7zN;
import X.AnonymousClass001;
import X.DKC;
import X.JQy;
import X.KYx;
import X.KwG;
import X.LDe;
import X.M6k;
import X.QqT;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityResponse;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: LinkedAppManagerImpl$getDeviceIdentity$1$1.class */
public final class LinkedAppManagerImpl$getDeviceIdentity$1$1 extends Binder implements IInterface {
    public final /* synthetic */ LDe A00;
    public final /* synthetic */ Function1 A01;
    public final /* synthetic */ Function2 A02;

    public LinkedAppManagerImpl$getDeviceIdentity$1$1() {
        int A03 = 0FI.A03(1233202031);
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
        0FI.A09(449368144, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkedAppManagerImpl$getDeviceIdentity$1$1(LDe lDe, Function1 function1, Function2 function2) {
        this();
        this.A00 = lDe;
        this.A02 = function2;
        this.A01 = function1;
        0FI.A09(-197963279, 0FI.A03(-181855105));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-1763690653, 0FI.A03(64217025));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A0E;
        int i4;
        int A03 = 0FI.A03(1551058542);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                if (i == 2) {
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(AppLinkDeviceIdentityResponse.CREATOR);
                    A0E = JQy.A0E(createTypedArrayList, 752195189);
                    if (createTypedArrayList.isEmpty()) {
                        0fH.A0r("lam:LinkedAppManager", "getDeviceIdentity: onResult empty. Retry.", (Throwable) null);
                    }
                    AppLinkDeviceIdentityResponse appLinkDeviceIdentityResponse = (AppLinkDeviceIdentityResponse) createTypedArrayList.get(DKC.A06(createTypedArrayList));
                    byte[] bArr = appLinkDeviceIdentityResponse.serviceUUID;
                    11T.A09(bArr);
                    UUID A00 = KwG.A00(bArr);
                    byte[] bArr2 = appLinkDeviceIdentityResponse.devicePublicKey;
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("serviceUUID=");
                    A0k.append(A00);
                    A0k.append(" devicePublicKey=");
                    11T.A0D(bArr2);
                    KYx.A00("lam:LinkedAppManager", AnonymousClass001.A0d(02L.A04(M6k.A00, bArr2), A0k));
                    this.A02.invoke(A00, bArr2);
                    i4 = -1357186547;
                } else if (i == 3) {
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    A0E = 0FI.A03(1898605499);
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("getDeviceIdentity: onError ");
                    A0k2.append(readInt);
                    A0k2.append(". ");
                    A0k2.append(readString);
                    0fH.A0r("lam:LinkedAppManager", AnonymousClass001.A0g(A0k2, '.'), (Throwable) null);
                    Function1 function1 = this.A01;
                    Object A0r = 7zN.A0r(QqT.A00, readInt);
                    if (A0r == null) {
                        A0r = QqT.A08;
                    }
                    function1.invoke(A0r);
                    i4 = 1577056853;
                }
                0FI.A09(i4, A0E);
                i3 = 1530909779;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                i3 = 1272580860;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-839780294, A03);
        return onTransact;
    }
}
