package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.settings.mesettings.surface.MessengerMePreferenceActivity;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4YC, reason: invalid class name */
/* loaded from: 4YC.class */
public final class C4YC extends C00q implements Function1 {
    public static final C4YC A00 = new C4YC();

    public C4YC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        11T.A0F(view, 0);
        1Bn.A0A(147788);
        Context context = view.getContext();
        11T.A0A(context);
        0LS.A0A(context, C3o5.A0D(context, MessengerMePreferenceActivity.class));
        return 04S.A00;
    }
}
