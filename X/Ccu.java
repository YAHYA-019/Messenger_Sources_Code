package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow;
import com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts.SecurityAlertsActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccu.class */
public final class Ccu implements DIL {
    public 20L A00;
    public EphemeralSecurityAlertsRow A01;
    public C1v5 A02;
    public Object A03;
    public boolean A04;
    public final Context A05;
    public final 06Z A06;
    public final FbUserSession A07;
    public final 1pI A08;
    public final 1YC A09 = 1YC.A03;
    public final DFp A0A;

    public Ccu(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A05 = context;
        this.A0A = dFp;
        this.A06 = r303;
        this.A08 = r305;
        this.A07 = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A04) {
                if (this.A05 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A02 = C1v5.A01;
                this.A04 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: Exception -> 0x00f9, all -> 0x0105, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f9, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x00a9, B:17:0x00f2, B:20:0x00b0, B:22:0x00ba, B:23:0x00c0, B:24:0x00c5, B:27:0x00d0, B:28:0x00d5, B:29:0x00db, B:31:0x00e4, B:32:0x00e9, B:33:0x00ed, B:33:0x00ed, B:35:0x005c, B:36:0x0061, B:39:0x006d, B:42:0x0075, B:43:0x007e, B:46:0x0087, B:47:0x008c, B:49:0x0092, B:52:0x009a), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccu.A01():boolean");
    }

    public C8e AKx(MigColorScheme migColorScheme, String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
        try {
            A00();
            C8e c8e = null;
            if (str.equals("EphemeralSecurityAlert") && A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "createSettingsRowItem");
                    try {
                        EphemeralSecurityAlertsRow ephemeralSecurityAlertsRow = this.A01;
                        Context context = ephemeralSecurityAlertsRow.A00;
                        MigColorScheme migColorScheme2 = (MigColorScheme) 1Bu.A06(context, 16979);
                        1Br A0M = 7zM.A0M();
                        String A0u = 1BK.A0u(context, 2131963550);
                        Intent A0D = C3o5.A0D(context, SecurityAlertsActivity.class);
                        int A02 = ephemeralSecurityAlertsRow.A01.A02(ephemeralSecurityAlertsRow.A03);
                        String A0s = 7zR.A0s();
                        CQ0 A00 = CQ0.A00();
                        A00.A04(A0u);
                        A00.A00 = 2MQ.A1e;
                        A00.A03 = 5Sv.A06;
                        A00.A01 = new CvY(A0D, A0M, A0s, A02, 0);
                        A00.A05 = Boolean.valueOf(AnonymousClass001.A1O(A02));
                        if (A02 > 0) {
                            A00.A04 = BXX.A00(migColorScheme2, (CharSequence) null, A02);
                            C5x2.A00(SecurityAlertsActivity.A01, 1BK.A0l(A02), A0s, 6);
                        }
                        new C8e(A00);
                        r0.A09("messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            return c8e;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            throw th2;
        }
    }

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
            throw th;
        }
    }

    public void dispose() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "dispose");
                try {
                    try {
                        EphemeralSecurityAlertsRow ephemeralSecurityAlertsRow = this.A01;
                        0fH.A0j(ephemeralSecurityAlertsRow.A04, "Dispose");
                        ephemeralSecurityAlertsRow.A01.A04(ephemeralSecurityAlertsRow.A03);
                        r0.A09("messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            throw th2;
        }
    }

    public void init() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        Exception e = null;
        try {
            A00();
            if (A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.advancedcrypto.plugins.core.ArmadilloCoreKillSwitch", "init");
                try {
                    try {
                        EphemeralSecurityAlertsRow ephemeralSecurityAlertsRow = this.A01;
                        0fH.A0j(ephemeralSecurityAlertsRow.A04, "Init");
                        ephemeralSecurityAlertsRow.A01.A03(ephemeralSecurityAlertsRow.A03);
                        r0.A09("messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.advancedcrypto.core.privacysettings.ephemeralsecurityalerts.EphemeralSecurityAlertsRow", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }
}
