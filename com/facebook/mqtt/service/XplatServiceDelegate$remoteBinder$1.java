package com.facebook.mqtt.service;

import X.0FI;
import X.0Pz;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1nK;
import X.2BA;
import X.2BB;
import X.3aZ;
import X.5Ck;
import X.AnonymousClass001;
import X.C00m;
import X.C1li;
import X.C1lj;
import X.C1nm;
import X.C3ab;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1;
import com.facebook.mqtt.service.ipc.IMqttPublishExtListener;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener;
import com.facebook.mqtt.service.ipc.IMqttXplatService;
import com.facebook.mqtt.service.ipc.SubscriptionParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: XplatServiceDelegate$remoteBinder$1.class */
public final class XplatServiceDelegate$remoteBinder$1 extends Binder implements IMqttXplatService {
    public XplatServiceDelegate$remoteBinder$1() {
        this(0);
        0FI.A09(-157484549, 0FI.A03(1945355825));
    }

    public XplatServiceDelegate$remoteBinder$1(int i) {
        int A03 = 0FI.A03(74830910);
        attachInterface(this, "com.facebook.mqtt.service.ipc.IMqttXplatService");
        0FI.A09(230065811, A03);
    }

    public final void A00(C00m c00m) {
        int A03 = 0FI.A03(1830953771);
        try {
            c00m.invoke();
        } catch (RuntimeException e) {
            int A032 = 0FI.A03(297603381);
            if (!AnonymousClass001.A1Y(e)) {
                0FI.A09(282582318, A032);
                throw e;
            }
            0fH.A0s("MqttXplatService", "System is dead", e);
            0FI.A09(1544414200, A032);
        }
        0FI.A09(1375900965, A03);
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean AHY(long j) {
        boolean isConnected;
        int A03 = 0FI.A03(-807587919);
        C1li c1li = XplatServiceDelegate.A04;
        0fH.A0j("MqttXplatService", AnonymousClass001.A0h(AnonymousClass001.A0n("Connect and wait for ack delay:"), j));
        ReentrantLock reentrantLock = XplatServiceDelegate.A07;
        reentrantLock.lock();
        try {
            1nK r0 = XplatServiceDelegate.A08;
            if (r0 == null || !r0.isConnected()) {
                XplatServiceDelegate.A06.await(j, TimeUnit.MILLISECONDS);
                1nK r02 = XplatServiceDelegate.A08;
                isConnected = r02 != null ? r02.isConnected() : false;
            } else {
                isConnected = true;
            }
            reentrantLock.unlock();
            0FI.A09(-1853054012, A03);
            return isConnected;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r304 == null) goto L6;
     */
    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Adx() {
        /*
            r301 = this;
            r0 = 1775941479(0x69dab767, float:3.305149E25)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A03(r0)
            r303 = r0
            X.1nK r0 = com.facebook.mqtt.service.XplatServiceDelegate.A08
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1b
            r0 = r304
            X.1nY r0 = r0.getConnectionState()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1b:
            X.1nY r0 = X.1nY.A05
            r304 = r0
        L1f:
            r0 = r304
            int r0 = r0.value
            r305 = r0
            r0 = -934702364(0xffffffffc84992e4, float:-206411.56)
            r1 = r303
            X.0FI.A09(r0, r1)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1.Adx():int");
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZo(IMqttPublishListener iMqttPublishListener, String str, byte[] bArr, int i) {
        int A03 = 0FI.A03(158535386);
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        int A00 = XplatServiceDelegate.A04.A00(new 2BB(this, iMqttPublishListener), 2BA.A00(i), str, null, bArr);
        0FI.A09(313622749, A03);
        return A00;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZp(String str, byte[] bArr, int i, long j) {
        int A03 = 0FI.A03(1982983064);
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        C1nm A00 = 2BA.A00(i);
        C1li c1li = XplatServiceDelegate.A04;
        11T.A0F(A00, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("xplat client publish and wait to ");
        sb.append(str);
        sb.append(" with ");
        sb.append(bArr);
        sb.append(". client=");
        sb.append(XplatServiceDelegate.A08);
        0fH.A0j("MqttXplatService", sb.toString());
        C1lj c1lj = XplatServiceDelegate.A02;
        if (11T.A0O(Looper.myLooper(), Looper.getMainLooper())) {
            0fH.A0k("MqttXplatPublisher", "Publish and wait is a blocking operation that cannot be executed on main thread");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C3ab c3ab = new C3ab(countDownLatch);
        int A002 = c1lj.A00(c3ab, A00, str, null, bArr);
        0fH.A0j("MqttXplatPublisher", 0Pz.A0T("Publish and wait with id:", A002));
        int i2 = -1;
        if (A002 != -1) {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
            i2 = c3ab.A00;
        }
        0FI.A09(-1138544035, A03);
        return i2;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public int CZq(IMqttPublishExtListener iMqttPublishExtListener, String str, byte[] bArr, int i) {
        int A03 = 0FI.A03(-1837823101);
        11T.A0F(str, 0);
        11T.A0F(bArr, 1);
        11T.A0F(iMqttPublishExtListener, 3);
        C1nm A00 = 2BA.A00(i);
        C1li c1li = XplatServiceDelegate.A04;
        3aZ r0 = new 3aZ(this, iMqttPublishExtListener);
        11T.A0F(A00, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("xplat client publishExt to ");
        sb.append(str);
        sb.append(" with level ");
        sb.append(A00);
        sb.append(". client=");
        sb.append(XplatServiceDelegate.A08);
        0fH.A0j("MqttXplatService", sb.toString());
        1nK r02 = XplatServiceDelegate.A08;
        int publishExt = r02 != null ? r02.publishExt(str, bArr, A00, r0) : -1;
        0FI.A09(-844308772, A03);
        return publishExt;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(-1259846668, 0FI.A03(-741844994));
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r305 == null) goto L6;
     */
    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getMqttHealthStats() {
        /*
            r301 = this;
            r0 = 2031103937(0x79102fc1, float:4.6791207E34)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A03(r0)
            r303 = r0
            X.1nK r0 = com.facebook.mqtt.service.XplatServiceDelegate.A08
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1e
            r0 = r304
            java.lang.String r0 = r0.getMqttHealthStats()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L23
        L1e:
            java.lang.String r0 = ""
            r305 = r0
        L23:
            r0 = -912299906(0xffffffffc99f687e, float:-1305871.8)
            r1 = r303
            X.0FI.A09(r0, r1)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1.getMqttHealthStats():java.lang.String");
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean isConnected() {
        int A03 = 0FI.A03(-1398792591);
        1nK r0 = XplatServiceDelegate.A08;
        boolean isConnected = r0 != null ? r0.isConnected() : false;
        0FI.A09(297928286, A03);
        return isConnected;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean isConnectedOrConnecting() {
        int A03 = 0FI.A03(396619170);
        1nK r0 = XplatServiceDelegate.A08;
        boolean isConnectedOrConnecting = r0 != null ? r0.isConnectedOrConnecting() : false;
        0FI.A09(-1451956824, A03);
        return isConnectedOrConnecting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [int] */
    /* JADX WARN: Type inference failed for: r309v2, types: [java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r309v9, types: [com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        boolean verifyAuthToken;
        IMqttPublishExtListener iMqttPublishExtListener;
        IMqttSubscribeListener iMqttSubscribeListener;
        int A03 = 0FI.A03(461320248);
        boolean z = true;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.mqtt.service.ipc.IMqttXplatService");
                switch (i) {
                    case 1:
                        verifyAuthToken = isConnectedOrConnecting();
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 2:
                        verifyAuthToken = isConnected();
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 3:
                        verifyAuthToken = AHY(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 4:
                        ArrayList createTypedArrayList = parcel.createTypedArrayList(SubscriptionParcelable.CREATOR);
                        parcel.readInt();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            iMqttSubscribeListener = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.mqtt.service.ipc.IMqttSubscribeListener");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMqttSubscribeListener)) {
                                ?? obj = new Object();
                                int A032 = 0FI.A03(2146958578);
                                obj.A00 = readStrongBinder;
                                0FI.A09(-368193218, A032);
                                iMqttSubscribeListener = obj;
                            } else {
                                iMqttSubscribeListener = (IMqttSubscribeListener) queryLocalInterface;
                            }
                        }
                        int A033 = 0FI.A03(1039423493);
                        11T.A0G(createTypedArrayList, 0, iMqttSubscribeListener);
                        final IMqttSubscribeListener iMqttSubscribeListener2 = iMqttSubscribeListener;
                        MqttSubscribeListener mqttSubscribeListener = new MqttSubscribeListener() { // from class: X.3ae
                            @Override // com.facebook.mqtt.service.MqttSubscribeListener
                            public void onData(String str, byte[] bArr, long j) {
                                11T.A0H(str, bArr);
                                XplatServiceDelegate$remoteBinder$1.this.A00(new 3kK(iMqttSubscribeListener2, str, bArr, j));
                            }

                            @Override // com.facebook.mqtt.service.MqttSubscribeListener
                            public void onSubscriptionResponse(String str, boolean z2, int i4) {
                                11T.A0F(str, 0);
                                XplatServiceDelegate$remoteBinder$1.this.A00(new 3kL(iMqttSubscribeListener2, str, i4, z2));
                            }
                        };
                        ArrayList<5Ck> A10 = 1BL.A10(createTypedArrayList);
                        Iterator it = createTypedArrayList.iterator();
                        while (it.hasNext()) {
                            SubscriptionParcelable subscriptionParcelable = (SubscriptionParcelable) it.next();
                            A10.add(new 5Ck(mqttSubscribeListener, 2BA.A00(subscriptionParcelable.A00), subscriptionParcelable.A01));
                        }
                        C1li c1li = XplatServiceDelegate.A04;
                        while (true) {
                            verifyAuthToken = true;
                            for (5Ck r0 : A10) {
                                if (verifyAuthToken) {
                                    11T.A0F(r0, 0);
                                    if (XplatServiceDelegate.A03.A02(r0)) {
                                        break;
                                    }
                                }
                                verifyAuthToken = false;
                            }
                            0FI.A09(-37357977, A033);
                            parcel2.writeNoException();
                            parcel2.writeInt(verifyAuthToken ? 1 : 0);
                            i3 = 88450693;
                            break;
                        }
                    case 5:
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        int A034 = 0FI.A03(-230268307);
                        11T.A0F(createStringArrayList, 0);
                        C1li c1li2 = XplatServiceDelegate.A04;
                        0fH.A0j("MqttXplatService", AnonymousClass001.A0Z(createStringArrayList, "xplat client unsubscribe from ", AnonymousClass001.A0k()));
                        verifyAuthToken = XplatServiceDelegate.A03.A03(createStringArrayList);
                        0FI.A09(-1893732906, A034);
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 6:
                        verifyAuthToken = CZo(IMqttPublishListener.Stub.A00(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 7:
                        String readString = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        int readInt = parcel.readInt();
                        String readString2 = parcel.readString();
                        final IMqttPublishListener A00 = IMqttPublishListener.Stub.A00(parcel.readStrongBinder());
                        int A035 = 0FI.A03(1778891607);
                        11T.A0F(readString, 0);
                        1BK.A1J(createByteArray, 1, readString2);
                        verifyAuthToken = XplatServiceDelegate.A04.A00(new MqttPublishListener() { // from class: X.9zu
                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onFailure(int i4, int i5) {
                                XplatServiceDelegate$remoteBinder$1.this.A00(new AKR(A00, i4, i5));
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onSuccess(int i4) {
                                XplatServiceDelegate$remoteBinder$1.this.A00(new AKU(i4, 2, A00));
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public void onTimeout(int i4, boolean z2) {
                                XplatServiceDelegate$remoteBinder$1.this.A00(new AKS(A00, i4, z2));
                            }
                        }, 2BA.A00(readInt), readString, readString2, createByteArray);
                        0FI.A09(-1539404458, A035);
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 8:
                        String readString3 = parcel.readString();
                        byte[] createByteArray2 = parcel.createByteArray();
                        int readInt2 = parcel.readInt();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            iMqttPublishExtListener = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.facebook.mqtt.service.ipc.IMqttPublishExtListener");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMqttPublishExtListener)) {
                                ?? obj2 = new Object();
                                int A036 = 0FI.A03(-1947178561);
                                obj2.A00 = readStrongBinder2;
                                0FI.A09(-42119513, A036);
                                iMqttPublishExtListener = obj2;
                            } else {
                                iMqttPublishExtListener = (IMqttPublishExtListener) queryLocalInterface2;
                            }
                        }
                        verifyAuthToken = CZq(iMqttPublishExtListener, readString3, createByteArray2, readInt2);
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 9:
                        verifyAuthToken = CZp(parcel.readString(), parcel.createByteArray(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 10:
                        verifyAuthToken = Adx();
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                    case 11:
                        String mqttHealthStats = getMqttHealthStats();
                        parcel2.writeNoException();
                        parcel2.writeString(mqttHealthStats);
                        i3 = 88450693;
                        break;
                    case 12:
                        verifyAuthToken = verifyAuthToken(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(verifyAuthToken ? 1 : 0);
                        i3 = 88450693;
                        break;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.mqtt.service.ipc.IMqttXplatService");
                i3 = 1207490643;
            }
            0FI.A09(i3, A03);
            return z;
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = -1682996297;
        0FI.A09(i3, A03);
        return z;
    }

    @Override // com.facebook.mqtt.service.ipc.IMqttXplatService
    public boolean verifyAuthToken(String str) {
        int A03 = 0FI.A03(2027126081);
        11T.A0F(str, 0);
        1nK r0 = XplatServiceDelegate.A08;
        boolean verifyAuthToken = r0 != null ? r0.verifyAuthToken(str) : false;
        0FI.A09(1285993002, A03);
        return verifyAuthToken;
    }
}
