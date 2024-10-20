package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfig;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfigBuilder;

/* loaded from: Ig4.class */
public final class Ig4 implements JIv, CallerContextable {
    public static final String __redex_internal_original_name = "SmartGlassCallEngineInitListener";
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03 = 1BK.A0C();
    public final 1Br A04;
    public final HeraCallEngineConfig A05;
    public final C01i A06;
    public final 4dH A07;
    public final 1BP A08;
    public final 1De A09;

    public Ig4(1De r302) {
        this.A09 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 82256);
        this.A08 = FbInjector.A00;
        this.A01 = 1Bq.A00(116358);
        this.A02 = 1Bu.A03(r0, 115761);
        HeraCallEngineConfigBuilder heraCallEngineConfigBuilder = new HeraCallEngineConfigBuilder();
        heraCallEngineConfigBuilder.setTag("M4A_SG");
        heraCallEngineConfigBuilder.setRemoteRtcEndpointFactory(new DCz(this, 5));
        heraCallEngineConfigBuilder.includeProfilePicture = false;
        this.A05 = heraCallEngineConfigBuilder.build();
        this.A06 = C01g.A00(C03i.A02, new DCz(this, 4));
        this.A07 = new 4dB();
    }

    private final void A00() {
        String str;
        0fH.A0j(__redex_internal_original_name, "Trying to initialize engine");
        if (!1Br.A07(this.A03).AZk(2342156111592887993L)) {
            str = "stella_messenger_ipc.android_calling_handler is disabled";
        } else if (!C06404gp.A01.A01()) {
            str = "hera_plugin_messenger_gating.enable_hera_in_stella_android is disabled";
        } else if (AbstractC06294ge.A00(7zL.A09())) {
            str = "enable_hera_plugin_android is enabled";
        } else {
            if (((5Iw) 1Br.A0B(this.A04)).A02()) {
                2aK.A03((Integer) null, (0DE) null, new AJf(this, (0DR) null, 9), 7zN.A0y(), 3);
                return;
            }
            str = "Current user is not opted-in, skipping engine.";
        }
        0fH.A0j(__redex_internal_original_name, str);
    }

    @Override // X.JIv
    public void BmI(Context context, String str, String str2, String str3) {
        A00();
    }

    @Override // X.JIv
    public void BmN(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        A00();
    }
}
