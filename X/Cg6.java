package X;

import com.facebook.messaging.service.model.DeleteMessagesParams;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg6.class */
public final class Cg6 implements 1Ro {
    public static final String __redex_internal_original_name = "DeleteMessagesMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Joiner joiner = new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        Joiner.AnonymousClass2 anonymousClass2 = new Joiner(joiner) { // from class: com.google.common.base.Joiner.2
            public AnonymousClass2(Joiner joiner2) {
                super(joiner2);
            }

            @Override // com.google.common.base.Joiner
            public Appendable appendTo(Appendable appendable, Iterator it) {
                Preconditions.checkNotNull(appendable, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        appendable.append(Joiner.this.toString(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        appendable.append(Joiner.this.separator);
                        appendable.append(Joiner.this.toString(next2));
                    }
                }
                return appendable;
            }
        };
        ImmutableSet immutableSet = ((DeleteMessagesParams) obj).A01;
        11T.A0F(immutableSet, 0);
        ArrayList A0z = 1BL.A0z(immutableSet);
        Iterator it = immutableSet.iterator();
        while (it.hasNext()) {
            A0z.add(R1N.A00(AnonymousClass001.A0i(it)));
        }
        String join = anonymousClass2.join(A0z);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("ids", join));
        A0s.add(new BasicNameValuePair("format", "json"));
        return new C04103zy(0S2.A00, "deleteMessages", "DELETE", "", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
