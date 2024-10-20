package com.facebook.common.binderhooker;

import X.0FI;
import X.0KO;
import X.0ZU;
import X.0ZW;
import X.AnonymousClass001;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.common.activitythreadhook.ActivityThreadBinderHooker$ApplicationThreadBinderHook;
import java.io.FileDescriptor;

/* loaded from: BinderHook.class */
public abstract class BinderHook extends Binder implements IInterface {
    public static final 0KO ML = new 0KO("BinderHook");
    public 0ZU mCurrentHookedData;
    public final Object mLock;
    public final String mName;
    public boolean mShouldTransparentlyConvert;

    public BinderHook() {
        this(null);
        0FI.A09(-1194310546, 0FI.A03(-376421738));
    }

    public BinderHook(String str) {
        int A03 = 0FI.A03(389790626);
        this.mLock = AnonymousClass001.A0R();
        this.mCurrentHookedData = null;
        this.mShouldTransparentlyConvert = false;
        this.mName = AnonymousClass001.A0X(this);
        0FI.A09(-1655867106, A03);
    }

    public static int callOriginalBinderOnTransactFromHookedData(0ZU r301, int i, Parcel parcel, Parcel parcel2, int i2) {
        0ZW r0;
        if (r301 == null || (r0 = r301.A01) == null) {
            ML.A07("Do not have snapshot of current hooked data, so can't call original binder. This can have serious issues. HookData: %s", new Object[]{r301});
            return 523;
        }
        if (parcel != null) {
            parcel.setDataPosition(0);
        }
        if (parcel2 != null) {
            parcel2.setDataPosition(0);
        }
        return NativeBinderHooker.callOriginalBinderOnTransact(r0.A00, i, parcel, parcel2, i2);
    }

    public static 0ZW getHookedBinderDataFrom(0ZU r301) {
        if (r301 == null) {
            return null;
        }
        return r301.A01;
    }

    public static Binder getHookedBinderFrom(0ZU r301) {
        if (r301 == null) {
            return null;
        }
        return r301.A00;
    }

    private Binder getHookedBinderIfShouldCall() {
        int A03 = 0FI.A03(931153262);
        Binder hookedBinder = getHookedBinder();
        0FI.A09(-1067414401, A03);
        return hookedBinder;
    }

    private Binder getHookedBinder_native() {
        int A03 = 0FI.A03(2109027204);
        Binder hookedBinder = getHookedBinder();
        0FI.A09(-443399799, A03);
        return hookedBinder;
    }

    public static long getHookedDataPtrFrom(0ZU r301) {
        0ZW hookedBinderDataFrom = getHookedBinderDataFrom(r301);
        if (hookedBinderDataFrom == null) {
            return 0L;
        }
        return hookedBinderDataFrom.A00;
    }

    private long getHookedDataPtr_native() {
        int A03 = 0FI.A03(579033870);
        long hookedDataPtr = getHookedDataPtr();
        0FI.A09(-2094432216, A03);
        return hookedDataPtr;
    }

    private Binder getNotWrappedHookedBinder() {
        int A03 = 0FI.A03(-1066733307);
        Binder hookedBinderFrom = getHookedBinderFrom(this.mCurrentHookedData);
        0FI.A09(1452682522, A03);
        return hookedBinderFrom;
    }

    private long getNotWrappedHookedDataPtr() {
        int A03 = 0FI.A03(-791329220);
        long hookedDataPtrFrom = getHookedDataPtrFrom(this.mCurrentHookedData);
        0FI.A09(1118293812, A03);
        return hookedDataPtrFrom;
    }

    private BinderHook getWrappedObjToUse() {
        0FI.A09(886191166, 0FI.A03(2099686188));
        return null;
    }

