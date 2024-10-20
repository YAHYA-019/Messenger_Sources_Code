package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.65e, reason: invalid class name */
/* loaded from: 65e.class */
public final class C65e implements C64o {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C65e(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 67786);
        this.A02 = 1Bu.A03(r0, 65937);
        this.A00 = 1Bu.A03(r0, 68143);
        this.A01 = 1Bu.A03(r0, 67698);
    }

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        11T.A0F(r304, 0);
        11T.A0F(fbUserSession, 1);
        11T.A0F(anonymousClass622, 2);
        11T.A0F(r305, 3);
        11T.A0F(r302, 4);
        ThreadSummary threadSummary = anonymousClass622.A05;
        ThreadKey threadKey = threadSummary != null ? threadSummary.A0n : null;
        return new 8cG(r305, threadKey, new 9zN(r302, r304, threadKey, this, anonymousClass622, anonymousClass622.A03.A1V), new 83A(anonymousClass622, this, 21), ((C6jQ) this.A02.A00.get()).A0M, anonymousClass622.A0Z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
        ThreadSummary threadSummary;
        ThreadKey threadKey;
        if (anonymousClass622 == null || (threadSummary = anonymousClass622.A05) == null || (threadKey = threadSummary.A0n) == null) {
            return;
        }
        C9hq c9hq = (C9hq) this.A03.A00.get();
        long j = threadKey.A04;
        C00i c00i = c9hq.A06.A00;
        1G2 A00 = ((1M0) c00i.get()).A00("shared_album_mustache_nux_impression_count");
        C00i c00i2 = c9hq.A02.A00;
        TreeMap Ak5 = ((FbSharedPreferences) c00i2.get()).Ak5(A00);
        String valueOf = String.valueOf(j);
        Object obj = Ak5.get(A00.A0D(valueOf));
        int intValue = obj == null ? 0 : ((Number) obj).intValue();
        1Ql edit = ((FbSharedPreferences) c00i2.get()).edit();
        edit.CaE(((1M0) c00i.get()).A00("shared_album_mustache_nux_impression_count").A0D(valueOf), intValue + 1);
        edit.commit();
        9nJ.A02(C98N.MUSTACHE_NUX, 98L.A07, threadKey, (9nJ) c9hq.A04.A00.get(), "impression", "none", (List) null, (List) null, 0, 0, 0L);
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        ImageAttachmentData imageAttachmentData;
        11T.A0F(anonymousClass622, 0);
        List list = anonymousClass622.A0Q;
        boolean z = false;
        if (list.size() > 1 && (imageAttachmentData = (ImageAttachmentData) 0QD.A0E(list)) != null && imageAttachmentData.A09 != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MediaResource mediaResource = ((ImageAttachmentData) it.next()).A09;
                    if (mediaResource != null && mediaResource.A03()) {
                        return false;
                    }
                }
            }
            if (anonymousClass622.A04.A03("shared_album_messsage_nux_eligibility")) {
                C9hq c9hq = (C9hq) this.A03.A00.get();
                if (((FbSharedPreferences) c9hq.A02.A00.get()).Ak5(((1M0) c9hq.A06.A00.get()).A00("shared_album_mustache_nux_impression_count")).size() <= ((C6jQ) c9hq.A05.A00.get()).A00) {
                    z = true;
                }
            }
        }
        return z;
    }
}
