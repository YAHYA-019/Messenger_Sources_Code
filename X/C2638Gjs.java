package X;

import com.facebook.rsys.reactions.gen.EmojiModel;

/* renamed from: X.Gjs, reason: case insensitive filesystem */
/* loaded from: Gjs.class */
public final class C2638Gjs extends C04v implements JDB {
    public final EmojiModel A00;
    public final String A01;

    public C2638Gjs(EmojiModel emojiModel, String str) {
        this.A00 = emojiModel;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2638Gjs)) {
                return false;
            }
            C2638Gjs c2638Gjs = (C2638Gjs) obj;
            if (!11T.A0O(this.A00, c2638Gjs.A00) || !11T.A0O(this.A01, c2638Gjs.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 1BL.A03(this.A00));
    }
}
