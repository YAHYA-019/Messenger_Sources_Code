package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.google.common.base.Preconditions;

/* loaded from: Hqa.class */
public final class Hqa {
    public final Context A00;
    public final LayoutInflater A01;
    public final ViewGroup A02;
    public final C1u2 A0C = 7zP.A0R();
    public final C03y A05 = new C03x(20);
    public final C03y A0A = new C03x(20);
    public final C03y A08 = new C03x(1);
    public final C03y A04 = new C03x(1);
    public final C03y A0B = new C03x(1);
    public final C03y A03 = new C03x(1);
    public final C03y A07 = new C03x(1);
    public final C03y A06 = new C03x(1);
    public final C03y A0D = new C03x(1);
    public final C03y A09 = new C03x(1);

    public Hqa(Context context, ViewGroup viewGroup) {
        this.A00 = context;
        viewGroup.getClass();
        this.A02 = viewGroup;
        this.A01 = LayoutInflater.from(context);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public FbDraweeView A00() {
        ?? r0 = (FbDraweeView) this.A05.A3p();
        if (r0 == 0) {
            return (FbDraweeView) this.A01.inflate(2132543391, this.A02, false);
        }
        Preconditions.checkState(AbstractC2326GOr.A1W(r0));
        return r0;
    }
}
