package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.video.plugins.LoadingSpinnerPlugin;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: H54.class */
public final class H54 extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A09 = CallerContext.A06(H54.class);
    public static final String __redex_internal_original_name = "VideoStickerAttachmentView";
    public FbDraweeView A00;
    public ImageAttachmentData A01;
    public Message A02;
    public C62t A03;
    public RichVideoPlayer A04;
    public 6TI A05;
    public final Context A06;
    public final 1Br A07;
    public final 1Br A08;

    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    public H54(Context context) {
        super(context, null, 0);
        this.A06 = context;
        this.A07 = 1Bu.A01(context, 49960);
        this.A08 = 7zM.A0O();
        A0U(2132542931);
        this.A04 = (RichVideoPlayer) C09s.A01(this, 2131366967);
        this.A00 = DKC.A0M(this, 2131363420);
        this.A04.A0J(6TN.A0B);
        ?? r0 = this.A04;
        Context context2 = this.A06;
        GOo.A17(context2, (RichVideoPlayer) r0);
        r0.A0P(new 6dT(context2));
        r0.A0P(new LoadingSpinnerPlugin(context2));
        r0.A0R(true);
        r0.setBackgroundResource(2132213982);
        FbDraweeView fbDraweeView = this.A00;
        if (fbDraweeView != null) {
            fbDraweeView.A0M(InterfaceC07034in.A01);
            fbDraweeView.A0A(2132213982);
        }
    }

    public static final void A00(Uri uri, FbUserSession fbUserSession, H54 h54, MediaResource mediaResource, String str) {
        Uri uri2;
        6A9 r0 = new 6A9();
        r0.A03 = uri;
        r0.A04 = 0CO.A03(uri) ? 6AB.A03 : 6AB.A05;
        VideoDataSource videoDataSource = new VideoDataSource(r0);
        if (str == null) {
            str = GOq.A10(uri);
        }
        6TA r02 = new 6TA();
        r02.A0U = videoDataSource;
        r02.A1h = true;
        r02.A0k = true;
        r02.A0s = true;
        r02.A03(str);
        6TF A0L = AbstractC2327GOs.A0L(fbUserSession, r02);
        if (mediaResource != null && (uri2 = mediaResource.A0C) != null) {
            2IA A01 = 2IA.A01(uri2);
            if (mediaResource.A04 < mediaResource.A00) {
                A01.A0C = new C2591Gia(90);
            }
            A0L.A03(A01.A04(), 4YT.A00(239));
        }
        h54.A05 = A0L.A01();
    }

    public static final void A01(H54 h54, 6TI r302) {
        C62t c62t;
        if (r302 != null) {
            h54.A04.A0N(r302);
            Message message = h54.A02;
            11T.A0I(message, 4YT.A00(ActionId.ASYNC_ACTION_FAIL));
            String str = message.A1g;
            if (str == null || (c62t = h54.A03) == null) {
                return;
            }
            c62t.CUU(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    public final void A0V(C52j c52j) {
        C62t c62t;
        ?? r0 = this.A04;
        if (r0.isPlaying()) {
            r0.CWm(c52j);
        }
        this.A00.setVisibility(0);
        r0.setVisibility(8);
        Message message = this.A02;
        11T.A0I(message, 4YT.A00(ActionId.ASYNC_ACTION_FAIL));
        String str = message.A1g;
        if (str == null || (c62t = this.A03) == null) {
            return;
        }
        c62t.CUT(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (X.7X4.A00(r309) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        A00(r309, r0, r301, r0, r0.A0C);
        r308 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (X.C0Aj.A02(r309) == false) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onVisibilityChanged(android.view.View r302, int r303) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H54.onVisibilityChanged(android.view.View, int):void");
    }
}
