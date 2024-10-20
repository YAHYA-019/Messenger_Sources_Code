package X;

import com.facebook.presence.api.model.NoteTypeEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4L3, reason: invalid class name */
/* loaded from: 4L3.class */
public abstract class C4L3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    public static final List A00(NoteTypeEnum noteTypeEnum, String str, boolean z) {
        ArrayList A11;
        if (noteTypeEnum == null) {
            A11 = null;
        } else {
            int ordinal = noteTypeEnum.ordinal();
            if (ordinal == 0) {
                C83n c83n = (C83n) 1Bn.A0A(67747);
                2TI r0 = (2TI) 1Bn.A0A(66725);
                if (str == null) {
                    str = "";
                }
                A11 = C0s8.A11("text");
                if (c83n.A02(str) && r0.A00.AZk(72340842837577972L)) {
                    A11.add(c83n.A01(str) ? "gif_animated_emoji" : "standard_animated_emoji");
                }
            } else if (ordinal == 1) {
                A11 = C0s8.A14("music", "text");
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                A11 = Collections.singletonList("music");
                11T.A0A(A11);
            }
            if (((2TI) 1Bn.A0A(66725)).A04(false) && z) {
                return 0QD.A0P("mention", A11);
            }
        }
        return A11;
    }
}
