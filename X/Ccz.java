package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accessibility.plugins.setting.mesetting.AccessibilitySetting;
import com.facebook.messaging.accounttheme.plugins.settings.mesetting.BrandedChatThemesSetting;
import com.facebook.messaging.appupdatesetting.plugins.appupdateitem.appupdatesetting.AppUpdateSetting;
import com.facebook.messaging.avatar.plugins.setting.mesetting.AvatarMidPreferenceSectionSetting;
import com.facebook.messaging.avatar.plugins.setting.preference.AvatarTopPreferencesSectionSetting;
import com.facebook.messaging.composer.plugins.keyboardsettings.keyboardsettingsrow.KeyboardSettingRowImplementation;
import com.facebook.messaging.contacts.plugins.settings.mesetting.ContactsSetting;
import com.facebook.messaging.lowdatamode.plugins.settings.datasaver.DataSaverSetting;
import com.facebook.messaging.memories.plugins.settings.mesetting.MemoriesSetting;
import com.facebook.messaging.notify.plugins.settings.mesetting.NotificationsAndSoundsSetting;
import com.facebook.messaging.privacy.plugins.core.mesetting.PrivacyShortcutsSetting;
import com.facebook.messaging.professionalmode.businesstools.plugins.enablementexperience.mesettings.ProModeBusinessToolsSetting;
import com.facebook.messaging.storagemanagement.plugins.mesettings.StorageManagementSetting;
import com.facebook.payments.p2p.messenger.plugins.settings.mesettings.PaymentsMeSetting;
import com.facebook.zero.messenger.plugins.messenger.mesetting.FreeMessengerSetting;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccz.class */
public final class Ccz implements DIL {
    public AccessibilitySetting A00;
    public BrandedChatThemesSetting A01;
    public AvatarMidPreferenceSectionSetting A02;
    public C06 A03;
    public C2j5 A04;
    public 5Zt A05;
    public C7Q3 A06;
    public KeyboardSettingRowImplementation A07;
    public ContactsSetting A08;
    public DataSaverSetting A09;
    public MemoriesSetting A0A;
    public NotificationsAndSoundsSetting A0B;
    public C1v5 A0C;
    public BgU A0D;
    public ProModeBusinessToolsSetting A0E;
    public CLd A0F;
    public CLd A0G;
    public StorageManagementSetting A0H;
    public FI2 A0I;
    public PaymentsMeSetting A0J;
    public FreeMessengerSetting A0K;
    public Boolean A0L;
    public Object A0M;
    public Object A0N;
    public Object A0O;
    public Object A0P;
    public Object A0Q;
    public Object A0R;
    public Object A0S;
    public Object A0T;
    public Object A0U;
    public Object A0V;
    public Object A0W;
    public Object A0X;
    public Object A0Y;
    public Object A0Z;
    public Object A0a;
    public Object A0b;
    public AppUpdateSetting A0c;
    public AvatarTopPreferencesSectionSetting A0d;
    public PrivacyShortcutsSetting A0e;
    public Object A0f;
    public Object A0g;
    public Object A0h;
    public boolean A0i;
    public final Context A0j;
    public final FbUserSession A0k;
    public final 1pI A0l;
    public final 1YC A0m = 1YC.A03;
    public final DFp A0n;
    public final 06Z A0o;

    public Ccz(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A0j = context;
        this.A0n = dFp;
        this.A0o = r303;
        this.A0l = r305;
        this.A0k = fbUserSession;
    }

    public static int A00(Ccz ccz, AtomicInteger atomicInteger) {
        ccz.A01();
        return atomicInteger.getAndIncrement();
    }

