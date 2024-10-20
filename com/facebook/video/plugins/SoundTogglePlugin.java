package com.facebook.video.plugins;

import X.0Pz;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1UG;
import X.2Me;
import X.2yD;
import X.6TI;
import X.6TN;
import X.6cT;
import X.AbF;
import X.C00i;
import X.C09s;
import X.C52d;
import X.C52j;
import X.C6d6;
import X.DKF;
import X.DKG;
import X.EgB;
import X.GPl;
import X.GRX;
import X.HjB;
import X.Hmy;
import X.IKB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.widget.FbImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SoundTogglePlugin.class */
public final class SoundTogglePlugin extends C6d6 {
    public static final C52j A08 = C52j.A2Z;
    public VideoPlayerParams A00;
    public boolean A01;
    public final C52d A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Hmy A06;
    public final FbImageView A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundTogglePlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundTogglePlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundTogglePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A05 = 1Bq.A00(49694);
        this.A03 = 1Bq.A00(16465);
        this.A04 = 1BK.A0D();
        this.A02 = (C52d) 1Bi.A03(115343);
        this.A06 = new Hmy(this);
        A0C(2132543365);
        this.A07 = (FbImageView) C09s.A01(this, 2131367492);
        GPl.A02(this, 93);
        setOnClickListener(new IKB(this, 66));
    }

    public /* synthetic */ SoundTogglePlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final Boolean A00(SoundTogglePlugin soundTogglePlugin) {
        boolean BUR;
        GRX grx = soundTogglePlugin.A09;
        Boolean bool = null;
        if (grx != null) {
            VideoPlayerParams videoPlayerParams = soundTogglePlugin.A00;
            PlayerOrigin playerOrigin = ((C6d6) soundTogglePlugin).A03;
            if (videoPlayerParams != null && ((C6d6) soundTogglePlugin).A05 != null && playerOrigin != null) {
                BUR = grx.A0A(playerOrigin, videoPlayerParams.A0k);
                bool = Boolean.valueOf(BUR);
            }
        } else {
            6cT r0 = ((C6d6) soundTogglePlugin).A07;
            if (r0 != null) {
                BUR = r0.BUR();
                bool = Boolean.valueOf(BUR);
            }
        }
        return bool;
    }

    public static final void A01(SoundTogglePlugin soundTogglePlugin, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        EgB egB = (EgB) 1Bi.A03(99562);
        boolean z4 = !z;
        FbImageView fbImageView = soundTogglePlugin.A07;
        11T.A0F(fbImageView, 1);
        C00i c00i = egB.A00.A00;
        HjB hjB = (HjB) c00i.get();
        if (hjB.A05) {
            z2 = hjB.A04;
        } else {
            z2 = 2yD.A04(hjB.A06, 36315486086833119L);
            hjB.A04 = z2;
            hjB.A05 = true;
        }
        if (z2) {
            i = 2132345191;
            if (z4) {
                i = 2132345185;
            }
        } else {
            i = 2132344929;
            if (z4) {
                i = 2132344928;
            }
        }
        fbImageView.setImageResource(i);
        Context context = fbImageView.getContext();
        fbImageView.setColorFilter(2Me.A02.A01(context));
        HjB hjB2 = (HjB) c00i.get();
        if (hjB2.A03) {
            z3 = hjB2.A02;
        } else {
            z3 = 2yD.A04(hjB2.A06, 36315486088537065L);
            hjB2.A02 = z3;
            hjB2.A03 = true;
        }
        if (!z3 || context == null) {
            return;
        }
        fbImageView.setBackground(context.getDrawable(2132411513));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:7:0x000d, B:10:0x0018, B:11:0x001d, B:13:0x0024, B:14:0x002a, B:16:0x002f, B:19:0x0039, B:22:0x0042, B:25:0x004b, B:26:0x0053, B:27:0x005b, B:29:0x0061, B:30:0x0068, B:33:0x0073, B:34:0x0078, B:37:0x0081, B:39:0x008f, B:41:0x0096, B:43:0x009c, B:44:0x00ab, B:46:0x00b9, B:48:0x00a4, B:50:0x00c1, B:53:0x00ca, B:56:0x00d5, B:58:0x00de, B:59:0x00e4, B:64:0x00ed, B:67:0x00f8, B:69:0x00ff), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:7:0x000d, B:10:0x0018, B:11:0x001d, B:13:0x0024, B:14:0x002a, B:16:0x002f, B:19:0x0039, B:22:0x0042, B:25:0x004b, B:26:0x0053, B:27:0x005b, B:29:0x0061, B:30:0x0068, B:33:0x0073, B:34:0x0078, B:37:0x0081, B:39:0x008f, B:41:0x0096, B:43:0x009c, B:44:0x00ab, B:46:0x00b9, B:48:0x00a4, B:50:0x00c1, B:53:0x00ca, B:56:0x00d5, B:58:0x00de, B:59:0x00e4, B:64:0x00ed, B:67:0x00f8, B:69:0x00ff), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[Catch: all -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:7:0x000d, B:10:0x0018, B:11:0x001d, B:13:0x0024, B:14:0x002a, B:16:0x002f, B:19:0x0039, B:22:0x0042, B:25:0x004b, B:26:0x0053, B:27:0x005b, B:29:0x0061, B:30:0x0068, B:33:0x0073, B:34:0x0078, B:37:0x0081, B:39:0x008f, B:41:0x0096, B:43:0x009c, B:44:0x00ab, B:46:0x00b9, B:48:0x00a4, B:50:0x00c1, B:53:0x00ca, B:56:0x00d5, B:58:0x00de, B:59:0x00e4, B:64:0x00ed, B:67:0x00f8, B:69:0x00ff), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(com.facebook.video.plugins.SoundTogglePlugin r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.SoundTogglePlugin.A02(com.facebook.video.plugins.SoundTogglePlugin, boolean):void");
    }

    @Override // X.C6d6
    public String A0H() {
        return "SoundTogglePlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0M() {
        this.A00 = null;
        setVisibility(8);
        this.A02.D5u(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r0.equals("ShouldMuteWatchAndBrowse") != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(X.6TI r302) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.SoundTogglePlugin.A0Y(X.6TI):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        6cT r0 = super.A07;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        this.A00 = r302.A03;
        setVisibility(0);
        A01(this, r0.BUR());
        this.A02.Cc7(this.A06);
    }

    public void onVisibilityChanged(View view, int i) {
        String str;
        Boolean A00 = A00(this);
        if (A00 != null) {
            boolean booleanValue = A00.booleanValue();
            6TN r0 = this.A0O;
            if (i == 0 && 6TN.A0Q == r0) {
                boolean z = !booleanValue;
                1UG A082 = 1BK.A08(1Br.A02(this.A04), "video_player_control_impression");
                if (A082.isSampled()) {
                    AbF.A1L(A082, "impression");
                    A082.A7R("player_control", "sound_toggle");
                    String str2 = "";
                    A082.A7R("video_plugin_session_id", str2);
                    6TN r02 = this.A0O;
                    if (r02 != null && (str = r02.value) != null) {
                        str2 = str;
                    }
                    A082.A7R("surface", str2);
                    A082.A7R("ui_signature", "base");
                    A082.A7R(TraceFieldType.VideoId, this.A0A);
                    A082.A7R("state_metadata", 0Pz.A0W("toggle_state=", z ? "on" : "off"));
                    A082.BZL();
                }
            }
        }
    }
}
