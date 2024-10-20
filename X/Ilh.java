package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Ilh.class */
public final /* synthetic */ class Ilh implements JHK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ CallerContext A02;
    public final /* synthetic */ C06974ih A03;
    public final /* synthetic */ 6S5 A04;
    public final /* synthetic */ 6Pd A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ Ilh(Context context, CallerContext callerContext, C06974ih c06974ih, 6S5 r305, 6Pd r306, int i, boolean z) {
        this.A05 = r306;
        this.A06 = z;
        this.A01 = context;
        this.A00 = i;
        this.A04 = r305;
        this.A03 = c06974ih;
        this.A02 = callerContext;
    }

    public final void BwE(HZ3 hz3, HZ3 hz32) {
        6Pd r0 = this.A05;
        boolean z = this.A06;
        Context context = this.A01;
        int i = this.A00;
        6S5 r02 = this.A04;
        C06974ih c06974ih = this.A03;
        AnonymousClass001.A07().post(new SEx(context, this.A02, c06974ih, r02, r0, hz32, hz3, i, z));
    }
}
