package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.customthreads.plugins.core.nicknames.threadsettingsrow.ThreadSettingsNicknamesRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce3.class */
public final class Ce3 implements DIM {
    public BWi A01;
    public Bx2 A02;
    public ThreadSettingsNicknamesRow A03;
    public C1v5 A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public String[] A08;
    public final Context A09;
    public final 06Z A0A;
    public final FbUserSession A0B;
    public final ThreadKey A0C;
    public final ThreadSummary A0D;
    public final DJX A0F;
    public final DHb A0G;
    public final DHc A0H;
    public final DHd A0I;
    public final MigColorScheme A0J;
    public final User A0K;
    public final Capabilities A0L;
    public final 2Sh A0M;
    public final C1783AsH A0N;
    public final ImmutableList A0O;
    public int A00 = -1;
    public final 1YC A0E = 1YC.A03;

    public Ce3(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A09 = context;
        this.A0B = fbUserSession;
        this.A0C = threadKey;
        this.A0L = capabilities;
        this.A0D = threadSummary;
        this.A0M = r314;
        this.A0N = c1783AsH;
        this.A0A = r303;
        this.A0K = user;
        this.A0O = immutableList;
        this.A0H = dHc;
        this.A0G = dHb;
        this.A0I = dHd;
        this.A0F = djx;
        this.A0J = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A07) {
                if (this.A09 == null) {
                    throw AbG.A13();
                }
                this.A04 = C1v5.A01;
                this.A07 = true;
            }
        }
    }

    private boolean A01() {
        boolean A1M;
        if (this.A05 == null) {
            A00();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0E;
            r0.A0B("com.facebook.messaging.customthreads.plugins.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "messaging.customthreads.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.customthreads.plugins.core.CustomthreadsCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A04;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.customthreads.plugins.core.CustomthreadsCoreKillSwitch");
                        if (A00 != null) {
                            A1M = A00.booleanValue();
                            Object obj = (A1M || !AbK.A1a(this.A0L)) ? C1Y6.A03 : C1Y6.A02;
                            this.A05 = obj;
                            r0.A07("messaging.customthreads.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A1M = AbL.A1M(r0, atomicInteger);
                    if (A1M) {
                    }
                    this.A05 = obj;
                    r0.A07("messaging.customthreads.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A05 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.customthreads.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A05));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.customthreads.core.hotlike.threadsettingsrow.ThreadSettingsEmojiRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A05));
                throw th;
            }
        }
        return 1BK.A1U(this.A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: Exception -> 0x00a9, all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a9, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0069, B:16:0x006e, B:18:0x0076, B:21:0x0081, B:22:0x0086, B:24:0x008c, B:25:0x0092, B:26:0x0096, B:26:0x0096, B:29:0x00a2, B:32:0x009d, B:34:0x005e), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce3.A02():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v8 */
    /* JADX WARN: Type inference failed for: r303v9 */
    public String[] Ayr() {
        String[] strArr = this.A08;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A02 = A02();
                boolean z = A02;
                if (A01()) {
                    z = (A02 ? 1 : 0) + 1;
                }
                this.A00 = z ? 1 : 0;
                i2 = z;
            }
            boolean z2 = false;
            strArr = new String[i2];
            if (A02()) {
                strArr[0] = "nicknames_row";
                z2 = true;
            }
            if (A01()) {
                strArr[z2 ? 1 : 0] = "change_emoji_row";
            }
            this.A08 = strArr;
        }
        return strArr;
    }

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
    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
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
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x016f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:69:0x016f */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x0169: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:68:0x0165 */
    public X.DG9 B8K(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce3.B8K(java.lang.String):X.DG9");
    }

    public ImmutableList B8Q(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0E;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            throw th;
        }
    }

    public AtG BLB(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0E;
        String A19 = AbF.A19(r0, A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            throw th;
        }
    }
}
