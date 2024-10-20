package X;

import android.net.Uri;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.ImageAttachmentUris;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.model.MediaUploadResult;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;

/* renamed from: X.7t8, reason: invalid class name */
/* loaded from: 7t8.class */
public abstract class C7t8 {
    public static MediaResource A00(ImageAttachmentData imageAttachmentData, Message message) {
        ImageAttachmentUris imageAttachmentUris = imageAttachmentData.A05;
        if (imageAttachmentUris == null || imageAttachmentData.A07 == C66a.MP4) {
            imageAttachmentUris = imageAttachmentData.A06;
        }
        Uri uri = imageAttachmentUris.A02;
        String str = imageAttachmentData.A0C;
        MediaUploadResult mediaUploadResult = new MediaUploadResult(str);
        C5en A00 = C5en.A00();
        ThreadKey threadKey = message.A0V;
        A00.A0P = ThreadKey.A0q(threadKey) ? 5HP.A05 : 5HP.A0F;
        A00.A0N = C5ep.A02;
        A00.A0q = imageAttachmentData.A0D;
        A00.A0E = uri;
        ImageAttachmentUris imageAttachmentUris2 = imageAttachmentData.A06;
        Uri uri2 = imageAttachmentUris2.A04;
        if (uri2 == null) {
            uri2 = imageAttachmentUris2.A03;
            if (uri2 == null) {
                uri2 = imageAttachmentUris2.A01;
            }
        }
        A00.A0D = uri2;
        A00.A0R = mediaUploadResult;
        A00.A00 = imageAttachmentData.A02;
        A00.A04 = imageAttachmentData.A03;
        A00.A06 = message.A05;
        A00.A0J = threadKey;
        1Du it = message.A0r.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.A0F.equals(str)) {
                A00.A0j = attachment.A0C;
                A00.A0r = attachment.A0N;
            }
        }
        HighlightsTabMetadata highlightsTabMetadata = message.A0m;
        if (highlightsTabMetadata != null) {
            A00.A0X = highlightsTabMetadata;
        }
        return 4YU.A0Y(A00);
    }

    public static MediaResource A01(VideoAttachmentData videoAttachmentData, Message message) {
        if (videoAttachmentData.A00() == null || videoAttachmentData.A00().A03 == null) {
            return null;
        }
        MediaResourceSendSource mediaResourceSendSource = new MediaResourceSendSource(C5es.A0O, C5et.FORWARD);
        Uri uri = videoAttachmentData.A00().A03;
        String str = videoAttachmentData.A0K;
        MediaUploadResult mediaUploadResult = new MediaUploadResult(str);
        C5en A00 = C5en.A00();
        ThreadKey threadKey = message.A0V;
        A00.A0P = ThreadKey.A0q(threadKey) ? 5HP.A06 : 5HP.A0H;
        A00.A0V = mediaResourceSendSource;
        A00.A0E = uri;
        A00.A0D = videoAttachmentData.A0F;
        A00.A0R = mediaUploadResult;
        A00.A06 = message.A05;
        A00.A0J = threadKey;
        1Du it = message.A0r.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.A0F.equals(str)) {
                A00.A0j = attachment.A0C;
                A00.A0r = attachment.A0N;
            }
        }
        return 4YU.A0Y(A00);
    }
}
