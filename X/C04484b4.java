package X;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.4b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4b4.class */
public final class C04484b4 implements InterfaceC04494b5 {
    public Object A00;
    public final String A01;
    public final int A02;
    public final InterfaceC04494b5 A03;
    public final C2r9 A04;
    public final C02353ux A05;
    public final C2rD A06;
    public final String A07;

    public C04484b4(InterfaceC04494b5 interfaceC04494b5, C2r9 c2r9, C02353ux c02353ux, C2rD c2rD, String str, String str2) {
        11T.A0F(str, 1);
        11T.A0F(c2rD, 3);
        11T.A0F(c2r9, 4);
        this.A01 = str;
        this.A05 = c02353ux;
        this.A06 = c2rD;
        this.A04 = c2r9;
        this.A03 = interfaceC04494b5;
        this.A07 = str2;
        int i = 0;
        int hashCode = ((((((str.hashCode() * 31) + (c02353ux != null ? c02353ux.hashCode() : 0)) * 31) + c2rD.hashCode()) * 31) + this.A04.hashCode()) * 31;
        InterfaceC04494b5 interfaceC04494b52 = this.A03;
        int hashCode2 = (hashCode + (interfaceC04494b52 != null ? interfaceC04494b52.hashCode() : 0)) * 31;
        String str3 = this.A07;
        this.A02 = hashCode2 + (str3 != null ? str3.hashCode() : i);
        RealtimeSinceBootClock.A00.now();
    }

    @Override // X.InterfaceC04494b5
    public boolean AHo(Uri uri) {
        String str = this.A01;
        String obj = uri.toString();
        11T.A0A(obj);
        return 0CU.A0T(str, obj, false);
    }

    @Override // X.InterfaceC04494b5
    public String BIN() {
        return this.A01;
    }

    @Override // X.InterfaceC04494b5
    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
            C04484b4 c04484b4 = (C04484b4) obj;
            if (11T.A0O(this.A01, c04484b4.A01) && 11T.A0O(this.A05, c04484b4.A05) && 11T.A0O(this.A06, c04484b4.A06) && 11T.A0O(this.A04, c04484b4.A04) && 11T.A0O(this.A03, c04484b4.A03) && 11T.A0O(this.A07, c04484b4.A07)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.InterfaceC04494b5
    public int hashCode() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BitmapMemoryCacheKey(sourceString=");
        A0k.append(this.A01);
        A0k.append(", resizeOptions=");
        A0k.append(this.A05);
        A0k.append(", rotationOptions=");
        A0k.append(this.A06);
        A0k.append(", imageDecodeOptions=");
        A0k.append(this.A04);
        A0k.append(", postprocessorCacheKey=");
        A0k.append(this.A03);
        A0k.append(", postprocessorName=");
        A0k.append(this.A07);
        return 4YV.A0x(A0k);
    }
}
