package com.meta.wearable.applinks.sdk;

import X.0FI;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00m;
import X.JR1;
import X.KKb;
import X.KKc;
import X.KKd;
import X.KKe;
import X.KKf;
import X.KKg;
import X.KKh;
import X.KKi;
import X.KKj;
import X.KKk;
import X.KKl;
import X.KKm;
import X.KKn;
import X.KKo;
import X.KKp;
import X.KKq;
import X.KKr;
import X.KKs;
import X.KYx;
import X.KwG;
import X.LDe;
import X.RU1;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDeviceMountState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.facebook.wearable.applinks.AppLinkDeviceStateResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedAppManagerImpl$listenToDeviceConnectionState$1$1.class */
public final class LinkedAppManagerImpl$listenToDeviceConnectionState$1$1 extends Binder implements IInterface {
    public final /* synthetic */ LDe A00;

    public LinkedAppManagerImpl$listenToDeviceConnectionState$1$1() {
        int A03 = 0FI.A03(721693282);
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
        0FI.A09(-397752129, A03);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkedAppManagerImpl$listenToDeviceConnectionState$1$1(LDe lDe) {
        this();
        this.A00 = lDe;
        0FI.A09(-969005634, 0FI.A03(963538419));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1910149773, 0FI.A03(-2007379054));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        KKf kKf;
        int A03 = 0FI.A03(-1610188636);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
                if (i == 2) {
                    AppLinkDeviceStateResponse appLinkDeviceStateResponse = (AppLinkDeviceStateResponse) AnonymousClass002.A0I(parcel, AppLinkDeviceStateResponse.CREATOR);
                    int A032 = 0FI.A03(-1541909641);
                    11T.A0F(appLinkDeviceStateResponse, 0);
                    byte[] bArr = appLinkDeviceStateResponse.serviceUUID;
                    11T.A09(bArr);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    ByteBuffer order = wrap.order(byteOrder);
                    UUID uuid = new UUID(order.getLong(), order.getLong());
                    ByteBuffer order2 = ByteBuffer.wrap(new byte[16]).order(byteOrder);
                    JR1.A1O(order2, uuid);
                    byte[] array = order2.array();
                    11T.A0A(array);
                    UUID A00 = KwG.A00(array);
                    LDe lDe = this.A00;
                    AppLinkDeviceHardwareState appLinkDeviceHardwareState = appLinkDeviceStateResponse.deviceHardwareState;
                    if (appLinkDeviceHardwareState != null) {
                        switch (appLinkDeviceHardwareState) {
                            case HINGE_OPEN:
                                kKf = KKf.A00;
                                break;
                            case HINGE_CLOSED:
                                kKf = KKe.A00;
                                break;
                            case IN_DEEP_SLEEP:
                                kKf = KKm.A00;
                                break;
                            case OUT_OF_DEEP_SLEEP:
                                kKf = KKo.A00;
                                break;
                            case STREAMING_ACTIVE:
                                kKf = KKp.A00;
                                break;
                            case STREAMING_INACTIVE:
                                kKf = KKq.A00;
                                break;
                            default:
                                throw 1BK.A1F();
                        }
                    } else {
                        AppLinkDevicePeakPowerState appLinkDevicePeakPowerState = appLinkDeviceStateResponse.devicePeakPowerState;
                        if (appLinkDevicePeakPowerState != null) {
                            switch (appLinkDevicePeakPowerState) {
                                case NORMAL:
                                    kKf = KKg.A00;
                                    break;
                                case THROTTLE_LEVEL_1:
                                    kKf = KKi.A00;
                                    break;
                                case THROTTLE_LEVEL_2:
                                    kKf = KKj.A00;
                                    break;
                                case THROTTLE_LEVEL_3:
                                    kKf = KKk.A00;
                                    break;
                                case SHUTDOWN:
                                    kKf = KKh.A00;
                                    break;
                                case UNKNOWN:
                                    kKf = KKl.A00;
                                    break;
                                default:
                                    throw 1BK.A1F();
                            }
                        } else {
                            AppLinkDeviceMountState appLinkDeviceMountState = appLinkDeviceStateResponse.deviceMountState;
                            if (appLinkDeviceMountState == null) {
                                AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus = appLinkDeviceStateResponse.deviceConnectionStatus;
                                if (appLinkDeviceConnectionStatus != null) {
                                    int ordinal = appLinkDeviceConnectionStatus.ordinal();
                                    if (ordinal == 0) {
                                        kKf = KKb.A00;
                                    } else if (ordinal == 1) {
                                        kKf = KKc.A00;
                                    } else if (ordinal == 2) {
                                        kKf = KKd.A00;
                                    } else if (ordinal == 3) {
                                        kKf = KKs.A00;
                                    }
                                }
                                throw 1BK.A1F();
                            }
                            int ordinal2 = appLinkDeviceMountState.ordinal();
                            if (ordinal2 == 0) {
                                kKf = KKn.A00;
                            } else {
                                if (ordinal2 != 1) {
                                    throw 1BK.A1F();
                                }
                                kKf = KKr.A00;
                            }
                        }
                    }
                    RU1 ru1 = new RU1(kKf, A00);
                    KYx.A00("lam:LinkedAppManager", AnonymousClass001.A0Z(ru1, "onDeviceStateUpdate: status=", AnonymousClass001.A0k()));
                    Function1 function1 = lDe.A08;
                    if (function1 != null) {
                        function1.invoke(ru1);
                    }
                    if (appLinkDeviceStateResponse.deviceConnectionStatus == AppLinkDeviceConnectionStatus.CONNECTED) {
                        C00m c00m = lDe.A01;
                        if (c00m != null) {
                            c00m.invoke();
                        }
                        lDe.A01 = null;
                    }
                    0FI.A09(1598374411, A032);
                    i3 = -2038860952;
                    0FI.A09(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
                i3 = -832986149;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(143317714, A03);
        return onTransact;
    }
}
