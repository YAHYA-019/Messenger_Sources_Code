package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.ComposerKeyboardManager;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.media.viewer.theme.MediaViewerTheme;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.sharedimage.sharedmediareactions.SharedMediaWithReactions;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.List;

/* renamed from: X.9lG, reason: invalid class name */
/* loaded from: 9lG.class */
public final class C9lG {
    public long A00;
    public 6QS A01;
    public C9Jb A02;
    public 9fZ A03;
    public MediaViewerTheme A04;
    public MediaMessageItem A05;
    public FbTextView A06;
    public Integer A07;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final FrameLayout A0B;
    public final 06Z A0C;
    public final C00i A0E;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final ThreadKey A0K;
    public final String A0M;
    public final String A0N;
    public final FbUserSession A0O;
    public final 2Wo A0P;
    public final 6Rb A0J = new 8rS(this);
    public final 6F5 A0L = new 8vS(this);
    public final C00i A0D = 1BQ.A02(68543);
    public final C00i A0F = 1BV.A00(66570);

    public C9lG(Context context, View view, FrameLayout frameLayout, 06Z r305, FbUserSession fbUserSession, 9fZ r307, ThreadKey threadKey, FbTextView fbTextView, 2Wo r310, Integer num, String str, String str2, long j) {
        this.A09 = context;
        this.A0O = fbUserSession;
        this.A0I = new 1HH(context, 99435);
        this.A0H = 7zL.A0R(context, 49882);
        this.A0C = r305;
        this.A0B = frameLayout;
        this.A0P = r310;
        this.A06 = fbTextView;
        this.A0K = threadKey;
        this.A0N = str;
        this.A0M = str2;
        this.A0A = view;
        this.A07 = num;
        this.A00 = j;
        this.A03 = r307;
        this.A0E = new C00y(new AHh(context, fbUserSession, 1));
        this.A0G = 7zL.A0R(context, 67454);
        C1os c1os = (C1os) 1Lo.A04(context, fbUserSession, (1BY) null, 66301);
        5zC r0 = (5zC) this.A0H.get();
        boolean A00 = c1os.A00();
        5Su r02 = (5Su) this.A0D.get();
        r0.Cn0(A00 ? r02.A00() : r02.A01());
        2OB r03 = this.A06;
        if (r03 != null) {
            C9pw.A01(r03, this, fbUserSession, 23);
        } else {
            A00(fbUserSession, this);
        }
    }

    public static void A00(FbUserSession fbUserSession, C9lG c9lG) {
        FrameLayout frameLayout = c9lG.A0B;
        frameLayout.setVisibility(0);
        2Wo r0 = c9lG.A0P;
        if (r0.A04()) {
            r0.A03();
        }
        6QS r02 = c9lG.A01;
        if (r02 != null) {
            r02.A1b();
        }
        if (c9lG.A01 == null) {
            int id = frameLayout.getId();
            06Z r03 = c9lG.A0C;
            6QS A0Y = r03.A0Y(id);
            c9lG.A01 = A0Y;
            if (A0Y == null) {
                6QS r04 = new 6QS();
                Bundle A05 = 1BK.A05();
                A05.putBoolean(4YT.A00(458), true);
                r04.setArguments(A05);
                c9lG.A01 = r04;
                C06c A0G = 7zL.A0G(r03);
                A0G.A0M(c9lG.A01, id);
                A0G.A04();
                6QS r05 = c9lG.A01;
                ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = ComposerInitParamsSpec$ComposerLaunchSource.A04;
                r05.A0J = composerInitParamsSpec$ComposerLaunchSource;
                ComposerKeyboardManager composerKeyboardManager = r05.A09;
                if (composerKeyboardManager != null) {
                    composerKeyboardManager.A05 = composerInitParamsSpec$ComposerLaunchSource;
                }
            }
            ((C62h) c9lG.A0E.get()).A00 = c9lG.A0L;
            6QS r06 = c9lG.A01;
            if (r06 == null) {
                throw AnonymousClass001.A0Q("mComposeFragment");
            }
            r06.A0F = c9lG.A0J;
            UserKey A0L = ThreadKey.A0L(c9lG.A0K);
            if (A0L != null) {
                ((AnonymousClass472) 1Bn.A0E(c9lG.A09, (1BY) null, 67579)).A00(A0L).A02(new IUs(fbUserSession, c9lG, 1));
            } else {
                A01(fbUserSession, c9lG, null);
            }
        }
        frameLayout.post(new ADU(c9lG));
        long j = c9lG.A00;
        MediaMessageItem mediaMessageItem = c9lG.A05;
        if ((mediaMessageItem instanceof SharedMediaWithReactions) && c9lG.A07 == 0S2.A0N) {
            SharedMediaWithReactions sharedMediaWithReactions = (SharedMediaWithReactions) mediaMessageItem;
            9fZ r07 = c9lG.A03;
            ThreadKey threadKey = c9lG.A0K;
            String str = sharedMediaWithReactions.A02;
            11T.A0F(threadKey, 0);
            9nJ A0j = 7zQ.A0j(r07.A00);
            long parseLong = Long.parseLong(str);
            9nJ.A03(C98N.MEDIA_VIEWER, 98L.A04, threadKey, A0j, "click", "text_input_reply", 7zU.A0r(parseLong), (List) null, j);
        }
    }

    public static void A01(FbUserSession fbUserSession, C9lG c9lG, User user) {
        if (c9lG.A01 != null) {
            1M7 r0 = Capabilities.A01;
            Capabilities A02 = r0.A02(new int[0]);
            C6kc c6kc = (C6kc) c9lG.A0F.get();
            ThreadKey threadKey = c9lG.A0K;
            if (c6kc.A02(threadKey)) {
                A02 = r0.A02(new int[]{1, 2, 3, 4, 14});
            }
            c9lG.A01.A1q(fbUserSession, (MessagesCollection) null, threadKey, (ThreadSummary) null, (ThreadViewParams) null, user, A02, 5Si.A00, "media_viewer_show_composer");
        }
    }

    public void A02() {
        6QS r0 = this.A01;
        if (r0 != null) {
            r0.A1c();
            this.A01.A1f();
            this.A01.A1b();
        }
        C00i c00i = this.A0F;
        if (!C6kc.A00((C6kc) c00i.get()).AZk(36310469566136601L)) {
            this.A0B.setVisibility(8);
        }
        if (((C6kc) c00i.get()).A02(this.A0K)) {
            return;
        }
        this.A0P.A02();
    }

    public void A03() {
        this.A08 = true;
        2OB r0 = this.A06;
        if (r0 != null) {
            r0.setVisibility(8);
        }
        this.A0A.setVisibility(8);
        6QS r02 = this.A01;
        if (r02 != null) {
            r02.A1d();
            A02();
        }
    }

    public void A04() {
        this.A08 = false;
        2OB r0 = this.A06;
        if (r0 != null) {
            r0.setVisibility(0);
        }
        this.A0A.setVisibility(0);
    }
}
