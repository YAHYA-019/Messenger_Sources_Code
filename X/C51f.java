package X;

import android.net.Uri;
import android.os.Build;
import android.util.LruCache;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.51f, reason: invalid class name */
/* loaded from: 51f.class */
public abstract class C51f {
    public static volatile boolean A00;
    public static volatile boolean A01;

    public static String A00(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String lastPathSegment;
        StringBuilder sb = new StringBuilder();
        if (uri != null && "127.0.0.1".equals(uri.getHost())) {
            uri = Uri.parse(uri.getQueryParameter("remote-uri"));
        }
        if (str == null && z) {
            str = Integer.toHexString(uri.hashCode());
        }
        if (str2 != null) {
            sb.append(str2);
        }
        if (z2 && !z4) {
            sb.append("_t");
        }
        sb.append(".");
        sb.append(str);
        sb.append(".");
        if (!z3 || uri.getLastPathSegment() == null) {
            lastPathSegment = uri.getLastPathSegment();
        } else {
            lastPathSegment = AnonymousClass001.A0W(uri.getLastPathSegment().lastIndexOf(47), uri.getLastPathSegment());
        }
        sb.append(lastPathSegment);
        return sb.toString();
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (A00) {
            AnonymousClass001.A1G(str2, str, objArr);
        } else {
            if (A01) {
                return;
            }
            android.util.Log.d(str, String.format(str2, objArr));
        }
    }

    public static void A02(String str, String str2, Object... objArr) {
        android.util.Log.w(str, String.format(str2, objArr));
    }

    public static void A03(String str, AtomicReference atomicReference) {
        LruCache lruCache = (LruCache) atomicReference.get();
        A01("Util", "Trying to resize cache for %s: old=%d, new=%d, SDK=%d", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(Build.VERSION.SDK_INT));
        if (lruCache.maxSize() != 10) {
            A01("Util", "Resizing cache for %s: old=%d, new=%d, %d existing items", str, Integer.valueOf(lruCache.maxSize()), 10, Integer.valueOf(lruCache.size()));
            lruCache.resize(10);
        }
    }

    public static boolean A04(TreeMap treeMap, int i, long j, long j2) {
        Long valueOf = Long.valueOf(j);
        Object floorKey = treeMap.floorKey(valueOf);
        if (floorKey != null && AnonymousClass001.A03(treeMap.get(floorKey)) >= i) {
            return true;
        }
        Iterator it = treeMap.subMap(valueOf, false, Long.valueOf(j2), true).values().iterator();
        while (it.hasNext()) {
            if (AnonymousClass001.A03(it.next()) >= i) {
                return true;
            }
        }
        return false;
    }
}
