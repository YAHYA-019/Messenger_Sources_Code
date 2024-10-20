package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.provider.api.ExternalApiProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.profilo.provider.libcio.LibcIOProvider;
import com.facebook.profilo.provider.mappings.MemoryMappingsProvider;
import com.facebook.profilo.provider.memory.MemoryAllocationProvider;
import com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.profilo.provider.threadlifecycle.ThreadLifecycleProvider;
import com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider;
import java.util.ArrayList;

/* renamed from: X.0m7, reason: invalid class name */
/* loaded from: 0m7.class */
public abstract class C0m7 {
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.0Si] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.0wz, java.lang.Object, X.0lu] */
    public static C0lu[] A00(final Context context) {
        ArrayList A0t = AnonymousClass001.A0t(32);
        A0t.add(ExternalProviders.A07);
        A0t.add(ExternalProviders.A00);
        A0t.add(ExternalProviders.A01);
        A0t.add(ExternalProviders.A02);
        A0t.add(ExternalProviders.A03);
        A0t.add(ExternalProviders.A04);
        A0t.add(ExternalProviders.A05);
        A0t.add(ExternalProviders.A06);
        A0t.add(ExternalProviders.A08);
        A0t.add(new ExternalApiProvider());
        A0t.add(new ThreadMetadataProvider());
        A0t.add(new C0lu(null));
        A0t.add(new StackFrameThread(context));
        int i = SystemCounterThread.PROVIDER_SYSTEM_COUNTERS;
        A0t.add(new SystemCounterThread(new Object()));
        A0t.add(new 0Qn());
        A0t.add(new MemoryAllocationProvider());
        A0t.add(0Qf.A00());
        A0t.add(new 0S3());
        A0t.add(new LibcIOProvider());
        ?? c0lu = new C0lu(null);
        c0lu.A00 = context;
        A0t.add(c0lu);
        A0t.add(new MemoryMappingsProvider());
        A0t.add(new C0T5(context) { // from class: X.0th
            public int A00;
            public String A01;
            public String A02;
            public final Context A03;

            {
                super(null);
                Context applicationContext = context.getApplicationContext();
                this.A03 = applicationContext != null ? applicationContext : context;
            }

            @Override // X.C0T5
            public void logOnTraceEnd(TraceContext traceContext, 0Gw r303) {
                Context context2;
                PackageManager packageManager;
                if (this.A02 == null && (packageManager = (context2 = this.A03).getPackageManager()) != null) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        this.A02 = packageInfo.versionName;
                        this.A00 = packageInfo.versionCode;
                        try {
                            this.A01 = packageManager.getInstallerPackageName(context2.getPackageName());
                        } catch (RuntimeException unused) {
                            this.A01 = "<exception>";
                        }
                    } catch (PackageManager.NameNotFoundException | RuntimeException unused2) {
                    }
                }
                if (this.A02 != null) {
                    Buffer buffer = traceContext.A09;
                    BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8126519, 0, 0L), "App version"), this.A02);
                    BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8126518, 0, this.A00);
                    int writeBytesEntry = BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 0, 0, 0L), "Installer");
                    String str = this.A01;
                    if (str == null) {
                        str = "null";
                    }
                    BufferLogger.writeBytesEntry(buffer, 0, 57, writeBytesEntry, str);
                }
            }
        });
        A0t.add(new NativeMemoryAllocationProvider(context));
        A0t.add(new C0lu("profilo_memory_mapping_actions"));
        A0t.add(new ThreadLifecycleProvider());
        return (C0lu[]) A0t.toArray(new C0lu[A0t.size()]);
    }
}
