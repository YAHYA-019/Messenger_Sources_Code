package com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.2Ff;
import X.7zU;
import X.C06w;
import X.C06z;
import X.C6H8;
import X.HJK;
import android.net.Uri;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.AccountSession;
import java.util.Map;

/* loaded from: MsysOpenMessagingAttachmentDeletionPluginPostmailbox.class */
public final class MsysOpenMessagingAttachmentDeletionPluginPostmailbox extends Postmailbox {
    public static final String ATTACHMENT_TYPE = "attachment_type";
    public static final String PLAYABLE_URL = "playable_url";
    public static final String PREVIEW_URL = "preview_url";
    public final 1Br audioCache$delegate;
    public final 1Br imagePipeline$delegate;
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.class, "audioCache", "getAudioCache()Lcom/facebook/messaging/audio/cache/AudioCache;", 0), new C06w(MsysOpenMessagingAttachmentDeletionPluginPostmailbox.class, "imagePipeline", "getImagePipeline()Lcom/facebook/imagepipeline/core/ImagePipeline;", 0)};
    public static final HJK Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysOpenMessagingAttachmentDeletionPluginPostmailbox(AccountSession accountSession, MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(accountSession, messengerSessionedMCPContext);
        1BL.A1F(accountSession, messengerSessionedMCPContext);
        this.audioCache$delegate = 1Bq.A00(50016);
        this.imagePipeline$delegate = 1Bq.A00(65609);
    }

    private final C6H8 getAudioCache() {
        return (C6H8) 1Br.A0B(this.audioCache$delegate);
    }

    private final 2Ff getImagePipeline() {
        return (2Ff) 1Br.A0B(this.imagePipeline$delegate);
    }

    private final void removeFromCache(Object obj, int i) {
        if (obj instanceof String) {
            Uri A0C = 7zU.A0C((String) obj);
            if (i == 2) {
                getImagePipeline().A0H(A0C);
            } else if (i == 5) {
                getAudioCache().A02(A0C);
            }
        }
    }

    @Override // com.facebook.messenger.plugins.msysopenmessagingattachmentdeletionplugin.Postmailbox
    public void MsysOpenMessagingAttachmentCleanupExtensionsImpl_MsysOpenMessagingAttachmentCleanupProxyDeleteAttachment(Map map) {
        11T.A0F(map, 0);
        Object obj = map.get(ATTACHMENT_TYPE);
        if (obj instanceof Integer) {
            Number number = (Number) obj;
            removeFromCache(map.get(PLAYABLE_URL), number.intValue());
            removeFromCache(map.get(PREVIEW_URL), number.intValue());
        }
    }
}
