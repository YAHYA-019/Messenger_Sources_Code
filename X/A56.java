package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import java.util.List;

/* loaded from: A56.class */
public final class A56 implements 5Q4 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 4kB A04;
    public final 5oZ A05;
    public final Context A06;
    public final FbUserSession A07;
    public final C70n A08;

    public A56(Context context, FbUserSession fbUserSession, 4kB r304, 5oZ r305) {
        11T.A0F(r305, 3);
        this.A06 = context;
        this.A07 = fbUserSession;
        this.A05 = r305;
        this.A04 = r304;
        this.A01 = 1Bu.A00(363);
        this.A00 = 1Lm.A00(context, fbUserSession, 65962);
        this.A03 = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A08 = ((82O) 1Br.A0B(this.A01)).A0Y(context);
        this.A02 = 1Bu.A00(116182);
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        return c5fv instanceof 5gR;
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        long A00;
        VideoAttachment videoAttachment;
        String str3;
        int i;
        int i2;
        String A01;
        Long A0e;
        boolean A1X = 1BL.A1X(threadKey, r304);
        11T.A0F(c5fv, 2);
        C5fu c5fu = (C5fu) c5fv;
        String str4 = c5fu.A0A;
        if (str4 != null) {
            this.A05.Bc6(this.A06, threadKey, str4, false);
        }
        Long l = null;
        5gR r321 = c5fv instanceof 5gR ? (5gR) c5fv : null;
        String str5 = c5fu.A0B;
        if (str5 == null || (A0e = 0CW.A0e(str5)) == null) {
            1Br.A0C(this.A03);
            A00 = 0Mt.A00();
        } else {
            A00 = A0e.longValue();
        }
        if (r321 != null && (videoAttachment = r321.A00) != null) {
            MediaResource mediaResource = videoAttachment.A0E;
            if (mediaResource != null) {
                7Hh r0 = (7Hh) r321.AxW(5tS.A00);
                Integer num = r0 != null ? r0.A00 : null;
                Integer num2 = null;
                if (num != null) {
                    int intValue = num.intValue();
                    int i3 = 1;
                    if (intValue == A1X) {
                        i3 = 0;
                    } else if (intValue != 2) {
                        if (intValue == 3) {
                            num2 = 2;
                        }
                    }
                    num2 = Integer.valueOf(i3);
                }
                Context context = this.A06;
                C00i c00i = this.A00.A00;
                22C r02 = (22C) c00i.get();
                11T.A0F(r02, A1X ? 1 : 0);
                C70n c70n = this.A08;
                11T.A09(c70n);
                Integer num3 = null;
                if (videoAttachment.A0K) {
                    mediaResource = c70n.A02(mediaResource, A1X);
                }
                AnonymousClass001.A0E(IDy.A02(context, mediaResource)).exists();
                str3 = "";
                String str6 = mediaResource.A0s;
                if (str6 == null) {
                    str6 = str3;
                }
                int A002 = 0OP.A00(mediaResource.A0F);
                if (A002 == 90 || A002 == 270) {
                    i = videoAttachment.A06;
                    i2 = videoAttachment.A03;
                } else {
                    i = videoAttachment.A03;
                    i2 = videoAttachment.A06;
                }
                Uri uri = mediaResource.A0D;
                if (uri != null) {
                    String.valueOf(uri);
                } else {
                    IDy.A02(context, mediaResource);
                }
                String A03 = IDy.A03(uri);
                String A012 = I6M.A01(mediaResource.A0E, r02);
                String A013 = I6M.A01(uri, r02);
                Uri uri2 = mediaResource.A0C;
                if (uri2 == null) {
                    A01 = null;
                } else {
                    A01 = I6M.A01(uri2, r02);
                    if (A01 != null) {
                        num3 = mediaResource.A0d;
                    }
                }
                VideoEdits A003 = IDy.A00(mediaResource);
                IDy.A01(threadKey, num2);
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                Long valueOf3 = Long.valueOf(videoAttachment.A09);
                Long valueOf4 = Long.valueOf(videoAttachment.A07);
                String str7 = mediaResource.A0n;
                List A032 = 11T.A03(str7 != null ? str7 : "");
                List A033 = 11T.A03(0);
                List A12 = C0s8.A12(A013);
                List A122 = C0s8.A12(A012);
                List A123 = C0s8.A12(A01);
                List A124 = C0s8.A12(num3);
                List A125 = C0s8.A12(Boolean.valueOf(mediaResource.A10));
                List A126 = C0s8.A12(Integer.valueOf(mediaResource.A02));
                List A127 = C0s8.A12(Integer.valueOf(mediaResource.A01));
                int hashCode = String.valueOf(A00).hashCode();
                4kB r03 = this.A04;
                if (r03 != null) {
                    r03.A73(hashCode, "SEND_MESSAGE_API_START");
                }
                if (str4 != null && A003 != null) {
                    ((5Et) 1Br.A0B(this.A02)).A05(str4, (List) null, this.A05.B9x(threadKey, false), 1166);
                }
                22C r04 = (22C) c00i.get();
                long A0s = threadKey.A0s();
                Long B33 = r304.B33();
                if (B33 == null) {
                    throw 1BK.A0h();
                }
                long longValue = B33.longValue();
                List A034 = 11T.A03(4);
                List A035 = 11T.A03(str6);
                List A036 = 11T.A03(valueOf);
                List A037 = 11T.A03(valueOf2);
                List A038 = 11T.A03(A03);
                List A039 = 11T.A03(valueOf);
                List A0310 = 11T.A03(valueOf2);
                List A0311 = 11T.A03(valueOf3);
                List A0312 = 11T.A03(valueOf4);
                List A0313 = 11T.A03((Object) null);
                List A0314 = 11T.A03((Object) null);
                String A014 = C5vD.A01(c5fv);
                if (A014 != null) {
                    l = 1BK.A0n(A014);
                }
                r04.A09((5oV) null, new A0A(hashCode, 2, this), l, Long.valueOf(A00), num2, str4, str, str2, A034, A035, A036, A037, A038, A039, A0310, A032, A0311, A0312, A033, A0313, A12, A122, A123, A124, A125, A126, A127, A0314, A0s, longValue, false);
                return;
            }
        }
        throw AnonymousClass001.A0N(4YT.A00(803));
    }
}
