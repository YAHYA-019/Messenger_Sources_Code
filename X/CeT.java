package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.plugins.core.threadsettings.aipagecustomcommand.row.ThreadSettingsAiPageCustomCommandRow;
import com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pagectas.MessengerThreadSettingsPageCtaRows;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.notificationmessages.plugins.threadsettingrow.edittopic.ThreadSettingEditTopicsRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: CeT.class */
public final class CeT implements DIM {
    public 6Su A01;
    public 7EN A02;
    public ThreadSettingsAiPageCustomCommandRow A03;
    public MessengerThreadSettingsPageCtaRows A04;
    public ThreadSettingEditTopicsRow A05;
    public ThreadSettingsNotificationsRow A06;
    public C1v5 A07;
    public ThreadSettingsFeedbackAndReportingRow A08;
    public ThreadSettingsBlockUserRow A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public Object A0F;
    public Object A0G;
    public Object A0H;
    public Object A0I;
    public boolean A0J;
    public String[] A0K;
    public final Context A0L;
    public final 06Z A0M;
    public final FbUserSession A0N;
    public final ThreadKey A0O;
    public final ThreadSummary A0P;
    public final DJX A0R;
    public final DHb A0S;
    public final DHc A0T;
    public final DHd A0U;
    public final MigColorScheme A0V;
    public final User A0W;
    public final Capabilities A0X;
    public final 2Sh A0Y;
    public final C1783AsH A0Z;
    public final ImmutableList A0a;
    public int A00 = -1;
    public final 1YC A0Q = 1YC.A03;

