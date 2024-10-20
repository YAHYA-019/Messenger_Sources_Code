package X;

import android.content.Context;
import com.facebook.messaging.nativepagereply.plugins.accountswitchhalfsheet.businessinboxprofileshortcut.BusinessInboxProfileShortcutHandlerImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Fa, reason: invalid class name */
/* loaded from: 4Fa.class */
public final class C4Fa implements C4Fb {
    public BusinessInboxProfileShortcutHandlerImplementation A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Context A05;
    public final 1YC A06 = 1YC.A03;

    public C4Fa(Context context) {
        this.A05 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1 A[Catch: Exception -> 0x0144, all -> 0x0152, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0144, blocks: (B:5:0x0047, B:6:0x004c, B:9:0x0058, B:12:0x0060, B:15:0x00ea, B:17:0x0123, B:19:0x00f1, B:21:0x00fc, B:22:0x0102, B:23:0x0107, B:26:0x0112, B:29:0x011e, B:30:0x0069, B:35:0x00d8, B:35:0x00d8, B:37:0x00dc, B:38:0x0078, B:40:0x0089, B:55:0x00d3, B:63:0x0131, B:65:0x013c, B:67:0x0143), top: B:4:0x0047, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fa.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: Exception -> 0x00aa, all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00aa, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0073, B:17:0x00a2, B:23:0x007b, B:24:0x0081, B:27:0x008d, B:29:0x0092, B:30:0x0098, B:31:0x009c, B:31:0x009c, B:34:0x0064), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fa.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fa.A02():boolean");
    }

    private boolean A03() {
        boolean A00;
        boolean z = true;
        if (this.A04 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A06;
            r0.A0B("com.facebook.messaging.navigation.home.tabs.plugins.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "com.facebook.messaging.navigation.home.tabs.plugins.interfaces.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "com.facebook.messaging.navigation.home.tabs.plugins.core.NavigationHomeTabsCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (C4Sj.A00 == i) {
                        Boolean bool = C4Sj.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            Object obj = (A00 || !AnonymousClass001.A1V(1Bi.A03(83598))) ? C1Y6.A03 : C1Y6.A02;
                            this.A04 = obj;
                            r0.A07("messaging.navigation.home.tabs.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = C4Sj.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    this.A04 = obj;
                    r0.A07("messaging.navigation.home.tabs.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.navigation.home.tabs.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.navigation.home.tabs.core.internalprofileshortcut.InternalProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        if (this.A04 == C1Y6.A03) {
            z = false;
        }
        return z;
    }

    @Override // X.C4Fb
    public void ANm(06Z r302) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.navigation.home.tabs.plugins.interfaces.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement);
        try {
            if (!A01()) {
                r0.A02((Exception) null, "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement);
                return;
            }
            int andIncrement2 = atomicInteger.getAndIncrement();
            try {
                r0.A0A("com.facebook.messaging.nativepagereply.plugins.accountswitchhalfsheet.businessinboxprofileshortcut.BusinessInboxProfileShortcutHandlerImplementation", "messaging.nativepagereply.accountswitchhalfsheet.businessinboxprofileshortcut.BusinessInboxProfileShortcutHandlerImplementation", "com.facebook.messaging.navigation.home.tabs.plugins.interfaces.profileshortcut.ProfileShortcutHandlerInterfaceSpec", andIncrement2, "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.accountswitchhalfsheet.BusinessInboxAccountSwitchHalfSheetKillSwitch", "dismissWhenHandleExternalIntent");
                try {
                    BusinessInboxProfileShortcutHandlerImplementation.A00(r302);
                    r0.A04((Exception) null, "messaging.nativepagereply.accountswitchhalfsheet.businessinboxprofileshortcut.BusinessInboxProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement2);
                    r0.A02((Exception) null, "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.nativepagereply.accountswitchhalfsheet.businessinboxprofileshortcut.BusinessInboxProfileShortcutHandlerImplementation", "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement2);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.navigation.home.tabs.profileshortcut.ProfileShortcutHandlerInterfaceSpec", "dismissWhenHandleExternalIntent", andIncrement);
            throw th2;
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
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0193: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:64:0x0193 */
    /* JADX WARN: Not initialized variable reg: 317, insn: 0x018d: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r317 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:63:0x0189 */
    @Override // X.C4Fb
    public boolean BLy(android.content.Context r302, X.06Z r303) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fa.BLy(android.content.Context, X.06Z):boolean");
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
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0199: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:69:0x0199 */
    /* JADX WARN: Not initialized variable reg: 317, insn: 0x0193: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r317 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:68:0x018f */
    @Override // X.C4Fb
    public boolean BMS(android.content.Context r302, X.06Z r303) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Fa.BMS(android.content.Context, X.06Z):boolean");
    }
}
