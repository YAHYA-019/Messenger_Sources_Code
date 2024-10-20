package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsImage;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.messaging.business.inboxads.common.InboxAdsVideo;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: Dz3.class */
public final class Dz3 extends C1rj {
    public static final CallerContext A08 = CallerContext.A0C("InboxAdsVideoComponentSpec", "InboxAdsVideoComponentSpec");
    public static final C97n A09 = C97n.DEFAULT;
    public FbUserSession A00;
    public InboxAdsData A01;
    public C97n A02;
    public Ezq A03;
    public Evu A04;
    public InboxAdsPostclickRenderState A05;
    public MigColorScheme A06;
    public boolean A07;

    public Dz3() {
        super("InboxAdsVideoCardComponent");
        this.A02 = A09;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A06, this.A02, this.A01, this.A00, 4YU.A0k(), this.A05, this.A04, Boolean.valueOf(this.A07)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x025e, code lost:
    
        if (r0.A07 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0350, code lost:
    
        if (r316 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x034b  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz3.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1351902487) {
            1Is r0 = r302.A00.A01;
            ((Dz3) r0).A03.A03((C5ba) r302.A03[0], 0);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 474447108) {
            return null;
        }
        1Is r02 = r302.A00.A01;
        Object obj2 = r302.A03[0];
        float f = ((2lD) obj).A00;
        Dz3 dz3 = (Dz3) r02;
        boolean z = dz3.A07;
        Evu evu = dz3.A04;
        if (f < 100.0f || evu == null) {
            return null;
        }
        DKH.A1N(evu, obj2, z ? 1 : 0);
        evu.A01(obj2.toString());
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.66W] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        String str;
        E07 e07 = (E07) r303;
        ?? obj = new Object();
        FbUserSession fbUserSession = this.A00;
        InboxAdsData inboxAdsData = this.A01;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A05;
        InboxAdsMediaInfo A00 = 4oD.A00(inboxAdsData);
        InboxAdsVideo inboxAdsVideo = A00.A06;
        inboxAdsVideo.getClass();
        6A9 r0 = new 6A9();
        r0.A03 = inboxAdsVideo.A00();
        r0.A02 = inboxAdsVideo.A05;
        r0.A07 = inboxAdsVideo.A09;
        r0.A04 = 6AB.A05;
        VideoDataSource videoDataSource = new VideoDataSource(r0);
        6TA r02 = new 6TA();
        r02.A03(inboxAdsVideo.A0A);
        r02.A0U = videoDataSource;
        r02.A0L = inboxAdsVideo.A02;
        r02.A1h = inboxAdsVideo.A0D;
        r02.A0C = inboxAdsVideo.A04;
        r02.A1R = true;
        String str2 = A00.A0C;
        C03353xs A0k = DKC.A0k(C26T.A00);
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("ei", str2);
            str = A12.toString();
        } catch (Exception unused) {
            str = null;
        }
        A0k.A0e(str);
        r02.A0X = A0k;
        int i = inboxAdsVideo.A01;
        int i2 = inboxAdsVideo.A03;
        r02.A0I = i;
        r02.A0A = i2;
        r02.A05 = inboxAdsVideo.A00;
        VideoPlayerParams videoPlayerParams = new VideoPlayerParams(r02);
        double max = inboxAdsPostclickRenderState.A08 ? Math.max(inboxAdsPostclickRenderState.A00, A00.A00) : A00.A00;
        HashMap A0u = AnonymousClass001.A0u();
        HashSet A0v = AnonymousClass001.A0v();
        1Fz r03 = FbUserSession.A00;
        CallerContext callerContext = A08;
        ImmutableMap.Builder A0c = 1BK.A0c();
        InboxAdsImage inboxAdsImage = inboxAdsVideo.A06;
        if (inboxAdsImage != null) {
            A0c.put("CoverImageParamsKey", 2Dp.A00(inboxAdsImage.A00()));
        }
        ImmutableMap build = A0c.build();
        A0u.clear();
        A0u.putAll(build);
        ((66W) obj).A00 = 6TF.A00(fbUserSession, callerContext, videoPlayerParams, A0u, (java.util.Map) null, A0v, max, false);
        IPf iPf = (IPf) 1Bi.A03(115850);
        iPf.A03 = inboxAdsVideo;
        iPf.A02 = fbUserSession;
        e07.A00 = iPf;
        e07.A01 = (6TI) ((66W) obj).A00;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
