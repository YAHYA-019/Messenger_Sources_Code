package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.ImageAttachmentUris;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.AudioData;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.4ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ys.class */
public final class C12114ys {
    public static final Pattern A0B = Pattern.compile("_[ts]\\.jpg$");
    public static final Pattern A0C = Pattern.compile("\\/[ts]([^/]+\\.jpg)$");
    public final C00653oY A09 = (C00653oY) 1Bi.A03(32769);
    public final C00663oZ A0A = (C00663oZ) 1Bi.A03(32770);
    public final C00673oa A08 = (C00673oa) 1Bi.A03(32771);
    public final C4yt A03 = (C4yt) 1Bi.A03(49421);
    public final C4yu A04 = (C4yu) 1Bi.A03(49422);
    public final C00i A01 = new 1BQ(16511);
    public final C00i A02 = new 1BQ(16385);
    public final C00i A06 = new 1BQ(16387);
    public final C00i A00 = new 1BQ(66265);
    public final C00i A07 = new 1BQ(68928);
    public final Set A05 = new 0WH(0);

    private Uri A00(Attachment attachment, String str, String str2) {
        Uri.Builder A01 = 1JF.A0B(str2) ? this.A03.A01(null) : this.A03.A01(str2);
        if (str != null && !str.startsWith("m_")) {
            str = 0Pz.A0W("m_", str);
        }
        A01.appendQueryParameter("mid", str);
        A01.appendQueryParameter("aid", attachment != null ? attachment.A0I : ConstantsKt.CAMERA_ID_BACK);
        return A01.build();
    }

