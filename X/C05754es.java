package X;

import android.app.ActivityThread;
import android.app.Application;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4es, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4es.class */
public final class C05754es extends AnonymousClass013 implements C0cS {
    public WeakReference A00;
    public WeakReference A01;
    public final Application.ActivityLifecycleCallbacks A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (((X.2yD) r0.A02.get()).AZk(36317642160680501L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C05754es(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 0
            r303 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r304 = r0
            r0 = r304
            r1 = 0
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.A01 = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r304 = r0
            r0 = r304
            r1 = 0
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.A00 = r1
            com.facebook.fixie.fixes.common.TransactionTooLargeDebugger$1 r0 = new com.facebook.fixie.fixes.common.TransactionTooLargeDebugger$1
            r304 = r0
            r0 = r304
            r1 = r301
            r0.<init>()
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L65
            r0 = r304
            X.00i r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = 36317642160680501(0x8106b400112e35, double:3.030761369596783E-306)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 != 0) goto L6a
        L65:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
        L6a:
            r0 = r301
            r1 = r308
            r0.A03 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05754es.<init>(X.010):void");
    }

    public static long A00(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.dataSize();
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.C0cS
    public int BMm(0cI r302, Thread thread, Throwable th) {
        if (!(th instanceof RuntimeException) || th.getCause() == null) {
            return 0;
        }
        Throwable cause = th.getCause();
        Bundle bundle = (Bundle) this.A01.get();
        Object obj = this.A00.get();
        if (!(cause instanceof TransactionTooLargeException) || obj == null || bundle == null) {
            return 0;
        }
        for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
            if (stackTraceElement.getMethodName().endsWith("activityStopped")) {
                long A00 = A00(bundle);
                C3TT c3tt = new C3TT(this);
                JSONObject A002 = C3TT.A00(c3tt, bundle, new LinkedList(), A00(bundle));
                c3tt.A02 = A002;
                try {
                    C6f2.A00("Call parse() before getting result", A002);
                    A002.put("v", "v1.6.0");
                    A002.put("blame_activity", AnonymousClass001.A0Y(obj));
                    C0ft.A06(C0g6.A9v, A002.toString());
                } catch (JSONException e) {
                    A0A(e);
                }
                if (A00 <= 512000) {
                    return 0;
                }
                List list = c3tt.A01;
                if (list == null) {
                    list = AnonymousClass001.A0t(0);
                }
                TransactionTooLargeException transactionTooLargeException = new TransactionTooLargeException(0Pz.A0h("bundle size ", GOm.A00(31), A00(bundle)));
                ArrayList A0t = AnonymousClass001.A0t(list.size() + 1);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0t.add(new StackTraceElement(AnonymousClass001.A0i(it), "onSaveInstanceState", null, -1));
                }
                Class<?> cls = obj.getClass();
                A0t.add(new StackTraceElement(cls.getName(), "onSaveInstanceState", 0Pz.A0W(cls.getSimpleName(), ".java"), -1));
                transactionTooLargeException.setStackTrace((StackTraceElement[]) A0t.toArray(new StackTraceElement[0]));
                cause.initCause(transactionTooLargeException);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "TransactionTooLargeDebugger";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A03) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(this.A02);
            0cQ.A03(this, 100);
            A07();
        }
    }
}
