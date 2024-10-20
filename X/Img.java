package X;

import com.google.common.base.Function;

/* loaded from: Img.class */
public final /* synthetic */ class Img implements Function {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ Img(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((IFQ) obj).A09(this.A00, this.A01, this.A02);
    }
}
