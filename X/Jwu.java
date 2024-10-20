package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.widget.pricetable.PriceTable;

/* loaded from: Jwu.class */
public final class Jwu extends AbstractC3052Jhk {
    private final String A03(Q35 q35, PriceInfo priceInfo, Integer num, Integer num2) {
        Context context;
        int i;
        if ((num == 0S2.A0C && 2yD.A03(DLb.A00(), 36318084543361087L) && priceInfo.A01 == KO7.A07) || (num2 == 0S2.A01 && priceInfo.A01 == KO7.A05)) {
            context = q35.A00.getContext();
            i = 2131956074;
        } else {
            if (!this.A01 || priceInfo.A01 != KO7.A03) {
                return priceInfo.A04;
            }
            context = q35.A00.getContext();
            i = 2131956080;
        }
        String string = context.getString(i);
        11T.A0D(string);
        return string;
    }

    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        View A01 = AbstractC3052Jhk.A01(viewGroup, this);
        11T.A0I(A01, "null cannot be cast to non-null type com.facebookpay.widget.pricetable.PriceTable");
        PriceTable priceTable = (PriceTable) A01;
        if (this.A01) {
            priceTable.A01 = false;
            priceTable.A00 = true;
            LBg.A01(priceTable, 4);
        }
        return new Q35(this, priceTable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ea, code lost:
    
        if (r319 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a A[SYNTHETIC] */
    @Override // X.AbstractC3052Jhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A08(X.C2lb r302, X.FJC r303) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jwu.A08(X.2lb, X.FJC):void");
    }
}