    public CeT(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A0L = context;
        this.A0N = fbUserSession;
        this.A0O = threadKey;
        this.A0X = capabilities;
        this.A0P = threadSummary;
        this.A0Y = r314;
        this.A0Z = c1783AsH;
        this.A0M = r303;
        this.A0W = user;
        this.A0a = immutableList;
        this.A0T = dHc;
        this.A0S = dHb;
        this.A0U = dHd;
        this.A0R = djx;
        this.A0V = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0J) {
                if (this.A0L == null) {
                    throw AbG.A13();
                }
                this.A07 = C1v5.A01;
                this.A0J = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: Exception -> 0x00d1, all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0069, B:17:0x0074, B:19:0x007d, B:22:0x008d, B:25:0x0096, B:28:0x00a3, B:29:0x00a9, B:30:0x00ae, B:32:0x00b5, B:33:0x00ba, B:34:0x00be, B:34:0x00be, B:37:0x00ca, B:40:0x00c5, B:42:0x005e), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x00fc, all -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fc, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:17:0x009a, B:19:0x00a4, B:20:0x00a9, B:23:0x00b2, B:24:0x00b7, B:27:0x00c4, B:28:0x00ca, B:29:0x00cf, B:30:0x00d5, B:32:0x00df, B:33:0x00e5, B:34:0x00e9, B:34:0x00e9, B:37:0x00f5, B:40:0x00f0, B:41:0x005c, B:42:0x0061, B:45:0x006d, B:48:0x0075, B:50:0x0081), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[Catch: Exception -> 0x0105, all -> 0x0111, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0105, blocks: (B:5:0x0040, B:9:0x004a, B:12:0x0054, B:15:0x008e, B:17:0x009b, B:18:0x009f, B:18:0x009f, B:21:0x00a9, B:25:0x00be, B:26:0x00c3, B:29:0x00cc, B:32:0x00d7, B:33:0x00dc, B:34:0x00e2, B:36:0x00e8, B:37:0x00ee, B:38:0x00f2, B:38:0x00f2, B:41:0x00fe, B:44:0x00f9, B:45:0x005d, B:46:0x0062, B:49:0x006e, B:52:0x0076, B:54:0x0082), top: B:4:0x0040, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A03():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if ("602814669838217".equals(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        if (X.1BK.A0L(16385).AZk(36318733081654199L) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a A[Catch: Exception -> 0x0186, all -> 0x0194, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0186, blocks: (B:5:0x004c, B:9:0x0056, B:12:0x0060, B:15:0x009a, B:16:0x009f, B:17:0x00a5, B:19:0x00ae, B:21:0x00b7, B:25:0x00c7, B:27:0x00cf, B:31:0x00de, B:35:0x00f8, B:38:0x0103, B:39:0x0108, B:40:0x010d, B:44:0x0129, B:46:0x0137, B:50:0x014a, B:51:0x014f, B:54:0x0158, B:57:0x0163, B:59:0x0171, B:62:0x017f, B:64:0x011d, B:68:0x0118, B:69:0x0069, B:70:0x006e, B:73:0x007a, B:76:0x0082, B:78:0x008e), top: B:4:0x004c, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A04():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00a1, all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a1, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006f, B:17:0x009a, B:20:0x0076, B:21:0x007b, B:25:0x0089, B:28:0x0095, B:30:0x0061), top: B:4:0x0042, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A05() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A05():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[Catch: Exception -> 0x00e6, all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e6, blocks: (B:5:0x004a, B:9:0x0054, B:12:0x005e, B:15:0x0077, B:17:0x00df, B:20:0x007e, B:22:0x0089, B:23:0x008d, B:23:0x008d, B:26:0x0093, B:29:0x009e, B:30:0x00a4, B:31:0x00aa, B:32:0x00b0, B:33:0x00b6, B:34:0x00bb, B:35:0x00c0, B:37:0x00d0, B:38:0x00d5, B:39:0x00da, B:39:0x00da, B:42:0x0069), top: B:4:0x004a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A06():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x0098, all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0098, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006f, B:17:0x0091, B:20:0x0076, B:21:0x007b, B:23:0x0081, B:26:0x008c, B:28:0x0061), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A07():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x00c4, all -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c4, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006c, B:16:0x0072, B:17:0x0078, B:18:0x007e, B:19:0x0083, B:21:0x008f, B:24:0x009a, B:25:0x009f, B:27:0x00a7, B:28:0x00ad, B:29:0x00b1, B:29:0x00b1, B:32:0x00bd, B:35:0x00b8, B:37:0x0061), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A08():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x00b2, all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:5:0x0042, B:9:0x004c, B:12:0x0056, B:15:0x006c, B:16:0x0071, B:17:0x0077, B:19:0x007f, B:22:0x008a, B:23:0x008f, B:25:0x0095, B:26:0x009b, B:27:0x009f, B:27:0x009f, B:30:0x00ab, B:33:0x00a6, B:35:0x0061), top: B:4:0x0042, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A09() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.A09():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v105, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109, types: [int] */
    /* JADX WARN: Type inference failed for: r0v111, types: [int] */
    /* JADX WARN: Type inference failed for: r0v113, types: [int] */
    /* JADX WARN: Type inference failed for: r0v115, types: [int] */
    /* JADX WARN: Type inference failed for: r0v117, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v43 */
    /* JADX WARN: Type inference failed for: r303v44 */
    public String[] Ayr() {
        String[] strArr = this.A0K;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A02()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                boolean z2 = z;
                if (A07()) {
                    z2 = (z ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A06()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                boolean z4 = z3;
                if (A03()) {
                    z4 = (z3 ? 1 : 0) + 1;
                }
                boolean z5 = z4;
                if (A09()) {
                    z5 = (z4 ? 1 : 0) + 1;
                }
                boolean z6 = z5;
                if (A05()) {
                    z6 = (z5 ? 1 : 0) + 1;
                }
                boolean z7 = z6;
                if (A08()) {
                    z7 = (z6 ? 1 : 0) + 1;
                }
                boolean z8 = z7;
                if (A04()) {
                    z8 = (z7 ? 1 : 0) + 1;
                }
                this.A00 = z8 ? 1 : 0;
                i2 = z8;
            }
            int i3 = 0;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "ai_page_custom_commands";
                i3 = 1;
            }
            if (A02()) {
                strArr[i3] = "page_ctas";
                i3++;
            }
            if (A07()) {
                strArr[i3] = "search_in_conversation_row";
                i3++;
            }
            if (A06()) {
                strArr[i3] = "notification_row";
                i3++;
            }
            if (A03()) {
                strArr[i3] = "notification_edit_topics";
                i3++;
            }
            if (A09()) {
                strArr[i3] = "block_row";
                i3++;
            }
            if (A05()) {
                strArr[i3] = "page_ban_row";
                i3++;
            }
            int A02 = AbJ.A02(strArr, A08() ? 1 : 0, i3);
            if (A04()) {
                strArr[A02] = "p2b_privacy_disclosure";
            }
            this.A0K = strArr;
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
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x0473: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:206:0x0473 */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x046d: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:205:0x0461 */
    public X.DG9 B8K(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CeT.B8K(java.lang.String):X.DG9");
    }

    public ImmutableList B8Q(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0Q;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
        try {
            A00();
            ImmutableList immutableList = null;
            if (str.equals("page_ctas") && A02()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pagectas.MessengerThreadSettingsPageCtaRows", "messaging.business.ads.leadgen.messenger.threadsettingsrow.pagectas.MessengerThreadSettingsPageCtaRows", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.business.ads.leadgen.plugins.messenger.BusinessAdsLeadgenMessengerKillSwitch", "getRows");
                    try {
                        MessengerThreadSettingsPageCtaRows messengerThreadSettingsPageCtaRows = this.A04;
                        Brc brc = (Brc) messengerThreadSettingsPageCtaRows.A04.A01((String) null, Brc.class);
                        if (brc != null) {
                            ImmutableList immutableList2 = brc.A00;
                            ArrayList A0s = AnonymousClass001.A0s();
                            Iterator it = immutableList2.iterator();
                            while (it.hasNext()) {
                                CallToAction callToAction = (CallToAction) it.next();
                                CQg A00 = CQg.A00();
                                String str2 = callToAction.A0I;
                                if (str2 == null) {
                                    throw 1BK.A0h();
                                }
                                A00.A0B(str2);
                                CQg.A08(BNV.A1p, A00);
                                A00.A00 = AnonymousClass001.A0a(MessengerThreadSettingsPageCtaRows.class, AnonymousClass001.A0n(str2)).hashCode();
                                A0s.add(CQg.A05(A00, callToAction, messengerThreadSettingsPageCtaRows, 6));
                            }
                            immutableList = ImmutableList.copyOf((Collection) A0s);
                        } else {
                            immutableList = null;
                        }
                        r0.A09("messaging.business.ads.leadgen.messenger.threadsettingsrow.pagectas.MessengerThreadSettingsPageCtaRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.business.ads.leadgen.messenger.threadsettingsrow.pagectas.MessengerThreadSettingsPageCtaRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
            return immutableList;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
            throw th2;
        }
    }

    public AtG BLB(String str) {
        int andIncrement;
        String A1B;
        AtG A01;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0Q;
        String A19 = AbF.A19(r0, andIncrement2);
        Exception e = null;
        try {
            A00();
            try {
                try {
                    if (str.equals("block_row") && A09()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbJ.A13(r0, A19, andIncrement);
                        A01 = this.A09.A00();
                    } else {
                        if (!str.equals("feedback_and_report_row") || !A08()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbI.A1B(r0, A19, andIncrement);
                        A01 = this.A08.A01();
                    }
                    r0.A09(A1B, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
                    r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                    return A01;
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04(e, A1B, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
            throw th2;
        }
    }
}
