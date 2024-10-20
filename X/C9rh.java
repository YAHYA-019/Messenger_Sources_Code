package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation;
import com.facebook.user.model.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9rh, reason: invalid class name */
/* loaded from: 9rh.class */
public final class C9rh implements Aae {
    public AdvancedCryptoSharedFilesTabContentImplementation A00;
    public AdvancedCryptoSharedLinksTabContentImplementation A01;
    public AdvancedCryptoSharedMediaTabContentImplementation A02;
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
    public final 9Ah A0F;
    public final User A0G;
    public final List A0H;

    public C9rh(Context context, View view, 06Z r304, 2O4 r305, FbUserSession fbUserSession, 1Iw r307, ThreadKey threadKey, 9XU r309, 9Ah r310, User user, List list) {
        this.A06 = context;
        this.A0B = r307;
        this.A0H = list;
        this.A0E = r309;
        this.A0C = threadKey;
        this.A0G = user;
        this.A09 = r305;
        this.A08 = r304;
        this.A0F = r310;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9rh.A00():boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9rh.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7 A[Catch: Exception -> 0x0151, all -> 0x0161, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0151, blocks: (B:5:0x0048, B:6:0x004d, B:9:0x0059, B:12:0x0063, B:15:0x00c7, B:17:0x012d, B:19:0x00cf, B:20:0x00d5, B:21:0x00db, B:22:0x00e1, B:23:0x00e7, B:24:0x00ed, B:25:0x00f3, B:26:0x00f9, B:27:0x00ff, B:28:0x0105, B:30:0x011c, B:31:0x0122, B:32:0x0127, B:32:0x0127, B:34:0x006d, B:39:0x00b3, B:39:0x00b3, B:41:0x00b8, B:42:0x007e, B:44:0x008f, B:52:0x00ae, B:55:0x013c, B:57:0x0149, B:59:0x0150), top: B:4:0x0048, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: Exception -> 0x0151, all -> 0x0161, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0151, blocks: (B:5:0x0048, B:6:0x004d, B:9:0x0059, B:12:0x0063, B:15:0x00c7, B:17:0x012d, B:19:0x00cf, B:20:0x00d5, B:21:0x00db, B:22:0x00e1, B:23:0x00e7, B:24:0x00ed, B:25:0x00f3, B:26:0x00f9, B:27:0x00ff, B:28:0x0105, B:30:0x011c, B:31:0x0122, B:32:0x0127, B:32:0x0127, B:34:0x006d, B:39:0x00b3, B:39:0x00b3, B:41:0x00b8, B:42:0x007e, B:44:0x008f, B:52:0x00ae, B:55:0x013c, B:57:0x0149, B:59:0x0150), top: B:4:0x0048, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rh.A02():boolean");
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
    /* JADX WARN: Failed to calculate best type for var: r320v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r320v0 ??
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
    /* JADX WARN: Not initialized variable reg: 318, insn: 0x0f02: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r318 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:653:0x0f02 */
    /* JADX WARN: Not initialized variable reg: 320, insn: 0x0eec: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r320 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:652:0x0ee4 */
    @Override // X.Aae
    public X.1LI AKY(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 3918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9rh.AKY(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.1LI");
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
            if (str.equals("ARMADILLO_MEDIA") && A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.SharedcontentAdvancedcryptomediaKillSwitch", "getTabTitleRes");
                i = 2131965886;
            } else if (str.equals("ARMADILLO_LINKS") && A01()) {
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.SharedcontentAdvancedcryptolinksKillSwitch", "getTabTitleRes");
                i = 2131965883;
            } else {
                if (!str.equals("ARMADILLO_FILES") || !A00()) {
                    r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "getTabTitleRes", andIncrement2);
                    return 0;
                }
                andIncrement = atomicInteger.getAndIncrement();
                str2 = "messaging.sharedcontent.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.SharedcontentAdvancedcryptofilesKillSwitch", "getTabTitleRes");
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
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
        boolean z = false;
        Exception e = null;
        try {
            if (str.equals("ARMADILLO_MEDIA") && A02()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.SharedcontentAdvancedcryptomediaKillSwitch", "isScrolledToTop");
                try {
                    try {
                        RecyclerView A02 = this.A02.A0N.A02();
                        z = !(A02 != null ? A02.canScrollVertically(-1) : false);
                        r0.A09("messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "isScrolledToTop", andIncrement);
            throw th2;
        }
    }

    @Override // X.Aae
    public void BYp(String str) {
        int andIncrement;
        String str2;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement2);
        Exception e = null;
        try {
            try {
                try {
                    if (!str.equals("ARMADILLO_MEDIA") || !A02()) {
                        if (str.equals("ARMADILLO_LINKS") && A01()) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str2 = "messaging.sharedcontent.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation";
                            r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.SharedcontentAdvancedcryptolinksKillSwitch", "loadMore");
                            this.A01.A02();
                        }
                        r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement2);
                    }
                    andIncrement = atomicInteger.getAndIncrement();
                    str2 = "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", str2, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.SharedcontentAdvancedcryptomediaKillSwitch", "loadMore");
                    this.A02.A04();
                    r0.A09(str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement);
                    r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement2);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04(e, str2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "loadMore", andIncrement2);
            throw th2;
        }
    }

    @Override // X.Aae
    public void Cy1(String str, boolean z) {
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement);
        r0.A06("messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "shouldMakeMediaViewReadOnly", andIncrement);
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
                    str = "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", i, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.SharedcontentAdvancedcryptomediaKillSwitch", "subscribe");
                    try {
                        AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation = this.A02;
                        advancedCryptoSharedMediaTabContentImplementation.A0S.A06(AdvancedCryptoSharedMediaTabContentImplementation.A0e);
                        if (!7zQ.A1a(advancedCryptoSharedMediaTabContentImplementation.A0Y)) {
                            AdvancedCryptoSharedMediaTabContentImplementation.A00(lifecycleOwner, advancedCryptoSharedMediaTabContentImplementation);
                        }
                        LiveData A04 = advancedCryptoSharedMediaTabContentImplementation.A0O.A04();
                        A04.observe(lifecycleOwner, new C9qp(5, lifecycleOwner, A04, advancedCryptoSharedMediaTabContentImplementation));
                        C9qq.A01(lifecycleOwner, advancedCryptoSharedMediaTabContentImplementation.A00.A00, advancedCryptoSharedMediaTabContentImplementation, 93);
                        r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", "messaging.sharedcontent.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement2, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.SharedcontentAdvancedcryptolinksKillSwitch", "subscribe");
                    AdvancedCryptoSharedLinksTabContentImplementation advancedCryptoSharedLinksTabContentImplementation = this.A01;
                    advancedCryptoSharedLinksTabContentImplementation.A0I.A06(AdvancedCryptoSharedLinksTabContentImplementation.A0L);
                    LiveData A042 = advancedCryptoSharedLinksTabContentImplementation.A0F.A04();
                    A042.observe(lifecycleOwner, new C9qp(4, lifecycleOwner, A042, advancedCryptoSharedLinksTabContentImplementation));
                    r0.A09("messaging.sharedcontent.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "subscribe", andIncrement2);
                }
                if (A00()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.sharedcontent.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation";
                    r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", i, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.SharedcontentAdvancedcryptofilesKillSwitch", "subscribe");
                    AdvancedCryptoSharedFilesTabContentImplementation advancedCryptoSharedFilesTabContentImplementation = this.A00;
                    advancedCryptoSharedFilesTabContentImplementation.A0E.A06(AdvancedCryptoSharedFilesTabContentImplementation.A0H);
                    LiveData A043 = advancedCryptoSharedFilesTabContentImplementation.A0B.A04();
                    A043.observe(lifecycleOwner, new C9qp(3, lifecycleOwner, A043, advancedCryptoSharedFilesTabContentImplementation));
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
                str = "messaging.sharedcontent.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.SharedcontentAdvancedcryptomediaKillSwitch", "unsubscribe");
                try {
                    try {
                        AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation = this.A02;
                        advancedCryptoSharedMediaTabContentImplementation.A00.A00();
                        advancedCryptoSharedMediaTabContentImplementation.A0O.A07();
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
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.sharedcontent.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation";
                r0.A0A("com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation", str, "com.facebook.messaging.sharedcontent.plugins.interfaces.tabcontent.SharedContentTabContentInterfaceSpec", andIncrement, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.SharedcontentAdvancedcryptolinksKillSwitch", "unsubscribe");
                this.A01.A0F.A07();
                r0.A09(str, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement);
            }
            r0.A02((Exception) null, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharedcontent.tabcontent.SharedContentTabContentInterfaceSpec", "unsubscribe", andIncrement2);
            throw th2;
        }
    }
}
