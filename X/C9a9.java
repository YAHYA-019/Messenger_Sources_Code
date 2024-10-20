package X;

import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.composer.quickreply.logging.type.QuickReplyLoggingType;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* renamed from: X.9a9, reason: invalid class name */
/* loaded from: 9a9.class */
public final class C9a9 {
    public CallToAction A00;
    public 8AJ A03;
    public ThreadKey A04;
    public UserKey A05;
    public 24X A06;
    public String A0A;
    public String A0B;
    public String A0C;
    public 8AN A02 = 8AN.A0B;
    public boolean A0E = false;
    public Integer A08 = 0S2.A00;
    public QuickReplyLoggingType A01 = null;
    public Double A07 = null;
    public String A09 = null;
    public boolean A0D = false;

    public void A00(QuickReplyItem quickReplyItem) {
        this.A0C = quickReplyItem.A0C;
        this.A02 = quickReplyItem.A02;
        this.A0B = quickReplyItem.A0B;
        this.A0A = quickReplyItem.A0A;
        this.A06 = quickReplyItem.A06;
        this.A03 = quickReplyItem.A03;
        this.A0E = quickReplyItem.A0E;
        this.A04 = quickReplyItem.A04;
        this.A05 = quickReplyItem.A05;
        this.A00 = quickReplyItem.A00;
        this.A01 = quickReplyItem.A01;
        this.A07 = quickReplyItem.A07;
        this.A09 = quickReplyItem.A09;
        this.A0D = quickReplyItem.A0D;
    }
}
