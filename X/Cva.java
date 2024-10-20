package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.messaging.help.plugins.helpcenter.mesetting.HelpSetting;

/* loaded from: Cva.class */
public final class Cva implements C5ww {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ 1Br A03;
    public final /* synthetic */ 1Br A04;
    public final /* synthetic */ HelpSetting A05;

    public Cva(1Br r302, 1Br r303, 1Br r304, 1Br r305, 1Br r306, HelpSetting helpSetting) {
        this.A05 = helpSetting;
        this.A03 = r302;
        this.A04 = r303;
        this.A01 = r304;
        this.A00 = r305;
        this.A02 = r306;
    }

    @Override // X.C5ww
    public final void onClick(View view) {
        ((C1is) 1Br.A0B(this.A03)).A0E("help_setting");
        ((2Kv) 1Br.A0B(this.A04)).A09("click_point", "help_setting");
        C68t A0b = 7zP.A0b(this.A01);
        Context context = this.A05.A00;
        C3Nx c3Nx = (C3Nx) 1Br.A0B(this.A00);
        1GS r0 = (1GS) 1Br.A0B(this.A02);
        11T.A0H(c3Nx, r0);
        Uri A0A = AbM.A0A(AbN.A08().authority(c3Nx.A00()).appendEncodedPath("mobile/messenger/help").appendQueryParameter("utm_source", "messenger").appendQueryParameter("utm_medium", "me-setting"), "locale", r0.A01());
        11T.A0A(A0A);
        A0b.A0E(context, A0A);
    }
}
