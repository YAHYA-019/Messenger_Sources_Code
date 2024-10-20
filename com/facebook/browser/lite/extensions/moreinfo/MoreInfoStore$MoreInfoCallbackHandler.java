package com.facebook.browser.lite.extensions.moreinfo;

import X.0FI;
import X.0S2;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.FJ8;
import X.KOr;
import X.KVm;
import X.L3M;
import X.LkY;
import X.LnA;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.MoreInfoCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: MoreInfoStore$MoreInfoCallbackHandler.class */
public final class MoreInfoStore$MoreInfoCallbackHandler extends Binder implements MoreInfoCallback {
    public final /* synthetic */ L3M A00;

    public MoreInfoStore$MoreInfoCallbackHandler() {
        int A03 = 0FI.A03(39313559);
        attachInterface(this, "com.facebook.browser.lite.ipc.MoreInfoCallback");
        0FI.A09(-53854731, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreInfoStore$MoreInfoCallbackHandler(L3M l3m) {
        this();
        this.A00 = l3m;
        0FI.A09(-1467566061, 0FI.A03(-789679333));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.browser.lite.ipc.MoreInfoCallback, java.lang.Object, com.facebook.browser.lite.ipc.MoreInfoCallback$Stub$Proxy] */
    public static MoreInfoCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.MoreInfoCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof MoreInfoCallback)) {
            return (MoreInfoCallback) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = 0FI.A03(-265240033);
        obj.A00 = iBinder;
        0FI.A09(796634712, A03);
        return obj;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-2113924942, 0FI.A03(-1491670072));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        Handler A07;
        LnA lkY;
        int A03 = 0FI.A03(-358545542);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.MoreInfoCallback");
                if (i == 1) {
                    Bundle bundle = (Bundle) AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                    int A032 = 0FI.A03(2113179382);
                    11T.A0F(bundle, 0);
                    FJ8.A03(bundle, "offer_item");
                    L3M l3m = this.A00;
                    if (l3m.A04) {
                        String string = bundle.getString("page_id");
                        if (string != null && (str = l3m.A02) != null && !str.equals(string)) {
                            l3m.A05 = true;
                            A07 = AnonymousClass001.A07();
                            lkY = new LkY(l3m);
                        }
                        0FI.A09(587702403, A032);
                        i3 = 534194826;
                        0FI.A09(i3, A03);
                        return true;
                    }
                    l3m.A04 = true;
                    l3m.A00 = bundle;
                    l3m.A02 = bundle.getString("page_id");
                    Bundle bundle2 = l3m.A00;
                    ArrayList<String> stringArrayList = bundle2 != null ? bundle2.getStringArrayList("whitelisted_websites") : null;
                    l3m.A03 = AnonymousClass001.A0v();
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String A0i = AnonymousClass001.A0i(it);
                            HashSet hashSet = l3m.A03;
                            11T.A0D(A0i);
                            11T.A0F(A0i, 0);
                            hashSet.add(KVm.A00(A0i));
                        }
                    }
                    l3m.A08.BZU(KOr.A12, 0S2.A0C);
                    A07 = AnonymousClass001.A07();
                    lkY = new LnA(bundle, l3m);
                    A07.post(lkY);
                    0FI.A09(587702403, A032);
                    i3 = 534194826;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.MoreInfoCallback");
                i3 = 1760269134;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-225649368, A03);
        return onTransact;
    }
}
