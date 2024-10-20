package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.1eY, reason: invalid class name */
/* loaded from: 1eY.class */
public final class C1eY {
    public Context A00;
    public final C1dr A01;

    public C1eY(Context context, C1dr c1dr) {
        this.A01 = c1dr;
        final Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        final C1eT c1eT = c1dr.A0H;
        if (c1eT.A09 || !((2yD) c1eT.A04.A00.A00.get()).AZk(36317225547738152L)) {
            return;
        }
        c1eT.A03.A00().postDelayed(new Runnable() { // from class: X.1f1
            public static final String __redex_internal_original_name = "MobileBoostInitializer$$ExternalSyntheticLambda0";

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
            
                if (r308.isEmpty() == false) goto L16;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String A00(java.lang.Exception r301, org.json.JSONObject r302) {
                /*
                    java.lang.String r0 = "optimization"
                    r303 = r0
                    r0 = r302
                    r1 = r303
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    r304 = r0
                    r0 = r304
                    if (r0 == 0) goto L5f
                    java.lang.String r0 = "type"
                    r305 = r0
                    r0 = r304
                    r1 = r305
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L5f
                    r0 = r304
                    r1 = r305
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    r303 = r0
                    r0 = r303
                    java.util.Iterator r0 = r0.keys()
                    r306 = r0
                L29:
                    r0 = r306
                    boolean r0 = r0.hasNext()
                    r307 = r0
                    r0 = r307
                    if (r0 == 0) goto L5f
                    r0 = r306
                    java.lang.String r0 = X.AnonymousClass001.A0i(r0)
                    r308 = r0
                    r0 = r304
                    r1 = r305
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    r1 = r308
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L29
                    r0 = r308
                    if (r0 == 0) goto L5f
                    r0 = r308
                    boolean r0 = r0.isEmpty()
                    r307 = r0
                    r0 = r307
                    if (r0 == 0) goto L63
                L5f:
                    java.lang.String r0 = "Unknown Optimization"
                    r308 = r0
                L63:
                    java.lang.String r0 = ": "
                    r306 = r0
                    r0 = r301
                    java.lang.String r0 = r0.getMessage()
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L7e
                    r0 = r301
                    java.lang.String r0 = r0.getMessage()
                    r303 = r0
                L75:
                    r0 = r308
                    r1 = r306
                    r2 = r303
                    java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
                    return r0
                L7e:
                    java.lang.String r0 = " Unknown format"
                    r303 = r0
                    goto L75
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1f1.A00(java.lang.Exception, org.json.JSONObject):java.lang.String");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v7 ??, still in use, count: 2, list:
                  (r308v7 ??) from 0x0128: PHI (r308v6 ??) = (r308v5 ??), (r308v7 ??) binds: [B:48:0x0115, B:53:0x0125] A[DONT_GENERATE, DONT_INLINE]
                  (r308v7 ?? I:X.1f7) from 0x0125: SPUT (r308v7 ?? I:X.1f7) A[Catch: all -> 0x17e9] X.1f7.A01 X.1f7
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
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 6370
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1f1.run():void");
            }
        }, 0L);
    }

    public void A00(int i, int i2) {
        C1e9 A05 = this.A01.A05(i);
        for (C1fq c1fq : A05.A06) {
            Set set = c1fq.A02;
            if (set == null || !set.contains(Integer.valueOf(i2))) {
                1fB A00 = C1e9.A00(A05, c1fq);
                try {
                    if (A00.A06(false)) {
                        A05.A04.A00(A00, A05.A01, i2, false);
                    }
                } catch (Error | Exception e) {
                    C1e5 c1e5 = A05.A05;
                    c1e5.A03(A00, e);
                    c1e5.A02(A00);
                }
            }
        }
    }
}
