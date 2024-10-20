package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.common.bitmaps.BitmapUtil;
import com.facebook.messaging.model.messages.Message;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

/* renamed from: X.Gfl, reason: case insensitive filesystem */
/* loaded from: Gfl.class */
public final class C2505Gfl extends 2rI {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ Message A02;
    public final /* synthetic */ C5ry A03;
    public final /* synthetic */ SettableFuture A04;

    public C2505Gfl(Context context, FbUserSession fbUserSession, Message message, C5ry c5ry, SettableFuture settableFuture) {
        this.A04 = settableFuture;
        this.A03 = c5ry;
        this.A00 = context;
        this.A02 = message;
        this.A01 = fbUserSession;
    }

    public void A02(1OW r302) {
        11T.A0F(r302, 0);
        SettableFuture settableFuture = this.A04;
        Throwable AlY = r302.AlY();
        if (AlY == null) {
            AlY = AnonymousClass001.A0T("failed to download image");
        }
        settableFuture.setException(AlY);
    }

    public void A03(1OW r302) {
        2Ea r304;
        Bitmap.CompressFormat compressFormat;
        String str;
        SettableFuture settableFuture;
        RuntimeException A0T;
        if (!GOp.A1V(r302)) {
            this.A04.setException(AnonymousClass001.A0T("dataSource was not finished"));
            return;
        }
        2EU r306 = null;
        try {
            try {
                2EU A0J = GOn.A0J(r302);
                r304 = A0J != null ? (2Ea) A0J.A09() : null;
            } catch (Exception e) {
                this.A04.setException(e);
            }
            if (r304 instanceof 2EY) {
                r306 = ((2EY) r304).A00();
                if (r306 != null) {
                    SettableFuture settableFuture2 = this.A04;
                    C5ry c5ry = this.A03;
                    Context context = this.A00;
                    Message message = this.A02;
                    File A01 = C5ry.A01(this.A01, message, c5ry);
                    Object obj = null;
                    if (A01 != null) {
                        C5s1 A02 = ((5sO) 1Br.A0B(c5ry.A01)).A02(message);
                        if (11T.A0O(A02, C5s1.A1Q)) {
                            compressFormat = Bitmap.CompressFormat.PNG;
                        } else if (11T.A0O(A02, C5s1.A0r)) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                        } else {
                            if (!11T.A0O(A02, C5s1.A1r)) {
                                throw AnonymousClass002.A0C(A02, "Unexpected MimeType: ", AnonymousClass001.A0k());
                            }
                            compressFormat = Bitmap.CompressFormat.WEBP;
                        }
                        BitmapUtil.A05.A02(compressFormat, r306, A01);
                        long length = A01.length();
                        String A00 = 4YT.A00(686);
                        if (length <= 0) {
                            str = "unable to save notification attachment file for preview";
                        } else {
                            Uri A002 = C5ry.A00(context, c5ry, A01);
                            if (A002 == null) {
                                str = "couldn't retrieve uri for file";
                            } else {
                                new C2636Gjo(A002, A01);
                            }
                        }
                        0fH.A0k(A00, str);
                    }
                    settableFuture2.set(obj);
                    2EU.A04(GOn.A0J(r302));
                    2EU.A04(r306);
                }
                settableFuture = this.A04;
                A0T = AnonymousClass001.A0T("Couldn't clone bitmap message");
            } else {
                settableFuture = this.A04;
                A0T = AnonymousClass001.A0T("image retrieved wasn't CloseableStaticBitmap");
            }
            settableFuture.setException(A0T);
            2EU.A04(GOn.A0J(r302));
            2EU.A04(r306);
        } catch (Throwable th) {
            2EU.A04(GOn.A0J(r302));
            2EU.A04((2EU) null);
            throw th;
        }
    }
}
