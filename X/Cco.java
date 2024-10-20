package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.familycenter.plugins.settings.impl.FamilyCenterSetting;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Cco.class */
public final class Cco implements DIL {
    public FamilyCenterSetting A00;
    public Object A01;
    public final Context A02;
    public final 1YC A03 = 1YC.A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final 1pI A06;
    public final DFp A07;

    public Cco(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A02 = context;
        this.A07 = dFp;
        this.A04 = r303;
        this.A06 = r305;
        this.A05 = fbUserSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0155 A[Catch: Exception -> 0x01a8, all -> 0x01c2, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x01a8, blocks: (B:14:0x0082, B:15:0x0087, B:18:0x0093, B:21:0x009d, B:25:0x0111, B:27:0x011d, B:32:0x0142, B:33:0x0149, B:36:0x0155, B:37:0x015c, B:39:0x0163, B:40:0x016a, B:41:0x016f, B:41:0x016f, B:44:0x0176, B:45:0x017b, B:53:0x01a7, B:55:0x013a, B:56:0x00a7, B:61:0x00fc, B:61:0x00fc, B:63:0x0101, B:64:0x00b8, B:66:0x00c8, B:76:0x00f7, B:79:0x0193, B:81:0x01a0), top: B:13:0x0082, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C8e AKx(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cco.AKx(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.C8e");
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
