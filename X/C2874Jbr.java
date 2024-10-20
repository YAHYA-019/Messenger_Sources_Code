package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.Jbr, reason: case insensitive filesystem */
/* loaded from: Jbr.class */
public class C2874Jbr extends Snapshot {
    public static final int[] A09 = new int[0];
    public int A00;
    public int A01;
    public LjB A02;
    public boolean A03;
    public int[] A04;
    public C2820Jac A05;
    public List A06;
    public final Function1 A07;
    public final Function1 A08;

    public C2874Jbr(LjB ljB, Function1 function1, Function1 function12, int i) {
        super(ljB, i);
        this.A07 = function1;
        this.A08 = function12;
        this.A02 = LjB.A04;
        this.A04 = A09;
        this.A00 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0138, code lost:
    
        if (r329 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.KR6 A0O(X.LjB r302, java.util.Map r303, int r304) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2874Jbr.A0O(X.LjB, java.util.Map, int):X.KR6");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        if (super.A02) {
            return;
        }
        super.A0B();
        A0D();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0F() {
        int[] iArr = this.A04;
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                super.A0F();
                return;
            } else {
                LEY.A0D(iArr[i2]);
                i = i2 + 1;
            }
        }
    }

    public C2820Jac A0L() {
        return this instanceof C2870Jbn ? C2870Jbn.A00((C2870Jbn) this).A0L() : this.A05;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 3, list:
          (r309v0 ??) from 0x00d3: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:72:0x01ce, B:74:0x01d9, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ??) from 0x00d3: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:72:0x01ce, B:74:0x01d9, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:X.Jbr) from 0x0235: RETURN (r309v0 ?? I:X.Jbr)
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
    public X.C2874Jbr A0M(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 3, list:
          (r309v0 ??) from 0x00d3: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:72:0x01ce, B:74:0x01d9, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ??) from 0x00d3: PHI (r309v1 ??) = (r309v0 ??), (r309v0 ??), (r309v2 ??) binds: [B:72:0x01ce, B:74:0x01d9, B:17:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:X.Jbr) from 0x0235: RETURN (r309v0 ?? I:X.Jbr)
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    public KR6 A0N() {
        HashMap hashMap;
        C2820Jac A0L;
        if (this instanceof C2870Jbn) {
            return C2870Jbn.A00((C2870Jbn) this).A0N();
        }
        if (this instanceof C2869Jbm) {
            C2869Jbm c2869Jbm = (C2869Jbm) this;
            C2874Jbr c2874Jbr = c2869Jbm.A01;
            if (c2874Jbr.A03 || ((Snapshot) c2874Jbr).A02) {
                return new C2875Jbs(c2869Jbm);
            }
            C2820Jac A0L2 = c2869Jbm.A0L();
            int A04 = c2869Jbm.A04();
            HashMap A0A = A0L2 != null ? LEY.A0A(c2874Jbr, c2869Jbm, c2874Jbr.A07()) : null;
            synchronized (LEY.A07) {
                LEY.A0E(c2869Jbm);
                if (A0L2 == null || A0L2.A01 == 0) {
                    c2869Jbm.A0G();
                } else {
                    KR6 A0O = c2869Jbm.A0O(c2874Jbr.A07(), A0A, c2874Jbr.A04());
                    if (!11T.A0O(A0O, C2876Jbt.A00)) {
                        return A0O;
                    }
                    C2820Jac A0L3 = c2874Jbr.A0L();
                    if (A0L3 != null) {
                        A0L3.A08(A0L2);
                    } else {
                        c2874Jbr.A0R(A0L2);
                        c2869Jbm.A0R(null);
                    }
                }
                if (c2874Jbr.A04() < A04) {
                    c2874Jbr.A0P();
                }
                c2874Jbr.A0I(c2874Jbr.A07().A00(A04).A02(((C2874Jbr) c2869Jbm).A02));
                c2874Jbr.A0Q(A04);
                int i = ((Snapshot) c2869Jbm).A01;
                ((Snapshot) c2869Jbm).A01 = -1;
                if (i >= 0) {
                    int[] iArr = c2874Jbr.A04;
                    11T.A0F(iArr, 0);
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    c2874Jbr.A04 = copyOf;
                }
                c2874Jbr.A02 = c2874Jbr.A02.A03(((C2874Jbr) c2869Jbm).A02);
                int[] iArr2 = c2869Jbm.A04;
                int length2 = iArr2.length;
                if (length2 != 0) {
                    int[] iArr3 = c2874Jbr.A04;
                    int length3 = iArr3.length;
                    if (length3 != 0) {
                        int[] copyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                        System.arraycopy(iArr2, 0, copyOf2, length3, length2);
                        11T.A0D(copyOf2);
                        iArr2 = copyOf2;
                    }
                    c2874Jbr.A04 = iArr2;
                }
                ((C2874Jbr) c2869Jbm).A03 = true;
                if (!c2869Jbm.A00) {
                    c2869Jbm.A00 = true;
                    c2874Jbr.A0D();
                }
            }
        } else {
            if (this instanceof C2868Jbl) {
                throw AnonymousClass001.A0N("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
            }
            C2820Jac A0L4 = A0L();
            if (A0L4 != null) {
                AtomicReference atomicReference = LEY.A08;
                hashMap = LEY.A0A((C2874Jbr) atomicReference.get(), this, LEY.A01.A00(((Snapshot) atomicReference.get()).A04()));
            } else {
                hashMap = null;
            }
            C0ty c0ty = C0ty.A00;
            Object obj = LEY.A07;
            synchronized (obj) {
                LEY.A0E(this);
                if (A0L4 == null || A0L4.A01 == 0) {
                    A0A();
                    C2868Jbl c2868Jbl = (C2868Jbl) LEY.A08.get();
                    LEY.A08(c2868Jbl, LEY.A09);
                    A0L = c2868Jbl.A0L();
                    if (A0L == null || A0L.A01 == 0) {
                        A0L = null;
                    } else {
                        c0ty = LEY.A02;
                    }
                } else {
                    C2868Jbl c2868Jbl2 = (C2868Jbl) LEY.A08.get();
                    KR6 A0O2 = A0O(LEY.A01.A00(c2868Jbl2.A04()), hashMap, LEY.A00);
                    if (!11T.A0O(A0O2, C2876Jbt.A00)) {
                        return A0O2;
                    }
                    A0A();
                    LEY.A08(c2868Jbl2, LEY.A09);
                    A0L = c2868Jbl2.A0L();
                    A0R(null);
                    c2868Jbl2.A0R(null);
                    c0ty = LEY.A02;
                }
                this.A03 = true;
                if (A0L != null) {
                    LtM ltM = new LtM(A0L);
                    if (!ltM.isEmpty()) {
                        int size = c0ty.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((Function2) c0ty.get(i2)).invoke(ltM, this);
                        }
                    }
                }
                if (A0L4 != null && A0L4.A01 != 0) {
                    LtM ltM2 = new LtM(A0L4);
                    int size2 = c0ty.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((Function2) c0ty.get(i3)).invoke(ltM2, this);
                    }
                }
                synchronized (obj) {
                    A0F();
                    LEY.A0C();
                    long j = -1;
                    if (A0L != null) {
                        Object[] objArr = A0L.A03;
                        long[] jArr = A0L.A02;
                        int length4 = jArr.length - 2;
                        if (length4 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr[i4];
                                if ((JQz.A0I(j2, 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int A0G = JR0.A0G(i4, length4);
                                    for (int i5 = 0; i5 < A0G; i5++) {
                                        if ((j2 & 255) < 128) {
                                            LEY.A0G((MJO) JQx.A0t(objArr, i4, i5));
                                        }
                                        j2 >>= 8;
                                    }
                                    if (A0G != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length4) {
                                    break;
                                }
                                i4++;
                            }
                        }
                    }
                    if (A0L4 != null) {
                        Object[] objArr2 = A0L4.A03;
                        long[] jArr2 = A0L4.A02;
                        int length5 = jArr2.length - 2;
                        if (length5 >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j3 = jArr2[i6];
                                if ((((j3 ^ j) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int A0G2 = JR0.A0G(i6, length5);
                                    for (int i7 = 0; i7 < A0G2; i7++) {
                                        if ((j3 & 255) < 128) {
                                            LEY.A0G((MJO) JQx.A0t(objArr2, i6, i7));
                                        }
                                        j3 >>= 8;
                                    }
                                    if (A0G2 != 8) {
                                        break;
                                    }
                                }
                                if (i6 == length5) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    List list = this.A06;
                    if (list != null) {
                        int size3 = list.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            LEY.A0G((MJO) list.get(i8));
                        }
                    }
                    this.A06 = null;
                }
            }
        }
        return C2876Jbt.A00;
    }

    public final void A0P() {
        A0Q(A04());
        if (this.A03 || super.A02) {
            return;
        }
        int A04 = A04();
        synchronized (LEY.A07) {
            int i = LEY.A00;
            LEY.A00 = i + 1;
            if (this instanceof C2870Jbn) {
                throw AnonymousClass001.A0p();
            }
            super.A00 = i;
            Snapshot.A03(this);
        }
        LjB A07 = A07();
        int A042 = A04();
        for (int i2 = A04 + 1; i2 < A042; i2++) {
            A07 = A07.A01(i2);
        }
        A0I(A07);
    }

    public final void A0Q(int i) {
        synchronized (LEY.A07) {
            this.A02 = this.A02.A01(i);
        }
    }

    public void A0R(C2820Jac c2820Jac) {
        if (this instanceof C2870Jbn) {
            throw AnonymousClass001.A0p();
        }
        this.A05 = c2820Jac;
    }
}
