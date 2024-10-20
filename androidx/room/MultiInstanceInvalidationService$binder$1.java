package androidx.room;

import X.0FI;
import X.11T;
import X.7zN;
import X.GOn;
import X.JQy;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

/* loaded from: MultiInstanceInvalidationService$binder$1.class */
public final class MultiInstanceInvalidationService$binder$1 extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public MultiInstanceInvalidationService$binder$1() {
        int A03 = 0FI.A03(-534289645);
        attachInterface(this, IMultiInstanceInvalidationService.A00);
        0FI.A09(-2061017608, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
        0FI.A09(90552005, 0FI.A03(-1697554461));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy, androidx.room.IMultiInstanceInvalidationCallback, java.lang.Object] */
    public static IMultiInstanceInvalidationCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.A00);
        if (queryLocalInterface != null && (queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
            return (IMultiInstanceInvalidationCallback) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = 0FI.A03(-34603265);
        obj.A00 = iBinder;
        0FI.A09(-1199259771, A03);
        return obj;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1698239304, 0FI.A03(-1788130953));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        int i5;
        int A03 = 0FI.A03(1241636157);
        String str = IMultiInstanceInvalidationService.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    IMultiInstanceInvalidationCallback A00 = A00(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    int A0E = JQy.A0E(A00, 1756970826);
                    int i6 = 0;
                    if (readString == null) {
                        i4 = 557018806;
                    } else {
                        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
                        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
                        synchronized (remoteCallbackList) {
                            try {
                                int i7 = multiInstanceInvalidationService.A00 + 1;
                                multiInstanceInvalidationService.A00 = i7;
                                Integer valueOf = Integer.valueOf(i7);
                                if (remoteCallbackList.register(A00, valueOf)) {
                                    multiInstanceInvalidationService.A02.put(valueOf, readString);
                                    i6 = i7;
                                } else {
                                    multiInstanceInvalidationService.A00--;
                                }
                            } catch (Throwable th) {
                                0FI.A09(935918832, A0E);
                                throw th;
                            }
                        }
                        i4 = 37833664;
                    }
                    0FI.A09(i4, A0E);
                    parcel2.writeNoException();
                    parcel2.writeInt(i6);
                } else if (i == 2) {
                    IMultiInstanceInvalidationCallback A002 = A00(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    int A0E2 = JQy.A0E(A002, 685382538);
                    MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.A00;
                    RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.A01;
                    synchronized (remoteCallbackList2) {
                        try {
                            remoteCallbackList2.unregister(A002);
                            multiInstanceInvalidationService2.A02.remove(Integer.valueOf(readInt));
                        } catch (Throwable th2) {
                            0FI.A09(273753889, A0E2);
                            throw th2;
                        }
                    }
                    0FI.A09(1519209530, A0E2);
                    parcel2.writeNoException();
                } else if (i == 3) {
                    int readInt2 = parcel.readInt();
                    String[] createStringArray = parcel.createStringArray();
                    int A032 = 0FI.A03(-140073984);
                    11T.A0F(createStringArray, 1);
                    MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.A00;
                    RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.A01;
                    synchronized (remoteCallbackList3) {
                        try {
                            Map map = multiInstanceInvalidationService3.A02;
                            String str2 = (String) 7zN.A0r(map, readInt2);
                            if (str2 == null) {
                                Log.w("ROOM", "Remote invalidation client ID not registered");
                                i5 = -1045868061;
                            } else {
                                int beginBroadcast = remoteCallbackList3.beginBroadcast();
                                for (int i8 = 0; i8 < beginBroadcast; i8++) {
                                    try {
                                        Object broadcastCookie = remoteCallbackList3.getBroadcastCookie(i8);
                                        11T.A0I(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                        int A09 = GOn.A09(broadcastCookie);
                                        String str3 = (String) 7zN.A0r(map, A09);
                                        if (readInt2 != A09 && str2.equals(str3)) {
                                            try {
                                                IMultiInstanceInvalidationCallback$Stub$Proxy iMultiInstanceInvalidationCallback$Stub$Proxy = (IMultiInstanceInvalidationCallback$Stub$Proxy) ((IMultiInstanceInvalidationCallback) remoteCallbackList3.getBroadcastItem(i8));
                                                int A033 = 0FI.A03(1388715494);
                                                Parcel obtain = Parcel.obtain();
                                                try {
                                                    obtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.A00);
                                                    obtain.writeStringArray(createStringArray);
                                                    iMultiInstanceInvalidationCallback$Stub$Proxy.A00.transact(1, obtain, null, 1);
                                                    obtain.recycle();
                                                    0FI.A09(1465223271, A033);
                                                } catch (Throwable th3) {
                                                    obtain.recycle();
                                                    0FI.A09(-1710716750, A033);
                                                    throw th3;
                                                    break;
                                                }
                                            } catch (RemoteException e) {
                                                Log.w("ROOM", "Error invoking a remote callback", e);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        remoteCallbackList3.finishBroadcast();
                                        0FI.A09(396209090, A032);
                                        throw th4;
                                    }
                                }
                                remoteCallbackList3.finishBroadcast();
                                i5 = 236870985;
                            }
                        } catch (Throwable th5) {
                            0FI.A09(1899608479, A032);
                            throw th5;
                        }
                    }
                    0FI.A09(i5, A032);
                }
                i3 = 1261623556;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = -238232284;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-1270099336, A03);
        return onTransact;
    }
}
