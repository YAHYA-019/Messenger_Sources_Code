package X;

import android.location.Location;
import com.facebook.addresstypeahead.simpleaddresstypeahead.AddressTypeAheadInput;
import com.facebook.addresstypeahead.simpleaddresstypeahead.AddressTypeAheadTextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;

/* loaded from: D8l.class */
public final class D8l implements Runnable {
    public static final String __redex_internal_original_name = "AddressTypeAheadTextView$2";
    public final /* synthetic */ AddressTypeAheadTextView A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ String A02;

    public D8l(AddressTypeAheadTextView addressTypeAheadTextView, FbUserSession fbUserSession, String str) {
        this.A00 = addressTypeAheadTextView;
        this.A01 = fbUserSession;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        AddressTypeAheadTextView addressTypeAheadTextView = this.A00;
        addressTypeAheadTextView.A07 = null;
        String str = this.A02;
        5iG r0 = (5iG) addressTypeAheadTextView.A04.get();
        BKh bKh = BKh.A01;
        BjY bjY = addressTypeAheadTextView.A01;
        AddressTypeAheadInput addressTypeAheadInput = addressTypeAheadTextView.A02;
        Location location = addressTypeAheadInput.A01;
        GraphQlCallInput graphQlCallInput = new 2Jd(12);
        graphQlCallInput.A09("query", str);
        if (location != null) {
            graphQlCallInput.A05(AbO.A08(location), "viewer_coordinates");
        }
        graphQlCallInput.A09("search_type", addressTypeAheadInput.A05);
        graphQlCallInput.A09("provider", "HERE_THRIFT");
        graphQlCallInput.A09("caller", addressTypeAheadInput.A04);
        graphQlCallInput.A09("result_ordering", "INTERLEAVE");
        graphQlCallInput.A09("integration_strategy", "STRING_MATCH");
        ImmutableList immutableList = addressTypeAheadInput.A03;
        if (immutableList != null && !immutableList.isEmpty()) {
            graphQlCallInput.A0A("country_filter", immutableList);
        }
        C30G A0H = AbF.A0H(1);
        ((2Jf) A0H).A00.A01(graphQlCallInput, "address");
        A0H.A06("limit", 10);
        C00i c00i = bjY.A00;
        A0H.A06("place_photo_size", 1BL.A0B(c00i).getDimensionPixelSize(2132279303));
        1Vd A0J = AbK.A0J(c00i);
        C3sa A00 = C3sa.A00(A0H);
        ((C3sb) A00).A03 = 0L;
        A00.A0B = false;
        A00.A05 = new 1iF(1EK.A01(), 0L);
        r0.A04(new C2083Db8(addressTypeAheadTextView, 0), 2FP.A01(D3J.A01(bjY, 0), A0J.A04(A00)), bKh);
    }
}