    public static String hookBinderToString(Binder binder) {
        String interfaceDescriptor;
        if (binder == null) {
            interfaceDescriptor = "<Null Binder>";
        } else {
            interfaceDescriptor = binder.getInterfaceDescriptor();
            if (interfaceDescriptor == null) {
                return "<No Interface Desc>";
            }
        }
        return interfaceDescriptor;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i;
        int A03 = 0FI.A03(239049395);
        IBinder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall == null || !(hookedBinderIfShouldCall instanceof IInterface)) {
            i = 1475318014;
        } else {
            hookedBinderIfShouldCall = ((IInterface) hookedBinderIfShouldCall).asBinder();
            i = -809780118;
        }
        0FI.A09(i, A03);
        return hookedBinderIfShouldCall;
    }

    public void clearHookedBinderData() {
        int A03 = 0FI.A03(-1575160925);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            Object[] objArr = {this.mName, wrappedObjToUse.getName()};
            wrappedObjToUse.clearHookedBinderData();
            0FI.A09(967941669, A03);
            return;
        }
        0ZU r0 = this.mCurrentHookedData;
        Object[] objArr2 = {this.mName, hookBinderToString(getHookedBinderFrom(r0)), r0};
        synchronized (this.mLock) {
            try {
                this.mCurrentHookedData = null;
            } catch (Throwable th) {
                0FI.A09(2104934050, A03);
                throw th;
            }
        }
        0FI.A09(615164817, A03);
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = 0FI.A03(-829322259);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dump(fileDescriptor, strArr);
            i = 612626007;
        } else {
            super.dump(fileDescriptor, strArr);
            i = -1741515878;
        }
        0FI.A09(i, A03);
    }

    @Override // android.os.Binder, android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        int i;
        int A03 = 0FI.A03(1585412868);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.dumpAsync(fileDescriptor, strArr);
            i = -211636046;
        } else {
            super.dumpAsync(fileDescriptor, strArr);
            i = 341877525;
        }
        0FI.A09(i, A03);
    }

    public Binder getHookedBinder() {
        Binder notWrappedHookedBinder;
        int i;
        int A03 = 0FI.A03(-1116733962);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            notWrappedHookedBinder = wrappedObjToUse.getHookedBinder();
            i = 375020093;
        } else {
            notWrappedHookedBinder = getNotWrappedHookedBinder();
            i = -286122783;
        }
        0FI.A09(i, A03);
        return notWrappedHookedBinder;
    }

    public long getHookedDataPtr() {
        long notWrappedHookedDataPtr;
        int i;
        int A03 = 0FI.A03(1102772852);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            notWrappedHookedDataPtr = wrappedObjToUse.getHookedDataPtr();
            i = -2068253736;
        } else {
            notWrappedHookedDataPtr = getNotWrappedHookedDataPtr();
            i = 726620739;
        }
        0FI.A09(i, A03);
        return notWrappedHookedDataPtr;
    }

    @Override // android.os.Binder, android.os.IBinder
    public String getInterfaceDescriptor() {
        String interfaceDescriptor;
        int i;
        int A03 = 0FI.A03(-1236743041);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            interfaceDescriptor = hookedBinderIfShouldCall.getInterfaceDescriptor();
            i = 660187571;
        } else {
            interfaceDescriptor = super.getInterfaceDescriptor();
            i = -2079079549;
        }
        0FI.A09(i, A03);
        return interfaceDescriptor;
    }

    public String getName() {
        int A03 = 0FI.A03(-697685446);
        String str = this.mName;
        0FI.A09(190782397, A03);
        return str;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean isBinderAlive() {
        boolean isBinderAlive;
        int i;
        int A03 = 0FI.A03(1770720429);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            isBinderAlive = hookedBinderIfShouldCall.isBinderAlive();
            i = 2127871636;
        } else {
            isBinderAlive = super.isBinderAlive();
            i = -1892620096;
        }
        0FI.A09(i, A03);
        return isBinderAlive;
    }

    public boolean isHooked() {
        boolean A1T;
        int i;
        int A03 = 0FI.A03(1872862619);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            A1T = wrappedObjToUse.isHooked();
            i = 1688011406;
        } else {
            A1T = AnonymousClass001.A1T(this.mCurrentHookedData);
            i = 1366081844;
        }
        0FI.A09(i, A03);
        return A1T;
    }

    @Override // android.os.Binder, android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        int i2;
        int A03 = 0FI.A03(1929404028);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            hookedBinderIfShouldCall.linkToDeath(deathRecipient, i);
            i2 = 602389253;
        } else {
            super.linkToDeath(deathRecipient, i);
            i2 = -837496000;
        }
        0FI.A09(i2, A03);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int A03 = 0FI.A03(-40174759);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            z = wrappedObjToUse.onTransact(i, parcel, parcel2, i2);
            i3 = -1056663244;
        } else {
            0ZU r0 = this.mCurrentHookedData;
            ActivityThreadBinderHooker$ApplicationThreadBinderHook activityThreadBinderHooker$ApplicationThreadBinderHook = (ActivityThreadBinderHooker$ApplicationThreadBinderHook) this;
            int A032 = 0FI.A03(2126590221);
            z = true;
            activityThreadBinderHooker$ApplicationThreadBinderHook.A01.A01(activityThreadBinderHooker$ApplicationThreadBinderHook.A00, i, parcel);
            0FI.A09(1764171646, A032);
            if (parcel != null) {
                parcel.setDataPosition(0);
            }
            if (parcel2 != null) {
                parcel2.setDataPosition(0);
            }
            int callOriginalBinderOnTransactFromHookedData = callOriginalBinderOnTransactFromHookedData(r0, i, parcel, parcel2, i2);
            if (callOriginalBinderOnTransactFromHookedData == 523) {
                z = super.onTransact(i, parcel, parcel2, i2);
                i3 = 807025287;
            } else {
                if (callOriginalBinderOnTransactFromHookedData != 213) {
                    z = false;
                }
                i3 = 90620012;
            }
        }
        0FI.A09(i3, A03);
        return z;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean pingBinder() {
        boolean pingBinder;
        int i;
        int A03 = 0FI.A03(-678205118);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            pingBinder = hookedBinderIfShouldCall.pingBinder();
            i = 508227447;
        } else {
            pingBinder = super.pingBinder();
            i = -983658150;
        }
        0FI.A09(i, A03);
        return pingBinder;
    }

    @Override // android.os.Binder, android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        IInterface queryLocalInterface;
        int i;
        int A03 = 0FI.A03(1370005925);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            queryLocalInterface = hookedBinderIfShouldCall.queryLocalInterface(str);
            i = -1504908781;
        } else {
            queryLocalInterface = super.queryLocalInterface(str);
            i = 336920254;
        }
        0FI.A09(i, A03);
        return queryLocalInterface;
    }

    public void setHookedBinderData(Binder binder, long j) {
        int A03 = 0FI.A03(1207019107);
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            Object[] objArr = {this.mName, wrappedObjToUse.getName()};
            wrappedObjToUse.setHookedBinderData(binder, j);
            0FI.A09(-2048462348, A03);
            return;
        }
        Object[] objArr2 = {this.mName, hookBinderToString(binder), Long.valueOf(j)};
        synchronized (this.mLock) {
            try {
                this.mCurrentHookedData = new 0ZU(binder, j);
            } catch (Throwable th) {
                0FI.A09(597954832, A03);
                throw th;
            }
        }
        0FI.A09(-43519876, A03);
    }

    public void setShouldTransparentlyConvert(boolean z) {
        int A03 = 0FI.A03(1589894280);
        this.mShouldTransparentlyConvert = z;
        0FI.A09(-944215316, A03);
    }

    public String toString() {
        int A03 = 0FI.A03(-2021918421);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[BinderHook ");
        A0k.append(this.mName);
        A0k.append('(');
        A0k.append(AnonymousClass001.A0Y(this));
        A0k.append(')');
        A0k.append(" Hooked Data: ");
        0ZU r0 = this.mCurrentHookedData;
        A0k.append(r0 != null ? r0.toString() : "Not Hooked");
        BinderHook wrappedObjToUse = getWrappedObjToUse();
        if (wrappedObjToUse != null) {
            A0k.append(" wrap: ");
            A0k.append(wrappedObjToUse.toString());
        }
        String A0g = AnonymousClass001.A0g(A0k, ']');
        0FI.A09(2065824159, A03);
        return A0g;
    }

    @Override // android.os.Binder, android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        boolean unlinkToDeath;
        int i2;
        int A03 = 0FI.A03(1080247057);
        Binder hookedBinderIfShouldCall = getHookedBinderIfShouldCall();
        if (hookedBinderIfShouldCall != null) {
            unlinkToDeath = hookedBinderIfShouldCall.unlinkToDeath(deathRecipient, i);
            i2 = -2145363977;
        } else {
            unlinkToDeath = super.unlinkToDeath(deathRecipient, i);
            i2 = -799434936;
        }
        0FI.A09(i2, A03);
        return unlinkToDeath;
    }
}
