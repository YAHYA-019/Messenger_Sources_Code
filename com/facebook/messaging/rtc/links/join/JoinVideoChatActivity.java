package com.facebook.messaging.rtc.links.join;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lo;
import X.1SG;
import X.1iF;
import X.1lN;
import X.2Qb;
import X.7zR;
import X.AbF;
import X.AbG;
import X.AbL;
import X.C00i;
import X.C1F6;
import X.C5V0;
import X.DKH;
import X.DRp;
import X.HVv;
import X.Hqq;
import X.Hrf;
import X.I8o;
import X.IFc;
import X.IGZ;
import X.InterfaceC03733yw;
import X.JIj;
import X.Qoj;
import X.R4r;
import android.R;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.networkmonitor.NetworkConnectionMonitor;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.rtc.incall.impl.links.errormessage.LinkNotActiveDialogFragment;
import com.facebook.messaging.rtc.links.join.ui.JoinVideoChatData;
import com.facebook.messaging.rtc.links.ui.dialog.RoomDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.rtc.interfaces.LinkLogMetadata;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: JoinVideoChatActivity.class */
public final class JoinVideoChatActivity extends FbFragmentActivity implements 1lN, JIj, InterfaceC03733yw {
    public FbUserSession A00;
    public IFc A01;
    public Hrf A02;
    public JoinVideoChatData A03;
    public I8o A04;
    public MigColorScheme A05;
    public boolean A06;
    public boolean A07;
    public 2Qb A08;
    public C5V0 A09;
    public final 1Br A0I = 1Bu.A00(99982);
    public final 1Br A0C = 1Bq.A00(85048);
    public final 1Br A0D = 1Bq.A00(85050);
    public final 1Br A0F = 1Bq.A00(66435);
    public final 1Br A0A = 1Bq.A00(115033);
    public final 1Br A0E = 1BK.A0C();
    public final 1Br A0B = 1Bu.A00(114950);
    public final 1Br A0G = 1Bq.A00(49627);
    public final 1Br A0H = 1Bu.A00(115685);
    public final 1Br A0J = 1Bu.A00(115913);
    public final HVv A0K = new HVv(this);
    public final Long A0L = 322006035685628L;

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ef, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A12(com.facebook.messaging.rtc.links.join.JoinVideoChatActivity r301) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.links.join.JoinVideoChatActivity.A12(com.facebook.messaging.rtc.links.join.JoinVideoChatActivity):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(322006035685628L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1Br.A0C(this.A0A);
        FbUserSession A0H = DKH.A0H(this);
        this.A00 = A0H;
        String str = "fbUserSession";
        if (A0H != null) {
            Integer num = null;
            this.A09 = (C5V0) 1Lo.A04(this, A0H, (1BY) null, 115765);
            this.A02 = (Hrf) 1Bn.A0E(this, (1BY) null, 114955);
            this.A05 = 7zR.A0c(this);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                this.A01 = (IFc) 1Lo.A04(this, fbUserSession, (1BY) null, 67965);
                FbUserSession fbUserSession2 = this.A00;
                if (fbUserSession2 != null) {
                    this.A08 = (2Qb) 1Lo.A04(this, fbUserSession2, (1BY) null, 17016);
                    Bundle extras = getIntent().getExtras();
                    if (extras == null) {
                        throw 1BK.A0h();
                    }
                    String string = extras.getString("linkUrl");
                    String string2 = extras.getString("originalUserId");
                    Integer valueOf = Integer.valueOf(extras.getInt("linkType"));
                    boolean z = extras.getBoolean("bypassInterstitial");
                    boolean z2 = extras.getBoolean("shouldLaunchInVideoChatHead");
                    Bundle bundle2 = extras.getBundle("rtcCallVideoOptions");
                    if (bundle2 == null) {
                        throw 1BK.A0h();
                    }
                    RtcCallVideoOptions rtcCallVideoOptions = new RtcCallVideoOptions(bundle2.getBoolean("isVideoEnabled"), bundle2.getBoolean("isSetByUser"));
                    boolean z3 = extras.getBoolean("isNotification");
                    boolean z4 = extras.getBoolean("isXMA");
                    ImmutableList immutableList = null;
                    ImmutableList copyOf = extras.getStringArrayList("expectedParticipantIds") == null ? null : ImmutableList.copyOf((Collection) extras.getStringArrayList("expectedParticipantIds"));
                    if (extras.get("expectedParticipantCount") != null) {
                        num = Integer.valueOf(extras.getInt("expectedParticipantCount"));
                    }
                    LinkLogMetadata A00 = R4r.A00.A00(extras.getBundle("linkLogMetadata"));
                    if (extras.getStringArrayList("userIdsToRing") != null) {
                        immutableList = ImmutableList.copyOf((Collection) extras.getStringArrayList("userIdsToRing"));
                    }
                    this.A03 = new JoinVideoChatData(A00, rtcCallVideoOptions, copyOf, immutableList, valueOf, num, Long.valueOf(extras.getLong("ttrcTraceId")), string, string2, extras.getString("rtc_call_trigger"), z, z2, z3, z4);
                    C1F6 A0F = AbG.A0F(606);
                    JoinVideoChatData joinVideoChatData = this.A03;
                    if (joinVideoChatData == null) {
                        str = "joinVideoChatData";
                    } else {
                        Context A01 = FbInjector.A01();
                        AbL.A0y(A0F);
                        try {
                            I8o i8o = new I8o(this, joinVideoChatData, this);
                            1Bn.A0K();
                            FbInjector.A04(A01);
                            this.A04 = i8o;
                            Hrf hrf = this.A02;
                            if (hrf != null) {
                                HVv hVv = this.A0K;
                                11T.A0F(hVv, 1);
                                hrf.A00 = this;
                                hrf.A01 = hVv;
                                return;
                            }
                            str = "roomsJoinActivityHelper";
                        } catch (Throwable th) {
                            1Bn.A0K();
                            FbInjector.A04(A01);
                            throw th;
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public String AWg() {
        return "rtc_join_video_chat_activity";
    }

    public Long Am7() {
        return this.A0L;
    }

    @Override // X.JIj
    public void BOA(String str, Integer num) {
        RoomDialogFragment linkNotActiveDialogFragment;
        Hrf hrf;
        String str2;
        0D2 r0;
        0D2 A0b = BDe().A0b("load_link_progress_fragment");
        if ((A0b instanceof DRp) && (r0 = A0b) != null) {
            r0.A0p();
        }
        if (num == 0S2.A0C) {
            boolean A00 = ((NetworkConnectionMonitor) 1Br.A0B(this.A0G)).A00();
            int i = 2131964845;
            if (!A00) {
                i = 2131965031;
            }
            if (A00) {
                String string = getString(2131964846);
                String string2 = getString(i);
                linkNotActiveDialogFragment = new LinkNotActiveDialogFragment();
                Bundle A05 = 1BK.A05();
                A05.putCharSequence("dialog_title_key", string);
                A05.putCharSequence("dialog_message_key", string2);
                A05.putCharSequence("dialog_link_key", null);
                linkNotActiveDialogFragment.setArguments(A05);
                ((LinkNotActiveDialogFragment) linkNotActiveDialogFragment).A00 = new IGZ(this, 14);
                hrf = this.A02;
                if (hrf != null) {
                    str2 = "TAG_ERROR_DIALOG";
                    hrf.A01(linkNotActiveDialogFragment, str2);
                    return;
                }
                11T.A0L("roomsJoinActivityHelper");
            } else {
                1Br.A0C(this.A0B);
                C00i c00i = this.A0J.A00;
                Hqq hqq = (Hqq) c00i.get();
                MigColorScheme migColorScheme = this.A05;
                if (migColorScheme != null) {
                    int A01 = hqq.A01(migColorScheme);
                    Hqq hqq2 = (Hqq) c00i.get();
                    MigColorScheme migColorScheme2 = this.A05;
                    if (migColorScheme2 != null) {
                        linkNotActiveDialogFragment = RoomDialogFragment.A05(Qoj.A04, 2131964846, i, A01, hqq2.A00(migColorScheme2), 2131967444);
                        linkNotActiveDialogFragment.A01 = this.A0K;
                        hrf = this.A02;
                        if (hrf != null) {
                            str2 = "TAG_TRY_AGAIN_ERROR_DIALOG";
                            hrf.A01(linkNotActiveDialogFragment, str2);
                            return;
                        }
                        11T.A0L("roomsJoinActivityHelper");
                    }
                }
                11T.A0L("migColorScheme");
            }
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-1778741273);
        super.onPause();
        overridePendingTransition(0, R.anim.fade_out);
        0FI.A07(524307666, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1362144602);
        super.onStart();
        overridePendingTransition(0, 0);
        if (1Br.A07(this.A0E).AZk(36311251251956414L)) {
            MessagingPerformanceLogger.A0G((MessagingPerformanceLogger) 1Br.A0B(this.A0C), "join_video_chat");
            synchronized (1Br.A0B(this.A0D)) {
            }
            ((1SG) 1Br.A0B(this.A0F)).A0i("join_rtc_call");
        }
        A12(this);
        0FI.A07(-1546708094, A00);
    }
}
