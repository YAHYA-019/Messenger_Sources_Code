package com.facebook.messaging.media.upload.base;

import X.0fH;
import X.1hM;
import X.5HO;
import X.7Ql;
import X.C81O;
import X.C81P;
import X.HaT;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: NoOpMediaUploadManagerImpl.class */
public final class NoOpMediaUploadManagerImpl implements 5HO {
    public void A5z(HaT haT) {
    }

    public void AEM(MediaResource mediaResource) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
    }

    public void AEN(String str) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
    }

    public void AQd(Message message) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
    }

    public C81P AyH(MontageCard montageCard) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
        return null;
    }

    public double B58(MediaResource mediaResource) {
        return 1.0d;
    }

    public 7Ql BCH(MediaResource mediaResource) {
        return 7Ql.A0D;
    }

    public C81P BIH(Message message) {
        return new C81P(C81O.SUCCEEDED, 7Ql.A0D);
    }

    public boolean BXK() {
        return false;
    }

    public void CeU(HaT haT) {
    }

    public MontageCard Ci3(MontageCard montageCard) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
        return null;
    }

    public Message CiB(Message message) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
        return null;
    }

    public void CvL(Capabilities capabilities) {
        0fH.A0j("com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl", "No op for noop media upload manager.");
    }

    public ListenableFuture D2K(MediaResource mediaResource) {
        return 1hM.A01;
    }

    public ListenableFuture D2L(MediaResource mediaResource, boolean z) {
        return 1hM.A01;
    }
}
