package X;

import android.content.res.AssetManager;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1jQ, reason: invalid class name */
/* loaded from: 1jQ.class */
public final class C1jQ {
    public java.util.Map A05;
    public java.util.Map A06;
    public java.util.Map A07;
    public java.util.Map A08;
    public C1jR A03 = new C1jR();
    public int[] A0D = null;
    public boolean A0A = false;
    public boolean A0C = false;
    public C1jT A02 = new C1jT();
    public java.util.Map A09 = new HashMap();
    public int A00 = 0;
    public C1jR A04 = null;
    public 3oR A01 = null;
    public boolean A0B = false;

    public static 3oR A00(C1jQ c1jQ, int i) {
        return (3oR) c1jQ.A03.A02.get(i);
    }

    public static String A01(AssetManager assetManager, int i) {
        String str;
        str = "";
        try {
            0SY r0 = C0mj.A00;
            r0.markerStart(13636983, i);
            r0.markerAnnotate(13636983, i, "unitType", i);
            String str2 = str;
            String A01 = !str.isEmpty() ? 1jH.A01() : str;
            try {
                InputStream open = assetManager.open(1jH.A02(i), 3);
                try {
                    ReadableByteChannel newChannel = Channels.newChannel(open);
                    try {
                        C1jT A00 = 1jH.A00(newChannel);
                        r0.markerAnnotate(13636983, i, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 4);
                        if (A00.A05 > 0) {
                            str2 = (A01 == null || A01.isEmpty()) ? A00.A07 : A02(A00.A07, C3Ox.A01(A01));
                        }
                        if (newChannel != null) {
                            newChannel.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                0fH.A0r("ParamsMapParser", "could not find V4 param map file ", e);
                r0.markerAnnotate(13636983, i, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 2);
                InputStream open2 = assetManager.open(0Pz.A0j("params_map", 4 == i ? "_kMobileConfigAdminId" : "", OptSvcAnalyticsStore.FILE_SUFFIX), 3);
                try {
                    str2 = C3Ox.A01(1jH.A03(open2));
                    if (A01 != null && !A01.isEmpty()) {
                        str2 = A02(str2, C3Ox.A01(A01));
                    }
                    if (open2 != null) {
                        open2.close();
                    }
                } catch (Throwable th3) {
                    if (open2 != null) {
                        try {
                            open2.close();
                        } catch (Throwable th4) {
                            7kF.A00(th3, th4);
                        }
                    }
                    throw th3;
                }
            }
            r0.markerEnd(13636983, i, (short) 2);
            return str2;
        } catch (Throwable th5) {
            C0mj.A00.markerEnd(13636983, i, (short) 2);
            throw th5;
        }
    }

    public static String A02(String str, String str2) {
        String str3;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str3 = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
        } else {
            str3 = "";
        }
        if (!str3.isEmpty()) {
            str2 = new BigInteger(str3, 16).xor(new BigInteger(str2, 16)).toString(16);
            int length = str2.length();
            if (length < 32) {
                int i = 32 - length;
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < i; i2++) {
                    stringBuffer.append(ConstantsKt.CAMERA_ID_FRONT);
                }
                stringBuffer.append(str2);
                str2 = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        stringBuffer2.append(":");
        stringBuffer2.append(str2);
        return stringBuffer2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0300, code lost:
    
        if (r312 == 2) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(X.C1jQ r301) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1jQ.A03(X.1jQ):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v3 ??, still in use, count: 2, list:
          (r309v3 ??) from 0x0141: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??), (r309v3 ??) binds: [B:75:0x013c, B:73:0x0132, B:63:0x0141] A[DONT_GENERATE, DONT_INLINE]
          (r309v3 ?? I:java.util.AbstractMap) from 0x010c: INVOKE (r309v3 ?? I:java.util.AbstractMap), (r0v60 ?? I:java.lang.Object), (r0v64 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: JSONException -> 0x0119, all -> 0x0156, MD:(K, V):V (c)]
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
    public static void A04(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v3 ??, still in use, count: 2, list:
          (r309v3 ??) from 0x0141: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??), (r309v3 ??) binds: [B:75:0x013c, B:73:0x0132, B:63:0x0141] A[DONT_GENERATE, DONT_INLINE]
          (r309v3 ?? I:java.util.AbstractMap) from 0x010c: INVOKE (r309v3 ?? I:java.util.AbstractMap), (r0v60 ?? I:java.lang.Object), (r0v64 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: JSONException -> 0x0119, all -> 0x0156, MD:(K, V):V (c)]
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

    public void A05(AssetManager assetManager, int i) {
        InputStream open;
        InputStream open2;
        this.A0A = true;
        String A02 = 1jH.A02(i);
        String A0j = i <= 2 ? "params_names_v4_u0.txt" : 0Pz.A0j("params_names_v4_u", String.valueOf(i), OptSvcAnalyticsStore.FILE_SUFFIX);
        try {
            0SY r0 = C0mj.A00;
            r0.markerStart(13644483, i);
            r0.markerAnnotate(13644483, i, "unitType", i);
            try {
                open2 = assetManager.open(A02, 3);
            } catch (FileNotFoundException unused) {
                0fH.A0n("ParamsMapParser", "V4 Params Map not found, trying V2");
                r0.markerAnnotate(13644483, i, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 2);
                open = assetManager.open(0Pz.A0j("params_map", 4 != i ? "" : "_kMobileConfigAdminId", OptSvcAnalyticsStore.FILE_SUFFIX), 3);
                try {
                    this.A03.A02 = Collections.unmodifiableList(C3Ox.A00(1jH.A03(open), "", i, true).A02);
                    if (open != null) {
                        open.close();
                    }
                } finally {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable th) {
                            7kF.A00(th, th);
                        }
                    }
                }
            }
            try {
                open = assetManager.open(A0j, 3);
                try {
                    r0.markerAnnotate(13644483, i, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 4);
                    A04(this, open2, open, i);
                    if (open != null) {
                        open.close();
                    }
                    if (open2 != null) {
                        open2.close();
                    }
                    r0.markerEnd(13644483, i, (short) 2);
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                if (open2 != null) {
                    try {
                        open2.close();
                    } catch (Throwable th4) {
                        7kF.A00(th3, th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            C0mj.A00.markerEnd(13644483, i, (short) 2);
            throw th5;
        }
    }

    public void A06(byte[] bArr, int i) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        String str = new String(bArr, 0, 2);
        this.A0A = true;
        if (str.equals("v2")) {
            C1jR A00 = C3Ox.A00(new String(bArr), "", i, this.A0A);
            this.A03 = A00;
            C1jT c1jT = new C1jT();
            this.A02 = c1jT;
            c1jT.A07 = A00.A00;
            return;
        }
        if (!str.equals("v4")) {
            0fH.A0k("ParamsMapParser", "unrecognizable params map byte array");
            return;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                A04(this, byteArrayInputStream, null, i);
                byteArrayInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            0fH.A0r("ParamsMapParser", "Failed to load two input streams when parsing params map to map", e);
        }
    }
}
