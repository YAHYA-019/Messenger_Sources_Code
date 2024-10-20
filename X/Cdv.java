package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation;
import com.facebook.messaging.communitymessaging.plugins.reporting.reportcommunitysettingsrow.ReportCommunitySettingsRowImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdv.class */
public final class Cdv implements DIM {
    public LeaveCommunityRowImplementation A01;
    public ReportCommunitySettingsRowImplementation A02;
    public Object A03;
    public Object A04;
    public String[] A05;
    public final Context A06;
    public final 06Z A07;
    public final FbUserSession A08;
    public final ThreadKey A09;
    public final ThreadSummary A0A;
    public final DJX A0C;
    public final DHb A0D;
    public final DHc A0E;
    public final DHd A0F;
    public final MigColorScheme A0G;
    public final User A0H;
    public final Capabilities A0I;
    public final 2Sh A0J;
    public final C1783AsH A0K;
    public final ImmutableList A0L;
    public int A00 = -1;
    public final 1YC A0B = 1YC.A03;

    public Cdv(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A06 = context;
        this.A08 = fbUserSession;
        this.A09 = threadKey;
        this.A0I = capabilities;
        this.A0A = threadSummary;
        this.A0J = r314;
        this.A0K = c1783AsH;
        this.A07 = r303;
        this.A0H = user;
        this.A0L = immutableList;
        this.A0E = dHc;
        this.A0D = dHb;
        this.A0F = dHd;
        this.A0C = djx;
        this.A0G = migColorScheme;
    }

    private boolean A00() {
        Object obj;
        if (this.A03 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0B;
            String A0y = AbM.A0y(r0, "com.facebook.messaging.communitymessaging.plugins.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", "messaging.communitymessaging.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BYm.A00(r0, atomicInteger)) {
                        Context context = this.A06;
                        ThreadSummary threadSummary = this.A0A;
                        2Sh r02 = this.A0J;
                        11T.A0F(r02, 2);
                        Community community = (Community) r02.A01((String) null, Community.class);
                        Community community2 = (Community) r02.A01((String) null, Community.class);
                        boolean A1W = community2 != null ? AnonymousClass001.A1W(community2.A0K, C20E.A03) : false;
                        if ((threadSummary != null ? threadSummary.A0g : null) == 1F9.A0B && community != null) {
                            if (AbH.A1Y(7zU.A07(community), 7zQ.A0C(community)) && !A1W) {
                                this.A01 = new LeaveCommunityRowImplementation(context, this.A08, threadSummary, this.A0E, this.A0G, r02);
                                obj = C1Y6.A02;
                                this.A03 = obj;
                                r0.A07("messaging.communitymessaging.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                            }
                        }
                    }
                    obj = C1Y6.A03;
                    this.A03 = obj;
                    r0.A07("messaging.communitymessaging.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", A0y, andIncrement, 1BL.A1U(this.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.communityinfo.leavecommunityrow.LeaveCommunityRowImplementation", A0y, andIncrement, 1BL.A1U(this.A03));
                throw th;
            }
        }
        return 1BK.A1U(this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00af A[Catch: Exception -> 0x014d, all -> 0x0159, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x014d, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x00af, B:17:0x00b5, B:19:0x00c2, B:21:0x00cb, B:24:0x00d5, B:25:0x00d9, B:27:0x00e0, B:30:0x00ec, B:32:0x00f6, B:35:0x0104, B:36:0x0109, B:37:0x010f, B:39:0x0119, B:40:0x011f, B:41:0x0123, B:41:0x0123, B:44:0x012f, B:46:0x012a, B:47:0x0061, B:52:0x00a0, B:52:0x00a0, B:54:0x00a4, B:55:0x0070, B:57:0x0080, B:65:0x009b, B:68:0x013b, B:70:0x0145, B:72:0x014c), top: B:5:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdv.A01():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v8 */
    /* JADX WARN: Type inference failed for: r303v9 */
    public String[] Ayr() {
        String[] strArr = this.A05;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A00()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                this.A00 = z ? 1 : 0;
                i2 = z;
            }
            boolean z2 = false;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "report_community";
                z2 = true;
            }
            if (A00()) {
                strArr[z2 ? 1 : 0] = "leave_community_row";
            }
            this.A05 = strArr;
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
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x03bc: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:184:0x03ac */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x03c4: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:184:0x03ac */
    public X.DG9 B8K(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdv.B8K(java.lang.String):X.DG9");
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A0B, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A0B, 1BK.A00());
    }
}
