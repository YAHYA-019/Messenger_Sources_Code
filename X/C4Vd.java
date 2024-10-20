package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.omnistore.IndexedFields;

/* renamed from: X.4Vd, reason: invalid class name */
/* loaded from: 4Vd.class */
public final class C4Vd implements DHw {
    public final IndexedFields A00;

    public C4Vd(IndexedFields indexedFields) {
        this.A00 = indexedFields;
    }

    @Override // X.DHw
    public void A5h(String str, float f) {
        this.A00.addFieldValue(str, StringFormatUtil.formatStrLocaleSafe("%f", Float.valueOf(f)));
    }

    @Override // X.DHw
    public void A6I(String str, long j) {
        this.A00.addFieldValue(AnonymousClass000.A00(84), StringFormatUtil.formatStrLocaleSafe("%d", Long.valueOf(j)));
    }

    @Override // X.DHw
    public void A7S(String str, String str2) {
        this.A00.addFieldValue(str, str2);
    }
}
