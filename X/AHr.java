package X;

import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import kotlin.jvm.functions.Function1;

/* loaded from: AHr.class */
public final /* synthetic */ class AHr implements Function1 {
    public final /* synthetic */ Parcelable A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 7Z3 A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ 6Gb A04;
    public final /* synthetic */ AnonymousClass622 A05;
    public final /* synthetic */ Capabilities A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ float[] A08;

    public /* synthetic */ AHr(Parcelable parcelable, View view, 7Z3 r304, Message message, 6Gb r306, AnonymousClass622 anonymousClass622, Capabilities capabilities, float[] fArr, boolean z) {
        this.A04 = r306;
        this.A07 = z;
        this.A02 = r304;
        this.A03 = message;
        this.A05 = anonymousClass622;
        this.A00 = parcelable;
        this.A08 = fArr;
        this.A01 = view;
        this.A06 = capabilities;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        6Gb r0 = this.A04;
        boolean z = this.A07;
        7Z3 r02 = this.A02;
        Message message = this.A03;
        AnonymousClass622 anonymousClass622 = this.A05;
        Parcelable parcelable = this.A00;
        float[] fArr = this.A08;
        View view = this.A01;
        Capabilities capabilities = this.A06;
        r0.A06 = AnonymousClass001.A1P(AnonymousClass001.A03(obj));
        r0.A0c.execute(new AHL(parcelable, view, r02, message, r0, anonymousClass622, capabilities, fArr, z));
        return 04S.A00;
    }
}
