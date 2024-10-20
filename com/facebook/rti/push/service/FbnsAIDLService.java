package com.facebook.rti.push.service;

import X.0FI;
import X.0Ot;
import X.0fH;
import X.0hQ;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C19h;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FbnsAIDLService.class */
public final class FbnsAIDLService extends Binder implements IFbnsAIDLService {
    public final Context A00;
    public final Map A01;

    public FbnsAIDLService() {
        int A03 = 0FI.A03(-986241021);
        attachInterface(this, "com.facebook.push.fbns.ipc.IFbnsAIDLService");
        0FI.A09(-1802141584, A03);
    }

    public /* synthetic */ FbnsAIDLService(Context context, C19h c19h, C19h c19h2) {
        this();
        int A03 = 0FI.A03(426944757);
        HashMap A0u = AnonymousClass001.A0u();
        this.A01 = A0u;
        0Ot r0 = 0Ot.A05;
        C19h c19h3 = 0hQ.A02;
        A0u.put(r0, c19h3);
        A0u.put(0Ot.A09, c19h3);
        0Ot r02 = 0Ot.A02;
        C19h c19h4 = 0hQ.A01;
        A0u.put(r02, c19h4);
        A0u.put(0Ot.A08, c19h4);
        0Ot r03 = 0Ot.A06;
        C19h c19h5 = 0hQ.A03;
        A0u.put(r03, c19h5);
        A0u.put(0Ot.A0A, c19h5);
        this.A00 = context;
        A0u.put(0Ot.A03, c19h);
        A0u.put(0Ot.A04, c19h2);
        0FI.A09(-393220584, A03);
        0FI.A09(181612027, 0FI.A03(-450747708));
    }

    private C19h A00(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
        IllegalArgumentException A0L;
        int i;
        int i2;
        int A03 = 0FI.A03(1757836597);
        if (fbnsAIDLRequest == null || (i2 = fbnsAIDLRequest.A00) < 0) {
            0fH.A0k("FbnsAIDLService", "Invalid FbnsAIDLRequest");
            A0L = AnonymousClass001.A0L("FbnsService received invalid FbnsAIDLRequest");
            i = 47240374;
        } else {
            0Ot r308 = (0Ot) 0Ot.A00.get(Integer.valueOf(i2));
            if (r308 == null) {
                r308 = 0Ot.A07;
            }
            if (r308 == 0Ot.A07) {
                0fH.A0j("FbnsAIDLService", "FbnsAIDLOperation not found");
                A0L = AnonymousClass001.A0L("FbnsService operation not found");
                i = -783403537;
            } else if (r308.mHasReturn == z) {
                C19h c19h = (C19h) this.A01.get(r308);
                if (c19h != null) {
                    0FI.A09(143105443, A03);
                    return c19h;
                }
                A0L = AnonymousClass002.A0C(r308, "FbnsService does not implement operation ", AnonymousClass001.A0k());
                i = 1761423386;
            } else {
                0fH.A0k("FbnsAIDLService", "FbnsAIDLOperation incorrect return type");
                A0L = AnonymousClass001.A0L("FbnsService operation incorrect return type");
                i = -2746196;
            }
        }
        0FI.A09(i, A03);
        throw A0L;
    }

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public FbnsAIDLResult CaS(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = 0FI.A03(91810972);
        C19h A00 = A00(fbnsAIDLRequest, true);
        Context context = this.A00;
        Bundle bundle = ((FbnsAIDLResult) fbnsAIDLRequest).A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            11T.A0B(bundle);
        }
        FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(A00.AO0(context, bundle));
        0FI.A09(576271924, A03);
        return fbnsAIDLResult;
    }

    @Override // com.facebook.push.fbns.ipc.IFbnsAIDLService
    public void D6S(FbnsAIDLRequest fbnsAIDLRequest) {
        int A03 = 0FI.A03(812821291);
        C19h A00 = A00(fbnsAIDLRequest, false);
        Context context = this.A00;
        Bundle bundle = ((FbnsAIDLResult) fbnsAIDLRequest).A00;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
            11T.A0B(bundle);
        }
        A00.AO5(context, bundle);
        0FI.A09(283333045, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(920453875, 0FI.A03(1307666724));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-761289823);
        boolean z = true;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                if (i == 1) {
                    FbnsAIDLResult CaS = CaS((FbnsAIDLRequest) AnonymousClass002.A0I(parcel, FbnsAIDLRequest.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    CaS.writeToParcel(parcel2, 1);
                } else if (i == 2) {
                    D6S((FbnsAIDLRequest) AnonymousClass002.A0I(parcel, FbnsAIDLRequest.CREATOR));
                }
                i3 = 987443338;
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.push.fbns.ipc.IFbnsAIDLService");
                i3 = -1081379517;
            }
            0FI.A09(i3, A03);
            return z;
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = -925902130;
        0FI.A09(i3, A03);
        return z;
    }
}
