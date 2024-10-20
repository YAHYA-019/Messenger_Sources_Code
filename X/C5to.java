package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.5to, reason: invalid class name */
/* loaded from: 5to.class */
public final class C5to extends C04v {
    public final int A00;
    public final int A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C5to(InterfaceC07874l5 interfaceC07874l5) {
        1qX r0 = (1qX) interfaceC07874l5;
        boolean z = r0.mResultSet.getBoolean(0, 84);
        int integer = r0.mResultSet.getInteger(0, 1);
        String string = r0.mResultSet.getString(0, 33);
        String string2 = r0.mResultSet.getString(0, 49);
        String string3 = r0.mResultSet.getString(0, 52);
        int integer2 = r0.mResultSet.getInteger(0, 108);
        boolean z2 = r0.mResultSet.getBoolean(0, ActionId.RTMP_STREAM_PREPARED);
        Long nullableLong = r0.mResultSet.getNullableLong(0, 3);
        boolean z3 = r0.mResultSet.getBoolean(0, ActionId.NEW_START_FOUND);
        String string4 = r0.mResultSet.getString(0, 4);
        this.A08 = z;
        this.A01 = integer;
        this.A06 = string;
        this.A04 = string2;
        this.A05 = string3;
        this.A00 = integer2;
        this.A07 = z2;
        this.A02 = nullableLong;
        this.A09 = z3;
        this.A03 = string4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5to)) {
                return false;
            }
            C5to c5to = (C5to) obj;
            if (this.A08 != c5to.A08 || this.A01 != c5to.A01 || !11T.A0O(this.A06, c5to.A06) || !11T.A0O(this.A04, c5to.A04) || !11T.A0O(this.A05, c5to.A05) || this.A00 != c5to.A00 || this.A07 != c5to.A07 || !11T.A0O(this.A02, c5to.A02) || this.A09 != c5to.A09 || !11T.A0O(this.A03, c5to.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A00 = ((((((((((((((((AnonymousClass002.A00(this.A08 ? 1 : 0) * 31) + this.A01) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A00 + i;
    }
}
