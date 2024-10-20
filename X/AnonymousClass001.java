package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.acra.criticaldata.CriticalAppData;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.Mlog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: X.001, reason: invalid class name */
/* loaded from: 001.class */
public abstract class AnonymousClass001 {
    public static byte A00(RandomAccessFile randomAccessFile, long j) {
        randomAccessFile.seek(j);
        return randomAccessFile.readByte();
    }

    public static byte A01(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        return byteBuffer.get();
    }

    public static int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A03(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A04(List list) {
        return list.size() - 1;
    }

    public static long A05(Object obj) {
        return ((Number) obj).longValue();
    }

    public static SharedPreferences A06(Context context) {
        return context.getSharedPreferences(CriticalAppData.ACRA_CRITICAL_DATA_STORE, 0);
    }

    public static Handler A07() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0g9, X.0g0] */
    public static C0g9 A08(String str, int i, boolean z) {
        return new C0g0(i, str, z);
    }

    public static 0jV A09(String str, int i, boolean z) {
        return new C0g0(i, str, z);
    }

    public static BufferedReader A0A(File file) {
        return new BufferedReader(new FileReader(file));
    }

    public static File A0B(Context context) {
        return new File(context.getApplicationInfo().sourceDir);
    }

    public static File A0C(DexStore dexStore, String str) {
        return new File(dexStore.root, str);
    }

    public static File A0D(File file, String str) {
        return new File(file, str);
    }

    public static File A0E(String str) {
        return new File(str);
    }

    public static FileInputStream A0F(File file) {
        return new FileInputStream(file);
    }

    public static IOException A0G(String str) {
        return new IOException(str);
    }

    public static RandomAccessFile A0H(File file) {
        return new RandomAccessFile(file, "r");
    }

    public static RandomAccessFile A0I(File file) {
        return new RandomAccessFile(file, "rw");
    }

    public static AssertionError A0J(Object obj) {
        return new AssertionError(obj);
    }

    public static Boolean A0K() {
        return true;
    }

    public static IllegalArgumentException A0L(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A0M() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0N(String str) {
        return new IllegalStateException(str);
    }

    public static Long A0O(long j) {
        return Long.valueOf(System.currentTimeMillis() - j);
    }

    public static Long A0P(File file) {
        return Long.valueOf(file.length());
    }

    public static NullPointerException A0Q(String str) {
        return new NullPointerException(str);
    }

    public static Object A0R() {
        return new Object();
    }

    public static Object A0S(Object obj, Method method) {
        return method.invoke(obj, new Object[0]);
    }

    public static RuntimeException A0T(String str) {
        return new RuntimeException(str);
    }

    public static RuntimeException A0U(Throwable th) {
        return new RuntimeException(th);
    }

    public static SecurityException A0V(String str) {
        return new SecurityException(str);
    }

    public static String A0W(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0X(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0Y(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0Z(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0a(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0b(Object obj, java.util.Map map) {
        return (String) map.get(obj);
    }

    public static String A0c(String str, int i) {
        return str.substring(0, i);
    }

    public static String A0d(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0e(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0f(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static String A0g(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static String A0h(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static String A0i(Iterator it) {
        return (String) it.next();
    }

    public static String A0j(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static StringBuilder A0k() {
        return new StringBuilder();
    }

    public static StringBuilder A0l(int i) {
        return new StringBuilder(i);
    }

    public static StringBuilder A0m(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb;
    }

    public static StringBuilder A0n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0o(String str) {
        return new StringBuilder(str);
    }

    public static UnsupportedOperationException A0p() {
        return new UnsupportedOperationException();
    }

    public static UnsupportedOperationException A0q(String str) {
        return new UnsupportedOperationException(str);
    }

    public static Field A0r(Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static ArrayList A0s() {
        return new ArrayList();
    }

    public static ArrayList A0t(int i) {
        return new ArrayList(i);
    }

    public static HashMap A0u() {
        return new HashMap();
    }

    public static HashSet A0v() {
        return new HashSet();
    }

    public static HashSet A0w(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0x(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A0y(java.util.Map map) {
        return map.entrySet().iterator();
    }

    public static Map.Entry A0z(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static NoSuchElementException A10() {
        return new NoSuchElementException();
    }

    public static CountDownLatch A11() {
        return new CountDownLatch(1);
    }

    public static JSONObject A12() {
        return new JSONObject();
    }

    public static void A13() {
        Thread.currentThread().interrupt();
    }

    public static void A14(C0pf c0pf, Integer num) {
        C0pf.A02(c0pf, num, new byte[0]);
    }

    public static void A15(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.canWrite());
    }

    public static void A16(Object obj) {
        0Y2.A00(obj.toString());
    }

    public static void A17(Object obj) {
        android.util.Log.v("FragmentManager", obj.toString());
    }

    public static void A18(Object obj, long j, java.util.Map map) {
        map.put(obj, Long.valueOf(j));
    }

    public static void A19(Object obj, String str, StringBuilder sb) {
        sb.append(obj);
        android.util.Log.v(str, sb.toString());
    }

    public static void A1A(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1B(String str) {
        Mlog.w(str, new Object[0]);
    }

    public static void A1C(String str) {
        Mlog.v(str, new Object[0]);
    }

    public static void A1D(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1E(String str, String str2, StringBuilder sb) {
        sb.append(str);
        android.util.Log.v(str2, sb.toString());
    }

    public static void A1F(String str, String str2, Object[] objArr) {
        android.util.Log.d(str2, String.format(str, objArr));
    }

    public static void A1G(String str, String str2, Object[] objArr) {
        android.util.Log.w(str2, String.format(str, objArr));
    }

    public static void A1H(StringBuilder sb) {
        sb.append(", ");
    }

    public static void A1I(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    public static void A1J(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1K(ReadWriteLock readWriteLock) {
        readWriteLock.readLock().unlock();
    }

    public static void A1L(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static void A1M(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.readLock().unlock();
    }

    public static boolean A1N(int i) {
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        return z;
    }

    public static boolean A1O(int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        return z;
    }

    public static boolean A1P(int i) {
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        return z;
    }

    public static boolean A1Q(int i, int i2) {
        boolean z = false;
        if (i == i2) {
            z = true;
        }
        return z;
    }

    public static boolean A1R(int i, int i2) {
        boolean z = false;
        if (i < i2) {
            z = true;
        }
        return z;
    }

    public static boolean A1S(File file, String str) {
        return new File(file, str).exists();
    }

    public static boolean A1T(Object obj) {
        boolean z = false;
        if (obj != null) {
            z = true;
        }
        return z;
    }

    public static boolean A1U(Object obj) {
        boolean z = false;
        if (obj == null) {
            z = true;
        }
        return z;
    }

    public static boolean A1V(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1W(Object obj, Object obj2) {
        boolean z = false;
        if (obj == obj2) {
            z = true;
        }
        return z;
    }

    public static boolean A1X(String str) {
        return new File(str).exists();
    }

    public static boolean A1Y(Throwable th) {
        return th.getCause() instanceof DeadObjectException;
    }

    public static Object[] A1Z() {
        return new Object[0];
    }

    public static Object[] A1a(int i) {
        return new Object[]{Integer.valueOf(i)};
    }

    public static Object[] A1b(Object obj, int i) {
        return new Object[]{obj, Integer.valueOf(i)};
    }
}
