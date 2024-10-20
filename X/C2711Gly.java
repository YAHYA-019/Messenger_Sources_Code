package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.List;

/* renamed from: X.Gly, reason: case insensitive filesystem */
/* loaded from: Gly.class */
public final class C2711Gly extends 2Yv {
    public MediaResource A00;
    public HAN A01;
    public List A02;
    public boolean A03;
    public boolean A04;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            HAN han = (HAN) objArr[0];
            11T.A0F(han, 2);
            this.A01 = han;
            this.A00 = null;
            return;
        }
        if (i == 1) {
            this.A04 = 7zO.A1Z(objArr, 0);
        } else if (i == 2) {
            this.A02 = (List) objArr[0];
        } else if (i == 3) {
            this.A03 = 7zO.A1Z(objArr, 0);
        }
    }
}
