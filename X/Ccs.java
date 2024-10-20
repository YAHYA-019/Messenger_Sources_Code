package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.questhub.plugins.entrypoint.questsetting.nonowner.QuestHubNonOwnerSetting;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Ccs.class */
public final class Ccs implements DIL {
    public C1v5 A00;
    public Bgi A01;
    public Bgi A02;
    public Bgi A03;
    public QuestHubNonOwnerSetting A04;
    public Object A05;
    public boolean A06;
    public final Context A07;
    public final 1YC A08 = 1YC.A03;
    public final 06Z A09;
    public final FbUserSession A0A;
    public final 1pI A0B;
    public final DFp A0C;

    public Ccs(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A07 = context;
        this.A0C = dFp;
        this.A09 = r303;
        this.A0B = r305;
        this.A0A = fbUserSession;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A06) {
                if (this.A07 == null) {
                    throw AnonymousClass001.A0Q("The context passed in the MeSettingsItemInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A00 = C1v5.A01;
                this.A06 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01ad A[Catch: Exception -> 0x028b, all -> 0x02a5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x028b, blocks: (B:18:0x0087, B:22:0x0094, B:25:0x00a0, B:28:0x01a5, B:30:0x0275, B:31:0x027a, B:36:0x01ad, B:39:0x01b9, B:41:0x01c7, B:42:0x01ce, B:44:0x01d7, B:47:0x01e4, B:48:0x01e8, B:48:0x01e8, B:52:0x01f2, B:53:0x01f9, B:54:0x0200, B:56:0x020e, B:59:0x021c, B:61:0x022a, B:64:0x0238, B:66:0x0246, B:69:0x0254, B:70:0x025b, B:72:0x0262, B:73:0x0269, B:74:0x026e, B:74:0x026e, B:76:0x00aa, B:77:0x00af, B:80:0x00bb, B:83:0x00c5, B:84:0x00cf, B:87:0x00db, B:89:0x00e9, B:90:0x00f0, B:92:0x00f9, B:93:0x00fe, B:93:0x00fe, B:97:0x0108, B:100:0x0191, B:100:0x0191, B:102:0x0196, B:103:0x0114, B:105:0x0124, B:119:0x018c, B:128:0x0170, B:130:0x017d, B:132:0x0184), top: B:17:0x0087, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C8e AKx(com.facebook.mig.scheme.interfaces.MigColorScheme r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccs.AKx(com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.String):X.C8e");
    }

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
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
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", A00);
        }
    }

    public void init() {
        int A00 = 1BK.A00();
        1YC r0 = this.A08;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", A00);
        }
    }
}
