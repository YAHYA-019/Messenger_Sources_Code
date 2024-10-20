package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.smartcapture.logging.SCEventNames;

/* renamed from: X.Ao6, reason: case insensitive filesystem */
/* loaded from: Ao6.class */
public final class C1628Ao6 extends C8j {
    public C1628Ao6() {
        String str = C1ic.A18;
        String A0W = 0Pz.A0W(str, StringFormatUtil.formatStrLocaleSafe("composer/?%s=<share_link>&%s=<app_id>&%s=true&%s=<in_app>&%s=null&%s=null&%s=null&%s=null&%s=null&%s=<next>&%s=<host_url>", "link", "app_id", "is_web_share", "is_in_app_web_share", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "caption", "description", "picture", "quote", SCEventNames.Params.STEP_CHANGE_NEXT, "host_url"));
        A00("dialog/share_open_graph?href={share_link}&app_id={#app_id 0}&in_app={in_app false}&next={next null}&host_url={host_url null}", A0W);
        A00("sharer?u={share_link}&app_id={#app_id 0}&in_app={in_app false}&next={next null}&host_url={host_url null}", A0W);
        A00("sharer.php?u={share_link}&app_id={#app_id 0}&in_app={in_app false}&next={next null}&host_url={host_url null}", A0W);
        A00("sharer/sharer.php?u={share_link}&app_id={#app_id 0}&in_app={in_app false}&next={next null}&host_url={host_url null}", A0W);
        A00("sharer/sharer.php?p[url]={share_link}&p[app_id]={#app_id 0}&in_app={in_app false}&next={next null}&host_url={host_url null}", A0W);
        A00("dialog/share?href={share_link}&app_id={#app_id 0}&in_app={in_app false}&quote={quote null}&next={next null}&host_url={host_url null}", 0Pz.A0W(str, StringFormatUtil.formatStrLocaleSafe("composer/?%s=<share_link>&%s=<app_id>&%s=true&%s=<in_app>&%s=null&%s=null&%s=null&%s=null&%s=<quote>&%s=<next>&%s=<host_url>", "link", "app_id", "is_web_share", "is_in_app_web_share", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "caption", "description", "picture", "quote", SCEventNames.Params.STEP_CHANGE_NEXT, "host_url")));
        A00("dialog/feed?link={share_link}&app_id={#app_id 0}&name={name null}&caption={caption null}&description={description null}&picture={picture null}&in_app={in_app false}&next={next null}&host_url={host_url null}", 0Pz.A0W(str, StringFormatUtil.formatStrLocaleSafe("composer/?%s=<share_link>&%s=<app_id>&%s=<name>&%s=<caption>&%s=<description>&%s=<picture>&%s=null&%s=true&%s=<in_app>&%s=<next>&%s=<host_url>", "link", "app_id", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "caption", "description", "picture", "quote", "is_web_share", "is_in_app_web_share", SCEventNames.Params.STEP_CHANGE_NEXT, "host_url")));
    }

    private void A00(String str, String str2) {
        A03(0Pz.A0W(4YT.A00(66), str), str2);
        A03(0Pz.A0W("https://m.facebook.com/", str), str2);
        A03(0Pz.A0W(DKB.A00(415), str), str2);
        A03(0Pz.A0W("http://www.facebook.com/", str), str2);
        A03(0Pz.A0W("http://m.facebook.com/", str), str2);
        A03(0Pz.A0W("http://facebook.com/", str), str2);
    }
}
