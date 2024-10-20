package X;

import android.media.projection.MediaProjection;
import kotlin.jvm.functions.Function1;

/* loaded from: JB2.class */
public final class JB2 extends C00q implements Function1 {
    public static final JB2 A00 = new JB2();

    public JB2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaProjection mediaProjection = (MediaProjection) obj;
        11T.A0F(mediaProjection, 0);
        return new RND(mediaProjection);
    }
}
