package androidx.work.multiprocess;

import X.0FI;
import X.4IU;
import X.4XX;
import X.C4Ih;
import X.C4Ii;
import X.C4Ij;
import X.JRe;
import X.JRf;
import X.JRg;
import X.JRo;
import X.JRp;
import X.JjL;
import X.JjM;
import X.JjN;
import X.JjQ;
import X.KVQ;
import X.KvZ;
import X.L0C;
import X.LrK;
import X.Lrc;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: RemoteWorkManagerImpl.class */
public final class RemoteWorkManagerImpl extends Binder implements IWorkManagerImpl {
    public static byte[] A01 = new byte[0];
    public final 4IU A00;

    public RemoteWorkManagerImpl() {
        int A03 = 0FI.A03(-380799638);
        attachInterface(this, IWorkManagerImpl.A00);
        0FI.A09(-292431358, A03);
    }

    public RemoteWorkManagerImpl(Context context) {
        this();
        int A03 = 0FI.A03(852259783);
        this.A00 = 4IU.A00(context);
        0FI.A09(175402001, A03);
    }

    public static void A00(IWorkManagerImplCallback iWorkManagerImplCallback, RemoteWorkManagerImpl remoteWorkManagerImpl, ListenableFuture listenableFuture, Executor executor, int i) {
        JjQ jjQ = new JjQ(iWorkManagerImplCallback, remoteWorkManagerImpl, listenableFuture, executor, i);
        jjQ.A01.addListener(new Lrc(jjQ), jjQ.A02);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void AQR(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(-1283788850);
        try {
            List list = ((ParcelableWorkRequests) KvZ.A00(ParcelableWorkRequests.CREATOR, bArr)).A00;
            4IU r0 = this.A00;
            JRg A02 = r0.A02(list);
            A00(iWorkManagerImplCallback, this, A02.A00, ((C4Ih) r0.A06).A01, 1);
        } catch (Throwable th) {
            Lrc.A00(iWorkManagerImplCallback, th);
        }
        0FI.A09(-913617087, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void Cp3(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(59257112);
        try {
            ParcelableForegroundRequestInfo parcelableForegroundRequestInfo = (ParcelableForegroundRequestInfo) KvZ.A00(ParcelableForegroundRequestInfo.CREATOR, bArr);
            4IU r0 = this.A00;
            C4Ii c4Ii = r0.A06;
            A00(iWorkManagerImplCallback, this, new JRp(r0.A04, r0.A03, c4Ii).Cp2(r0.A01, parcelableForegroundRequestInfo.A00, UUID.fromString(parcelableForegroundRequestInfo.A01)), ((C4Ih) c4Ii).A01, 9);
        } catch (Throwable th) {
            Lrc.A00(iWorkManagerImplCallback, th);
        }
        0FI.A09(-1821671022, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImpl
    public void CtR(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(-985354320);
        try {
            ParcelableUpdateRequest parcelableUpdateRequest = (ParcelableUpdateRequest) KvZ.A00(ParcelableUpdateRequest.CREATOR, bArr);
            4IU r0 = this.A00;
            Context context = r0.A01;
            C4Ii c4Ii = r0.A06;
            A00(iWorkManagerImplCallback, this, new JRo(r0.A04, c4Ii).D7f(context, parcelableUpdateRequest.A00.A00, UUID.fromString(parcelableUpdateRequest.A01)), ((C4Ih) c4Ii).A01, 8);
        } catch (Throwable th) {
            Lrc.A00(iWorkManagerImplCallback, th);
        }
        0FI.A09(-736267194, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-1226538504, 0FI.A03(-262247747));
        return this;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002d. Please report as an issue. */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03;
        int i4;
        int A032 = 0FI.A03(572054545);
        String str = IWorkManagerImpl.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                switch (i) {
                    case 1:
                        AQR(IWorkManagerImplCallback.Stub.A00(parcel), parcel.createByteArray());
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 2:
                        String readString = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        IWorkManagerImplCallback A00 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(-1192952002);
                        try {
                            JRe jRe = ((ParcelableWorkRequest) KvZ.A00(ParcelableWorkRequest.CREATOR, createByteArray)).A00;
                            4IU r0 = this.A00;
                            A00(A00, this, KVQ.A00(jRe, r0, readString).A00, ((C4Ih) r0.A06).A01, 0);
                        } catch (Throwable th) {
                            Lrc.A00(A00, th);
                        }
                        i4 = -2095991627;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 3:
                        byte[] createByteArray2 = parcel.createByteArray();
                        IWorkManagerImplCallback A002 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(-1663680490);
                        try {
                            ParcelableWorkContinuationImpl parcelableWorkContinuationImpl = (ParcelableWorkContinuationImpl) KvZ.A00(ParcelableWorkContinuationImpl.CREATOR, createByteArray2);
                            4IU r02 = this.A00;
                            L0C l0c = parcelableWorkContinuationImpl.A00;
                            A00(A002, this, new JRf(r02, l0c.A01, l0c.A02, l0c.A03, L0C.A00(r02, l0c.A00)).A02().A00, ((C4Ih) r02.A06).A01, 2);
                        } catch (Throwable th2) {
                            Lrc.A00(A002, th2);
                        }
                        i4 = 1702885766;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 4:
                        String readString2 = parcel.readString();
                        IWorkManagerImplCallback A003 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(809952806);
                        try {
                            4IU r03 = this.A00;
                            Runnable jjM = new JjM(r03, UUID.fromString(readString2));
                            C4Ii c4Ii = r03.A06;
                            c4Ii.ARK(jjM);
                            A00(A003, this, ((LrK) jjM).A00.A00, ((C4Ih) c4Ii).A01, 3);
                        } catch (Throwable th3) {
                            Lrc.A00(A003, th3);
                        }
                        i4 = -603946782;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 5:
                        String readString3 = parcel.readString();
                        IWorkManagerImplCallback A004 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(-588027378);
                        try {
                            4IU r04 = this.A00;
                            Runnable jjN = new JjN(r04, readString3);
                            C4Ii c4Ii2 = r04.A06;
                            c4Ii2.ARK(jjN);
                            A00(A004, this, ((LrK) jjN).A00.A00, ((C4Ih) c4Ii2).A01, 4);
                        } catch (Throwable th4) {
                            Lrc.A00(A004, th4);
                        }
                        i4 = 1489095335;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 6:
                        String readString4 = parcel.readString();
                        IWorkManagerImplCallback A005 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(1165872815);
                        try {
                            4IU r05 = this.A00;
                            A00(A005, this, r05.A03(readString4).A00, ((C4Ih) r05.A06).A01, 5);
                        } catch (Throwable th5) {
                            Lrc.A00(A005, th5);
                        }
                        i4 = -1230561332;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 7:
                        IWorkManagerImplCallback A006 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(1923938867);
                        try {
                            4IU r06 = this.A00;
                            Runnable jjL = new JjL(r06);
                            C4Ii c4Ii3 = r06.A06;
                            c4Ii3.ARK(jjL);
                            A00(A006, this, ((LrK) jjL).A00.A00, ((C4Ih) c4Ii3).A01, 6);
                        } catch (Throwable th6) {
                            Lrc.A00(A006, th6);
                        }
                        i4 = -1294887380;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 8:
                        byte[] createByteArray3 = parcel.createByteArray();
                        IWorkManagerImplCallback A007 = IWorkManagerImplCallback.Stub.A00(parcel);
                        A03 = 0FI.A03(2047636478);
                        try {
                            ParcelableWorkQuery parcelableWorkQuery = (ParcelableWorkQuery) KvZ.A00(ParcelableWorkQuery.CREATOR, createByteArray3);
                            4IU r07 = this.A00;
                            C4Ij c4Ij = ((C4Ih) r07.A06).A01;
                            4XX r08 = new 4XX(parcelableWorkQuery.A00, r07);
                            c4Ij.execute(r08);
                            A00(A007, this, r08.A00, c4Ij, 7);
                        } catch (Throwable th7) {
                            Lrc.A00(A007, th7);
                        }
                        i4 = 971786478;
                        0FI.A09(i4, A03);
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 9:
                        CtR(IWorkManagerImplCallback.Stub.A00(parcel), parcel.createByteArray());
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                    case 10:
                        Cp3(IWorkManagerImplCallback.Stub.A00(parcel), parcel.createByteArray());
                        i3 = 907321468;
                        0FI.A09(i3, A032);
                        return true;
                }
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = -365631064;
                0FI.A09(i3, A032);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-934836754, A032);
        return onTransact;
    }
}
