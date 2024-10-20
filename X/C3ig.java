package X;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.JSONUtil;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.3ig, reason: invalid class name */
/* loaded from: 3ig.class */
public final class C3ig implements Runnable {
    public static final String __redex_internal_original_name = "SavedInstanceStateBundleSizeChecker$checkBundleSize$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ Bundle A03;
    public final /* synthetic */ 4DY A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C3ig(Bundle bundle, Bundle bundle2, 4DY r304, String str, String str2, long j, long j2) {
        this.A04 = r304;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = bundle;
        this.A02 = bundle2;
        this.A01 = j;
        this.A00 = j2;
    }

    public static final int A00(Object obj) {
        if (obj == null) {
            return 0;
        }
        Parcel obtain = Parcel.obtain();
        11T.A0A(obtain);
        try {
            try {
                try {
                    obtain.writeValue(obj);
                    return obtain.dataSize();
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof IOException)) {
                        throw e;
                    }
                    0fH.A0r("SaveInstanceStateBundleSizeChecker", "IOException getting parcel size", e);
                    obtain.recycle();
                    return 0;
                }
            } catch (ClassCastException | IndexOutOfBoundsException | NullPointerException | ConcurrentModificationException e2) {
                0fH.A0r("SaveInstanceStateBundleSizeChecker", "Exception getting parcel size", e2);
                obtain.recycle();
                return 0;
            }
        } finally {
            obtain.recycle();
        }
    }

    public static final LinkedList A01(Bundle bundle, long j) {
        LinkedList linkedList = new LinkedList();
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                Object obj = bundle.get(A0i);
                if (obj != null) {
                    int dataSize = obj instanceof Parcel ? ((Parcel) obj).dataSize() : A00(obj);
                    if (dataSize > j) {
                        StringBuilder A0n = AnonymousClass001.A0n(A0i);
                        A0n.append(':');
                        A0n.append(AnonymousClass001.A0Y(obj));
                        A0n.append(':');
                        A0n.append(dataSize);
                        1BK.A1N(A0n, linkedList);
                    }
                }
            }
        }
        return linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4DY r0 = this.A04;
        String str = this.A06;
        String str2 = this.A05;
        Bundle bundle = this.A03;
        Bundle bundle2 = this.A02;
        long j = this.A01;
        long j2 = this.A00;
        int A00 = A00(bundle);
        int A002 = A00(bundle2);
        int i = A00 + A002;
        long j3 = i;
        if (j3 <= j) {
            0fH.A0f(str, Integer.valueOf(i), "SaveInstanceStateBundleSizeChecker", "%s.onSaveInstanceState(Bundle) bundle size %d");
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(0Pz.A0O("[Saved State: ", ']', A00));
        C00i c00i = r0.A01.A00;
        if (1BK.A0M(c00i).AZk(36310314945937578L)) {
            linkedList.addAll(A01(bundle, j2));
        }
        linkedList.add(0Pz.A0O("[Arguments: ", ']', A002));
        if (1BK.A0M(c00i).AZk(36310314945937578L)) {
            linkedList.addAll(A01(bundle2, j2));
        }
        if (1BK.A0M(c00i).AZk(36310314945937578L)) {
            1Br.A04(r0.A00).D0v(StringFormatUtil.formatStrLocaleSafe("SaveInstanceStateBundleSizeChecker:Details:%s:%s", str2, str), 11T.A02(JSONUtil.A08(linkedList)));
        }
        0fH.A17("SaveInstanceStateBundleSizeChecker", "%s.onSaveInstanceState(Bundle) bundle size %d", new Object[]{str, Long.valueOf(j3)});
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            0fH.A17("SaveInstanceStateBundleSizeChecker", "%s.onSaveInstanceState(Bundle) bundle item: %s", new Object[]{str, it.next()});
        }
    }
}
