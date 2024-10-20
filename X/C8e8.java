package X;

import android.content.res.ColorStateList;
import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* renamed from: X.8e8, reason: invalid class name */
/* loaded from: 8e8.class */
public final class C8e8 extends 1LH {
    public final ColorStateList A00;
    public final ColorStateList A01;
    public final 06Z A02;
    public final 2lO A03;
    public final ThreadKey A04;
    public final 6tM A05;
    public final AnonymousClass785 A06;
    public final 2Of A07;
    public final 6wX A08;
    public final List A09;

    public C8e8(ColorStateList colorStateList, ColorStateList colorStateList2, 06Z r304, 2lO r305, ThreadKey threadKey, 6tM r307, AnonymousClass785 anonymousClass785, 2Of r309, 6wX r310, List list) {
        11T.A0F(anonymousClass785, 2);
        this.A02 = r304;
        this.A06 = anonymousClass785;
        this.A05 = r307;
        this.A03 = r305;
        this.A04 = threadKey;
        this.A00 = colorStateList;
        this.A01 = colorStateList2;
        this.A07 = r309;
        this.A08 = r310;
        this.A09 = list;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lO r0 = this.A03;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        06Z r02 = this.A02;
        6tM r03 = this.A05;
        ThreadKey threadKey = this.A04;
        2Of r04 = this.A07;
        6wX r05 = this.A08;
        List list = this.A09;
        return 7zN.A0R(new 8iC(this.A00, this.A01, r02, (LiveData) null, (AnonymousClass959) null, threadKey, r03, 95Q.A03, r04, r05, (Integer) null, list, this.A06.A01, true), A0U, c2k5, r0);
    }
}
