package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: A9i.class */
public final class A9i implements 62A {
    public final 1Br A00;
    public final 1Br A01;
    public final Set A02;
    public final 1BP A03;

    public A9i(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = FbInjector.A00;
        this.A00 = 1Lm.A00(7zL.A09(), fbUserSession, 65958);
        this.A01 = 1Lm.A00(7zL.A09(), fbUserSession, 68245);
        this.A02 = new 0WH(0);
    }

    private final Uri A00(Attachment attachment, boolean z) {
        VideoData videoData = attachment.A08;
        if (videoData != null) {
            Uri uri = videoData.A0B;
            if (!C0Aj.A02(uri)) {
                11T.A0D(uri);
                return uri;
            }
        }
        89B r0 = (89B) 1Br.A0B(this.A01);
        Uri.Builder AX6 = ((InterfaceC00281am) 1Bn.A0A(83594)).AX6();
        AX6.appendEncodedPath(4YT.A00(1296));
        1G1 r02 = r0.A00;
        if (!r02.A07) {
            AX6.appendQueryParameter(AnonymousClass000.A00(22), r02.Aue().mAuthToken);
        }
        Uri.Builder appendQueryParameter = AX6.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, attachment.A0F).appendQueryParameter("preview", String.valueOf(z));
        if (videoData != null) {
            appendQueryParameter.appendQueryParameter("video", videoData.A0B.getLastPathSegment());
        }
        Uri build = appendQueryParameter.build();
        11T.A0A(build);
        return build;
    }

    public /* bridge */ /* synthetic */ C5fq A4n(Message message) {
        int i;
        int i2;
        ImmutableList immutableList = message.A0r;
        11T.A0A(immutableList);
        if (!1BK.A1Y(immutableList)) {
            ImmutableList A03 = 5Q0.A03(message);
            11T.A0A(A03);
            if (!1BK.A1Y(A03)) {
                throw 1BK.A0g();
            }
        }
        C5w8 c5w8 = new C5w8();
        11T.A0A(immutableList);
        Attachment attachment = (Attachment) 0QD.A0E(immutableList);
        ImmutableList A032 = 5Q0.A03(message);
        11T.A0A(A032);
        MediaResource mediaResource = (MediaResource) 0QD.A0E(A032);
        MediaResource mediaResource2 = (MediaResource) 0QD.A0E(A032);
        Attachment attachment2 = (Attachment) 0QD.A0E(immutableList);
        ImmutableList.Builder builder = ImmutableList.builder();
        if (mediaResource2 != null) {
            Parcelable.Creator creator = VideoDataSource.CREATOR;
            6A9 r0 = new 6A9();
            r0.A03 = mediaResource2.A0E;
            r0.A04 = 6AB.A03;
            RectF rectF = mediaResource2.A0A;
            if (rectF != null) {
                r0.A00 = rectF;
            }
            r0.A05 = mediaResource2.A0z ? 6AA.A02 : 6AA.A03;
            builder.m11011add((Object) new VideoDataSource(r0));
        }
        if (attachment2 != null) {
            Uri A00 = A00(attachment2, false);
            Parcelable.Creator creator2 = VideoDataSource.CREATOR;
            6A9 r02 = new 6A9();
            r02.A03 = A00;
            r02.A04 = 6AB.A05;
            ImmutableMap immutableMap = attachment2.A09;
            if (immutableMap != null && immutableMap.containsKey("dash_manifest")) {
                r02.A07 = (String) immutableMap.get("dash_manifest");
            }
            builder.m11011add((Object) new VideoDataSource(r02));
        }
        ImmutableList A01 = 1Fj.A01(builder);
        6AF r03 = new 6AF();
        r03.A00(A01);
        if (mediaResource != null) {
            if (!C6kg.A03(mediaResource)) {
                throw 1BK.A0g();
            }
            0OO r04 = mediaResource.A0F;
            if (r04 == 0OO.A06 || r04 == 0OO.A05) {
                i = mediaResource.A00;
                i2 = mediaResource.A04;
            } else {
                i = mediaResource.A04;
                i2 = mediaResource.A00;
            }
            C48g c48g = mediaResource.A0O.A00() ? C48g.QUICKCAM : C48g.VIDEO_ATTACHMENT;
            r03.A06 = i;
            r03.A03 = i2;
            r03.A07 = mediaResource.A00();
            r03.A09 = mediaResource.A07;
            r03.A0C = mediaResource.A0D;
            r03.A0D = c48g;
            r03.A01("");
            r03.A0E = mediaResource;
            int i3 = mediaResource.A02;
            if (i3 > 0) {
                r03.A0A = i3;
            }
            int i4 = mediaResource.A01;
            if (i4 > 0) {
                r03.A08 = i4;
            }
        }
        if (attachment != null) {
            r03.A0J = attachment.A00();
            VideoData videoData = attachment.A08;
            if (videoData != null) {
                Uri uri = null;
                String str = videoData.A0F;
                if (str != null) {
                    try {
                        uri = C0A2.A03(0Pz.A0W("data:image/jpeg;charset=utf-8;base64,", str));
                    } catch (SecurityException unused) {
                    }
                }
                r03.A06 = videoData.A08;
                r03.A03 = videoData.A05;
                r03.A05 = videoData.A07;
                r03.A07 = TimeUnit.SECONDS.toMillis(videoData.A03);
                r03.A09 = attachment.A00;
                Uri uri2 = videoData.A0C;
                if (C0Aj.A02(uri2)) {
                    uri2 = A00(attachment, true);
                }
                r03.A0C = uri2;
                r03.A0B = uri;
                r03.A01(attachment.A0F);
                r03.A0D = videoData.A0D;
                r03.A04 = videoData.A06;
            } else {
                Set set = this.A02;
                String str2 = message.A1V;
                if (!0QD.A0k(set, str2)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Attachment without videoData info:\n");
                    A0k.append("fbid: ");
                    A0k.append(attachment.A0F);
                    A0k.append("\nfilename: ");
                    A0k.append(attachment.A0G);
                    A0k.append("\nfileSize: ");
                    A0k.append(attachment.A00);
                    A0k.append("\nid: ");
                    A0k.append(attachment.A0I);
                    A0k.append("\nmimeType: ");
                    A0k.append(attachment.A0L);
                    AnonymousClass001.A1D(4YT.A00(475), "\nid: ", str2, A0k);
                    A0k.append("\nmsgType: ");
                    A0k.append(message.A04());
                    A0k.append(4YT.A00(476));
                    A0k.append(message.A02());
                    0fH.A0o(4YT.A00(681), 11T.A02(A0k));
                    if (str2 == null) {
                        throw 1BK.A0e();
                    }
                    set.add(str2);
                }
            }
        }
        c5w8.A00 = new VideoAttachment(r03);
        return c5w8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (X.C6kg.A03(X.4YU.A0a(r0, 0)) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if (r0.A00() == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQi(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L22
            r0 = r303
            r1 = 0
            com.facebook.messaging.model.attachment.Attachment r0 = X.4YU.A0T(r0, r1)
            com.facebook.messaging.model.attachment.VideoData r0 = r0.A08
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L43
        L22:
            r0 = r302
            com.google.common.collect.ImmutableList r0 = X.5Q0.A03(r0)
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L61
            r0 = r303
            r1 = 0
            com.facebook.ui.media.attachments.model.MediaResource r0 = X.4YU.A0a(r0, r1)
            r306 = r0
            r0 = r306
            boolean r0 = X.C6kg.A03(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L61
        L43:
            r0 = r301
            X.1Br r0 = r0.A00
            X.1Br.A0C(r0)
            r0 = r302
            com.facebook.messaging.model.messages.ParticipantInfo r0 = r0.A0K
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L61
            r0 = r306
            java.lang.String r0 = r0.A00()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L66
        L61:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L66:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9i.BQi(com.facebook.messaging.model.messages.Message):boolean");
    }
}
