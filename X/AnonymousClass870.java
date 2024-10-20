package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.870, reason: invalid class name */
/* loaded from: 870.class */
public final class AnonymousClass870 {
    public static final AnonymousClass870 A01 = new Object();
    public static final 1Br A00 = 1BK.A0C();

    public static final VideoPlayerParams A00(C5j5 c5j5, 6Ut r302, VideoAttachment videoAttachment, 6AH r304, boolean z, boolean z2) {
        String A012;
        Uri uri;
        Uri uri2;
        11T.A0F(videoAttachment, 0);
        VideoDataSource A002 = AnonymousClass871.A00(c5j5, videoAttachment);
        C00i c00i = A00.A00;
        boolean z3 = false;
        if (!1BK.A0M(c00i).AZk(36325218481951181L) && A002 != null && (uri2 = A002.A03) != null && String.valueOf(uri2).length() > 0) {
            String scheme = uri2.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            if (scheme.equals(DGWRegionHintManager.SERVICE_KEY_MSYS)) {
                String A0W = 0CV.A0W(String.valueOf(uri2), 0Pz.A0W(scheme, "://"), "content://");
                Uri uri3 = null;
                try {
                    uri3 = C0A2.A03(A0W);
                } catch (SecurityException unused) {
                }
                6A9 A003 = GRA.A00(A002);
                A003.A03 = uri3;
                A002 = new VideoDataSource(A003);
            }
        }
        String str = videoAttachment.A0G;
        if (str == null || str.length() == 0) {
            A012 = A01(A002 != null ? A002.A03 : null, c5j5);
        } else {
            A012 = str;
        }
        6TA r0 = new 6TA();
        r0.A03(A012);
        r0.A0U = A002;
        r0.A0L = (int) videoAttachment.A07;
        r0.A0J = (int) videoAttachment.A0A;
        r0.A04 = (int) videoAttachment.A08;
        r0.A1h = videoAttachment.A0M;
        r0.A0C = videoAttachment.A04;
        int i = videoAttachment.A01;
        int i2 = videoAttachment.A02;
        r0.A0I = i;
        r0.A0A = i2;
        r0.A05 = videoAttachment.A00;
        r0.A1k = z;
        r0.A1e = videoAttachment.A0L;
        r0.A0e = str;
        r0.A02(r302, TraceFieldType.TransportType);
        r0.A1L = z2;
        if (r304 != null) {
            Float f = r304.A00;
            if (f != null) {
                r0.A02(String.valueOf(f.floatValue()), "unified_upload_mos_client_side");
            }
            String str2 = r304.A01;
            if (str2 != null) {
                r0.A02(str2, "thread_id");
            }
        }
        if (A002 != null && (uri = A002.A03) != null && 11T.A02(uri).length() > 0) {
            z3 = 4YV.A1a(uri.getScheme(), DGWRegionHintManager.SERVICE_KEY_MSYS, false);
        }
        if (r302 != null && r302 == 6Ut.A02 && 1BK.A0M(c00i).AZk(36325218481951181L) && z3) {
            r0.A13 = true;
        }
        if (z) {
            r0.A12 = true;
        }
        return new VideoPlayerParams(r0);
    }

    public static final String A01(Uri uri, C5j5 c5j5) {
        if (uri != null) {
            return (String) 7zR.A0q(new JTB(uri, c5j5, 1), ZonePolicy.A0F);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoMessagePlayerParamsFactory_client_generated_");
        return AnonymousClass001.A0a(C04I.A00(), A0k);
    }

    public final 6TI A02(FbUserSession fbUserSession, CallerContext callerContext, 2Dp r304, 3xX r305, C5j5 c5j5, 6Ut r307, AaE aaE, VideoAttachment videoAttachment, 6AH r310, ImmutableMap.Builder builder, java.util.Map map, boolean z, boolean z2) {
        Uri uri;
        ImmutableMap.Builder builder2 = builder;
        11T.A0F(c5j5, 2);
        7zR.A1P(callerContext, fbUserSession);
        VideoPlayerParams A002 = A00(c5j5, r307, videoAttachment, r310, true, z2);
        if (builder == null) {
            builder2 = new ImmutableMap.Builder();
        }
        String A0u = 4YV.A0u(videoAttachment.A0C);
        VideoDataSource videoDataSource = A002.A0V;
        if (videoDataSource == null) {
            throw 1BK.A0h();
        }
        Object A0q = 7zR.A0q(new 88J(r304, c5j5, aaE, A0u, String.valueOf(videoDataSource.A03)), ZonePolicy.A0F);
        11T.A0A(A0q);
        builder2.put("CoverImageParamsKey", A0q);
        if (r305 != null) {
            builder2.put("VideoPreviewPostprocessor", r305);
        }
        MediaResource mediaResource = videoAttachment.A0E;
        if (mediaResource != null && (uri = mediaResource.A0C) != null && AnonymousClass871.A03(c5j5, videoAttachment)) {
            2IA A012 = 2IA.A01(uri);
            A012.A0C = GiZ.A00(mediaResource);
            builder2.put("OverlayImageParamsKey", A012.A04());
        }
        HashMap A0u2 = AnonymousClass001.A0u();
        HashSet A0v = AnonymousClass001.A0v();
        1Fz r0 = FbUserSession.A00;
        double aspectRatio = aaE.getAspectRatio();
        ImmutableMap build = builder2.build();
        A0u2.clear();
        A0u2.putAll(build);
        return 6TF.A00(fbUserSession, callerContext, A002, A0u2, map, A0v, aspectRatio, z);
    }
}
