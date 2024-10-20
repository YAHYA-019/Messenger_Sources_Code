package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.concurrent.Future;

/* renamed from: X.1vn, reason: invalid class name */
/* loaded from: 1vn.class */
public final class C1vn {
    public Future A00;
    public boolean A01;
    public 1BY A02;
    public final C1vs A03;
    public final C00i A04;
    public final C00i A05 = new 1BV((1BY) null, 16452);
    public final Runnable A06;
    public final C00i A07;

    public C1vn(C1vk c1vk, 1BO r303) {
        1BV r0 = new 1BV((1BY) null, 319);
        this.A07 = r0;
        this.A04 = new 1BQ(16511);
        this.A06 = new Runnable() { // from class: X.1vq
            public static final String __redex_internal_original_name = "RageShakeAsyncSensorRegistration$1";
            public boolean A00;

            /*  JADX ERROR: Types fix failed
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                */
            /* JADX WARN: Not initialized variable reg: 306, insn: 0x021b: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r306 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:139:0x021b */
            /* JADX WARN: Not initialized variable reg: 308, insn: 0x01f7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:135:0x01f7 */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 587
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1vq.run():void");
            }
        };
        this.A02 = new 1BY(r303);
        C1F6 c1f6 = (C1F6) r0.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            C1vs c1vs = new C1vs(c1vk, c1f6);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = c1vs;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
