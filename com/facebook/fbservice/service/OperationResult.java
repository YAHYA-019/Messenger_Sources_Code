package com.facebook.fbservice.service;

import X.0G8;
import X.0Pz;
import X.0S2;
import X.1BK;
import X.29B;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C23u;
import X.C2xc;
import X.DBv;
import X.FJ8;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: OperationResult.class */
public final class OperationResult implements Parcelable, Serializable {
    public static final OperationResult A00 = new OperationResult();
    public static final Parcelable.Creator CREATOR = new C2xc(7);
    public static final long serialVersionUID = 1;
    public 29B errorCode;
    public String errorDescription;
    public Throwable errorThrowable;
    public Bundle resultDataBundle;
    public String resultDataString;
    public boolean success;

    public OperationResult() {
        this.success = true;
        this.resultDataString = null;
        this.resultDataBundle = null;
        this.errorCode = 29B.A0D;
        this.errorDescription = null;
        this.errorThrowable = null;
    }

    public OperationResult(Bundle bundle, 29B r303, String str, Throwable th) {
        this.success = false;
        this.resultDataString = null;
        this.resultDataBundle = bundle;
        this.errorCode = r303;
        this.errorDescription = str;
        this.errorThrowable = th;
    }

    public OperationResult(String str, Bundle bundle) {
        this.success = true;
        this.resultDataString = str;
        this.resultDataBundle = bundle;
        this.errorCode = 29B.A0D;
        this.errorDescription = null;
        this.errorThrowable = null;
    }

    public OperationResult(Throwable th) {
        this.success = false;
        this.resultDataString = null;
        this.errorCode = null;
        this.errorDescription = null;
        this.errorThrowable = th;
        Bundle bundle = new Bundle();
        this.resultDataBundle = bundle;
        bundle.putInt("resultType", 1);
    }

    public static OperationResult A00(Parcelable parcelable) {
        Bundle A05 = 1BK.A05();
        A05.putInt("resultType", 1);
        A05.putParcelable("result", parcelable);
        return new OperationResult(null, A05);
    }

