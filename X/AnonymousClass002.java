package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.common.dextricks.DexStore;
import com.facebook.superpack.SuperpackArchive;
import dalvik.system.DexFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: X.002, reason: invalid class name */
/* loaded from: 002.class */
public abstract class AnonymousClass002 {
    public static int A00(int i) {
        int i2 = 1237;
        if (i != 0) {
            i2 = 1231;
        }
        return i2;
    }

    public static int A01(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A02(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A03(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A04(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A05(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A06(String str) {
        String str2 = SuperpackArchive.TAG;
        if (str.equals("spo")) {
            return Runtime.getRuntime().availableProcessors();
        }
        return 1;
    }

    public static int A07(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static int A08(int[] iArr, int i, int i2, int i3) {
        return i3 + iArr[(i ^ i2) >>> 4];
    }

    public static Looper A09(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        C0T8.A00(handlerThread);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static SuperpackArchive A0A(InputStream inputStream, String str) {
        inputStream.getClass();
        return new SuperpackArchive(SuperpackArchive.readNative(inputStream, str, 0L), null);
    }

    public static ClassCastException A0B(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot cast");
        sb.append(obj.getClass());
        return new ClassCastException(sb.toString());
    }

    public static IllegalArgumentException A0C(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalArgumentException A0D(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0E(Object obj, StringBuilder sb) {
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static IllegalStateException A0F(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Long A0G() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Long A0H(long j) {
        return Long.valueOf(j / 1000);
    }

    public static Object A0I(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A0J(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static String A0K(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A0L(String str, Object[] objArr) {
        return String.format(null, str, objArr);
    }

    public static StringBuilder A0M(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(obj);
        return sb;
    }

    public static Throwable A0N(Throwable th) {
        return new NoClassDefFoundError().initCause(th);
    }

    public static UnsupportedOperationException A0O() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static Field A0P(0cX r301, Class cls, Class cls2, String str) {
        Field A07 = C0cZ.A07(r301, cls, cls2, str);
        if (A07 != null) {
            A07.setAccessible(true);
        }
        return A07;
    }

    public static void A0Q(Context context, String str, StringBuilder sb) {
        sb.append(str);
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return;
        }
        sb.append('.');
        sb.append(packageName);
    }

    public static void A0R(DexStore.Config.Builder builder) {
        builder.mMode = (byte) 0;
        builder.mSync = (byte) 0;
        builder.mDalvikVerify = (byte) 0;
        builder.mDalvikOptimize = (byte) 0;
        builder.mDalvikRegisterMaps = (byte) 0;
        builder.mArtFilter = (byte) 0;
        builder.mArtHugeMethodMax = -1;
        builder.mArtLargeMethodMax = -1;
        builder.mArtSmallMethodMax = -1;
        builder.mArtTinyMethodMax = -1;
        builder.mArtTruncatedDexSize = -1;
        builder.mEnableArtVerifyNone = false;
        builder.mEnableDex2OatQuickening = false;
        builder.mEnableQuickening = false;
        builder.mEnableMixedMode = false;
        builder.mEnableMixedModeClassPath = false;
        builder.mEnableMixedModePgo = false;
        builder.mPgoCompilerFilter = (byte) 0;
        builder.mDoPeriodicPgoCompilation = false;
        builder.mMinTimeBetweenPgoCompilationMs = 0L;
        builder.mMultidexCompilationStrategy = (byte) 0;
        builder.mLegacyFlags = 0;
        builder.mHenosisFlags = 0;
    }

    public static void A0S(0Y5 r301, int i, long j) {
        if (i != 0) {
            r301.A02("<T");
            r301.A02(Long.toString(j));
            r301.A02(">");
        }
    }

    public static void A0T(OutputStream outputStream, int i) {
        outputStream.write(new byte[]{(byte) i}, 0, 1);
    }

    public static void A0U(PrintWriter printWriter, int i) {
        printWriter.print(Integer.toHexString(i));
    }

    public static void A0V(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        android.util.Log.v(str2, sb.toString());
    }

    public static void A0W(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A0X(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        android.util.Log.v("FragmentManager", sb.toString());
    }

    public static void A0Y(AbstractMap abstractMap) {
        abstractMap.put(Byte.TYPE, "B");
        abstractMap.put(Character.TYPE, "C");
        abstractMap.put(Short.TYPE, "S");
        abstractMap.put(Integer.TYPE, "I");
        abstractMap.put(Long.TYPE, "J");
        abstractMap.put(Float.TYPE, "F");
        abstractMap.put(Double.TYPE, "D");
    }

    public static byte[] A0Z(String str, HttpsURLConnection httpsURLConnection, SSLContext sSLContext) {
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        httpsURLConnection.setConnectTimeout(30000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty(HttpRequestMultipart.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
        httpsURLConnection.setDoOutput(true);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        httpsURLConnection.setFixedLengthStreamingMode(bytes.length);
        return bytes;
    }

    public static DexFile[] A0a(AbstractCollection abstractCollection) {
        return (DexFile[]) abstractCollection.toArray(new DexFile[abstractCollection.size()]);
    }

    public static String[] A0b(AbstractCollection abstractCollection) {
        return (String[]) abstractCollection.toArray(new String[abstractCollection.size()]);
    }
}
