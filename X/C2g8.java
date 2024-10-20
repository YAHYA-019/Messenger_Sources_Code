package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.InstantGameInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2g8, reason: invalid class name */
/* loaded from: 2g8.class */
public final class C2g8 {
    public final C00i A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C15h A04;
    public final C15h A05;
    public final C15h A06;
    public final C15h A07;

    public C2g8(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 16428);
        1BP r02 = FbInjector.A00;
        11T.A0A(r02);
        this.A00 = r02;
        this.A04 = new 3jD(this, 11);
        this.A07 = new 3jD(this, 14);
        this.A06 = new 3jD(this, 13);
        this.A05 = new 3jD(this, 12);
        this.A02 = 1Bu.A03(r0, 85204);
    }

    public static final InstantGameInfoProperties A00(C2g8 c2g8, ThreadSummary threadSummary) {
        GenericAdminMessageInfo genericAdminMessageInfo;
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData;
        Message message = null;
        MessagesCollection A05 = ((2fE) c2g8.A04.get()).A05(threadSummary.A0n);
        if (A05 != null) {
            ImmutableList immutableList = A05.A01;
            if (!immutableList.isEmpty()) {
                message = (Message) 1BK.A0r(immutableList);
            }
        }
        InstantGameInfoProperties instantGameInfoProperties = null;
        if (message != null && (genericAdminMessageInfo = message.A0C) != null && (genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E) != null && (genericAdminMessageExtensibleData instanceof InstantGameInfoProperties)) {
            instantGameInfoProperties = (InstantGameInfoProperties) genericAdminMessageExtensibleData;
        }
        return instantGameInfoProperties;
    }
}
