package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import java.util.List;

/* renamed from: X.Af1, reason: case insensitive filesystem */
/* loaded from: Af1.class */
public final class C1359Af1 extends ClickableSpan {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 06Z A02;
    public final /* synthetic */ BOM A03;
    public final /* synthetic */ ThreadSummary A04;
    public final /* synthetic */ Byh A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ C00m A07;

    public C1359Af1(Context context, 06Z r303, BOM bom, ThreadSummary threadSummary, Byh byh, List list, C00m c00m, long j) {
        this.A06 = list;
        this.A05 = byh;
        this.A04 = threadSummary;
        this.A02 = r303;
        this.A07 = c00m;
        this.A00 = j;
        this.A03 = bom;
        this.A01 = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        List list = this.A06;
        if (list.size() == 1) {
            Byh byh = this.A05;
            if (!((6oD) 1Br.A0B(byh.A05)).A03()) {
                User user = (User) 0QD.A0D(list);
                ((7EN) 1Br.A0B(byh.A01)).A07(this.A02, this.A04, BNT.A0c, user);
                this.A07.invoke();
                CQX A0i = AbM.A0i(this.A05.A08);
                String valueOf = String.valueOf(this.A00);
                A0i.A0J(this.A03, BNT.A0G, valueOf);
            }
        }
        BX8.A00(AbF.A0f(this.A04), BNT.A0G).A0m(this.A02, "BlockMemberFragment");
        this.A07.invoke();
        CQX A0i2 = AbM.A0i(this.A05.A08);
        String valueOf2 = String.valueOf(this.A00);
        A0i2.A0J(this.A03, BNT.A0G, valueOf2);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.linkColor = 7zQ.A0m(this.A05.A03).Atv();
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(2KQ.A02.A00(this.A01));
    }
}