    private void A01() {
        synchronized (this) {
            if (!this.A0i) {
                if (this.A0j == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A0C = C1v5.A01;
                this.A0i = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0 A[Catch: Exception -> 0x013d, all -> 0x0149, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013d, blocks: (B:6:0x0043, B:10:0x004d, B:13:0x0057, B:16:0x00d0, B:18:0x00db, B:19:0x00e1, B:20:0x00e6, B:21:0x00eb, B:23:0x00ef, B:27:0x010d, B:29:0x0112, B:30:0x0116, B:31:0x011a, B:31:0x011a, B:34:0x011f, B:38:0x00fc, B:40:0x0101, B:42:0x0105, B:44:0x0106, B:44:0x0106, B:46:0x0060, B:47:0x0065, B:50:0x0071, B:53:0x0079, B:54:0x0082, B:59:0x00c1, B:59:0x00c1, B:61:0x00c5, B:62:0x0091, B:64:0x00a1, B:72:0x00bc, B:75:0x012b, B:77:0x0135, B:79:0x013c), top: B:5:0x0043, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106 A[Catch: Exception -> 0x013d, Exception -> 0x013d, all -> 0x0149, all -> 0x0149, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x013d, blocks: (B:6:0x0043, B:10:0x004d, B:13:0x0057, B:16:0x00d0, B:18:0x00db, B:19:0x00e1, B:20:0x00e6, B:21:0x00eb, B:23:0x00ef, B:27:0x010d, B:29:0x0112, B:30:0x0116, B:31:0x011a, B:31:0x011a, B:34:0x011f, B:38:0x00fc, B:40:0x0101, B:42:0x0105, B:44:0x0106, B:44:0x0106, B:46:0x0060, B:47:0x0065, B:50:0x0071, B:53:0x0079, B:54:0x0082, B:59:0x00c1, B:59:0x00c1, B:61:0x00c5, B:62:0x0091, B:64:0x00a1, B:72:0x00bc, B:75:0x012b, B:77:0x0135, B:79:0x013c), top: B:5:0x0043, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccz.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00be A[Catch: Exception -> 0x010c, all -> 0x0118, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x010c, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00b7, B:17:0x0105, B:20:0x00be, B:22:0x00c8, B:23:0x00ce, B:24:0x00d3, B:25:0x00d9, B:28:0x00e3, B:29:0x00e8, B:30:0x00ee, B:32:0x00f6, B:33:0x00fc, B:34:0x0100, B:34:0x0100, B:36:0x005c, B:37:0x0061, B:40:0x006d, B:43:0x0075, B:44:0x007e, B:47:0x0087, B:49:0x0094, B:50:0x009a, B:52:0x00a0, B:55:0x00a8), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccz.A03():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[Catch: Exception -> 0x0152, all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0152, blocks: (B:5:0x0046, B:9:0x0050, B:12:0x005a, B:15:0x00d7, B:16:0x00dd, B:17:0x00e1, B:18:0x00e7, B:20:0x00f2, B:25:0x0103, B:26:0x0109, B:27:0x010e, B:28:0x0114, B:30:0x011f, B:31:0x0124, B:32:0x0128, B:32:0x0128, B:35:0x0134, B:37:0x012f, B:38:0x0063, B:39:0x0068, B:42:0x0074, B:45:0x007c, B:46:0x0085, B:51:0x00c8, B:51:0x00c8, B:53:0x00cc, B:54:0x0094, B:56:0x00a5, B:64:0x00c3, B:72:0x0140, B:74:0x014a, B:76:0x0151), top: B:4:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccz.A04():boolean");
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
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x2869: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:2156:0x285a */
    /* JADX WARN: Not initialized variable reg: 320, insn: 0x2865: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r320 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:2156:0x285a */
    public X.C8e AKx(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 11356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccz.AKx(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.C8e");
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
    /* JADX WARN: Failed to calculate best type for var: r322v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r322v0 ??
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
    /* JADX WARN: Not initialized variable reg: 317, insn: 0x06a2: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r317 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:328:0x069a */
    /* JADX WARN: Not initialized variable reg: 322, insn: 0x06ae: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r322 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:328:0x069a */
    public com.google.common.collect.ImmutableList AKy(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccz.AKy(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):com.google.common.collect.ImmutableList");
    }

    public void dispose() {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0m;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
        Exception e = null;
        try {
            A01();
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.avatar.setting.preference.AvatarTopPreferencesSectionSetting";
                r0.A0A("com.facebook.messaging.avatar.plugins.setting.preference.AvatarTopPreferencesSectionSetting", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.avatar.plugins.setting.AvatarSettingKillSwitch", "dispose");
                try {
                    try {
                        C6N c6n = (C6N) this.A0d.A03.getValue();
                        C2a2 c2a2 = c6n.A03;
                        if (c2a2 != null) {
                            c2a2.AE0(null);
                        }
                        C2a2 c2a22 = c6n.A02;
                        if (c2a22 != null) {
                            c2a22.AE0(null);
                        }
                        CDb cDb = (CDb) 1Br.A0B(c6n.A0A);
                        Bc7 bc7 = c6n.A0B;
                        11T.A0F(bc7, 0);
                        cDb.A01.remove(bc7);
                        r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
                    throw th;
                }
            }
            if (A04()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.privacy.plugins.core.mesetting.PrivacyShortcutsSetting", "messaging.privacy.core.mesetting.PrivacyShortcutsSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement3, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.privacy.plugins.core.PrivacyCoreKillSwitch", "dispose");
                PrivacyShortcutsSetting privacyShortcutsSetting = this.A0e;
                0fH.A0j(privacyShortcutsSetting.A06, "Dispose");
                privacyShortcutsSetting.A02.A04(privacyShortcutsSetting.A05);
                r0.A09("messaging.privacy.core.mesetting.PrivacyShortcutsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement3);
            }
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.appupdatesetting.appupdateitem.appupdatesetting.AppUpdateSetting";
                r0.A0A("com.facebook.messaging.appupdatesetting.plugins.appupdateitem.appupdatesetting.AppUpdateSetting", str, "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.appupdatesetting.plugins.appupdateitem.AppupdatesettingAppupdateitemKillSwitch", "dispose");
                AppUpdateSetting appUpdateSetting = this.A0c;
                ListenableFuture listenableFuture = appUpdateSetting.A00;
                if (listenableFuture != null && !listenableFuture.isDone()) {
                    ListenableFuture listenableFuture2 = appUpdateSetting.A00;
                    if (listenableFuture2 != null) {
                        listenableFuture2.cancel(true);
                    }
                    appUpdateSetting.A00 = null;
                }
                r0.A09(str, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
            throw th2;
        }
    }

    public void init() {
        int andIncrement;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0m;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
        try {
            A01();
            try {
                if (A03()) {
                    andIncrement = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.avatar.plugins.setting.preference.AvatarTopPreferencesSectionSetting", "messaging.avatar.setting.preference.AvatarTopPreferencesSectionSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.avatar.plugins.setting.AvatarSettingKillSwitch", "init");
                    try {
                        C6N c6n = (C6N) this.A0d.A03.getValue();
                        C00i c00i = c6n.A08.A00;
                        if (1Br.A06(((C06) c00i.get()).A00).AZk(36315292812518071L)) {
                            if (1Br.A06(((C06) c00i.get()).A00).AZk(36315292812714681L)) {
                                c6n.A02 = 2aK.A04(new AJW(c6n, null, 25), 7zN.A0y());
                            } else {
                                CDb cDb = (CDb) 1Br.A0B(c6n.A0A);
                                Bc7 bc7 = c6n.A0B;
                                11T.A0F(bc7, 0);
                                cDb.A01.put(bc7, bc7);
                            }
                        }
                        c6n.A03 = 2aK.A04(new AJT(c6n, (0DR) null, 42), 7zN.A0y());
                        r0.A09("messaging.avatar.setting.preference.AvatarTopPreferencesSectionSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A04()) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.privacy.plugins.core.mesetting.PrivacyShortcutsSetting", "messaging.privacy.core.mesetting.PrivacyShortcutsSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement3, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.privacy.plugins.core.PrivacyCoreKillSwitch", "init");
                    PrivacyShortcutsSetting privacyShortcutsSetting = this.A0e;
                    0fH.A0j(privacyShortcutsSetting.A06, "Init");
                    privacyShortcutsSetting.A02.A03(privacyShortcutsSetting.A05);
                    r0.A09("messaging.privacy.core.mesetting.PrivacyShortcutsSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement3);
                }
                if (A02()) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.appupdatesetting.plugins.appupdateitem.appupdatesetting.AppUpdateSetting", "messaging.appupdatesetting.appupdateitem.appupdatesetting.AppUpdateSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement4, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.appupdatesetting.plugins.appupdateitem.AppupdatesettingAppupdateitemKillSwitch", "init");
                    AppUpdateSetting appUpdateSetting = this.A0c;
                    ListenableFuture D3C = AbJ.A0u(appUpdateSetting.A06).D3C(new G6i(FFE.A00(appUpdateSetting.A02), 4));
                    appUpdateSetting.A00 = D3C;
                    if (D3C == null) {
                        throw 1BK.A0h();
                    }
                    1Br.A0D(appUpdateSetting.A07, D4q.A00(appUpdateSetting, 16), D3C);
                    r0.A09("messaging.appupdatesetting.appupdateitem.appupdatesetting.AppUpdateSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement4);
                }
                r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
            } catch (Throwable th) {
                r0.A04((Exception) null, "messaging.avatar.setting.preference.AvatarTopPreferencesSectionSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
            throw th2;
        }
    }
}
