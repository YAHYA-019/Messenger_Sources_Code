package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.common.dextricks.DexLibLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* renamed from: X.0d4, reason: invalid class name */
/* loaded from: 0d4.class */
public final class C0d4 {
    public static C0d4 A05;
    public static final boolean A06;
    public static final String[] A07;
    public static final Object A08;
    public final Context A02;
    public final Object A03 = AnonymousClass001.A0R();
    public String A01 = null;
    public boolean A00 = false;
    public volatile boolean A04 = false;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A06 = z;
        String[] strArr = new String[3];
        A07 = strArr;
        strArr[0] = z ? "zyte_v9.prof" : "zyte_v7.prof";
        strArr[1] = "zyte.prof";
        strArr[2] = "art_pgo_input.txt";
        A08 = AnonymousClass001.A0R();
    }

    public C0d4(Context context) {
        this.A02 = context;
    }

    public static C0d4 A00(Context context) {
        C0d4 c0d4;
        C0d4 c0d42 = A05;
        if (c0d42 != null) {
            return c0d42;
        }
        synchronized (A08) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            c0d4 = new C0d4(context);
            A05 = c0d4;
        }
        return c0d4;
    }

    public static InputStream A01(Context context, String str, boolean z) {
        String A0j = str == null ? null : 0Pz.A0j(DexLibLoader.ApkResProvider.SECONDARY_PROGRAM_DEX_JARS, File.separator, str);
        if (A0j == null) {
            return null;
        }
        if (z) {
            A0j = 0Pz.A0W(A0j, ".xz");
        }
        try {
            return context.getAssets().open(A0j);
        } catch (IOException e) {
            android.util.Log.d("PGOProfileUtil", String.format("Cannot read %s [check is xz'ed: %s] from from assets. Error: %s", A0j, Boolean.valueOf(z), e.getMessage()));
            return null;
        }
    }

    public static String A02(C0d4 c0d4) {
        String obj;
        String str = c0d4.A01;
        if (str == null) {
            Context context = c0d4.A02;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                obj = packageManager.getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                obj = UUID.randomUUID().toString();
                android.util.Log.e("PGOProfileUtil", String.format("Could not find package name %s. Using UUID: %s", packageName, obj), e);
            }
            str = String.format("%s_AV%d_%s%s", "art_pgo_profile", Integer.valueOf(Build.VERSION.SDK_INT), obj == null ? null : obj.replace('.', '_'), ".prof");
            c0d4.A01 = str;
        }
        return str;
    }

    public static void A03(String str, File file) {
        android.util.Log.d("PGOProfileUtil", String.format("Did %sdelete or was already deleted %s profile %s", file.exists() ? "not " : "", str, file.getAbsolutePath()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0 == 28) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r301 = r0
            r0 = 29
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
            r0 = 28
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r302 = r0
        L18:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0d4.A04():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        if (r314 != false) goto L81;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a A[Catch: IOException -> 0x01e1, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x01e1, blocks: (B:39:0x00c4, B:40:0x00cb, B:47:0x0168, B:49:0x0170, B:51:0x017a, B:53:0x017f), top: B:38:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8 A[EDGE_INSN: B:69:0x01b8->B:70:0x01b8 BREAK  A[LOOP:1: B:63:0x019d->B:68:0x01b0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(android.content.Context r301, java.io.File r302) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0d4.A05(android.content.Context, java.io.File):boolean");
    }

    public static boolean A06(C0d4 c0d4) {
        boolean z;
        Object[] objArr;
        String str;
        if (!c0d4.A04) {
            synchronized (c0d4.A03) {
                if (!c0d4.A04) {
                    String A02 = A02(c0d4);
                    Context context = c0d4.A02;
                    File fileStreamPath = context.getFileStreamPath(A02);
                    if (fileStreamPath.exists()) {
                        objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                        str = "Already have profile, using that instead. Path: %s";
                    } else if (c0d4.A09()) {
                        objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                        str = "Not using default PGO profile from APK. Using empty PGO profile at path: %s";
                    } else {
                        try {
                            AnonymousClass001.A1F("Extracting PGO profile  from APK to path %s", "PGOProfileUtil", new Object[]{fileStreamPath.getAbsolutePath()});
                            z = A05(context, fileStreamPath);
                        } catch (IOException e) {
                            android.util.Log.w("PGOProfileUtil", 0Pz.A1B("Cannot read profile from apk. Error: ", e), e);
                            z = false;
                        }
                        c0d4.A00 = z;
                        c0d4.A04 = true;
                    }
                    AnonymousClass001.A1F(str, "PGOProfileUtil", objArr);
                    z = true;
                    c0d4.A00 = z;
                    c0d4.A04 = true;
                }
            }
        }
        return c0d4.A00;
    }

    public File A07() {
        if (!A06(this)) {
            return null;
        }
        return this.A02.getFileStreamPath(A02(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v5 ??, still in use, count: 3, list:
          (r309v5 ??) from 0x00fc: PHI (r309v4 ??) = (r309v3 ??), (r309v5 ??) binds: [B:53:0x00f9, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]
          (r309v5 ?? I:java.io.FileOutputStream) from 0x0083: INVOKE (r0v35 ?? I:int) = (r0v27 ?? I:java.io.FileInputStream), (r309v5 ?? I:java.io.FileOutputStream), (r0v24 ?? I:int) STATIC call: X.0cV.A04(java.io.FileInputStream, java.io.FileOutputStream, int):int A[Catch: all -> 0x00f4]
          (r309v5 ?? I:java.io.OutputStream) from 0x008f: INVOKE (r309v5 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: all -> 0x0114, MD:():void throws java.io.IOException (c)]
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
    public java.io.File A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v5 ??, still in use, count: 3, list:
          (r309v5 ??) from 0x00fc: PHI (r309v4 ??) = (r309v3 ??), (r309v5 ??) binds: [B:53:0x00f9, B:45:0x00f4] A[DONT_GENERATE, DONT_INLINE]
          (r309v5 ?? I:java.io.FileOutputStream) from 0x0083: INVOKE (r0v35 ?? I:int) = (r0v27 ?? I:java.io.FileInputStream), (r309v5 ?? I:java.io.FileOutputStream), (r0v24 ?? I:int) STATIC call: X.0cV.A04(java.io.FileInputStream, java.io.FileOutputStream, int):int A[Catch: all -> 0x00f4]
          (r309v5 ?? I:java.io.OutputStream) from 0x008f: INVOKE (r309v5 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: all -> 0x0114, MD:():void throws java.io.IOException (c)]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0.A2a != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.A02
            r302 = r0
            r0 = r302
            X.0GT r0 = X.0GT.A00(r0)
            r303 = r0
            r0 = r302
            X.0GT r0 = X.0GT.A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A15
            r1 = 1
            r0 = r0 ^ r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L27
            r0 = r303
            boolean r0 = r0.A2a
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L2b
        L27:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0d4.A09():boolean");
    }
}
