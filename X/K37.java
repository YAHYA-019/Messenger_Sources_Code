package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzaw;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.Iterator;

/* loaded from: K37.class */
public final class K37 extends 2AC {
    public final KlB A00;
    public final MD2 A01;
    public final String A02;

    public K37(Context context, Looper looper, 2A4 r304, 2A6 r305, 2A9 r306) {
        super(context, looper, r304, r305, r306, 23);
        LdN ldN = new LdN(this);
        this.A01 = ldN;
        this.A02 = "locationServices";
        this.A00 = new KlB(context, ldN);
    }

    public Bundle A02() {
        Bundle A05 = 1BK.A05();
        A05.putString("client_name", this.A02);
        return A05;
    }

    public /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (!(queryLocalInterface instanceof zzal)) {
                zzb zzbVar = new zzb("com.google.android.gms.location.internal.IGoogleLocationManagerService", iBinder);
                0FI.A09(1234851570, 0FI.A03(-1687165546));
                return zzbVar;
            }
        }
        return queryLocalInterface;
    }

    public String A05() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public String A06() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public Feature[] A0A() {
        return Kd5.A02;
    }

    public final void A0B(MGA mga, LocationSettingsRequest locationSettingsRequest) {
        A07();
        zzaz zzazVar = new zzaz();
        int A03 = 0FI.A03(-1680838155);
        zzazVar.A00 = mga;
        0FI.A09(-1594797497, A03);
        zzb zzbVar = (zzb) ((zzal) A03());
        int A032 = 0FI.A03(-1136123051);
        Parcel A00 = zzbVar.A00();
        A00.writeInt(1);
        locationSettingsRequest.writeToParcel(A00, 0);
        JQx.A19(zzazVar, A00);
        A00.writeString(null);
        zzbVar.A02(A00, 63);
        0FI.A09(-1944852402, A032);
    }

    public int Axj() {
        return 11717000;
    }

    public final void disconnect() {
        KlB klB = this.A00;
        synchronized (klB) {
            if (isConnected()) {
                try {
                    java.util.Map map = klB.A01;
                    synchronized (map) {
                        try {
                            Iterator A1A = 1BK.A1A(map);
                            while (A1A.hasNext()) {
                                zzaw zzawVar = (zzaw) A1A.next();
                                if (zzawVar != null) {
                                    ((zzal) klB.A00.A00.A03()).DCC(new zzbe(null, zzawVar.asBinder(), null, null, null, 2));
                                }
                            }
                            map.clear();
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    java.util.Map map2 = klB.A03;
                    synchronized (map2) {
                        try {
                            Iterator A1A2 = 1BK.A1A(map2);
                            while (A1A2.hasNext()) {
                                A1A2.next();
                            }
                            map2.clear();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    java.util.Map map3 = klB.A02;
                    synchronized (map3) {
                        try {
                            Iterator A1A3 = 1BK.A1A(map3);
                            while (A1A3.hasNext()) {
                                A1A3.next();
                            }
                            map3.clear();
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super/*X.2AD*/.disconnect();
        }
    }
}
