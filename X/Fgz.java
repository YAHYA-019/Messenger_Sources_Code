package X;

import com.facebook.payments.p2p.service.model.sync.FetchIrisSequenceIdResult;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgz.class */
public final class Fgz implements 1Ro {
    public static final String __redex_internal_original_name = "FetchIrisSequenceIdMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("q", "viewer() { peer_to_peer_payments { iris_sequence_id } }"), A0s);
        AbF.A1P(A0C, "fetchIrisSequenceId");
        A0C.A0F = "graphql";
        return DKE.A0X(A0C, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        AbstractC01033pi A00 = anonymousClass439.A00();
        do {
            A00.A1K();
            if (!A00.A1m()) {
                return new FetchIrisSequenceIdResult((String) null);
            }
        } while (A00.A1Y() != "peer_to_peer_payments");
        A00.A1K();
        return A00.A1W(FetchIrisSequenceIdResult.class);
    }
}
