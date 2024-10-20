package X;

import android.graphics.RectF;
import android.net.Uri;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.69m, reason: invalid class name */
/* loaded from: 69m.class */
public final class C69m {
    public final Set A03 = new 0WH(0);
    public final 1Br A00 = 1Bq.A00(32771);
    public final 1Br A02 = 1Bq.A00(16511);
    public final 1Br A01 = 1Bq.A00(49420);

    public final VideoAttachmentData A00(MontageCard montageCard) {
        48J r0;
        if (montageCard == null || (r0 = montageCard.A07) != 48J.A05) {
            return null;
        }
        Attachment attachment = (Attachment) 2Ri.A0D(montageCard.A01(), (Object) null);
        MediaResource mediaResource = (MediaResource) 2Ri.A0D(montageCard.A02(), (Object) null);
        MediaResource mediaResource2 = (MediaResource) 2Ri.A0D(montageCard.A02(), (Object) null);
        Attachment attachment2 = (Attachment) 2Ri.A0D(montageCard.A01(), (Object) null);
        ImmutableList.Builder builder = ImmutableList.builder();
        if (mediaResource2 != null) {
            builder.m11011add((Object) ((C12114ys) 1Br.A0B(this.A01)).A0D(mediaResource2));
        }
        if (attachment2 != null) {
            builder.m11011add((Object) ((C12114ys) this.A01.A00.get()).A0C(attachment2, false));
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        String str3 = null;
        Integer num = null;
        int i5 = 0;
        Uri uri = null;
        int i6 = 0;
        boolean z = false;
        Uri uri2 = null;
        int i7 = 0;
        String str4 = null;
        String str5 = null;
        int i8 = 0;
        C48g c48g = null;
        Uri uri3 = null;
        MediaResource mediaResource3 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        6AC r02 = 6AC.A02;
        if (mediaResource != null) {
            C12114ys c12114ys = (C12114ys) 1Br.A0B(this.A01);
            Preconditions.checkArgument(C6kg.A03(mediaResource));
            C4yu c4yu = c12114ys.A04;
            int i12 = mediaResource.A04;
            int i13 = mediaResource.A00;
            int A00 = 0OP.A00(mediaResource.A0F);
            RectF rectF = mediaResource.A0A;
            7Xn r03 = 7Xn.A03;
            11T.A0F(rectF, 3);
            7Xo A002 = C4yx.A00(rectF, c4yu, r03, null, 1BK.A0b(), 0.0f, i12, i13, A00, 0, -1, false);
            0OO A01 = 0OP.A01(0OO.A03, (A002.A0C + A002.A07) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
            i9 = A002.A0D;
            i6 = A002.A0B;
            if (A01 == 0OO.A06 || A01 == 0OO.A05) {
                i9 = i6;
                i6 = i9;
            }
            c48g = 7Xp.A00(mediaResource);
            i3 = mediaResource.A00();
            i4 = (int) mediaResource.A07;
            uri3 = mediaResource.A0D;
            str = mediaResource.A0l;
            str5 = mediaResource.A0t;
            str2 = "";
            mediaResource3 = mediaResource;
            int i14 = mediaResource.A02;
            if (i14 > 0) {
                i10 = i14;
            }
            int i15 = mediaResource.A01;
            if (i15 > 0) {
                i11 = i15;
            }
        }
        if (attachment != null) {
            z = attachment.A00();
            str = attachment.A0C;
            str5 = attachment.A0N;
            VideoData videoData = attachment.A08;
            if (videoData != null) {
                this.A01.A00.get();
                i3 = videoData.A02;
                if (i3 == 0) {
                    i3 = (int) (videoData.A03 * 1000);
                }
                i9 = videoData.A08;
                i6 = videoData.A05;
                i8 = videoData.A07;
                i4 = attachment.A00;
                uri3 = videoData.A0C;
                uri2 = videoData.A0A;
                str4 = videoData.A0F;
                c48g = videoData.A0D;
                str2 = attachment.A0F;
                num = attachment.A0A;
                str3 = attachment.A0H;
                i7 = videoData.A06;
                i2 = videoData.A01;
                i5 = videoData.A04;
                i = videoData.A00;
                uri = videoData.A09;
            } else {
                Set set = this.A03;
                String str6 = montageCard.A0E;
                if (!set.contains(str6)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    String A0p = 4YV.A0p(attachment, A0k);
                    A0k.append(attachment.A0L);
                    AnonymousClass001.A1D("\n\nmessage info:", A0p, str6, A0k);
                    String A0Z = AnonymousClass001.A0Z(r0, "\ncardType: ", A0k);
                    11T.A0A(A0Z);
                    1Br.A04(this.A02).D0v("MESSENGER_MONTAGE_INLINE_VIDEO_ATTACHMENT_WITHOUT_VIDEO_DATA", A0Z);
                    11T.A0A(str6);
                    set.add(str6);
                }
            }
        }
        return new VideoAttachmentData(uri, uri2, uri3, r02, c48g, mediaResource3, num, str, str2, str3, null, str4, str5, build, i, i2, i3, i11, i4, i5, i6, i7, i8, i10, i9, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
    
        if (r302.A02().size() != r302.A01().size()) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.collect.ImmutableList A01(com.facebook.messaging.montage.model.MontageCard r302) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69m.A01(com.facebook.messaging.montage.model.MontageCard):com.google.common.collect.ImmutableList");
    }

    public final boolean A02(MontageCard montageCard) {
        11T.A0F(montageCard, 0);
        1Du it = montageCard.A01().iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            this.A00.A00.get();
            11T.A0D(attachment);
            if (C00673oa.A00(attachment)) {
                return true;
            }
        }
        ImmutableList A02 = montageCard.A02();
        11T.A0A(A02);
        if ((A02 instanceof Collection) && A02.isEmpty()) {
            return false;
        }
        Iterator it2 = A02.iterator();
        while (it2.hasNext()) {
            if (4YU.A0Z(it2).A03()) {
                return true;
            }
        }
        return false;
    }
}
