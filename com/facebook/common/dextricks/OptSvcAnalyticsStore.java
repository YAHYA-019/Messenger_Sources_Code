package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.0eB;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.content.Context;
import android.util.Log;
import com.facebook.common.build.BuildConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: OptSvcAnalyticsStore.class */
public class OptSvcAnalyticsStore {
    public static final int CURRENT_SCHEMA_VERSION = 2;
    public static final String DEX2OAT_LOGGING_KEY_PREFIX = "dex2oat_stat";
    public static final String EVENT_DIR_NAME = "optsvc_analytics";
    public static final String FILE_SUFFIX = ".txt";
    public static final String LOGGING_KEY_APP_VERSION = "app_version";
    public static final String LOGGING_KEY_ATTEMPT_NUMBER = "attempt_number";
    public static final String LOGGING_KEY_CLIENT_TIME = "client_time";
    public static final String LOGGING_KEY_DETAIL_MSG = "detail_msg";
    public static final String LOGGING_KEY_DEX2OAT_FAILURE = "failure";
    public static final String LOGGING_KEY_DEX2OAT_PERCENT = "percent_success";
    public static final String LOGGING_KEY_DEX2OAT_SUCCESS = "success";
    public static final String LOGGING_KEY_DEX2OAT_TOTAL_CASES = "total_cases";
    public static final String LOGGING_KEY_DURATION = "duration";
    public static final String LOGGING_KEY_EVENT_NAME = "event_name";
    public static final String LOGGING_KEY_EXIT_CODE = "exit_code";
    public static final String LOGGING_KEY_JOB_NAME = "job_name";
    public static final String LOGGING_KEY_STEP = "step";
    public static final String TAG = "OptSvcAnalytics";
    public static final int UNKNOWN_SCHEMA_VERSION = 255;

    /* loaded from: OptSvcAnalyticsStore$EventConsumer.class */
    public interface EventConsumer {
        void consume(String str, Map map);
    }

    public static void captureCommonKeyValues(Map map) {
        map.put(LOGGING_KEY_APP_VERSION, Integer.valueOf(BuildConstants.A01()));
        map.put(LOGGING_KEY_CLIENT_TIME, AnonymousClass002.A0G());
    }

    public static void closeIt(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c1, code lost:
    
        if (isFileOldEnoughToDelete(r0) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void consumeEvents(android.content.Context r301, boolean r302, int r303, com.facebook.common.dextricks.OptSvcAnalyticsStore.EventConsumer r304) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OptSvcAnalyticsStore.consumeEvents(android.content.Context, boolean, int, com.facebook.common.dextricks.OptSvcAnalyticsStore$EventConsumer):void");
    }

    public static String escape(String str) {
        return str.replace("\\", "\\\\").replace("\n", "\\n");
    }

    public static String escapeObjectCoalesceNull(Object obj) {
        return obj == null ? "" : escape(obj.toString());
    }

    public static String getNewFileName() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(UUID.randomUUID());
        A0k.append(".");
        A0k.append(2);
        return AnonymousClass001.A0d(FILE_SUFFIX, A0k);
    }

