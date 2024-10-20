package X;

import android.media.MediaCodecInfo;
import kotlin.jvm.functions.Function1;

/* loaded from: JB9.class */
public final class JB9 extends C00q implements Function1 {
    public static final JB9 A00 = new JB9();

    public JB9() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('(');
        A0k.append(codecProfileLevel.profile);
        A0k.append(',');
        return DKH.A0p(A0k, codecProfileLevel.level);
    }
}
