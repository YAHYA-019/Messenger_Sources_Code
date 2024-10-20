package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Ew, reason: invalid class name */
/* loaded from: 4Ew.class */
public final class C4Ew implements 2FD {
    public int A00;
    public long A01;
    public 2Fe A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final 1iL A06;
    public final C4Ey A07;
    public final 2FF A08;
    public final 2FF A09;
    public final 2FF A0A;
    public final 2De A0B;
    public final C2Ez A0C;
    public final ArrayList A0D;

    public C4Ew(1iL r302, 2De r303, final C2Ez c2Ez) {
        this.A0C = c2Ez;
        this.A09 = new 2FF(new C2Ez() { // from class: X.4Ex
            @Override // X.C2Ez
            public /* bridge */ /* synthetic */ int BB9(Object obj) {
                return c2Ez.BB9(((C04504b6) obj).A04.A09());
            }
        });
        this.A0A = new 2FF(new C2Ez() { // from class: X.4Ex
            @Override // X.C2Ez
            public /* bridge */ /* synthetic */ int BB9(Object obj) {
                return c2Ez.BB9(((C04504b6) obj).A04.A09());
            }
        });
        this.A08 = new 2FF(new C2Ez() { // from class: X.4Ex
            @Override // X.C2Ez
            public /* bridge */ /* synthetic */ int BB9(Object obj) {
                return c2Ez.BB9(((C04504b6) obj).A04.A09());
            }
        });
        this.A0B = r303;
        this.A06 = r302;
        Object obj = r302.get();
        C0By.A03(obj, "mMemoryCacheParamsSupplier returned null");
        this.A02 = (2Fe) obj;
        this.A01 = SystemClock.uptimeMillis();
        this.A04 = 1;
        this.A05 = 20;
        this.A07 = new C4Ey(this);
        this.A0D = new ArrayList(20);
        this.A00 = 850;
        this.A03 = 10;
    }

    private int A00() {
        int A00;
        synchronized (this) {
            A00 = (this.A08.A00() - this.A09.A00()) - this.A0A.A00();
        }
        return A00;
    }

    public static 2EU A01(C4Ew c4Ew, C04504b6 c04504b6) {
        2EU r304;
        synchronized (c4Ew) {
            c04504b6.getClass();
            r304 = (c04504b6.A03 && c04504b6.A01 == 0) ? c04504b6.A04 : null;
        }
        return r304;
    }

