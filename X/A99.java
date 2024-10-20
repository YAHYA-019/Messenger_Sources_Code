package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: A99.class */
public final class A99 implements 7Lc {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public A99(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CFT(String[] strArr) {
        if (this.A00 != 0) {
            Fci fci = (Fci) this.A01;
            CallerContext callerContext = Fci.A0f;
            fci.A0P = strArr;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            fci.A0O = strArr2;
            int length = strArr2.length;
            fci.A0Q = new boolean[length];
            EMe[] eMeArr = new EMe[length];
            fci.A0N = eMeArr;
            Arrays.fill(eMeArr, EMe.A02);
            Fci.A03((FbUserSession) this.A02, fci);
            return;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : strArr) {
            BasicEmoji A02 = 2KY.A02((C22a) 1Br.A0B(((9Oj) this.A02).A01), str);
            if (A02 != null) {
                builder.m11011add((Object) A02);
            }
        }
        ((ImmutableList.Builder) this.A01).m11011add((Object) new EmojiSet(new EmojiSet.Metadata(3E2.A06, builder.build()), 0, 2131960001, 2131960001));
    }
}
