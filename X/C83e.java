package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.83e, reason: invalid class name */
/* loaded from: 83e.class */
public final class C83e extends C00q implements Function1 {
    public final /* synthetic */ Function1 $measureChild;
    public final /* synthetic */ C2lh $measureVersion;
    public final /* synthetic */ C00m $onRefresh;
    public final /* synthetic */ List $onScrollListeners;
    public final /* synthetic */ C2ky $recyclerEventsController;
    public final /* synthetic */ 2lX $this_DefaultMountBehavior;
    public final /* synthetic */ 2lW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83e(2lX r302, C2lh c2lh, 2lW r304, C2ky c2ky, List list, C00m c00m, Function1 function1) {
        super(1);
        this.$this_DefaultMountBehavior = r302;
        this.this$0 = r304;
        this.$measureChild = function1;
        this.$measureVersion = c2lh;
        this.$onRefresh = c00m;
        this.$onScrollListeners = list;
        this.$recyclerEventsController = c2ky;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2ln c2ln = (C2ln) obj;
        11T.A0F(c2ln, 0);
        c2ln.A01 = true;
        2lW r0 = this.this$0;
        Function1 function1 = this.$measureChild;
        try {
            c2ln.A00 = 0DY.A0K("recycler-decorations", 127);
            c2ln.A02(83Q.A01(function1, r0, 12), new Object[]{r0.A0G, function1});
            c2ln.A00 = null;
            C2lh c2lh = this.$measureVersion;
            2lW r02 = this.this$0;
            2lX r03 = this.$this_DefaultMountBehavior;
            try {
                c2ln.A00 = 0DY.A0K("recycler-equivalent-mount", 127);
                Object obj2 = c2lh.A02;
                C2X2 c2x2 = r02.A0C;
                Boolean valueOf = Boolean.valueOf(r02.A0H);
                Boolean valueOf2 = Boolean.valueOf(r02.A0K);
                Integer valueOf3 = Integer.valueOf(r02.A02);
                Integer valueOf4 = Integer.valueOf(r02.A07);
                Integer valueOf5 = Integer.valueOf(r02.A06);
                Integer valueOf6 = Integer.valueOf(r02.A00);
                Boolean valueOf7 = Boolean.valueOf(r02.A0J);
                Boolean valueOf8 = Boolean.valueOf(r02.A0L);
                Boolean valueOf9 = Boolean.valueOf(r02.A0R);
                Integer valueOf10 = Integer.valueOf(r02.A01);
                Integer num = r02.A0F;
                Integer valueOf11 = Integer.valueOf(r02.A05);
                2NI r04 = r02.A09;
                c2ln.A02(83Q.A01(r03, r02, 13), new Object[]{obj2, c2x2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, 0, valueOf8, valueOf9, valueOf10, num, valueOf11, r04 != null ? r04.getClass() : null});
                c2ln.A00 = null;
                2lW r05 = this.this$0;
                C00m c00m = this.$onRefresh;
                List list = this.$onScrollListeners;
                C2ky c2ky = this.$recyclerEventsController;
                try {
                    c2ln.A00 = 0DY.A0K("recycler-equivalent-bind", 127);
                    c2ln.A02(new AVZ(1, list, c2ky, c00m, r05), new Object[]{new Object()});
                    c2ln.A00 = null;
                    return 04S.A00;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
