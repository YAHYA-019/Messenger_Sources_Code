package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.159, reason: invalid class name */
/* loaded from: 159.class */
public final class AnonymousClass159 extends C0ib implements C0jm {
    public final Set A02;
    public final java.util.Map A01 = AnonymousClass001.A0u();
    public final java.util.Map A00 = AnonymousClass001.A0u();

    public AnonymousClass159(Context context) {
        HashSet A0v = AnonymousClass001.A0v();
        String A00 = A00(context.getApplicationInfo().sourceDir);
        if (A00 != null) {
            A0v.add(A00);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                String A002 = A00(strArr[i2]);
                if (A002 != null) {
                    A0v.add(A002);
                }
                i = i2 + 1;
            }
        }
        this.A02 = A0v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r303 = "empty";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        android.util.Log.w("SoLoader", X.AnonymousClass001.A0d(r303, r308));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r301 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(java.lang.String r301) {
        /*
            java.lang.String[] r0 = X.0iL.A03()
            r302 = r0
            java.lang.String r0 = "null"
            r303 = r0
            java.lang.String r0 = "empty"
            r304 = r0
            java.lang.String r0 = "SoLoader"
            r305 = r0
            r0 = r301
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L38
            r0 = r302
            if (r0 == 0) goto L55
            r0 = r302
            int r0 = r0.length
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L55
            r0 = r302
            r1 = 0
            r0 = r0[r1]
            r307 = r0
            r0 = r301
            java.lang.String r1 = "!/lib/"
            r2 = r307
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            return r0
        L38:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r308 = r0
            java.lang.String r0 = "Cannot compute fallback path, apk path is "
            r307 = r0
            r0 = r308
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            if (r0 != 0) goto L50
            goto L6a
        L50:
            r0 = r304
            r303 = r0
            goto L6a
        L55:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r308 = r0
            java.lang.String r0 = "Cannot compute fallback path, supportedAbis is "
            r307 = r0
            r0 = r308
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            if (r0 != 0) goto L50
        L6a:
            r0 = r303
            r1 = r308
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = android.util.Log.w(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass159.A00(java.lang.String):java.lang.String");
    }

    private void A01() {
        int indexOf;
        int i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String str = null;
            if (!TextUtils.isEmpty(A0i) && (indexOf = A0i.indexOf(33)) >= 0 && (i = indexOf + 2) < A0i.length()) {
                str = A0i.substring(i);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(AnonymousClass001.A0c(A0i, A0i.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getMethod() == 0 && nextElement.getName().startsWith(str) && nextElement.getName().endsWith(".so")) {
                            String A0W = AnonymousClass001.A0W(str.length(), nextElement.getName());
                            java.util.Map map = this.A01;
                            synchronized (map) {
                                if (!map.containsKey(A0i)) {
                                    map.put(A0i, AnonymousClass001.A0v());
                                }
                                ((Set) map.get(A0i)).add(A0W);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c2, code lost:
    
        if (r306 != null) goto L84;
     */
    @Override // X.C0ib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A05(android.os.StrictMode.ThreadPolicy r302, java.lang.String r303, int r304) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass159.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    @Override // X.C0ib
    public File A06(String str) {
        throw AnonymousClass001.A0q("DirectAPKSoSource doesn't support unpackLibrary");
    }

    @Override // X.C0ib
    public String A07() {
        return "DirectApkSoSource";
    }

    @Override // X.C0ib
    public String A08(String str) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Set set = (Set) this.A01.get(A0i);
            if (!TextUtils.isEmpty(A0i) && set != null && set.contains(str)) {
                return 0Pz.A0j(A0i, File.separator, str);
            }
        }
        return null;
    }

    @Override // X.C0ib
    public void A09(int i) {
        A01();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0009: MOVE (r0v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r0v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER]
          (r0v0 ?? I:X.0ib) from 0x0015: RETURN (r0v0 ?? I:X.0ib)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.C0jm
    public X.C0ib Cbf(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0009: MOVE (r0v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r0v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER]
          (r0v0 ?? I:X.0ib) from 0x0015: RETURN (r0v0 ?? I:X.0ib)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
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

    @Override // X.C0ib
    public String toString() {
        return 0Pz.A0k("DirectApkSoSource", "[root = ", this.A02.toString(), ']');
    }
}
