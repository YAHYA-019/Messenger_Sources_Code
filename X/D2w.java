package X;

import com.google.common.base.Function;
import java.util.List;

/* loaded from: D2w.class */
public final class D2w implements Function {
    public final /* synthetic */ Bbb A00;
    public final /* synthetic */ CBu A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public D2w(Bbb bbb, CBu cBu, Integer num, String str, String str2) {
        this.A03 = str;
        this.A01 = cBu;
        this.A02 = num;
        this.A04 = str2;
        this.A00 = bbb;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        List<C67e> list = (List) obj;
        Boolean bool = false;
        if (list != null) {
            for (C67e c67e : list) {
                String str = this.A03;
                if (11T.A0O(str, c67e.A00.A02.A02)) {
                    CBu cBu = this.A01;
                    Integer num = this.A02;
                    String str2 = this.A04;
                    long parseLong = Long.parseLong(str2);
                    11T.A0D(str);
                    long parseLong2 = Long.parseLong(str);
                    11T.A0F(num, 0);
                    CBu.A00(cBu, num, Long.valueOf(parseLong), Long.valueOf(parseLong2), "msgr_eligibility_check_fb_account_saved");
                    if (1Br.A07(this.A00.A00).AZk(num == 0S2.A01 ? 18308316006926132L : 18308316006860595L)) {
                        CBu.A00(cBu, num, Long.valueOf(Long.parseLong(str2)), 1BK.A0n(str), "msgr_auto_login_qe");
                        bool = true;
                    }
                    return bool;
                }
            }
        }
        0fH.A0j("AutoLoginUtil", "FB user's credentials are not saved in FB");
        return null;
    }
}
