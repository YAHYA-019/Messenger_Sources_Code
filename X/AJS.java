package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.bottomsheet.QPBottomSheet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* loaded from: AJS.class */
public final class AJS extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJS(KMS kms, C9Me c9Me, Object obj, 0DR r305, Function2 function2) {
        super(2, r305);
        this.A06 = 0;
        this.A08 = kms;
        this.A0A = c9Me;
        this.A07 = function2;
        this.A09 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJS(Activity activity, DialogInterface.OnShowListener onShowListener, FbUserSession fbUserSession, InterfaceC06574hb interfaceC06574hb, InterstitialTrigger interstitialTrigger, 1Iw r307, QPBottomSheet qPBottomSheet, 0DR r309, 2aI r310) {
        super(2, r309);
        this.A06 = 1;
        this.A0A = qPBottomSheet;
        this.A02 = fbUserSession;
        this.A07 = activity;
        this.A09 = r307;
        this.A04 = r310;
        this.A05 = interstitialTrigger;
        this.A03 = onShowListener;
        this.A01 = interfaceC06574hb;
        this.A08 = null;
    }

    public final 0DR create(Object obj, 0DR r303) {
        if (this.A06 == 0) {
            AJS ajs = new AJS((KMS) this.A08, (C9Me) this.A0A, this.A09, r303, (Function2) this.A07);
            ajs.A01 = obj;
            return ajs;
        }
        QPBottomSheet qPBottomSheet = (QPBottomSheet) this.A0A;
        FbUserSession fbUserSession = (FbUserSession) this.A02;
        Activity activity = (Activity) this.A07;
        1Iw r0 = (1Iw) this.A09;
        2aI r02 = (2aI) this.A04;
        return new AJS(activity, (DialogInterface.OnShowListener) this.A03, fbUserSession, (InterfaceC06574hb) this.A01, (InterstitialTrigger) this.A05, r0, qPBottomSheet, r303, r02);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
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
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x026e: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:74:0x026e */
    public final Object invokeSuspend(Object obj) {
        4dH r316;
        9Md r311;
        C9Me c9Me;
        AtomicReference atomicReference;
        9Md r0;
        4dH r3162;
        Function2 function2;
        Object obj2;
        if (this.A06 != 0) {
            0Ds r02 = 0Ds.A02;
            int i = this.A00;
            if (i == 0) {
                0Dt.A00(obj);
                QPBottomSheet qPBottomSheet = (QPBottomSheet) this.A0A;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                Activity activity = (Activity) this.A07;
                1Iw r03 = (1Iw) this.A09;
                2aI r04 = (2aI) this.A04;
                InterstitialTrigger interstitialTrigger = (InterstitialTrigger) this.A05;
                DialogInterface.OnShowListener onShowListener = (DialogInterface.OnShowListener) this.A03;
                InterfaceC06574hb interfaceC06574hb = (InterfaceC06574hb) this.A01;
                this.A00 = 1;
                if (qPBottomSheet.A02(activity, onShowListener, fbUserSession, interfaceC06574hb, interstitialTrigger, r03, this, r04) == r02) {
                    return r02;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            return 04S.A00;
        }
        Object obj3 = obj;
        0Ds r05 = 0Ds.A02;
        int i2 = this.A00;
        try {
            try {
                if (i2 == 0) {
                    0Dt.A00(obj);
                    2aI r06 = (2aI) this.A01;
                    KMS kms = (KMS) this.A08;
                    0DD r07 = r06.getCoroutineContext().get(C2a2.A00);
                    11T.A0D(r07);
                    r311 = new 9Md(kms, (C2a2) r07);
                    c9Me = (C9Me) this.A0A;
                    do {
                        atomicReference = c9Me.A00;
                        r0 = (9Md) atomicReference.get();
                        if (r0 != null && r311.A00.compareTo(r0.A00) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                    } while (!1MG.A00(atomicReference, r0, r311));
                    if (r0 != null) {
                        r0.A01.AE0(new AIM());
                    }
                    r3162 = c9Me.A01;
                    function2 = (Function2) this.A07;
                    obj2 = this.A09;
                    this.A01 = r311;
                    this.A02 = r3162;
                    this.A03 = function2;
                    this.A04 = obj2;
                    this.A05 = c9Me;
                    this.A00 = 1;
                    if (r3162.BZF((Object) null, this) == r05) {
                        return r05;
                    }
                } else {
                    if (i2 != 1) {
                        c9Me = (C9Me) this.A03;
                        r3162 = (4dH) this.A02;
                        r311 = this.A01;
                        try {
                            0Dt.A00(obj);
                            1MG.A00(c9Me.A00, r311, (Object) null);
                            r3162.D5h((Object) null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            1MG.A00(c9Me.A00, r311, (Object) null);
                            throw th;
                        }
                    }
                    c9Me = (C9Me) this.A05;
                    obj2 = this.A04;
                    function2 = (Function2) this.A03;
                    r3162 = (4dH) this.A02;
                    r311 = this.A01;
                    0Dt.A00(obj);
                }
                this.A01 = r311;
                this.A02 = r3162;
                this.A03 = c9Me;
                this.A04 = null;
                this.A05 = null;
                this.A00 = 2;
                obj3 = function2.invoke(obj2, this);
                if (obj3 == r05) {
                    return r05;
                }
                1MG.A00(c9Me.A00, r311, (Object) null);
                r3162.D5h((Object) null);
                return obj3;
            } catch (Throwable th2) {
                th = th2;
                1MG.A00(c9Me.A00, r311, (Object) null);
                throw th;
            }
        } catch (Throwable th3) {
            r316.D5h((Object) null);
            throw th3;
        }
    }
}
