package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.9x7, reason: invalid class name */
/* loaded from: 9x7.class */
public final class C9x7 implements Aa6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 8Gt A01;

    public C9x7(Context context, 8Gt r303) {
        this.A01 = r303;
        this.A00 = context;
    }

    @Override // X.Aa6
    public void CEa(Boolean bool, String str, String str2, int i, long j) {
        11T.A0F(str2, 2);
        8Gt r0 = this.A01;
        ThreadViewParams A06 = 8Gt.A06(r0, bool, "peoples_tab_recommended_public_channels", str2, j);
        8Gt.A08(r0, i, j);
        CQo cQo = (CQo) 1Br.A0B(r0.A07);
        5SW r02 = 5SW.A1T;
        String str3 = 8Gt.A03(r0).mValue;
        11T.A0A(str3);
        cQo.A0P(r02, str3, j);
        2dS r03 = (2dS) 1Br.A0B(r0.A0A);
        ThreadKey threadKey = A06.A05;
        Boolean A0d = 1BK.A0d();
        r03.A00(threadKey, A0d, A0d);
        8Gt.A07(this.A00, A06);
    }

    @Override // X.Aa6
    public void CEb(long j, String str, int i, Boolean bool) {
        EnumC3499Mfu enumC3499Mfu;
        String str2;
        11T.A0F(str, 1);
        8Gt r0 = this.A01;
        ThreadViewParams A06 = 8Gt.A06(r0, bool, ((9Oe) 1Br.A0B(r0.A08)).A01 ? 4YT.A00(27) : "recommended_public_channels_see_more_fragment_trigger", str, j);
        ThreadPreviewParams threadPreviewParams = A06.A09;
        if (threadPreviewParams == null || (enumC3499Mfu = threadPreviewParams.A01) == null || (str2 = enumC3499Mfu.mValue) == null) {
            throw 1BK.A0h();
        }
        5SW r02 = r0.A03;
        if (r02 == null) {
            11T.A0L("entryPoint");
            throw 0Q8.createAndThrow();
        }
        int ordinal = r02.ordinal();
        BOn bOn = ordinal != 37 ? (ordinal == 62 || ordinal == 24) ? BOn.A0H : (ordinal == 66 || ordinal == 67) ? BOn.A03 : BOn.A0S : BOn.A0B;
        8Gt.A08(r0, i, j);
        BDc bDc = r0.A04;
        if (bDc != null) {
            bDc.A00(new A0n(this.A00, bOn, r0, A06, str2, 1, j), (MailboxCallback) null, str2, j);
        }
    }

    @Override // X.Aa6
    public void CJn() {
    }
}
