package X;

import java.io.Serializable;

/* renamed from: X.266, reason: invalid class name */
/* loaded from: 266.class */
public class AnonymousClass266 implements AnonymousClass267, Serializable {
    @Override // X.AnonymousClass267
    public void DB9(28Q r302, int i) {
        if (this instanceof AnonymousClass264) {
            r302.A0c(' ');
            return;
        }
        if (!(this instanceof AnonymousClass269)) {
            return;
        }
        AnonymousClass269 anonymousClass269 = (AnonymousClass269) this;
        r302.A0q(anonymousClass269.eol);
        if (i <= 0) {
            return;
        }
        int i2 = i * anonymousClass269.charsPerLevel;
        while (true) {
            int i3 = i2;
            char[] cArr = anonymousClass269.indents;
            int length = cArr.length;
            if (i3 <= length) {
                r302.A0w(cArr, 0, i3);
                return;
            } else {
                r302.A0w(cArr, 0, length);
                i2 = i3 - anonymousClass269.indents.length;
            }
        }
    }
}