    public static ImageAttachmentData A01(MediaResource mediaResource) {
        int i;
        int i2;
        ImageAttachmentUris imageAttachmentUris = new ImageAttachmentUris(mediaResource.A0E);
        0OO r0 = mediaResource.A0F;
        boolean z = false;
        if (r0 == 0OO.A06 || r0 == 0OO.A05 || r0 == 0OO.A07 || r0 == 0OO.A08) {
            i = mediaResource.A00;
            i2 = mediaResource.A04;
        } else {
            i = mediaResource.A04;
            i2 = mediaResource.A00;
        }
        String str = null;
        boolean z2 = mediaResource.A14;
        String str2 = mediaResource.A0l;
        if (mediaResource.A0Q == 5HP.A0G) {
            z = true;
        }
        String str3 = mediaResource.A0s;
        if (str3 != null) {
            str = str3;
        }
        return new ImageAttachmentData(null, imageAttachmentUris, null, null, mediaResource, null, null, str2, null, null, str, null, i2, i, 0L, false, false, z, false, z2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:39|(6:42|(1:44)|89|46|(2:48|(3:50|51|(10:63|(1:65)|66|67|68|69|(4:73|(1:75)|76|77)|80|31|32)(2:55|(1:57)(1:58)))(2:83|84))(2:85|(15:87|51|(1:53)|59|61|63|(0)|66|67|68|69|(5:71|73|(0)|76|77)|80|31|32)(2:88|84))|40)|90|91|92|93|94|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
    
        if (r0.A02 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0288  */
    /* JADX WARN: Type inference failed for: r309v0, types: [java.lang.Object, X.61r] */
    /* JADX WARN: Type inference failed for: r309v2, types: [java.lang.Object, X.61r] */
    /* JADX WARN: Type inference failed for: r309v3, types: [java.lang.Object, X.61r] */
    /* JADX WARN: Type inference failed for: r309v7, types: [java.lang.Object, X.61r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.messaging.attachments.ImageAttachmentUris A02(com.facebook.messaging.model.attachment.Attachment r302, com.facebook.messaging.model.attachment.AttachmentImageMap r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12114ys.A02(com.facebook.messaging.model.attachment.Attachment, com.facebook.messaging.model.attachment.AttachmentImageMap, java.lang.String, boolean):com.facebook.messaging.attachments.ImageAttachmentUris");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.7Zr, X.2JY, com.facebook.graphservice.tree.TreeJNI] */
    public static VideoAttachmentData A03(C12114ys c12114ys, Message message) {
        String A0r;
        5Pm r0 = message.A08;
        r0.getClass();
        6Ay BCm = r0.BCm();
        BCm.getClass();
        ?? A0u = BCm.A0u();
        if (A0u == 0) {
            return null;
        }
        ImmutableList A06 = c12114ys.A06(A0u, message);
        2JY A0B2 = 1BK.A0B((2JY) A0u, C10334t7.class, -1967793586, 537206042);
        if (A0B2 == null) {
            A0B2 = A0u.A0v();
        }
        Uri uri = null;
        6AC r02 = 6AC.A01;
        int intValue = A0u.getIntValue(113126854);
        int intValue2 = A0u.getIntValue(-1221029593);
        String A0k = A0u.A0k();
        int intValue3 = A0u.getIntValue(115581542);
        C48g c48g = C48g.VIDEO_ATTACHMENT;
        if (A0B2 != null && (A0r = A0B2.A0r(116076)) != null) {
            try {
                Uri A03 = C0A2.A03(A0r);
                if (A03 != null) {
                    uri = A03;
                }
            } catch (SecurityException unused) {
            }
        }
        return new VideoAttachmentData(null, null, uri, r02, c48g, null, null, null, A0k, null, null, null, null, A06, 0, 0, intValue3, -1, 0, 0, intValue2, 0, 0, 0, intValue, false, false);
    }

    private AvatarAudioMessagePose A04(AudioData audioData, Message message) {
        Long l = audioData.A06;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return null;
        }
        String str = audioData.A08;
        if (!1JF.A0B(str)) {
            String str2 = audioData.A0B;
            if (!1JF.A0B(str2)) {
                String str3 = audioData.A07;
                if (!1JF.A0B(str3)) {
                    String str4 = audioData.A0A;
                    if (!1JF.A0B(str4)) {
                        AvatarAudioMessagePose avatarAudioMessagePose = AvatarAudioMessagePose.A0D;
                        return new AvatarAudioMessagePose(str, null, str2, null, "", str3, str4, audioData.A09, C21q.A00(longValue), 0L);
                    }
                }
            }
        }
        ArrayList arrayList = ((C9ce) this.A07.get()).A01;
        if (arrayList == null) {
            return null;
        }
        C1q8 A04 = message.A04();
        if (A04 != C1q8.A0M && A04 != C1q8.A0A) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AvatarAudioMessagePose avatarAudioMessagePose2 = (AvatarAudioMessagePose) it.next();
            if (avatarAudioMessagePose2.A00 == longValue) {
                return avatarAudioMessagePose2;
            }
        }
        return null;
    }

    public static VideoDataSource A05(C7Zr c7Zr) {
        String A0r = c7Zr.A0r(752641086);
        VideoDataSource videoDataSource = null;
        if (A0r != null) {
            try {
                Uri A03 = C0A2.A03(A0r);
                if (A03 != null) {
                    Parcelable.Creator creator = VideoDataSource.CREATOR;
                    6A9 r0 = new 6A9();
                    r0.A03 = A03;
                    r0.A04 = 6AB.A05;
                    r0.A07 = c7Zr.A0r(-659020924);
                    videoDataSource = new VideoDataSource(r0);
                }
            } catch (SecurityException unused) {
            }
        }
        return videoDataSource;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v8 com.facebook.video.engine.api.VideoDataSource, still in use, count: 2, list:
          (r305v8 com.facebook.video.engine.api.VideoDataSource) from 0x0035: PHI (r305v7 com.facebook.video.engine.api.VideoDataSource) = (r305v6 com.facebook.video.engine.api.VideoDataSource), (r305v8 com.facebook.video.engine.api.VideoDataSource) binds: [B:8:0x009c, B:6:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r305v8 com.facebook.video.engine.api.VideoDataSource) from 0x0032: IF  (r305v8 com.facebook.video.engine.api.VideoDataSource) != (null com.facebook.video.engine.api.VideoDataSource)  -> B:7:0x0035 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private com.google.common.collect.ImmutableList A06(X.C7Zr r302, com.facebook.messaging.model.messages.Message r303) {
        /*
            r301 = this;
            r0 = r303
            com.google.common.collect.ImmutableList r0 = X.5Q0.A03(r0)
            r1 = 0
            java.lang.Object r0 = X.2Ri.A0D(r0, r1)
            com.facebook.ui.media.attachments.model.MediaResource r0 = (com.facebook.ui.media.attachments.model.MediaResource) r0
            r304 = r0
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r305 = r0
            r0 = r305
            r1 = 0
            java.lang.Object r0 = X.2Ri.A0D(r0, r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            r306 = r0
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L3d
            r0 = r302
            if (r0 == 0) goto L9c
            r0 = r302
            com.facebook.video.engine.api.VideoDataSource r0 = A05(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3d
        L35:
            r0 = r307
            r1 = r305
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
        L3d:
            r0 = r306
            if (r0 == 0) goto L5d
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0V
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0q(r0)
            r308 = r0
            r0 = r301
            r1 = r306
            r2 = r308
            com.facebook.video.engine.api.VideoDataSource r0 = r0.A0C(r1, r2)
            r305 = r0
            r0 = r307
            r1 = r305
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
        L5d:
            r0 = r303
            X.5Pm r0 = r0.A08
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = r305
            X.6Ay r0 = r0.BCm()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = r305
            X.7Zr r0 = r0.A0u()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = r305
            com.facebook.video.engine.api.VideoDataSource r0 = A05(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = r307
            r1 = r305
            com.google.common.collect.ImmutableList$Builder r0 = r0.m11011add(r1)
        L96:
            r0 = r307
            com.google.common.collect.ImmutableList r0 = r0.build()
            return r0
        L9c:
            r0 = r301
            r1 = r304
            com.facebook.video.engine.api.VideoDataSource r0 = r0.A0D(r1)
            r305 = r0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12114ys.A06(X.7Zr, com.facebook.messaging.model.messages.Message):com.google.common.collect.ImmutableList");
    }

    public int A07(Message message) {
        ImmutableList immutableList = message.A0r;
        int i = 0;
        if (!immutableList.isEmpty() || !5Q0.A03(message).isEmpty()) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                if (C00673oa.A02((Attachment) it.next())) {
                    i++;
                }
            }
            if (i <= 0) {
                1Du it2 = 5Q0.A03(message).iterator();
                while (it2.hasNext()) {
                    if (C6kg.A02((MediaResource) it2.next())) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public int A08(MessageRepliedTo messageRepliedTo) {
        ImmutableList immutableList = messageRepliedTo.A07;
        int i = 0;
        if (!09K.A01(immutableList)) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                if (C00673oa.A02((Attachment) it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b7, code lost:
    
        if (r313 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a7, code lost:
    
        if (r327 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023d, code lost:
    
        if (r320 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x029b, code lost:
    
        if (X.C0Aj.A02(r0) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.facebook.xapp.messaging.threadview.model.audio.WaveformData] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.xapp.messaging.threadview.model.audio.WaveformData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.attachments.AudioAttachmentData A09(com.facebook.messaging.model.messages.Message r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12114ys.A09(com.facebook.messaging.model.messages.Message, java.lang.String):com.facebook.messaging.attachments.AudioAttachmentData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0137, code lost:
    
        if (r335 == null) goto L20;
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.61r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.attachments.ImageAttachmentData A0A(com.facebook.messaging.model.attachment.Attachment r302, com.facebook.ui.media.attachments.model.MediaResource r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12114ys.A0A(com.facebook.messaging.model.attachment.Attachment, com.facebook.ui.media.attachments.model.MediaResource, java.lang.String):com.facebook.messaging.attachments.ImageAttachmentData");
    }

    public VideoAttachmentData A0B(Message message) {
        if (message == null) {
            return null;
        }
        if (!C00663oZ.A01(message)) {
            if (C00663oZ.A00(message)) {
                return A03(this, message);
            }
            return null;
        }
        Attachment attachment = (Attachment) 2Ri.A0D(message.A0r, (Object) null);
        MediaResource mediaResource = (MediaResource) 2Ri.A0D(5Q0.A03(message), (Object) null);
        ImmutableList A06 = A06(null, message);
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        Integer num = null;
        int i3 = 0;
        boolean z = false;
        Uri uri = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i5 = 0;
        boolean z2 = false;
        C48g c48g = null;
        Uri uri2 = null;
        MediaResource mediaResource2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        6AC r0 = 6AC.A02;
        if (mediaResource != null) {
            Preconditions.checkArgument(C6kg.A03(mediaResource));
            C4yu c4yu = this.A04;
            int i9 = mediaResource.A04;
            int i10 = mediaResource.A00;
            int A00 = 0OP.A00(mediaResource.A0F);
            RectF rectF = mediaResource.A0A;
            7Xn r02 = 7Xn.A03;
            11T.A0F(rectF, 3);
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            7Xo A002 = C4yx.A00(rectF, c4yu, r02, null, of, 0.0f, i9, i10, A00, 0, -1, false);
            0OO A01 = 0OP.A01(0OO.A03, (A002.A0C + A002.A07) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
            i6 = A002.A0D;
            i3 = A002.A0B;
            if (A01 == 0OO.A06 || A01 == 0OO.A05) {
                i6 = i3;
                i3 = i6;
            }
            c48g = 7Xp.A00(mediaResource);
            i = mediaResource.A00();
            i2 = (int) mediaResource.A07;
            uri2 = mediaResource.A0D;
            str = mediaResource.A0l;
            str6 = mediaResource.A0t;
            str2 = "";
            mediaResource2 = mediaResource;
            int i11 = mediaResource.A02;
            if (i11 > 0) {
                i7 = i11;
            }
            int i12 = mediaResource.A01;
            if (i12 > 0) {
                i8 = i12;
            }
            str4 = mediaResource.A0s;
        }
        if (attachment != null) {
            z = attachment.A00();
            str = attachment.A0C;
            str4 = attachment.A0L;
            str6 = attachment.A0N;
            z2 = attachment.A0P;
            VideoData videoData = attachment.A08;
            if (videoData != null) {
                i = videoData.A02;
                if (i == 0) {
                    i = (int) (videoData.A03 * 1000);
                }
                i6 = videoData.A08;
                i3 = videoData.A05;
                i5 = videoData.A07;
                i2 = attachment.A00;
                uri2 = videoData.A0C;
                uri = videoData.A0A;
                str5 = videoData.A0F;
                c48g = videoData.A0D;
                str2 = attachment.A0F;
                num = attachment.A0A;
                str3 = attachment.A0H;
                i4 = videoData.A06;
            } else {
                Set set = this.A05;
                String str7 = message.A1V;
                if (!set.contains(str7)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    String A0p = 4YV.A0p(attachment, A0k);
                    A0k.append(str4);
                    AnonymousClass001.A1D("\n\nmessage info:", A0p, str7, A0k);
                    A0k.append("\nmsgType: ");
                    A0k.append(message.A04());
                    A0k.append("\nchannelSource: ");
                    1BK.A09(this.A01).D0v("MESSENGER_INLINE_VIDEO_ATTACHMENT_WITHOUT_VIDEO_DATA", AnonymousClass001.A0a(message.A02(), A0k));
                    set.add(str7);
                }
            }
        }
        return new VideoAttachmentData(null, uri, uri2, r0, c48g, mediaResource2, num, str, str2, str3, str4, str5, str6, A06, 0, 0, i, i8, i2, 0, i3, i4, i5, i7, i6, z, z2);
    }

    public VideoDataSource A0C(Attachment attachment, boolean z) {
        Uri.Builder AX6;
        Uri build;
        Uri uri;
        VideoData videoData = attachment.A08;
        if (z) {
            build = videoData.A0B;
        } else {
            if (videoData != null) {
                build = videoData.A0B;
                if (C0Aj.A02(build)) {
                    String str = videoData.A0G;
                    if (str != null) {
                        C4yt c4yt = this.A03;
                        Uri uri2 = null;
                        try {
                            uri2 = C0A2.A03(str);
                        } catch (SecurityException unused) {
                        }
                        AX6 = null;
                        if (uri2 != null) {
                            Uri.Builder encodedFragment = C4yt.A01.buildUpon().encodedPath(uri2.getEncodedPath()).encodedQuery(uri2.getEncodedQuery()).encodedFragment(uri2.getEncodedFragment());
                            if (!TextUtils.isEmpty(str)) {
                                encodedFragment.appendQueryParameter("device_id", ((1H2) c4yt.A00.get()).A02());
                                C4yt.A00(encodedFragment, null);
                            }
                            AX6 = encodedFragment;
                        }
                        build = AX6.build();
                    }
                }
            }
            AX6 = ((InterfaceC00281am) 1Bn.A0A(83594)).AX6();
            AX6.appendEncodedPath("method/messaging.attachmentRedirect");
            C4yt.A00(AX6, null);
            AX6.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, attachment.A0F);
            AX6.appendQueryParameter("preview", "false");
            if (videoData != null) {
                AX6.appendQueryParameter("video", videoData.A0B.getLastPathSegment());
            }
            build = AX6.build();
        }
        Parcelable.Creator creator = VideoDataSource.CREATOR;
        6A9 r0 = new 6A9();
        r0.A03 = build;
        r0.A04 = 6AB.A05;
        if (videoData != null && (uri = videoData.A09) != null) {
            r0.A02 = uri;
        }
        ImmutableMap immutableMap = attachment.A09;
        if (immutableMap != null && immutableMap.containsKey("dash_manifest")) {
            r0.A07 = (String) immutableMap.get("dash_manifest");
        }
        return new VideoDataSource(r0);
    }

    public VideoDataSource A0D(MediaResource mediaResource) {
        Parcelable.Creator creator = VideoDataSource.CREATOR;
        6A9 r0 = new 6A9();
        r0.A03 = mediaResource.A0E;
        r0.A04 = 6AB.A03;
        RectF rectF = mediaResource.A0A;
        if (rectF != null) {
            r0.A00 = rectF;
        }
        r0.A05 = mediaResource.A0z ? 6AA.A02 : 6AA.A03;
        if (((2yD) this.A06.get()).AZk(72340791296528559L)) {
            r0.A07 = mediaResource.A0k;
        }
        return new VideoDataSource(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0197, code lost:
    
        if (r0.size() != r0.size()) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A0E(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12114ys.A0E(com.facebook.messaging.model.messages.Message):com.google.common.collect.ImmutableList");
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.61r] */
    public ImmutableList A0F(Message message) {
        5Pm r0;
        ImageAttachmentData imageAttachmentData;
        C7Zr A0u;
        2JY A0v;
        if (message.A1V == null || (r0 = message.A08) == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        String str = null;
        ImageAttachmentUris imageAttachmentUris = null;
        6Ay BCm = r0.BCm();
        if (BCm == null || (A0u = BCm.A0u()) == null || (A0v = A0u.A0v()) == null) {
            imageAttachmentData = new ImageAttachmentData(null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0L, false, false, false, false, false);
        } else {
            String A0k = A0u.A0k();
            if (A0k != null) {
                str = A0k;
            }
            String A0r = A0v.A0r(116076);
            if (A0r != null) {
                try {
                    Uri A03 = C0A2.A03(A0r);
                    if (A03 != null) {
                        ?? obj = new Object();
                        obj.A02 = A03;
                        imageAttachmentUris = new ImageAttachmentUris((C61r) obj);
                    }
                } catch (SecurityException unused) {
                }
            }
            imageAttachmentData = new ImageAttachmentData(null, imageAttachmentUris, null, null, null, null, null, null, str, null, null, null, A0v.getIntValue(-1221029593), A0v.getIntValue(113126854), 0L, false, false, false, false, false);
        }
        builder.m11011add((Object) imageAttachmentData);
        return builder.build();
    }

    public boolean A0G(Message message) {
        1Du it = message.A0r.iterator();
        while (it.hasNext()) {
            if (C00673oa.A00((Attachment) it.next())) {
                return true;
            }
        }
        1Du it2 = 5Q0.A03(message).iterator();
        while (it2.hasNext()) {
            if (((MediaResource) it2.next()).A03()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0H(Message message) {
        if (message.A04() != C1q8.A0Q) {
            ImmutableList immutableList = message.A0r;
            if (immutableList.isEmpty() && 5Q0.A03(message).isEmpty()) {
                return false;
            }
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                if (C00673oa.A02((Attachment) it.next())) {
                    return true;
                }
            }
            1Du it2 = 5Q0.A03(message).iterator();
            while (it2.hasNext()) {
                if (C6kg.A02((MediaResource) it2.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean A0I(Message message) {
        if (C00653oY.A00(this.A09, message) == C5ak.NORMAL) {
            1Du it = message.A0r.iterator();
            while (it.hasNext()) {
                Attachment attachment = (Attachment) it.next();
                if (!((1PG) this.A00.get()).A05() || !C00673oa.A00(attachment)) {
                    if (!C00673oa.A02(attachment)) {
                        48P r0 = attachment.A04;
                        if (r0 != 48P.A0A) {
                            if (attachment.A06 == null) {
                                if (message.A08 != null || r0 != 48P.A08) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (message.A08 != null) {
                return true;
            }
        }
        1Du it2 = 5Q0.A03(message).iterator();
        while (it2.hasNext()) {
            5HP r02 = ((MediaResource) it2.next()).A0Q;
            if (r02 != 5HP.A0E && (r02 != 5HP.A0H || C00663oZ.A01(message))) {
            }
            return true;
        }
        return false;
    }

    public boolean A0J(Message message) {
        ImmutableList immutableList = message.A0r;
        if (immutableList.isEmpty() && 5Q0.A03(message).isEmpty()) {
            return false;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            String str = ((Attachment) it.next()).A0L;
            if (str != null && str.startsWith("video/")) {
                return true;
            }
        }
        1Du it2 = 5Q0.A03(message).iterator();
        while (it2.hasNext()) {
            if (C6kg.A03(4YU.A0Z(it2))) {
                return true;
            }
        }
        return false;
    }
}
