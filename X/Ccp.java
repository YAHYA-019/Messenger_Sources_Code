package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dma.plugins.msplitaccountsettings.impl.MsplitAccountSettings;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccp.class */
public final class Ccp implements DIL {
    public MsplitAccountSettings A00;
    public Object A01;
    public final Context A02;
    public final 1YC A03 = 1YC.A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final 1pI A06;
    public final DFp A07;

    public Ccp(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A02 = context;
        this.A07 = dFp;
        this.A04 = r303;
        this.A06 = r305;
        this.A05 = fbUserSession;
    }

    public C8e AKx(MigColorScheme migColorScheme, String str) {
        boolean booleanValue;
        Object obj;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A03;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
        C8e c8e = null;
        Exception e = null;
        try {
            if (str.equals("MsplitAccountSettings")) {
                if (this.A01 == null) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0B("com.facebook.messaging.dma.plugins.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.dma.plugins.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", andIncrement2);
                    Exception exc = null;
                    try {
                        try {
                            int i = C1Y6.A00;
                            int i2 = BQR.A00;
                            if (i2 == i) {
                                Boolean bool = BQR.A01;
                                if (bool != null) {
                                    booleanValue = bool.booleanValue();
                                    if (booleanValue || !4YV.A1S()) {
                                        obj = C1Y6.A03;
                                    } else {
                                        this.A00 = new MsplitAccountSettings(this.A02);
                                        obj = C1Y6.A02;
                                    }
                                    this.A01 = obj;
                                    r0.A07("messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, 1BK.A1V(obj, C1Y6.A03));
                                }
                            }
                            if (BQR.A01 == null || i2 != i) {
                                int andIncrement3 = atomicInteger.getAndIncrement();
                                r0.A05("com.facebook.messaging.dma.plugins.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", "messaging.dma.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", andIncrement3);
                                Exception e2 = null;
                                try {
                                    try {
                                        BQR.A01 = true;
                                        BQR.A00 = i;
                                        r0.A01(true, (Exception) null, "messaging.dma.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", andIncrement3);
                                    } catch (Throwable th) {
                                        r0.A01(BQR.A01, e2, "messaging.dma.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", andIncrement3);
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e2 = e3;
                                    throw e2;
                                }
                            }
                            booleanValue = BQR.A01.booleanValue();
                            if (booleanValue) {
                            }
                            obj = C1Y6.A03;
                            this.A01 = obj;
                            r0.A07("messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, 1BK.A1V(obj, C1Y6.A03));
                        } catch (Exception e4) {
                            this.A01 = C1Y6.A03;
                            try {
                                throw e4;
                            } catch (Throwable th2) {
                                th = th2;
                                exc = e4;
                                r0.A03(exc, "messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r0.A03(exc, "messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                        throw th;
                    }
                }
                if (this.A01 != C1Y6.A03) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.dma.plugins.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement4, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.dma.plugins.msplitaccountsettings.DmaMsplitaccountsettingsKillSwitch", "createSettingsRowItem");
                    try {
                        try {
                            MsplitAccountSettings msplitAccountSettings = this.A00;
                            CQ0 A00 = CQ0.A00();
                            CQ0.A03(msplitAccountSettings.A00, A00, 2131960934);
                            A00.A00 = 2MQ.A2o;
                            A00.A03 = C1td.A06;
                            c8e = CQ0.A01(A00, msplitAccountSettings, 38);
                            r0.A09("messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement4);
                        } catch (Exception e5) {
                            e = e5;
                            throw e;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r0.A04(e, "messaging.dma.msplitaccountsettings.impl.MsplitAccountSettings", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement4);
                        throw th;
                    }
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            return c8e;
        } catch (Throwable th5) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", andIncrement);
            throw th5;
        }
    }

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A03;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        return null;
    }

    public void dispose() {
        int A00 = 1BK.A00();
        1YC r0 = this.A03;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
    }

    public void init() {
        int A00 = 1BK.A00();
        1YC r0 = this.A03;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
    }
}
