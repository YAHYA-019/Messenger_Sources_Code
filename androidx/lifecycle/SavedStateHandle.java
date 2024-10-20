package androidx.lifecycle;

import X.06L;
import X.0Du;
import X.0Xr;
import X.0Xs;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C15t;
import X.C2a2;
import X.DKC;
import X.JR0;
import X.LRS;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: SavedStateHandle.class */
public final class SavedStateHandle {
    public static final Class[] ACCEPTABLE_CLASSES;
    public static final Companion Companion = new Object();
    public final Map flows;
    public final Map liveDatas;
    public final Map regular;
    public final 06L savedStateProvider;
    public final Map savedStateProviders;

    /* loaded from: SavedStateHandle$Companion.class */
    public final class Companion {
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            AbstractMap A1C;
            if (bundle != null) {
                ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
                11T.A0D(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(PublicKeyStoreImplKt.DEVICE_TO_DEVICE_KEYS_VALUE);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw AnonymousClass001.A0N("Invalid bundle passed as restored state");
                }
                A1C = 1BK.A1C();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    DKC.A1U(obj);
                    A1C.put(obj, parcelableArrayList2.get(i));
                }
            } else {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                A1C = AnonymousClass001.A0u();
                Iterator A0w = JR0.A0w(bundle2);
                while (A0w.hasNext()) {
                    String A0i = AnonymousClass001.A0i(A0w);
                    11T.A08(A0i);
                    A1C.put(A0i, bundle2.get(A0i));
                }
            }
            return new SavedStateHandle(A1C);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.lifecycle.SavedStateHandle$Companion] */
    static {
        Class[] clsArr = new Class[29];
        System.arraycopy(new Class[]{Size.class, SizeF.class}, 1BK.A1W(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class}, clsArr) ? 1 : 0, clsArr, 27, 2);
        ACCEPTABLE_CLASSES = clsArr;
    }

    public SavedStateHandle() {
        this.regular = 1BK.A1C();
        this.savedStateProviders = 1BK.A1C();
        this.liveDatas = 1BK.A1C();
        this.flows = 1BK.A1C();
        this.savedStateProvider = new LRS(this, 2);
    }

    public SavedStateHandle(Map map) {
        LinkedHashMap A1C = 1BK.A1C();
        this.regular = A1C;
        this.savedStateProviders = 1BK.A1C();
        this.liveDatas = 1BK.A1C();
        this.flows = 1BK.A1C();
        this.savedStateProvider = new LRS(this, 2);
        A1C.putAll(map);
    }

    public final Object get(String str) {
        try {
            return this.regular.get(str);
        } catch (ClassCastException unused) {
            this.regular.remove(str);
            this.liveDatas.remove(str);
            this.flows.remove(str);
            return null;
        }
    }

    public final C15t getStateFlow(String str, Object obj) {
        Map map = this.flows;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (!this.regular.containsKey(str)) {
                this.regular.put(str, obj);
            }
            obj2 = 0Du.A00(this.regular.get(str));
            this.flows.put(str, obj2);
            map.put(str, obj2);
        }
        return new 0Xr((C2a2) null, (C15t) obj2);
    }

    public final void set(String str, Object obj) {
        LiveData liveData;
        11T.A0F(str, 0);
        if (obj != null) {
            Class[] clsArr = ACCEPTABLE_CLASSES;
            int i = 0;
            do {
                Class cls = clsArr[i];
                11T.A0D(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            } while (i < 29);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Can't put value with type ");
            11T.A0D(obj);
            A0k.append(obj.getClass());
            throw AnonymousClass002.A0D(" into saved state", A0k);
        }
        Object obj2 = this.liveDatas.get(str);
        if (!(obj2 instanceof MutableLiveData) || (liveData = (LiveData) obj2) == null) {
            this.regular.put(str, obj);
        } else {
            liveData.setValue(obj);
        }
        0Xs r0 = (0Xs) this.flows.get(str);
        if (r0 != null) {
            r0.Cvx(obj);
        }
    }
}
