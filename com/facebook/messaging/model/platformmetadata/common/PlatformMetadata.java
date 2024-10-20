package com.facebook.messaging.model.platformmetadata.common;

import X.11T;
import X.1BK;
import X.1Du;
import X.24X;
import X.2DM;
import X.2Jz;
import X.4YU;
import X.AbstractC00603o4;
import X.C02053tt;
import X.C03353xs;
import X.C26T;
import X.C5qt;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.platformmetadata.types.broadcastunitid.BroadcastUnitIDPlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.marketplace.MarketplaceTabPlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePersonaPlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePlatformPersona;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickRepliesPlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyAdIdPlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyAdTypePlatformMetadata;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyTypePlatformMetadata;
import com.google.common.collect.ImmutableList;

/* loaded from: PlatformMetadata.class */
public abstract class PlatformMetadata implements Parcelable {
    public C5qt A00() {
        return this instanceof QuickReplyTypePlatformMetadata ? C5qt.A0E : this instanceof QuickReplyAdTypePlatformMetadata ? C5qt.A03 : this instanceof QuickReplyAdIdPlatformMetadata ? C5qt.A02 : this instanceof QuickRepliesPlatformMetadata ? C5qt.A0D : this instanceof MessagePersonaPlatformMetadata ? C5qt.A0A : this instanceof MarketplaceTabPlatformMetadata ? C5qt.A08 : C5qt.A05;
    }

    public 24X A01() {
        String str;
        2Jz c03353xs;
        if (this instanceof QuickReplyTypePlatformMetadata) {
            str = ((QuickReplyTypePlatformMetadata) this).A00;
        } else if (this instanceof QuickReplyAdTypePlatformMetadata) {
            str = ((QuickReplyAdTypePlatformMetadata) this).A00;
        } else if (this instanceof QuickReplyAdIdPlatformMetadata) {
            str = ((QuickReplyAdIdPlatformMetadata) this).A00;
        } else {
            if (this instanceof QuickRepliesPlatformMetadata) {
                c03353xs = new C03353xs(C26T.A00);
                1Du it = ((QuickRepliesPlatformMetadata) this).A00.iterator();
                while (it.hasNext()) {
                    c03353xs.A0d(((QuickReplyItem) it.next()).A00());
                }
                return c03353xs;
            }
            if (this instanceof MessagePersonaPlatformMetadata) {
                MessagePlatformPersona messagePlatformPersona = ((MessagePersonaPlatformMetadata) this).A00;
                2DM r0 = new 2DM(C26T.A00);
                r0.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID, messagePlatformPersona.A00);
                r0.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, messagePlatformPersona.A01);
                r0.A0o(AbstractC00603o4.A00(36), messagePlatformPersona.A02);
                return r0;
            }
            if (this instanceof MarketplaceTabPlatformMetadata) {
                C02053tt A00 = C02053tt.A00(((MarketplaceTabPlatformMetadata) this).A00);
                11T.A0A(A00);
                return A00;
            }
            str = ((BroadcastUnitIDPlatformMetadata) this).A00;
        }
        c03353xs = new 2Jz(str);
        return c03353xs;
    }

    public 24X A02() {
        if (!(this instanceof QuickRepliesPlatformMetadata)) {
            return A01();
        }
        ImmutableList immutableList = ((QuickRepliesPlatformMetadata) this).A00;
        return immutableList.isEmpty() ? 4YU.A0f() : ((QuickReplyItem) 1BK.A0r(immutableList)).A00();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
