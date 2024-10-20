package X;

import android.graphics.Rect;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1sk, reason: invalid class name */
/* loaded from: 1sk.class */
public final class C1sk extends C1sS implements C1sa {
    public static final C1sk A00 = new Object();

    public static C1qv A00(1sX r301) {
        C1qv c1qv = ((C1sl) r301.A02).A01;
        if (c1qv == null) {
            c1qv = r301.A00.A05.A07;
        }
        return c1qv;
    }

    public static HashMap A01(C2l6 c2l6) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("renderUnitId", Long.valueOf(c2l6.A05));
        A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c2l6.A08);
        A0u.put("bounds", c2l6.A06);
        A0u.put("key", c2l6.A09);
        return A0u;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r324v2 ??, still in use, count: 7, list:
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ?? I:X.2l6) from 0x037e: IPUT (r303v0 ?? I:boolean), (r324v2 ?? I:X.2l6) A[Catch: all -> 0x08c6] X.2l6.A03 boolean
          (r324v2 ?? I:X.2l6) from 0x0385: IPUT (r1v10 ?? I:boolean), (r324v2 ?? I:X.2l6) A[Catch: all -> 0x08c6] X.2l6.A04 boolean
          (r324v2 ?? I:java.lang.Object) from 0x0394: INVOKE (r0v100 ?? I:java.util.Map), (r0v97 ?? I:java.lang.Object), (r324v2 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x08c6, MD:(K, V):V (c)]
          (r324v2 ?? I:X.2l6) from 0x041c: INVOKE (r0v183 ?? I:java.util.HashMap) = (r324v2 ?? I:X.2l6) STATIC call: X.1sk.A01(X.2l6):java.util.HashMap A[Catch: all -> 0x08c6, MD:(X.2l6):java.util.HashMap (m)]
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
    public static void A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r324v2 ??, still in use, count: 7, list:
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ??) from 0x0497: PHI (r324v3 ??) = (r324v2 ??), (r324v2 ??), (r324v2 ??), (r324v1 ??) binds: [B:312:0x039c, B:357:0x048f, B:358:0x0492, B:155:0x034e] A[DONT_GENERATE, DONT_INLINE]
          (r324v2 ?? I:X.2l6) from 0x037e: IPUT (r303v0 ?? I:boolean), (r324v2 ?? I:X.2l6) A[Catch: all -> 0x08c6] X.2l6.A03 boolean
          (r324v2 ?? I:X.2l6) from 0x0385: IPUT (r1v10 ?? I:boolean), (r324v2 ?? I:X.2l6) A[Catch: all -> 0x08c6] X.2l6.A04 boolean
          (r324v2 ?? I:java.lang.Object) from 0x0394: INVOKE (r0v100 ?? I:java.util.Map), (r0v97 ?? I:java.lang.Object), (r324v2 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x08c6, MD:(K, V):V (c)]
          (r324v2 ?? I:X.2l6) from 0x041c: INVOKE (r0v183 ?? I:java.util.HashMap) = (r324v2 ?? I:X.2l6) STATIC call: X.1sk.A01(X.2l6):java.util.HashMap A[Catch: all -> 0x08c6, MD:(X.2l6):java.util.HashMap (m)]
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

    public static void A03(1sX r301) {
        C1sl c1sl = (C1sl) r301.A02;
        2AS r0 = r301.A00.A05.A02;
        int i = r0 != null ? r0.A00 : -1;
        boolean BWo = 1kF.A01.BWo();
        if (BWo) {
            1kF.A01("VisibilityExtension.clearIncrementalItems");
        }
        ArrayList arrayList = new ArrayList();
        java.util.Map map = c1sl.A06;
        for (Map.Entry entry : map.entrySet()) {
            C2l6 c2l6 = (C2l6) entry.getValue();
            if (c2l6.A03) {
                c2l6.A03 = false;
            } else {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            C2l6 c2l62 = (C2l6) map.get(obj);
            if (c2l62 != null) {
                1Io r02 = c2l62.A02;
                1Io r03 = c2l62.A07;
                A04(c2l62, i);
                if ((c2l62.A00 & 32) != 0) {
                    c2l62.A00 &= -33;
                    if (r02 != null) {
                        r02.call(new Object[]{C2l7.A03});
                    }
                }
                if (r03 != null) {
                    2lD r04 = C2l7.A04;
                    r04.A04 = 0;
                    r04.A05 = 0;
                    r04.A02 = 0;
                    r04.A03 = 0;
                    r04.A00 = 0.0f;
                    r04.A01 = 0.0f;
                    r03.call(new Object[]{r04});
                }
                c2l62.A04 = false;
            }
            map.remove(obj);
            i2 = i3 + 1;
        }
        if (BWo) {
            1kF.A00();
        }
        c1sl.A05.setEmpty();
    }

    public static void A04(C2l6 c2l6, int i) {
        if (c2l6.A01 != null) {
            Integer A01 = 1LZ.A01("RenderCore.RenderUnit.OnInvisible");
            if (A01 != null) {
                1LZ.A04("RenderCore.RenderUnit.OnInvisible", String.valueOf(i), A01(c2l6), A01.intValue());
            }
            1Io r0 = c2l6.A01;
            11T.A0F(r0, 0);
            r0.call(new Object[]{C2l7.A02});
            if (A01 != null) {
                1BL.A1D(A01);
            }
        }
    }

    public static boolean A05(1sX r301) {
        C23O c23o = ((C1sl) r301.A02).A02;
        return (c23o == null || c23o.BV7()) && !A00(r301).hasTransientState();
    }

    @Override // X.C1sS
    public /* bridge */ /* synthetic */ Object A0B() {
        return new C1sl();
    }

    @Override // X.C1sS
    public /* bridge */ /* synthetic */ void A0C(Rect rect, 1sX r303, Object obj) {
        C23O c23o = (C23O) obj;
        c23o.getClass();
        boolean BWo = 1kF.A01.BWo();
        if (BWo) {
            1kF.A01("VisibilityExtension.beforeMount");
        }
        C1sl c1sl = (C1sl) r303.A02;
        c1sl.A03 = c23o.BKO();
        c1sl.A04 = c23o.B6z();
        c1sl.A05.setEmpty();
        c1sl.A00 = rect;
        c1sl.A02 = c23o;
        if (BWo) {
            1kF.A00();
        }
    }

    @Override // X.C1sS
    public void A0D(1sX r302) {
        boolean BWo = 1kF.A01.BWo();
        if (BWo) {
            1kF.A01("VisibilityExtension.afterMount");
        }
        if (A05(r302)) {
            A02(((C1sl) r302.A02).A00, r302, true);
        }
        if (BWo) {
            1kF.A00();
        }
    }

    @Override // X.C1sa
    public void CUu(Rect rect, 1sX r303) {
        boolean A05 = A05(r303);
        boolean BWo = 1kF.A01.BWo();
        if (BWo) {
            1kF.A01("VisibilityExtension.onVisibleBoundsChanged");
        }
        if (A05) {
            A02(rect, r303, false);
        }
        if (BWo) {
            1kF.A00();
        }
    }
}
