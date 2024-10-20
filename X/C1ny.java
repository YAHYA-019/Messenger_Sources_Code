package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.1ny, reason: invalid class name */
/* loaded from: 1ny.class */
public final class C1ny implements C1nz {
    public final long A00;
    public final String A01;
    public final Object[] A02;

    public C1ny(String str, Object[] objArr, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = objArr;
    }

    @Override // X.C1nz
    public String ATs() {
        return StringFormatUtil.formatStrLocaleSafe(this.A01, this.A02);
    }

    @Override // X.C1nz
    public long getStartTime() {
        return this.A00;
    }
}
