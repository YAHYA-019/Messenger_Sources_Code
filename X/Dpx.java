package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* loaded from: Dpx.class */
public final class Dpx extends C04v {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final TextUtils.TruncateAt A04;
    public final 2KG A05;
    public final 2K4 A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final boolean A0B;

    public /* synthetic */ Dpx(2KG r302, 2K4 r303, int i, int i2) {
        Integer num = null;
        r303 = (i2 & 4) != 0 ? 2K4.A04 : r303;
        TextUtils.TruncateAt truncateAt = (i2 & 8) != 0 ? TextUtils.TruncateAt.END : null;
        int i3 = (i2 & 32) != 0 ? (-1) << (-1) : 0;
        i = (i2 & 64) != 0 ? (-1) >>> 1 : i;
        long j = (i2 & 128) != 0 ? 9221401712017801216L : 0L;
        Integer num2 = (i2 & 1024) != 0 ? 0S2.A00 : null;
        Integer num3 = (i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? 0S2.A00 : null;
        Integer num4 = (i2 & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0 ? 0S2.A00 : null;
        r302 = (i2 & 8192) != 0 ? 2KG.A03 : r302;
        num = (i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? 0S2.A00 : num;
        long j2 = (i2 & 65536) != 0 ? 9221401712017801216L : 0L;
        boolean A1N = AnonymousClass001.A1N(i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        1BK.A1K(r303, 3, truncateAt);
        11T.A0F(num2, 11);
        11T.A0F(num3, 12);
        7zP.A1Q(num4, 13, r302);
        11T.A0F(num, 15);
        this.A06 = r303;
        this.A04 = truncateAt;
        this.A01 = i3;
        this.A00 = i;
        this.A02 = j;
        this.A09 = num2;
        this.A07 = num3;
        this.A0A = num4;
        this.A05 = r302;
        this.A08 = num;
        this.A03 = j2;
        this.A0B = A1N;
    }
}
