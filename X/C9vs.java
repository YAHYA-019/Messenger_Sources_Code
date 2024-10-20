package X;

import com.facebook.messaging.highlightstab.model.HighlightsReplyMessageContent;
import com.facebook.xapp.messaging.threadview.model.attribution.AttributionApp;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9vs, reason: invalid class name */
/* loaded from: 9vs.class */
public final class C9vs implements AXt {
    public static final C9vs A00 = new C9vs();

    @Override // X.AXt
    public final C5fv A4m(HighlightsReplyMessageContent highlightsReplyMessageContent) {
        String str;
        String str2 = highlightsReplyMessageContent.A0M;
        AttributionApp attributionApp = null;
        if (str2 == null || (str = highlightsReplyMessageContent.A0K) == null || !C9G8.A00.contains(str)) {
            return null;
        }
        Long l = highlightsReplyMessageContent.A05;
        String str3 = highlightsReplyMessageContent.A0B;
        String str4 = highlightsReplyMessageContent.A0A;
        if (l != null && str4 != null && str3 != null) {
            String obj = l.toString();
            C1pq.A08("appId", obj);
            attributionApp = new AttributionApp(obj, str3, str4);
        }
        5wW r0 = new 5wW();
        String str5 = highlightsReplyMessageContent.A0D;
        if (str5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r0.A01(str5);
        r0.A0H = str.equals("image/gif");
        r0.A02(str);
        String str6 = highlightsReplyMessageContent.A0I;
        if (str6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r0.A04(str6);
        Integer num = highlightsReplyMessageContent.A04;
        if (num == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        int intValue = num.intValue();
        r0.A03 = intValue;
        Integer num2 = highlightsReplyMessageContent.A03;
        if (num2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        int intValue2 = num2.intValue();
        r0.A02 = intValue2;
        r0.A01 = intValue;
        r0.A00 = intValue2;
        r0.A06 = attributionApp;
        r0.A0G = true;
        ImmutableList of = ImmutableList.of((Object) new Photo(r0));
        C5fp c5fp = new C5fp();
        c5fp.A09 = str2;
        11T.A0D(of);
        11T.A0F(of, 0);
        c5fp.A00 = of;
        return new C5ft(c5fp);
    }
}
