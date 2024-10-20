package X;

import com.facebook.common.util.JSONUtil;
import java.util.ArrayList;

/* renamed from: X.4rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rp.class */
public final class C09854rp implements 1Ro {
    public static final String __redex_internal_original_name = "GetContactsUploadSettingsMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        return new C04103zy(0S2.A01, "getGlobalKillSwitchForContactsUpload", "GET", "me/contactsmessengersync", new ArrayList());
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return new C7nX(JSONUtil.A0J(anonymousClass439.A01().A0D("enabled"), false));
    }
}
