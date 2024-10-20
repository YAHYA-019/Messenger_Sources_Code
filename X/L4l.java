package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;

/* loaded from: L4l.class */
public final class L4l {
    public 2Jd A00;
    public ImmutableList A01;
    public final 2Jd A02;
    public final 2Jd A03;
    public final OtcInput A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public L4l(2Jd r302, 2Jd r303, 2Jd r304, OtcInput otcInput, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C3o5.A0k(str2, 2, str4);
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A01 = immutableList;
        this.A0B = str4;
        this.A06 = immutableList2;
        this.A05 = immutableList3;
        this.A02 = r302;
        this.A09 = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A08 = str8;
        this.A0A = str9;
        this.A04 = otcInput;
        this.A03 = r303;
        this.A00 = r304;
    }

    public static /* synthetic */ L4l A00(L4l l4l, OtcInput otcInput, ImmutableList immutableList, int i) {
        OtcInput otcInput2 = otcInput;
        ImmutableList immutableList2 = immutableList;
        2Jd r308 = null;
        String str = (i & 1) != 0 ? l4l.A0F : null;
        String str2 = (i & 2) != 0 ? l4l.A0E : null;
        String str3 = (i & 4) != 0 ? l4l.A0C : null;
        if ((i & 8) != 0) {
            immutableList2 = l4l.A01;
        }
        String str4 = (i & 16) != 0 ? l4l.A0B : null;
        ImmutableList immutableList3 = (i & 32) != 0 ? l4l.A06 : null;
        ImmutableList immutableList4 = (i & 64) != 0 ? l4l.A05 : null;
        2Jd r318 = (i & 128) != 0 ? l4l.A02 : null;
        String str5 = (i & 256) != 0 ? l4l.A09 : null;
        String str6 = (i & 512) != 0 ? l4l.A07 : null;
        String str7 = (i & 1024) != 0 ? l4l.A0D : null;
        String str8 = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? l4l.A08 : null;
        String str9 = (i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0 ? l4l.A0A : null;
        if ((i & 8192) != 0) {
            otcInput2 = l4l.A04;
        }
        2Jd r317 = (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? l4l.A03 : null;
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            r308 = l4l.A00;
        }
        11T.A0F(str, 0);
        7zT.A1W(str2, str3, immutableList2, str4);
        1BL.A1G(immutableList3, immutableList4);
        11T.A0F(str5, 8);
        return new L4l(r318, r317, r308, otcInput2, immutableList2, immutableList3, immutableList4, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L4l)) {
                return false;
            }
            L4l l4l = (L4l) obj;
            if (!11T.A0O(this.A0F, l4l.A0F) || !11T.A0O(this.A0E, l4l.A0E) || !11T.A0O(this.A0C, l4l.A0C) || !11T.A0O(this.A01, l4l.A01) || !11T.A0O(this.A0B, l4l.A0B) || !11T.A0O(this.A06, l4l.A06) || !11T.A0O(this.A05, l4l.A05) || !11T.A0O(this.A02, l4l.A02) || !11T.A0O(this.A09, l4l.A09) || !11T.A0O(this.A07, l4l.A07) || !11T.A0O(this.A0D, l4l.A0D) || !11T.A0O(this.A08, l4l.A08) || !11T.A0O(this.A0A, l4l.A0A) || !11T.A0O(this.A04, l4l.A04) || !11T.A0O(this.A03, l4l.A03) || !11T.A0O(this.A00, l4l.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass002.A07(this.A09, (AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A06, AnonymousClass002.A07(this.A0B, AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A0C, AnonymousClass002.A07(this.A0E, 4YV.A02(this.A0F))))))) + AnonymousClass001.A02(this.A02)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A0D)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentDataQueryInput(sessionId=");
        A0k.append(this.A0F);
        A0k.append(DKB.A00(11));
        A0k.append(this.A0E);
        A0k.append(", paymentProductId=");
        A0k.append(this.A0C);
        A0k.append(", componentTypes=");
        A0k.append(this.A01);
        A0k.append(", paymentContainerMode=");
        A0k.append(this.A0B);
        A0k.append(", supportedContainerTypes=");
        A0k.append(this.A06);
        A0k.append(", paymentActionTypes=");
        A0k.append(this.A05);
        A0k.append(", chargeAmount=");
        A0k.append(this.A02);
        A0k.append(", fetchType=");
        A0k.append(this.A09);
        A0k.append(", clientReceiverId=");
        A0k.append(this.A07);
        A0k.append(", receiverId=");
        A0k.append(this.A0D);
        A0k.append(", ecpUserExperienceType=");
        A0k.append(this.A08);
        A0k.append(", orderId=");
        A0k.append(this.A0A);
        A0k.append(", otcInput=");
        A0k.append(this.A04);
        A0k.append(", otcComponentInput=");
        A0k.append(this.A03);
        A0k.append(", bloksParams=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
