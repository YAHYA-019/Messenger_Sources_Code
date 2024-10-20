package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation;
import com.facebook.user.model.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9ri, reason: invalid class name */
/* loaded from: 9ri.class */
public final class C9ri implements Aae {
    public SharedFilesTabContentImplementation A00;
    public SharedLinksTabContentImplementation A01;
    public SharedMediaTabContentImplementation A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Context A06;
    public final View A07;
    public final 06Z A08;
    public final 2O4 A09;
    public final FbUserSession A0A;
    public final 1Iw A0B;
    public final ThreadKey A0C;
    public final 1YC A0D = 1YC.A03;
    public final 9XU A0E;
    public final C95o A0F;
    public final 9Ah A0G;
    public final User A0H;
    public final List A0I;

    public C9ri(Context context, View view, 06Z r304, 2O4 r305, FbUserSession fbUserSession, 1Iw r307, ThreadKey threadKey, 9XU r309, C95o c95o, 9Ah r311, User user, List list) {
        this.A06 = context;
        this.A0B = r307;
        this.A0I = list;
        this.A0E = r309;
        this.A0C = threadKey;
        this.A0H = user;
        this.A09 = r305;
        this.A08 = r304;
        this.A0G = r311;
        this.A0F = c95o;
        this.A0A = fbUserSession;
        this.A07 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: Exception -> 0x0170, all -> 0x0180, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0170, blocks: (B:5:0x0048, B:6:0x004d, B:9:0x0059, B:12:0x0063, B:15:0x00c7, B:17:0x014c, B:19:0x00cf, B:21:0x00dd, B:22:0x00e1, B:22:0x00e1, B:25:0x00e8, B:28:0x00f6, B:29:0x00fc, B:30:0x0102, B:31:0x0108, B:32:0x010e, B:33:0x0114, B:34:0x011a, B:35:0x0120, B:36:0x0126, B:38:0x013b, B:39:0x0141, B:40:0x0146, B:40:0x0146, B:42:0x006d, B:47:0x00b3, B:47:0x00b3, B:49:0x00b8, B:50:0x007e, B:52:0x008f, B:60:0x00ae, B:63:0x015b, B:65:0x0168, B:67:0x016f), top: B:4:0x0048, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ri.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: Exception -> 0x0155, all -> 0x0163, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0155, blocks: (B:5:0x0047, B:6:0x004c, B:9:0x0058, B:12:0x0060, B:15:0x00bc, B:17:0x0134, B:19:0x00c3, B:21:0x00d0, B:22:0x00d4, B:22:0x00d4, B:25:0x00da, B:28:0x00e7, B:29:0x00ed, B:30:0x00f3, B:31:0x00f9, B:32:0x00ff, B:33:0x0105, B:34:0x010b, B:35:0x0111, B:37:0x0124, B:38:0x012a, B:39:0x012f, B:39:0x012f, B:41:0x0069, B:46:0x00aa, B:46:0x00aa, B:48:0x00ae, B:49:0x0078, B:51:0x0089, B:59:0x00a5, B:62:0x0142, B:64:0x014d, B:66:0x0154), top: B:4:0x0047, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ri.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf A[Catch: Exception -> 0x019f, all -> 0x01ad, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019f, blocks: (B:6:0x0053, B:7:0x0058, B:10:0x0064, B:13:0x006c, B:16:0x00c8, B:18:0x017e, B:20:0x00cf, B:22:0x00dc, B:23:0x00e0, B:23:0x00e0, B:26:0x00e6, B:29:0x00f3, B:31:0x00fb, B:32:0x0101, B:33:0x0107, B:34:0x010d, B:35:0x0113, B:36:0x0119, B:37:0x011f, B:38:0x0125, B:39:0x012b, B:40:0x0131, B:42:0x016f, B:43:0x0175, B:44:0x0179, B:44:0x0179, B:46:0x0075, B:51:0x00b6, B:51:0x00b6, B:53:0x00ba, B:54:0x0084, B:56:0x0095, B:64:0x00b1, B:67:0x018c, B:69:0x0197, B:71:0x019e), top: B:5:0x0053, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ri.A02():boolean");
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
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r318v0 ??
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
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x0c17: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:550:0x0c17 */
    /* JADX WARN: Not initialized variable reg: 318, insn: 0x0c02: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:549:0x0bfa */
    @Override // X.Aae
    public X.1LI AKY(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 3147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ri.AKY(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.1LI");
    }

    @Override // X.Aae
    public int BED(String str) {
        int andIncrement;
        String str2;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement2);
        try {
            if (str.equals("MEDIA") && A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.media.SharedcontentMediaKillSwitch", "getTabTitleRes");
                i = 2131965886;
            } else if (str.equals("LINKS") && A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.links.SharedcontentLinksKillSwitch", "getTabTitleRes");
                i = 2131965883;
            } else {
                if (!str.equals("FILES") || !A00()) {
                    r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement2);
                    return 0;
                }
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.files.tabcontent.SharedFilesTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.files.SharedcontentFilesKillSwitch", "getTabTitleRes");
                i = 2131965882;
            }
            r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement);
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement2);
            return i;
        } catch (Throwable th) {
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement2);
            throw th;
        }
    }

    @Override // X.Aae
    public boolean BVs(String str) {
        int andIncrement;
        String str2;
        boolean canScrollVertically;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
        try {
            try {
                try {
                    if (str.equals("MEDIA") && A02()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation";
                        r0.A0A("com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.media.SharedcontentMediaKillSwitch", "isScrolledToTop");
                        RecyclerView A02 = this.A02.A0C.A02();
                        if (A02 != null) {
                            canScrollVertically = A02.canScrollVertically(-1);
                            boolean z = !canScrollVertically;
                            r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                            return z;
                        }
                        canScrollVertically = false;
                        boolean z2 = !canScrollVertically;
                        r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                        r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                        return z2;
                    }
                    if (str.equals("LINKS") && A01()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation";
                        r0.A0A("com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.links.SharedcontentLinksKillSwitch", "isScrolledToTop");
                        RecyclerView A022 = this.A01.A07.A02();
                        if (A022 != null) {
                            canScrollVertically = A022.canScrollVertically(-1);
                            boolean z22 = !canScrollVertically;
                            r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                            return z22;
                        }
                        canScrollVertically = false;
                        boolean z222 = !canScrollVertically;
                        r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                        r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                        return z222;
                    }
                    if (!str.equals("FILES") || !A00()) {
                        r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                        return false;
                    }
                    andIncrement = atomicInteger.getAndIncrement();
                    str2 = "messaging.sharedcontent.files.tabcontent.SharedFilesTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.files.SharedcontentFilesKillSwitch", "isScrolledToTop");
                    RecyclerView A023 = this.A00.A09.A02();
                    if (A023 != null) {
                        canScrollVertically = A023.canScrollVertically(-1);
                        boolean z2222 = !canScrollVertically;
                        r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                        r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                        return z2222;
                    }
                    canScrollVertically = false;
                    boolean z22222 = !canScrollVertically;
                    r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
                    r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                    return z22222;
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                r0.A04((Exception) null, str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
            }
        } catch (Throwable th) {
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
            throw th;
        }
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
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x020b: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:109:0x020b */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x0205: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:108:0x0201 */
    @Override // X.Aae
    public void BYp(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ri.BYp(java.lang.String):void");
    }

    @Override // X.Aae
    public void Cy1(String str, boolean z) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement);
        Exception e = null;
        try {
            if (str.equals("MEDIA") && A02()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation", "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation", "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.media.SharedcontentMediaKillSwitch", "shouldMakeMediaViewReadOnly");
                try {
                    try {
                        this.A02.A02 = z;
                        r0.A09("messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement);
            throw th2;
        }
    }

    @Override // X.Aae
    public void D3J(LifecycleOwner lifecycleOwner) {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", andIncrement);
        try {
            try {
                if (A02()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", i, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.media.SharedcontentMediaKillSwitch", "subscribe");
                    try {
                        SharedMediaTabContentImplementation sharedMediaTabContentImplementation = this.A02;
                        sharedMediaTabContentImplementation.A0I.A06(SharedMediaTabContentImplementation.A0M);
                        sharedMediaTabContentImplementation.A0D.A02.observe(lifecycleOwner, new C9qn(lifecycleOwner, sharedMediaTabContentImplementation, 20));
                        C9qq.A01(lifecycleOwner, sharedMediaTabContentImplementation.A00.A00, sharedMediaTabContentImplementation, 98);
                        r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation", "messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation", "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.links.SharedcontentLinksKillSwitch", "subscribe");
                    SharedLinksTabContentImplementation sharedLinksTabContentImplementation = this.A01;
                    sharedLinksTabContentImplementation.A0B.A06(SharedLinksTabContentImplementation.A0E);
                    ExL exL = sharedLinksTabContentImplementation.A08;
                    exL.A01.observe(lifecycleOwner, new C9qn(lifecycleOwner, sharedLinksTabContentImplementation, 19));
                    C9qq.A01(lifecycleOwner, exL.A02, sharedLinksTabContentImplementation, 96);
                    r0.A09("messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", andIncrement2);
                }
                if (A00()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.sharedcontent.files.tabcontent.SharedFilesTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", i, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.files.SharedcontentFilesKillSwitch", "subscribe");
                    SharedFilesTabContentImplementation sharedFilesTabContentImplementation = this.A00;
                    sharedFilesTabContentImplementation.A0D.A06(SharedFilesTabContentImplementation.A0G);
                    sharedFilesTabContentImplementation.A0A.A02.observe(lifecycleOwner, new C9qn(lifecycleOwner, sharedFilesTabContentImplementation, 18));
                    r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", i);
                }
                r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", andIncrement);
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", andIncrement);
            throw th2;
        }
    }

    @Override // X.Aae
    public void D6F() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement2);
        Exception e = null;
        try {
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.sharedcontent.media.tabcontent.SharedMediaTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.media.SharedcontentMediaKillSwitch", "unsubscribe");
                try {
                    try {
                        SharedMediaTabContentImplementation sharedMediaTabContentImplementation = this.A02;
                        sharedMediaTabContentImplementation.A0D.A00();
                        sharedMediaTabContentImplementation.A00.A00();
                        r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement);
                    throw th;
                }
            }
            if (A01()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation", "messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation", "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement3, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.links.SharedcontentLinksKillSwitch", "unsubscribe");
                this.A01.A08.A00();
                r0.A09("messaging.sharedcontent.links.tabcontent.SharedLinksTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement3);
            }
            if (A00()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.sharedcontent.files.tabcontent.SharedFilesTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.files.SharedcontentFilesKillSwitch", "unsubscribe");
                this.A00.A0A.A00();
                r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement);
            }
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement2);
            throw th2;
        }
    }
}
