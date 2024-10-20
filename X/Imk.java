package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Function;
import java.util.Set;

/* loaded from: Imk.class */
public final class Imk implements Function {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ C68t A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ C5id A04;

    public Imk(Context context, Uri uri, C68t c68t, Message message, C5id c5id) {
        this.A02 = c68t;
        this.A03 = message;
        this.A01 = uri;
        this.A04 = c5id;
        this.A00 = context;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean valueOf;
        boolean A1V = AnonymousClass001.A1V(obj);
        C68t c68t = this.A02;
        if (A1V) {
            Set set = C68t.A0Q;
            C7N c7n = (C7N) c68t.A02.get();
            Message message = this.A03;
            c7n.A00(0S2.A01, message == null ? null : message.A1V, (String) null, true);
            c68t.A09.get();
            this.A01.toString();
            if (C68t.A0C(this.A04)) {
                ((7Lt) c68t.A0B.get()).A0J(this.A00, message);
            }
            valueOf = true;
        } else {
            Context context = this.A00;
            Uri uri = this.A01;
            Message message2 = this.A03;
            boolean A0A = C68t.A0A(context, uri, c68t, message2, this.A04);
            valueOf = Boolean.valueOf(A0A);
            if (A0A) {
                ((C7N) c68t.A02.get()).A00(0S2.A02, message2 == null ? null : message2.A1V, (String) null, true);
                return valueOf;
            }
        }
        return valueOf;
    }
}
