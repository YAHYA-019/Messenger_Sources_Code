package X;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.2n9, reason: invalid class name */
/* loaded from: 2n9.class */
public final class C2n9 extends C00q implements C00m {
    public final /* synthetic */ int $inlineCodeTextSizePx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2n9(int i) {
        super(0);
        this.$inlineCodeTextSizePx = i;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Integer num = 0S2.A1G;
        Pattern compile = Pattern.compile("(?<=[\\s*_~'\"(]|^)(`)(\\S(?:.*?\\S)??)(`)(?=[\\s\\w*_~,.;:!?'\")]|$)");
        11T.A0A(compile);
        final int i = this.$inlineCodeTextSizePx;
        return new C2n3(C2n3.A06, new C2n2(i) { // from class: X.2nD
            public final int A00;

            {
                this.A00 = i;
            }

            @Override // X.C2n2
            public List AL0(Kl6 kl6) {
                return C0s8.A14(new TypefaceSpan("monospace"), new AbsoluteSizeSpan(this.A00));
            }
        }, num, compile, false, true);
    }
}
