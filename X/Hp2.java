package X;

import com.facebook.messaging.tincan.msys.TincanMsysAttachment;
import com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin.MsysOpenMessagingAttachmentDeletionPluginPostmailbox;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;

/* loaded from: Hp2.class */
public final class Hp2 {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 67600);
    public final C00i A02 = 1BQ.A01();
    public final C00i A03 = 1BV.A01((1BY) null, 16671);

    public Hp2(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public HashMap A00(MediaResource mediaResource, String str) {
        TincanMsysAttachment A00 = TincanMsysAttachment.A00(1BK.A09(this.A02), (9rO) this.A01.get(), (1SI) this.A03.get(), mediaResource);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("offline_id", str);
        A0u.put(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.ATTACHMENT_TYPE, Integer.valueOf(A00.A00));
        String str2 = mediaResource.A0s;
        A0u.put("mime_type", str2);
        A0u.put("file_uri", mediaResource.A0E.getPath());
        A0u.put("preview_mime_type", str2);
        A0u.put("preview_file_uri", A00.A04);
        A0u.put("file_name", A00.A05);
        A0u.put("thumbnail", A00.A06);
        A0u.put(Property.ICON_TEXT_FIT_HEIGHT, A00.A02);
        A0u.put(Property.ICON_TEXT_FIT_WIDTH, A00.A03);
        A0u.put("duration_ms", Long.valueOf(mediaResource.A08));
        return A0u;
    }
}
