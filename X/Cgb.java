package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.share.model.LinksPreview;
import com.facebook.share.protocol.LinksPreviewParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgb.class */
public final class Cgb implements 1Ro {
    public static final String __redex_internal_original_name = "LinksPreviewMethod";
    public final AnonymousClass244 A00 = AbI.A0s();

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        LinksPreviewParams linksPreviewParams = (LinksPreviewParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        String str = linksPreviewParams.A03;
        if (str != null) {
            A0s.add(new BasicNameValuePair("url", str));
        }
        String str2 = linksPreviewParams.A02;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2));
        }
        String str3 = linksPreviewParams.A01;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair(4YT.A00(ActionId.VIEW_WILL_APPEAR_BEGIN), str3));
        }
        ImmutableList immutableList = linksPreviewParams.A00;
        if (!immutableList.isEmpty()) {
            A0s.add(new BasicNameValuePair("requested_sizes", this.A00.A0W(immutableList)));
        }
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("raw_share_params", Boolean.TRUE.toString()), A0s);
        AbF.A1Q(A0C, "links.preview");
        return AbK.A0M(A0C, "links_preview", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        3AW r0 = new 3AW((AnonymousClass245) null, AbH.A0w(anonymousClass439));
        r0.A00 = this.A00;
        return r0.A1W(LinksPreview.class);
    }
}
