package androidx.compose.runtime.snapshots;

import X.0Q8;
import X.0QD;
import X.AnonymousClass001;
import X.C1A9;
import X.C2820Jac;
import X.C2868Jbl;
import X.C2870Jbn;
import X.C2871Jbo;
import X.C2872Jbp;
import X.C2873Jbq;
import X.C2874Jbr;
import X.JQx;
import X.JQy;
import X.KZH;
import X.Kv8;
import X.L0Q;
import X.L2v;
import X.LEY;
import X.LjB;
import X.M4p;
import X.MJO;
import kotlin.jvm.functions.Function1;

/* loaded from: Snapshot.class */
public abstract class Snapshot {
    public int A00;
    public int A01;
    public boolean A02;
    public LjB A03;

    public Snapshot(LjB ljB, int i) {
        int i2;
        int i3;
        this.A03 = ljB;
        this.A00 = i;
        if (i != 0) {
            LjB A07 = A07();
            int i4 = LEY.A00;
            int[] iArr = A07.A03;
            if (iArr != null) {
                i = JQx.A0M(iArr);
            } else {
                long j = A07.A01;
                if (j != 0) {
                    i3 = A07.A00;
                } else {
                    j = A07.A02;
                    i3 = j != 0 ? A07.A00 + 64 : i3;
                }
                i = i3 + Long.numberOfTrailingZeros(j);
            }
            synchronized (LEY.A07) {
                L0Q l0q = LEY.A06;
                int i5 = l0q.A01 + 1;
                int[] iArr2 = l0q.A04;
                int length = iArr2.length;
                if (i5 > length) {
                    int i6 = length * 2;
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    C1A9.A0G(iArr2, iArr3, 0, 0, length);
                    int[] iArr5 = l0q.A03;
                    C1A9.A0G(iArr5, iArr4, 0, 0, iArr5.length);
                    l0q.A04 = iArr3;
                    l0q.A03 = iArr4;
                }
                int i7 = l0q.A01;
                l0q.A01 = i7 + 1;
                int[] iArr6 = l0q.A02;
                int length2 = iArr6.length;
                if (l0q.A00 >= length2) {
                    int i8 = 0;
                    int i9 = length2 * 2;
                    int[] iArr7 = new int[i9];
                    while (i8 < i9) {
                        int i10 = i8 + 1;
                        iArr7[i8] = i10;
                        i8 = i10;
                    }
                    C1A9.A0G(iArr6, iArr7, 0, 0, length2);
                    l0q.A02 = iArr7;
                    iArr6 = iArr7;
                }
                i2 = l0q.A00;
                l0q.A00 = iArr6[i2];
                int[] iArr8 = l0q.A04;
                iArr8[i7] = i;
                l0q.A03[i7] = i2;
                iArr6[i2] = i7;
                int i11 = iArr8[i7];
                while (i7 > 0) {
                    int i12 = ((i7 + 1) >> 1) - 1;
                    if (iArr8[i12] <= i11) {
                        break;
                    }
                    L0Q.A00(l0q, i12, i7);
                    i7 = i12;
                }
            }
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }

    public static Snapshot A01(Object obj) {
        Snapshot snapshot = ((C2873Jbq) obj).A02;
        if (snapshot == null) {
            snapshot = (Snapshot) LEY.A08.get();
        }
        return snapshot;
    }

    public static L2v A02(Snapshot snapshot, L2v l2v) {
        return LEY.A04(snapshot.A07(), l2v, snapshot.A04());
    }

    public static void A03(Snapshot snapshot) {
        LEY.A01 = LEY.A01.A01(snapshot.A04());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.runtime.snapshots.Snapshot] */
    public int A04() {
        C2874Jbr A00;
        if (this instanceof C2873Jbq) {
            A00 = A01(this);
        } else {
            if (!(this instanceof C2870Jbn)) {
                return this.A00;
            }
            A00 = C2870Jbn.A00((C2870Jbn) this);
        }
        return A00.A04();
    }

    public int A05() {
        if (!(this instanceof C2874Jbr)) {
            return 0;
        }
        C2874Jbr c2874Jbr = (C2874Jbr) this;
        return c2874Jbr instanceof C2870Jbn ? C2870Jbn.A00((C2870Jbn) c2874Jbr).A05() : c2874Jbr.A01;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 3, list:
          (r309v0 ??) from 0x004f: PHI (r309v3 ??) = (r309v0 ??), (r309v0 ??), (r309v4 ??) binds: [B:68:0x01f6, B:70:0x01ff, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ??) from 0x004f: PHI (r309v3 ??) = (r309v0 ??), (r309v0 ??), (r309v4 ??) binds: [B:68:0x01f6, B:70:0x01ff, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:androidx.compose.runtime.snapshots.Snapshot) from 0x0262: RETURN (r309v0 ?? I:androidx.compose.runtime.snapshots.Snapshot)
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
    public androidx.compose.runtime.snapshots.Snapshot A06(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 3, list:
          (r309v0 ??) from 0x004f: PHI (r309v3 ??) = (r309v0 ??), (r309v0 ??), (r309v4 ??) binds: [B:68:0x01f6, B:70:0x01ff, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ??) from 0x004f: PHI (r309v3 ??) = (r309v0 ??), (r309v0 ??), (r309v4 ??) binds: [B:68:0x01f6, B:70:0x01ff, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:androidx.compose.runtime.snapshots.Snapshot) from 0x0262: RETURN (r309v0 ?? I:androidx.compose.runtime.snapshots.Snapshot)
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
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.runtime.snapshots.Snapshot] */
    public LjB A07() {
        C2874Jbr A00;
        if (this instanceof C2873Jbq) {
            A00 = A01(this);
        } else {
            if (!(this instanceof C2870Jbn)) {
                return this.A03;
            }
            A00 = C2870Jbn.A00((C2870Jbn) this);
        }
        return A00.A07();
    }

    public Function1 A08() {
        if (this instanceof C2873Jbq) {
            return ((C2873Jbq) this).A00;
        }
        if (this instanceof C2872Jbp) {
            return ((C2872Jbp) this).A01;
        }
        if (this instanceof C2871Jbo) {
            return ((C2871Jbo) this).A01;
        }
        C2874Jbr c2874Jbr = (C2874Jbr) this;
        return c2874Jbr instanceof C2870Jbn ? ((C2870Jbn) c2874Jbr).A00 : c2874Jbr.A07;
    }

    public Function1 A09() {
        if ((this instanceof C2873Jbq) || (this instanceof C2872Jbp) || (this instanceof C2871Jbo)) {
            return null;
        }
        C2874Jbr c2874Jbr = (C2874Jbr) this;
        return c2874Jbr instanceof C2870Jbn ? ((C2870Jbn) c2874Jbr).A01 : c2874Jbr.A08;
    }

    public void A0A() {
        LjB A00;
        if (this instanceof C2874Jbr) {
            C2874Jbr c2874Jbr = (C2874Jbr) this;
            A00 = LEY.A01.A00(c2874Jbr.A04()).A02(c2874Jbr.A02);
        } else {
            A00 = LEY.A01.A00(A04());
        }
        LEY.A01 = A00;
    }

    public void A0B() {
        this.A02 = true;
        synchronized (LEY.A07) {
            int i = this.A01;
            if (i >= 0) {
                LEY.A0D(i);
                this.A01 = -1;
            }
        }
    }

    public void A0C() {
        if (this instanceof C2873Jbq) {
            throw AnonymousClass001.A0p();
        }
        if (this instanceof C2872Jbp) {
            ((C2872Jbp) this).A00++;
        } else {
            if (this instanceof C2871Jbo) {
                throw AnonymousClass001.A0p();
            }
            C2874Jbr c2874Jbr = (C2874Jbr) this;
            if (c2874Jbr instanceof C2870Jbn) {
                throw AnonymousClass001.A0p();
            }
            if (c2874Jbr instanceof C2868Jbl) {
                throw AnonymousClass001.A0p();
            }
            c2874Jbr.A00++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v1, types: [androidx.compose.runtime.snapshots.Snapshot, X.Jbr] */
    /* JADX WARN: Type inference failed for: r304v2 */
    /* JADX WARN: Type inference failed for: r304v4, types: [X.Jbp] */
    public void A0D() {
        Snapshot snapshot;
        if (this instanceof C2873Jbq) {
            throw AnonymousClass001.A0p();
        }
        if (this instanceof C2872Jbp) {
            snapshot = (C2872Jbp) this;
            int i = snapshot.A00 - 1;
            snapshot.A00 = i;
            if (i != 0) {
                return;
            }
        } else {
            if (this instanceof C2871Jbo) {
                throw AnonymousClass001.A0p();
            }
            snapshot = (C2874Jbr) this;
            if (snapshot instanceof C2870Jbn) {
                throw AnonymousClass001.A0p();
            }
            if (snapshot instanceof C2868Jbl) {
                throw AnonymousClass001.A0p();
            }
            int i2 = snapshot.A00;
            if (i2 <= 0) {
                throw AnonymousClass001.A0L("no pending nested snapshots");
            }
            int i3 = i2 - 1;
            snapshot.A00 = i3;
            if (i3 != 0 || snapshot.A03) {
                return;
            }
            C2820Jac A0L = snapshot.A0L();
            if (A0L != null) {
                if (!(!snapshot.A03)) {
                    Kv8.A01("Unsupported operation on a snapshot that has been applied");
                    throw 0Q8.createAndThrow();
                }
                snapshot.A0R(null);
                int A04 = snapshot.A04();
                Object[] objArr = A0L.A03;
                long[] jArr = A0L.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4;
                        long j = jArr[i5];
                        if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int A08 = 8 - JQx.A08(i5, length);
                            int i6 = 0;
                            while (true) {
                                int i7 = i6;
                                if (i7 >= A08) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    L2v Amc = ((MJO) JQx.A0t(objArr, i5, i7)).Amc();
                                    while (true) {
                                        L2v l2v = Amc;
                                        if (l2v != null) {
                                            int i8 = l2v.A00;
                                            if (i8 == A04 || 0QD.A0k(snapshot.A02, Integer.valueOf(i8))) {
                                                l2v.A00 = 0;
                                            }
                                            Amc = l2v.A01;
                                        }
                                    }
                                }
                                j >>= 8;
                                i6 = i7 + 1;
                            }
                            if (A08 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i4 = i5 + 1;
                        }
                    }
                }
            }
        }
        snapshot.A0G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.compose.runtime.snapshots.Snapshot] */
    public void A0E() {
        C2874Jbr A00;
        if (this instanceof C2873Jbq) {
            A00 = A01(this);
        } else {
            if ((this instanceof C2872Jbp) || (this instanceof C2871Jbo)) {
                return;
            }
            C2874Jbr c2874Jbr = (C2874Jbr) this;
            if (!(c2874Jbr instanceof C2870Jbn)) {
                if (c2874Jbr instanceof C2868Jbl) {
                    LEY.A09(M4p.A00);
                    return;
                } else {
                    if (c2874Jbr.A03 || ((Snapshot) c2874Jbr).A02) {
                        return;
                    }
                    c2874Jbr.A0P();
                    return;
                }
            }
            A00 = C2870Jbn.A00((C2870Jbn) c2874Jbr);
        }
        A00.A0E();
    }

    public void A0F() {
        int i = this.A01;
        if (i >= 0) {
            LEY.A0D(i);
            this.A01 = -1;
        }
    }

    public final void A0G() {
        synchronized (LEY.A07) {
            A0A();
            A0F();
        }
    }

    public void A0H(int i) {
        if (!(this instanceof C2874Jbr)) {
            throw AnonymousClass001.A0N("Updating write count is not supported for this snapshot");
        }
        C2874Jbr c2874Jbr = (C2874Jbr) this;
        if (c2874Jbr instanceof C2870Jbn) {
            C2870Jbn.A00((C2870Jbn) c2874Jbr).A0H(i);
        } else {
            c2874Jbr.A01 = i;
        }
    }

    public void A0I(LjB ljB) {
        if (this instanceof C2870Jbn) {
            throw AnonymousClass001.A0p();
        }
        this.A03 = ljB;
    }

    public void A0J(MJO mjo) {
        if (this instanceof C2873Jbq) {
            A01(this).A0J(mjo);
            return;
        }
        if (this instanceof C2872Jbp) {
            int i = LEY.A00;
            throw AnonymousClass001.A0N("Cannot modify a state object in a read-only snapshot");
        }
        if (this instanceof C2871Jbo) {
            int i2 = LEY.A00;
            throw AnonymousClass001.A0N("Cannot modify a state object in a read-only snapshot");
        }
        C2874Jbr c2874Jbr = (C2874Jbr) this;
        if (c2874Jbr instanceof C2870Jbn) {
            C2870Jbn.A00((C2870Jbn) c2874Jbr).A0J(mjo);
            return;
        }
        C2820Jac A0L = c2874Jbr.A0L();
        if (A0L == null) {
            C2820Jac c2820Jac = KZH.A00;
            A0L = C2820Jac.A02();
            c2874Jbr.A0R(A0L);
        }
        C2820Jac.A04(A0L, mjo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.runtime.snapshots.Snapshot] */
    public boolean A0K() {
        C2874Jbr A00;
        if (this instanceof C2873Jbq) {
            A00 = A01(this);
        } else {
            if ((this instanceof C2872Jbp) || (this instanceof C2871Jbo)) {
                return true;
            }
            C2874Jbr c2874Jbr = (C2874Jbr) this;
            if (!(c2874Jbr instanceof C2870Jbn)) {
                return false;
            }
            A00 = C2870Jbn.A00((C2870Jbn) c2874Jbr);
        }
        return A00.A0K();
    }
}
