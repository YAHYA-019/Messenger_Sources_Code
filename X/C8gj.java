package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gj, reason: invalid class name */
/* loaded from: 8gj.class */
public final class C8gj extends 1LH {
    public final 5zD A00;
    public final Message A01;
    public final ThreadSummary A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C8gj(5zD r302, Message message, ThreadSummary threadSummary, String str, String str2, boolean z) {
        7zP.A1L(str, 4, str2);
        this.A05 = z;
        this.A01 = message;
        this.A02 = threadSummary;
        this.A03 = str;
        this.A00 = r302;
        this.A04 = str2;
    }

    public static final SpannableStringBuilder A01(String str, String str2, C00m c00m) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0Pz.A0Y(str, str2, '\n'));
        StyleSpan styleSpan = new StyleSpan(1);
        int A05 = 7zQ.A05(str);
        spannableStringBuilder.setSpan(styleSpan, A05, spannableStringBuilder.length(), 33);
        7zN.A10(spannableStringBuilder, new 8Br(c00m, 3), A05);
        return spannableStringBuilder;
    }

    public 1LI A0s(C2k5 c2k5) {
        SpannableStringBuilder A01;
        11T.A0F(c2k5, 0);
        Object A0A = 1Bn.A0A(68547);
        C2lh A00 = C2lc.A00(c2k5, SHE.A00);
        4FL.A00(c2k5, AQt.A01(A0A, this, 37), 7zL.A1Y());
        boolean A1V = 7zP.A1V(A00);
        int i = 0;
        Integer num = 0S2.A00;
        boolean z = this.A05;
        ThreadKey threadKey = this.A01.A0V;
        if (A1V) {
            i = 5;
        }
        C6n3 c6n3 = new C6n3(threadKey, num, i, false, z, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false);
        9Kn r0 = new 9Kn(new 9No(c2k5, this));
        2lQ r02 = 2lO.A02;
        2lO A0L = 4YV.A0L(4YV.A0K(4YV.A0K((2lO) null, 0S2.A0A, 7zQ.A0A()), 0S2.A0N, Double.doubleToRawLongBits(245.0d)), 0S2.A03, new ARN(22, this, c2k5, A0A, r0), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        85B A002 = C6n4.A00(A0L2.A00);
        85O r03 = new 85O(44, A0A, A00, this);
        85O r04 = new 85O(45, A0A, A00, this);
        85A A012 = C6n2.A01(A0L2.AeS());
        A012.A2Y(c6n3);
        5zD r05 = this.A00;
        A012.A2X(r05);
        boolean z2 = !z;
        C6n2 c6n2 = A012.A01;
        c6n2.A08 = z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(3yH.A09(A0L2, 2131959657));
        spannableStringBuilder.setSpan(new StyleSpan(1), 2, spannableStringBuilder.length(), 33);
        7zN.A10(spannableStringBuilder, new 8Br(r03, 4), 0);
        c6n2.A06 = spannableStringBuilder;
        String str = this.A03;
        A012.A2Z(str);
        if (A1V) {
            if (4YU.A19(str, "\n", 0).size() > 5) {
                A01 = A01(4YV.A0t("\n", 0QD.A0Y(4YU.A19(str, "\n", 0), 4), (Function1) null), 3yH.A09(A0L2, 2131959657), r03);
            }
            A002.A2X(A012.A2W());
            A002.A2Z(c6n3);
            A002.A2Y(r05);
            A002.A0E(this.A04);
            return 7zM.A0l(A002.A2W(), A0L2, c2k5, A0L);
        }
        A01 = A01(str, 3yH.A09(A0L2, 2131959656), r04);
        A012.A2Z(A01);
        A002.A2X(A012.A2W());
        A002.A2Z(c6n3);
        A002.A2Y(r05);
        A002.A0E(this.A04);
        return 7zM.A0l(A002.A2W(), A0L2, c2k5, A0L);
    }
}
