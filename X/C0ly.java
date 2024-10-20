package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ly, reason: invalid class name */
/* loaded from: 0ly.class */
public abstract class C0ly {
    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(Context context, SparseArray sparseArray, C0lf c0lf, String str, C0lu[] c0luArr, 0So[] r306, boolean z) {
        C0ld Anf;
        IllegalStateException th;
        Object obj = c0lf;
        if (c0lf != null && c0lf.Anf() == null) {
            throw AnonymousClass001.A0L("Non-null config provider with null config");
        }
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L("Null or empty process name");
        }
        if (c0luArr == null || c0luArr.length < 1) {
            throw AnonymousClass001.A0L("Null or empty list of trace providers");
        }
        if (sparseArray.size() < 1) {
            throw AnonymousClass001.A0L("Null or empty list of controllers");
        }
        if (c0lf == null) {
            obj = new Object();
        }
        0Gw r0 = new 0Gw(context, obj, str, c0luArr, z);
        if (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(0Gw.A0D, null, r0)) {
            throw AnonymousClass001.A0N("Orchestrator already initialized");
        }
        synchronized (r0) {
            Anf = r0.A00.Anf();
            if (Anf == null) {
                throw AnonymousClass001.A0L("We only support v2 configs now!");
            }
        }
        synchronized (r0) {
            0Gy r02 = r0.A03;
            File file = r02.A06;
            MmapBufferManager mmapBufferManager = MmapBufferManager.$redex_init_class;
            MmapBufferManager mmapBufferManager2 = new MmapBufferManager(r02.A04);
            r0.A04 = mmapBufferManager2;
            String str2 = r0.A08;
            if (0H4.A0C == null) {
                synchronized (0H4.class) {
                    try {
                        if (0H4.A0C != null) {
                            throw AnonymousClass001.A0N("TraceControl already initialized");
                        }
                        0H4.A0C = new 0H4(sparseArray, Anf, r0, r0, mmapBufferManager2, file, str2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C0il.A0B("profilo");
                0Gw.A01(Anf, r0);
                r02.A01 = TimeUnit.DAYS.toSeconds(1L) * 1000;
                r02.A00 = 10;
                r0.A07.A00.add(new Object());
            } else {
                th = AnonymousClass001.A0N("TraceControl already initialized");
            }
            throw th;
        }
        if (r306 != null) {
            for (0So r03 : r306) {
                0Gw.A00().A07.A00.add(r03);
            }
        }
    }
}
