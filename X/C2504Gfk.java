package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.Gfk, reason: case insensitive filesystem */
/* loaded from: Gfk.class */
public final class C2504Gfk extends 2rI {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ 1xH A01;
    public final /* synthetic */ 2Dp A02;
    public final /* synthetic */ I0w A03;
    public final /* synthetic */ File A04;

    public C2504Gfk(Uri uri, 1xH r303, 2Dp r304, I0w i0w, File file) {
        this.A00 = uri;
        this.A03 = i0w;
        this.A04 = file;
        this.A02 = r304;
        this.A01 = r303;
    }

    public void A02(1OW r302) {
        StringBuilder A0x = 7zO.A0x(r302, 0);
        A0x.append("encoded image missed for ");
        0fH.A0j("[MP] LegacyAttachmentFrescoDelegator", AnonymousClass001.A0a(this.A00, A0x));
        2EU.A04(GOn.A0J(r302));
        this.A01.A04(false);
    }

    public void A03(1OW r302) {
        11T.A0F(r302, 0);
        2EU A0J = GOn.A0J(r302);
        if (A0J == null) {
            this.A01.A04(false);
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("encoded image found for ");
        0fH.A0j("[MP] LegacyAttachmentFrescoDelegator", AnonymousClass001.A0a(this.A00, A0k));
        File file = this.A04;
        2Dp r0 = this.A02;
        11T.A0D(r0);
        1JU.A01.execute(new J2e(this.A01, (4dR) A0J.A09(), A0J, r0, file));
    }
}