    public static int getSchemaVersionFromFile(File file) {
        int indexOf;
        String name = file.getName();
        int length = name.length();
        if (length < 6 || (indexOf = name.indexOf(46)) < 0) {
            return -1;
        }
        try {
            return Integer.parseInt(name.substring(indexOf + 1, length - 4));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static File getStorageDir(Context context) {
        File A00 = 0eB.A00(context, SC.android_optsvc_analytics);
        A00.mkdirs();
        return A00;
    }

    public static boolean isFileOldEnoughToDelete(File file) {
        return AnonymousClass001.A1P(((System.currentTimeMillis() - file.lastModified()) > TimeUnit.DAYS.toMillis(1L) ? 1 : ((System.currentTimeMillis() - file.lastModified()) == TimeUnit.DAYS.toMillis(1L) ? 0 : -1)));
    }

    public static void logEvent(Context context, String str, Map map) {
        if (context == null || str == null || map == null || map.isEmpty()) {
            return;
        }
        File A00 = 0eB.A00(context, SC.android_optsvc_analytics);
        A00.mkdirs();
        captureCommonKeyValues(map);
        String newFileName = getNewFileName();
        File A0D = AnonymousClass001.A0D(A00, newFileName);
        File A02 = 0Pz.A02(newFileName, ".tmp", A00);
        StringBuilder A0o = AnonymousClass001.A0o("event_name");
        A0o.append("\n");
        A0o.append(str);
        A0o.append("\n");
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            if (A0j != null) {
                AnonymousClass001.A1D(escape(A0j), "\n", escapeObjectCoalesceNull(A0z.getValue()), A0o);
                A0o.append("\n");
            }
        }
        try {
            writeUTF8BytesToFile(A0o.toString(), A02);
        } catch (IOException e) {
            Log.w(TAG, "Failed to log event", e);
        }
        A02.renameTo(A0D);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v8 ??, still in use, count: 7, list:
          (r306v8 ??) from 0x00ca: PHI (r306v4 ??) = (r306v1 ??), (r306v7 ??), (r306v8 ??), (r306v8 ??) binds: [B:75:0x00c5, B:69:0x00b3, B:67:0x00a4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00f6: PHI (r306v3 ??) = (r306v0 ??), (r306v5 ??), (r306v6 ??), (r306v8 ??) binds: [B:77:0x00bb, B:73:0x00ec, B:71:0x00ab, B:62:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00ca: PHI (r306v4 ??) = (r306v1 ??), (r306v7 ??), (r306v8 ??), (r306v8 ??) binds: [B:75:0x00c5, B:69:0x00b3, B:67:0x00a4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00e1: PHI (r306v5 ??) = (r306v4 ??), (r306v8 ??), (r306v8 ??) binds: [B:60:0x00de, B:32:0x0112, B:26:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00e1: PHI (r306v5 ??) = (r306v4 ??), (r306v8 ??), (r306v8 ??) binds: [B:60:0x00de, B:32:0x0112, B:26:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ?? I:java.io.Reader) from 0x0029: INVOKE (r0v26 ?? I:java.io.BufferedReader), (r306v8 ?? I:java.io.Reader) DIRECT call: java.io.BufferedReader.<init>(java.io.Reader):void A[Catch: Exception -> 0x00a4, all -> 0x00ec, MD:(java.io.Reader):void (c)]
          (r306v8 ?? I:java.io.Reader) from 0x005f: INVOKE (r306v8 ?? I:java.io.Reader) VIRTUAL call: java.io.Reader.close():void A[Catch: IOException -> 0x010a, MD:():void throws java.io.IOException (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static boolean readEventFileFully(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v8 ??, still in use, count: 7, list:
          (r306v8 ??) from 0x00ca: PHI (r306v4 ??) = (r306v1 ??), (r306v7 ??), (r306v8 ??), (r306v8 ??) binds: [B:75:0x00c5, B:69:0x00b3, B:67:0x00a4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00f6: PHI (r306v3 ??) = (r306v0 ??), (r306v5 ??), (r306v6 ??), (r306v8 ??) binds: [B:77:0x00bb, B:73:0x00ec, B:71:0x00ab, B:62:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00ca: PHI (r306v4 ??) = (r306v1 ??), (r306v7 ??), (r306v8 ??), (r306v8 ??) binds: [B:75:0x00c5, B:69:0x00b3, B:67:0x00a4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00e1: PHI (r306v5 ??) = (r306v4 ??), (r306v8 ??), (r306v8 ??) binds: [B:60:0x00de, B:32:0x0112, B:26:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ??) from 0x00e1: PHI (r306v5 ??) = (r306v4 ??), (r306v8 ??), (r306v8 ??) binds: [B:60:0x00de, B:32:0x0112, B:26:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ?? I:java.io.Reader) from 0x0029: INVOKE (r0v26 ?? I:java.io.BufferedReader), (r306v8 ?? I:java.io.Reader) DIRECT call: java.io.BufferedReader.<init>(java.io.Reader):void A[Catch: Exception -> 0x00a4, all -> 0x00ec, MD:(java.io.Reader):void (c)]
          (r306v8 ?? I:java.io.Reader) from 0x005f: INVOKE (r306v8 ?? I:java.io.Reader) VIRTUAL call: java.io.Reader.close():void A[Catch: IOException -> 0x010a, MD:():void throws java.io.IOException (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public static String unescape(String str) {
        return str.replace("\\n", "\n").replace("\\\\", "\\");
    }

    public static void writeUTF8BytesToFile(String str, File file) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }
}
