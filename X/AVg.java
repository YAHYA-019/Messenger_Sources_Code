package X;

import android.text.Spannable;
import com.facebook.messaging.magicwords.model.MagicWordRange;
import com.facebook.messaging.magicwords.plugins.consumption.composertextwatcher.MagicWordsTextWatcher;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractCollection;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AVg.class */
public final class AVg extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A01 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            MagicWordRange magicWordRange = (MagicWordRange) obj;
            1BK.A1M(magicWordRange, obj2);
            if (((ImmutableMap) this.A04).containsKey(obj2)) {
                MagicWordsTextWatcher magicWordsTextWatcher = (MagicWordsTextWatcher) this.A06;
                if (C5yc.A00((C5yc) 1Br.A0B(magicWordsTextWatcher.A01)).AZk(36315700836443472L)) {
                    6fY r0 = (6fY) 1Br.A0B(magicWordsTextWatcher.A00);
                    Spannable spannable = (Spannable) this.A05;
                    11T.A0I(spannable, "null cannot be cast to non-null type android.text.Spannable");
                    r0.A7e(spannable, magicWordRange.A01, magicWordRange.A00);
                }
                List list = (List) this.A03;
                boolean z = magicWordRange.A03;
                list.add(new MagicWordRange(magicWordRange.A02, magicWordRange.A00, Math.max(magicWordRange.A01 - this.A01, 0), z));
                ((AbstractCollection) this.A02).add(obj2);
            }
        } else {
            7zL.A1P(obj2);
            ((AHs) this.A06).A06((MLv) obj, this.A02, this.A03, this.A04, this.A05, Kv9.A01(this.A01) | 1);
        }
        return 04S.A00;
    }
}
