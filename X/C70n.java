package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;

/* renamed from: X.70n, reason: invalid class name */
/* loaded from: 70n.class */
public final class C70n implements CallerContextable {
    public static final String __redex_internal_original_name = "MediaResourceDownloader";
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final CallerContext A05;
    public final C00i A06;
    public final C2u2 A07;

    public C70n(Context context) {
        11T.A0F(context, 1);
        1Br A00 = 1Bq.A00(49750);
        this.A06 = A00;
        1Br A002 = 1Bq.A00(17131);
        this.A01 = A002;
        this.A04 = 1Bq.A00(17132);
        this.A02 = 1Bq.A00(17133);
        this.A00 = 1Bq.A00(33257);
        this.A03 = 1Bq.A00(49473);
        C2tx c2tx = (C2tx) A002.A00.get();
        this.A07 = new C2u2(context, (C2ty) this.A04.A00.get(), (C2u1) this.A00.A00.get(), c2tx, (C2tz) this.A02.A00.get(), A00, "tam_gif_download");
        this.A05 = CallerContext.A06(C70n.class);
    }

    private final Uri A00(Uri uri, String str) {
        try {
            C2u2 c2u2 = this.A07;
            ImmutableMap immutableMap = C10404ta.A06;
            Object A02 = c2u2.A02(new C10404ta(uri, this.A05, new D1c((AnonymousClass536) 1Br.A0B(this.A03), str)));
            11T.A0D(A02);
            return (Uri) A02;
        } catch (IOException unused) {
            Uri uri2 = Uri.EMPTY;
            11T.A0D(uri2);
            return uri2;
        }
    }

    public final MediaResource A01(MediaResource mediaResource) {
        String str;
        Uri uri;
        Uri uri2 = mediaResource.A0E;
        11T.A09(uri2);
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri2.toString());
        if (fileExtensionFromUrl.length() == 0) {
            fileExtensionFromUrl = null;
        }
        str = "";
        if (fileExtensionFromUrl == null) {
            fileExtensionFromUrl = str;
        }
        Uri A00 = A00(uri2, fileExtensionFromUrl);
        Uri uri3 = mediaResource.A0D;
        if (uri3 != null) {
            String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(uri3.toString());
            uri = A00(uri3, fileExtensionFromUrl2.length() != 0 ? fileExtensionFromUrl2 : "");
        } else {
            uri = null;
        }
        C5en c5en = new C5en();
        c5en.A01(mediaResource);
        c5en.A0E = A00;
        c5en.A0D = uri;
        return 4YU.A0Y(c5en);
    }

    public final MediaResource A02(MediaResource mediaResource, boolean z) {
        C5fo c5fo;
        String str;
        11T.A0F(mediaResource, 0);
        Uri uri = mediaResource.A0B;
        if (uri != null) {
            Uri A00 = z ? A00(uri, ".mp4") : A00(uri, ".webp");
            Uri uri2 = mediaResource.A0D;
            Uri A002 = (uri2 == null || uri.equals(uri2)) ? A00 : A00(uri2, ".mp4");
            if (z) {
                str = mediaResource.A0s;
                if (str == null) {
                    c5fo = C5fo.GIF;
                }
                C5en c5en = new C5en();
                c5en.A01(mediaResource);
                c5en.A0E = A00;
                c5en.A0D = A002;
                c5en.A0P = 5HP.A02;
                c5en.A0q = str;
                mediaResource = 4YU.A0Y(c5en);
            } else {
                c5fo = C5fo.WEBP;
            }
            str = c5fo.value;
            C5en c5en2 = new C5en();
            c5en2.A01(mediaResource);
            c5en2.A0E = A00;
            c5en2.A0D = A002;
            c5en2.A0P = 5HP.A02;
            c5en2.A0q = str;
            mediaResource = 4YU.A0Y(c5en2);
        }
        return mediaResource;
    }
}
