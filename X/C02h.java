package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.02h, reason: invalid class name */
/* loaded from: 02h.class */
public final class C02h {
    public static C02h A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final Handler A04;
    public final HashMap A03 = new HashMap();
    public final HashMap A02 = new HashMap();
    public final ArrayList A01 = new ArrayList();

    public C02h(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A04 = new Handler(mainLooper) { // from class: X.02j
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int size;
                C09f[] c09fArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C02h c02h = this;
                while (true) {
                    synchronized (c02h.A03) {
                        ArrayList arrayList = c02h.A01;
                        size = arrayList.size();
                        if (size <= 0) {
                            return;
                        }
                        c09fArr = new C09f[size];
                        arrayList.toArray(c09fArr);
                        arrayList.clear();
                    }
                    int i = 0;
                    do {
                        C09f c09f = c09fArr[i];
                        int size2 = c09f.A01.size();
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= size2) {
                                break;
                            }
                            C02p c02p = (C02p) c09f.A01.get(i3);
                            if (!c02p.A01) {
                                c02p.A02.onReceive(c02h.A00, c09f.A00);
                            }
                            i2 = i3 + 1;
                        }
                        i++;
                    } while (i < size);
                }
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x0020: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000b, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:X.02h) from 0x001d: SPUT (r303v2 ?? I:X.02h) A[Catch: all -> 0x0024] X.02h.A05 X.02h
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
    public static X.C02h A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x0020: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000b, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:X.02h) from 0x001d: SPUT (r303v2 ?? I:X.02h) A[Catch: all -> 0x0024] X.02h.A05 X.02h
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v8 ??, still in use, count: 2, list:
          (r306v8 ??) from 0x003d: PHI (r306v3 ??) = (r306v2 ??), (r306v8 ??) binds: [B:10:0x0026, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ?? I:java.lang.Object) from 0x0039: INVOKE (r0v1 ?? I:java.util.AbstractMap), (r302v0 ?? I:java.lang.Object), (r306v8 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00a2, MD:(K, V):V (c)]
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
    public void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v8 ??, still in use, count: 2, list:
          (r306v8 ??) from 0x003d: PHI (r306v3 ??) = (r306v2 ??), (r306v8 ??) binds: [B:10:0x0026, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
          (r306v8 ?? I:java.lang.Object) from 0x0039: INVOKE (r0v1 ?? I:java.util.AbstractMap), (r302v0 ?? I:java.lang.Object), (r306v8 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00a2, MD:(K, V):V (c)]
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

    public boolean A02(Intent intent) {
        synchronized (this.A03) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = false;
            if ((intent.getFlags() & 8) != 0) {
                z = true;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Resolving type ");
                A0k.append(resolveTypeIfNeeded);
                A0k.append(" scheme ");
                A0k.append(scheme);
                AnonymousClass002.A0V(intent, " of intent ", "LocalBroadcastManager", A0k);
            }
            ArrayList arrayList = (ArrayList) this.A02.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    AnonymousClass002.A0V(arrayList, "Action list: ", "LocalBroadcastManager", AnonymousClass001.A0k());
                }
                ArrayList arrayList2 = null;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    C02p c02p = (C02p) arrayList.get(i2);
                    if (z) {
                        StringBuilder A0k2 = AnonymousClass001.A0k();
                        A0k2.append("Matching against filter ");
                        AnonymousClass001.A19(c02p.A03, "LocalBroadcastManager", A0k2);
                    }
                    if (!c02p.A00) {
                        int match = c02p.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                android.util.Log.v("LocalBroadcastManager", 0Pz.A0W("  Filter matched!  match=0x", Integer.toHexString(match)));
                            }
                            if (arrayList2 == null) {
                                new ArrayList();
                            }
                            arrayList2.add(c02p);
                            c02p.A00 = true;
                        } else if (z) {
                            android.util.Log.v("LocalBroadcastManager", 0Pz.A0W("  Filter did not match: ", match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : PublicKeyCredentialControllerUtility.JSON_KEY_TYPE : "data" : "action" : "category"));
                        }
                    } else if (z) {
                        android.util.Log.v("LocalBroadcastManager", "  Filter's target already added");
                    }
                    i = i2 + 1;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C02p) arrayList2.get(i3)).A00 = false;
                    }
                    this.A01.add(new C09f(intent, arrayList2));
                    Handler handler = this.A04;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
