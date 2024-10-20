package com.facebook.messaging.threadview.messagelist.item.video;

import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.6TN;
import X.6UF;
import X.C00i;
import X.C6d3;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.threadview.messagelist.item.video.ThreadViewVideoAttachmentRichPlayer;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.stash.core.Stash;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.player.RichVideoPlayer;
import java.util.concurrent.Executor;

/* loaded from: ThreadViewVideoAttachmentRichPlayer.class */
public final class ThreadViewVideoAttachmentRichPlayer implements CallerContextable {
    public boolean A00;
    public 1BY A01;
    public final FbUserSession A02;
    public final C6d3 A06;
    public final RichVideoPlayer A07;
    public final C00i A04 = new 1BV((1BY) null, 66317);
    public final C00i A05 = new 1BQ(49694);
    public final C00i A03 = new 1BQ(16511);

    /* JADX WARN: Type inference failed for: r0v18, types: [X.6d3, X.6UF] */
    public ThreadViewVideoAttachmentRichPlayer(FbUserSession fbUserSession, 1BO r303, RichVideoPlayer richVideoPlayer) {
        this.A01 = new 1BY(r303);
        this.A02 = fbUserSession;
        Boolean bool = (Boolean) 1Bn.A0E((Context) null, (1BY) null, 99954);
        this.A07 = richVideoPlayer;
        ?? r0 = new 6UF() { // from class: X.6d3
            public 6cO A00;

            public void BlE(C52j c52j) {
                Message message;
                6cO r02 = this.A00;
                if (r02 != null) {
                    6cM r03 = r02.A00;
                    CallerContext callerContext = 6cM.A1k;
                    81M r04 = r03.A0r;
                    if (r04 == null || (message = r03.A0m) == null) {
                        return;
                    }
                    r04.C1r(message, c52j);
                }
            }

            public void BlF() {
                Message message;
                6cO r02 = this.A00;
                if (r02 != null) {
                    6cM r03 = r02.A00;
                    CallerContext callerContext = 6cM.A1k;
                    81M r04 = r03.A0r;
                    if (r04 == null || (message = r03.A0m) == null) {
                        return;
                    }
                    r04.C1s(message);
                }
            }

            public void BwO(C6cn c6cn) {
                C01s A09 = 1BK.A09(ThreadViewVideoAttachmentRichPlayer.this.A03);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("RVPErrorEvent: ");
                A0k.append(c6cn.A02);
                A0k.append(" / ");
                A09.D0v("ThreadViewVideoAttachmentRichPlayer", AnonymousClass001.A0a(c6cn.A00, A0k));
                6cO r02 = this.A00;
                if (r02 != null) {
                    6cM r03 = r02.A00;
                    CallerContext callerContext = 6cM.A1k;
                    r03.A0G.A06(null);
                    r03.A0G.A0A(2132213820);
                    r03.A0C.setText(2131957317);
                }
            }

            public void Bz2() {
                ThreadViewVideoAttachmentRichPlayer threadViewVideoAttachmentRichPlayer = ThreadViewVideoAttachmentRichPlayer.this;
                RichVideoPlayer richVideoPlayer2 = threadViewVideoAttachmentRichPlayer.A07;
                6TI r02 = richVideoPlayer2.A0F;
                if (r02 != null) {
                    VideoPlayerParams videoPlayerParams = r02.A03;
                    9Ls r03 = (9Ls) threadViewVideoAttachmentRichPlayer.A04.get();
                    6TN B3f = richVideoPlayer2.B3f();
                    PlayerOrigin playerOrigin = richVideoPlayer2.A0r;
                    int BJL = richVideoPlayer2.BJL();
                    int i = videoPlayerParams.A0M;
                    boolean z = false;
                    if (Math.abs(i - BJL) < 2000) {
                        z = true;
                    }
                    richVideoPlayer2.Afn();
                    2Jy r04 = new 2Jy("messenger_video_started_playing");
                    r04.A0D(TraceFieldType.VideoId, videoPlayerParams.A0k);
                    r04.A09(B3f, "player");
                    r04.A09(playerOrigin, "player_origin");
                    if (i > 0) {
                        r04.A0B("duration", i);
                    }
                    r04.A0F("is_partial", !z);
                    C1kw c1kw = r03.A00;
                    if (7bN.A00 == null) {
                        synchronized (7bN.class) {
                            if (7bN.A00 == null) {
                                7bN.A00 = new C2J3(c1kw);
                            }
                        }
                    }
                    7bN.A00.A03(r04);
                }
            }

            public void CBx(long j) {
                Message message;
                String str;
                Stash A00;
                6cO r02 = this.A00;
                if (r02 != null) {
                    6cM r03 = r02.A00;
                    CallerContext callerContext = 6cM.A1k;
                    if (r03.A17) {
                        r03.A17 = false;
                        6cM.A0C(r03);
                    }
                    9kT r04 = (9kT) r03.A0f.get();
                    VideoPlayerParams videoPlayerParams = r03.A12;
                    if (videoPlayerParams != null && (str = videoPlayerParams.A0k) != null && !str.isEmpty() && (A00 = 9kT.A00(r04)) != null) {
                        ((Executor) r04.A00.get()).execute(new AGK(r04, A00, videoPlayerParams));
                    }
                    if (!r03.A1C || (message = r03.A0m) == null || message.A1V == null) {
                        return;
                    }
                    CEE cee = (CEE) r03.A0Y.get();
                    FbUserSession fbUserSession2 = r03.A0E;
                    String str2 = r03.A0m.A1V;
                    11T.A0F(fbUserSession2, 0);
                    11T.A0F(str2, 1);
                    CEE.A00(cee, str2, "SEEN");
                    r03.A1C = false;
                }
            }

            public void CO0(C6cu c6cu) {
                Message message;
                6cO r02 = this.A00;
                if (r02 != null) {
                    6cM r03 = r02.A00;
                    6cM.A0M(r03);
                    6cM.A05(r03);
                    6cM r04 = r02.A00;
                    81M r05 = r04.A0r;
                    if (r05 == null || (message = r04.A0m) == null) {
                        return;
                    }
                    r05.C1p(message, C52j.A08, false);
                }
            }

            public void CTd() {
            }
        };
        this.A06 = r0;
        richVideoPlayer.A0E = r0;
        richVideoPlayer.A0M(PlayerOrigin.A0U);
        richVideoPlayer.A0J(6TN.A0F);
        this.A00 = bool.booleanValue();
    }
}
