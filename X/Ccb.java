package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.activesessions.PrivacySettingsActiveSessionsRow;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.securityalerts.PrivacySettingsSecurityAlertsRow;
import com.facebook.messaging.encryptedbackups.plugins.privacysettings.PrivacySettingEncryptedBackups;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccb.class */
public final class Ccb implements DIK {
    public 20L A01;
    public PrivacySettingsActiveSessionsRow A02;
    public PrivacySettingsSecurityAlertsRow A03;
    public PrivacySettingEncryptedBackups A04;
    public C1v5 A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public final Context A0A;
    public final LifecycleOwner A0B;
    public final DFp A0D;
    public int A00 = -1;
    public final 1YC A0C = 1YC.A03;

    public Ccb(Context context, LifecycleOwner lifecycleOwner, DFp dFp) {
        this.A0A = context;
        this.A0B = lifecycleOwner;
        this.A0D = dFp;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A09) {
                if (this.A0A == null) {
                    throw AnonymousClass001.A0Q("The context passed in the PrivacySettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A05 = C1v5.A01;
                this.A09 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ac, B:18:0x00b1, B:19:0x00b7, B:20:0x00bb, B:20:0x00bb, B:23:0x00c7, B:26:0x00c2, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:38:0x0087, B:39:0x008c, B:41:0x0092, B:44:0x009a), top: B:4:0x003f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2 A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ac, B:18:0x00b1, B:19:0x00b7, B:20:0x00bb, B:20:0x00bb, B:23:0x00c7, B:26:0x00c2, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:38:0x0087, B:39:0x008c, B:41:0x0092, B:44:0x009a), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccb.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ac, B:18:0x00b1, B:19:0x00b7, B:20:0x00bb, B:20:0x00bb, B:23:0x00c7, B:26:0x00c2, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:38:0x0087, B:39:0x008c, B:41:0x0092, B:44:0x009a), top: B:4:0x003f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2 A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a6, B:16:0x00ac, B:18:0x00b1, B:19:0x00b7, B:20:0x00bb, B:20:0x00bb, B:23:0x00c7, B:26:0x00c2, B:27:0x005c, B:28:0x0061, B:31:0x006d, B:34:0x0075, B:35:0x007e, B:38:0x0087, B:39:0x008c, B:41:0x0092, B:44:0x009a), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccb.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x00bb, all -> 0x00c7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bb, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0092, B:17:0x0098, B:19:0x009e, B:20:0x00a4, B:21:0x00a8, B:21:0x00a8, B:24:0x00b4, B:27:0x00af, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:37:0x0081), top: B:4:0x003f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: Exception -> 0x00bb, all -> 0x00c7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bb, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0092, B:17:0x0098, B:19:0x009e, B:20:0x00a4, B:21:0x00a8, B:21:0x00a8, B:24:0x00b4, B:27:0x00af, B:28:0x005c, B:29:0x0061, B:32:0x006d, B:35:0x0075, B:37:0x0081), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccb.A03():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r0v83, types: [int] */
    /* JADX WARN: Type inference failed for: r311v0 */
    public List AKc(0Da r302) {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
        try {
            A00();
            ?? r311 = this.A00;
            boolean z = r311;
            if (r311 == -1) {
                boolean A02 = A02();
                boolean z2 = A02;
                if (A03()) {
                    z2 = (A02 ? 1 : 0) + 1;
                }
                boolean z3 = z2;
                if (A01()) {
                    z3 = (z2 ? 1 : 0) + 1;
                }
                this.A00 = z3 ? 1 : 0;
                z = z3;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            try {
                if (A02()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.advancedcrypto.core.privacysettings.securityalerts.PrivacySettingsSecurityAlertsRow";
                    r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.securityalerts.PrivacySettingsSecurityAlertsRow", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", i, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "createPrivacySettingsRowItem");
                    try {
                        AbJ.A1I(r302, this.A03.A00(), A0t);
                        r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A03()) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.encryptedbackups.plugins.privacysettings.PrivacySettingEncryptedBackups", "messaging.encryptedbackups.privacysettings.PrivacySettingEncryptedBackups", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement2, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.encryptedbackups.plugins.EncryptedBackupsKillSwitch", "createPrivacySettingsRowItem");
                    AbJ.A1I(r302, this.A04.A00(), A0t);
                    r0.A09("messaging.encryptedbackups.privacysettings.PrivacySettingEncryptedBackups", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement2);
                }
                if (A01()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.advancedcrypto.core.privacysettings.activesessions.PrivacySettingsActiveSessionsRow";
                    r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.activesessions.PrivacySettingsActiveSessionsRow", str, "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", i, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "createPrivacySettingsRowItem");
                    AbJ.A1I(r302, this.A02.A00(), A0t);
                    r0.A09(str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                }
                r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
                return A0t;
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "createPrivacySettingsRowItem", andIncrement);
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
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0C;
        r0.A08("com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A03()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.encryptedbackups.plugins.privacysettings.PrivacySettingEncryptedBackups", "messaging.encryptedbackups.privacysettings.PrivacySettingEncryptedBackups", "com.facebook.messaging.messengerprefs.plugins.interfaces.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", andIncrement2, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "com.facebook.messaging.encryptedbackups.plugins.EncryptedBackupsKillSwitch", "subscribe");
                try {
                    try {
                        this.A04.A00.D7z();
                        r0.A09("messaging.encryptedbackups.privacysettings.PrivacySettingEncryptedBackups", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.encryptedbackups.privacysettings.PrivacySettingEncryptedBackups", "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.messengerprefs.privacysettings.settingitems.PrivacySettingsItemInterfaceSpec", "subscribe", andIncrement);
            throw th2;
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
