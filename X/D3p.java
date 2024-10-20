package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.media.photoquality.PhotoQuality;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3p.class */
public final class D3p implements 2eF {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public D3p(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        ListenableFuture A0t;
        switch (this.A00) {
            case 0:
                Uri uri = (Uri) obj;
                5Hm r0 = (5Hm) this.A02;
                5HZ r02 = r0.A08;
                MediaResource mediaResource = (MediaResource) this.A05;
                MediaResource A01 = r02.A01(mediaResource);
                if (uri != null) {
                    C5en A00 = C5en.A00();
                    A00.A01(A01);
                    A00.A0E = uri;
                    A00.A0q = AnonymousClass000.A00(2);
                    A01 = 4YU.A0Y(A00);
                }
                D54 d54 = (D54) this.A03;
                long j = this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A04;
                r02.A08(fbUserSession, mediaResource, 0S2.A0N);
                Bundle A05 = 1BK.A05();
                A05.putParcelable("mediaResource", A01);
                A05.putLong("attempt_id", j);
                A05.putSerializable("resumableUploadConfig", d54);
                1IB A002 = 1Ho.A00(((BlueServiceOperationFactory) r0.A03.get()).newInstance("media_upload", A05, 1, CallerContext.A08(5Hm.class, "media_upload"), fbUserSession), true);
                ((5Ho) 1Lo.A04((Context) null, fbUserSession, r0.A01, 49654)).A02(A002, mediaResource);
                A0t = AbJ.A0t(r0.A05, D3J.A01(r0, 21), A002);
                if (uri != null) {
                    return 4YV.A0b(r0.A04, new D3j(1, r02, uri, mediaResource.A0J), A0t);
                }
                return A0t;
            case 1:
                if (obj == Qog.A04) {
                    return 1hM.A01;
                }
                5Hv r03 = (5Hv) this.A02;
                5HQ r04 = r03.A0E;
                MediaResource mediaResource2 = (MediaResource) this.A03;
                Integer num = (Integer) this.A04;
                r04.A04(mediaResource2, AnonymousClass001.A1W(num, 0S2.A01));
                return r03.A01((PhotoQuality) this.A05, mediaResource2, num, this.A01);
            default:
                Uri uri2 = (Uri) obj;
                5Ht r05 = (5Ht) this.A02;
                C00i c00i = r05.A0G;
                5HZ r06 = (5HZ) c00i.get();
                MediaResource mediaResource3 = (MediaResource) this.A05;
                MediaResource A012 = r06.A01(mediaResource3);
                if (uri2 != null) {
                    c00i.get();
                    C5en A003 = C5en.A00();
                    A003.A01(A012);
                    A003.A0E = uri2;
                    A003.A0q = AnonymousClass000.A00(2);
                    A012 = 4YU.A0Y(A003);
                }
                FbUserSession fbUserSession2 = (FbUserSession) this.A04;
                long j2 = this.A01;
                ((5HZ) c00i.get()).A08(fbUserSession2, mediaResource3, 0S2.A0N);
                Bundle A052 = 1BK.A05();
                A052.putParcelable("mediaResource", A012);
                A052.putLong("attempt_id", j2);
                1IB A0M = 4YU.A0M(A052, CallerContext.A08(5Ht.class, "media_upload"), 4YU.A0L(r05.A04), "media_upload", true);
                ((5Ho) r05.A07.get()).A02(A0M, mediaResource3);
                A0t = AbJ.A0t(r05.A0I, D3J.A01(r05, 22), A0M);
                if (uri2 != null) {
                    Object obj2 = c00i.get();
                    ThreadKey threadKey = mediaResource3.A0J;
                    threadKey.getClass();
                    A0t = 4YV.A0b(r05.A0E, new D3j(1, obj2, uri2, threadKey), A0t);
                }
                return A0t;
        }
    }
}
