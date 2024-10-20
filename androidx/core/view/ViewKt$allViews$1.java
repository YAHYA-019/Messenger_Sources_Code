package androidx.core.view;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Ml;
import X.0Mn;
import X.0Mo;
import X.0Mp;
import X.0Mq;
import X.AnonymousClass001;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function2;

/* loaded from: ViewKt$allViews$1.class */
public final class ViewKt$allViews$1 extends 0Ml implements Function2 {
    public final /* synthetic */ View $this_allViews;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, 0DR r303) {
        super(2, r303);
        this.$this_allViews = view;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, r303);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Mn r307;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            r307 = (0Mn) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = r307;
            this.label = 1;
            if (r307.A00(view, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
                return 04S.A00;
            }
            r307 = (0Mn) this.L$0;
            0Dt.A00(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            this.L$0 = null;
            this.label = 2;
            0Mq r02 = new 0Mq(new 0Mo((ViewGroup) view2), 0Mp.A00);
            if (r02.hasNext()) {
                r307.A01 = r02;
                r307.A00 = 2;
                r307.A02 = this;
                return r0;
            }
        }
        return 04S.A00;
    }
}
