package X;

import android.net.Uri;
import android.util.LruCache;
import java.net.URI;

/* renamed from: X.0A2, reason: invalid class name */
/* loaded from: 0A2.class */
public abstract class C0A2 {
    public static final C0A4 A01 = new Object();
    public static final LruCache A00 = new LruCache(20);

    public static Uri A00(C0w6 c0w6, String str) {
        return A02(c0w6, str, false);
    }

    public static Uri A01(C0w6 c0w6, String str) {
        return A02(c0w6, str, true);
    }

    public static Uri A02(C0w6 c0w6, String str, boolean z) {
        if (str == null) {
            throw AnonymousClass001.A0L("Url string is null");
        }
        if (c0w6 == null) {
            throw AnonymousClass001.A0L("reporter is null");
        }
        try {
            return A03(str);
        } catch (SecurityException e) {
            c0w6.Cg0("UriParser", 0Pz.A16("Parse uri <sanitized \"", A01.CjJ(str), "\"> failed. Fail open: ", z), e);
            if (z) {
                return Uri.parse(str);
            }
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 2, list:
          (r311v0 ??) from 0x01f7: PHI (r311v1 ??) = (r311v0 ??) binds: [B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.net.URI) from 0x01d6: INVOKE (r0v70 ?? I:java.lang.String) = (r311v0 ?? I:java.net.URI) VIRTUAL call: java.net.URI.getHost():java.lang.String A[Catch: URISyntaxException -> 0x0233, MD:():java.lang.String (c)]
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
    public static android.net.Uri A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 2, list:
          (r311v0 ??) from 0x01f7: PHI (r311v1 ??) = (r311v0 ??) binds: [B:68:0x01f4] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.net.URI) from 0x01d6: INVOKE (r0v70 ?? I:java.lang.String) = (r311v0 ?? I:java.net.URI) VIRTUAL call: java.net.URI.getHost():java.lang.String A[Catch: URISyntaxException -> 0x0233, MD:():java.lang.String (c)]
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

    public static Uri A04(String str) {
        URI create = URI.create(str);
        Uri build = new Uri.Builder().scheme(create.getScheme()).encodedAuthority(create.getRawAuthority()).encodedPath(create.getRawPath()).encodedQuery(create.getRawQuery()).encodedFragment(create.getRawFragment()).build();
        A06(build, create, false);
        return build;
    }

    public static void A05(Uri uri, String str, URI uri2) {
        boolean A07 = A07(uri2.getScheme(), uri.getScheme());
        boolean A072 = A07(uri2.getSchemeSpecificPart(), uri.getSchemeSpecificPart());
        if (A07 && A072) {
            return;
        }
        String obj = uri2.toString();
        C0A4 c0a4 = A01;
        throw AnonymousClass001.A0V(0Pz.A12("java uri <sanitized \"", c0a4.CjJ(obj), "\"> not equal to android uri <sanitized \"", c0a4.CjJ(uri.toString()), "\"> from original <sanitized \"", c0a4.CjJ(str), "\">"));
    }

    public static void A06(Uri uri, URI uri2, boolean z) {
        String str;
        boolean A07 = A07(uri2.getScheme(), uri.getScheme());
        boolean A072 = A07(uri2.getAuthority(), uri.getAuthority());
        boolean A073 = A07(uri2.getPath(), uri.getPath());
        if (A07 && A072 && A073) {
            return;
        }
        str = "";
        str = A07 ? "" : 0Pz.A10(str, "javaUri scheme: \"", uri2.getScheme(), "\". androidUri scheme: \"", uri.getScheme(), "\".");
        if (!z && !A072) {
            str = 0Pz.A10(str, "javaUri authority: \"", uri2.getAuthority(), "\". androidUri authority: \"", uri.getAuthority(), "\".");
        }
        if (!A073) {
            str = 0Pz.A10(str, "javaUri path: \"", uri2.getPath(), "\". androidUri path: \"", uri.getPath(), "\".");
        }
        String obj = uri2.toString();
        C0A4 c0a4 = A01;
        throw AnonymousClass001.A0V(0Pz.A12("java uri <sanitized \"", c0a4.CjJ(obj), "\"> not equal to android uri <sanitized \"", c0a4.CjJ(uri.toString()), "\">. Debug info ", str, "."));
    }

    public static boolean A07(String str, String str2) {
        boolean z;
        if (str != null && !str.equals("")) {
            z = str.equals(str2);
        } else {
            if (str2 == null) {
                return true;
            }
            z = false;
            if (str2.equals("")) {
                return true;
            }
        }
        return z;
    }
}
