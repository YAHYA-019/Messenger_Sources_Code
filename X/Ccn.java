package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Ccn.class */
public final class Ccn implements DIL {
    public Object A00;
    public final 1YC A01 = 1YC.A03;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final 1pI A05;
    public final DFp A06;

    public Ccn(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A02 = context;
        this.A06 = dFp;
        this.A03 = r303;
        this.A05 = r305;
        this.A04 = fbUserSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0155 A[Catch: Exception -> 0x0196, all -> 0x01b0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0196, blocks: (B:14:0x0081, B:15:0x0086, B:18:0x0092, B:21:0x009c, B:24:0x00fd, B:26:0x0108, B:30:0x0118, B:31:0x011f, B:32:0x0126, B:33:0x012b, B:35:0x0132, B:36:0x0137, B:38:0x0147, B:41:0x0155, B:43:0x0164, B:44:0x0169, B:49:0x015d, B:50:0x00a6, B:55:0x00ec, B:55:0x00ec, B:57:0x00f1, B:58:0x00b7, B:60:0x00c7, B:68:0x00e7, B:76:0x0181, B:78:0x018e, B:80:0x0195), top: B:13:0x0081, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C8e AKx(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccn.AKx(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.C8e");
    }

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A01;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", A00);
        return null;
    }

    public void dispose() {
        int A00 = 1BK.A00();
        1YC r0 = this.A01;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
    }

    public void init() {
        int A00 = 1BK.A00();
        1YC r0 = this.A01;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
    }
}
