package com.facebook.messaging.media.upload.msys;

import X.0fH;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Hv;
import X.1I7;
import X.1Lo;
import X.1MV;
import X.1Uc;
import X.1Uj;
import X.1hM;
import X.5HO;
import X.5Hn;
import X.7Ql;
import X.81I;
import X.A1b;
import X.C00i;
import X.C1k8;
import X.C1ko;
import X.C81P;
import X.GRf;
import X.HaT;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: MsysMediaUploadManagerImpl.class */
public final class MsysMediaUploadManagerImpl implements 5HO {
    public 1BY A00;
    public final C00i A02;
    public final C00i A05;
    public final C00i A07;
    public final C1ko A0D;
    public final FbUserSession A0E;
    public final C00i A0F;
    public final C00i A06 = new 1BV((1BY) null, 49653);
    public final C00i A04 = new 1BQ(115382);
    public final C00i A03 = new 1BV((1BY) null, 33031);
    public final 1Uc A08 = new GRf(this, 0);
    public final 1Uc A0B = new GRf(this, 1);
    public final 1Uc A0C = new GRf(this, 2);
    public final 1Uc A0A = new GRf(this, 3);
    public final 1Uc A09 = new GRf(this, 4);
    public final 1I7 A01 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);

    public MsysMediaUploadManagerImpl(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A0E = fbUserSession;
        C1k8 c1k8 = new C1k8();
        c1k8.A05(300L, TimeUnit.SECONDS);
        this.A0D = c1k8.A02();
        Integer num = 1Lo.A05;
        this.A05 = new 1MV(fbUserSession, (1BY) null, 49661);
        1MV r0 = new 1MV(fbUserSession, (1BY) null, 16686);
        this.A0F = r0;
        this.A07 = new 1MV(fbUserSession, (1BY) null, 115373);
        this.A02 = new 1MV(fbUserSession, (1BY) null, 115372);
        ((1Uj) r0.get()).A06(new A1b(this, 17));
    }

    public void A5z(HaT haT) {
    }

    public void AEM(MediaResource mediaResource) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "No op for msys media upload manager");
    }

    public void AEN(String str) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "This should be handled inside msys media upload manager xplat.");
    }

    public void AQd(Message message) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "This should be handled inside msys media upload manager xplat.");
    }

    public C81P AyH(MontageCard montageCard) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "No op for msys media upload manager");
        return null;
    }

    public double B58(MediaResource mediaResource) {
        Number number;
        this.A06.get();
        C1ko c1ko = this.A0D;
        if (mediaResource == null || (number = (Number) c1ko.Apt(81I.A01(mediaResource))) == null) {
            return 0.0d;
        }
        return number.doubleValue();
    }

    public 7Ql BCH(MediaResource mediaResource) {
        this.A06.get();
        return 5Hn.A01(this.A0E, mediaResource);
    }

    public C81P BIH(Message message) {
        return ((5Hn) this.A06.get()).A02(this.A0E, message);
    }

    public boolean BXK() {
        return false;
    }

    public void CeU(HaT haT) {
    }

    public MontageCard Ci3(MontageCard montageCard) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "No op for msys media upload manager");
        return montageCard;
    }

    public Message CiB(Message message) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "No op for msys media upload manager");
        return message;
    }

    public void CvL(Capabilities capabilities) {
        0fH.A0j("com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl", "No op for msys media upload manager");
    }

    public ListenableFuture D2K(MediaResource mediaResource) {
        return 1hM.A01;
    }

    public ListenableFuture D2L(MediaResource mediaResource, boolean z) {
        return 1hM.A01;
    }
}
