package com.facebook.browser.lite.ipc;

import X.0FI;
import X.1BL;
import X.4YV;
import X.7zS;
import X.AbM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQy;
import X.Kvm;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.browser.lite.extensions.moreinfo.MoreInfoStore$MoreInfoCallbackHandler;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: BrowserLiteCallback.class */
public interface BrowserLiteCallback extends IInterface {

    /* loaded from: BrowserLiteCallback$Stub.class */
    public abstract class Stub extends Binder implements BrowserLiteCallback {

        /* loaded from: BrowserLiteCallback$Stub$Proxy.class */
        public final class Proxy implements BrowserLiteCallback {
            public IBinder A00;

            public static void A00(Parcel parcel, String str) {
                parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                parcel.writeString(str);
            }

            public static boolean A01(Parcel parcel, Parcelable parcelable) {
                parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                Kvm.A01(parcel, parcelable, 0);
                return false;
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void ACb(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
                int A03 = 0FI.A03(844923089);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeMap(map);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1360329999, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-665243539, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void AS2(AutofillContactDataCallback autofillContactDataCallback) {
                int A03 = 0FI.A03(-1775449315);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeStrongInterface(autofillContactDataCallback);
                    JQy.A14(this.A00, obtain, obtain2, 28);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1739297036, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-428878988, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void AS3(AutofillScriptCallback autofillScriptCallback) {
                int A03 = 0FI.A03(1850332226);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeStrongInterface(autofillScriptCallback);
                    JQy.A14(this.A00, obtain, obtain2, 27);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(337700036, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-350602278, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public PrefetchCacheEntry B4A(String str) {
                int A03 = 0FI.A03(-1265314492);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 20);
                    PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) AnonymousClass002.A0I(obtain2, PrefetchCacheEntry.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1591116145, A03);
                    return prefetchCacheEntry;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(407969762, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public ArrayList B4B() {
                int A03 = 0FI.A03(-306861057);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 19);
                    ArrayList<String> createStringArrayList = obtain2.createStringArrayList();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1152981777, A03);
                    return createStringArrayList;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1495120046, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BLg(String str) {
                int A03 = 0FI.A03(1759965785);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 43);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(408916704, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1263883452, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BLl(String str) {
                int A03 = 0FI.A03(1448447463);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 78);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-614731322, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1648740778, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BLm(String str, String str2) {
                int A03 = 0FI.A03(85103887);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    JQy.A14(this.A00, obtain, obtain2, 76);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1316329788, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(897873897, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public int BM8(String str) {
                int A03 = 0FI.A03(-375372880);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 1);
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1295392034, A03);
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1255314008, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public boolean BMB(Bundle bundle, ZonePolicy zonePolicy, String str) {
                int A03 = 0FI.A03(-843864128);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    boolean z = false;
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    if (1BL.A02(this.A00, obtain, obtain2, 42) != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-312575520, A03);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-198971764, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public boolean BMP(String str) {
                int A03 = 0FI.A03(789039959);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    boolean z = false;
                    if (1BL.A02(this.A00, obtain, obtain2, 24) != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1808923312, A03);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(726175430, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public boolean BMh(String str, String str2) {
                int A03 = 0FI.A03(-1970581553);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    boolean z = false;
                    if (1BL.A02(this.A00, obtain, obtain2, 2) != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2115193814, A03);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-828393000, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BOX() {
                int A03 = 0FI.A03(-1522210368);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 34);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1156565096, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1483907228, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BWz(IsUrlSavedCallback isUrlSavedCallback, String str) {
                int A03 = 0FI.A03(951251318);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeStrongInterface(isUrlSavedCallback);
                    JQy.A14(this.A00, obtain, obtain2, 48);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-31358295, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-453604295, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BY6(String str) {
                int A03 = 0FI.A03(-37818060);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 35);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(8732916, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1898825193, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BZc(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
                int A03 = 0FI.A03(-2144255664);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeMap(map);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1371537218, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(956848384, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BZd(String str, String str2, Map map, long j) {
                int A03 = 0FI.A03(1803477848);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeLong(j);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    JQy.A14(this.A00, obtain, obtain2, 79);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1143742853, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1470436474, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BZe(String str, String str2, Map map, long j) {
                int A03 = 0FI.A03(1015320200);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeLong(j);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    JQy.A14(this.A00, obtain, obtain2, 77);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(612980792, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-450311687, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BZy(String str) {
                int A03 = 0FI.A03(460088225);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 69);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2121647867, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-982652169, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BaG(Bundle bundle, String str, String str2, boolean z) {
                int A03 = 0FI.A03(-2060855814);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1801923260, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1186198032, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BaH(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
                int A03 = 0FI.A03(453135490);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    obtain.writeLong(j4);
                    obtain.writeLong(j5);
                    obtain.writeInt(i);
                    int i2 = 1;
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    obtain.writeInt(AnonymousClass001.A1N(z2 ? 1 : 0) ? 1 : 0);
                    obtain.writeInt(AnonymousClass001.A1N(z3 ? 1 : 0) ? 1 : 0);
                    obtain.writeMap(map);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    obtain.writeMap(map2);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(481166511, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1915585145, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BaO(Bundle bundle, String str, String str2, long j, boolean z) {
                int A03 = 0FI.A03(1342596760);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-893637694, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(2138048330, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BaT(Bundle bundle) {
                int A03 = 0FI.A03(1798639116);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, bundle);
                    this.A00.transact(63, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1853644852, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1421911345, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BbR(String str, String str2) {
                int A03 = 0FI.A03(-1492294979);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    JQy.A14(this.A00, obtain, obtain2, 68);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1401083466, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(914302173, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Bbi(Bundle bundle, Map map) {
                int A03 = 0FI.A03(-1784579604);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(530257631, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1661130105, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public String BdW(String str) {
                int A03 = 0FI.A03(-1704342652);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    JQy.A14(this.A00, obtain, obtain2, 25);
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-19251795, A03);
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(8888453, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void BkM(AutofillOptOutCallback autofillOptOutCallback, String str) {
                int A03 = 0FI.A03(-1761575952);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeStrongInterface(autofillOptOutCallback);
                    JQy.A14(this.A00, obtain, obtain2, 26);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2095973056, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(710765706, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Brn(String str, Bundle bundle) {
                int A03 = 0FI.A03(-1678923046);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1714557767, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1685312379, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Bx2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
                int A03 = 0FI.A03(1284694047);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1895056067, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(242326286, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Bz1() {
                int A03 = 0FI.A03(49581761);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 41);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1006788848, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(660425260, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C1C(String str, List list) {
                int A03 = 0FI.A03(1057898864);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeList(list);
                    JQy.A14(this.A00, obtain, obtain2, 23);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-516840860, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(375085294, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C1E(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
                int A03 = 0FI.A03(1515294289);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, iABEvent);
                    Kvm.A01(obtain, bundle, A01 ? 1 : 0);
                    Kvm.A01(obtain, zonePolicy, A01 ? 1 : 0);
                    this.A00.transact(4, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1088028676, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1984691087, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C2t(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
                int A03 = 0FI.A03(2002744335);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, browserLiteJSBridgeCall);
                    obtain.writeStrongInterface(browserLiteJSBridgeCallback);
                    this.A00.transact(21, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2042545552, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1361320787, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C7c(String str, String str2) {
                int A03 = 0FI.A03(1411451947);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    JQy.A14(this.A00, obtain, obtain2, 58);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-399572908, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-317751930, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C7d(MoreInfoCallback moreInfoCallback, String str, String str2, String str3, String str4, boolean z) {
                int A03 = 0FI.A03(-1215865455);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    obtain.writeStrongInterface(moreInfoCallback);
                    this.A00.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1492125781, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1739267271, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void C9s(Map map) {
                int A03 = 0FI.A03(1347116685);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    JQy.A14(this.A00, obtain, obtain2, 61);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(862349773, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(429425926, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CAZ(int i, String str, Bundle bundle) {
                int A03 = 0FI.A03(-1302481321);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    Kvm.A01(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.A00.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1002261425, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1191521422, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CAb(Bundle bundle, String str, int i, long j) {
                int A03 = 0FI.A03(2086073855);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    Kvm.A01(obtain, bundle, 0);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.A00.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2039537454, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1456072416, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CAj(Bundle bundle, String str, String str2) {
                int A03 = 0FI.A03(-1619222897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeString(str2);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(510790745, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-565490210, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CAz(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
                int A03 = 0FI.A03(-1815910792);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    obtain.writeInt(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1237399148, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1524282767, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CFI(Map map) {
                int A03 = 0FI.A03(-1769196388);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    JQy.A14(this.A00, obtain, obtain2, 16);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2107408683, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1160342537, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CHs(Bundle bundle, ZonePolicy zonePolicy, String str) {
                int A03 = 0FI.A03(1537631812);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    A00(obtain, str);
                    Kvm.A01(obtain, bundle, 0);
                    Kvm.A01(obtain, zonePolicy, 0);
                    this.A00.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-378591134, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-658421847, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CKa() {
                int A03 = 0FI.A03(463162871);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 46);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1066070508, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-504628911, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CT4(String str, Bundle bundle) {
                int A03 = 0FI.A03(991632442);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, bundle);
                    obtain.writeString(str);
                    this.A00.transact(40, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2117043841, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(318205377, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CT8(Bundle bundle, Map map) {
                int A03 = 0FI.A03(59897858);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1587274681, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1893171265, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CW2() {
                int A03 = 0FI.A03(-1156139546);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 67);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-54410587, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1435614980, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CWF(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
                int A03 = 0FI.A03(-1272321443);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, bundle);
                    obtain.writeStrongInterface(onShopsLiteCallback);
                    this.A00.transact(62, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-1015225338, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(672175466, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void CWG(Bundle bundle) {
                int A03 = 0FI.A03(2082176756);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    boolean A01 = A01(obtain, bundle);
                    this.A00.transact(64, obtain, obtain2, A01 ? 1 : 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(503655733, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1711539851, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Cge(Bundle bundle, long[] jArr) {
                int A03 = 0FI.A03(989552937);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeLongArray(jArr);
                    Kvm.A01(obtain, bundle, 0);
                    this.A00.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1161856798, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(1238210430, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void ChX() {
                int A03 = 0FI.A03(-811615659);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 33);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-746311480, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(331853409, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void Cok() {
                int A03 = 0FI.A03(-13079558);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 30);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-2052614521, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(593532088, A03);
                    throw th;
                }
            }

            @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
            public void D3v() {
                int A03 = 0FI.A03(53440699);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    JQy.A14(this.A00, obtain, obtain2, 22);
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(2106614545, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    0FI.A09(-957228098, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int A03 = 0FI.A03(1291148035);
                IBinder iBinder = this.A00;
                0FI.A09(281641695, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = 0FI.A03(-48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            0FI.A09(-1722318555, A03);
        }

        public static Bundle A00(Parcel parcel) {
            return (Bundle) Kvm.A00(parcel, Bundle.CREATOR);
        }

        public static IBinder A01(Parcel parcel) {
            parcel.readString();
            parcel.readString();
            Kvm.A00(parcel, Bundle.CREATOR);
            return parcel.readStrongBinder();
        }

        public static void A02(IBinder iBinder) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                0FI.A09(319826482, 0FI.A03(-1834413364));
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(1416617752, 0FI.A03(1175971799));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v725, types: [int] */
        /* JADX WARN: Type inference failed for: r309v15, types: [com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r309v20, types: [com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r309v25, types: [java.lang.Object, com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy] */
        /* JADX WARN: Type inference failed for: r309v33, types: [com.facebook.browser.lite.ipc.IsUrlSavedCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r309v44, types: [com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r309v9, types: [com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy, java.lang.Object] */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            boolean BM8;
            BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback;
            AutofillOptOutCallback autofillOptOutCallback;
            AutofillScriptCallback autofillScriptCallback;
            AutofillContactDataCallback autofillContactDataCallback;
            int A03;
            int i4;
            IsUrlSavedCallback isUrlSavedCallback;
            OnShopsLiteCallback onShopsLiteCallback;
            int A032;
            int i5;
            int A033 = 0FI.A03(-818611076);
            boolean z = true;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    switch (i) {
                        case 1:
                            BM8 = BM8(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 2:
                            BM8 = BMh(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 3:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            0FI.A09(-817499498, 0FI.A03(1396943976));
                            BM8 = false;
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 4:
                            C1E(A00(parcel), (IABEvent) AnonymousClass002.A0I(parcel, IABEvent.CREATOR), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 5:
                            Brn(parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 6:
                            CHs(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 7:
                            CAz(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString(), AbM.A1V(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 8:
                            BaO(A00(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), AbM.A1W(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 9:
                            BaG(A00(parcel), parcel.readString(), parcel.readString(), AbM.A1V(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 10:
                            String readString = parcel.readString();
                            long readLong = parcel.readLong();
                            long readLong2 = parcel.readLong();
                            long readLong3 = parcel.readLong();
                            long readLong4 = parcel.readLong();
                            long readLong5 = parcel.readLong();
                            int readInt = parcel.readInt();
                            boolean A1Z = 7zS.A1Z(parcel);
                            boolean A1Z2 = 7zS.A1Z(parcel);
                            boolean A1Z3 = 7zS.A1Z(parcel);
                            ClassLoader A0e = 4YV.A0e(this);
                            BaH(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), readString, parcel.readString(), parcel.readHashMap(A0e), parcel.readHashMap(A0e), readInt, readLong, readLong2, readLong3, readLong4, readLong5, A1Z, A1Z2, A1Z3, 7zS.A1Z(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 11:
                            CAj(A00(parcel), parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 12:
                            CAb(A00(parcel), parcel.readString(), parcel.readInt(), parcel.readLong());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 13:
                            CAZ(parcel.readInt(), parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 14:
                            Cge(A00(parcel), parcel.createLongArray());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 15:
                            Bx2(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString(), parcel.readString(), parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 16:
                            CFI(parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 17:
                            CT8(A00(parcel), parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 18:
                            Bbi(A00(parcel), parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 19:
                            ArrayList B4B = B4B();
                            parcel2.writeNoException();
                            parcel2.writeStringList(B4B);
                            i3 = -399314222;
                            break;
                        case 20:
                            PrefetchCacheEntry B4A = B4A(parcel.readString());
                            parcel2.writeNoException();
                            Kvm.A01(parcel2, B4A, 1);
                            i3 = -399314222;
                            break;
                        case 21:
                            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = (BrowserLiteJSBridgeCall) AnonymousClass002.A0I(parcel, BrowserLiteJSBridgeCall.CREATOR);
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder == null) {
                                browserLiteJSBridgeCallback = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                                if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteJSBridgeCallback)) {
                                    ?? obj = new Object();
                                    int A034 = 0FI.A03(1706335356);
                                    obj.A00 = readStrongBinder;
                                    0FI.A09(2128347639, A034);
                                    browserLiteJSBridgeCallback = obj;
                                } else {
                                    browserLiteJSBridgeCallback = (BrowserLiteJSBridgeCallback) queryLocalInterface;
                                }
                            }
                            C2t(browserLiteJSBridgeCall, browserLiteJSBridgeCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 22:
                            D3v();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 23:
                            C1C(parcel.readString(), parcel.readArrayList(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 24:
                            BM8 = BMP(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 25:
                            String BdW = BdW(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeString(BdW);
                            i3 = -399314222;
                            break;
                        case 26:
                            String readString2 = parcel.readString();
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 == null) {
                                autofillOptOutCallback = null;
                            } else {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof AutofillOptOutCallback)) {
                                    ?? obj2 = new Object();
                                    int A035 = 0FI.A03(720787706);
                                    obj2.A00 = readStrongBinder2;
                                    0FI.A09(464571067, A035);
                                    autofillOptOutCallback = obj2;
                                } else {
                                    autofillOptOutCallback = (AutofillOptOutCallback) queryLocalInterface2;
                                }
                            }
                            BkM(autofillOptOutCallback, readString2);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 27:
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            if (readStrongBinder3 == null) {
                                autofillScriptCallback = null;
                            } else {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                                if (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof AutofillScriptCallback)) {
                                    ?? obj3 = new Object();
                                    int A036 = 0FI.A03(-1557325651);
                                    obj3.A00 = readStrongBinder3;
                                    0FI.A09(516694902, A036);
                                    autofillScriptCallback = obj3;
                                } else {
                                    autofillScriptCallback = (AutofillScriptCallback) queryLocalInterface3;
                                }
                            }
                            AS3(autofillScriptCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 28:
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 == null) {
                                autofillContactDataCallback = null;
                            } else {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                                if (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof AutofillContactDataCallback)) {
                                    ?? obj4 = new Object();
                                    int A037 = 0FI.A03(-846231890);
                                    obj4.A00 = readStrongBinder4;
                                    0FI.A09(-1543772660, A037);
                                    autofillContactDataCallback = obj4;
                                } else {
                                    autofillContactDataCallback = (AutofillContactDataCallback) queryLocalInterface4;
                                }
                            }
                            AS2(autofillContactDataCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 29:
                            parcel.readString();
                            A03 = 0FI.A03(-1128127975);
                            i4 = -1560611219;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 30:
                            Cok();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 31:
                            0FI.A09(1342809810, 0FI.A03(-1808719344));
                            BM8 = false;
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 32:
                            A03 = 0FI.A03(-1176921101);
                            i4 = 1706699282;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 33:
                            ChX();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 34:
                            BOX();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 35:
                            BY6(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 36:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            A03 = 0FI.A03(2041834319);
                            i4 = -817751298;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 37:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            A03 = 0FI.A03(-1030164397);
                            i4 = 428846441;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 38:
                            parcel.readString();
                            A03 = 0FI.A03(192201844);
                            i4 = -5293628;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 39:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            A03 = 0FI.A03(1340126013);
                            i4 = -255253685;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 40:
                            CT4(parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 41:
                            Bz1();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 42:
                            BM8 = BMB(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case 43:
                            BLg(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                            BZc(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString(), parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.ON_CREATE_VIEW_END /* 45 */:
                            ACb(A00(parcel), (ZonePolicy) AnonymousClass002.A0I(parcel, ZonePolicy.CREATOR), parcel.readString(), parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 46:
                            CKa();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.ON_START_END /* 47 */:
                            parcel.readString();
                            A03 = 0FI.A03(1108819582);
                            i4 = -1570332119;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.QUEUED /* 48 */:
                            String readString3 = parcel.readString();
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 == null) {
                                isUrlSavedCallback = null;
                            } else {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.facebook.browser.lite.ipc.IsUrlSavedCallback");
                                if (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof IsUrlSavedCallback)) {
                                    ?? obj5 = new Object();
                                    int A038 = 0FI.A03(-690544592);
                                    obj5.A00 = readStrongBinder5;
                                    0FI.A09(615095521, A038);
                                    isUrlSavedCallback = obj5;
                                } else {
                                    isUrlSavedCallback = (IsUrlSavedCallback) queryLocalInterface5;
                                }
                            }
                            BWz(isUrlSavedCallback, readString3);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.IN_PROGRESS /* 49 */:
                            C7d(MoreInfoStore$MoreInfoCallbackHandler.A00(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), 7zS.A1Z(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 50:
                            parcel.readString();
                            parcel.readString();
                            A02(A01(parcel));
                            A03 = 0FI.A03(-1925715939);
                            i4 = -448766169;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.UNKNOWN /* 51 */:
                            parcel.readString();
                            A02(A01(parcel));
                            A03 = 0FI.A03(201721215);
                            i4 = 2086356224;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            IBinder readStrongBinder6 = parcel.readStrongBinder();
                            if (readStrongBinder6 != null) {
                                readStrongBinder6.queryLocalInterface("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                                ExternalProvider externalProvider = ExternalProviders.A07;
                                externalProvider.A0A().A00(6, 22, -1815032394, externalProvider.A0A().A00(6, 21, 979870901, 0, 0L), 0L);
                            }
                            A03 = 0FI.A03(1243541875);
                            i4 = 906370536;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                            parcel.readString();
                            IBinder A01 = A01(parcel);
                            if (A01 != null) {
                                A01.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                                0FI.A09(1487629942, 0FI.A03(-1190475058));
                            }
                            A03 = 0FI.A03(-35045212);
                            i4 = -2058597473;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.QUEUEING_BEGIN /* 54 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.createStringArrayList();
                            A02(A01(parcel));
                            A03 = 0FI.A03(1831815735);
                            i4 = 1066841330;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.QUEUEING_SUCCESS /* 55 */:
                            parcel.readString();
                            IBinder A012 = A01(parcel);
                            if (A012 != null) {
                                A012.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                                0FI.A09(1487629942, 0FI.A03(-1190475058));
                            }
                            A03 = 0FI.A03(1857859094);
                            i4 = 1463556319;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.QUEUEING_FAIL /* 56 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.createStringArrayList();
                            IBinder A013 = A01(parcel);
                            if (A013 != null) {
                                A013.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
                                ExternalProvider externalProvider2 = ExternalProviders.A07;
                                externalProvider2.A0A().A00(6, 22, 2117773616, externalProvider2.A0A().A00(6, 21, 1293900710, 0, 0L), 0L);
                            }
                            A03 = 0FI.A03(-1736457853);
                            i4 = -181946629;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.MESSAGE_UPDATE_START /* 57 */:
                            parcel.readString();
                            IBinder A014 = A01(parcel);
                            if (A014 != null) {
                                A014.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionStatesHandlerCallback");
                                ExternalProvider externalProvider3 = ExternalProviders.A07;
                                externalProvider3.A0A().A00(6, 22, 2017802123, externalProvider3.A0A().A00(6, 21, -539093955, 0, 0L), 0L);
                            }
                            A03 = 0FI.A03(1122440842);
                            i4 = 482709689;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.MESSAGE_UPDATE_END /* 58 */:
                            C7c(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.PHOTO_CAPTURED /* 59 */:
                            parcel.readString();
                            parcel.readString();
                            MoreInfoStore$MoreInfoCallbackHandler.A00(parcel.readStrongBinder());
                            A03 = 0FI.A03(-265171495);
                            i4 = 950412850;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            A03 = 0FI.A03(1442027252);
                            i4 = -1237369093;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.COUNTER /* 61 */:
                            C9s(parcel.readHashMap(4YV.A0e(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                            Bundle A00 = A00(parcel);
                            IBinder readStrongBinder7 = parcel.readStrongBinder();
                            if (readStrongBinder7 == null) {
                                onShopsLiteCallback = null;
                            } else {
                                IInterface queryLocalInterface6 = readStrongBinder7.queryLocalInterface("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                                if (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof OnShopsLiteCallback)) {
                                    ?? obj6 = new Object();
                                    int A039 = 0FI.A03(-895528790);
                                    obj6.A00 = readStrongBinder7;
                                    0FI.A09(1650200906, A039);
                                    onShopsLiteCallback = obj6;
                                } else {
                                    onShopsLiteCallback = (OnShopsLiteCallback) queryLocalInterface6;
                                }
                            }
                            CWF(A00, onShopsLiteCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 63:
                            BaT(A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 64:
                            CWG(A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            IBinder readStrongBinder8 = parcel.readStrongBinder();
                            if (readStrongBinder8 != null) {
                                readStrongBinder8.queryLocalInterface("com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback");
                                ExternalProvider externalProvider4 = ExternalProviders.A07;
                                externalProvider4.A0A().A00(6, 22, 31780565, externalProvider4.A0A().A00(6, 21, 649094977, 0, 0L), 0L);
                            }
                            A03 = 0FI.A03(400945834);
                            i4 = -1474575461;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                            AnonymousClass002.A0I(parcel, Bundle.CREATOR);
                            A03 = 0FI.A03(1048724386);
                            i4 = 590510720;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                            CW2();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                            BbR(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                            BZy(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            A03 = 0FI.A03(-473667822);
                            i4 = -1069948608;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            A03 = 0FI.A03(-1944343114);
                            i4 = -1061186111;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readLong();
                            A03 = 0FI.A03(896597690);
                            i4 = 958624801;
                            0FI.A09(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.INTENT_MAPPED /* 73 */:
                            parcel.readString();
                            parcel.readString();
                            BM8 = parcel.readInt();
                            A032 = 0FI.A03(-999229446);
                            i5 = -598849025;
                            0FI.A09(i5, A032);
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                            parcel.readString();
                            parcel.readString();
                            BM8 = AbM.A1W(parcel);
                            A032 = 0FI.A03(355908493);
                            i5 = 2007672390;
                            0FI.A09(i5, A032);
                            parcel2.writeNoException();
                            parcel2.writeInt(BM8 ? 1 : 0);
                            i3 = -399314222;
                            break;
                        case ActionId.ACTIVITY_PAUSED /* 75 */:
                            parcel.readString();
                            parcel.readString();
                            long readLong6 = parcel.readLong();
                            0FI.A09(1287131258, 0FI.A03(-6646776));
                            parcel2.writeNoException();
                            parcel2.writeLong(readLong6);
                            i3 = -399314222;
                            break;
                        case ActionId.ACTIVITY_STARTED /* 76 */:
                            BLm(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.ACTIVITY_RESUMED /* 77 */:
                            BZe(parcel.readString(), parcel.readString(), parcel.readHashMap(4YV.A0e(this)), parcel.readLong());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.FRAGMENT_CREATED /* 78 */:
                            BLl(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case ActionId.FRAGMENT_RESUMED /* 79 */:
                            BZd(parcel.readString(), parcel.readString(), parcel.readHashMap(4YV.A0e(this)), parcel.readLong());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    i3 = -1800119072;
                }
                0FI.A09(i3, A033);
                return z;
            }
            z = super.onTransact(i, parcel, parcel2, i2);
            i3 = -1944335588;
            0FI.A09(i3, A033);
            return z;
        }
    }

    void ACb(Bundle bundle, ZonePolicy zonePolicy, String str, Map map);

    void AS2(AutofillContactDataCallback autofillContactDataCallback);

    void AS3(AutofillScriptCallback autofillScriptCallback);

    PrefetchCacheEntry B4A(String str);

    ArrayList B4B();

    void BLg(String str);

    void BLl(String str);

    void BLm(String str, String str2);

    int BM8(String str);

    boolean BMB(Bundle bundle, ZonePolicy zonePolicy, String str);

    boolean BMP(String str);

    boolean BMh(String str, String str2);

    void BOX();

    void BWz(IsUrlSavedCallback isUrlSavedCallback, String str);

    void BY6(String str);

    void BZc(Bundle bundle, ZonePolicy zonePolicy, String str, Map map);

    void BZd(String str, String str2, Map map, long j);

    void BZe(String str, String str2, Map map, long j);

    void BZy(String str);

    void BaG(Bundle bundle, String str, String str2, boolean z);

    void BaH(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4);

    void BaO(Bundle bundle, String str, String str2, long j, boolean z);

    void BaT(Bundle bundle);

    void BbR(String str, String str2);

    void Bbi(Bundle bundle, Map map);

    String BdW(String str);

    void BkM(AutofillOptOutCallback autofillOptOutCallback, String str);

    void Brn(String str, Bundle bundle);

    void Bx2(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map);

    void Bz1();

    void C1C(String str, List list);

    void C1E(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy);

    void C2t(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void C7c(String str, String str2);

    void C7d(MoreInfoCallback moreInfoCallback, String str, String str2, String str3, String str4, boolean z);

    void C9s(Map map);

    void CAZ(int i, String str, Bundle bundle);

    void CAb(Bundle bundle, String str, int i, long j);

    void CAj(Bundle bundle, String str, String str2);

    void CAz(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z);

    void CFI(Map map);

    void CHs(Bundle bundle, ZonePolicy zonePolicy, String str);

    void CKa();

    void CT4(String str, Bundle bundle);

    void CT8(Bundle bundle, Map map);

    void CW2();

    void CWF(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback);

    void CWG(Bundle bundle);

    void Cge(Bundle bundle, long[] jArr);

    void ChX();

    void Cok();

    void D3v();
}
