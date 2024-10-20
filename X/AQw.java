package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: AQw.class */
public final class AQw extends C00q implements Function1 {
    public final /* synthetic */ 8aS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQw(8aS r302) {
        super(1);
        this.this$0 = r302;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        3xC r0 = (3xC) obj;
        11T.A0F(r0, 0);
        1BV.A00(67678).get();
        View view = r0.A00;
        11T.A09(view);
        8Ca A00 = C9kp.A00(view, this.this$0.A02, 5);
        new JZn(A00.A00).inflate(2131623952, ((7QJ) A00).A04);
        final 8aS r02 = this.this$0;
        final int i = 0;
        ((7QJ) A00).A01 = new JDp(r02, i) { // from class: X.9qI
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = r02;
            }

            /* JADX WARN: Code restructure failed: missing block: B:46:0x03bd, code lost:
            
                if (r306 == null) goto L46;
             */
            @Override // X.JDp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean onMenuItemClick(android.view.MenuItem r302) {
                /*
                    Method dump skipped, instructions count: 978
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9qI.onMenuItemClick(android.view.MenuItem):boolean");
            }
        };
        A00.A00();
        return 04S.A00;
    }
}
