package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.endtoendchats.PrivacySettingsEndToEndChats;
import com.facebook.messaging.authapplock.plugins.core.privacysettings.AppLockPrivacySettings;
import com.facebook.messaging.wellbeing.harmfulcontent.safewebsitebrowsing.plugins.privacysettings.safewebsitebrowsingprivacysettings.SafeWebsiteBrowsingPrivacySettings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccd.class */
public final class Ccd implements DIK {
    public 20L A01;
    public PrivacySettingsEndToEndChats A02;
    public AppLockPrivacySettings A03;
    public C1v5 A04;
    public SafeWebsiteBrowsingPrivacySettings A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public final Context A0A;
    public final LifecycleOwner A0B;
    public final DFp A0D;
    public final String A0E;
    public int A00 = -1;
    public final 1YC A0C = 1YC.A03;

    public Ccd(Context context, LifecycleOwner lifecycleOwner, DFp dFp, String str) {
        this.A0A = context;
        this.A0B = lifecycleOwner;
        this.A0D = dFp;
        this.A0E = str;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A09) {
                if (this.A0A == null) {
                    throw AnonymousClass001.A0Q("The context passed in the PrivacySettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A04 = C1v5.A01;
                this.A09 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[Catch: Exception -> 0x00d4, all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d4, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ab, B:17:0x00b1, B:19:0x00b7, B:20:0x00bd, B:21:0x00c1, B:21:0x00c1, B:24:0x00cd, B:27:0x00c8, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:36:0x007e, B:39:0x0087, B:40:0x008c, B:42:0x0092, B:45:0x009a), top: B:4:0x003f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[Catch: Exception -> 0x00d4, all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d4, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ab, B:17:0x00b1, B:19:0x00b7, B:20:0x00bd, B:21:0x00c1, B:21:0x00c1, B:24:0x00cd, B:27:0x00c8, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:36:0x007e, B:39:0x0087, B:40:0x008c, B:42:0x0092, B:45:0x009a), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccd.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x00c1, all -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0093, B:19:0x009f, B:21:0x00a4, B:22:0x00aa, B:23:0x00ae, B:23:0x00ae, B:26:0x00ba, B:29:0x00b5, B:30:0x005c, B:31:0x0061, B:34:0x006d, B:37:0x0075, B:39:0x0081), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccd.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3 A[Catch: Exception -> 0x0124, all -> 0x0132, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0124, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00e3, B:16:0x00e9, B:18:0x00ee, B:19:0x00f4, B:20:0x00f8, B:20:0x00f8, B:23:0x0104, B:25:0x00ff, B:26:0x005c, B:27:0x0061, B:30:0x006d, B:33:0x0075, B:34:0x007e, B:39:0x00d4, B:39:0x00d4, B:41:0x00d8, B:42:0x008d, B:44:0x009b, B:55:0x00cf, B:58:0x0112, B:60:0x011c, B:62:0x0123), top: B:4:0x003f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff A[Catch: Exception -> 0x0124, all -> 0x0132, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0124, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00e3, B:16:0x00e9, B:18:0x00ee, B:19:0x00f4, B:20:0x00f8, B:20:0x00f8, B:23:0x0104, B:25:0x00ff, B:26:0x005c, B:27:0x0061, B:30:0x006d, B:33:0x0075, B:34:0x007e, B:39:0x00d4, B:39:0x00d4, B:41:0x00d8, B:42:0x008d, B:44:0x009b, B:55:0x00cf, B:58:0x0112, B:60:0x011c, B:62:0x0123), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccd.A03():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [int] */
    /* JADX WARN: Type inference failed for: r0v118, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r311v0 */
    public List AKc(0Da r302) {
        int andIncrement;
        String str;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
        Exception e = null;
        try {
            A00();
            ?? r311 = this.A00;
            boolean z = r311;
            if (r311 == -1) {
                boolean A02 = A02();
                boolean z2 = A02;
                if (A01()) {
                    z2 = (A02 ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A03()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                this.A00 = z3 ? 1 : 0;
                z = z3;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            if (A02()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.authapplock.core.privacysettings.AppLockPrivacySettings";
                r0.A0A("com.facebook.messaging.authapplock.plugins.core.privacysettings.AppLockPrivacySettings", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.authapplock.plugins.core.AuthapplockCoreKillSwitch", "createPrivacySettingsRowItem");
                try {
                    try {
                        AbJ.A1I(r302, this.A03.A00(), A0t);
                        r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
                    throw th;
                }
            }
            if (A01()) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.endtoendchats.PrivacySettingsEndToEndChats", "messaging.advancedcrypto.core.privacysettings.endtoendchats.PrivacySettingsEndToEndChats", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement3, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "createPrivacySettingsRowItem");
                PrivacySettingsEndToEndChats privacySettingsEndToEndChats = this.A02;
                1Bn.A0A(83042);
                Context context = privacySettingsEndToEndChats.A00;
                AbJ.A1I(r302, CG8.A00(Cvn.A00(privacySettingsEndToEndChats, 8), 1BK.A0u(context, 2131963821), 1BK.A0u(context, 2131963820), "e2ee_chats"), A0t);
                r0.A09("messaging.advancedcrypto.core.privacysettings.endtoendchats.PrivacySettingsEndToEndChats", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement3);
            }
            if (A03()) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.wellbeing.harmfulcontent.safewebsitebrowsing.privacysettings.safewebsitebrowsingprivacysettings.SafeWebsiteBrowsingPrivacySettings";
                r0.A0A("com.facebook.messaging.wellbeing.harmfulcontent.safewebsitebrowsing.plugins.privacysettings.safewebsitebrowsingprivacysettings.SafeWebsiteBrowsingPrivacySettings", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.wellbeing.harmfulcontent.safewebsitebrowsing.plugins.privacysettings.PrivacysettingsKillSwitch", "createPrivacySettingsRowItem");
                SafeWebsiteBrowsingPrivacySettings safeWebsiteBrowsingPrivacySettings = this.A05;
                1Bn.A0A(83042);
                Context context2 = safeWebsiteBrowsingPrivacySettings.A00;
                AbJ.A1I(r302, CG8.A00(Cvn.A00(safeWebsiteBrowsingPrivacySettings, ActionId.ACTIVITY_START), 1BK.A0u(context2, 2131963824), 1BK.A0u(context2, 2131963823), "safe_website_browsing"), A0t);
                r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
            }
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
            return A0t;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
            throw th2;
        }
    }

    public void BbQ() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "logRowImpression", A00);
        }
    }

    public void D3I() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", A00);
        }
    }

    public void D6F() {
        int A00 = 1BK.A00();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "unsubscribe", A00);
        }
    }
}
