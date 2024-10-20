package X;

import android.util.Pair;
import com.facebook.common.util.TriState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ay.class */
public abstract class AbstractC04434ay implements InterfaceC04444az {
    public boolean A00 = false;

    public void A03() {
        InterfaceC04444az interfaceC04444az;
        if (this instanceof AbstractC04664bm) {
            5qA r303 = (AbstractC04664bm) this;
            if (r303 instanceof AbstractC04814c1) {
                r303 = (AbstractC04814c1) r303;
                AbstractC04814c1.A01(r303, true);
            } else if (r303 instanceof C05234dY) {
                C05234dY c05234dY = (C05234dY) r303;
                ((AbstractC04664bm) c05234dY).A00.Bn2();
                C05234dY.A00(c05234dY);
                return;
            } else if (r303 instanceof 5qA) {
                r303 = r303;
                if (!5qA.A01(r303)) {
                    return;
                }
            }
            interfaceC04444az = r303.A00;
        } else {
            if (this instanceof C04424ax) {
                AbstractC04394au abstractC04394au = ((C04424ax) this).A00;
                synchronized (abstractC04394au) {
                    C0By.A04(abstractC04394au.isClosed());
                }
                return;
            }
            if (this instanceof C04634bj) {
                C04634bj c04634bj = (C04634bj) this;
                try {
                    if (2D9.A00().BWo()) {
                        2D9.A02("MultiplexProducer#onCancellation");
                    }
                    C04584be c04584be = c04634bj.A00;
                    synchronized (c04584be) {
                        if (c04584be.A03 == c04634bj) {
                            c04584be.A03 = null;
                            c04584be.A02 = null;
                            C04584be.A05(c04584be.A04);
                            c04584be.A04 = null;
                            C04584be.A04(TriState.UNSET, c04584be);
                        }
                    }
                    if (2D9.A00().BWo()) {
                        2D9.A01();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    4YV.A14();
                    throw th;
                }
            }
            4dT r0 = (4dT) this;
            C3Yb.A00(r0.A01);
            interfaceC04444az = r0.A00;
        }
        interfaceC04444az.Bn2();
    }

    public void A04(float f) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0d2d, code lost:
    
        if (r317 != (-2)) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x037c, code lost:
    
        if (r0.contains(java.lang.Integer.valueOf(r302.A00)) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        if (r0.canResize(r302, r0, r0.A09) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x029f, code lost:
    
        if (r0 >= 0) goto L535;
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0ebf: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:654:0x0ebf */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(java.lang.Object r302, int r303) {
        /*
            Method dump skipped, instructions count: 3783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04434ay.A05(java.lang.Object, int):void");
    }

    public void A06(Throwable th) {
        InterfaceC04444az interfaceC04444az;
        if (this instanceof AbstractC04664bm) {
            4dX r304 = (AbstractC04664bm) this;
            if (r304 instanceof AbstractC04814c1) {
                r304 = (AbstractC04814c1) r304;
                11T.A0F(th, 0);
                AbstractC04814c1.A01(r304, true);
            } else {
                if (r304 instanceof C05234dY) {
                    C05234dY c05234dY = (C05234dY) r304;
                    ((AbstractC04664bm) c05234dY).A00.onFailure(th);
                    C05234dY.A00(c05234dY);
                    return;
                }
                if (r304 instanceof 4dX) {
                    4dX r0 = r304;
                    5fD r02 = r0.A03;
                    int i = r0.A00 + 1;
                    interfaceC04444az = r0.A00;
                    if (5fD.A00(interfaceC04444az, r0.A02, r02, i)) {
                        return;
                    }
                } else if (r304 instanceof C05254da) {
                    C05254da c05254da = (C05254da) r304;
                    c05254da.A01.A00.CZW(((AbstractC04664bm) c05254da).A00, c05254da.A00);
                    return;
                } else if (r304 instanceof 5qA) {
                    r304 = (5qA) r304;
                    if (!5qA.A01(r304)) {
                        return;
                    }
                } else {
                    11T.A0F(th, 0);
                }
            }
            interfaceC04444az = r304.A00;
        } else {
            if (this instanceof C04634bj) {
                C04634bj c04634bj = (C04634bj) this;
                try {
                    if (2D9.A00().BWo()) {
                        2D9.A02("MultiplexProducer#onFailure");
                    }
                    C04584be c04584be = c04634bj.A00;
                    synchronized (c04584be) {
                        try {
                            if (c04584be.A03 == c04634bj) {
                                CopyOnWriteArraySet copyOnWriteArraySet = c04584be.A06;
                                Iterator it = copyOnWriteArraySet.iterator();
                                copyOnWriteArraySet.clear();
                                4aY r03 = c04584be.A07;
                                r03.A00(c04584be, c04584be.A05);
                                C04584be.A05(c04584be.A04);
                                c04584be.A04 = null;
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    synchronized (pair) {
                                        try {
                                            InterfaceC04374as interfaceC04374as = (InterfaceC04374as) pair.second;
                                            ((C04364ar) interfaceC04374as).A05.CE8(interfaceC04374as, r03.A02, th, (java.util.Map) null);
                                            C04364ar c04364ar = c04584be.A02;
                                            if (c04364ar != null) {
                                                ((InterfaceC04374as) pair.second).CaA(c04364ar.A0C);
                                            }
                                            ((InterfaceC04444az) pair.first).onFailure(th);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    if (2D9.A00().BWo()) {
                        2D9.A01();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    4YV.A14();
                    throw th4;
                }
            }
            if (this instanceof C04424ax) {
                11T.A0F(th, 0);
                AbstractC04394au.A02(((C04424ax) this).A00, th);
                return;
            } else {
                4dT r04 = (4dT) this;
                C3Yb.A00(r04.A01);
                interfaceC04444az = r04.A00;
            }
        }
        interfaceC04444az.onFailure(th);
    }

    @Override // X.InterfaceC04444az
    public void Bn2() {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                try {
                    A03();
                } catch (Exception e) {
                    C0d7.A03(getClass(), "unhandled exception", e);
                }
            }
        }
    }

    @Override // X.InterfaceC04444az
    public void C9C(Object obj, int i) {
        synchronized (this) {
            if (!this.A00) {
                boolean z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
                this.A00 = z;
                try {
                    A05(obj, i);
                } catch (Exception e) {
                    C0d7.A03(getClass(), "unhandled exception", e);
                }
            }
        }
    }

    @Override // X.InterfaceC04444az
    public void CEP(float f) {
        if (this instanceof 4dT) {
            ((4dT) this).A00.CEP(f);
            return;
        }
        synchronized (this) {
            if (!this.A00) {
                try {
                    A04(f);
                } catch (Exception e) {
                    C0d7.A03(getClass(), "unhandled exception", e);
                }
            }
        }
    }

    @Override // X.InterfaceC04444az
    public void onFailure(Throwable th) {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                try {
                    A06(th);
                } catch (Exception e) {
                    C0d7.A03(getClass(), "unhandled exception", e);
                }
            }
        }
    }
}