    private 2EU A02(final C04504b6 c04504b6) {
        2EU A00;
        synchronized (this) {
            boolean z = c04504b6.A03;
            boolean z2 = false;
            if (!z) {
                z2 = true;
            }
            C0By.A04(z2);
            c04504b6.A01++;
            boolean z3 = false;
            if (!z) {
                z3 = true;
            }
            C0By.A04(z3);
            c04504b6.A00++;
            A00 = 2EU.A00(2EU.A05, new 2EW() { // from class: X.4Ol
                public void Cci(Object obj) {
                    boolean z4;
                    2EU A01;
                    2Dg r0;
                    C4Ew c4Ew = C4Ew.this;
                    C04504b6 c04504b62 = c04504b6;
                    synchronized (c4Ew) {
                        int i = c04504b62.A01;
                        boolean z5 = false;
                        if (i > 0) {
                            z5 = true;
                        }
                        C0By.A04(z5);
                        int i2 = i - 1;
                        c04504b62.A01 = i2;
                        if (c04504b62.A03 || i2 != 0) {
                            z4 = false;
                        } else {
                            if (c04504b62.A00 > c4Ew.A04) {
                                c4Ew.A0A.A06(c04504b62.A06, c04504b62);
                            } else {
                                c4Ew.A09.A06(c04504b62.A06, c04504b62);
                            }
                            z4 = true;
                        }
                        A01 = C4Ew.A01(c4Ew, c04504b62);
                    }
                    2EU.A04(A01);
                    if (z4 && (r0 = c04504b62.A05) != null) {
                        r0.Bww(c04504b62.A06, true);
                    }
                    C4Ew.A05(c4Ew);
                    C4Ew.A04(c4Ew);
                }
            }, c04504b6.A04.A09());
        }
        return A00;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v0 ??, still in use, count: 2, list:
          (r310v0 ??) from 0x0148: PHI (r310v1 ??) = (r310v0 ??), (r310v2 ??) binds: [B:30:0x0148, B:15:0x0146] A[DONT_GENERATE, DONT_INLINE]
          (r310v0 ?? I:java.util.AbstractCollection) from 0x0132: INVOKE (r310v0 ?? I:java.util.AbstractCollection), (r0v54 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x014e, MD:(E):boolean (c)]
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
    private java.util.ArrayList A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v0 ??, still in use, count: 2, list:
          (r310v0 ??) from 0x0148: PHI (r310v1 ??) = (r310v0 ??), (r310v2 ??) binds: [B:30:0x0148, B:15:0x0146] A[DONT_GENERATE, DONT_INLINE]
          (r310v0 ?? I:java.util.AbstractCollection) from 0x0132: INVOKE (r310v0 ?? I:java.util.AbstractCollection), (r0v54 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x014e, MD:(E):boolean (c)]
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

    public static void A04(C4Ew c4Ew) {
        ArrayList A03;
        ArrayList A032;
        synchronized (c4Ew) {
            2Fe r0 = c4Ew.A02;
            int min = Math.min(r0.A03, r0.A00 - c4Ew.A00());
            2Fe r02 = c4Ew.A02;
            int min2 = Math.min(r02.A04, r02.A02 - c4Ew.AqL());
            long j = min;
            long j2 = c4Ew.A00;
            int i = (int) ((j * j2) / 1000);
            int i2 = (int) ((min2 * j2) / 1000);
            A03 = c4Ew.A03(c4Ew.A09, 0S2.A00, i, i2);
            A032 = c4Ew.A03(c4Ew.A0A, 0S2.A01, min - i, min2 - i2);
            c4Ew.A0A(A03);
            c4Ew.A0A(A032);
        }
        c4Ew.A08(A03);
        c4Ew.A08(A032);
        A09(A03);
        A09(A032);
    }

    public static void A05(C4Ew c4Ew) {
        synchronized (c4Ew) {
            if (c4Ew.A01 + c4Ew.A02.A05 <= SystemClock.uptimeMillis()) {
                c4Ew.A01 = SystemClock.uptimeMillis();
                2Fe r0 = (2Fe) c4Ew.A06.get();
                C0By.A03(r0, "mMemoryCacheParamsSupplier returned null");
                c4Ew.A02 = r0;
            }
        }
    }

    public static void A06(C04504b6 c04504b6) {
        2Dg r0;
        if (c04504b6 == null || (r0 = c04504b6.A05) == null) {
            return;
        }
        r0.Bww(c04504b6.A06, false);
    }

    private void A07(C04504b6 c04504b6) {
        synchronized (this) {
            c04504b6.getClass();
            boolean z = false;
            if (!c04504b6.A03) {
                z = true;
            }
            C0By.A04(z);
            c04504b6.A03 = true;
        }
    }

    private void A08(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                2EU.A04(A01(this, (C04504b6) it.next()));
            }
        }
    }

    public static void A09(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A06((C04504b6) it.next());
            }
        }
    }

    private void A0A(ArrayList arrayList) {
        synchronized (this) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A07((C04504b6) it.next());
                }
            }
        }
    }

    public 2EU AD3(2EU r302, Object obj) {
        return AD4(r302, null, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2EU AD4(X.2EU r302, X.2Dg r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Ew.AD4(X.2EU, X.2Dg, java.lang.Object):X.2EU");
    }

    public boolean AHj(4sZ r302) {
        boolean z;
        synchronized (this) {
            z = !this.A08.A04(r302).isEmpty();
        }
        return z;
    }

    public 2EU AUN(Object obj) {
        C04504b6 c04504b6;
        C04504b6 c04504b62;
        Object obj2;
        2EU r304;
        obj.getClass();
        synchronized (this) {
            c04504b6 = (C04504b6) this.A09.A03(obj);
            c04504b62 = (C04504b6) this.A0A.A03(obj);
            2FF r0 = this.A08;
            synchronized (r0) {
                try {
                    obj2 = r0.A02.get(obj);
                } catch (Throwable th) {
                    th = th;
                }
            }
            C04504b6 c04504b63 = (C04504b6) obj2;
            if (c04504b63 != null) {
                r304 = A02(c04504b63);
            } else {
                try {
                    C4Ey c4Ey = this.A07;
                    ArrayList arrayList = c4Ey.A00;
                    if (arrayList.contains(obj)) {
                        int i = this.A00 + this.A03;
                        if (i <= 900) {
                            this.A00 = i;
                        }
                        int indexOf = arrayList.indexOf(obj);
                        if (indexOf >= 0) {
                            ArrayList arrayList2 = c4Ey.A01;
                            Integer valueOf = Integer.valueOf(((Integer) arrayList2.get(indexOf)).intValue() + 1);
                            if (indexOf == 19) {
                                arrayList2.set(19, valueOf);
                            } else {
                                arrayList.remove(indexOf);
                                arrayList2.remove(indexOf);
                                arrayList.add(obj);
                                arrayList2.add(valueOf);
                            }
                        }
                    } else {
                        int i2 = this.A00;
                        int i3 = this.A03;
                        if (i2 - i3 >= 100 && this.A0D.contains(obj)) {
                            this.A00 -= i3;
                        }
                    }
                    r304 = null;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        A06(c04504b6);
        A06(c04504b62);
        A05(this);
        A04(this);
        return r304;
    }

    public String Agc() {
        return null;
    }

    public int Akq() {
        int A00;
        synchronized (this) {
            A00 = this.A09.A00() + this.A0A.A00();
        }
        return A00;
    }

    public int Akr() {
        int A01;
        synchronized (this) {
            A01 = this.A09.A01() + this.A0A.A01();
        }
        return A01;
    }

    public int AqL() {
        int A01;
        synchronized (this) {
            A01 = (this.A08.A01() - this.A09.A01()) - this.A0A.A01();
        }
        return A01;
    }

    public 2Fe AwW() {
        return this.A02;
    }

    public int Cdu(4sZ r302) {
        ArrayList A05;
        ArrayList A052;
        ArrayList A053;
        synchronized (this) {
            A05 = this.A09.A05(r302);
            A052 = this.A0A.A05(r302);
            A053 = this.A08.A05(r302);
            A0A(A053);
        }
        A08(A053);
        A09(A05);
        A09(A052);
        A05(this);
        A04(this);
        return A053.size();
    }

    public 2EU Cia(Object obj) {
        C04504b6 c04504b6;
        boolean z;
        2EU r303;
        synchronized (this) {
            c04504b6 = (C04504b6) this.A09.A03(obj);
            if (c04504b6 == null) {
                c04504b6 = (C04504b6) this.A0A.A03(obj);
            }
            z = true;
            boolean z2 = false;
            if (c04504b6 != null) {
                C04504b6 c04504b62 = (C04504b6) this.A08.A03(obj);
                c04504b62.getClass();
                if (c04504b62.A01 == 0) {
                    z2 = true;
                }
                C0By.A04(z2);
                r303 = c04504b62.A04;
            } else {
                r303 = null;
                z = false;
            }
        }
        if (z) {
            A06(c04504b6);
        }
        return r303;
    }

    public void D5F(45Z r302) {
        ArrayList A03;
        ArrayList A032;
        double BHD = this.A0B.BHD(r302);
        synchronized (this) {
            int i = 0;
            int max = Math.max(0, ((int) (this.A08.A01() * (1.0d - BHD))) - AqL());
            2FF r0 = this.A0A;
            int A01 = r0.A01();
            int max2 = Math.max(0, max - A01);
            if (max > A01) {
                max = A01;
                i = max2;
            }
            int i2 = (-1) >>> 1;
            A03 = A03(this.A09, 0S2.A00, i2, i);
            A032 = A03(r0, 0S2.A01, i2, max);
            A0A(A03);
            A0A(A032);
        }
        A08(A03);
        A08(A032);
        A09(A03);
        A09(A032);
        A05(this);
        A04(this);
    }

    public boolean contains(Object obj) {
        boolean containsKey;
        synchronized (this) {
            2FF r0 = this.A08;
            synchronized (r0) {
                containsKey = r0.A02.containsKey(obj);
            }
        }
        return containsKey;
    }

    public int getCount() {
        int A00;
        synchronized (this) {
            A00 = this.A08.A00();
        }
        return A00;
    }

    public int getSizeInBytes() {
        int A01;
        synchronized (this) {
            A01 = this.A08.A01();
        }
        return A01;
    }
}
