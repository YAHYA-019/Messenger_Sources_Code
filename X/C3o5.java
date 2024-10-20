package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.http.internal.tigonengine.FlowObserverRequestInfo;
import com.facebook.messaging.accountswitch.SwitchAccountActivity;
import com.facebook.messenger.neue.MainActivity;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.user.model.User;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3o5, reason: invalid class name */
/* loaded from: 3o5.class */
public abstract class C3o5 {
    public static int A00(int i, int i2) {
        return (Integer.rotateLeft(i2 ^ 4FF.A00(i), 13) * 5) - 430675100;
    }

    public static int A01(Parcel parcel, Object obj) {
        obj.getClass().getClassLoader();
        return parcel.readInt();
    }

    public static int A02(Parcel parcel, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(parcel.readString());
        return i + 1;
    }

    public static int A03(Enum r301) {
        if (r301 == null) {
            return -1;
        }
        return r301.ordinal();
    }

    public static int A04(Number number) {
        if (number == null) {
            return -1;
        }
        return number.intValue();
    }

    public static int A05(Number number, String str) {
        return (str.hashCode() + number.intValue()) * 31;
    }

    public static int A06(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static int A07(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) i2;
        return i5;
    }

    public static long A08(Map.Entry entry) {
        return ((Number) entry.getValue()).longValue();
    }

    public static Intent A09(Context context) {
        1G2 r0 = SwitchAccountActivity.A0I;
        return new Intent(context, (Class<?>) SwitchAccountActivity.class);
    }

    public static Intent A0A(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    public static Intent A0B(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setExtrasClassLoader(MainActivity.class.getClassLoader());
        return intent;
    }

    public static Intent A0C(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.setExtrasClassLoader(MainActivity.class.getClassLoader());
        intent2.setData(intent.getData());
        return intent2;
    }

    public static Intent A0D(Context context, Class cls) {
        return new Intent(context, (Class<?>) cls);
    }

    public static Uri A0E(Intent intent, Object obj, int i) {
        11T.A0F(obj, i);
        return intent.getData();
    }

    public static 1CO A0F(C00i c00i) {
        return (1CO) c00i.get();
    }

    public static 0Gn A0G(0Gn r301, 1Qb r302, String str, long j) {
        r301.A03(str, j);
        return r302.AxQ();
    }

    public static 0ER A0H(16J r301, String str) {
        r301.A04(new String[]{str});
        0ER A00 = r301.A00();
        11T.A0A(A00);
        return A00;
    }

    public static User A0I(C00i c00i) {
        return ((1Ex) c00i.get()).Auc();
    }

    public static 1hM A0J(Object obj) {
        return new 1hM(obj);
    }

    public static 1hM A0K(boolean z) {
        return new 1hM(Boolean.valueOf(z));
    }

    public static FFt A0L(String str, java.util.Map map, java.util.Map map2) {
        FFt A01 = FFt.A01(str, map, map2);
        A01.A00 = 719983200;
        A01.A03 = null;
        A01.A04 = null;
        return A01;
    }

    public static Boolean A0M(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static Object A0N(C00i c00i, int i) {
        return 1Lo.A06(((1Fv) c00i.get()).A04(), i);
    }

    public static String A0O(Parcel parcel) {
        String str = null;
        if (parcel.readInt() != 0) {
            str = parcel.readString();
        }
        return str;
    }

    public static String A0P(24X r301, String str, String str2) {
        return JSONUtil.A0H(r301.A0D(str), str2);
    }

    public static String A0Q(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    public static BitSet A0R(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        BitSet bitSet = new BitSet(i);
        abstractMap.put(obj, obj2);
        return bitSet;
    }

    public static Iterator A0S(Parcel parcel, Set set) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static List A0T(Intent intent) {
        Uri data = intent.getData();
        data.getClass();
        return data.getPathSegments();
    }

    public static List A0U(CharSequence charSequence, String str, int i) {
        return new C04t(str).A03(charSequence, i);
    }

    public static List A0V(Iterable iterable, ListIterator listIterator) {
        return 0QD.A0Y(iterable, listIterator.nextIndex() + 1);
    }

    public static void A0W(int i, String str) {
        0fH.A0i(Long.valueOf(C00j.A00(i)), "ThreadsDbPropertiesContentProvider$Impl", str);
    }

    public static void A0X(Context context, PreferenceGroup preferenceGroup, F5B f5b, QuickPromotionDefinition.ContextualFilter.Type type) {
        preferenceGroup.addPreference(F5B.A00(context, f5b, type));
    }

    public static void A0Y(Context context, DKT dkt, CP0 cp0, String str, String str2) {
        cp0.A05(str, str2);
        dkt.A0A(context, cp0.A03());
    }

    public static void A0Z(Context context, CP0 cp0) {
        ((DKT) 1Bn.A0A(98520)).A0A(context, cp0.A03());
    }

    public static void A0a(Intent intent, Intent intent2) {
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
    }

    public static void A0b(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
    }

    public static void A0c(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getStringExtra(str));
        }
    }

    public static void A0d(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(parcelable, i);
        }
    }

    public static void A0e(Parcel parcel, Enum r302) {
        if (r302 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r302.ordinal());
        }
    }

    public static void A0f(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(number.intValue());
        }
    }

    public static void A0g(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(number.longValue());
        }
    }

    public static void A0h(Parcel parcel, Iterator it) {
        parcel.writeString((String) it.next());
    }

    public static void A0i(4KC r301, Iterator it, int i) {
        String str = (String) it.next();
        if (str == null) {
            r301.ACC(i);
        } else {
            r301.ACG(i, str);
        }
    }

    public static void A0j(1UG r301, String str, String str2, String str3) {
        r301.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        r301.A7R("debug_info", str2);
        r301.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str3);
        r301.BZL();
    }

    public static void A0k(Object obj, int i, Object obj2) {
        11T.A0F(obj, i);
        11T.A0F(obj2, 5);
    }

    public static void A0l(Object obj, Object obj2, String str, Throwable th) {
        0fH.A0z(str, FlowObserverRequestInfo.EXCEPTION_FMT, th, new Object[]{obj, obj2});
    }

    public static void A0m(StringBuilder sb) {
        sb.delete(0, sb.length());
    }

    public static String[] A0n(List list) {
        return (String[]) list.toArray(new String[0]);
    }
}
