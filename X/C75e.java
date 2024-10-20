package X;

import com.facebook.ui.emoji.model.EmojiSet;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.75e, reason: invalid class name */
/* loaded from: 75e.class */
public final class C75e extends C00q implements C00m {
    public static final C75e A00 = new C75e();

    public C75e() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        List<EmojiSet> AJg = ((C22a) 1Bi.A03(66067)).AJg();
        11T.A0A(AJg);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (EmojiSet emojiSet : AJg) {
            if (!emojiSet.A00()) {
                builder.add(emojiSet);
            }
        }
        return 1Fj.A01(builder);
    }
}
