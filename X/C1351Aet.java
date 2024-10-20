package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.PollingInputParams;

/* renamed from: X.Aet, reason: case insensitive filesystem */
/* loaded from: Aet.class */
public final class C1351Aet extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BmK A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C1351Aet(BmK bmK, String str, int i, boolean z) {
        this.A01 = bmK;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        String str;
        BmK bmK = this.A01;
        if (this.A03) {
            str = this.A02.substring(this.A00);
            11T.A0A(str);
        } else {
            str = null;
        }
        63D r0 = bmK.A01;
        ThreadKey threadKey = bmK.A00;
        C1pq.A08("threadKey", threadKey);
        r0.CVn(AbL.A0D(new PollingInputParams(BOT.A02, threadKey, str, null, null, false), COS.A01, threadKey));
    }
}