    public static OperationResult A01(29B r301) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultType", 1);
        return new OperationResult(bundle, r301, r301.toString(), null);
    }

    public static OperationResult A02(29B r301, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultType", 1);
        return new OperationResult(bundle, r301, str, null);
    }

    public static OperationResult A03(29B r301, Throwable th) {
        Bundle A05 = 1BK.A05();
        A05.putInt("resultType", 1);
        return new OperationResult(A05, r301, r301.toString(), th);
    }

    public static OperationResult A04(Object obj) {
        if (obj instanceof String) {
            return new OperationResult((String) obj, null);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("resultType", (obj == null ? 0S2.A00 : obj instanceof Parcelable ? 0S2.A01 : 0S2.A0C).intValue());
        if (obj instanceof Parcelable) {
            bundle.putParcelable("result", (Parcelable) obj);
        } else if (obj instanceof C23u) {
            FJ8.A08(bundle, (C23u) obj, "result");
        } else if (obj != null) {
            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Can not create result for object ", AnonymousClass001.A0k()));
        }
        return new OperationResult(null, bundle);
    }

    public static OperationResult A05(String str, Pair... pairArr) {
        Bundle A05 = 1BK.A05();
        int length = pairArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new OperationResult(str, A05);
            }
            Pair pair = pairArr[i2];
            A05.putParcelable((String) pair.first, (Parcelable) pair.second);
            i = i2 + 1;
        }
    }

    public static OperationResult A06(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        int i = 0;
        boolean z = false;
        if (arrayList == null) {
            z = true;
        }
        bundle.putSerializable("resultNull", Boolean.valueOf(z));
        if (arrayList != null) {
            bundle.putInt("resultSize", arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                bundle.putInt(0Pz.A0T("resultType", i), (next == null ? 0S2.A00 : next instanceof Parcelable ? 0S2.A01 : 0S2.A0C).intValue());
                if (next instanceof Parcelable) {
                    bundle.putParcelable(0Pz.A0T("result", i), (Parcelable) next);
                } else {
                    if (!(next instanceof C23u)) {
                        throw AnonymousClass001.A0q(AnonymousClass001.A0Z(next, "Can not create result for object ", AnonymousClass001.A0k()));
                    }
                    FJ8.A08(bundle, (C23u) next, 0Pz.A0T("result", i));
                }
                i++;
            }
        }
        return new OperationResult(null, bundle);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.success = objectInputStream.readBoolean();
        this.resultDataString = (String) objectInputStream.readObject();
        Bundle A05 = 1BK.A05();
        this.resultDataBundle = A05;
        A05.putSerializable("result", (HashMap) objectInputStream.readObject());
        this.errorCode = (29B) objectInputStream.readObject();
        this.errorDescription = (String) objectInputStream.readObject();
        this.errorThrowable = (Throwable) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeBoolean(this.success);
        objectOutputStream.writeObject(this.resultDataString);
        Bundle bundle = this.resultDataBundle;
        objectOutputStream.writeObject(bundle != null ? bundle.getSerializable("result") : null);
        objectOutputStream.writeObject(this.errorCode);
        objectOutputStream.writeObject(this.errorDescription);
        objectOutputStream.writeObject(this.errorThrowable);
    }

    public Object A07() {
        Object A08 = A08();
        if (A08 != null) {
            return A08;
        }
        throw new DBv();
    }

    public Object A08() {
        Object obj = null;
        if (this.resultDataBundle != null) {
            Integer num = 0S2.A00(3)[this.resultDataBundle.getInt("resultType")];
            if (!0S2.A00.equals(num)) {
                boolean equals = 0S2.A0C.equals(num);
                Bundle bundle = this.resultDataBundle;
                if (!equals) {
                    bundle.setClassLoader(getClass().getClassLoader());
                    return this.resultDataBundle.get("result");
                }
                obj = FJ8.A03(bundle, "result");
            }
        }
        return obj;
    }

    public Object A09(Class cls) {
        Serializable serializable;
        if (Parcelable.class.isAssignableFrom(cls)) {
            return A07();
        }
        if (Bundle.class.equals(cls)) {
            return this.resultDataBundle;
        }
        if (CharSequence.class.isAssignableFrom(cls)) {
            return this.resultDataString;
        }
        if (List.class.isAssignableFrom(cls)) {
            return A0B();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            throw AnonymousClass002.A0C(cls, "Invalid result data type: ", AnonymousClass001.A0k());
        }
        Bundle bundle = this.resultDataBundle;
        if (bundle == null || (serializable = bundle.getSerializable("result")) == null) {
            throw new DBv();
        }
        return serializable;
    }

    public Object A0A(String str) {
        Bundle bundle = this.resultDataBundle;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        Bundle bundle2 = this.resultDataBundle;
        if (bundle2 != null) {
            return bundle2.get(str);
        }
        return null;
    }

    public ArrayList A0B() {
        ArrayList A0C = A0C();
        if (A0C != null) {
            return A0C;
        }
        throw new DBv();
    }

    public ArrayList A0C() {
        Bundle bundle = this.resultDataBundle;
        if (bundle == null || bundle.getBoolean("resultNull")) {
            return null;
        }
        int i = this.resultDataBundle.getInt("resultSize");
        ArrayList arrayList = new ArrayList();
        Integer[] A002 = 0S2.A00(3);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return arrayList;
            }
            Integer num = A002[this.resultDataBundle.getInt(0Pz.A0T("resultType", i3))];
            if (0S2.A00.equals(num)) {
                arrayList.add(null);
            } else if (0S2.A0C.equals(num)) {
                arrayList.add(FJ8.A03(this.resultDataBundle, 0Pz.A0T("result", i3)));
            } else {
                Object A0A = A0A(0Pz.A0T("result", i3));
                if (A0A == null) {
                    throw new DBv();
                }
                arrayList.add(A0A);
            }
            i2 = i3 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str;
        Boolean valueOf = Boolean.valueOf(this.success);
        String str2 = this.resultDataString;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        Bundle bundle = this.resultDataBundle;
        String obj = bundle == null ? str : bundle.toString();
        29B r0 = this.errorCode;
        String name = r0 == null ? str : r0.name();
        String str3 = this.errorDescription;
        if (str3 == null) {
            str3 = str;
        }
        Throwable th = this.errorThrowable;
        return StringFormatUtil.formatStrLocaleSafe("OperationResult success=%s, resultDataString=%s, resultDataBundle=%s, errorCode=%s, errorDescription=%s, exception=%s", valueOf, str2, obj, name, str3, th != null ? 0G8.A01(th) : "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.resultDataString);
        parcel.writeBundle(this.resultDataBundle);
        parcel.writeString(this.errorCode.toString());
        parcel.writeString(this.errorDescription);
        parcel.writeSerializable(this.errorThrowable);
    }
}
