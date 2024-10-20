package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzu;
import com.google.android.gms.internal.auth_blockstore.zzv;

/* renamed from: X.27u, reason: invalid class name */
/* loaded from: 27u.class */
public final class C27u extends C27w implements C27y {
    public static final AnonymousClass286 A00;
    public static final AnonymousClass283 A01;
    public static final AnonymousClass281 A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.281, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.283] */
    static {
        ?? obj = new Object();
        A02 = obj;
        ?? obj2 = new Object();
        A01 = obj2;
        A00 = new AnonymousClass286(obj2, obj, "Blockstore.API");
    }

    @Override // X.C27y
    public final C4Ez BSA() {
        L2K A002 = L7b.A00();
        A002.A03 = new Feature[]{AbstractC01143q6.A04};
        A002.A01 = new LcT(this);
        A002.A02 = false;
        A002.A00 = 1651;
        return C27w.A00(this, A002.A01(), 0);
    }

    @Override // X.C27y
    public final C4Ez CiV(final RetrieveBytesRequest retrieveBytesRequest) {
        AbstractC00481b7.A03(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        L2K A002 = L7b.A00();
        A002.A03 = new Feature[]{AbstractC01143q6.A07};
        A002.A01 = new MGB() { // from class: X.Lcd
            public final void accept(Object obj, Object obj2) {
                RetrieveBytesRequest retrieveBytesRequest2 = retrieveBytesRequest;
                zzv zzvVar = new zzv((4FE) obj2);
                zza zzaVar = (zza) ((2AD) obj).A03();
                int A03 = 0FI.A03(-1993799605);
                Parcel A0L = JQz.A0L(zzvVar);
                A0L.writeInt(1);
                retrieveBytesRequest2.writeToParcel(A0L, 0);
                zzaVar.A00(A0L, 12);
                0FI.A09(-1388156947, A03);
            }
        };
        A002.A02 = false;
        A002.A00 = 1668;
        return C27w.A00(this, A002.A01(), 0);
    }

    @Override // X.C27y
    public final C4Ez D32(final StoreBytesData storeBytesData) {
        L2K A002 = L7b.A00();
        A002.A03 = new Feature[]{AbstractC01143q6.A03, AbstractC01143q6.A05};
        A002.A01 = new MGB() { // from class: X.Lcc
            public final void accept(Object obj, Object obj2) {
                StoreBytesData storeBytesData2 = storeBytesData;
                zzu zzuVar = new zzu((4FE) obj2);
                zza zzaVar = (zza) ((2AD) obj).A03();
                int A03 = 0FI.A03(1854331366);
                Parcel A0L = JQz.A0L(zzuVar);
                A0L.writeInt(1);
                storeBytesData2.writeToParcel(A0L, 0);
                zzaVar.A00(A0L, 10);
                0FI.A09(-324524744, A03);
            }
        };
        A002.A00 = 1645;
        A002.A02 = false;
        return C27w.A00(this, A002.A01(), 1);
    }
}
