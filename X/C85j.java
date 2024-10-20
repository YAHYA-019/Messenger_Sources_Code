package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.model.MediaUploadResult;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import com.google.common.collect.ImmutableList;

/* renamed from: X.85j, reason: invalid class name */
/* loaded from: 85j.class */
public final class C85j implements AYf {
    public final ThreadKey A02;
    public final 1Br A01 = 1Bu.A00(115019);
    public final 1Br A00 = 1Bu.A00(68234);

    public C85j(ThreadKey threadKey) {
        this.A02 = threadKey;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        C5en A00;
        Uri uri;
        Uri uri2;
        int A05 = 7zP.A05(r302, r305, 0);
        9R6 r0 = (9R6) 1Br.A0B(this.A00);
        Context A0A = 7zL.A0A(r302);
        ThreadKey threadKey = this.A02;
        5gR r02 = ((5vV) r305).A00;
        11T.A0F(r02, A05);
        if (r02 instanceof 5gR) {
            1Br.A0C(r0.A02);
            5gR r03 = r02;
            11T.A0F(r03, 0);
            VideoAttachment videoAttachment = r03.A00;
            ImmutableList A002 = videoAttachment.A00();
            11T.A0A(A002);
            VideoDataSource videoDataSource = (VideoDataSource) 0QD.A0E(A002);
            if (videoDataSource == null || (uri = videoDataSource.A03) == null || (uri2 = videoAttachment.A0C) == null) {
                return;
            }
            MediaUploadResult mediaUploadResult = new MediaUploadResult(videoAttachment.A0G);
            5HP r308 = threadKey.A0z() ? 5HP.A06 : 5HP.A0H;
            A00 = C5en.A00();
            A00.A0J = threadKey;
            A00.A0P = r308;
            A00.A0E = uri;
            A00.A0D = uri2;
            A00.A0R = mediaUploadResult;
        } else {
            if (!(r02 instanceof C5ft)) {
                return;
            }
            C5ft c5ft = (C5ft) r02;
            Photo photo = c5ft.A00;
            if (photo == null) {
                photo = (Photo) 0QD.A0E(c5ft.A01);
                if (photo == null) {
                    return;
                }
            }
            1Br.A0C(r0.A00);
            if (photo.A0H) {
                return;
            }
            try {
                Uri A03 = C0A2.A03(photo.A0E);
                if (A03 == null) {
                    return;
                }
                Uri A032 = C0A2.A03(photo.A0F);
                if (A032 == null) {
                    return;
                }
                MediaUploadResult mediaUploadResult2 = new MediaUploadResult(photo.A0B);
                5HP r3082 = threadKey.A19() ? 5HP.A05 : 5HP.A0F;
                A00 = C5en.A00();
                A00.A0J = threadKey;
                A00.A0P = r3082;
                A00.A0q = photo.A0D;
                A00.A0E = A03;
                A00.A0D = A032;
                A00.A0R = mediaUploadResult2;
                A00.A00 = photo.A00;
                A00.A04 = photo.A01;
            } catch (SecurityException unused) {
                return;
            }
        }
        MediaResource A0Y = 4YU.A0Y(A00);
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        builder.A0D = C6r6.A0n;
        builder.A0C = C6x5.A02;
        builder.A0F = A0Y;
        builder.A09 = C6x1.A05;
        7zT.A12(A0A, MontageComposerActivity.A12(A0A, builder.A00(), NavigationTrigger.A03("messenger_montage_in_thread_broadcast_flow")), r0.A01);
    }
}
