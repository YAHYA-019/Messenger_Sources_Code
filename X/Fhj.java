package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.service.model.request.CreateGroupRequestParams;
import com.facebook.payments.p2p.service.model.request.CreateGroupRequestResult;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhj.class */
public final class Fhj implements 1Ro {
    public static final String __redex_internal_original_name = "CreateGroupRequestMethod";
    public final String A02 = (String) 1Bn.A0B(83433);
    public final C4N A00 = (C4N) 1Bi.A03(84806);
    public final AnonymousClass244 A01 = AbI.A0s();

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        CreateGroupRequestParams createGroupRequestParams = (CreateGroupRequestParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("requestee_amount_map", DKD.A0y(createGroupRequestParams.A01)));
        A0s.add(new BasicNameValuePair("offline_threading_id", createGroupRequestParams.A05));
        A0s.add(new BasicNameValuePair("memo_text", createGroupRequestParams.A04));
        String str = createGroupRequestParams.A03;
        if (str != null) {
            A0s.add(new BasicNameValuePair("group_thread_id", str));
        }
        String str2 = createGroupRequestParams.A07;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("theme_id", str2));
        }
        String str3 = createGroupRequestParams.A08;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("theme_name", str3));
        }
        String str4 = createGroupRequestParams.A02;
        if (str4 != null) {
            A0s.add(new BasicNameValuePair("gift_type", str4));
        }
        String str5 = createGroupRequestParams.A06;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("platform_context_id", str5));
        }
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("format", "json"), A0s);
        AbF.A1Q(A0C, 1BJ.A00(89));
        A0C.A0F = StringFormatUtil.formatStrLocaleSafe("/%s/group_payment_requests", this.A02);
        A0C.A0J = A0s;
        A0C.A06 = 0S2.A01;
        MediaResource mediaResource = createGroupRequestParams.A00;
        if (mediaResource != null) {
            A0C.A0I = ImmutableList.of((Object) new C4C4(this.A00.A00(mediaResource), "memo_images"));
        }
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return this.A01.A0P(anonymousClass439.A01(), CreateGroupRequestResult.class);
    }
}
